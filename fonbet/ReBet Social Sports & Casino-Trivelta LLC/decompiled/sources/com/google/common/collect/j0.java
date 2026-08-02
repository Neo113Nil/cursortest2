package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class j0 {
    public static Comparator a(SortedSet sortedSet) {
        Comparator comparator = sortedSet.comparator();
        return comparator == null ? W.h() : comparator;
    }

    public static boolean b(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        Ra.n.k(comparator);
        Ra.n.k(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof i0)) {
                return false;
            }
            comparator2 = ((i0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
