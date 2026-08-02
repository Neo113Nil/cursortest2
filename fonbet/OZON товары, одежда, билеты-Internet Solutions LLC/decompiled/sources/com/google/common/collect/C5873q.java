package com.google.common.collect;

import I3.C3229d;
import java.io.Serializable;

/* renamed from: com.google.common.collect.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5873q<T> extends T<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final C3229d f59129a;

    C5873q(C3229d c3229d) {
        this.f59129a = c3229d;
    }

    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return this.f59129a.compare(t2, t11);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5873q) {
            return this.f59129a.equals(((C5873q) obj).f59129a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59129a.hashCode();
    }

    public final String toString() {
        return this.f59129a.toString();
    }
}
