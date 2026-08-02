package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lxug;", "Lbuc;", "Livg;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class xug extends buc {
    public final jvg a;
    public final ewd b;
    public final myd c;
    public final boolean d;
    public final boolean e;
    public final p78 f;
    public final wzc g;

    public xug(jvg jvgVar, ewd ewdVar, myd mydVar, boolean z, boolean z2, p78 p78Var, wzc wzcVar) {
        this.a = jvgVar;
        this.b = ewdVar;
        this.c = mydVar;
        this.d = z;
        this.e = z2;
        this.f = p78Var;
        this.g = wzcVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new ivg(null, this.f, this.g, this.b, this.c, this.a, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xug)) {
            return false;
        }
        xug xugVar = (xug) obj;
        return Intrinsics.c(this.a, xugVar.a) && this.b == xugVar.b && Intrinsics.c(this.c, xugVar.c) && this.d == xugVar.d && this.e == xugVar.e && Intrinsics.c(this.f, xugVar.f) && Intrinsics.c(this.g, xugVar.g);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        ((ivg) wtcVar).F1(null, this.f, this.g, this.b, this.c, this.a, this.d, this.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        myd mydVar = this.c;
        int e = dmi.e(dmi.e((hashCode + (mydVar != null ? mydVar.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        p78 p78Var = this.f;
        int hashCode2 = (e + (p78Var != null ? p78Var.hashCode() : 0)) * 31;
        wzc wzcVar = this.g;
        return (hashCode2 + (wzcVar != null ? wzcVar.hashCode() : 0)) * 31;
    }
}
