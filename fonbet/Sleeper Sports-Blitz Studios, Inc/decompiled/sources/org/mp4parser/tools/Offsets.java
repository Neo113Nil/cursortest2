package org.mp4parser.tools;

import org.mp4parser.Box;
import org.mp4parser.Container;
import org.mp4parser.ParsableBox;

/* loaded from: classes10.dex */
public class Offsets {
    public static long find(Container container, ParsableBox parsableBox, long j) {
        long size;
        for (Box box : container.getBoxes()) {
            if (box == parsableBox) {
                return j;
            }
            if (box instanceof Container) {
                long find = find((Container) box, parsableBox, 0L);
                if (find > 0) {
                    return find + j;
                }
                size = box.getSize();
            } else {
                size = box.getSize();
            }
            j += size;
        }
        return -1L;
    }
}
