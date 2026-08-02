package n2;

import java.util.ArrayList;
import m2.d;
import m2.e;
import n2.f;
import n2.p;

/* loaded from: classes.dex */
public final class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f76330k = new int[2];

    /* loaded from: classes8.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f76331a;

        static {
            int[] iArr = new int[p.b.values().length];
            f76331a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f76331a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f76331a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(m2.e eVar) {
        super(eVar);
        this.f76350h.f76320e = f.a.LEFT;
        this.f76351i.f76320e = f.a.RIGHT;
        this.f76348f = 0;
    }

    private static void n(int[] iArr, int i11, int i12, int i13, int i14, float f7, int i15) {
        int i16 = i12 - i11;
        int i17 = i14 - i13;
        if (i15 != -1) {
            if (i15 == 0) {
                iArr[0] = (int) ((i17 * f7) + 0.5f);
                iArr[1] = i17;
                return;
            } else {
                if (i15 != 1) {
                    return;
                }
                iArr[0] = i16;
                iArr[1] = (int) ((i16 * f7) + 0.5f);
                return;
            }
        }
        int i18 = (int) ((i17 * f7) + 0.5f);
        int i19 = (int) ((i16 / f7) + 0.5f);
        if (i18 <= i16) {
            iArr[0] = i18;
            iArr[1] = i17;
        } else if (i19 <= i17) {
            iArr[0] = i16;
            iArr[1] = i19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x024f, code lost:
    
        if (r21 != 1) goto L125;
     */
    @Override // n2.p, n2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(d dVar) {
        float f7;
        float f11;
        float f12;
        int i11;
        if (a.f76331a[this.f76352j.ordinal()] == 3) {
            m2.e eVar = this.f76344b;
            m(eVar.f74104K, eVar.f74106M, 0);
            return;
        }
        g gVar = this.f76347e;
        boolean z11 = gVar.f76325j;
        f fVar = this.f76350h;
        f fVar2 = this.f76351i;
        if (!z11 && this.f76346d == e.b.MATCH_CONSTRAINT) {
            m2.e eVar2 = this.f76344b;
            int i12 = eVar2.f74156s;
            if (i12 == 2) {
                m2.e eVar3 = eVar2.f74116W;
                if (eVar3 != null) {
                    if (eVar3.f74126d.f76347e.f76325j) {
                        gVar.d((int) ((r3.f76322g * eVar2.f74164x) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = eVar2.f74158t;
                if (i13 == 0 || i13 == 3) {
                    n nVar = eVar2.f74128e;
                    f fVar3 = nVar.f76350h;
                    f fVar4 = nVar.f76351i;
                    boolean z12 = eVar2.f74104K.f74090f != null;
                    boolean z13 = eVar2.f74105L.f74090f != null;
                    boolean z14 = eVar2.f74106M.f74090f != null;
                    boolean z15 = eVar2.f74107N.f74090f != null;
                    int u11 = eVar2.u();
                    if (z12 && z13 && z14 && z15) {
                        float f13 = this.f76344b.f74119Z;
                        boolean z16 = fVar3.f76325j;
                        int[] iArr = f76330k;
                        if (z16 && fVar4.f76325j) {
                            if (fVar.f76318c && fVar2.f76318c) {
                                n(iArr, ((f) fVar.f76327l.get(0)).f76322g + fVar.f76321f, ((f) fVar2.f76327l.get(0)).f76322g - fVar2.f76321f, fVar3.f76322g + fVar3.f76321f, fVar4.f76322g - fVar4.f76321f, f13, u11);
                                gVar.d(iArr[0]);
                                this.f76344b.f74128e.f76347e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z17 = fVar.f76325j;
                        ArrayList arrayList = fVar3.f76327l;
                        if (z17 && fVar2.f76325j) {
                            if (!fVar3.f76318c || !fVar4.f76318c) {
                                return;
                            }
                            n(iArr, fVar.f76322g + fVar.f76321f, fVar2.f76322g - fVar2.f76321f, ((f) arrayList.get(0)).f76322g + fVar3.f76321f, ((f) fVar4.f76327l.get(0)).f76322g - fVar4.f76321f, f13, u11);
                            gVar.d(iArr[0]);
                            this.f76344b.f74128e.f76347e.d(iArr[1]);
                        }
                        if (!fVar.f76318c || !fVar2.f76318c || !fVar3.f76318c || !fVar4.f76318c) {
                            return;
                        }
                        n(iArr, ((f) fVar.f76327l.get(0)).f76322g + fVar.f76321f, ((f) fVar2.f76327l.get(0)).f76322g - fVar2.f76321f, ((f) arrayList.get(0)).f76322g + fVar3.f76321f, ((f) fVar4.f76327l.get(0)).f76322g - fVar4.f76321f, f13, u11);
                        gVar.d(iArr[0]);
                        this.f76344b.f74128e.f76347e.d(iArr[1]);
                    } else if (z12 && z14) {
                        if (!fVar.f76318c || !fVar2.f76318c) {
                            return;
                        }
                        float f14 = this.f76344b.f74119Z;
                        int i14 = ((f) fVar.f76327l.get(0)).f76322g + fVar.f76321f;
                        int i15 = ((f) fVar2.f76327l.get(0)).f76322g - fVar2.f76321f;
                        if (u11 == -1 || u11 == 0) {
                            int g10 = g(i15 - i14, 0);
                            int i16 = (int) ((g10 * f14) + 0.5f);
                            int g11 = g(i16, 1);
                            if (i16 != g11) {
                                g10 = (int) ((g11 / f14) + 0.5f);
                            }
                            gVar.d(g10);
                            this.f76344b.f74128e.f76347e.d(g11);
                        } else if (u11 == 1) {
                            int g12 = g(i15 - i14, 0);
                            int i17 = (int) ((g12 / f14) + 0.5f);
                            int g13 = g(i17, 1);
                            if (i17 != g13) {
                                g12 = (int) ((g13 * f14) + 0.5f);
                            }
                            gVar.d(g12);
                            this.f76344b.f74128e.f76347e.d(g13);
                        }
                    } else if (z13 && z15) {
                        if (!fVar3.f76318c || !fVar4.f76318c) {
                            return;
                        }
                        float f15 = this.f76344b.f74119Z;
                        int i18 = ((f) fVar3.f76327l.get(0)).f76322g + fVar3.f76321f;
                        int i19 = ((f) fVar4.f76327l.get(0)).f76322g - fVar4.f76321f;
                        if (u11 != -1) {
                            if (u11 == 0) {
                                int g14 = g(i19 - i18, 1);
                                int i21 = (int) ((g14 * f15) + 0.5f);
                                int g15 = g(i21, 0);
                                if (i21 != g15) {
                                    g14 = (int) ((g15 / f15) + 0.5f);
                                }
                                gVar.d(g15);
                                this.f76344b.f74128e.f76347e.d(g14);
                            }
                        }
                        int g16 = g(i19 - i18, 1);
                        int i22 = (int) ((g16 / f15) + 0.5f);
                        int g17 = g(i22, 0);
                        if (i22 != g17) {
                            g16 = (int) ((g17 * f15) + 0.5f);
                        }
                        gVar.d(g17);
                        this.f76344b.f74128e.f76347e.d(g16);
                    }
                } else {
                    int u12 = eVar2.u();
                    if (u12 == -1) {
                        m2.e eVar4 = this.f76344b;
                        f7 = eVar4.f74128e.f76347e.f76322g;
                        f11 = eVar4.f74119Z;
                    } else if (u12 == 0) {
                        f12 = r3.f74128e.f76347e.f76322g / this.f76344b.f74119Z;
                        i11 = (int) (f12 + 0.5f);
                        gVar.d(i11);
                    } else if (u12 != 1) {
                        i11 = 0;
                        gVar.d(i11);
                    } else {
                        m2.e eVar5 = this.f76344b;
                        f7 = eVar5.f74128e.f76347e.f76322g;
                        f11 = eVar5.f74119Z;
                    }
                    f12 = f7 * f11;
                    i11 = (int) (f12 + 0.5f);
                    gVar.d(i11);
                }
            }
        }
        if (fVar.f76318c && fVar2.f76318c) {
            if (fVar.f76325j && fVar2.f76325j && gVar.f76325j) {
                return;
            }
            if (!gVar.f76325j && this.f76346d == e.b.MATCH_CONSTRAINT) {
                m2.e eVar6 = this.f76344b;
                if (eVar6.f74156s == 0 && !eVar6.Y()) {
                    f fVar5 = (f) fVar.f76327l.get(0);
                    f fVar6 = (f) fVar2.f76327l.get(0);
                    int i23 = fVar5.f76322g + fVar.f76321f;
                    int i24 = fVar6.f76322g + fVar2.f76321f;
                    fVar.d(i23);
                    fVar2.d(i24);
                    gVar.d(i24 - i23);
                    return;
                }
            }
            if (!gVar.f76325j && this.f76346d == e.b.MATCH_CONSTRAINT && this.f76343a == 1 && fVar.f76327l.size() > 0 && fVar2.f76327l.size() > 0) {
                int min = Math.min((((f) fVar2.f76327l.get(0)).f76322g + fVar2.f76321f) - (((f) fVar.f76327l.get(0)).f76322g + fVar.f76321f), gVar.f76328m);
                m2.e eVar7 = this.f76344b;
                int i25 = eVar7.f74163w;
                int max = Math.max(eVar7.f74162v, min);
                if (i25 > 0) {
                    max = Math.min(i25, max);
                }
                gVar.d(max);
            }
            if (gVar.f76325j) {
                f fVar7 = (f) fVar.f76327l.get(0);
                f fVar8 = (f) fVar2.f76327l.get(0);
                int i26 = fVar7.f76322g + fVar.f76321f;
                int i27 = fVar8.f76322g + fVar2.f76321f;
                float w11 = this.f76344b.w();
                if (fVar7 == fVar8) {
                    i26 = fVar7.f76322g;
                    i27 = fVar8.f76322g;
                    w11 = 0.5f;
                }
                fVar.d((int) ((((i27 - i26) - gVar.f76322g) * w11) + i26 + 0.5f));
                fVar2.d(fVar.f76322g + gVar.f76322g);
            }
        }
    }

    @Override // n2.p
    final void d() {
        m2.e eVar;
        m2.e eVar2;
        e.b bVar;
        m2.e eVar3;
        m2.e eVar4;
        e.b bVar2;
        m2.e eVar5 = this.f76344b;
        boolean z11 = eVar5.f74120a;
        g gVar = this.f76347e;
        if (z11) {
            gVar.d(eVar5.N());
        }
        boolean z12 = gVar.f76325j;
        f fVar = this.f76351i;
        f fVar2 = this.f76350h;
        if (z12) {
            e.b bVar3 = this.f76346d;
            e.b bVar4 = e.b.MATCH_PARENT;
            if (bVar3 == bVar4 && (eVar2 = (eVar = this.f76344b).f74116W) != null && ((bVar = eVar2.f74115V[0]) == e.b.FIXED || bVar == bVar4)) {
                p.b(fVar2, eVar2.f74126d.f76350h, eVar.f74104K.f());
                p.b(fVar, eVar2.f74126d.f76351i, -this.f76344b.f74106M.f());
                return;
            }
        } else {
            m2.e eVar6 = this.f76344b;
            e.b bVar5 = eVar6.f74115V[0];
            this.f76346d = bVar5;
            if (bVar5 != e.b.MATCH_CONSTRAINT) {
                e.b bVar6 = e.b.MATCH_PARENT;
                if (bVar5 == bVar6 && (eVar4 = eVar6.f74116W) != null && ((bVar2 = eVar4.f74115V[0]) == e.b.FIXED || bVar2 == bVar6)) {
                    int N11 = (eVar4.N() - this.f76344b.f74104K.f()) - this.f76344b.f74106M.f();
                    p.b(fVar2, eVar4.f74126d.f76350h, this.f76344b.f74104K.f());
                    p.b(fVar, eVar4.f74126d.f76351i, -this.f76344b.f74106M.f());
                    gVar.d(N11);
                    return;
                }
                if (bVar5 == e.b.FIXED) {
                    gVar.d(eVar6.N());
                }
            }
        }
        if (gVar.f76325j) {
            m2.e eVar7 = this.f76344b;
            if (eVar7.f74120a) {
                m2.d[] dVarArr = eVar7.f74112S;
                m2.d dVar = dVarArr[0];
                m2.d dVar2 = dVar.f74090f;
                if (dVar2 != null && dVarArr[1].f74090f != null) {
                    if (eVar7.Y()) {
                        fVar2.f76321f = this.f76344b.f74112S[0].f();
                        fVar.f76321f = -this.f76344b.f74112S[1].f();
                        return;
                    }
                    f h11 = p.h(this.f76344b.f74112S[0]);
                    if (h11 != null) {
                        p.b(fVar2, h11, this.f76344b.f74112S[0].f());
                    }
                    f h12 = p.h(this.f76344b.f74112S[1]);
                    if (h12 != null) {
                        p.b(fVar, h12, -this.f76344b.f74112S[1].f());
                    }
                    fVar2.f76317b = true;
                    fVar.f76317b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h13 = p.h(dVar);
                    if (h13 != null) {
                        p.b(fVar2, h13, this.f76344b.f74112S[0].f());
                        p.b(fVar, fVar2, gVar.f76322g);
                        return;
                    }
                    return;
                }
                m2.d dVar3 = dVarArr[1];
                if (dVar3.f74090f != null) {
                    f h14 = p.h(dVar3);
                    if (h14 != null) {
                        p.b(fVar, h14, -this.f76344b.f74112S[1].f());
                        p.b(fVar2, fVar, -gVar.f76322g);
                        return;
                    }
                    return;
                }
                if ((eVar7 instanceof m2.i) || eVar7.f74116W == null || eVar7.n(d.a.CENTER).f74090f != null) {
                    return;
                }
                m2.e eVar8 = this.f76344b;
                p.b(fVar2, eVar8.f74116W.f74126d.f76350h, eVar8.O());
                p.b(fVar, fVar2, gVar.f76322g);
                return;
            }
        }
        if (this.f76346d == e.b.MATCH_CONSTRAINT) {
            m2.e eVar9 = this.f76344b;
            int i11 = eVar9.f74156s;
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
            } else if (i11 == 3) {
                if (eVar9.f74158t == 3) {
                    fVar2.f76316a = this;
                    fVar.f76316a = this;
                    n nVar = eVar9.f74128e;
                    nVar.f76350h.f76316a = this;
                    nVar.f76351i.f76316a = this;
                    gVar.f76316a = this;
                    if (eVar9.a0()) {
                        gVar.f76327l.add(this.f76344b.f74128e.f76347e);
                        this.f76344b.f74128e.f76347e.f76326k.add(gVar);
                        n nVar2 = this.f76344b.f74128e;
                        nVar2.f76347e.f76316a = this;
                        gVar.f76327l.add(nVar2.f76350h);
                        gVar.f76327l.add(this.f76344b.f74128e.f76351i);
                        this.f76344b.f74128e.f76350h.f76326k.add(gVar);
                        this.f76344b.f74128e.f76351i.f76326k.add(gVar);
                    } else if (this.f76344b.Y()) {
                        this.f76344b.f74128e.f76347e.f76327l.add(gVar);
                        gVar.f76326k.add(this.f76344b.f74128e.f76347e);
                    } else {
                        this.f76344b.f74128e.f76347e.f76327l.add(gVar);
                    }
                } else {
                    g gVar3 = eVar9.f74128e.f76347e;
                    gVar.f76327l.add(gVar3);
                    gVar3.f76326k.add(gVar);
                    this.f76344b.f74128e.f76350h.f76326k.add(gVar);
                    this.f76344b.f74128e.f76351i.f76326k.add(gVar);
                    gVar.f76317b = true;
                    gVar.f76326k.add(fVar2);
                    gVar.f76326k.add(fVar);
                    fVar2.f76327l.add(gVar);
                    fVar.f76327l.add(gVar);
                }
            }
        }
        m2.e eVar11 = this.f76344b;
        m2.d[] dVarArr2 = eVar11.f74112S;
        m2.d dVar4 = dVarArr2[0];
        m2.d dVar5 = dVar4.f74090f;
        if (dVar5 != null && dVarArr2[1].f74090f != null) {
            if (eVar11.Y()) {
                fVar2.f76321f = this.f76344b.f74112S[0].f();
                fVar.f76321f = -this.f76344b.f74112S[1].f();
                return;
            }
            f h15 = p.h(this.f76344b.f74112S[0]);
            f h16 = p.h(this.f76344b.f74112S[1]);
            if (h15 != null) {
                h15.b(this);
            }
            if (h16 != null) {
                h16.b(this);
            }
            this.f76352j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h17 = p.h(dVar4);
            if (h17 != null) {
                p.b(fVar2, h17, this.f76344b.f74112S[0].f());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        m2.d dVar6 = dVarArr2[1];
        if (dVar6.f74090f != null) {
            f h18 = p.h(dVar6);
            if (h18 != null) {
                p.b(fVar, h18, -this.f76344b.f74112S[1].f());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((eVar11 instanceof m2.i) || (eVar3 = eVar11.f74116W) == null) {
            return;
        }
        p.b(fVar2, eVar3.f74126d.f76350h, eVar11.O());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // n2.p
    public final void e() {
        f fVar = this.f76350h;
        if (fVar.f76325j) {
            this.f76344b.V0(fVar.f76322g);
        }
    }

    @Override // n2.p
    final void f() {
        this.f76345c = null;
        this.f76350h.c();
        this.f76351i.c();
        this.f76347e.c();
        this.f76349g = false;
    }

    @Override // n2.p
    final boolean l() {
        return this.f76346d != e.b.MATCH_CONSTRAINT || this.f76344b.f74156s == 0;
    }

    final void o() {
        this.f76349g = false;
        f fVar = this.f76350h;
        fVar.c();
        fVar.f76325j = false;
        f fVar2 = this.f76351i;
        fVar2.c();
        fVar2.f76325j = false;
        this.f76347e.f76325j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f76344b.s();
    }
}
