package com.vk.movika.sdk.base.model;

import java.util.List;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.xe9;

/* loaded from: classes3.dex */
public final class g implements k {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final LayoutParams e;
    public final List<j> f;
    public final String g;

    public g(String str, String str2, String str3, String str4, LayoutParams layoutParams, List<j> list, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = layoutParams;
        this.f = list;
        this.g = str5;
    }

    @Override // com.vk.movika.sdk.base.model.k
    public final List<j> b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (g.class.equals(obj != null ? obj.getClass() : null)) {
            return epx.f(this.a, ((g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder a = xe9.a("Control(id=", this.a, ", parentId=", this.b, ", type=");
        n6j.b(a, this.c, ", label=", this.d, ", layoutParams=");
        a.append(this.e);
        a.append(", selfEvents=");
        a.append(this.f);
        a.append(", props=");
        return i5s.a(a, this.g, ")");
    }
}
