package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mf9 extends v7l {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // defpackage.rx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(rx4 rx4Var) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (wt3.C(this.j) == 3) {
            wm3 wm3Var = this.b;
            l(wm3Var.J, wm3Var.L, 0);
            return;
        }
        b35 b35Var = this.e;
        boolean z2 = b35Var.j;
        vx4 vx4Var = this.h;
        vx4 vx4Var2 = this.i;
        if (!z2 && this.d == 3) {
            wm3 wm3Var2 = this.b;
            int i2 = wm3Var2.s;
            if (i2 == 2) {
                f = 0.5f;
                xm3 xm3Var = wm3Var2.U;
                if (xm3Var != null) {
                    if (xm3Var.d.e.j) {
                        b35Var.d((int) ((r5.g * wm3Var2.x) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = wm3Var2.t;
                if (i3 == 0 || i3 == 3) {
                    uok uokVar = wm3Var2.e;
                    vx4 vx4Var3 = uokVar.h;
                    vx4 vx4Var4 = uokVar.i;
                    boolean z3 = wm3Var2.J.f != null;
                    boolean z4 = wm3Var2.K.f != null;
                    boolean z5 = wm3Var2.L.f != null;
                    boolean z6 = wm3Var2.M.f != null;
                    f = 0.5f;
                    int i4 = wm3Var2.Y;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = wm3Var2.X;
                        boolean z7 = vx4Var3.j;
                        ArrayList arrayList = vx4Var3.l;
                        int[] iArr = k;
                        if (z7 && vx4Var4.j) {
                            if (vx4Var.c && vx4Var2.c) {
                                m(iArr, ((vx4) vx4Var.l.get(0)).g + vx4Var.f, ((vx4) vx4Var2.l.get(0)).g - vx4Var2.f, vx4Var3.g + vx4Var3.f, vx4Var4.g - vx4Var4.f, f5, i4);
                                b35Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (vx4Var.j && vx4Var2.j) {
                            if (!vx4Var3.c || !vx4Var4.c) {
                                return;
                            }
                            m(iArr, vx4Var.g + vx4Var.f, vx4Var2.g - vx4Var2.f, ((vx4) arrayList.get(0)).g + vx4Var3.f, ((vx4) vx4Var4.l.get(0)).g - vx4Var4.f, f5, i4);
                            b35Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!vx4Var.c || !vx4Var2.c || !vx4Var3.c || !vx4Var4.c) {
                            return;
                        }
                        m(iArr, ((vx4) vx4Var.l.get(0)).g + vx4Var.f, ((vx4) vx4Var2.l.get(0)).g - vx4Var2.f, ((vx4) arrayList.get(0)).g + vx4Var3.f, ((vx4) vx4Var4.l.get(0)).g - vx4Var4.f, f5, i4);
                        b35Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!vx4Var.c || !vx4Var2.c) {
                            return;
                        }
                        float f6 = wm3Var2.X;
                        int i5 = ((vx4) vx4Var.l.get(0)).g + vx4Var.f;
                        int i6 = ((vx4) vx4Var2.l.get(0)).g - vx4Var2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f6) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f6) + 0.5f);
                            }
                            b35Var.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f6) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f6) + 0.5f);
                            }
                            b35Var.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z4 && z6) {
                        if (!vx4Var3.c || !vx4Var4.c) {
                            return;
                        }
                        float f7 = wm3Var2.X;
                        int i9 = ((vx4) vx4Var3.l.get(0)).g + vx4Var3.f;
                        int i10 = ((vx4) vx4Var4.l.get(0)).g - vx4Var4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f7) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f7) + 0.5f);
                                }
                                b35Var.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f7) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f7) + 0.5f);
                        }
                        b35Var.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = wm3Var2.Y;
                    if (i13 == -1) {
                        f2 = wm3Var2.e.e.g;
                        f3 = wm3Var2.X;
                    } else if (i13 == 0) {
                        f4 = wm3Var2.e.e.g / wm3Var2.X;
                        i = (int) (f4 + 0.5f);
                        b35Var.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        b35Var.d(i);
                    } else {
                        f2 = wm3Var2.e.e.g;
                        f3 = wm3Var2.X;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    b35Var.d(i);
                }
            }
            z = vx4Var.c;
            ArrayList arrayList2 = vx4Var.l;
            if (z) {
                return;
            }
            boolean z8 = vx4Var2.c;
            ArrayList arrayList3 = vx4Var2.l;
            if (z8) {
                if (vx4Var.j && vx4Var2.j && b35Var.j) {
                    return;
                }
                if (!b35Var.j && this.d == 3) {
                    wm3 wm3Var3 = this.b;
                    if (wm3Var3.s == 0 && !wm3Var3.y()) {
                        vx4 vx4Var5 = (vx4) arrayList2.get(0);
                        vx4 vx4Var6 = (vx4) arrayList3.get(0);
                        int i14 = vx4Var5.g + vx4Var.f;
                        int i15 = vx4Var6.g + vx4Var2.f;
                        vx4Var.d(i14);
                        vx4Var2.d(i15);
                        b35Var.d(i15 - i14);
                        return;
                    }
                }
                if (!b35Var.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((vx4) arrayList3.get(0)).g + vx4Var2.f) - (((vx4) arrayList2.get(0)).g + vx4Var.f), b35Var.m);
                    wm3 wm3Var4 = this.b;
                    int i16 = wm3Var4.w;
                    int max = Math.max(wm3Var4.v, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    b35Var.d(max);
                }
                if (b35Var.j) {
                    vx4 vx4Var7 = (vx4) arrayList2.get(0);
                    vx4 vx4Var8 = (vx4) arrayList3.get(0);
                    int i17 = vx4Var7.g;
                    int i18 = vx4Var.f + i17;
                    int i19 = vx4Var8.g;
                    int i20 = vx4Var2.f + i19;
                    float f8 = this.b.e0;
                    if (vx4Var7 == vx4Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    vx4Var.d((int) ((((i19 - i17) - b35Var.g) * f8) + i17 + f));
                    vx4Var2.d(vx4Var.g + b35Var.g);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = vx4Var.c;
        ArrayList arrayList22 = vx4Var.l;
        if (z) {
        }
    }

    @Override // defpackage.v7l
    public final void d() {
        wm3 wm3Var;
        xm3 xm3Var;
        int i;
        xm3 xm3Var2;
        xm3 xm3Var3;
        int i2;
        wm3 wm3Var2 = this.b;
        boolean z = wm3Var2.a;
        b35 b35Var = this.e;
        if (z) {
            b35Var.d(wm3Var2.r());
        }
        boolean z2 = b35Var.j;
        ArrayList arrayList = b35Var.k;
        ArrayList arrayList2 = b35Var.l;
        vx4 vx4Var = this.i;
        vx4 vx4Var2 = this.h;
        if (!z2) {
            wm3 wm3Var3 = this.b;
            int i3 = wm3Var3.q0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (xm3Var3 = wm3Var3.U) != null && ((i2 = xm3Var3.q0[0]) == 1 || i2 == 4)) {
                    int r = (xm3Var3.r() - this.b.J.e()) - this.b.L.e();
                    v7l.b(vx4Var2, xm3Var3.d.h, this.b.J.e());
                    v7l.b(vx4Var, xm3Var3.d.i, -this.b.L.e());
                    b35Var.d(r);
                    return;
                }
                if (i3 == 1) {
                    b35Var.d(wm3Var3.r());
                }
            }
        } else if (this.d == 4 && (xm3Var = (wm3Var = this.b).U) != null && ((i = xm3Var.q0[0]) == 1 || i == 4)) {
            v7l.b(vx4Var2, xm3Var.d.h, wm3Var.J.e());
            v7l.b(vx4Var, xm3Var.d.i, -this.b.L.e());
            return;
        }
        if (b35Var.j) {
            wm3 wm3Var4 = this.b;
            if (wm3Var4.a) {
                nl3[] nl3VarArr = wm3Var4.R;
                nl3 nl3Var = nl3VarArr[0];
                nl3 nl3Var2 = nl3Var.f;
                if (nl3Var2 != null && nl3VarArr[1].f != null) {
                    boolean y = wm3Var4.y();
                    wm3 wm3Var5 = this.b;
                    if (y) {
                        vx4Var2.f = wm3Var5.R[0].e();
                        vx4Var.f = -this.b.R[1].e();
                        return;
                    }
                    vx4 h = v7l.h(wm3Var5.R[0]);
                    if (h != null) {
                        v7l.b(vx4Var2, h, this.b.R[0].e());
                    }
                    vx4 h2 = v7l.h(this.b.R[1]);
                    if (h2 != null) {
                        v7l.b(vx4Var, h2, -this.b.R[1].e());
                    }
                    vx4Var2.b = true;
                    vx4Var.b = true;
                    return;
                }
                if (nl3Var2 != null) {
                    vx4 h3 = v7l.h(nl3Var);
                    if (h3 != null) {
                        v7l.b(vx4Var2, h3, this.b.R[0].e());
                        v7l.b(vx4Var, vx4Var2, b35Var.g);
                        return;
                    }
                    return;
                }
                nl3 nl3Var3 = nl3VarArr[1];
                if (nl3Var3.f != null) {
                    vx4 h4 = v7l.h(nl3Var3);
                    if (h4 != null) {
                        v7l.b(vx4Var, h4, -this.b.R[1].e());
                        v7l.b(vx4Var2, vx4Var, -b35Var.g);
                        return;
                    }
                    return;
                }
                if ((wm3Var4 instanceof t99) || wm3Var4.U == null || wm3Var4.j(7).f != null) {
                    return;
                }
                wm3 wm3Var6 = this.b;
                v7l.b(vx4Var2, wm3Var6.U.d.h, wm3Var6.s());
                v7l.b(vx4Var, vx4Var2, b35Var.g);
                return;
            }
        }
        if (this.d == 3) {
            wm3 wm3Var7 = this.b;
            int i4 = wm3Var7.s;
            if (i4 == 2) {
                xm3 xm3Var4 = wm3Var7.U;
                if (xm3Var4 != null) {
                    b35 b35Var2 = xm3Var4.e.e;
                    arrayList2.add(b35Var2);
                    b35Var2.k.add(b35Var);
                    b35Var.b = true;
                    arrayList.add(vx4Var2);
                    arrayList.add(vx4Var);
                }
            } else if (i4 == 3) {
                if (wm3Var7.t == 3) {
                    vx4Var2.a = this;
                    vx4Var.a = this;
                    uok uokVar = wm3Var7.e;
                    uokVar.h.a = this;
                    uokVar.i.a = this;
                    b35Var.a = this;
                    if (wm3Var7.z()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(b35Var);
                        uok uokVar2 = this.b.e;
                        uokVar2.e.a = this;
                        arrayList2.add(uokVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(b35Var);
                        this.b.e.i.k.add(b35Var);
                    } else {
                        boolean y2 = this.b.y();
                        wm3 wm3Var8 = this.b;
                        if (y2) {
                            wm3Var8.e.e.l.add(b35Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            wm3Var8.e.e.l.add(b35Var);
                        }
                    }
                } else {
                    b35 b35Var3 = wm3Var7.e.e;
                    arrayList2.add(b35Var3);
                    b35Var3.k.add(b35Var);
                    this.b.e.h.k.add(b35Var);
                    this.b.e.i.k.add(b35Var);
                    b35Var.b = true;
                    arrayList.add(vx4Var2);
                    arrayList.add(vx4Var);
                    vx4Var2.l.add(b35Var);
                    vx4Var.l.add(b35Var);
                }
            }
        }
        wm3 wm3Var9 = this.b;
        nl3[] nl3VarArr2 = wm3Var9.R;
        nl3 nl3Var4 = nl3VarArr2[0];
        nl3 nl3Var5 = nl3Var4.f;
        if (nl3Var5 != null && nl3VarArr2[1].f != null) {
            boolean y3 = wm3Var9.y();
            wm3 wm3Var10 = this.b;
            if (y3) {
                vx4Var2.f = wm3Var10.R[0].e();
                vx4Var.f = -this.b.R[1].e();
                return;
            }
            vx4 h5 = v7l.h(wm3Var10.R[0]);
            vx4 h6 = v7l.h(this.b.R[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (nl3Var5 != null) {
            vx4 h7 = v7l.h(nl3Var4);
            if (h7 != null) {
                v7l.b(vx4Var2, h7, this.b.R[0].e());
                c(vx4Var, vx4Var2, 1, b35Var);
                return;
            }
            return;
        }
        nl3 nl3Var6 = nl3VarArr2[1];
        if (nl3Var6.f != null) {
            vx4 h8 = v7l.h(nl3Var6);
            if (h8 != null) {
                v7l.b(vx4Var, h8, -this.b.R[1].e());
                c(vx4Var2, vx4Var, -1, b35Var);
                return;
            }
            return;
        }
        if ((wm3Var9 instanceof t99) || (xm3Var2 = wm3Var9.U) == null) {
            return;
        }
        v7l.b(vx4Var2, xm3Var2.d.h, wm3Var9.s());
        c(vx4Var, vx4Var2, 1, b35Var);
    }

    @Override // defpackage.v7l
    public final void e() {
        vx4 vx4Var = this.h;
        if (vx4Var.j) {
            this.b.Z = vx4Var.g;
        }
    }

    @Override // defpackage.v7l
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.v7l
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void n() {
        this.g = false;
        vx4 vx4Var = this.h;
        vx4Var.c();
        vx4Var.j = false;
        vx4 vx4Var2 = this.i;
        vx4Var2.c();
        vx4Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.i0;
    }
}
