package com.google.common.collect;

import java.util.Comparator;

/* loaded from: classes3.dex */
public abstract class W implements Comparator {
    public static W d(Comparator comparator) {
        return comparator instanceof W ? (W) comparator : new C3435o(comparator);
    }

    public static W h() {
        return T.f36740a;
    }

    public W b(Comparator comparator) {
        return new C3437q(this, (Comparator) Ra.n.k(comparator));
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public AbstractC3445z e(Iterable iterable) {
        return AbstractC3445z.E(this, iterable);
    }

    public W i() {
        return n(N.e());
    }

    public W n(Ra.f fVar) {
        return new C3430j(fVar, this);
    }

    public W o() {
        return new e0(this);
    }
}
