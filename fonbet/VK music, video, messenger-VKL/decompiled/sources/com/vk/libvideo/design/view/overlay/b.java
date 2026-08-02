package com.vk.libvideo.design.view.overlay;

import xsna.do7;
import xsna.epx;
import xsna.p0r;
import xsna.qoy;
import xsna.urd0;

/* compiled from: OverlayRestrictionState.kt */
/* loaded from: classes2.dex */
public final class b {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final p0r h;
    public final do7 i;

    public b(String str, String str2, boolean z, boolean z2, String str3, String str4, boolean z3, p0r p0rVar, do7 do7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
        this.f = str4;
        this.g = z3;
        this.h = p0rVar;
        this.i = do7Var;
    }

    public static b a(b bVar, int i) {
        String str = bVar.a;
        String str2 = bVar.b;
        boolean z = bVar.c;
        boolean z2 = bVar.d;
        String str3 = (i & 16) != 0 ? bVar.e : null;
        String str4 = (i & 32) != 0 ? bVar.f : null;
        boolean z3 = (i & 64) != 0 ? bVar.g : true;
        p0r p0rVar = bVar.h;
        do7 do7Var = bVar.i;
        bVar.getClass();
        return new b(str, str2, z, z2, str3, str4, z3, p0rVar, do7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && this.g == bVar.g && this.h.equals(bVar.h) && this.i.equals(bVar.i);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.i.hashCode() + ((this.h.hashCode() + qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g)) * 31);
    }

    public final String toString() {
        return "OverlayRestrictionState(title=" + this.a + ", text=" + this.b + ", isBlurred=" + this.c + ", canPlay=" + this.d + ", buttonText=" + this.e + ", buttonAction=" + this.f + ", blockingActionEnabled=" + this.g + ", processIsButtonVisible=" + this.h + ", processIconUrl=" + this.i + ')';
    }
}
