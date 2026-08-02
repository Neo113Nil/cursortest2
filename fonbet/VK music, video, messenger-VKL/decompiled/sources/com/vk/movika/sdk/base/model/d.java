package com.vk.movika.sdk.base.model;

import xsna.epx;

/* loaded from: classes3.dex */
public final class d {
    public final String a;
    public final boolean b;

    public d(f fVar) {
        this(fVar.a, com.vk.movika.sdk.base.utils.d.c(fVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return epx.f(this.a, dVar.a) && this.b == dVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompletedContainer(id=" + this.a + ", isInteractive=" + this.b + ")";
    }

    public d(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
