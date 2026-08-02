package com.google.common.collect;

import java.io.Serializable;

/* renamed from: com.google.common.collect.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3430j extends W implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Ra.f f36828a;

    /* renamed from: b, reason: collision with root package name */
    public final W f36829b;

    public C3430j(Ra.f fVar, W w10) {
        this.f36828a = (Ra.f) Ra.n.k(fVar);
        this.f36829b = (W) Ra.n.k(w10);
    }

    @Override // com.google.common.collect.W, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f36829b.compare(this.f36828a.apply(obj), this.f36828a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3430j) {
            C3430j c3430j = (C3430j) obj;
            if (this.f36828a.equals(c3430j.f36828a) && this.f36829b.equals(c3430j.f36829b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Ra.j.b(this.f36828a, this.f36829b);
    }

    public String toString() {
        return this.f36829b + ".onResultOf(" + this.f36828a + ")";
    }
}
