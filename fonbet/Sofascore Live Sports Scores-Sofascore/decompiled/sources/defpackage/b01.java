package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b01 extends t99 {
    public int t0 = 0;
    public boolean u0 = true;
    public int v0 = 0;
    public boolean w0 = false;

    @Override // defpackage.wm3
    public final boolean B() {
        return this.w0;
    }

    @Override // defpackage.wm3
    public final boolean C() {
        return this.w0;
    }

    public final boolean Y() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.s0;
            if (i4 >= i) {
                break;
            }
            wm3 wm3Var = this.r0[i4];
            if ((this.u0 || wm3Var.d()) && ((((i2 = this.t0) == 0 || i2 == 1) && !wm3Var.B()) || (((i3 = this.t0) == 2 || i3 == 3) && !wm3Var.C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.s0; i6++) {
            wm3 wm3Var2 = this.r0[i6];
            if (this.u0 || wm3Var2.d()) {
                if (!z2) {
                    int i7 = this.t0;
                    if (i7 == 0) {
                        i5 = wm3Var2.j(2).d();
                    } else if (i7 == 1) {
                        i5 = wm3Var2.j(4).d();
                    } else if (i7 == 2) {
                        i5 = wm3Var2.j(3).d();
                    } else if (i7 == 3) {
                        i5 = wm3Var2.j(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.t0;
                if (i8 == 0) {
                    i5 = Math.min(i5, wm3Var2.j(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, wm3Var2.j(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, wm3Var2.j(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, wm3Var2.j(5).d());
                }
            }
        }
        int i9 = i5 + this.v0;
        int i10 = this.t0;
        if (i10 == 0 || i10 == 1) {
            L(i9, i9);
        } else {
            M(i9, i9);
        }
        this.w0 = true;
        return true;
    }

    public final int Z() {
        int i = this.t0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.wm3
    public final void c(h8b h8bVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        nl3[] nl3VarArr = this.R;
        nl3 nl3Var = this.J;
        nl3VarArr[0] = nl3Var;
        int i3 = 2;
        nl3 nl3Var2 = this.K;
        nl3VarArr[2] = nl3Var2;
        nl3 nl3Var3 = this.L;
        nl3VarArr[1] = nl3Var3;
        nl3 nl3Var4 = this.M;
        nl3VarArr[3] = nl3Var4;
        for (nl3 nl3Var5 : nl3VarArr) {
            nl3Var5.i = h8bVar.k(nl3Var5);
        }
        int i4 = this.t0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        nl3 nl3Var6 = nl3VarArr[i4];
        if (!this.w0) {
            Y();
        }
        if (this.w0) {
            this.w0 = false;
            int i5 = this.t0;
            if (i5 == 0 || i5 == 1) {
                h8bVar.d(nl3Var.i, this.Z);
                h8bVar.d(nl3Var3.i, this.Z);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    h8bVar.d(nl3Var2.i, this.a0);
                    h8bVar.d(nl3Var4.i, this.a0);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.s0; i6++) {
            wm3 wm3Var = this.r0[i6];
            if ((this.u0 || wm3Var.d()) && ((((i2 = this.t0) == 0 || i2 == 1) && wm3Var.q0[0] == 3 && wm3Var.J.f != null && wm3Var.L.f != null) || ((i2 == 2 || i2 == 3) && wm3Var.q0[1] == 3 && wm3Var.K.f != null && wm3Var.M.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = nl3Var.g() || nl3Var3.g();
        boolean z4 = nl3Var2.g() || nl3Var4.g();
        int i7 = !(!z2 && (((i = this.t0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.s0) {
            wm3 wm3Var2 = this.r0[i8];
            if (this.u0 || wm3Var2.d()) {
                rvh k = h8bVar.k(wm3Var2.R[this.t0]);
                nl3[] nl3VarArr2 = wm3Var2.R;
                int i9 = this.t0;
                nl3 nl3Var7 = nl3VarArr2[i9];
                nl3Var7.i = k;
                nl3 nl3Var8 = nl3Var7.f;
                int i10 = (nl3Var8 == null || nl3Var8.d != this) ? 0 : nl3Var7.g;
                if (i9 == 0 || i9 == i3) {
                    rvh rvhVar = nl3Var6.i;
                    int i11 = this.v0 - i10;
                    fh0 l = h8bVar.l();
                    rvh m = h8bVar.m();
                    m.d = 0;
                    l.c(rvhVar, k, m, i11);
                    h8bVar.c(l);
                } else {
                    rvh rvhVar2 = nl3Var6.i;
                    int i12 = this.v0 + i10;
                    fh0 l2 = h8bVar.l();
                    rvh m2 = h8bVar.m();
                    m2.d = 0;
                    l2.b(rvhVar2, k, m2, i12);
                    h8bVar.c(l2);
                }
                h8bVar.e(nl3Var6.i, k, this.v0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.t0;
        if (i13 == 0) {
            h8bVar.e(nl3Var3.i, nl3Var.i, 0, 8);
            h8bVar.e(nl3Var.i, this.U.L.i, 0, 4);
            h8bVar.e(nl3Var.i, this.U.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            h8bVar.e(nl3Var.i, nl3Var3.i, 0, 8);
            h8bVar.e(nl3Var.i, this.U.J.i, 0, 4);
            h8bVar.e(nl3Var.i, this.U.L.i, 0, 0);
        } else if (i13 == 2) {
            h8bVar.e(nl3Var4.i, nl3Var2.i, 0, 8);
            h8bVar.e(nl3Var2.i, this.U.M.i, 0, 4);
            h8bVar.e(nl3Var2.i, this.U.K.i, 0, 0);
        } else if (i13 == 3) {
            h8bVar.e(nl3Var2.i, nl3Var4.i, 0, 8);
            h8bVar.e(nl3Var2.i, this.U.K.i, 0, 4);
            h8bVar.e(nl3Var2.i, this.U.M.i, 0, 0);
        }
    }

    @Override // defpackage.wm3
    public final boolean d() {
        return true;
    }

    @Override // defpackage.wm3
    public final String toString() {
        String o = mz1.o(new StringBuilder("[Barrier] "), this.i0, " {");
        for (int i = 0; i < this.s0; i++) {
            wm3 wm3Var = this.r0[i];
            if (i > 0) {
                o = o.concat(", ");
            }
            o = o + wm3Var.i0;
        }
        return o.concat("}");
    }
}
