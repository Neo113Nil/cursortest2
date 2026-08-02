package com.vk.movika.sdk.base.model;

import xsna.epx;
import xsna.urd0;
import xsna.xe9;
import xsna.zjh0;

/* loaded from: classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final double d;
    public final String e;
    public final boolean f;

    public a(double d, String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && Double.compare(this.d, aVar.d) == 0 && epx.f(this.e, aVar.e) && this.f == aVar.f;
    }

    public final int hashCode() {
        int b = zjh0.b(this.d, urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder a = xe9.a("Branch(id=", this.a, ", parentChapterId=", this.b, ", chapterId=");
        a.append(this.c);
        a.append(", weight=");
        a.append(this.d);
        a.append(", manifestUrl=");
        a.append(this.e);
        a.append(", isDefault=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }
}
