package com.vk.movika.sdk.base.model.actions;

import xsna.epx;

/* loaded from: classes3.dex */
public final class d implements a {
    public final String a;
    public final Boolean b;

    public d(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "OpenURIAction(uri=" + this.a + ", isDetachContainer=" + this.b + ")";
    }
}
