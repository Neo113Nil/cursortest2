package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wsi implements zsi {
    public final gv9 a;
    public final gv9 b;
    public final gv9 c;
    public final gv9 d;
    public final gv9 e;
    public final boolean f;
    public final vsi g;
    public final vsi h;

    public wsi(gv9 gv9Var, gv9 gv9Var2, gv9 gv9Var3, gv9 gv9Var4, gv9 gv9Var5, boolean z, vsi vsiVar, vsi vsiVar2) {
        gv9Var.getClass();
        gv9Var2.getClass();
        this.a = gv9Var;
        this.b = gv9Var2;
        this.c = gv9Var3;
        this.d = gv9Var4;
        this.e = gv9Var5;
        this.f = z;
        this.g = vsiVar;
        this.h = vsiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsi)) {
            return false;
        }
        wsi wsiVar = (wsi) obj;
        return Intrinsics.c(this.a, wsiVar.a) && Intrinsics.c(this.b, wsiVar.b) && this.c.equals(wsiVar.c) && Intrinsics.c(this.d, wsiVar.d) && Intrinsics.c(this.e, wsiVar.e) && this.f == wsiVar.f && Intrinsics.c(this.g, wsiVar.g) && Intrinsics.c(this.h, wsiVar.h);
    }

    public final int hashCode() {
        int d = ljg.d(ljg.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        gv9 gv9Var = this.d;
        int hashCode = (d + (gv9Var == null ? 0 : gv9Var.hashCode())) * 31;
        gv9 gv9Var2 = this.e;
        int e = dmi.e((hashCode + (gv9Var2 == null ? 0 : gv9Var2.hashCode())) * 31, 31, this.f);
        vsi vsiVar = this.g;
        int hashCode2 = (e + (vsiVar == null ? 0 : vsiVar.hashCode())) * 31;
        vsi vsiVar2 = this.h;
        return hashCode2 + (vsiVar2 != null ? vsiVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = wv8.l("Baseball(homeInnings=", this.a, ", awayInnings=", this.b, ", inningsCount=");
        vxd.u(l, this.c, ", baseballPitcherData=", this.d, ", baseballPitchedWrapper=");
        l.append(this.e);
        l.append(", isLiveEvent=");
        l.append(this.f);
        l.append(", homeStickyData=");
        l.append(this.g);
        l.append(", awayStickyData=");
        l.append(this.h);
        l.append(")");
        return l.toString();
    }
}
