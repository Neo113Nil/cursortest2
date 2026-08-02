package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class g extends l {
    private e[] mDisplayedWidgets;

    /* renamed from: P0, reason: collision with root package name */
    public int f18031P0 = -1;

    /* renamed from: Q0, reason: collision with root package name */
    public int f18032Q0 = -1;

    /* renamed from: R0, reason: collision with root package name */
    public int f18033R0 = -1;

    /* renamed from: S0, reason: collision with root package name */
    public int f18034S0 = -1;

    /* renamed from: T0, reason: collision with root package name */
    public int f18035T0 = -1;

    /* renamed from: U0, reason: collision with root package name */
    public int f18036U0 = -1;

    /* renamed from: V0, reason: collision with root package name */
    public float f18037V0 = 0.5f;

    /* renamed from: W0, reason: collision with root package name */
    public float f18038W0 = 0.5f;

    /* renamed from: X0, reason: collision with root package name */
    public float f18039X0 = 0.5f;

    /* renamed from: Y0, reason: collision with root package name */
    public float f18040Y0 = 0.5f;

    /* renamed from: Z0, reason: collision with root package name */
    public float f18041Z0 = 0.5f;

    /* renamed from: a1, reason: collision with root package name */
    public float f18042a1 = 0.5f;

    /* renamed from: b1, reason: collision with root package name */
    public int f18043b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    public int f18044c1 = 0;

    /* renamed from: d1, reason: collision with root package name */
    public int f18045d1 = 2;

    /* renamed from: e1, reason: collision with root package name */
    public int f18046e1 = 2;

    /* renamed from: f1, reason: collision with root package name */
    public int f18047f1 = 0;

    /* renamed from: g1, reason: collision with root package name */
    public int f18048g1 = -1;

    /* renamed from: h1, reason: collision with root package name */
    public int f18049h1 = 0;

    /* renamed from: i1, reason: collision with root package name */
    public ArrayList f18050i1 = new ArrayList();
    private e[] mAlignedBiggestElementsInRows = null;
    private e[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;

    /* renamed from: j1, reason: collision with root package name */
    public int f18051j1 = 0;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f18052a;

        /* renamed from: d, reason: collision with root package name */
        public d f18055d;

        /* renamed from: e, reason: collision with root package name */
        public d f18056e;

        /* renamed from: f, reason: collision with root package name */
        public d f18057f;

        /* renamed from: g, reason: collision with root package name */
        public d f18058g;

        /* renamed from: h, reason: collision with root package name */
        public int f18059h;

        /* renamed from: i, reason: collision with root package name */
        public int f18060i;

        /* renamed from: j, reason: collision with root package name */
        public int f18061j;

        /* renamed from: k, reason: collision with root package name */
        public int f18062k;

        /* renamed from: q, reason: collision with root package name */
        public int f18068q;

        /* renamed from: b, reason: collision with root package name */
        public e f18053b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f18054c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f18063l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f18064m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f18065n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f18066o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f18067p = 0;

        public a(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11) {
            this.f18059h = 0;
            this.f18060i = 0;
            this.f18061j = 0;
            this.f18062k = 0;
            this.f18068q = 0;
            this.f18052a = i10;
            this.f18055d = dVar;
            this.f18056e = dVar2;
            this.f18057f = dVar3;
            this.f18058g = dVar4;
            this.f18059h = g.this.A1();
            this.f18060i = g.this.C1();
            this.f18061j = g.this.B1();
            this.f18062k = g.this.z1();
            this.f18068q = i11;
        }

        public void b(e eVar) {
            if (this.f18052a == 0) {
                int m22 = g.this.m2(eVar, this.f18068q);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    this.f18067p++;
                    m22 = 0;
                }
                this.f18063l += m22 + (eVar.V() != 8 ? g.this.f18043b1 : 0);
                int l22 = g.this.l2(eVar, this.f18068q);
                if (this.f18053b == null || this.f18054c < l22) {
                    this.f18053b = eVar;
                    this.f18054c = l22;
                    this.f18064m = l22;
                }
            } else {
                int m23 = g.this.m2(eVar, this.f18068q);
                int l23 = g.this.l2(eVar, this.f18068q);
                if (eVar.T() == e.b.MATCH_CONSTRAINT) {
                    this.f18067p++;
                    l23 = 0;
                }
                this.f18064m += l23 + (eVar.V() != 8 ? g.this.f18044c1 : 0);
                if (this.f18053b == null || this.f18054c < m23) {
                    this.f18053b = eVar;
                    this.f18054c = m23;
                    this.f18063l = m23;
                }
            }
            this.f18066o++;
        }

        public void c() {
            this.f18054c = 0;
            this.f18053b = null;
            this.f18063l = 0;
            this.f18064m = 0;
            this.f18065n = 0;
            this.f18066o = 0;
            this.f18067p = 0;
        }

        public void d(boolean z10, int i10, boolean z11) {
            e eVar;
            int i11;
            char c10;
            float f10;
            float f11;
            int i12 = this.f18066o;
            for (int i13 = 0; i13 < i12 && this.f18065n + i13 < g.this.f18051j1; i13++) {
                e eVar2 = g.this.mDisplayedWidgets[this.f18065n + i13];
                if (eVar2 != null) {
                    eVar2.u0();
                }
            }
            if (i12 == 0 || this.f18053b == null) {
                return;
            }
            boolean z12 = z11 && i10 == 0;
            int i14 = -1;
            int i15 = -1;
            for (int i16 = 0; i16 < i12; i16++) {
                int i17 = z10 ? (i12 - 1) - i16 : i16;
                if (this.f18065n + i17 >= g.this.f18051j1) {
                    break;
                }
                e eVar3 = g.this.mDisplayedWidgets[this.f18065n + i17];
                if (eVar3 != null && eVar3.V() == 0) {
                    if (i14 == -1) {
                        i14 = i16;
                    }
                    i15 = i16;
                }
            }
            e eVar4 = null;
            if (this.f18052a != 0) {
                e eVar5 = this.f18053b;
                eVar5.O0(g.this.f18031P0);
                int i18 = this.f18059h;
                if (i10 > 0) {
                    i18 += g.this.f18043b1;
                }
                if (z10) {
                    eVar5.f17933M.a(this.f18057f, i18);
                    if (z11) {
                        eVar5.f17931K.a(this.f18055d, this.f18061j);
                    }
                    if (i10 > 0) {
                        this.f18057f.f17905d.f17931K.a(eVar5.f17933M, 0);
                    }
                } else {
                    eVar5.f17931K.a(this.f18055d, i18);
                    if (z11) {
                        eVar5.f17933M.a(this.f18057f, this.f18061j);
                    }
                    if (i10 > 0) {
                        this.f18055d.f17905d.f17933M.a(eVar5.f17931K, 0);
                    }
                }
                for (int i19 = 0; i19 < i12 && this.f18065n + i19 < g.this.f18051j1; i19++) {
                    e eVar6 = g.this.mDisplayedWidgets[this.f18065n + i19];
                    if (eVar6 != null) {
                        if (i19 == 0) {
                            eVar6.k(eVar6.f17932L, this.f18056e, this.f18060i);
                            int i20 = g.this.f18032Q0;
                            float f12 = g.this.f18038W0;
                            if (this.f18065n == 0 && g.this.f18034S0 != -1) {
                                i20 = g.this.f18034S0;
                                f12 = g.this.f18040Y0;
                            } else if (z11 && g.this.f18036U0 != -1) {
                                i20 = g.this.f18036U0;
                                f12 = g.this.f18042a1;
                            }
                            eVar6.f1(i20);
                            eVar6.e1(f12);
                        }
                        if (i19 == i12 - 1) {
                            eVar6.k(eVar6.f17934N, this.f18058g, this.f18062k);
                        }
                        if (eVar4 != null) {
                            eVar6.f17932L.a(eVar4.f17934N, g.this.f18044c1);
                            if (i19 == i14) {
                                eVar6.f17932L.u(this.f18060i);
                            }
                            eVar4.f17934N.a(eVar6.f17932L, 0);
                            if (i19 == i15 + 1) {
                                eVar4.f17934N.u(this.f18062k);
                            }
                        }
                        if (eVar6 != eVar5) {
                            if (z10) {
                                int i21 = g.this.f18045d1;
                                if (i21 == 0) {
                                    eVar6.f17933M.a(eVar5.f17933M, 0);
                                } else if (i21 == 1) {
                                    eVar6.f17931K.a(eVar5.f17931K, 0);
                                } else if (i21 == 2) {
                                    eVar6.f17931K.a(eVar5.f17931K, 0);
                                    eVar6.f17933M.a(eVar5.f17933M, 0);
                                }
                            } else {
                                int i22 = g.this.f18045d1;
                                if (i22 == 0) {
                                    eVar6.f17931K.a(eVar5.f17931K, 0);
                                } else if (i22 == 1) {
                                    eVar6.f17933M.a(eVar5.f17933M, 0);
                                } else if (i22 == 2) {
                                    if (z12) {
                                        eVar6.f17931K.a(this.f18055d, this.f18059h);
                                        eVar6.f17933M.a(this.f18057f, this.f18061j);
                                    } else {
                                        eVar6.f17931K.a(eVar5.f17931K, 0);
                                        eVar6.f17933M.a(eVar5.f17933M, 0);
                                    }
                                }
                                eVar4 = eVar6;
                            }
                        }
                        eVar4 = eVar6;
                    }
                }
                return;
            }
            e eVar7 = this.f18053b;
            eVar7.f1(g.this.f18032Q0);
            int i23 = this.f18060i;
            if (i10 > 0) {
                i23 += g.this.f18044c1;
            }
            eVar7.f17932L.a(this.f18056e, i23);
            if (z11) {
                eVar7.f17934N.a(this.f18058g, this.f18062k);
            }
            if (i10 > 0) {
                this.f18056e.f17905d.f17934N.a(eVar7.f17932L, 0);
            }
            char c11 = 3;
            if (g.this.f18046e1 == 3 && !eVar7.Z()) {
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = z10 ? (i12 - 1) - i24 : i24;
                    if (this.f18065n + i25 >= g.this.f18051j1) {
                        break;
                    }
                    eVar = g.this.mDisplayedWidgets[this.f18065n + i25];
                    if (eVar.Z()) {
                        break;
                    }
                }
            }
            eVar = eVar7;
            int i26 = 0;
            while (i26 < i12) {
                int i27 = z10 ? (i12 - 1) - i26 : i26;
                if (this.f18065n + i27 >= g.this.f18051j1) {
                    return;
                }
                e eVar8 = g.this.mDisplayedWidgets[this.f18065n + i27];
                if (eVar8 == null) {
                    eVar8 = eVar4;
                    c10 = c11;
                } else {
                    if (i26 == 0) {
                        i11 = 1;
                        eVar8.k(eVar8.f17931K, this.f18055d, this.f18059h);
                    } else {
                        i11 = 1;
                    }
                    if (i27 == 0) {
                        int i28 = g.this.f18031P0;
                        float f13 = g.this.f18037V0;
                        if (z10) {
                            f13 = 1.0f - f13;
                        }
                        if (this.f18065n == 0 && g.this.f18033R0 != -1) {
                            i28 = g.this.f18033R0;
                            if (z10) {
                                f11 = g.this.f18039X0;
                                f10 = 1.0f - f11;
                                f13 = f10;
                            } else {
                                f10 = g.this.f18039X0;
                                f13 = f10;
                            }
                        } else if (z11 && g.this.f18035T0 != -1) {
                            i28 = g.this.f18035T0;
                            if (z10) {
                                f11 = g.this.f18041Z0;
                                f10 = 1.0f - f11;
                                f13 = f10;
                            } else {
                                f10 = g.this.f18041Z0;
                                f13 = f10;
                            }
                        }
                        eVar8.O0(i28);
                        eVar8.N0(f13);
                    }
                    if (i26 == i12 - 1) {
                        eVar8.k(eVar8.f17933M, this.f18057f, this.f18061j);
                    }
                    if (eVar4 != null) {
                        eVar8.f17931K.a(eVar4.f17933M, g.this.f18043b1);
                        if (i26 == i14) {
                            eVar8.f17931K.u(this.f18059h);
                        }
                        eVar4.f17933M.a(eVar8.f17931K, 0);
                        if (i26 == i15 + 1) {
                            eVar4.f17933M.u(this.f18061j);
                        }
                    }
                    if (eVar8 != eVar7) {
                        c10 = 3;
                        if (g.this.f18046e1 == 3 && eVar.Z() && eVar8 != eVar && eVar8.Z()) {
                            eVar8.f17935O.a(eVar.f17935O, 0);
                        } else {
                            int i29 = g.this.f18046e1;
                            if (i29 == 0) {
                                eVar8.f17932L.a(eVar7.f17932L, 0);
                            } else if (i29 == i11) {
                                eVar8.f17934N.a(eVar7.f17934N, 0);
                            } else if (z12) {
                                eVar8.f17932L.a(this.f18056e, this.f18060i);
                                eVar8.f17934N.a(this.f18058g, this.f18062k);
                            } else {
                                eVar8.f17932L.a(eVar7.f17932L, 0);
                                eVar8.f17934N.a(eVar7.f17934N, 0);
                            }
                        }
                    } else {
                        c10 = 3;
                    }
                }
                i26++;
                c11 = c10;
                eVar4 = eVar8;
            }
        }

        public int e() {
            return this.f18052a == 1 ? this.f18064m - g.this.f18044c1 : this.f18064m;
        }

        public int f() {
            return this.f18052a == 0 ? this.f18063l - g.this.f18043b1 : this.f18063l;
        }

        public void g(int i10) {
            int i11 = this.f18067p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f18066o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12 && this.f18065n + i14 < g.this.f18051j1; i14++) {
                e eVar = g.this.mDisplayedWidgets[this.f18065n + i14];
                if (this.f18052a == 0) {
                    if (eVar != null && eVar.A() == e.b.MATCH_CONSTRAINT && eVar.f17987u == 0) {
                        g.this.E1(eVar, e.b.FIXED, i13, eVar.T(), eVar.x());
                    }
                } else if (eVar != null && eVar.T() == e.b.MATCH_CONSTRAINT && eVar.f17989v == 0) {
                    int i15 = i13;
                    g.this.E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i15);
                    i13 = i15;
                }
            }
            h();
        }

        public final void h() {
            this.f18063l = 0;
            this.f18064m = 0;
            this.f18053b = null;
            this.f18054c = 0;
            int i10 = this.f18066o;
            for (int i11 = 0; i11 < i10 && this.f18065n + i11 < g.this.f18051j1; i11++) {
                e eVar = g.this.mDisplayedWidgets[this.f18065n + i11];
                if (this.f18052a == 0) {
                    int W10 = eVar.W();
                    int i12 = g.this.f18043b1;
                    if (eVar.V() == 8) {
                        i12 = 0;
                    }
                    this.f18063l += W10 + i12;
                    int l22 = g.this.l2(eVar, this.f18068q);
                    if (this.f18053b == null || this.f18054c < l22) {
                        this.f18053b = eVar;
                        this.f18054c = l22;
                        this.f18064m = l22;
                    }
                } else {
                    int m22 = g.this.m2(eVar, this.f18068q);
                    int l23 = g.this.l2(eVar, this.f18068q);
                    int i13 = g.this.f18044c1;
                    if (eVar.V() == 8) {
                        i13 = 0;
                    }
                    this.f18064m += l23 + i13;
                    if (this.f18053b == null || this.f18054c < m22) {
                        this.f18053b = eVar;
                        this.f18054c = m22;
                        this.f18063l = m22;
                    }
                }
            }
        }

        public void i(int i10) {
            this.f18065n = i10;
        }

        public void j(int i10, d dVar, d dVar2, d dVar3, d dVar4, int i11, int i12, int i13, int i14, int i15) {
            this.f18052a = i10;
            this.f18055d = dVar;
            this.f18056e = dVar2;
            this.f18057f = dVar3;
            this.f18058g = dVar4;
            this.f18059h = i11;
            this.f18060i = i12;
            this.f18061j = i13;
            this.f18062k = i14;
            this.f18068q = i15;
        }
    }

    public void A2(int i10) {
        this.f18035T0 = i10;
    }

    public void B2(float f10) {
        this.f18042a1 = f10;
    }

    public void C2(int i10) {
        this.f18036U0 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.l
    public void D1(int i10, int i11, int i12, int i13) {
        int i14;
        e[] eVarArr;
        if (this.f18078B0 > 0 && !F1()) {
            I1(0, 0);
            H1(false);
            return;
        }
        int A12 = A1();
        int B12 = B1();
        int C12 = C1();
        int z12 = z1();
        int[] iArr = new int[2];
        int i15 = (i11 - A12) - B12;
        int i16 = this.f18049h1;
        if (i16 == 1) {
            i15 = (i13 - C12) - z12;
        }
        int i17 = i15;
        if (i16 == 0) {
            if (this.f18031P0 == -1) {
                this.f18031P0 = 0;
            }
            if (this.f18032Q0 == -1) {
                this.f18032Q0 = 0;
            }
        } else {
            if (this.f18031P0 == -1) {
                this.f18031P0 = 0;
            }
            if (this.f18032Q0 == -1) {
                this.f18032Q0 = 0;
            }
        }
        e[] eVarArr2 = this.mWidgets;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i14 = this.f18078B0;
            if (i18 >= i14) {
                break;
            }
            if (this.mWidgets[i18].V() == 8) {
                i19++;
            }
            i18++;
        }
        if (i19 > 0) {
            e[] eVarArr3 = new e[i14 - i19];
            int i20 = 0;
            i14 = 0;
            while (i20 < this.f18078B0) {
                e eVar = this.mWidgets[i20];
                e[] eVarArr4 = eVarArr3;
                if (eVar.V() != 8) {
                    eVarArr4[i14] = eVar;
                    i14++;
                }
                i20++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i21 = i14;
        this.mDisplayedWidgets = eVarArr;
        this.f18051j1 = i21;
        int i22 = this.f18047f1;
        if (i22 == 0) {
            q2(eVarArr, i21, this.f18049h1, i17, iArr);
        } else if (i22 == 1) {
            o2(eVarArr, i21, this.f18049h1, i17, iArr);
        } else if (i22 == 2) {
            n2(eVarArr, i21, this.f18049h1, i17, iArr);
        } else if (i22 == 3) {
            p2(eVarArr, i21, this.f18049h1, i17, iArr);
        }
        int i23 = iArr[0] + A12 + B12;
        int i24 = iArr[1] + C12 + z12;
        if (i10 == 1073741824) {
            i23 = i11;
        } else if (i10 == Integer.MIN_VALUE) {
            i23 = Math.min(i23, i11);
        } else if (i10 != 0) {
            i23 = 0;
        }
        if (i12 == 1073741824) {
            i24 = i13;
        } else if (i12 == Integer.MIN_VALUE) {
            i24 = Math.min(i24, i13);
        } else if (i12 != 0) {
            i24 = 0;
        }
        I1(i23, i24);
        l1(i23);
        M0(i24);
        H1(this.f18078B0 > 0);
    }

    public void D2(int i10) {
        this.f18048g1 = i10;
    }

    public void E2(int i10) {
        this.f18049h1 = i10;
    }

    public void F2(int i10) {
        this.f18046e1 = i10;
    }

    public void G2(float f10) {
        this.f18038W0 = f10;
    }

    public void H2(int i10) {
        this.f18044c1 = i10;
    }

    public void I2(int i10) {
        this.f18032Q0 = i10;
    }

    public void J2(int i10) {
        this.f18047f1 = i10;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.d dVar, boolean z10) {
        super.g(dVar, z10);
        boolean z11 = K() != null && ((f) K()).R1();
        int i10 = this.f18047f1;
        if (i10 != 0) {
            if (i10 == 1) {
                int size = this.f18050i1.size();
                int i11 = 0;
                while (i11 < size) {
                    ((a) this.f18050i1.get(i11)).d(z11, i11, i11 == size + (-1));
                    i11++;
                }
            } else if (i10 == 2) {
                k2(z11);
            } else if (i10 == 3) {
                int size2 = this.f18050i1.size();
                int i12 = 0;
                while (i12 < size2) {
                    ((a) this.f18050i1.get(i12)).d(z11, i12, i12 == size2 + (-1));
                    i12++;
                }
            }
        } else if (this.f18050i1.size() > 0) {
            ((a) this.f18050i1.get(0)).d(z11, 0, true);
        }
        H1(false);
    }

    public final void k2(boolean z10) {
        e eVar;
        float f10;
        int i10;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f18051j1; i11++) {
            this.mDisplayedWidgets[i11].u0();
        }
        int[] iArr = this.mAlignedDimensions;
        int i12 = iArr[0];
        int i13 = iArr[1];
        float f11 = this.f18037V0;
        e eVar2 = null;
        int i14 = 0;
        while (i14 < i12) {
            if (z10) {
                i10 = (i12 - i14) - 1;
                f10 = 1.0f - this.f18037V0;
            } else {
                f10 = f11;
                i10 = i14;
            }
            e eVar3 = this.mAlignedBiggestElementsInCols[i10];
            if (eVar3 != null && eVar3.V() != 8) {
                if (i14 == 0) {
                    eVar3.k(eVar3.f17931K, this.f17931K, A1());
                    eVar3.O0(this.f18031P0);
                    eVar3.N0(f10);
                }
                if (i14 == i12 - 1) {
                    eVar3.k(eVar3.f17933M, this.f17933M, B1());
                }
                if (i14 > 0 && eVar2 != null) {
                    eVar3.k(eVar3.f17931K, eVar2.f17933M, this.f18043b1);
                    eVar2.k(eVar2.f17933M, eVar3.f17931K, 0);
                }
                eVar2 = eVar3;
            }
            i14++;
            f11 = f10;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            e eVar4 = this.mAlignedBiggestElementsInRows[i15];
            if (eVar4 != null && eVar4.V() != 8) {
                if (i15 == 0) {
                    eVar4.k(eVar4.f17932L, this.f17932L, C1());
                    eVar4.f1(this.f18032Q0);
                    eVar4.e1(this.f18038W0);
                }
                if (i15 == i13 - 1) {
                    eVar4.k(eVar4.f17934N, this.f17934N, z1());
                }
                if (i15 > 0 && eVar2 != null) {
                    eVar4.k(eVar4.f17932L, eVar2.f17934N, this.f18044c1);
                    eVar2.k(eVar2.f17934N, eVar4.f17932L, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i16 = 0; i16 < i12; i16++) {
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = (i17 * i12) + i16;
                if (this.f18049h1 == 1) {
                    i18 = (i16 * i13) + i17;
                }
                e[] eVarArr = this.mDisplayedWidgets;
                if (i18 < eVarArr.length && (eVar = eVarArr[i18]) != null && eVar.V() != 8) {
                    e eVar5 = this.mAlignedBiggestElementsInCols[i16];
                    e eVar6 = this.mAlignedBiggestElementsInRows[i17];
                    if (eVar != eVar5) {
                        eVar.k(eVar.f17931K, eVar5.f17931K, 0);
                        eVar.k(eVar.f17933M, eVar5.f17933M, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.k(eVar.f17932L, eVar6.f17932L, 0);
                        eVar.k(eVar.f17934N, eVar6.f17934N, 0);
                    }
                }
            }
        }
    }

    public final int l2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.T() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f17989v;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f17922B * i10);
                if (i12 != eVar.x()) {
                    eVar.Z0(true);
                    E1(eVar, eVar.A(), eVar.W(), e.b.FIXED, i12);
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.x();
            }
            if (i11 == 3) {
                return (int) ((eVar2.W() * eVar2.f17943W) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.x();
    }

    public final int m2(e eVar, int i10) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.A() == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f17987u;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (eVar.f17995y * i10);
                if (i12 != eVar.W()) {
                    eVar.Z0(true);
                    E1(eVar, e.b.FIXED, i12, eVar.T(), eVar.x());
                }
                return i12;
            }
            eVar2 = eVar;
            if (i11 == 1) {
                return eVar2.W();
            }
            if (i11 == 3) {
                return (int) ((eVar2.x() * eVar2.f17943W) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.W();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        int i14;
        boolean z10;
        e eVar;
        if (i11 == 0) {
            int i15 = this.f18048g1;
            if (i15 <= 0) {
                i15 = 0;
                int i16 = 0;
                for (int i17 = 0; i17 < i10; i17++) {
                    if (i17 > 0) {
                        i16 += this.f18043b1;
                    }
                    e eVar2 = eVarArr[i17];
                    if (eVar2 != null) {
                        i16 += m2(eVar2, i12);
                        if (i16 > i12) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            i14 = i15;
            i13 = 0;
        } else {
            i13 = this.f18048g1;
            if (i13 <= 0) {
                i13 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < i10; i19++) {
                    if (i19 > 0) {
                        i18 += this.f18044c1;
                    }
                    e eVar3 = eVarArr[i19];
                    if (eVar3 != null) {
                        i18 += l2(eVar3, i12);
                        if (i18 > i12) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
            i14 = 0;
        }
        if (this.mAlignedDimensions == null) {
            this.mAlignedDimensions = new int[2];
        }
        if ((i13 != 0 || i11 != 1) && (i14 != 0 || i11 != 0)) {
            z10 = false;
            while (!z10) {
                if (i11 == 0) {
                    i13 = (int) Math.ceil(i10 / i14);
                } else {
                    i14 = (int) Math.ceil(i10 / i13);
                }
                e[] eVarArr2 = this.mAlignedBiggestElementsInCols;
                if (eVarArr2 == null || eVarArr2.length < i14) {
                    this.mAlignedBiggestElementsInCols = new e[i14];
                } else {
                    Arrays.fill(eVarArr2, (Object) null);
                }
                e[] eVarArr3 = this.mAlignedBiggestElementsInRows;
                if (eVarArr3 == null || eVarArr3.length < i13) {
                    this.mAlignedBiggestElementsInRows = new e[i13];
                } else {
                    Arrays.fill(eVarArr3, (Object) null);
                }
                for (int i20 = 0; i20 < i14; i20++) {
                    for (int i21 = 0; i21 < i13; i21++) {
                        int i22 = (i21 * i14) + i20;
                        if (i11 == 1) {
                            i22 = (i20 * i13) + i21;
                        }
                        if (i22 < eVarArr.length && (eVar = eVarArr[i22]) != null) {
                            int m22 = m2(eVar, i12);
                            e eVar4 = this.mAlignedBiggestElementsInCols[i20];
                            if (eVar4 == null || eVar4.W() < m22) {
                                this.mAlignedBiggestElementsInCols[i20] = eVar;
                            }
                            int l22 = l2(eVar, i12);
                            e eVar5 = this.mAlignedBiggestElementsInRows[i21];
                            if (eVar5 == null || eVar5.x() < l22) {
                                this.mAlignedBiggestElementsInRows[i21] = eVar;
                            }
                        }
                    }
                }
                int i23 = 0;
                for (int i24 = 0; i24 < i14; i24++) {
                    e eVar6 = this.mAlignedBiggestElementsInCols[i24];
                    if (eVar6 != null) {
                        if (i24 > 0) {
                            i23 += this.f18043b1;
                        }
                        i23 += m2(eVar6, i12);
                    }
                }
                int i25 = 0;
                for (int i26 = 0; i26 < i13; i26++) {
                    e eVar7 = this.mAlignedBiggestElementsInRows[i26];
                    if (eVar7 != null) {
                        if (i26 > 0) {
                            i25 += this.f18044c1;
                        }
                        i25 += l2(eVar7, i12);
                    }
                }
                iArr[0] = i23;
                iArr[1] = i25;
                if (i11 != 0) {
                    if (i25 > i12 && i13 > 1) {
                        i13--;
                    }
                } else if (i23 > i12 && i14 > 1) {
                    i14--;
                }
                while (!z10) {
                }
            }
            int[] iArr2 = this.mAlignedDimensions;
            iArr2[0] = i14;
            iArr2[1] = i13;
        }
        z10 = true;
        while (!z10) {
        }
        int[] iArr22 = this.mAlignedDimensions;
        iArr22[0] = i14;
        iArr22[1] = i13;
    }

    public final void o2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f18050i1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.f17931K, gVar2.f17932L, gVar2.f17933M, gVar2.f17934N, i16);
        gVar2.f18050i1.add(aVar);
        if (i11 == 0) {
            i13 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                e eVar = eVarArr[i18];
                int m22 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i19 = i13;
                boolean z10 = (i17 == i16 || (gVar2.f18043b1 + i17) + m22 > i16) && aVar.f18053b != null;
                if (!z10 && i18 > 0 && (i15 = gVar2.f18048g1) > 0 && i18 % i15 == 0) {
                    z10 = true;
                }
                if (z10) {
                    aVar = gVar2.new a(i11, gVar2.f17931K, gVar2.f17932L, gVar2.f17933M, gVar2.f17934N, i16);
                    aVar.i(i18);
                    gVar2.f18050i1.add(aVar);
                } else if (i18 > 0) {
                    i17 += gVar2.f18043b1 + m22;
                    aVar.b(eVar);
                    i18++;
                    i13 = i19;
                }
                i17 = m22;
                aVar.b(eVar);
                i18++;
                i13 = i19;
            }
        } else {
            i13 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i21 < i10) {
                e eVar2 = eVarArr[i21];
                int l22 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i22 = i13;
                boolean z11 = (i20 == i16 || (gVar2.f18044c1 + i20) + l22 > i16) && aVar.f18053b != null;
                if (!z11 && i21 > 0 && (i14 = gVar2.f18048g1) > 0 && i21 % i14 == 0) {
                    z11 = true;
                }
                if (z11) {
                    aVar = gVar2.new a(i11, gVar2.f17931K, gVar2.f17932L, gVar2.f17933M, gVar2.f17934N, i16);
                    gVar = gVar2;
                    aVar.i(i21);
                    gVar.f18050i1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i21 > 0) {
                        i20 += gVar.f18044c1 + l22;
                        aVar.b(eVar2);
                        i21++;
                        i16 = i12;
                        i13 = i22;
                        gVar2 = gVar;
                    }
                }
                i20 = l22;
                aVar.b(eVar2);
                i21++;
                i16 = i12;
                i13 = i22;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f18050i1.size();
        d dVar2 = gVar3.f17931K;
        d dVar3 = gVar3.f17932L;
        d dVar4 = gVar3.f17933M;
        d dVar5 = gVar3.f17934N;
        int A12 = gVar3.A1();
        int C12 = gVar3.C1();
        int B12 = gVar3.B1();
        int z12 = gVar3.z1();
        e.b A10 = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z13 = A10 == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z13) {
            for (int i23 = 0; i23 < size; i23++) {
                a aVar2 = (a) gVar3.f18050i1.get(i23);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int i24 = z12;
        int i25 = 0;
        int i26 = B12;
        int i27 = C12;
        int i28 = A12;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i29 = 0;
        for (int i30 = 0; i30 < size; i30++) {
            a aVar3 = (a) gVar3.f18050i1.get(i30);
            if (i11 == 0) {
                if (i30 < size - 1) {
                    dVar7 = ((a) gVar3.f18050i1.get(i30 + 1)).f18053b.f17932L;
                    i24 = 0;
                } else {
                    dVar7 = gVar3.f17934N;
                    i24 = gVar3.z1();
                }
                d dVar10 = aVar3.f18053b.f17934N;
                int i31 = i29;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i28, i27, i26, i24, i12);
                int max = Math.max(i25, aVar3.f());
                int e10 = aVar3.e() + i31;
                if (i30 > 0) {
                    e10 += gVar3.f18044c1;
                }
                i29 = e10;
                i25 = max;
                dVar9 = dVar10;
                i27 = 0;
            } else {
                int i32 = i25;
                int i33 = i29;
                if (i30 < size - 1) {
                    dVar = ((a) gVar3.f18050i1.get(i30 + 1)).f18053b.f17931K;
                    i26 = 0;
                } else {
                    dVar = gVar3.f17933M;
                    i26 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f18053b.f17933M;
                aVar3.j(i11, dVar6, dVar9, dVar8, dVar7, i28, i27, i26, i24, i12);
                int f10 = aVar3.f() + i32;
                int max2 = Math.max(i33, aVar3.e());
                if (i30 > 0) {
                    f10 += gVar3.f18043b1;
                }
                int i34 = f10;
                i29 = max2;
                i25 = i34;
                i28 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i25;
        iArr[1] = i29;
    }

    public final void p2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        int i13;
        g gVar;
        int i14;
        boolean z10;
        d dVar;
        int i15;
        g gVar2 = this;
        if (i10 == 0) {
            return;
        }
        gVar2.f18050i1.clear();
        int i16 = i12;
        a aVar = gVar2.new a(i11, gVar2.f17931K, gVar2.f17932L, gVar2.f17933M, gVar2.f17934N, i16);
        gVar2.f18050i1.add(aVar);
        boolean z11 = true;
        if (i11 == 0) {
            int i17 = 0;
            i13 = 0;
            int i18 = 0;
            int i19 = 0;
            while (i19 < i10) {
                i17++;
                e eVar = eVarArr[i19];
                int m22 = gVar2.m2(eVar, i16);
                if (eVar.A() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i20 = i13;
                boolean z12 = (i18 == i16 || (gVar2.f18043b1 + i18) + m22 > i16) && aVar.f18053b != null;
                if (!z12 && i19 > 0 && (i15 = gVar2.f18048g1) > 0 && i17 > i15) {
                    z12 = true;
                }
                if (z12) {
                    aVar = gVar2.new a(i11, gVar2.f17931K, gVar2.f17932L, gVar2.f17933M, gVar2.f17934N, i16);
                    aVar.i(i19);
                    gVar2.f18050i1.add(aVar);
                    i17 = 1;
                } else if (i19 > 0) {
                    i18 += gVar2.f18043b1 + m22;
                    aVar.b(eVar);
                    i19++;
                    i13 = i20;
                }
                i18 = m22;
                aVar.b(eVar);
                i19++;
                i13 = i20;
            }
        } else {
            int i21 = 0;
            i13 = 0;
            int i22 = 0;
            int i23 = 0;
            while (i23 < i10) {
                i21++;
                e eVar2 = eVarArr[i23];
                int l22 = gVar2.l2(eVar2, i16);
                if (eVar2.T() == e.b.MATCH_CONSTRAINT) {
                    i13++;
                }
                int i24 = i13;
                boolean z13 = (i22 == i16 || (gVar2.f18044c1 + i22) + l22 > i16) && aVar.f18053b != null;
                if (!z13 && i23 > 0 && (i14 = gVar2.f18048g1) > 0 && i21 > i14) {
                    z13 = true;
                }
                if (z13) {
                    aVar = gVar2.new a(i11, gVar2.f17931K, gVar2.f17932L, gVar2.f17933M, gVar2.f17934N, i16);
                    gVar = gVar2;
                    aVar.i(i23);
                    gVar.f18050i1.add(aVar);
                    i21 = 1;
                } else {
                    gVar = gVar2;
                    if (i23 > 0) {
                        i22 += gVar.f18044c1 + l22;
                        aVar.b(eVar2);
                        i23++;
                        i16 = i12;
                        i13 = i24;
                        gVar2 = gVar;
                    }
                }
                i22 = l22;
                aVar.b(eVar2);
                i23++;
                i16 = i12;
                i13 = i24;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f18050i1.size();
        d dVar2 = gVar3.f17931K;
        d dVar3 = gVar3.f17932L;
        d dVar4 = gVar3.f17933M;
        d dVar5 = gVar3.f17934N;
        int A12 = gVar3.A1();
        int C12 = gVar3.C1();
        int B12 = gVar3.B1();
        int z14 = gVar3.z1();
        e.b A10 = gVar3.A();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z15 = A10 == bVar || gVar3.T() == bVar;
        if (i13 > 0 && z15) {
            for (int i25 = 0; i25 < size; i25++) {
                a aVar2 = (a) gVar3.f18050i1.get(i25);
                if (i11 == 0) {
                    aVar2.g(i12 - aVar2.f());
                } else {
                    aVar2.g(i12 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar3;
        int i26 = z14;
        int i27 = 0;
        int i28 = 0;
        int i29 = B12;
        int i30 = C12;
        int i31 = A12;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar2;
        int i32 = 0;
        while (i28 < size) {
            a aVar3 = (a) gVar3.f18050i1.get(i28);
            if (i11 == 0) {
                if (i28 < size - 1) {
                    dVar7 = ((a) gVar3.f18050i1.get(i28 + 1)).f18053b.f17932L;
                    i26 = 0;
                } else {
                    dVar7 = gVar3.f17934N;
                    i26 = gVar3.z1();
                }
                d dVar10 = aVar3.f18053b.f17934N;
                z10 = z11;
                int i33 = i27;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i31, i30, i29, i26, i12);
                int max = Math.max(i32, aVar3.f());
                int e10 = aVar3.e() + i33;
                if (i28 > 0) {
                    e10 += gVar3.f18044c1;
                }
                i27 = e10;
                i32 = max;
                dVar6 = dVar10;
                i30 = 0;
            } else {
                int i34 = i27;
                z10 = z11;
                int i35 = i32;
                if (i28 < size - 1) {
                    dVar = ((a) gVar3.f18050i1.get(i28 + 1)).f18053b.f17931K;
                    i29 = 0;
                } else {
                    dVar = gVar3.f17933M;
                    i29 = gVar3.B1();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f18053b.f17933M;
                aVar3.j(i11, dVar9, dVar6, dVar8, dVar7, i31, i30, i29, i26, i12);
                int f10 = aVar3.f() + i35;
                int max2 = Math.max(i34, aVar3.e());
                if (i28 > 0) {
                    f10 += gVar3.f18043b1;
                }
                int i36 = f10;
                i27 = max2;
                i32 = i36;
                i31 = 0;
                dVar9 = dVar11;
            }
            i28++;
            z11 = z10;
        }
        iArr[0] = i32;
        iArr[z11 ? 1 : 0] = i27;
    }

    public final void q2(e[] eVarArr, int i10, int i11, int i12, int[] iArr) {
        a aVar;
        if (i10 == 0) {
            return;
        }
        if (this.f18050i1.size() == 0) {
            aVar = new a(i11, this.f17931K, this.f17932L, this.f17933M, this.f17934N, i12);
            this.f18050i1.add(aVar);
        } else {
            a aVar2 = (a) this.f18050i1.get(0);
            aVar2.c();
            aVar2.j(i11, this.f17931K, this.f17932L, this.f17933M, this.f17934N, A1(), C1(), B1(), z1(), i12);
            aVar = aVar2;
        }
        for (int i13 = 0; i13 < i10; i13++) {
            aVar.b(eVarArr[i13]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void r2(float f10) {
        this.f18039X0 = f10;
    }

    public void s2(int i10) {
        this.f18033R0 = i10;
    }

    public void t2(float f10) {
        this.f18040Y0 = f10;
    }

    public void u2(int i10) {
        this.f18034S0 = i10;
    }

    public void v2(int i10) {
        this.f18045d1 = i10;
    }

    public void w2(float f10) {
        this.f18037V0 = f10;
    }

    public void x2(int i10) {
        this.f18043b1 = i10;
    }

    public void y2(int i10) {
        this.f18031P0 = i10;
    }

    public void z2(float f10) {
        this.f18041Z0 = f10;
    }
}
