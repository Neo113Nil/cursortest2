package com.vk.movika.sdk.base.model;

import java.util.ArrayList;
import xsna.epx;

/* loaded from: classes3.dex */
public final class v {
    public final String a;
    public final Long b;
    public final ArrayList c;

    public v(String str, Long l, ArrayList arrayList) {
        this.a = str;
        this.b = l;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return epx.f(this.a, vVar.a) && epx.f(this.b, vVar.b) && this.c.equals(vVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return this.c.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "Video(id=" + this.a + ", duration=" + this.b + ", variants=" + this.c + ")";
    }
}
