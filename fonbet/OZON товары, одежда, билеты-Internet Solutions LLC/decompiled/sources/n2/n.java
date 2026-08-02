package n2;

import m2.d;
import m2.e;
import n2.f;
import n2.p;

/* loaded from: classes.dex */
public final class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f76334k;

    /* renamed from: l, reason: collision with root package name */
    C8419a f76335l;

    /* loaded from: classes8.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f76336a;

        static {
            int[] iArr = new int[p.b.values().length];
            f76336a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76336a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76336a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(m2.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f76334k = fVar;
        this.f76335l = null;
        this.f76350h.f76320e = f.a.TOP;
        this.f76351i.f76320e = f.a.BOTTOM;
        fVar.f76320e = f.a.BASELINE;
        this.f76348f = 1;
    }

    @Override // n2.p, n2.d
    public final void a(d dVar) {
        float f7;
        float f11;
        float f12;
        int i11;
        if (a.f76336a[this.f76352j.ordinal()] == 3) {
            m2.e eVar = this.f76344b;
            m(eVar.f74105L, eVar.f74107N, 1);
            return;
        }
        g gVar = this.f76347e;
        if (gVar.f76318c && !gVar.f76325j && this.f76346d == e.b.MATCH_CONSTRAINT) {
            m2.e eVar2 = this.f76344b;
            int i12 = eVar2.f74158t;
            if (i12 == 2) {
                m2.e eVar3 = eVar2.f74116W;
                if (eVar3 != null) {
                    if (eVar3.f74128e.f76347e.f76325j) {
                        gVar.d((int) ((r1.f76322g * eVar2.f74094A) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f74126d.f76347e.f76325j) {
                int u11 = eVar2.u();
                if (u11 == -1) {
                    m2.e eVar4 = this.f76344b;
                    f7 = eVar4.f74126d.f76347e.f76322g;
                    f11 = eVar4.f74119Z;
                } else if (u11 == 0) {
                    f12 = r1.f74126d.f76347e.f76322g * this.f76344b.f74119Z;
                    i11 = (int) (f12 + 0.5f);
                    gVar.d(i11);
                } else if (u11 != 1) {
                    i11 = 0;
                    gVar.d(i11);
                } else {
                    m2.e eVar5 = this.f76344b;
                    f7 = eVar5.f74126d.f76347e.f76322g;
                    f11 = eVar5.f74119Z;
                }
                f12 = f7 / f11;
                i11 = (int) (f12 + 0.5f);
                gVar.d(i11);
            }
        }
        f fVar = this.f76350h;
        if (fVar.f76318c) {
            f fVar2 = this.f76351i;
            if (fVar2.f76318c) {
                if (fVar.f76325j && fVar2.f76325j && gVar.f76325j) {
                    return;
                }
                if (!gVar.f76325j && this.f76346d == e.b.MATCH_CONSTRAINT) {
                    m2.e eVar6 = this.f76344b;
                    if (eVar6.f74156s == 0 && !eVar6.a0()) {
                        f fVar3 = (f) fVar.f76327l.get(0);
                        f fVar4 = (f) fVar2.f76327l.get(0);
                        int i13 = fVar3.f76322g + fVar.f76321f;
                        int i14 = fVar4.f76322g + fVar2.f76321f;
                        fVar.d(i13);
                        fVar2.d(i14);
                        gVar.d(i14 - i13);
                        return;
                    }
                }
                if (!gVar.f76325j && this.f76346d == e.b.MATCH_CONSTRAINT && this.f76343a == 1 && fVar.f76327l.size() > 0 && fVar2.f76327l.size() > 0) {
                    f fVar5 = (f) fVar.f76327l.get(0);
                    int i15 = (((f) fVar2.f76327l.get(0)).f76322g + fVar2.f76321f) - (fVar5.f76322g + fVar.f76321f);
                    int i16 = gVar.f76328m;
                    if (i15 < i16) {
                        gVar.d(i15);
                    } else {
                        gVar.d(i16);
                    }
                }
                if (gVar.f76325j && fVar.f76327l.size() > 0 && fVar2.f76327l.size() > 0) {
                    f fVar6 = (f) fVar.f76327l.get(0);
                    f fVar7 = (f) fVar2.f76327l.get(0);
                    int i17 = fVar6.f76322g + fVar.f76321f;
                    int i18 = fVar7.f76322g + fVar2.f76321f;
                    float K11 = this.f76344b.K();
                    if (fVar6 == fVar7) {
                        i17 = fVar6.f76322g;
                        i18 = fVar7.f76322g;
                        K11 = 0.5f;
                    }
                    fVar.d((int) ((((i18 - i17) - gVar.f76322g) * K11) + i17 + 0.5f));
                    fVar2.d(fVar.f76322g + gVar.f76322g);
                }
            }
        }
    }

    @Override // n2.p
    final void d() {
        m2.e eVar;
        m2.e eVar2;
        m2.e eVar3;
        m2.e eVar4;
        m2.e eVar5 = this.f76344b;
        boolean z11 = eVar5.f74120a;
        g gVar = this.f76347e;
        if (z11) {
            gVar.d(eVar5.v());
        }
        boolean z12 = gVar.f76325j;
        f fVar = this.f76351i;
        f fVar2 = this.f76350h;
        if (!z12) {
            m2.e eVar6 = this.f76344b;
            this.f76346d = eVar6.f74115V[1];
            if (eVar6.Q()) {
                this.f76335l = new C8419a(this);
            }
            e.b bVar = this.f76346d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVar4 = this.f76344b.f74116W) != null && eVar4.f74115V[1] == e.b.FIXED) {
                    int v11 = (eVar4.v() - this.f76344b.f74105L.f()) - this.f76344b.f74107N.f();
                    p.b(fVar2, eVar4.f74128e.f76350h, this.f76344b.f74105L.f());
                    p.b(fVar, eVar4.f74128e.f76351i, -this.f76344b.f74107N.f());
                    gVar.d(v11);
                    return;
                }
                if (bVar == e.b.FIXED) {
                    gVar.d(this.f76344b.v());
                }
            }
        } else if (this.f76346d == e.b.MATCH_PARENT && (eVar2 = (eVar = this.f76344b).f74116W) != null && eVar2.f74115V[1] == e.b.FIXED) {
            p.b(fVar2, eVar2.f74128e.f76350h, eVar.f74105L.f());
            p.b(fVar, eVar2.f74128e.f76351i, -this.f76344b.f74107N.f());
            return;
        }
        boolean z13 = gVar.f76325j;
        f fVar3 = this.f76334k;
        if (z13) {
            m2.e eVar7 = this.f76344b;
            if (eVar7.f74120a) {
                m2.d[] dVarArr = eVar7.f74112S;
                m2.d dVar = dVarArr[2];
                m2.d dVar2 = dVar.f74090f;
                if (dVar2 != null && dVarArr[3].f74090f != null) {
                    if (eVar7.a0()) {
                        fVar2.f76321f = this.f76344b.f74112S[2].f();
                        fVar.f76321f = -this.f76344b.f74112S[3].f();
                    } else {
                        f h11 = p.h(this.f76344b.f74112S[2]);
                        if (h11 != null) {
                            p.b(fVar2, h11, this.f76344b.f74112S[2].f());
                        }
                        f h12 = p.h(this.f76344b.f74112S[3]);
                        if (h12 != null) {
                            p.b(fVar, h12, -this.f76344b.f74112S[3].f());
                        }
                        fVar2.f76317b = true;
                        fVar.f76317b = true;
                    }
                    if (this.f76344b.Q()) {
                        p.b(fVar3, fVar2, this.f76344b.o());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h13 = p.h(dVar);
                    if (h13 != null) {
                        p.b(fVar2, h13, this.f76344b.f74112S[2].f());
                        p.b(fVar, fVar2, gVar.f76322g);
                        if (this.f76344b.Q()) {
                            p.b(fVar3, fVar2, this.f76344b.o());
                            return;
                        }
                        return;
                    }
                    return;
                }
                m2.d dVar3 = dVarArr[3];
                if (dVar3.f74090f != null) {
                    f h14 = p.h(dVar3);
                    if (h14 != null) {
                        p.b(fVar, h14, -this.f76344b.f74112S[3].f());
                        p.b(fVar2, fVar, -gVar.f76322g);
                    }
                    if (this.f76344b.Q()) {
                        p.b(fVar3, fVar2, this.f76344b.o());
                        return;
                    }
                    return;
                }
                m2.d dVar4 = dVarArr[4];
                if (dVar4.f74090f != null) {
                    f h15 = p.h(dVar4);
                    if (h15 != null) {
                        p.b(fVar3, h15, 0);
                        p.b(fVar2, fVar3, -this.f76344b.o());
                        p.b(fVar, fVar2, gVar.f76322g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof m2.i) || eVar7.f74116W == null || eVar7.n(d.a.CENTER).f74090f != null) {
                    return;
                }
                m2.e eVar8 = this.f76344b;
                p.b(fVar2, eVar8.f74116W.f74128e.f76350h, eVar8.P());
                p.b(fVar, fVar2, gVar.f76322g);
                if (this.f76344b.Q()) {
                    p.b(fVar3, fVar2, this.f76344b.o());
                    return;
                }
                return;
            }
        }
        if (z13 || this.f76346d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            m2.e eVar9 = this.f76344b;
            int i11 = eVar9.f74158t;
            if (i11 == 2) {
                m2.e eVar10 = eVar9.f74116W;
                if (eVar10 != null) {
                    g gVar2 = eVar10.f74128e.f76347e;
                    gVar.f76327l.add(gVar2);
                    gVar2.f76326k.add(gVar);
                    gVar.f76317b = true;
                    gVar.f76326k.add(fVar2);
                    gVar.f76326k.add(fVar);
                }
            } else if (i11 == 3 && !eVar9.a0()) {
                m2.e eVar11 = this.f76344b;
                if (eVar11.f74156s != 3) {
                    g gVar3 = eVar11.f74126d.f76347e;
                    gVar.f76327l.add(gVar3);
                    gVar3.f76326k.add(gVar);
                    gVar.f76317b = true;
                    gVar.f76326k.add(fVar2);
                    gVar.f76326k.add(fVar);
                }
            }
        }
        m2.e eVar12 = this.f76344b;
        m2.d[] dVarArr2 = eVar12.f74112S;
        m2.d dVar5 = dVarArr2[2];
        m2.d dVar6 = dVar5.f74090f;
        if (dVar6 != null && dVarArr2[3].f74090f != null) {
            if (eVar12.a0()) {
                fVar2.f76321f = this.f76344b.f74112S[2].f();
                fVar.f76321f = -this.f76344b.f74112S[3].f();
            } else {
                f h16 = p.h(this.f76344b.f74112S[2]);
                f h17 = p.h(this.f76344b.f74112S[3]);
                if (h16 != null) {
                    h16.b(this);
                }
                if (h17 != null) {
                    h17.b(this);
                }
                this.f76352j = p.b.CENTER;
            }
            if (this.f76344b.Q()) {
                c(fVar3, fVar2, 1, this.f76335l);
            }
        } else if (dVar6 != null) {
            f h18 = p.h(dVar5);
            if (h18 != null) {
                p.b(fVar2, h18, this.f76344b.f74112S[2].f());
                c(fVar, fVar2, 1, gVar);
                if (this.f76344b.Q()) {
                    c(fVar3, fVar2, 1, this.f76335l);
                }
                e.b bVar2 = this.f76346d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3) {
                    m2.e eVar13 = this.f76344b;
                    if (eVar13.f74119Z > 0.0f) {
                        l lVar = eVar13.f74126d;
                        if (lVar.f76346d == bVar3) {
                            lVar.f76347e.f76326k.add(gVar);
                            gVar.f76327l.add(this.f76344b.f74126d.f76347e);
                            gVar.f76316a = this;
                        }
                    }
                }
            }
        } else {
            m2.d dVar7 = dVarArr2[3];
            if (dVar7.f74090f != null) {
                f h19 = p.h(dVar7);
                if (h19 != null) {
                    p.b(fVar, h19, -this.f76344b.f74112S[3].f());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f76344b.Q()) {
                        c(fVar3, fVar2, 1, this.f76335l);
                    }
                }
            } else {
                m2.d dVar8 = dVarArr2[4];
                if (dVar8.f74090f != null) {
                    f h21 = p.h(dVar8);
                    if (h21 != null) {
                        p.b(fVar3, h21, 0);
                        c(fVar2, fVar3, -1, this.f76335l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(eVar12 instanceof m2.i) && (eVar3 = eVar12.f74116W) != null) {
                    p.b(fVar2, eVar3.f74128e.f76350h, eVar12.P());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f76344b.Q()) {
                        c(fVar3, fVar2, 1, this.f76335l);
                    }
                    e.b bVar4 = this.f76346d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5) {
                        m2.e eVar14 = this.f76344b;
                        if (eVar14.f74119Z > 0.0f) {
                            l lVar2 = eVar14.f74126d;
                            if (lVar2.f76346d == bVar5) {
                                lVar2.f76347e.f76326k.add(gVar);
                                gVar.f76327l.add(this.f76344b.f74126d.f76347e);
                                gVar.f76316a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f76327l.size() == 0) {
            gVar.f76318c = true;
        }
    }

    @Override // n2.p
    public final void e() {
        f fVar = this.f76350h;
        if (fVar.f76325j) {
            this.f76344b.W0(fVar.f76322g);
        }
    }

    @Override // n2.p
    final void f() {
        this.f76345c = null;
        this.f76350h.c();
        this.f76351i.c();
        this.f76334k.c();
        this.f76347e.c();
        this.f76349g = false;
    }

    @Override // n2.p
    final boolean l() {
        return this.f76346d != e.b.MATCH_CONSTRAINT || this.f76344b.f74158t == 0;
    }

    final void n() {
        this.f76349g = false;
        f fVar = this.f76350h;
        fVar.c();
        fVar.f76325j = false;
        f fVar2 = this.f76351i;
        fVar2.c();
        fVar2.f76325j = false;
        f fVar3 = this.f76334k;
        fVar3.c();
        fVar3.f76325j = false;
        this.f76347e.f76325j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f76344b.s();
    }
}
