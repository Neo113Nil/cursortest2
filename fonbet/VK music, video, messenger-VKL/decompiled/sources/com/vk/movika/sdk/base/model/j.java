package com.vk.movika.sdk.base.model;

import xsna.epx;

/* loaded from: classes3.dex */
public final class j {
    public final String a;
    public final com.vk.movika.sdk.base.model.actions.a b;

    public j(String str, com.vk.movika.sdk.base.model.actions.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return epx.f(this.a, jVar.a) && epx.f(this.b, jVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Event(type=" + this.a + ", action=" + this.b + ")";
    }
}
