package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vug extends bw4 implements ug3, tkd {
    public o00 A;
    public n00 B;
    public boolean C;
    public jvg q;
    public ewd r;
    public boolean s;
    public p78 t;
    public wzc u;
    public a42 v;
    public boolean w;
    public myd x;
    public ivg y;
    public xv4 z;

    @Override // defpackage.xv4
    public final void S() {
        boolean o1 = o1();
        if (this.C != o1) {
            this.C = o1;
            jvg jvgVar = this.q;
            ewd ewdVar = this.r;
            boolean z = this.w;
            myd mydVar = z ? this.B : this.x;
            p1(this.v, this.t, this.u, ewdVar, mydVar, jvgVar, z, this.s);
        }
    }

    @Override // defpackage.tkd
    public final void Z() {
        o00 o00Var = (o00) tgj.x(this, nyd.a);
        if (Intrinsics.c(o00Var, this.A)) {
            return;
        }
        this.A = o00Var;
        this.B = null;
        xv4 xv4Var = this.z;
        if (xv4Var != null) {
            l1(xv4Var);
        }
        this.z = null;
        n1();
        ivg ivgVar = this.y;
        if (ivgVar != null) {
            jvg jvgVar = this.q;
            ewd ewdVar = this.r;
            myd mydVar = this.w ? this.B : this.x;
            ivgVar.F1(this.v, this.t, this.u, ewdVar, mydVar, jvgVar, this.s, this.C);
        }
    }

    @Override // defpackage.wtc
    public final boolean Z0() {
        return false;
    }

    @Override // defpackage.wtc
    public final void c1() {
        this.C = o1();
        n1();
        if (this.y == null) {
            jvg jvgVar = this.q;
            myd mydVar = this.w ? this.B : this.x;
            ivg ivgVar = new ivg(this.v, this.t, this.u, this.r, mydVar, jvgVar, this.s, this.C);
            k1(ivgVar);
            this.y = ivgVar;
        }
    }

    @Override // defpackage.wtc
    public final void d1() {
        xv4 xv4Var = this.z;
        if (xv4Var != null) {
            l1(xv4Var);
        }
    }

    public final void n1() {
        xv4 xv4Var = this.z;
        if (xv4Var != null) {
            if (((wtc) xv4Var).a.n) {
                return;
            }
            k1(xv4Var);
            return;
        }
        if (this.w) {
            z1a.R(this, new e6g(this, 10));
        }
        myd mydVar = this.w ? this.B : this.x;
        if (mydVar != null) {
            xv4 a = mydVar.a();
            if (((wtc) a).a.n) {
                return;
            }
            k1(a);
            this.z = a;
        }
    }

    public final boolean o1() {
        ema emaVar = ema.a;
        if (this.n) {
            emaVar = c6o.c0(this).z;
        }
        return emaVar != ema.b || this.r == ewd.a;
    }

    public final void p1(a42 a42Var, p78 p78Var, wzc wzcVar, ewd ewdVar, myd mydVar, jvg jvgVar, boolean z, boolean z2) {
        boolean z3;
        this.q = jvgVar;
        this.r = ewdVar;
        boolean z4 = true;
        if (this.w != z) {
            this.w = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (Intrinsics.c(this.x, mydVar)) {
            z4 = false;
        } else {
            this.x = mydVar;
        }
        if (z3 || (z4 && !z)) {
            xv4 xv4Var = this.z;
            if (xv4Var != null) {
                l1(xv4Var);
            }
            this.z = null;
            n1();
        }
        this.s = z2;
        this.t = p78Var;
        this.u = wzcVar;
        this.v = a42Var;
        boolean o1 = o1();
        this.C = o1;
        ivg ivgVar = this.y;
        if (ivgVar != null) {
            ivgVar.F1(a42Var, p78Var, wzcVar, ewdVar, this.w ? this.B : this.x, jvgVar, z2, o1);
        }
    }
}
