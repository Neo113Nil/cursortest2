package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class v7l implements rx4 {
    public int a;
    public wm3 b;
    public y9g c;
    public int d;
    public final b35 e = new b35(this);
    public int f = 0;
    public boolean g = false;
    public final vx4 h = new vx4(this);
    public final vx4 i = new vx4(this);
    public int j = 1;

    public v7l(wm3 wm3Var) {
        this.b = wm3Var;
    }

    public static void b(vx4 vx4Var, vx4 vx4Var2, int i) {
        vx4Var.l.add(vx4Var2);
        vx4Var.f = i;
        vx4Var2.k.add(vx4Var);
    }

    public static vx4 h(nl3 nl3Var) {
        nl3 nl3Var2 = nl3Var.f;
        if (nl3Var2 == null) {
            return null;
        }
        wm3 wm3Var = nl3Var2.d;
        int C = wt3.C(nl3Var2.e);
        if (C == 1) {
            return wm3Var.d.h;
        }
        if (C == 2) {
            return wm3Var.e.h;
        }
        if (C == 3) {
            return wm3Var.d.i;
        }
        if (C == 4) {
            return wm3Var.e.i;
        }
        if (C != 5) {
            return null;
        }
        return wm3Var.e.k;
    }

    public static vx4 i(nl3 nl3Var, int i) {
        nl3 nl3Var2 = nl3Var.f;
        if (nl3Var2 == null) {
            return null;
        }
        wm3 wm3Var = nl3Var2.d;
        v7l v7lVar = i == 0 ? wm3Var.d : wm3Var.e;
        int C = wt3.C(nl3Var2.e);
        if (C == 1 || C == 2) {
            return v7lVar.h;
        }
        if (C == 3 || C == 4) {
            return v7lVar.i;
        }
        return null;
    }

    public final void c(vx4 vx4Var, vx4 vx4Var2, int i, b35 b35Var) {
        vx4Var.l.add(vx4Var2);
        vx4Var.l.add(this.e);
        vx4Var.h = i;
        vx4Var.i = b35Var;
        vx4Var2.k.add(vx4Var);
        b35Var.k.add(vx4Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        wm3 wm3Var = this.b;
        if (i2 == 0) {
            int i3 = wm3Var.w;
            int max = Math.max(wm3Var.v, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = wm3Var.z;
            int max2 = Math.max(wm3Var.y, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(nl3 nl3Var, nl3 nl3Var2, int i) {
        vx4 h = h(nl3Var);
        vx4 h2 = h(nl3Var2);
        if (h.j && h2.j) {
            int e = nl3Var.e() + h.g;
            int e2 = h2.g - nl3Var2.e();
            int i2 = e2 - e;
            b35 b35Var = this.e;
            if (!b35Var.j && this.d == 3) {
                int i3 = this.a;
                if (i3 == 0) {
                    b35Var.d(g(i2, i));
                } else if (i3 == 1) {
                    b35Var.d(Math.min(g(b35Var.m, i), i2));
                } else if (i3 == 2) {
                    wm3 wm3Var = this.b;
                    xm3 xm3Var = wm3Var.U;
                    if (xm3Var != null) {
                        if ((i == 0 ? xm3Var.d : xm3Var.e).e.j) {
                            b35Var.d(g((int) ((r6.g * (i == 0 ? wm3Var.x : wm3Var.A)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    wm3 wm3Var2 = this.b;
                    v7l v7lVar = wm3Var2.d;
                    if (v7lVar.d == 3 && v7lVar.a == 3) {
                        uok uokVar = wm3Var2.e;
                        if (uokVar.d == 3) {
                        }
                    }
                    if (i == 0) {
                        v7lVar = wm3Var2.e;
                    }
                    b35 b35Var2 = v7lVar.e;
                    if (b35Var2.j) {
                        float f = wm3Var2.X;
                        int i4 = b35Var2.g;
                        b35Var.d(i == 1 ? (int) ((i4 / f) + 0.5f) : (int) ((f * i4) + 0.5f));
                    }
                }
            }
            if (b35Var.j) {
                int i5 = b35Var.g;
                vx4 vx4Var = this.i;
                vx4 vx4Var2 = this.h;
                if (i5 == i2) {
                    vx4Var2.d(e);
                    vx4Var.d(e2);
                    return;
                }
                wm3 wm3Var3 = this.b;
                float f2 = i == 0 ? wm3Var3.e0 : wm3Var3.f0;
                if (h == h2) {
                    e = h.g;
                    e2 = h2.g;
                    f2 = 0.5f;
                }
                vx4Var2.d((int) ((((e2 - e) - i5) * f2) + e + 0.5f));
                vx4Var.d(vx4Var2.g + b35Var.g);
            }
        }
    }
}
