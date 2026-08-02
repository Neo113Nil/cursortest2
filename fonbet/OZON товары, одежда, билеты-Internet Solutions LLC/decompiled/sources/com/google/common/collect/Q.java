package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes.dex */
final class Q extends T<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final Q f59029a = new Q();

    private Object readResolve() {
        return f59029a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.T
    public final <S extends Comparable<?>> T<S> f() {
        return X.f59053a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
