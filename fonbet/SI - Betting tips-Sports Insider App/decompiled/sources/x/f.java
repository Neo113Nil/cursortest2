package x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f25338a;

    /* renamed from: d, reason: collision with root package name */
    public c f25341d;

    /* renamed from: e, reason: collision with root package name */
    public c f25342e;

    /* renamed from: f, reason: collision with root package name */
    public c f25343f;

    /* renamed from: g, reason: collision with root package name */
    public c f25344g;

    /* renamed from: h, reason: collision with root package name */
    public int f25345h;

    /* renamed from: i, reason: collision with root package name */
    public int f25346i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f25347k;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f25353r;

    /* renamed from: b, reason: collision with root package name */
    public d f25339b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f25340c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f25348l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f25349m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f25350n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f25351o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f25352p = 0;

    public f(g gVar, int i5, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f25353r = gVar;
        this.f25338a = i5;
        this.f25341d = cVar;
        this.f25342e = cVar2;
        this.f25343f = cVar3;
        this.f25344g = cVar4;
        this.f25345h = gVar.f25360w0;
        this.f25346i = gVar.f25356s0;
        this.j = gVar.x0;
        this.f25347k = gVar.f25357t0;
        this.q = i10;
    }

    public final void a(d dVar) {
        int i5 = this.f25338a;
        g gVar = this.f25353r;
        if (i5 == 0) {
            int U = gVar.U(dVar, this.q);
            if (dVar.f25320p0[0] == 3) {
                this.f25352p++;
                U = 0;
            }
            this.f25348l = U + (dVar.f25305g0 != 8 ? gVar.P0 : 0) + this.f25348l;
            int T = gVar.T(dVar, this.q);
            if (this.f25339b == null || this.f25340c < T) {
                this.f25339b = dVar;
                this.f25340c = T;
                this.f25349m = T;
            }
        } else {
            int U2 = gVar.U(dVar, this.q);
            int T2 = gVar.T(dVar, this.q);
            if (dVar.f25320p0[1] == 3) {
                this.f25352p++;
                T2 = 0;
            }
            this.f25349m = T2 + (dVar.f25305g0 != 8 ? gVar.Q0 : 0) + this.f25349m;
            if (this.f25339b == null || this.f25340c < U2) {
                this.f25339b = dVar;
                this.f25340c = U2;
                this.f25348l = U2;
            }
        }
        this.f25351o++;
    }

    public final void b(int i5, boolean z5, boolean z7) {
        g gVar;
        int i10;
        int i11;
        int i12;
        d dVar;
        boolean z10;
        int i13;
        int i14;
        char c2;
        float f6;
        float f10;
        float f11;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17 = this.f25351o;
        int i18 = 0;
        while (true) {
            gVar = this.f25353r;
            if (i18 >= i17 || (i16 = this.f25350n + i18) >= gVar.f25355b1) {
                break;
            }
            d dVar2 = gVar.f25354a1[i16];
            if (dVar2 != null) {
                dVar2.D();
            }
            i18++;
        }
        if (i17 == 0 || this.f25339b == null) {
            return;
        }
        boolean z11 = z7 && i5 == 0;
        int i19 = -1;
        int i20 = -1;
        for (int i21 = 0; i21 < i17; i21++) {
            int i22 = this.f25350n + (z5 ? (i17 - 1) - i21 : i21);
            if (i22 >= gVar.f25355b1) {
                break;
            }
            d dVar3 = gVar.f25354a1[i22];
            if (dVar3 != null && dVar3.f25305g0 == 0) {
                if (i19 == -1) {
                    i19 = i21;
                }
                i20 = i21;
            }
        }
        if (this.f25338a == 0) {
            d dVar4 = this.f25339b;
            dVar4.j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i23 = this.f25346i;
            if (i5 > 0) {
                i23 += gVar.Q0;
            }
            cVar2.a(this.f25342e, i23);
            if (z7) {
                cVar.a(this.f25344g, this.f25347k);
            }
            if (i5 > 0) {
                this.f25342e.f25287d.L.a(cVar2, 0);
            }
            if (gVar.S0 == 3 && !dVar4.E) {
                for (int i24 = 0; i24 < i17; i24++) {
                    int i25 = this.f25350n + (z5 ? (i17 - 1) - i24 : i24);
                    if (i25 >= gVar.f25355b1) {
                        break;
                    }
                    dVar = gVar.f25354a1[i25];
                    if (dVar.E) {
                        break;
                    }
                }
            }
            dVar = dVar4;
            int i26 = 0;
            d dVar5 = null;
            while (i26 < i17) {
                int i27 = z5 ? (i17 - 1) - i26 : i26;
                int i28 = this.f25350n + i27;
                if (i28 >= gVar.f25355b1) {
                    return;
                }
                d dVar6 = gVar.f25354a1[i28];
                if (dVar6 == null) {
                    i14 = i17;
                    z10 = z11;
                    i13 = i20;
                    c2 = 3;
                } else {
                    c cVar3 = dVar6.L;
                    c cVar4 = dVar6.J;
                    c cVar5 = dVar6.I;
                    z10 = z11;
                    if (i26 == 0) {
                        i13 = i20;
                        dVar6.f(cVar5, this.f25341d, this.f25345h);
                    } else {
                        i13 = i20;
                    }
                    if (i27 == 0) {
                        int i29 = gVar.D0;
                        if (z5) {
                            f6 = 1.0f;
                            f10 = 1.0f - gVar.J0;
                        } else {
                            f6 = 1.0f;
                            f10 = gVar.J0;
                        }
                        if (this.f25350n == 0) {
                            i15 = gVar.F0;
                            f11 = f10;
                            if (i15 != -1) {
                                if (z5) {
                                    f13 = gVar.L0;
                                    f12 = f6 - f13;
                                    dVar6.f25309i0 = i15;
                                    dVar6.f25300d0 = f12;
                                } else {
                                    f12 = gVar.L0;
                                    dVar6.f25309i0 = i15;
                                    dVar6.f25300d0 = f12;
                                }
                            }
                        } else {
                            f11 = f10;
                        }
                        if (!z7 || (i15 = gVar.H0) == -1) {
                            i15 = i29;
                            f12 = f11;
                        } else if (z5) {
                            f13 = gVar.N0;
                            f12 = f6 - f13;
                        } else {
                            f12 = gVar.N0;
                        }
                        dVar6.f25309i0 = i15;
                        dVar6.f25300d0 = f12;
                    }
                    if (i26 == i17 - 1) {
                        i14 = i17;
                        dVar6.f(dVar6.K, this.f25343f, this.j);
                    } else {
                        i14 = i17;
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i26 == i19) {
                            int i30 = this.f25345h;
                            if (cVar5.h()) {
                                cVar5.f25291h = i30;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i26 == i13 + 1) {
                            int i31 = this.j;
                            if (cVar6.h()) {
                                cVar6.f25291h = i31;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i32 = gVar.S0;
                        c2 = 3;
                        if (i32 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i32 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i32 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z10) {
                            cVar4.a(this.f25342e, this.f25346i);
                            cVar3.a(this.f25344g, this.f25347k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c2 = 3;
                    }
                    dVar5 = dVar6;
                }
                i26++;
                z11 = z10;
                i20 = i13;
                i17 = i14;
            }
            return;
        }
        int i33 = i17;
        boolean z12 = z11;
        int i34 = i20;
        d dVar7 = this.f25339b;
        dVar7.f25309i0 = gVar.D0;
        c cVar7 = dVar7.I;
        c cVar8 = dVar7.K;
        int i35 = this.f25345h;
        if (i5 > 0) {
            i35 += gVar.P0;
        }
        if (z5) {
            cVar8.a(this.f25343f, i35);
            if (z7) {
                cVar7.a(this.f25341d, this.j);
            }
            if (i5 > 0) {
                this.f25343f.f25287d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f25341d, i35);
            if (z7) {
                cVar8.a(this.f25343f, this.j);
            }
            if (i5 > 0) {
                this.f25341d.f25287d.K.a(cVar7, 0);
            }
        }
        int i36 = 0;
        d dVar8 = null;
        while (true) {
            int i37 = i33;
            if (i36 >= i37 || (i10 = this.f25350n + i36) >= gVar.f25355b1) {
                return;
            }
            d dVar9 = gVar.f25354a1[i10];
            if (dVar9 == null) {
                i33 = i37;
            } else {
                c cVar9 = dVar9.J;
                c cVar10 = dVar9.K;
                c cVar11 = dVar9.I;
                if (i36 == 0) {
                    dVar9.f(cVar9, this.f25342e, this.f25346i);
                    int i38 = gVar.E0;
                    float f14 = gVar.K0;
                    if (this.f25350n == 0) {
                        i12 = gVar.G0;
                        i33 = i37;
                        i11 = -1;
                        if (i12 != -1) {
                            f14 = gVar.M0;
                            i38 = i12;
                            dVar9.j0 = i38;
                            dVar9.e0 = f14;
                        }
                    } else {
                        i33 = i37;
                        i11 = -1;
                    }
                    if (z7 && (i12 = gVar.I0) != i11) {
                        f14 = gVar.O0;
                        i38 = i12;
                    }
                    dVar9.j0 = i38;
                    dVar9.e0 = f14;
                } else {
                    i33 = i37;
                }
                if (i36 == i33 - 1) {
                    dVar9.f(dVar9.L, this.f25344g, this.f25347k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.L;
                    cVar9.a(cVar12, gVar.Q0);
                    if (i36 == i19) {
                        int i39 = this.f25346i;
                        if (cVar9.h()) {
                            cVar9.f25291h = i39;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i36 == i34 + 1) {
                        int i40 = this.f25347k;
                        if (cVar12.h()) {
                            cVar12.f25291h = i40;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    if (z5) {
                        int i41 = gVar.R0;
                        if (i41 == 0) {
                            cVar10.a(cVar8, 0);
                        } else if (i41 == 1) {
                            cVar11.a(cVar7, 0);
                        } else if (i41 == 2) {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    } else {
                        int i42 = gVar.R0;
                        if (i42 == 0) {
                            cVar11.a(cVar7, 0);
                        } else if (i42 == 1) {
                            cVar10.a(cVar8, 0);
                        } else if (i42 == 2) {
                            if (z12) {
                                cVar11.a(this.f25341d, this.f25345h);
                                cVar10.a(this.f25343f, this.j);
                            } else {
                                cVar11.a(cVar7, 0);
                                cVar10.a(cVar8, 0);
                            }
                        }
                        dVar8 = dVar9;
                    }
                }
                dVar8 = dVar9;
            }
            i36++;
        }
    }

    public final int c() {
        return this.f25338a == 1 ? this.f25349m - this.f25353r.Q0 : this.f25349m;
    }

    public final int d() {
        return this.f25338a == 0 ? this.f25348l - this.f25353r.P0 : this.f25348l;
    }

    public final void e(int i5) {
        g gVar;
        int i10;
        int i11 = this.f25352p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f25351o;
        int i13 = i5 / i11;
        int i14 = 0;
        while (true) {
            gVar = this.f25353r;
            if (i14 >= i12 || (i10 = this.f25350n + i14) >= gVar.f25355b1) {
                break;
            }
            d dVar = gVar.f25354a1[i10];
            if (this.f25338a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f25320p0;
                    if (iArr[0] == 3 && dVar.f25321r == 0) {
                        gVar.V(1, i13, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f25320p0;
                if (iArr2[1] == 3 && dVar.f25322s == 0) {
                    int i15 = i13;
                    gVar.V(iArr2[0], dVar.q(), 1, i15, dVar);
                    i13 = i15;
                }
            }
            i14++;
        }
        this.f25348l = 0;
        this.f25349m = 0;
        this.f25339b = null;
        this.f25340c = 0;
        int i16 = this.f25351o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f25350n + i17;
            if (i18 >= gVar.f25355b1) {
                return;
            }
            d dVar2 = gVar.f25354a1[i18];
            if (this.f25338a == 0) {
                int q = dVar2.q();
                int i19 = gVar.P0;
                if (dVar2.f25305g0 == 8) {
                    i19 = 0;
                }
                this.f25348l = q + i19 + this.f25348l;
                int T = gVar.T(dVar2, this.q);
                if (this.f25339b == null || this.f25340c < T) {
                    this.f25339b = dVar2;
                    this.f25340c = T;
                    this.f25349m = T;
                }
            } else {
                int U = gVar.U(dVar2, this.q);
                int T2 = gVar.T(dVar2, this.q);
                int i20 = gVar.Q0;
                if (dVar2.f25305g0 == 8) {
                    i20 = 0;
                }
                this.f25349m = T2 + i20 + this.f25349m;
                if (this.f25339b == null || this.f25340c < U) {
                    this.f25339b = dVar2;
                    this.f25340c = U;
                    this.f25348l = U;
                }
            }
        }
    }

    public final void f(int i5, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f25338a = i5;
        this.f25341d = cVar;
        this.f25342e = cVar2;
        this.f25343f = cVar3;
        this.f25344g = cVar4;
        this.f25345h = i10;
        this.f25346i = i11;
        this.j = i12;
        this.f25347k = i13;
        this.q = i14;
    }
}
