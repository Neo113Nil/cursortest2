package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.qK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3214qK<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(@ParametricNullness T left, @ParametricNullness T right);

    public static <C extends Comparable> AbstractC3214qK<C> A03() {
        return BB.A02;
    }

    public static <T> AbstractC3214qK<T> A04(Comparator<T> comparator) {
        if (comparator instanceof AbstractC3214qK) {
            return (AbstractC3214qK) comparator;
        }
        return new C1611Bh(comparator);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kO != com.google.common.base.Function<F, ? extends T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<T> */
    public final <F> AbstractC3214qK<F> A05(InterfaceC2863kO<F, ? extends T> function) {
        return new C1619Bp(function, this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.qK != com.google.common.collect.Ordering<T> */
    public <S extends T> AbstractC3214qK<S> A06() {
        return new B2(this);
    }
}
