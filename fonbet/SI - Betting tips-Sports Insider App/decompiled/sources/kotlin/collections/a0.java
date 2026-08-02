package kotlin.collections;

import androidx.appcompat.widget.c1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class a0 extends z {
    public static final int t(int i5, List list) {
        if (i5 >= 0 && i5 <= u.e(list)) {
            return u.e(list) - i5;
        }
        StringBuilder r5 = c1.r(i5, "Element index ", " must be in range [");
        r5.append(new IntRange(0, u.e(list), 1));
        r5.append("].");
        throw new IndexOutOfBoundsException(r5.toString());
    }

    public static final int u(int i5, List list) {
        if (i5 >= 0 && i5 <= list.size()) {
            return list.size() - i5;
        }
        StringBuilder r5 = c1.r(i5, "Position index ", " must be in range [");
        r5.append(new IntRange(0, list.size(), 1));
        r5.append("].");
        throw new IndexOutOfBoundsException(r5.toString());
    }

    public static t0 v(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new t0(list);
    }
}
