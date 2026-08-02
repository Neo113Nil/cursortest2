package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes9.dex */
final class Y<T> extends T<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final T<? super T> f59054a;

    Y(T<? super T> t2) {
        this.f59054a = t2;
    }

    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return this.f59054a.compare(t11, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y) {
            return this.f59054a.equals(((Y) obj).f59054a);
        }
        return false;
    }

    @Override // com.google.common.collect.T
    public final <S extends T> T<S> f() {
        return this.f59054a;
    }

    public final int hashCode() {
        return -this.f59054a.hashCode();
    }

    public final String toString() {
        return this.f59054a + ".reverse()";
    }
}
