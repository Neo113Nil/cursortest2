package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s49 extends wm3 {
    public float r0 = -1.0f;
    public int s0 = -1;
    public int t0 = -1;
    public nl3 u0 = this.K;
    public int v0 = 0;
    public boolean w0;

    public s49() {
        this.S.clear();
        this.S.add(this.u0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.u0;
        }
    }

    @Override // defpackage.wm3
    public final boolean B() {
        return this.w0;
    }

    @Override // defpackage.wm3
    public final boolean C() {
        return this.w0;
    }

    @Override // defpackage.wm3
    public final void U(h8b h8bVar, boolean z) {
        if (this.U == null) {
            return;
        }
        nl3 nl3Var = this.u0;
        h8bVar.getClass();
        int n = h8b.n(nl3Var);
        if (this.v0 == 1) {
            this.Z = n;
            this.a0 = 0;
            N(this.U.l());
            S(0);
            return;
        }
        this.Z = 0;
        this.a0 = n;
        S(this.U.r());
        N(0);
    }

    public final void V(int i) {
        this.u0.l(i);
        this.w0 = true;
    }

    public final void W(int i) {
        nl3 nl3Var;
        if (this.v0 == i) {
            return;
        }
        this.v0 = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.v0 == 1) {
            nl3Var = this.J;
            this.u0 = nl3Var;
        } else {
            nl3Var = this.K;
            this.u0 = nl3Var;
        }
        arrayList.add(nl3Var);
        nl3[] nl3VarArr = this.R;
        int length = nl3VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            nl3VarArr[i2] = this.u0;
        }
    }

    @Override // defpackage.wm3
    public final void c(h8b h8bVar, boolean z) {
        xm3 xm3Var = this.U;
        if (xm3Var == null) {
            return;
        }
        Object j = xm3Var.j(2);
        Object j2 = xm3Var.j(4);
        xm3 xm3Var2 = this.U;
        boolean z2 = xm3Var2 != null && xm3Var2.q0[0] == 2;
        if (this.v0 == 0) {
            j = xm3Var.j(3);
            j2 = xm3Var.j(5);
            xm3 xm3Var3 = this.U;
            z2 = xm3Var3 != null && xm3Var3.q0[1] == 2;
        }
        if (this.w0) {
            nl3 nl3Var = this.u0;
            if (nl3Var.c) {
                rvh k = h8bVar.k(nl3Var);
                h8bVar.d(k, this.u0.d());
                if (this.s0 != -1) {
                    if (z2) {
                        h8bVar.f(h8bVar.k(j2), k, 0, 5);
                    }
                } else if (this.t0 != -1 && z2) {
                    rvh k2 = h8bVar.k(j2);
                    h8bVar.f(k, h8bVar.k(j), 0, 5);
                    h8bVar.f(k2, k, 0, 5);
                }
                this.w0 = false;
                return;
            }
        }
        if (this.s0 != -1) {
            rvh k3 = h8bVar.k(this.u0);
            h8bVar.e(k3, h8bVar.k(j), this.s0, 8);
            if (z2) {
                h8bVar.f(h8bVar.k(j2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.t0 != -1) {
            rvh k4 = h8bVar.k(this.u0);
            rvh k5 = h8bVar.k(j2);
            h8bVar.e(k4, k5, -this.t0, 8);
            if (z2) {
                h8bVar.f(k4, h8bVar.k(j), 0, 5);
                h8bVar.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1.0f) {
            rvh k6 = h8bVar.k(this.u0);
            rvh k7 = h8bVar.k(j2);
            float f = this.r0;
            fh0 l = h8bVar.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            h8bVar.c(l);
        }
    }

    @Override // defpackage.wm3
    public final boolean d() {
        return true;
    }

    @Override // defpackage.wm3
    public final nl3 j(int i) {
        int C = wt3.C(i);
        if (C != 1) {
            if (C != 2) {
                if (C != 3) {
                    if (C != 4) {
                        return null;
                    }
                }
            }
            if (this.v0 == 0) {
                return this.u0;
            }
            return null;
        }
        if (this.v0 == 1) {
            return this.u0;
        }
        return null;
    }
}
