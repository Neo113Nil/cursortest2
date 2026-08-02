package org.mp4parser.tools;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mp4parser.Box;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;
import org.mp4parser.support.AbstractContainerBox;

/* loaded from: classes10.dex */
public class Path {
    public static Pattern component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    private Path() {
    }

    public static <T extends Box> T getPath(Box box, String str) {
        List paths = getPaths((Object) box, str, true);
        if (paths.isEmpty()) {
            return null;
        }
        return (T) paths.get(0);
    }

    public static <T extends Box> T getPath(Container container, String str) {
        List paths = getPaths(container, str, true);
        if (paths.isEmpty()) {
            return null;
        }
        return (T) paths.get(0);
    }

    public static <T extends Box> T getPath(AbstractContainerBox abstractContainerBox, String str) {
        List paths = getPaths(abstractContainerBox, str, true);
        if (paths.isEmpty()) {
            return null;
        }
        return (T) paths.get(0);
    }

    public static <T extends Box> List<T> getPaths(Box box, String str) {
        return getPaths((Object) box, str, false);
    }

    public static <T extends Box> List<T> getPaths(Container container, String str) {
        return getPaths(container, str, false);
    }

    private static <T extends Box> List<T> getPaths(AbstractContainerBox abstractContainerBox, String str, boolean z) {
        return getPaths((Object) abstractContainerBox, str, z);
    }

    private static <T extends Box> List<T> getPaths(Container container, String str, boolean z) {
        return getPaths((Object) container, str, z);
    }

    private static <T extends Box> List<T> getPaths(ParsableBox parsableBox, String str, boolean z) {
        return getPaths((Object) parsableBox, str, z);
    }

    private static <T extends Box> List<T> getPaths(Object obj, String str, boolean z) {
        String str2;
        if (str.startsWith("/")) {
            throw new RuntimeException("Cannot start at / - only relative path expression into the structure are allowed");
        }
        if (str.length() == 0) {
            if (obj instanceof ParsableBox) {
                return Collections.singletonList((Box) obj);
            }
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
        int i = 0;
        if (str.contains("/")) {
            str2 = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            str2 = "";
        }
        Matcher matcher = component.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            if ("..".equals(group)) {
                throw new RuntimeException(".. notation no longer allowed");
            }
            if (obj instanceof Container) {
                int parseInt = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                LinkedList linkedList = new LinkedList();
                for (Box box : ((Container) obj).getBoxes()) {
                    if (box.getType().matches(group)) {
                        if (parseInt == -1 || parseInt == i) {
                            linkedList.addAll(getPaths(box, str2, z));
                        }
                        i++;
                    }
                    if (z || parseInt >= 0) {
                        if (!linkedList.isEmpty()) {
                            break;
                        }
                    }
                }
                return linkedList;
            }
            return Collections.EMPTY_LIST;
        }
        throw new RuntimeException(String.valueOf(str) + " is invalid path.");
    }

    public static boolean isContained(Container container, Box box, String str) {
        return getPaths(container, str).contains(box);
    }
}
