package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uok extends v7l {
    public vx4 k;
    public rn1 l;

    @Override // defpackage.rx4
    public final void a(rx4 rx4Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (wt3.C(this.j) == 3) {
            wm3 wm3Var = this.b;
            l(wm3Var.K, wm3Var.M, 1);
            return;
        }
        b35 b35Var = this.e;
        if (b35Var.c && !b35Var.j && this.d == 3) {
            wm3 wm3Var2 = this.b;
            int i2 = wm3Var2.t;
            if (i2 == 2) {
                xm3 xm3Var = wm3Var2.U;
                if (xm3Var != null) {
                    if (xm3Var.e.e.j) {
                        b35Var.d((int) ((r5.g * wm3Var2.A) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                b35 b35Var2 = wm3Var2.d.e;
                if (b35Var2.j) {
                    int i3 = wm3Var2.Y;
                    if (i3 == -1) {
                        f = b35Var2.g;
                        f2 = wm3Var2.X;
                    } else if (i3 == 0) {
                        f3 = b35Var2.g * wm3Var2.X;
                        i = (int) (f3 + 0.5f);
                        b35Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        b35Var.d(i);
                    } else {
                        f = b35Var2.g;
                        f2 = wm3Var2.X;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    b35Var.d(i);
                }
            }
        }
        vx4 vx4Var = this.h;
        boolean z = vx4Var.c;
        ArrayList arrayList = vx4Var.l;
        if (z) {
            vx4 vx4Var2 = this.i;
            boolean z2 = vx4Var2.c;
            ArrayList arrayList2 = vx4Var2.l;
            if (z2) {
                if (vx4Var.j && vx4Var2.j && b35Var.j) {
                    return;
                }
                if (!b35Var.j && this.d == 3) {
                    wm3 wm3Var3 = this.b;
                    if (wm3Var3.s == 0 && !wm3Var3.z()) {
                        vx4 vx4Var3 = (vx4) arrayList.get(0);
                        vx4 vx4Var4 = (vx4) arrayList2.get(0);
                        int i4 = vx4Var3.g + vx4Var.f;
                        int i5 = vx4Var4.g + vx4Var2.f;
                        vx4Var.d(i4);
                        vx4Var2.d(i5);
                        b35Var.d(i5 - i4);
                        return;
                    }
                }
                if (!b35Var.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    vx4 vx4Var5 = (vx4) arrayList.get(0);
                    int i6 = (((vx4) arrayList2.get(0)).g + vx4Var2.f) - (vx4Var5.g + vx4Var.f);
                    int i7 = b35Var.m;
                    if (i6 < i7) {
                        b35Var.d(i6);
                    } else {
                        b35Var.d(i7);
                    }
                }
                if (b35Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    vx4 vx4Var6 = (vx4) arrayList.get(0);
                    vx4 vx4Var7 = (vx4) arrayList2.get(0);
                    int i8 = vx4Var6.g;
                    int i9 = vx4Var.f + i8;
                    int i10 = vx4Var7.g;
                    int i11 = vx4Var2.f + i10;
                    float f4 = this.b.f0;
                    if (vx4Var6 == vx4Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    vx4Var.d((int) ((((i10 - i8) - b35Var.g) * f4) + i8 + 0.5f));
                    vx4Var2.d(vx4Var.g + b35Var.g);
                }
            }
        }
    }

    @Override // defpackage.v7l
    public final void d() {
        wm3 wm3Var;
        xm3 xm3Var;
        xm3 xm3Var2;
        xm3 xm3Var3;
        vx4 vx4Var = this.k;
        wm3 wm3Var2 = this.b;
        boolean z = wm3Var2.a;
        b35 b35Var = this.e;
        if (z) {
            b35Var.d(wm3Var2.l());
        }
        boolean z2 = b35Var.j;
        ArrayList arrayList = b35Var.k;
        ArrayList arrayList2 = b35Var.l;
        vx4 vx4Var2 = this.i;
        vx4 vx4Var3 = this.h;
        if (!z2) {
            wm3 wm3Var3 = this.b;
            this.d = wm3Var3.q0[1];
            if (wm3Var3.F) {
                this.l = new rn1(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (xm3Var3 = this.b.U) != null && xm3Var3.q0[1] == 1) {
                    int l = (xm3Var3.l() - this.b.K.e()) - this.b.M.e();
                    v7l.b(vx4Var3, xm3Var3.e.h, this.b.K.e());
                    v7l.b(vx4Var2, xm3Var3.e.i, -this.b.M.e());
                    b35Var.d(l);
                    return;
                }
                if (i == 1) {
                    b35Var.d(this.b.l());
                }
            }
        } else if (this.d == 4 && (xm3Var = (wm3Var = this.b).U) != null && xm3Var.q0[1] == 1) {
            v7l.b(vx4Var3, xm3Var.e.h, wm3Var.K.e());
            v7l.b(vx4Var2, xm3Var.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = b35Var.j;
        if (z3) {
            wm3 wm3Var4 = this.b;
            if (wm3Var4.a) {
                nl3[] nl3VarArr = wm3Var4.R;
                nl3 nl3Var = nl3VarArr[2];
                nl3 nl3Var2 = nl3Var.f;
                if (nl3Var2 != null && nl3VarArr[3].f != null) {
                    boolean z4 = wm3Var4.z();
                    wm3 wm3Var5 = this.b;
                    if (z4) {
                        vx4Var3.f = wm3Var5.R[2].e();
                        vx4Var2.f = -this.b.R[3].e();
                    } else {
                        vx4 h = v7l.h(wm3Var5.R[2]);
                        if (h != null) {
                            v7l.b(vx4Var3, h, this.b.R[2].e());
                        }
                        vx4 h2 = v7l.h(this.b.R[3]);
                        if (h2 != null) {
                            v7l.b(vx4Var2, h2, -this.b.R[3].e());
                        }
                        vx4Var3.b = true;
                        vx4Var2.b = true;
                    }
                    wm3 wm3Var6 = this.b;
                    if (wm3Var6.F) {
                        v7l.b(vx4Var, vx4Var3, wm3Var6.b0);
                        return;
                    }
                    return;
                }
                if (nl3Var2 != null) {
                    vx4 h3 = v7l.h(nl3Var);
                    if (h3 != null) {
                        v7l.b(vx4Var3, h3, this.b.R[2].e());
                        v7l.b(vx4Var2, vx4Var3, b35Var.g);
                        wm3 wm3Var7 = this.b;
                        if (wm3Var7.F) {
                            v7l.b(vx4Var, vx4Var3, wm3Var7.b0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                nl3 nl3Var3 = nl3VarArr[3];
                if (nl3Var3.f != null) {
                    vx4 h4 = v7l.h(nl3Var3);
                    if (h4 != null) {
                        v7l.b(vx4Var2, h4, -this.b.R[3].e());
                        v7l.b(vx4Var3, vx4Var2, -b35Var.g);
                    }
                    wm3 wm3Var8 = this.b;
                    if (wm3Var8.F) {
                        v7l.b(vx4Var, vx4Var3, wm3Var8.b0);
                        return;
                    }
                    return;
                }
                nl3 nl3Var4 = nl3VarArr[4];
                if (nl3Var4.f != null) {
                    vx4 h5 = v7l.h(nl3Var4);
                    if (h5 != null) {
                        v7l.b(vx4Var, h5, 0);
                        v7l.b(vx4Var3, vx4Var, -this.b.b0);
                        v7l.b(vx4Var2, vx4Var3, b35Var.g);
                        return;
                    }
                    return;
                }
                if ((wm3Var4 instanceof t99) || wm3Var4.U == null || wm3Var4.j(7).f != null) {
                    return;
                }
                wm3 wm3Var9 = this.b;
                v7l.b(vx4Var3, wm3Var9.U.e.h, wm3Var9.t());
                v7l.b(vx4Var2, vx4Var3, b35Var.g);
                wm3 wm3Var10 = this.b;
                if (wm3Var10.F) {
                    v7l.b(vx4Var, vx4Var3, wm3Var10.b0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            b35Var.b(this);
        } else {
            wm3 wm3Var11 = this.b;
            int i2 = wm3Var11.t;
            if (i2 == 2) {
                xm3 xm3Var4 = wm3Var11.U;
                if (xm3Var4 != null) {
                    b35 b35Var2 = xm3Var4.e.e;
                    arrayList2.add(b35Var2);
                    b35Var2.k.add(b35Var);
                    b35Var.b = true;
                    arrayList.add(vx4Var3);
                    arrayList.add(vx4Var2);
                }
            } else if (i2 == 3 && !wm3Var11.z()) {
                wm3 wm3Var12 = this.b;
                if (wm3Var12.s != 3) {
                    b35 b35Var3 = wm3Var12.d.e;
                    arrayList2.add(b35Var3);
                    b35Var3.k.add(b35Var);
                    b35Var.b = true;
                    arrayList.add(vx4Var3);
                    arrayList.add(vx4Var2);
                }
            }
        }
        wm3 wm3Var13 = this.b;
        nl3[] nl3VarArr2 = wm3Var13.R;
        nl3 nl3Var5 = nl3VarArr2[2];
        nl3 nl3Var6 = nl3Var5.f;
        if (nl3Var6 != null && nl3VarArr2[3].f != null) {
            boolean z5 = wm3Var13.z();
            wm3 wm3Var14 = this.b;
            if (z5) {
                vx4Var3.f = wm3Var14.R[2].e();
                vx4Var2.f = -this.b.R[3].e();
            } else {
                vx4 h6 = v7l.h(wm3Var14.R[2]);
                vx4 h7 = v7l.h(this.b.R[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.F) {
                c(vx4Var, vx4Var3, 1, this.l);
            }
        } else if (nl3Var6 != null) {
            vx4 h8 = v7l.h(nl3Var5);
            if (h8 != null) {
                v7l.b(vx4Var3, h8, this.b.R[2].e());
                c(vx4Var2, vx4Var3, 1, b35Var);
                if (this.b.F) {
                    c(vx4Var, vx4Var3, 1, this.l);
                }
                if (this.d == 3) {
                    wm3 wm3Var15 = this.b;
                    if (wm3Var15.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        mf9 mf9Var = wm3Var15.d;
                        if (mf9Var.d == 3) {
                            mf9Var.e.k.add(b35Var);
                            arrayList2.add(this.b.d.e);
                            b35Var.a = this;
                        }
                    }
                }
            }
        } else {
            nl3 nl3Var7 = nl3VarArr2[3];
            if (nl3Var7.f != null) {
                vx4 h9 = v7l.h(nl3Var7);
                if (h9 != null) {
                    v7l.b(vx4Var2, h9, -this.b.R[3].e());
                    c(vx4Var3, vx4Var2, -1, b35Var);
                    if (this.b.F) {
                        c(vx4Var, vx4Var3, 1, this.l);
                    }
                }
            } else {
                nl3 nl3Var8 = nl3VarArr2[4];
                if (nl3Var8.f != null) {
                    vx4 h10 = v7l.h(nl3Var8);
                    if (h10 != null) {
                        v7l.b(vx4Var, h10, 0);
                        c(vx4Var3, vx4Var, -1, this.l);
                        c(vx4Var2, vx4Var3, 1, b35Var);
                    }
                } else if (!(wm3Var13 instanceof t99) && (xm3Var2 = wm3Var13.U) != null) {
                    v7l.b(vx4Var3, xm3Var2.e.h, wm3Var13.t());
                    c(vx4Var2, vx4Var3, 1, b35Var);
                    if (this.b.F) {
                        c(vx4Var, vx4Var3, 1, this.l);
                    }
                    if (this.d == 3) {
                        wm3 wm3Var16 = this.b;
                        if (wm3Var16.X > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            mf9 mf9Var2 = wm3Var16.d;
                            if (mf9Var2.d == 3) {
                                mf9Var2.e.k.add(b35Var);
                                arrayList2.add(this.b.d.e);
                                b35Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            b35Var.c = true;
        }
    }

    @Override // defpackage.v7l
    public final void e() {
        vx4 vx4Var = this.h;
        if (vx4Var.j) {
            this.b.a0 = vx4Var.g;
        }
    }

    @Override // defpackage.v7l
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.v7l
    public final boolean k() {
        return this.d != 3 || this.b.t == 0;
    }

    public final void m() {
        this.g = false;
        vx4 vx4Var = this.h;
        vx4Var.c();
        vx4Var.j = false;
        vx4 vx4Var2 = this.i;
        vx4Var2.c();
        vx4Var2.j = false;
        vx4 vx4Var3 = this.k;
        vx4Var3.c();
        vx4Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.i0;
    }
}
