package org.mp4parser.support;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.util.Iterator;
import org.mp4parser.Box;
import org.mp4parser.Container;
import org.mp4parser.tools.Path;

/* loaded from: classes10.dex */
public class BoxComparator {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static boolean isIgnore(Container container, Box box, String[] strArr) {
        for (String str : strArr) {
            if (Path.isContained(container, box, str)) {
                return true;
            }
        }
        return false;
    }

    public static void check(Container container, Box box, Container container2, Box box2, String... strArr) throws IOException {
        if (isIgnore(container, box, strArr)) {
            return;
        }
        boolean z = box instanceof Container;
        if ((!(box2 instanceof Container)) ^ z) {
            if (z) {
                check(container, (Container) box, container2, (Container) box2, strArr);
            } else {
                checkBox(container, box, container2, box2, strArr);
            }
        }
    }

    private static void checkBox(Container container, Box box, Container container2, Box box2, String[] strArr) throws IOException {
        if (isIgnore(container, box, strArr)) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        box.getBox(Channels.newChannel(byteArrayOutputStream));
        box2.getBox(Channels.newChannel(byteArrayOutputStream2));
        byteArrayOutputStream.close();
        byteArrayOutputStream2.close();
    }

    public static void check(Container container, Container container2, String... strArr) throws IOException {
        check(container, container, container2, container2, strArr);
    }

    public static void check(Container container, Container container2, Container container3, Container container4, String... strArr) throws IOException {
        Iterator<Box> it = container2.getBoxes().iterator();
        Iterator<Box> it2 = container4.getBoxes().iterator();
        while (it.hasNext() && it2.hasNext()) {
            check(container, it.next(), container3, it2.next(), strArr);
        }
    }
}
