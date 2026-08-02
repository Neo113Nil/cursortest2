package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes9.dex */
final class X extends T<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final X f59053a = new X();

    private Object readResolve() {
        return f59053a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.T
    public final <S extends Comparable<?>> T<S> f() {
        return Q.f59029a;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
