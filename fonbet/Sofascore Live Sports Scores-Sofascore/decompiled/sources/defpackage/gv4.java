package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gv4 {
    public final hkh a;
    public final int b;
    public final au3 c;
    public final au3 d;
    public final au3 e;
    public final rwj f;
    public final int g;
    public final Boolean h;
    public final int i;
    public final int j;

    public gv4(hkh hkhVar, int i, au3 au3Var, au3 au3Var2, au3 au3Var3, rwj rwjVar, int i2, Boolean bool, int i3, int i4) {
        this.a = hkhVar;
        this.b = i;
        this.c = au3Var;
        this.d = au3Var2;
        this.e = au3Var3;
        this.f = rwjVar;
        this.g = i2;
        this.h = bool;
        this.i = i3;
        this.j = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv4)) {
            return false;
        }
        gv4 gv4Var = (gv4) obj;
        return Intrinsics.c(this.a, gv4Var.a) && this.b == gv4Var.b && Intrinsics.c(this.c, gv4Var.c) && Intrinsics.c(this.d, gv4Var.d) && Intrinsics.c(this.e, gv4Var.e) && Intrinsics.c(this.f, gv4Var.f) && this.g == gv4Var.g && Intrinsics.c(this.h, gv4Var.h) && this.i == gv4Var.i && this.j == gv4Var.j;
    }

    public final int hashCode() {
        hkh hkhVar = this.a;
        int hashCode = (hkhVar != null ? hkhVar.hashCode() : 0) * 31;
        int i = this.b;
        int C = (hashCode + (i != 0 ? wt3.C(i) : 0)) * 961;
        au3 au3Var = this.c;
        int hashCode2 = (C + (au3Var != null ? au3Var.hashCode() : 0)) * 31;
        au3 au3Var2 = this.d;
        int hashCode3 = (hashCode2 + (au3Var2 != null ? au3Var2.hashCode() : 0)) * 31;
        au3 au3Var3 = this.e;
        int hashCode4 = (hashCode3 + (au3Var3 != null ? au3Var3.hashCode() : 0)) * 31;
        rwj rwjVar = this.f;
        int hashCode5 = (hashCode4 + (rwjVar != null ? rwjVar.hashCode() : 0)) * 31;
        int i2 = this.g;
        int C2 = (hashCode5 + (i2 != 0 ? wt3.C(i2) : 0)) * 961;
        Boolean bool = this.h;
        int hashCode6 = (C2 + (bool != null ? bool.hashCode() : 0)) * 961;
        int i3 = this.i;
        int C3 = (hashCode6 + (i3 != 0 ? wt3.C(i3) : 0)) * 31;
        int i4 = this.j;
        return (C3 + (i4 != 0 ? wt3.C(i4) : 0)) * 31;
    }
}
