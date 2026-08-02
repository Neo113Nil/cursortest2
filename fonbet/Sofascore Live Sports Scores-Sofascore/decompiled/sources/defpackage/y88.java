package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y88 {
    public int a;
    public nl3 d;
    public nl3 e;
    public nl3 f;
    public nl3 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ a98 r;
    public wm3 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public y88(a98 a98Var, int i, nl3 nl3Var, nl3 nl3Var2, nl3 nl3Var3, nl3 nl3Var4, int i2) {
        this.r = a98Var;
        this.a = i;
        this.d = nl3Var;
        this.e = nl3Var2;
        this.f = nl3Var3;
        this.g = nl3Var4;
        this.h = a98Var.x0;
        this.i = a98Var.t0;
        this.j = a98Var.y0;
        this.k = a98Var.u0;
        this.q = i2;
    }

    public final void a(wm3 wm3Var) {
        int i = this.a;
        int i2 = this.q;
        a98 a98Var = this.r;
        if (i == 0) {
            int b0 = a98Var.b0(wm3Var, i2);
            if (wm3Var.q0[0] == 3) {
                this.p++;
                b0 = 0;
            }
            this.l = b0 + (wm3Var.h0 != 8 ? a98Var.Q0 : 0) + this.l;
            int a0 = a98Var.a0(wm3Var, this.q);
            if (this.b == null || this.c < a0) {
                this.b = wm3Var;
                this.c = a0;
                this.m = a0;
            }
        } else {
            int b02 = a98Var.b0(wm3Var, i2);
            int a02 = a98Var.a0(wm3Var, this.q);
            if (wm3Var.q0[1] == 3) {
                this.p++;
                a02 = 0;
            }
            this.m = a02 + (wm3Var.h0 != 8 ? a98Var.R0 : 0) + this.m;
            if (this.b == null || this.c < b02) {
                this.b = wm3Var;
                this.c = b02;
                this.l = b02;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        a98 a98Var;
        int i2;
        int i3;
        int i4;
        wm3 wm3Var;
        boolean z3;
        int i5;
        int i6;
        char c;
        float f;
        int i7;
        float f2;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            a98Var = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= a98Var.c1) {
                break;
            }
            wm3 wm3Var2 = a98Var.b1[i8];
            if (wm3Var2 != null) {
                wm3Var2.E();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= a98Var.c1) {
                break;
            }
            wm3 wm3Var3 = a98Var.b1[i14];
            if (wm3Var3 != null && wm3Var3.h0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        wm3 wm3Var4 = this.b;
        if (i15 == 0) {
            wm3Var4.k0 = a98Var.F0;
            nl3 nl3Var = wm3Var4.M;
            nl3 nl3Var2 = wm3Var4.K;
            int i16 = this.i;
            if (i > 0) {
                i16 += a98Var.R0;
            }
            nl3Var2.a(this.e, i16);
            if (z2) {
                nl3Var.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.M.a(nl3Var2, 0);
            }
            if (a98Var.T0 == 3 && !wm3Var4.F) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= a98Var.c1) {
                        break;
                    }
                    wm3Var = a98Var.b1[i18];
                    if (wm3Var.F) {
                        break;
                    }
                }
            }
            wm3Var = wm3Var4;
            int i19 = 0;
            wm3 wm3Var5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= a98Var.c1) {
                    return;
                }
                wm3 wm3Var6 = a98Var.b1[i21];
                if (wm3Var6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    nl3 nl3Var3 = wm3Var6.K;
                    nl3 nl3Var4 = wm3Var6.M;
                    nl3 nl3Var5 = wm3Var6.J;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        wm3Var6.g(nl3Var5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = a98Var.E0;
                        float f3 = a98Var.K0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = a98Var.G0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = a98Var.M0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = a98Var.I0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = a98Var.O0;
                        }
                        wm3Var6.j0 = i7;
                        wm3Var6.e0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        wm3Var6.g(wm3Var6.L, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (wm3Var5 != null) {
                        nl3 nl3Var6 = wm3Var5.L;
                        nl3Var5.a(nl3Var6, a98Var.Q0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (nl3Var5.h()) {
                                nl3Var5.h = i23;
                            }
                        }
                        nl3Var6.a(nl3Var5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (nl3Var6.h()) {
                                nl3Var6.h = i24;
                            }
                        }
                    }
                    if (wm3Var6 != wm3Var4) {
                        int i25 = a98Var.T0;
                        c = 3;
                        if (i25 == 3 && wm3Var.F && wm3Var6 != wm3Var && wm3Var6.F) {
                            wm3Var6.N.a(wm3Var.N, 0);
                        } else if (i25 == 0) {
                            nl3Var3.a(nl3Var2, 0);
                        } else if (i25 == 1) {
                            nl3Var4.a(nl3Var, 0);
                        } else if (z3) {
                            nl3Var3.a(this.e, this.i);
                            nl3Var4.a(this.g, this.k);
                        } else {
                            nl3Var3.a(nl3Var2, 0);
                            nl3Var4.a(nl3Var, 0);
                        }
                    } else {
                        c = 3;
                    }
                    wm3Var5 = wm3Var6;
                }
                i19++;
                z4 = z3;
                i12 = i5;
                i9 = i6;
            }
            return;
        }
        int i26 = i9;
        boolean z5 = z4;
        int i27 = i12;
        wm3Var4.j0 = a98Var.E0;
        nl3 nl3Var7 = wm3Var4.J;
        nl3 nl3Var8 = wm3Var4.L;
        int i28 = this.h;
        if (i > 0) {
            i28 += a98Var.Q0;
        }
        if (z) {
            nl3Var8.a(this.f, i28);
            if (z2) {
                nl3Var7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.J.a(nl3Var8, 0);
            }
        } else {
            nl3Var7.a(this.d, i28);
            if (z2) {
                nl3Var8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.L.a(nl3Var7, 0);
            }
        }
        int i29 = 0;
        wm3 wm3Var7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= a98Var.c1) {
                return;
            }
            wm3 wm3Var8 = a98Var.b1[i2];
            if (wm3Var8 == null) {
                i26 = i30;
            } else {
                nl3 nl3Var9 = wm3Var8.J;
                nl3 nl3Var10 = wm3Var8.K;
                nl3 nl3Var11 = wm3Var8.L;
                if (i29 == 0) {
                    wm3Var8.g(nl3Var10, this.e, this.i);
                    int i31 = a98Var.F0;
                    float f4 = a98Var.L0;
                    if (this.n == 0) {
                        i4 = a98Var.H0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = a98Var.N0;
                            i31 = i4;
                            wm3Var8.k0 = i31;
                            wm3Var8.f0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = a98Var.J0) != i3) {
                        f4 = a98Var.P0;
                        i31 = i4;
                    }
                    wm3Var8.k0 = i31;
                    wm3Var8.f0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    wm3Var8.g(wm3Var8.M, this.g, this.k);
                }
                if (wm3Var7 != null) {
                    nl3 nl3Var12 = wm3Var7.M;
                    nl3Var10.a(nl3Var12, a98Var.R0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (nl3Var10.h()) {
                            nl3Var10.h = i32;
                        }
                    }
                    nl3Var12.a(nl3Var10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (nl3Var12.h()) {
                            nl3Var12.h = i33;
                        }
                    }
                }
                if (wm3Var8 != wm3Var4) {
                    int i34 = a98Var.S0;
                    if (!z) {
                        if (i34 == 0) {
                            nl3Var9.a(nl3Var7, 0);
                        } else if (i34 == 1) {
                            nl3Var11.a(nl3Var8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                nl3Var9.a(this.d, this.h);
                                nl3Var11.a(this.f, this.j);
                            } else {
                                nl3Var9.a(nl3Var7, 0);
                                nl3Var11.a(nl3Var8, 0);
                            }
                        }
                        wm3Var7 = wm3Var8;
                    } else if (i34 == 0) {
                        nl3Var11.a(nl3Var8, 0);
                    } else if (i34 == 1) {
                        nl3Var9.a(nl3Var7, 0);
                    } else if (i34 == 2) {
                        nl3Var9.a(nl3Var7, 0);
                        nl3Var11.a(nl3Var8, 0);
                    }
                }
                wm3Var7 = wm3Var8;
            }
            i29++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.R0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.Q0 : i2;
    }

    public final void e(int i) {
        a98 a98Var;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            a98Var = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= a98Var.c1) {
                break;
            }
            wm3 wm3Var = a98Var.b1[i2];
            if (this.a == 0) {
                if (wm3Var != null) {
                    int[] iArr = wm3Var.q0;
                    if (iArr[0] == 3 && wm3Var.s == 0) {
                        a98Var.Z(1, i5, iArr[1], wm3Var.l(), wm3Var);
                    }
                }
            } else if (wm3Var != null) {
                int[] iArr2 = wm3Var.q0;
                if (iArr2[1] == 3 && wm3Var.t == 0) {
                    int i7 = i5;
                    a98Var.Z(iArr2[0], wm3Var.r(), 1, i7, wm3Var);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= a98Var.c1) {
                return;
            }
            wm3 wm3Var2 = a98Var.b1[i10];
            if (this.a == 0) {
                int r = wm3Var2.r();
                int i11 = a98Var.Q0;
                if (wm3Var2.h0 == 8) {
                    i11 = 0;
                }
                this.l = r + i11 + this.l;
                int a0 = a98Var.a0(wm3Var2, this.q);
                if (this.b == null || this.c < a0) {
                    this.b = wm3Var2;
                    this.c = a0;
                    this.m = a0;
                }
            } else {
                int b0 = a98Var.b0(wm3Var2, this.q);
                int a02 = a98Var.a0(wm3Var2, this.q);
                int i12 = a98Var.R0;
                if (wm3Var2.h0 == 8) {
                    i12 = 0;
                }
                this.m = a02 + i12 + this.m;
                if (this.b == null || this.c < b0) {
                    this.b = wm3Var2;
                    this.c = b0;
                    this.l = b0;
                }
            }
        }
    }

    public final void f(int i, nl3 nl3Var, nl3 nl3Var2, nl3 nl3Var3, nl3 nl3Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = nl3Var;
        this.e = nl3Var2;
        this.f = nl3Var3;
        this.g = nl3Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
