package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ana {
    public final wma a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public zkb q;
    public sma d = sma.e;
    public final j1c p = new j1c(this);

    public ana(wma wmaVar) {
        this.a = wmaVar;
    }

    public final wdd a() {
        return (wdd) this.a.F.e;
    }

    public final void b() {
        sma smaVar = this.a.G.d;
        if (smaVar == sma.c || smaVar == sma.d) {
            if (this.p.B) {
                g(true);
            } else {
                f(true);
            }
        }
        if (smaVar == sma.d) {
            zkb zkbVar = this.q;
            if (zkbVar == null || !zkbVar.v) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        zkb zkbVar = this.q;
        if (zkbVar != null) {
            sma smaVar = sma.b;
            ana anaVar = zkbVar.f;
            anaVar.d = smaVar;
            wma wmaVar = anaVar.a;
            anaVar.e = false;
            zkbVar.z = j;
            uyd snapshotObserver = ((xy) zma.a(wmaVar)).getSnapshotObserver();
            ykb ykbVar = zkbVar.A;
            snapshotObserver.getClass();
            snapshotObserver.a.i(wmaVar, s84.L, ykbVar);
            anaVar.f = true;
            anaVar.g = true;
            boolean C = d7a.C(wmaVar);
            j1c j1cVar = anaVar.p;
            if (C) {
                j1cVar.w = true;
                j1cVar.x = true;
            } else {
                j1cVar.v = true;
            }
            anaVar.d = sma.e;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            wma v = this.a.v();
            ana anaVar = v != null ? v.G : null;
            if (anaVar != null) {
                int i3 = anaVar.l;
                if (i == 0) {
                    anaVar.d(i3 - 1);
                } else {
                    anaVar.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            wma v = this.a.v();
            ana anaVar = v != null ? v.G : null;
            if (anaVar != null) {
                int i3 = anaVar.o;
                if (i == 0) {
                    anaVar.e(i3 - 1);
                } else {
                    anaVar.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        j1c j1cVar = this.p;
        ana anaVar = j1cVar.f;
        Object obj = j1cVar.s;
        wma wmaVar = this.a;
        if ((obj != null || anaVar.a().h() != null) && j1cVar.r) {
            j1cVar.r = false;
            j1cVar.s = anaVar.a().h();
            wma v = wmaVar.v();
            if (v != null) {
                wma.V(v, false, 7);
            }
        }
        zkb zkbVar = this.q;
        if (zkbVar != null) {
            ana anaVar2 = zkbVar.f;
            if (zkbVar.y == null) {
                vkb c1 = anaVar2.a().c1();
                c1.getClass();
                if (c1.o.h() == null) {
                    return;
                }
            }
            if (zkbVar.x) {
                zkbVar.x = false;
                vkb c12 = anaVar2.a().c1();
                c12.getClass();
                zkbVar.y = c12.o.h();
                if (d7a.C(wmaVar)) {
                    wma v2 = wmaVar.v();
                    if (v2 != null) {
                        wma.V(v2, false, 7);
                        return;
                    }
                    return;
                }
                wma v3 = wmaVar.v();
                if (v3 != null) {
                    wma.T(v3, false, 7);
                }
            }
        }
    }
}
