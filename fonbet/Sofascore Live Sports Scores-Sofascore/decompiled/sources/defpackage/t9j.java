package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lt9j;", "Lbuc;", "Lcaj;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class t9j extends buc {
    public final jwj a;
    public final cej b;
    public final lcj c;
    public final q4a d;
    public final boolean e;
    public final kja f;
    public final fja g;
    public final boolean h;
    public final wzc i;
    public final b1d j;

    public t9j(jwj jwjVar, cej cejVar, lcj lcjVar, q4a q4aVar, boolean z, kja kjaVar, fja fjaVar, boolean z2, wzc wzcVar, b1d b1dVar) {
        this.a = jwjVar;
        this.b = cejVar;
        this.c = lcjVar;
        this.d = q4aVar;
        this.e = z;
        this.f = kjaVar;
        this.g = fjaVar;
        this.h = z2;
        this.i = wzcVar;
        this.j = b1dVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new caj(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9j)) {
            return false;
        }
        t9j t9jVar = (t9j) obj;
        return Intrinsics.c(this.a, t9jVar.a) && Intrinsics.c(this.b, t9jVar.b) && Intrinsics.c(this.c, t9jVar.c) && Intrinsics.c(this.d, t9jVar.d) && this.e == t9jVar.e && this.f.equals(t9jVar.f) && Intrinsics.c(this.g, t9jVar.g) && this.h == t9jVar.h && Intrinsics.c(this.i, t9jVar.i) && Intrinsics.c(this.j, t9jVar.j);
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        g9i g9iVar;
        caj cajVar = (caj) wtcVar;
        ooi ooiVar = cajVar.B;
        se8 se8Var = cajVar.A;
        boolean z = cajVar.u;
        jwj jwjVar = cajVar.q;
        kja kjaVar = cajVar.v;
        lcj lcjVar = cajVar.s;
        wzc wzcVar = cajVar.y;
        b1d b1dVar = cajVar.z;
        jwj jwjVar2 = this.a;
        cajVar.q = jwjVar2;
        cajVar.r = this.b;
        lcj lcjVar2 = this.c;
        cajVar.s = lcjVar2;
        cajVar.t = this.d;
        boolean z2 = this.e;
        cajVar.u = z2;
        kja kjaVar2 = this.f;
        cajVar.v = kjaVar2;
        cajVar.w = this.g;
        cajVar.x = this.h;
        wzc wzcVar2 = this.i;
        cajVar.y = wzcVar2;
        b1d b1dVar2 = this.j;
        cajVar.z = b1dVar2;
        if (z2 != z || !Intrinsics.c(jwjVar2, jwjVar) || !kjaVar2.equals(kjaVar) || !Intrinsics.c(b1dVar2, b1dVar)) {
            if (z2 && (cajVar.q1() || cajVar.J != null)) {
                cajVar.t1(false);
            } else if (!z2) {
                cajVar.o1();
            }
        }
        if (z2 != z || z2 != z || kjaVar2.c() != kjaVar.c()) {
            sea.p(cajVar);
        }
        if (!Intrinsics.c(lcjVar2, lcjVar)) {
            ooiVar.m1();
            if (cajVar.n) {
                lcjVar2.m = cajVar.K;
                if (cajVar.q1() && (g9iVar = cajVar.F) != null) {
                    g9iVar.e(null);
                    cajVar.F = xw3.L(cajVar.Y0(), null, null, new w43(lcjVar2, null, 1), 3);
                }
            }
            lcjVar2.l = new w9j(cajVar, 2);
        }
        if (!Intrinsics.c(wzcVar2, wzcVar)) {
            ooiVar.m1();
            if (se8Var.n) {
                se8Var.o1(wzcVar2);
            }
        }
        if (z2 != z) {
            if (!z2) {
                cajVar.l1(se8Var);
            } else {
                cajVar.k1(se8Var);
                se8Var.o1(wzcVar2);
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        q4a q4aVar = this.d;
        int hashCode2 = (this.f.hashCode() + dmi.e(dmi.e((hashCode + (q4aVar == null ? 0 : q4aVar.hashCode())) * 31, 31, this.e), 31, false)) * 31;
        fja fjaVar = this.g;
        int e = dmi.e((this.i.hashCode() + dmi.e((hashCode2 + (fjaVar == null ? 0 : fjaVar.hashCode())) * 31, 31, this.h)) * 31, 31, false);
        b1d b1dVar = this.j;
        return e + (b1dVar != null ? b1dVar.hashCode() : 0);
    }

    public final String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.a + ", textLayoutState=" + this.b + ", textFieldSelectionState=" + this.c + ", filter=" + this.d + ", enabled=" + this.e + ", readOnly=false, keyboardOptions=" + this.f + ", keyboardActionHandler=" + this.g + ", singleLine=" + this.h + ", interactionSource=" + this.i + ", isPassword=false, stylusHandwritingTrigger=" + this.j + ')';
    }
}
