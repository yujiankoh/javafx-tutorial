public class Duke {

    /** The kind of command the last input asked for, used by the GUI to style the reply. */
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response to user input.
     */
    public String getResponse(String input) {
        commandType = classify(input);
        return "Duke heard: " + input;
    }

    /**
     * Returns the kind of command the last call to getResponse handled.
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * Names the kind of command an input asks for, from its first word.
     * A full Duke would take this name from the Command object its parser
     * produced; this stub has no parser, so it reads the keyword directly.
     */
    private String classify(String input) {
        String keyword = input.trim().split(" ", 2)[0].toLowerCase();
        switch (keyword) {
        case "todo":
        case "deadline":
        case "event":
            return "AddCommand";
        case "mark":
        case "unmark":
            return "ChangeMarkCommand";
        case "delete":
            return "DeleteCommand";
        default:
            return "UnknownCommand";
        }
    }
}
