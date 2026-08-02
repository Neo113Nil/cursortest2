package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class u extends t {
    public static IntRange d(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int e(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List f(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? o.c(elements) : e0.f19204a;
    }

    public static ArrayList g(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return new ArrayList();
        }
        Intrinsics.checkNotNullParameter(elements, "<this>");
        return new ArrayList(new j(elements, true));
    }

    public static final List h(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : t.c(list.get(0)) : e0.f19204a;
    }

    public static void i() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
