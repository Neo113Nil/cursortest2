package kotlin.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e0 extends h0 {
    @NotNull
    public static HashSet a(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        HashSet hashSet = new HashSet(U.h(elements.length));
        C7712t.c(elements, hashSet);
        return hashSet;
    }

    @NotNull
    public static LinkedHashSet b(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.h(elements.length));
        C7712t.c(elements, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static LinkedHashSet c(@NotNull Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.h(set.size()));
        boolean z11 = false;
        for (Object obj2 : set) {
            boolean z12 = true;
            if (!z11 && Intrinsics.d(obj2, obj)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    @NotNull
    public static Set d(@NotNull Set set, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<?> e11 = C.e(elements);
        if (e11.isEmpty()) {
            return C7714v.Y0(set);
        }
        if (!(e11 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(e11);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!e11.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    @NotNull
    public static LinkedHashSet e(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.h(elements.length));
        C7712t.c(elements, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static LinkedHashSet f(@NotNull Set set, @NotNull Iterable elements) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Integer valueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.h(valueOf != null ? set.size() + valueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        C7714v.p(elements, linkedHashSet);
        return linkedHashSet;
    }

    @NotNull
    public static LinkedHashSet g(@NotNull Set set, Object obj) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(U.h(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    @NotNull
    public static Set h(Object obj) {
        Set singleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(singleton, "singleton(...)");
        return singleton;
    }

    @NotNull
    public static LinkedHashSet i(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet destination = new LinkedHashSet();
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : elements) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @NotNull
    public static TreeSet j(@NotNull Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        TreeSet treeSet = new TreeSet();
        C7712t.c(elements, treeSet);
        return treeSet;
    }
}
