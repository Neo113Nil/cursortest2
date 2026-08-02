package com.google.common.collect;

import java.io.Serializable;

/* renamed from: com.google.common.collect.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5865i<F, T> extends T<F> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final O7.e<F, ? extends T> f59102a;

    /* renamed from: b, reason: collision with root package name */
    final T<T> f59103b;

    C5865i(O7.e<F, ? extends T> eVar, T<T> t2) {
        eVar.getClass();
        this.f59102a = eVar;
        t2.getClass();
        this.f59103b = t2;
    }

    @Override // java.util.Comparator
    public final int compare(F f7, F f11) {
        O7.e<F, ? extends T> eVar = this.f59102a;
        return this.f59103b.compare(eVar.apply(f7), eVar.apply(f11));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5865i) {
            C5865i c5865i = (C5865i) obj;
            if (this.f59102a.equals(c5865i.f59102a) && this.f59103b.equals(c5865i.f59103b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return O7.h.d(this.f59102a, this.f59103b);
    }

    public final String toString() {
        return this.f59103b + ".onResultOf(" + this.f59102a + ")";
    }
}
