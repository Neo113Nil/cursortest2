package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
class D extends C {
    public static final int j(int i11, List list) {
        if (i11 >= 0 && i11 <= C7714v.P(list)) {
            return C7714v.P(list) - i11;
        }
        StringBuilder f7 = P4.f.f(i11, "Element index ", " must be in range [");
        f7.append(new IntRange(0, C7714v.P(list), 1));
        f7.append("].");
        throw new IndexOutOfBoundsException(f7.toString());
    }

    public static final int k(int i11, List list) {
        if (i11 >= 0 && i11 <= list.size()) {
            return list.size() - i11;
        }
        StringBuilder f7 = P4.f.f(i11, "Position index ", " must be in range [");
        f7.append(new IntRange(0, list.size(), 1));
        f7.append("].");
        throw new IndexOutOfBoundsException(f7.toString());
    }
}
