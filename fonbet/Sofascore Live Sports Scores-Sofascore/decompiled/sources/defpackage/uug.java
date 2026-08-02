package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luug;", "Lbuc;", "Lvug;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class uug extends buc {
    public final jvg a;
    public final ewd b;
    public final boolean c;
    public final p78 d;
    public final wzc e;
    public final a42 f;
    public final boolean g;
    public final myd h;

    public uug(a42 a42Var, p78 p78Var, wzc wzcVar, ewd ewdVar, myd mydVar, jvg jvgVar, boolean z, boolean z2) {
        this.a = jvgVar;
        this.b = ewdVar;
        this.c = z;
        this.d = p78Var;
        this.e = wzcVar;
        this.f = a42Var;
        this.g = z2;
        this.h = mydVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        vug vugVar = new vug();
        vugVar.q = this.a;
        vugVar.r = this.b;
        vugVar.s = this.c;
        vugVar.t = this.d;
        vugVar.u = this.e;
        vugVar.v = this.f;
        vugVar.w = this.g;
        vugVar.x = this.h;
        return vugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uug.class != obj.getClass()) {
            return false;
        }
        uug uugVar = (uug) obj;
        return this.a.equals(uugVar.a) && this.b == uugVar.b && this.c == uugVar.c && Intrinsics.c(this.d, uugVar.d) && Intrinsics.c(this.e, uugVar.e) && Intrinsics.c(this.f, uugVar.f) && this.g == uugVar.g && Intrinsics.c(this.h, uugVar.h);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((vug) wtcVar).p1(this.f, this.d, this.e, this.b, this.h, this.a, this.g, this.c);
    }

    public final int hashCode() {
        int e = dmi.e(dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        p78 p78Var = this.d;
        int hashCode = (e + (p78Var != null ? p78Var.hashCode() : 0)) * 31;
        wzc wzcVar = this.e;
        int hashCode2 = (hashCode + (wzcVar != null ? wzcVar.hashCode() : 0)) * 31;
        a42 a42Var = this.f;
        int e2 = dmi.e((hashCode2 + (a42Var != null ? a42Var.hashCode() : 0)) * 31, 31, this.g);
        myd mydVar = this.h;
        return e2 + (mydVar != null ? mydVar.hashCode() : 0);
    }
}
