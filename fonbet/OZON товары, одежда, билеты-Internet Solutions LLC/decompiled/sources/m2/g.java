package m2;

import f2.C6404d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import m2.e;
import n2.C8420b;

/* loaded from: classes8.dex */
public final class g extends m {

    /* renamed from: f1, reason: collision with root package name */
    private e[] f74212f1;

    /* renamed from: I0, reason: collision with root package name */
    private int f74189I0 = -1;

    /* renamed from: J0, reason: collision with root package name */
    private int f74190J0 = -1;

    /* renamed from: K0, reason: collision with root package name */
    private int f74191K0 = -1;

    /* renamed from: L0, reason: collision with root package name */
    private int f74192L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    private int f74193M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    private int f74194N0 = -1;

    /* renamed from: O0, reason: collision with root package name */
    private float f74195O0 = 0.5f;

    /* renamed from: P0, reason: collision with root package name */
    private float f74196P0 = 0.5f;

    /* renamed from: Q0, reason: collision with root package name */
    private float f74197Q0 = 0.5f;

    /* renamed from: R0, reason: collision with root package name */
    private float f74198R0 = 0.5f;

    /* renamed from: S0, reason: collision with root package name */
    private float f74199S0 = 0.5f;

    /* renamed from: T0, reason: collision with root package name */
    private float f74200T0 = 0.5f;

    /* renamed from: U0, reason: collision with root package name */
    private int f74201U0 = 0;

    /* renamed from: V0, reason: collision with root package name */
    private int f74202V0 = 0;

    /* renamed from: W0, reason: collision with root package name */
    private int f74203W0 = 2;

    /* renamed from: X0, reason: collision with root package name */
    private int f74204X0 = 2;

    /* renamed from: Y0, reason: collision with root package name */
    private int f74205Y0 = 0;

    /* renamed from: Z0, reason: collision with root package name */
    private int f74206Z0 = -1;

    /* renamed from: a1, reason: collision with root package name */
    private int f74207a1 = 0;

    /* renamed from: b1, reason: collision with root package name */
    private ArrayList<a> f74208b1 = new ArrayList<>();

    /* renamed from: c1, reason: collision with root package name */
    private e[] f74209c1 = null;

    /* renamed from: d1, reason: collision with root package name */
    private e[] f74210d1 = null;

    /* renamed from: e1, reason: collision with root package name */
    private int[] f74211e1 = null;

    /* renamed from: g1, reason: collision with root package name */
    private int f74213g1 = 0;

    private class a {

        /* renamed from: a, reason: collision with root package name */
        private int f74214a;

        /* renamed from: d, reason: collision with root package name */
        private d f74217d;

        /* renamed from: e, reason: collision with root package name */
        private d f74218e;

        /* renamed from: f, reason: collision with root package name */
        private d f74219f;

        /* renamed from: g, reason: collision with root package name */
        private d f74220g;

        /* renamed from: h, reason: collision with root package name */
        private int f74221h;

        /* renamed from: i, reason: collision with root package name */
        private int f74222i;

        /* renamed from: j, reason: collision with root package name */
        private int f74223j;

        /* renamed from: k, reason: collision with root package name */
        private int f74224k;

        /* renamed from: q, reason: collision with root package name */
        private int f74230q;

        /* renamed from: b, reason: collision with root package name */
        private e f74215b = null;

        /* renamed from: c, reason: collision with root package name */
        int f74216c = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f74225l = 0;

        /* renamed from: m, reason: collision with root package name */
        private int f74226m = 0;

        /* renamed from: n, reason: collision with root package name */
        private int f74227n = 0;

        /* renamed from: o, reason: collision with root package name */
        private int f74228o = 0;

        /* renamed from: p, reason: collision with root package name */
        private int f74229p = 0;

        a(int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12) {
            this.f74221h = 0;
            this.f74222i = 0;
            this.f74223j = 0;
            this.f74224k = 0;
            this.f74230q = 0;
            this.f74214a = i11;
            this.f74217d = dVar;
            this.f74218e = dVar2;
            this.f74219f = dVar3;
            this.f74220g = dVar4;
            this.f74221h = g.this.e1();
            this.f74222i = g.this.g1();
            this.f74223j = g.this.f1();
            this.f74224k = g.this.d1();
            this.f74230q = i12;
        }

        public final void b(e eVar) {
            int i11 = this.f74214a;
            g gVar = g.this;
            if (i11 == 0) {
                int O12 = gVar.O1(eVar, this.f74230q);
                if (eVar.f74115V[0] == e.b.MATCH_CONSTRAINT) {
                    this.f74229p++;
                    O12 = 0;
                }
                this.f74225l = O12 + (eVar.M() != 8 ? gVar.f74201U0 : 0) + this.f74225l;
                int N12 = gVar.N1(eVar, this.f74230q);
                if (this.f74215b == null || this.f74216c < N12) {
                    this.f74215b = eVar;
                    this.f74216c = N12;
                    this.f74226m = N12;
                }
            } else {
                int O13 = gVar.O1(eVar, this.f74230q);
                int N13 = gVar.N1(eVar, this.f74230q);
                if (eVar.f74115V[1] == e.b.MATCH_CONSTRAINT) {
                    this.f74229p++;
                    N13 = 0;
                }
                this.f74226m = N13 + (eVar.M() != 8 ? gVar.f74202V0 : 0) + this.f74226m;
                if (this.f74215b == null || this.f74216c < O13) {
                    this.f74215b = eVar;
                    this.f74216c = O13;
                    this.f74225l = O13;
                }
            }
            this.f74228o++;
        }

        public final void c() {
            this.f74216c = 0;
            this.f74215b = null;
            this.f74225l = 0;
            this.f74226m = 0;
            this.f74227n = 0;
            this.f74228o = 0;
            this.f74229p = 0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:84:0x012b, code lost:
        
            if (r22 != false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x012d, code lost:
        
            r6 = 1.0f - r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x012f, code lost:
        
            r15 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x0144, code lost:
        
            if (r22 != false) goto L89;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void d(int i11, boolean z11, boolean z12) {
            g gVar;
            int i12;
            int i13;
            e eVar;
            g gVar2;
            char c11;
            int i14;
            int i15;
            float f7;
            int i16 = this.f74228o;
            int i17 = 0;
            while (true) {
                gVar = g.this;
                if (i17 >= i16 || this.f74227n + i17 >= gVar.f74213g1) {
                    break;
                }
                e eVar2 = gVar.f74212f1[this.f74227n + i17];
                if (eVar2 != null) {
                    eVar2.j0();
                }
                i17++;
            }
            if (i16 == 0 || this.f74215b == null) {
                return;
            }
            boolean z13 = z12 && i11 == 0;
            int i18 = -1;
            int i19 = -1;
            for (int i21 = 0; i21 < i16; i21++) {
                int i22 = z11 ? (i16 - 1) - i21 : i21;
                if (this.f74227n + i22 >= gVar.f74213g1) {
                    break;
                }
                e eVar3 = gVar.f74212f1[this.f74227n + i22];
                if (eVar3 != null && eVar3.M() == 0) {
                    if (i18 == -1) {
                        i18 = i21;
                    }
                    i19 = i21;
                }
            }
            if (this.f74214a != 0) {
                e eVar4 = this.f74215b;
                eVar4.f74145m0 = gVar.f74189I0;
                int i23 = this.f74221h;
                if (i11 > 0) {
                    i23 += gVar.f74201U0;
                }
                d dVar = eVar4.f74104K;
                d dVar2 = eVar4.f74106M;
                if (z11) {
                    dVar2.a(this.f74219f, i23);
                    if (z12) {
                        dVar.a(this.f74217d, this.f74223j);
                    }
                    if (i11 > 0) {
                        this.f74219f.f74088d.f74104K.a(dVar2, 0);
                    }
                } else {
                    dVar.a(this.f74217d, i23);
                    if (z12) {
                        dVar2.a(this.f74219f, this.f74223j);
                    }
                    if (i11 > 0) {
                        this.f74217d.f74088d.f74106M.a(dVar, 0);
                    }
                }
                e eVar5 = null;
                for (int i24 = 0; i24 < i16 && this.f74227n + i24 < gVar.f74213g1; i24++) {
                    e eVar6 = gVar.f74212f1[this.f74227n + i24];
                    if (eVar6 != null) {
                        d dVar3 = eVar6.f74105L;
                        if (i24 == 0) {
                            eVar6.j(dVar3, this.f74218e, this.f74222i);
                            int i25 = gVar.f74190J0;
                            float f11 = gVar.f74196P0;
                            if (this.f74227n == 0) {
                                i12 = -1;
                                if (gVar.f74192L0 != -1) {
                                    i25 = gVar.f74192L0;
                                    f11 = gVar.f74198R0;
                                    eVar6.f74147n0 = i25;
                                    eVar6.f74135h0 = f11;
                                }
                            } else {
                                i12 = -1;
                            }
                            if (z12 && gVar.f74194N0 != i12) {
                                i25 = gVar.f74194N0;
                                f11 = gVar.f74200T0;
                            }
                            eVar6.f74147n0 = i25;
                            eVar6.f74135h0 = f11;
                        }
                        if (i24 == i16 - 1) {
                            eVar6.j(eVar6.f74107N, this.f74220g, this.f74224k);
                        }
                        if (eVar5 != null) {
                            int i26 = gVar.f74202V0;
                            d dVar4 = eVar5.f74107N;
                            dVar3.a(dVar4, i26);
                            if (i24 == i18) {
                                int i27 = this.f74222i;
                                if (dVar3.l()) {
                                    dVar3.f74092h = i27;
                                }
                            }
                            dVar4.a(dVar3, 0);
                            if (i24 == i19 + 1) {
                                int i28 = this.f74224k;
                                if (dVar4.l()) {
                                    dVar4.f74092h = i28;
                                }
                            }
                        }
                        if (eVar6 != eVar4) {
                            d dVar5 = eVar6.f74106M;
                            d dVar6 = eVar6.f74104K;
                            if (z11) {
                                int i29 = gVar.f74203W0;
                                if (i29 == 0) {
                                    dVar5.a(dVar2, 0);
                                } else if (i29 == 1) {
                                    dVar6.a(dVar, 0);
                                } else if (i29 == 2) {
                                    dVar6.a(dVar, 0);
                                    dVar5.a(dVar2, 0);
                                }
                            } else {
                                int i31 = gVar.f74203W0;
                                if (i31 == 0) {
                                    dVar6.a(dVar, 0);
                                } else if (i31 == 1) {
                                    dVar5.a(dVar2, 0);
                                } else if (i31 == 2) {
                                    if (z13) {
                                        dVar6.a(this.f74217d, this.f74221h);
                                        dVar5.a(this.f74219f, this.f74223j);
                                    } else {
                                        dVar6.a(dVar, 0);
                                        dVar5.a(dVar2, 0);
                                    }
                                }
                                eVar5 = eVar6;
                            }
                        }
                        eVar5 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f74215b;
            eVar7.f74147n0 = gVar.f74190J0;
            int i32 = this.f74222i;
            if (i11 > 0) {
                i32 += gVar.f74202V0;
            }
            d dVar7 = this.f74218e;
            d dVar8 = eVar7.f74105L;
            dVar8.a(dVar7, i32);
            d dVar9 = eVar7.f74107N;
            if (z12) {
                dVar9.a(this.f74220g, this.f74224k);
            }
            if (i11 > 0) {
                this.f74218e.f74088d.f74107N.a(dVar8, 0);
            }
            if (gVar.f74204X0 == 3 && !eVar7.Q()) {
                for (int i33 = 0; i33 < i16; i33++) {
                    int i34 = z11 ? (i16 - 1) - i33 : i33;
                    i13 = 1;
                    if (this.f74227n + i34 >= gVar.f74213g1) {
                        break;
                    }
                    eVar = gVar.f74212f1[this.f74227n + i34];
                    if (eVar.Q()) {
                        break;
                    }
                }
            }
            i13 = 1;
            eVar = eVar7;
            int i35 = 0;
            e eVar8 = null;
            while (i35 < i16) {
                int i36 = z11 ? (i16 - 1) - i35 : i35;
                if (this.f74227n + i36 >= gVar.f74213g1) {
                    return;
                }
                e eVar9 = gVar.f74212f1[this.f74227n + i36];
                if (eVar9 == null) {
                    gVar2 = gVar;
                    c11 = 3;
                } else {
                    d dVar10 = eVar9.f74104K;
                    if (i35 == 0) {
                        gVar2 = gVar;
                        eVar9.j(dVar10, this.f74217d, this.f74221h);
                    } else {
                        gVar2 = gVar;
                    }
                    if (i36 == 0) {
                        int i37 = gVar2.f74189I0;
                        float f12 = gVar2.f74195O0;
                        if (z11) {
                            f12 = 1.0f - f12;
                        }
                        if (this.f74227n == 0) {
                            i14 = i37;
                            if (gVar2.f74191K0 != -1) {
                                i15 = gVar2.f74191K0;
                                f7 = gVar2.f74197Q0;
                            }
                        } else {
                            i14 = i37;
                        }
                        if (!z12 || gVar2.f74193M0 == -1) {
                            i15 = i14;
                            eVar9.f74145m0 = i15;
                            eVar9.f74133g0 = f12;
                        } else {
                            i15 = gVar2.f74193M0;
                            f7 = gVar2.f74199S0;
                        }
                    }
                    if (i35 == i16 - 1) {
                        eVar9.j(eVar9.f74106M, this.f74219f, this.f74223j);
                    }
                    if (eVar8 != null) {
                        int i38 = gVar2.f74201U0;
                        d dVar11 = eVar8.f74106M;
                        dVar10.a(dVar11, i38);
                        if (i35 == i18) {
                            int i39 = this.f74221h;
                            if (dVar10.l()) {
                                dVar10.f74092h = i39;
                            }
                        }
                        dVar11.a(dVar10, 0);
                        if (i35 == i19 + 1) {
                            int i41 = this.f74223j;
                            if (dVar11.l()) {
                                dVar11.f74092h = i41;
                            }
                        }
                    }
                    if (eVar9 != eVar7) {
                        c11 = 3;
                        if (gVar2.f74204X0 == 3 && eVar.Q() && eVar9 != eVar && eVar9.Q()) {
                            eVar9.f74108O.a(eVar.f74108O, 0);
                        } else {
                            int i42 = gVar2.f74204X0;
                            d dVar12 = eVar9.f74105L;
                            if (i42 != 0) {
                                d dVar13 = eVar9.f74107N;
                                if (i42 == i13) {
                                    dVar13.a(dVar9, 0);
                                } else if (z13) {
                                    dVar12.a(this.f74218e, this.f74222i);
                                    dVar13.a(this.f74220g, this.f74224k);
                                } else {
                                    dVar12.a(dVar8, 0);
                                    dVar13.a(dVar9, 0);
                                }
                            } else {
                                dVar12.a(dVar8, 0);
                            }
                        }
                    } else {
                        c11 = 3;
                    }
                    eVar8 = eVar9;
                }
                i35++;
                gVar = gVar2;
                i13 = 1;
            }
        }

        public final int e() {
            return this.f74214a == 1 ? this.f74226m - g.this.f74202V0 : this.f74226m;
        }

        public final int f() {
            return this.f74214a == 0 ? this.f74225l - g.this.f74201U0 : this.f74225l;
        }

        public final void g(int i11) {
            g gVar;
            int i12 = this.f74229p;
            if (i12 == 0) {
                return;
            }
            int i13 = this.f74228o;
            int i14 = i11 / i12;
            int i15 = 0;
            while (true) {
                gVar = g.this;
                if (i15 >= i13 || this.f74227n + i15 >= gVar.f74213g1) {
                    break;
                }
                e eVar = gVar.f74212f1[this.f74227n + i15];
                if (this.f74214a == 0) {
                    if (eVar != null) {
                        e.b[] bVarArr = eVar.f74115V;
                        if (bVarArr[0] == e.b.MATCH_CONSTRAINT && eVar.f74156s == 0) {
                            g.this.i1(eVar, e.b.FIXED, i14, bVarArr[1], eVar.v());
                        }
                    }
                } else if (eVar != null) {
                    e.b[] bVarArr2 = eVar.f74115V;
                    if (bVarArr2[1] == e.b.MATCH_CONSTRAINT && eVar.f74158t == 0) {
                        int i16 = i14;
                        g.this.i1(eVar, bVarArr2[0], eVar.N(), e.b.FIXED, i16);
                        i14 = i16;
                    }
                }
                i15++;
            }
            this.f74225l = 0;
            this.f74226m = 0;
            this.f74215b = null;
            this.f74216c = 0;
            int i17 = this.f74228o;
            for (int i18 = 0; i18 < i17 && this.f74227n + i18 < gVar.f74213g1; i18++) {
                e eVar2 = gVar.f74212f1[this.f74227n + i18];
                if (this.f74214a == 0) {
                    int N11 = eVar2.N();
                    int i19 = gVar.f74201U0;
                    if (eVar2.M() == 8) {
                        i19 = 0;
                    }
                    this.f74225l = N11 + i19 + this.f74225l;
                    int N12 = gVar.N1(eVar2, this.f74230q);
                    if (this.f74215b == null || this.f74216c < N12) {
                        this.f74215b = eVar2;
                        this.f74216c = N12;
                        this.f74226m = N12;
                    }
                } else {
                    int O12 = gVar.O1(eVar2, this.f74230q);
                    int N13 = gVar.N1(eVar2, this.f74230q);
                    int i21 = gVar.f74202V0;
                    if (eVar2.M() == 8) {
                        i21 = 0;
                    }
                    this.f74226m = N13 + i21 + this.f74226m;
                    if (this.f74215b == null || this.f74216c < O12) {
                        this.f74215b = eVar2;
                        this.f74216c = O12;
                        this.f74225l = O12;
                    }
                }
            }
        }

        public final void h(int i11) {
            this.f74227n = i11;
        }

        public final void i(int i11, d dVar, d dVar2, d dVar3, d dVar4, int i12, int i13, int i14, int i15, int i16) {
            this.f74214a = i11;
            this.f74217d = dVar;
            this.f74218e = dVar2;
            this.f74219f = dVar3;
            this.f74220g = dVar4;
            this.f74221h = i12;
            this.f74222i = i13;
            this.f74223j = i14;
            this.f74224k = i15;
            this.f74230q = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N1(e eVar, int i11) {
        e eVar2;
        if (eVar != null) {
            if (eVar.f74115V[1] == e.b.MATCH_CONSTRAINT) {
                int i12 = eVar.f74158t;
                if (i12 != 0) {
                    if (i12 == 2) {
                        int i13 = (int) (eVar.f74094A * i11);
                        if (i13 != eVar.v()) {
                            eVar.K0(true);
                            i1(eVar, eVar.f74115V[0], eVar.N(), e.b.FIXED, i13);
                        }
                        return i13;
                    }
                    eVar2 = eVar;
                    if (i12 == 1) {
                        return eVar2.v();
                    }
                    if (i12 == 3) {
                        return (int) ((eVar2.N() * eVar2.f74119Z) + 0.5f);
                    }
                }
            } else {
                eVar2 = eVar;
            }
            return eVar2.v();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int O1(e eVar, int i11) {
        e eVar2;
        if (eVar != null) {
            if (eVar.f74115V[0] == e.b.MATCH_CONSTRAINT) {
                int i12 = eVar.f74156s;
                if (i12 != 0) {
                    if (i12 == 2) {
                        int i13 = (int) (eVar.f74164x * i11);
                        if (i13 != eVar.N()) {
                            eVar.K0(true);
                            i1(eVar, e.b.FIXED, i13, eVar.f74115V[1], eVar.v());
                        }
                        return i13;
                    }
                    eVar2 = eVar;
                    if (i12 == 1) {
                        return eVar2.N();
                    }
                    if (i12 == 3) {
                        return (int) ((eVar2.v() * eVar2.f74119Z) + 0.5f);
                    }
                }
            } else {
                eVar2 = eVar;
            }
            return eVar2.N();
        }
        return 0;
    }

    public final void P1(float f7) {
        this.f74197Q0 = f7;
    }

    public final void Q1(int i11) {
        this.f74191K0 = i11;
    }

    public final void R1(float f7) {
        this.f74198R0 = f7;
    }

    public final void S1(int i11) {
        this.f74192L0 = i11;
    }

    public final void T1(int i11) {
        this.f74203W0 = i11;
    }

    public final void U1(float f7) {
        this.f74195O0 = f7;
    }

    public final void V1(int i11) {
        this.f74201U0 = i11;
    }

    public final void W1(int i11) {
        this.f74189I0 = i11;
    }

    public final void X1(float f7) {
        this.f74199S0 = f7;
    }

    public final void Y1(int i11) {
        this.f74193M0 = i11;
    }

    public final void Z1(float f7) {
        this.f74200T0 = f7;
    }

    public final void a2(int i11) {
        this.f74194N0 = i11;
    }

    public final void b2(int i11) {
        this.f74206Z0 = i11;
    }

    public final void c2(int i11) {
        this.f74207a1 = i11;
    }

    public final void d2(int i11) {
        this.f74204X0 = i11;
    }

    public final void e2(float f7) {
        this.f74196P0 = f7;
    }

    @Override // m2.e
    public final void f(C6404d c6404d, boolean z11) {
        e eVar;
        float f7;
        int i11;
        super.f(c6404d, z11);
        e eVar2 = this.f74116W;
        boolean z12 = eVar2 != null && ((f) eVar2).l1();
        int i12 = this.f74205Y0;
        ArrayList<a> arrayList = this.f74208b1;
        if (i12 != 0) {
            if (i12 == 1) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    arrayList.get(i13).d(i13, z12, i13 == size + (-1));
                    i13++;
                }
            } else if (i12 != 2) {
                if (i12 == 3) {
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        arrayList.get(i14).d(i14, z12, i14 == size2 + (-1));
                        i14++;
                    }
                }
            } else if (this.f74211e1 != null && this.f74210d1 != null && this.f74209c1 != null) {
                for (int i15 = 0; i15 < this.f74213g1; i15++) {
                    this.f74212f1[i15].j0();
                }
                int[] iArr = this.f74211e1;
                int i16 = iArr[0];
                int i17 = iArr[1];
                float f11 = this.f74195O0;
                e eVar3 = null;
                int i18 = 0;
                while (i18 < i16) {
                    if (z12) {
                        i11 = (i16 - i18) - 1;
                        f7 = 1.0f - this.f74195O0;
                    } else {
                        f7 = f11;
                        i11 = i18;
                    }
                    e eVar4 = this.f74210d1[i11];
                    if (eVar4 != null && eVar4.M() != 8) {
                        d dVar = eVar4.f74104K;
                        if (i18 == 0) {
                            eVar4.j(dVar, this.f74104K, e1());
                            eVar4.f74145m0 = this.f74189I0;
                            eVar4.f74133g0 = f7;
                        }
                        if (i18 == i16 - 1) {
                            eVar4.j(eVar4.f74106M, this.f74106M, f1());
                        }
                        if (i18 > 0 && eVar3 != null) {
                            int i19 = this.f74201U0;
                            d dVar2 = eVar3.f74106M;
                            eVar4.j(dVar, dVar2, i19);
                            eVar3.j(dVar2, dVar, 0);
                        }
                        eVar3 = eVar4;
                    }
                    i18++;
                    f11 = f7;
                }
                for (int i21 = 0; i21 < i17; i21++) {
                    e eVar5 = this.f74209c1[i21];
                    if (eVar5 != null && eVar5.M() != 8) {
                        d dVar3 = eVar5.f74105L;
                        if (i21 == 0) {
                            eVar5.j(dVar3, this.f74105L, g1());
                            eVar5.f74147n0 = this.f74190J0;
                            eVar5.f74135h0 = this.f74196P0;
                        }
                        if (i21 == i17 - 1) {
                            eVar5.j(eVar5.f74107N, this.f74107N, d1());
                        }
                        if (i21 > 0 && eVar3 != null) {
                            int i22 = this.f74202V0;
                            d dVar4 = eVar3.f74107N;
                            eVar5.j(dVar3, dVar4, i22);
                            eVar3.j(dVar4, dVar3, 0);
                        }
                        eVar3 = eVar5;
                    }
                }
                for (int i23 = 0; i23 < i16; i23++) {
                    for (int i24 = 0; i24 < i17; i24++) {
                        int i25 = (i24 * i16) + i23;
                        if (this.f74207a1 == 1) {
                            i25 = (i23 * i17) + i24;
                        }
                        e[] eVarArr = this.f74212f1;
                        if (i25 < eVarArr.length && (eVar = eVarArr[i25]) != null && eVar.M() != 8) {
                            e eVar6 = this.f74210d1[i23];
                            e eVar7 = this.f74209c1[i24];
                            if (eVar != eVar6) {
                                eVar.j(eVar.f74104K, eVar6.f74104K, 0);
                                eVar.j(eVar.f74106M, eVar6.f74106M, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.j(eVar.f74105L, eVar7.f74105L, 0);
                                eVar.j(eVar.f74107N, eVar7.f74107N, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).d(0, z12, true);
        }
        k1(false);
    }

    public final void f2(int i11) {
        this.f74202V0 = i11;
    }

    public final void g2(int i11) {
        this.f74190J0 = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    @Override // m2.m
    public final void h1(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        a aVar;
        ?? r32;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        Object obj;
        e eVar;
        int i25;
        int i26;
        int i27;
        int i28;
        if (this.f74240w0 > 0) {
            e eVar2 = this.f74116W;
            C8420b.InterfaceC1286b interfaceC1286b = eVar2 != null ? ((f) eVar2).f74188z0 : null;
            if (interfaceC1286b == null) {
                l1(0, 0);
                k1(false);
                return;
            }
            for (int i29 = 0; i29 < this.f74240w0; i29++) {
                e eVar3 = this.f74239v0[i29];
                if (eVar3 != null && !(eVar3 instanceof h)) {
                    e.b t2 = eVar3.t(0);
                    e.b t11 = eVar3.t(1);
                    e.b bVar = e.b.MATCH_CONSTRAINT;
                    if (t2 != bVar || eVar3.f74156s == 1 || t11 != bVar || eVar3.f74158t == 1) {
                        if (t2 == bVar) {
                            t2 = e.b.WRAP_CONTENT;
                        }
                        if (t11 == bVar) {
                            t11 = e.b.WRAP_CONTENT;
                        }
                        C8420b.a aVar2 = this.f74248G0;
                        aVar2.f76296a = t2;
                        aVar2.f76297b = t11;
                        aVar2.f76298c = eVar3.N();
                        aVar2.f76299d = eVar3.v();
                        interfaceC1286b.b(eVar3, aVar2);
                        eVar3.T0(aVar2.f76300e);
                        eVar3.z0(aVar2.f76301f);
                        eVar3.p0(aVar2.f76302g);
                    }
                }
            }
        }
        int e12 = e1();
        int f12 = f1();
        int g12 = g1();
        int d12 = d1();
        int[] iArr2 = new int[2];
        int i31 = (i12 - e12) - f12;
        int i32 = this.f74207a1;
        if (i32 == 1) {
            i31 = (i14 - g12) - d12;
        }
        int i33 = i31;
        if (i32 == 0) {
            if (this.f74189I0 == -1) {
                this.f74189I0 = 0;
            }
            if (this.f74190J0 == -1) {
                this.f74190J0 = 0;
            }
        } else {
            if (this.f74189I0 == -1) {
                this.f74189I0 = 0;
            }
            if (this.f74190J0 == -1) {
                this.f74190J0 = 0;
            }
        }
        e[] eVarArr = this.f74239v0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            i15 = this.f74240w0;
            if (i34 >= i15) {
                break;
            }
            if (this.f74239v0[i34].M() == 8) {
                i35++;
            }
            i34++;
        }
        if (i35 > 0) {
            eVarArr = new e[i15 - i35];
            int i37 = 0;
            for (int i38 = 0; i38 < this.f74240w0; i38++) {
                e eVar4 = this.f74239v0[i38];
                if (eVar4.M() != 8) {
                    eVarArr[i37] = eVar4;
                    i37++;
                }
            }
            i16 = i37;
        } else {
            i16 = i15;
        }
        e[] eVarArr2 = eVarArr;
        this.f74212f1 = eVarArr2;
        this.f74213g1 = i16;
        int i39 = this.f74205Y0;
        ArrayList<a> arrayList = this.f74208b1;
        if (i39 != 0) {
            d dVar = this.f74105L;
            d dVar2 = this.f74104K;
            i17 = e12;
            d dVar3 = this.f74106M;
            d dVar4 = this.f74107N;
            if (i39 != 1) {
                boolean z11 = true;
                if (i39 != 2) {
                    if (i39 == 3) {
                        int i41 = this.f74207a1;
                        if (i16 != 0) {
                            arrayList.clear();
                            int i42 = i16;
                            iArr = iArr2;
                            a aVar3 = new a(i41, this.f74104K, this.f74105L, this.f74106M, this.f74107N, i33);
                            arrayList.add(aVar3);
                            if (i41 == 0) {
                                int i43 = 0;
                                int i44 = 0;
                                i25 = 0;
                                int i45 = 0;
                                while (i43 < i42) {
                                    i44++;
                                    int i46 = f12;
                                    e eVar5 = eVarArr2[i43];
                                    int O12 = O1(eVar5, i33);
                                    a aVar4 = aVar3;
                                    int i47 = i41;
                                    if (eVar5.f74115V[0] == e.b.MATCH_CONSTRAINT) {
                                        i25++;
                                    }
                                    int i48 = i25;
                                    boolean z12 = (i45 == i33 || (this.f74201U0 + i45) + O12 > i33) && aVar4.f74215b != null;
                                    if (!z12 && i43 > 0 && (i28 = this.f74206Z0) > 0 && i44 > i28) {
                                        z12 = true;
                                    }
                                    if (z12) {
                                        i27 = i43;
                                        i41 = i47;
                                        aVar3 = new a(i41, this.f74104K, this.f74105L, this.f74106M, this.f74107N, i33);
                                        aVar3.h(i27);
                                        arrayList.add(aVar3);
                                        i45 = O12;
                                        i44 = 1;
                                    } else {
                                        i27 = i43;
                                        i41 = i47;
                                        i45 = i27 > 0 ? this.f74201U0 + O12 + i45 : O12;
                                        aVar3 = aVar4;
                                    }
                                    aVar3.b(eVar5);
                                    i43 = i27 + 1;
                                    i25 = i48;
                                    f12 = i46;
                                }
                                i18 = f12;
                            } else {
                                i18 = f12;
                                int i49 = 0;
                                int i51 = 0;
                                int i52 = 0;
                                int i53 = 0;
                                while (i53 < i42) {
                                    i49++;
                                    e eVar6 = eVarArr2[i53];
                                    int N12 = N1(eVar6, i33);
                                    a aVar5 = aVar3;
                                    if (eVar6.f74115V[1] == e.b.MATCH_CONSTRAINT) {
                                        i51++;
                                    }
                                    int i54 = i51;
                                    boolean z13 = (i52 == i33 || (this.f74202V0 + i52) + N12 > i33) && aVar5.f74215b != null;
                                    if (!z13 && i53 > 0 && (i26 = this.f74206Z0) > 0 && i49 > i26) {
                                        z13 = true;
                                    }
                                    if (z13) {
                                        aVar3 = new a(i41, this.f74104K, this.f74105L, this.f74106M, this.f74107N, i33);
                                        aVar3.h(i53);
                                        arrayList.add(aVar3);
                                        i52 = N12;
                                        i49 = 1;
                                    } else {
                                        i52 = i53 > 0 ? this.f74202V0 + N12 + i52 : N12;
                                        aVar3 = aVar5;
                                    }
                                    aVar3.b(eVar6);
                                    i53++;
                                    i51 = i54;
                                }
                                i25 = i51;
                            }
                            int size = arrayList.size();
                            int e13 = e1();
                            int g13 = g1();
                            int f13 = f1();
                            int d13 = d1();
                            e.b[] bVarArr = this.f74115V;
                            e.b bVar2 = bVarArr[0];
                            e.b bVar3 = e.b.WRAP_CONTENT;
                            boolean z14 = bVar2 == bVar3 || bVarArr[1] == bVar3;
                            if (i25 > 0 && z14) {
                                for (int i55 = 0; i55 < size; i55++) {
                                    a aVar6 = arrayList.get(i55);
                                    if (i41 == 0) {
                                        aVar6.g(i33 - aVar6.f());
                                    } else {
                                        aVar6.g(i33 - aVar6.e());
                                    }
                                }
                            }
                            d dVar5 = dVar;
                            d dVar6 = dVar2;
                            int i56 = e13;
                            int i57 = g13;
                            int i58 = f13;
                            int i59 = d13;
                            int i61 = 0;
                            int i62 = 0;
                            d dVar7 = dVar3;
                            d dVar8 = dVar4;
                            for (int i63 = 0; i63 < size; i63++) {
                                a aVar7 = arrayList.get(i63);
                                if (i41 == 0) {
                                    if (i63 < size - 1) {
                                        dVar8 = arrayList.get(i63 + 1).f74215b.f74105L;
                                        i59 = 0;
                                    } else {
                                        i59 = d1();
                                        dVar8 = dVar4;
                                    }
                                    d dVar9 = aVar7.f74215b.f74107N;
                                    aVar7.i(i41, dVar6, dVar5, dVar7, dVar8, i56, i57, i58, i59, i33);
                                    i61 = Math.max(i61, aVar7.f());
                                    i62 += aVar7.e();
                                    if (i63 > 0) {
                                        i62 += this.f74202V0;
                                    }
                                    dVar5 = dVar9;
                                    i57 = 0;
                                } else {
                                    if (i63 < size - 1) {
                                        dVar7 = arrayList.get(i63 + 1).f74215b.f74104K;
                                        i58 = 0;
                                    } else {
                                        i58 = f1();
                                        dVar7 = dVar3;
                                    }
                                    d dVar10 = aVar7.f74215b.f74106M;
                                    aVar7.i(i41, dVar6, dVar5, dVar7, dVar8, i56, i57, i58, i59, i33);
                                    i61 += aVar7.f();
                                    i62 = Math.max(i62, aVar7.e());
                                    if (i63 > 0) {
                                        i61 += this.f74201U0;
                                    }
                                    dVar6 = dVar10;
                                    i56 = 0;
                                }
                            }
                            iArr[0] = i61;
                            iArr[1] = i62;
                            r32 = z11;
                        }
                    }
                    iArr = iArr2;
                    i18 = f12;
                    r32 = z11;
                } else {
                    int i64 = i16;
                    iArr = iArr2;
                    i18 = f12;
                    int i65 = this.f74207a1;
                    if (i65 == 0) {
                        int i66 = this.f74206Z0;
                        if (i66 <= 0) {
                            int i67 = 0;
                            i24 = 0;
                            for (int i68 = 0; i68 < i64; i68++) {
                                if (i68 > 0) {
                                    i67 += this.f74201U0;
                                }
                                e eVar7 = eVarArr2[i68];
                                if (eVar7 != null) {
                                    i67 += O1(eVar7, i33);
                                    if (i67 > i33) {
                                        break;
                                    } else {
                                        i24++;
                                    }
                                }
                            }
                        } else {
                            i24 = i66;
                        }
                        i23 = 0;
                    } else {
                        i23 = this.f74206Z0;
                        if (i23 <= 0) {
                            int i69 = 0;
                            int i71 = 0;
                            for (int i72 = 0; i72 < i64; i72++) {
                                if (i72 > 0) {
                                    i69 += this.f74202V0;
                                }
                                e eVar8 = eVarArr2[i72];
                                if (eVar8 != null) {
                                    i69 += N1(eVar8, i33);
                                    if (i69 > i33) {
                                        break;
                                    } else {
                                        i71++;
                                    }
                                }
                            }
                            i23 = i71;
                        }
                        i24 = 0;
                    }
                    if (this.f74211e1 == null) {
                        this.f74211e1 = new int[2];
                    }
                    boolean z15 = (i23 == 0 && i65 == 1) || (i24 == 0 && i65 == 0);
                    while (!z15) {
                        if (i65 == 0) {
                            i23 = (int) Math.ceil(i64 / i24);
                        } else {
                            i24 = (int) Math.ceil(i64 / i23);
                        }
                        e[] eVarArr3 = this.f74210d1;
                        if (eVarArr3 == null || eVarArr3.length < i24) {
                            obj = null;
                            this.f74210d1 = new e[i24];
                        } else {
                            obj = null;
                            Arrays.fill(eVarArr3, (Object) null);
                        }
                        e[] eVarArr4 = this.f74209c1;
                        if (eVarArr4 == null || eVarArr4.length < i23) {
                            this.f74209c1 = new e[i23];
                        } else {
                            Arrays.fill(eVarArr4, obj);
                        }
                        for (int i73 = 0; i73 < i24; i73++) {
                            for (int i74 = 0; i74 < i23; i74++) {
                                int i75 = (i74 * i24) + i73;
                                if (i65 == 1) {
                                    i75 = (i73 * i23) + i74;
                                }
                                if (i75 < eVarArr2.length && (eVar = eVarArr2[i75]) != null) {
                                    int O13 = O1(eVar, i33);
                                    e eVar9 = this.f74210d1[i73];
                                    if (eVar9 == null || eVar9.N() < O13) {
                                        this.f74210d1[i73] = eVar;
                                    }
                                    int N13 = N1(eVar, i33);
                                    e eVar10 = this.f74209c1[i74];
                                    if (eVar10 == null || eVar10.v() < N13) {
                                        this.f74209c1[i74] = eVar;
                                    }
                                }
                            }
                        }
                        int i76 = 0;
                        for (int i77 = 0; i77 < i24; i77++) {
                            e eVar11 = this.f74210d1[i77];
                            if (eVar11 != null) {
                                if (i77 > 0) {
                                    i76 += this.f74201U0;
                                }
                                i76 += O1(eVar11, i33);
                            }
                        }
                        int i78 = 0;
                        for (int i79 = 0; i79 < i23; i79++) {
                            e eVar12 = this.f74209c1[i79];
                            if (eVar12 != null) {
                                if (i79 > 0) {
                                    i78 += this.f74202V0;
                                }
                                i78 += N1(eVar12, i33);
                            }
                        }
                        iArr[0] = i76;
                        iArr[1] = i78;
                        if (i65 == 0) {
                            if (i76 > i33 && i24 > 1) {
                                i24--;
                            }
                            z15 = true;
                        } else {
                            if (i78 > i33 && i23 > 1) {
                                i23--;
                            }
                            z15 = true;
                        }
                    }
                    int[] iArr3 = this.f74211e1;
                    iArr3[0] = i24;
                    iArr3[1] = i23;
                }
            } else {
                int i81 = i16;
                iArr = iArr2;
                i18 = f12;
                int i82 = this.f74207a1;
                if (i81 != 0) {
                    arrayList.clear();
                    a aVar8 = new a(i82, this.f74104K, this.f74105L, this.f74106M, this.f74107N, i33);
                    arrayList.add(aVar8);
                    if (i82 == 0) {
                        i19 = 0;
                        int i83 = 0;
                        int i84 = 0;
                        while (i84 < i81) {
                            e eVar13 = eVarArr2[i84];
                            int O14 = O1(eVar13, i33);
                            if (eVar13.f74115V[0] == e.b.MATCH_CONSTRAINT) {
                                i19++;
                            }
                            int i85 = i19;
                            boolean z16 = (i83 == i33 || (this.f74201U0 + i83) + O14 > i33) && aVar8.f74215b != null;
                            if (!z16 && i84 > 0 && (i22 = this.f74206Z0) > 0 && i84 % i22 == 0) {
                                z16 = true;
                            }
                            if (z16) {
                                aVar8 = new a(i82, this.f74104K, this.f74105L, this.f74106M, this.f74107N, i33);
                                aVar8.h(i84);
                                arrayList.add(aVar8);
                            } else if (i84 > 0) {
                                i83 = this.f74201U0 + O14 + i83;
                                aVar8.b(eVar13);
                                i84++;
                                i19 = i85;
                            }
                            i83 = O14;
                            aVar8.b(eVar13);
                            i84++;
                            i19 = i85;
                        }
                    } else {
                        i19 = 0;
                        int i86 = 0;
                        int i87 = 0;
                        while (i87 < i81) {
                            e eVar14 = eVarArr2[i87];
                            int N14 = N1(eVar14, i33);
                            if (eVar14.f74115V[1] == e.b.MATCH_CONSTRAINT) {
                                i19++;
                            }
                            int i88 = i19;
                            boolean z17 = (i86 == i33 || (this.f74202V0 + i86) + N14 > i33) && aVar8.f74215b != null;
                            if (!z17 && i87 > 0 && (i21 = this.f74206Z0) > 0 && i87 % i21 == 0) {
                                z17 = true;
                            }
                            if (z17) {
                                aVar8 = new a(i82, this.f74104K, this.f74105L, this.f74106M, this.f74107N, i33);
                                aVar8.h(i87);
                                arrayList.add(aVar8);
                            } else if (i87 > 0) {
                                i86 = this.f74202V0 + N14 + i86;
                                aVar8.b(eVar14);
                                i87++;
                                i19 = i88;
                            }
                            i86 = N14;
                            aVar8.b(eVar14);
                            i87++;
                            i19 = i88;
                        }
                    }
                    int size2 = arrayList.size();
                    int e14 = e1();
                    int g14 = g1();
                    int f14 = f1();
                    int d14 = d1();
                    e.b[] bVarArr2 = this.f74115V;
                    e.b bVar4 = bVarArr2[0];
                    e.b bVar5 = e.b.WRAP_CONTENT;
                    boolean z18 = bVar4 == bVar5 || bVarArr2[1] == bVar5;
                    if (i19 > 0 && z18) {
                        for (int i89 = 0; i89 < size2; i89++) {
                            a aVar9 = arrayList.get(i89);
                            if (i82 == 0) {
                                aVar9.g(i33 - aVar9.f());
                            } else {
                                aVar9.g(i33 - aVar9.e());
                            }
                        }
                    }
                    d dVar11 = dVar;
                    d dVar12 = dVar2;
                    int i91 = e14;
                    int i92 = g14;
                    int i93 = f14;
                    int i94 = d14;
                    int i95 = 0;
                    int i96 = 0;
                    d dVar13 = dVar3;
                    d dVar14 = dVar4;
                    for (int i97 = 0; i97 < size2; i97++) {
                        a aVar10 = arrayList.get(i97);
                        if (i82 == 0) {
                            if (i97 < size2 - 1) {
                                dVar14 = arrayList.get(i97 + 1).f74215b.f74105L;
                                i94 = 0;
                            } else {
                                i94 = d1();
                                dVar14 = dVar4;
                            }
                            d dVar15 = aVar10.f74215b.f74107N;
                            aVar10.i(i82, dVar12, dVar11, dVar13, dVar14, i91, i92, i93, i94, i33);
                            i95 = Math.max(i95, aVar10.f());
                            i96 += aVar10.e();
                            if (i97 > 0) {
                                i96 += this.f74202V0;
                            }
                            dVar11 = dVar15;
                            i92 = 0;
                        } else {
                            if (i97 < size2 - 1) {
                                dVar13 = arrayList.get(i97 + 1).f74215b.f74104K;
                                i93 = 0;
                            } else {
                                i93 = f1();
                                dVar13 = dVar3;
                            }
                            d dVar16 = aVar10.f74215b.f74106M;
                            aVar10.i(i82, dVar12, dVar11, dVar13, dVar14, i91, i92, i93, i94, i33);
                            i95 += aVar10.f();
                            i96 = Math.max(i96, aVar10.e());
                            if (i97 > 0) {
                                i95 += this.f74201U0;
                            }
                            dVar12 = dVar16;
                            i91 = 0;
                        }
                    }
                    iArr[0] = i95;
                    iArr[1] = i96;
                }
            }
            r32 = 1;
        } else {
            int i98 = i16;
            iArr = iArr2;
            i17 = e12;
            i18 = f12;
            int i99 = this.f74207a1;
            if (i98 != 0) {
                if (arrayList.size() == 0) {
                    aVar = new a(i99, this.f74104K, this.f74105L, this.f74106M, this.f74107N, i33);
                    arrayList.add(aVar);
                } else {
                    a aVar11 = arrayList.get(0);
                    aVar11.c();
                    aVar11.i(i99, this.f74104K, this.f74105L, this.f74106M, this.f74107N, e1(), g1(), f1(), d1(), i33);
                    aVar = aVar11;
                }
                for (int i100 = 0; i100 < i98; i100++) {
                    aVar.b(eVarArr2[i100]);
                }
                i36 = 0;
                iArr[0] = aVar.f();
                r32 = 1;
                iArr[1] = aVar.e();
            }
            r32 = 1;
        }
        int i101 = iArr[i36] + i17 + i18;
        int i102 = iArr[r32] + g12 + d12;
        if (i11 == 1073741824) {
            i101 = i12;
        } else if (i11 == Integer.MIN_VALUE) {
            i101 = Math.min(i101, i12);
        } else if (i11 != 0) {
            i101 = i36;
        }
        if (i13 == 1073741824) {
            i102 = i14;
        } else if (i13 == Integer.MIN_VALUE) {
            i102 = Math.min(i102, i14);
        } else if (i13 != 0) {
            i102 = i36;
        }
        l1(i101, i102);
        T0(i101);
        z0(i102);
        k1(this.f74240w0 > 0 ? r32 : i36);
    }

    public final void h2(int i11) {
        this.f74205Y0 = i11;
    }

    @Override // m2.j, m2.e
    public final void k(e eVar, HashMap<e, e> hashMap) {
        super.k(eVar, hashMap);
        g gVar = (g) eVar;
        this.f74189I0 = gVar.f74189I0;
        this.f74190J0 = gVar.f74190J0;
        this.f74191K0 = gVar.f74191K0;
        this.f74192L0 = gVar.f74192L0;
        this.f74193M0 = gVar.f74193M0;
        this.f74194N0 = gVar.f74194N0;
        this.f74195O0 = gVar.f74195O0;
        this.f74196P0 = gVar.f74196P0;
        this.f74197Q0 = gVar.f74197Q0;
        this.f74198R0 = gVar.f74198R0;
        this.f74199S0 = gVar.f74199S0;
        this.f74200T0 = gVar.f74200T0;
        this.f74201U0 = gVar.f74201U0;
        this.f74202V0 = gVar.f74202V0;
        this.f74203W0 = gVar.f74203W0;
        this.f74204X0 = gVar.f74204X0;
        this.f74205Y0 = gVar.f74205Y0;
        this.f74206Z0 = gVar.f74206Z0;
        this.f74207a1 = gVar.f74207a1;
    }
}
