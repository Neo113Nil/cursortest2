package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo9j;", "Lbuc;", "Lr9j;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class o9j extends buc {
    public final boolean a;
    public final boolean b;
    public final cej c;
    public final jwj d;
    public final lcj e;
    public final n52 f;
    public final boolean g;
    public final qug h;
    public final ewd i;
    public final kkj j;
    public final eje k;

    public o9j(boolean z, boolean z2, cej cejVar, jwj jwjVar, lcj lcjVar, n52 n52Var, boolean z3, qug qugVar, ewd ewdVar, kkj kkjVar, eje ejeVar) {
        this.a = z;
        this.b = z2;
        this.c = cejVar;
        this.d = jwjVar;
        this.e = lcjVar;
        this.f = n52Var;
        this.g = z3;
        this.h = qugVar;
        this.i = ewdVar;
        this.j = kkjVar;
        this.k = ejeVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new r9j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9j)) {
            return false;
        }
        o9j o9jVar = (o9j) obj;
        return this.a == o9jVar.a && this.b == o9jVar.b && Intrinsics.c(this.c, o9jVar.c) && Intrinsics.c(this.d, o9jVar.d) && Intrinsics.c(this.e, o9jVar.e) && Intrinsics.c(this.f, o9jVar.f) && this.g == o9jVar.g && Intrinsics.c(this.h, o9jVar.h) && this.i == o9jVar.i && Intrinsics.c(this.j, o9jVar.j) && Intrinsics.c(this.k, o9jVar.k);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        yda ydaVar;
        r9j r9jVar = (r9j) wtcVar;
        boolean n1 = r9jVar.n1();
        boolean z = r9jVar.q;
        jwj jwjVar = r9jVar.t;
        cej cejVar = r9jVar.s;
        lcj lcjVar = r9jVar.u;
        qug qugVar = r9jVar.x;
        boolean z2 = this.a;
        r9jVar.q = z2;
        boolean z3 = this.b;
        r9jVar.r = z3;
        cej cejVar2 = this.c;
        r9jVar.s = cejVar2;
        jwj jwjVar2 = this.d;
        r9jVar.t = jwjVar2;
        lcj lcjVar2 = this.e;
        r9jVar.u = lcjVar2;
        r9jVar.v = this.f;
        r9jVar.w = this.g;
        qug qugVar2 = this.h;
        r9jVar.x = qugVar2;
        r9jVar.y = this.i;
        kkj kkjVar = this.j;
        r9jVar.z = kkjVar;
        r9jVar.A = this.k;
        r9jVar.H.n1(jwjVar2, lcjVar2, cejVar2, z2 || z3);
        u8j u8jVar = r9jVar.I;
        u8jVar.q.a = null;
        u8jVar.q = kkjVar;
        kkjVar.a = u8jVar;
        kkjVar.b = u8jVar.n ? jkj.c : jkj.b;
        if (!r9jVar.n1()) {
            g9i g9iVar = r9jVar.C;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            r9jVar.C = null;
            w84 w84Var = r9jVar.B;
            if (w84Var != null && (ydaVar = (yda) w84Var.b.getAndSet(null)) != null) {
                ydaVar.e(null);
            }
        } else if (!z || !Intrinsics.c(jwjVar, jwjVar2) || !n1) {
            r9jVar.o1();
        }
        if (Intrinsics.c(jwjVar, jwjVar2) && Intrinsics.c(cejVar, cejVar2) && Intrinsics.c(lcjVar, lcjVar2) && Intrinsics.c(qugVar, qugVar2)) {
            return;
        }
        y6a.E(r9jVar);
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + dmi.e((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31, 31, this.g)) * 31)) * 31)) * 31;
        eje ejeVar = this.k;
        return hashCode + (ejeVar == null ? 0 : ejeVar.hashCode());
    }

    public final String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.a + ", isDragHovered=" + this.b + ", textLayoutState=" + this.c + ", textFieldState=" + this.d + ", textFieldSelectionState=" + this.e + ", cursorBrush=" + this.f + ", writeable=" + this.g + ", scrollState=" + this.h + ", orientation=" + this.i + ", toolbarRequester=" + this.j + ", platformSelectionBehaviors=" + this.k + ')';
    }
}
