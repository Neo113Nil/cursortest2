package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class e0 extends W implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final W f36809a;

    public e0(W w10) {
        this.f36809a = (W) Ra.n.k(w10);
    }

    @Override // com.google.common.collect.W, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f36809a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f36809a.equals(((e0) obj).f36809a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f36809a.hashCode();
    }

    @Override // com.google.common.collect.W
    public W o() {
        return this.f36809a;
    }

    public String toString() {
        return this.f36809a + ".reverse()";
    }
}
