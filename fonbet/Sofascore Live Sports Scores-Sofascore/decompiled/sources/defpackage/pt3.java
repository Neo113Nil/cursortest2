package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lpt3;", "Lbuc;", "Lst3;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class pt3 extends buc {
    public final gwj a;
    public final wcj b;
    public final q5b c;
    public final boolean d;
    public final boolean e;
    public final nnd f;
    public final tbj g;
    public final qu9 h;
    public final ce8 i;

    public pt3(gwj gwjVar, wcj wcjVar, q5b q5bVar, boolean z, boolean z2, nnd nndVar, tbj tbjVar, qu9 qu9Var, ce8 ce8Var) {
        this.a = gwjVar;
        this.b = wcjVar;
        this.c = q5bVar;
        this.d = z;
        this.e = z2;
        this.f = nndVar;
        this.g = tbjVar;
        this.h = qu9Var;
        this.i = ce8Var;
    }

    @Override // defpackage.buc
    public final wtc c() {
        st3 st3Var = new st3();
        st3Var.q = this.a;
        st3Var.r = this.b;
        st3Var.s = this.c;
        st3Var.t = this.d;
        st3Var.u = this.e;
        st3Var.v = this.f;
        tbj tbjVar = this.g;
        st3Var.w = tbjVar;
        st3Var.x = this.h;
        st3Var.y = this.i;
        tbjVar.f = new qt3(st3Var, 4);
        return st3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pt3) {
            pt3 pt3Var = (pt3) obj;
            if (this.a.equals(pt3Var.a) && Intrinsics.c(this.b, pt3Var.b) && this.c == pt3Var.c && this.d == pt3Var.d && this.e == pt3Var.e && this.f.equals(pt3Var.f) && this.g == pt3Var.g && Intrinsics.c(this.h, pt3Var.h) && Intrinsics.c(this.i, pt3Var.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        st3 st3Var = (st3) wtcVar;
        boolean z = st3Var.u;
        boolean z2 = z && !st3Var.t;
        qu9 qu9Var = st3Var.x;
        tbj tbjVar = st3Var.w;
        boolean z3 = this.d;
        boolean z4 = this.e;
        boolean z5 = z4 && !z3;
        st3Var.q = this.a;
        wcj wcjVar = this.b;
        st3Var.r = wcjVar;
        st3Var.s = this.c;
        st3Var.t = z3;
        st3Var.u = z4;
        st3Var.v = this.f;
        tbj tbjVar2 = this.g;
        st3Var.w = tbjVar2;
        qu9 qu9Var2 = this.h;
        st3Var.x = qu9Var2;
        st3Var.y = this.i;
        if (z4 != z || z5 != z2 || !Intrinsics.c(qu9Var2, qu9Var) || !pej.d(wcjVar.b)) {
            sea.p(st3Var);
        }
        if (tbjVar2 != tbjVar) {
            tbjVar2.f = new qt3(st3Var, 0);
        }
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + dmi.e(dmi.e(dmi.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, false)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.a + ", value=" + this.b + ", state=" + this.c + ", readOnly=" + this.d + ", enabled=" + this.e + ", isPassword=false, offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
