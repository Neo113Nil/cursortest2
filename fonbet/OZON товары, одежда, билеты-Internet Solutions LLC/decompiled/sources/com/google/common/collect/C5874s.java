package com.google.common.collect;

import C.o0;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.common.collect.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5874s<T> extends T<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator<? super T>[] f59134a;

    /* JADX WARN: Multi-variable type inference failed */
    C5874s(T t2, Comparator comparator) {
        T[] tArr = (Comparator<? super T>[]) new Comparator[2];
        tArr[0] = t2;
        tArr[1] = comparator;
        this.f59134a = tArr;
    }

    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        int i11 = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.f59134a;
            if (i11 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i11].compare(t2, t11);
            if (compare != 0) {
                return compare;
            }
            i11++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5874s) {
            return Arrays.equals(this.f59134a, ((C5874s) obj).f59134a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f59134a);
    }

    public final String toString() {
        return o0.c(new StringBuilder("Ordering.compound("), Arrays.toString(this.f59134a), ")");
    }
}
