package defpackage;

import java.util.List;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class p13 extends o13 {
    public static sxb F(List list) {
        list.getClass();
        return new sxb(list);
    }

    public static final int G(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder t = lnb.t(i, "Element index ", " must be in range [");
        t.append(new IntRange(0, list.size() - 1, 1));
        t.append("].");
        throw new IndexOutOfBoundsException(t.toString());
    }

    public static final int H(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder t = lnb.t(i, "Position index ", " must be in range [");
        t.append(new IntRange(0, list.size(), 1));
        t.append("].");
        throw new IndexOutOfBoundsException(t.toString());
    }
}
