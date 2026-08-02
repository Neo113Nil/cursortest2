package com.bumptech.glide;

/* loaded from: classes.dex */
public abstract class n implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public N4.e f30131a = N4.c.c();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n clone() {
        try {
            return (n) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final N4.e b() {
        return this.f30131a;
    }

    public final n c() {
        return this;
    }

    public final n d(N4.e eVar) {
        this.f30131a = (N4.e) com.bumptech.glide.util.k.d(eVar);
        return c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            return com.bumptech.glide.util.l.e(this.f30131a, ((n) obj).f30131a);
        }
        return false;
    }

    public int hashCode() {
        N4.e eVar = this.f30131a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}
