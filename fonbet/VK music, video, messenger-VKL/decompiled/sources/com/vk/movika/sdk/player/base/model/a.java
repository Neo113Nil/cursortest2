package com.vk.movika.sdk.player.base.model;

import java.util.ArrayList;
import xsna.epx;
import xsna.zr;

/* loaded from: classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final Long c;
    public final ArrayList d;

    public a(String str, String str2, Long l, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return zr.a("PlayerItem(tag='", this.b, "')");
    }
}
