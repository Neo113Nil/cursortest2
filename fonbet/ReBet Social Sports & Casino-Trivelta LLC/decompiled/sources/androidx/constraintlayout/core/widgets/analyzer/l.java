package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* loaded from: classes.dex */
public class l extends p {
    private static int[] sTempDimensions = new int[2];

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType;

        static {
            int[] iArr = new int[p.b.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        this.f17873h.f17822e = f.a.LEFT;
        this.f17874i.f17822e = f.a.RIGHT;
        this.f17871f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a5, code lost:
    
        if (r7 != 1) goto L131;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(d dVar) {
        float f10;
        float v10;
        float f11;
        int i10;
        int i11 = a.$SwitchMap$androidx$constraintlayout$core$widgets$analyzer$WidgetRun$RunType[this.f17875j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            androidx.constraintlayout.core.widgets.e eVar = this.f17867b;
            n(dVar, eVar.f17931K, eVar.f17933M, 0);
            return;
        }
        if (!this.f17870e.f17827j && this.f17869d == e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f17867b;
            int i12 = eVar2.f17987u;
            if (i12 == 2) {
                androidx.constraintlayout.core.widgets.e K10 = eVar2.K();
                if (K10 != null) {
                    if (K10.f17953d.f17870e.f17827j) {
                        this.f17870e.d((int) ((r1.f17824g * this.f17867b.f17995y) + 0.5f));
                    }
                }
            } else if (i12 == 3) {
                int i13 = eVar2.f17989v;
                if (i13 == 0 || i13 == 3) {
                    n nVar = eVar2.f17955e;
                    f fVar = nVar.f17873h;
                    f fVar2 = nVar.f17874i;
                    boolean z10 = eVar2.f17931K.f17907f != null;
                    boolean z11 = eVar2.f17932L.f17907f != null;
                    boolean z12 = eVar2.f17933M.f17907f != null;
                    boolean z13 = eVar2.f17934N.f17907f != null;
                    int w10 = eVar2.w();
                    if (z10 && z11 && z12 && z13) {
                        float v11 = this.f17867b.v();
                        if (fVar.f17827j && fVar2.f17827j) {
                            f fVar3 = this.f17873h;
                            if (fVar3.f17820c && this.f17874i.f17820c) {
                                q(sTempDimensions, this.f17873h.f17823f + ((f) fVar3.f17829l.get(0)).f17824g, ((f) this.f17874i.f17829l.get(0)).f17824g - this.f17874i.f17823f, fVar.f17823f + fVar.f17824g, fVar2.f17824g - fVar2.f17823f, v11, w10);
                                this.f17870e.d(sTempDimensions[0]);
                                this.f17867b.f17955e.f17870e.d(sTempDimensions[1]);
                                return;
                            }
                            return;
                        }
                        f fVar4 = this.f17873h;
                        if (fVar4.f17827j) {
                            f fVar5 = this.f17874i;
                            if (fVar5.f17827j) {
                                if (!fVar.f17820c || !fVar2.f17820c) {
                                    return;
                                }
                                q(sTempDimensions, fVar4.f17824g + fVar4.f17823f, fVar5.f17824g - fVar5.f17823f, fVar.f17823f + ((f) fVar.f17829l.get(0)).f17824g, ((f) fVar2.f17829l.get(0)).f17824g - fVar2.f17823f, v11, w10);
                                this.f17870e.d(sTempDimensions[0]);
                                this.f17867b.f17955e.f17870e.d(sTempDimensions[1]);
                            }
                        }
                        f fVar6 = this.f17873h;
                        if (!fVar6.f17820c || !this.f17874i.f17820c || !fVar.f17820c || !fVar2.f17820c) {
                            return;
                        }
                        q(sTempDimensions, this.f17873h.f17823f + ((f) fVar6.f17829l.get(0)).f17824g, ((f) this.f17874i.f17829l.get(0)).f17824g - this.f17874i.f17823f, fVar.f17823f + ((f) fVar.f17829l.get(0)).f17824g, ((f) fVar2.f17829l.get(0)).f17824g - fVar2.f17823f, v11, w10);
                        this.f17870e.d(sTempDimensions[0]);
                        this.f17867b.f17955e.f17870e.d(sTempDimensions[1]);
                    } else if (z10 && z12) {
                        if (!this.f17873h.f17820c || !this.f17874i.f17820c) {
                            return;
                        }
                        float v12 = this.f17867b.v();
                        int i14 = ((f) this.f17873h.f17829l.get(0)).f17824g + this.f17873h.f17823f;
                        int i15 = ((f) this.f17874i.f17829l.get(0)).f17824g - this.f17874i.f17823f;
                        if (w10 == -1 || w10 == 0) {
                            int g10 = g(i15 - i14, 0);
                            int i16 = (int) ((g10 * v12) + 0.5f);
                            int g11 = g(i16, 1);
                            if (i16 != g11) {
                                g10 = (int) ((g11 / v12) + 0.5f);
                            }
                            this.f17870e.d(g10);
                            this.f17867b.f17955e.f17870e.d(g11);
                        } else if (w10 == 1) {
                            int g12 = g(i15 - i14, 0);
                            int i17 = (int) ((g12 / v12) + 0.5f);
                            int g13 = g(i17, 1);
                            if (i17 != g13) {
                                g12 = (int) ((g13 * v12) + 0.5f);
                            }
                            this.f17870e.d(g12);
                            this.f17867b.f17955e.f17870e.d(g13);
                        }
                    } else if (z11 && z13) {
                        if (!fVar.f17820c || !fVar2.f17820c) {
                            return;
                        }
                        float v13 = this.f17867b.v();
                        int i18 = ((f) fVar.f17829l.get(0)).f17824g + fVar.f17823f;
                        int i19 = ((f) fVar2.f17829l.get(0)).f17824g - fVar2.f17823f;
                        if (w10 != -1) {
                            if (w10 == 0) {
                                int g14 = g(i19 - i18, 1);
                                int i20 = (int) ((g14 * v13) + 0.5f);
                                int g15 = g(i20, 0);
                                if (i20 != g15) {
                                    g14 = (int) ((g15 / v13) + 0.5f);
                                }
                                this.f17870e.d(g15);
                                this.f17867b.f17955e.f17870e.d(g14);
                            }
                        }
                        int g16 = g(i19 - i18, 1);
                        int i21 = (int) ((g16 / v13) + 0.5f);
                        int g17 = g(i21, 0);
                        if (i21 != g17) {
                            g16 = (int) ((g17 * v13) + 0.5f);
                        }
                        this.f17870e.d(g17);
                        this.f17867b.f17955e.f17870e.d(g16);
                    }
                } else {
                    int w11 = eVar2.w();
                    if (w11 == -1) {
                        androidx.constraintlayout.core.widgets.e eVar3 = this.f17867b;
                        f10 = eVar3.f17955e.f17870e.f17824g;
                        v10 = eVar3.v();
                    } else if (w11 == 0) {
                        f11 = r1.f17955e.f17870e.f17824g / this.f17867b.v();
                        i10 = (int) (f11 + 0.5f);
                        this.f17870e.d(i10);
                    } else if (w11 != 1) {
                        i10 = 0;
                        this.f17870e.d(i10);
                    } else {
                        androidx.constraintlayout.core.widgets.e eVar4 = this.f17867b;
                        f10 = eVar4.f17955e.f17870e.f17824g;
                        v10 = eVar4.v();
                    }
                    f11 = f10 * v10;
                    i10 = (int) (f11 + 0.5f);
                    this.f17870e.d(i10);
                }
            }
        }
        f fVar7 = this.f17873h;
        if (fVar7.f17820c) {
            f fVar8 = this.f17874i;
            if (fVar8.f17820c) {
                if (fVar7.f17827j && fVar8.f17827j && this.f17870e.f17827j) {
                    return;
                }
                if (!this.f17870e.f17827j && this.f17869d == e.b.MATCH_CONSTRAINT) {
                    androidx.constraintlayout.core.widgets.e eVar5 = this.f17867b;
                    if (eVar5.f17987u == 0 && !eVar5.i0()) {
                        f fVar9 = (f) this.f17873h.f17829l.get(0);
                        f fVar10 = (f) this.f17874i.f17829l.get(0);
                        int i22 = fVar9.f17824g;
                        f fVar11 = this.f17873h;
                        int i23 = i22 + fVar11.f17823f;
                        int i24 = fVar10.f17824g + this.f17874i.f17823f;
                        fVar11.d(i23);
                        this.f17874i.d(i24);
                        this.f17870e.d(i24 - i23);
                        return;
                    }
                }
                if (!this.f17870e.f17827j && this.f17869d == e.b.MATCH_CONSTRAINT && this.f17866a == 1 && this.f17873h.f17829l.size() > 0 && this.f17874i.f17829l.size() > 0) {
                    int min = Math.min((((f) this.f17874i.f17829l.get(0)).f17824g + this.f17874i.f17823f) - (((f) this.f17873h.f17829l.get(0)).f17824g + this.f17873h.f17823f), this.f17870e.f17838m);
                    androidx.constraintlayout.core.widgets.e eVar6 = this.f17867b;
                    int i25 = eVar6.f17993x;
                    int max = Math.max(eVar6.f17991w, min);
                    if (i25 > 0) {
                        max = Math.min(i25, max);
                    }
                    this.f17870e.d(max);
                }
                if (this.f17870e.f17827j) {
                    f fVar12 = (f) this.f17873h.f17829l.get(0);
                    f fVar13 = (f) this.f17874i.f17829l.get(0);
                    int i26 = fVar12.f17824g + this.f17873h.f17823f;
                    int i27 = fVar13.f17824g + this.f17874i.f17823f;
                    float y10 = this.f17867b.y();
                    if (fVar12 == fVar13) {
                        i26 = fVar12.f17824g;
                        i27 = fVar13.f17824g;
                        y10 = 0.5f;
                    }
                    this.f17873h.d((int) (i26 + 0.5f + (((i27 - i26) - this.f17870e.f17824g) * y10)));
                    this.f17874i.d(this.f17873h.f17824g + this.f17870e.f17824g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void d() {
        androidx.constraintlayout.core.widgets.e K10;
        androidx.constraintlayout.core.widgets.e K11;
        androidx.constraintlayout.core.widgets.e eVar = this.f17867b;
        if (eVar.f17947a) {
            this.f17870e.d(eVar.W());
        }
        if (this.f17870e.f17827j) {
            e.b bVar = this.f17869d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (K10 = this.f17867b.K()) != null && (K10.A() == e.b.FIXED || K10.A() == bVar2)) {
                b(this.f17873h, K10.f17953d.f17873h, this.f17867b.f17931K.f());
                b(this.f17874i, K10.f17953d.f17874i, -this.f17867b.f17933M.f());
                return;
            }
        } else {
            e.b A10 = this.f17867b.A();
            this.f17869d = A10;
            if (A10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (A10 == bVar3 && (K11 = this.f17867b.K()) != null && (K11.A() == e.b.FIXED || K11.A() == bVar3)) {
                    int W10 = (K11.W() - this.f17867b.f17931K.f()) - this.f17867b.f17933M.f();
                    b(this.f17873h, K11.f17953d.f17873h, this.f17867b.f17931K.f());
                    b(this.f17874i, K11.f17953d.f17874i, -this.f17867b.f17933M.f());
                    this.f17870e.d(W10);
                    return;
                }
                if (this.f17869d == e.b.FIXED) {
                    this.f17870e.d(this.f17867b.W());
                }
            }
        }
        g gVar = this.f17870e;
        if (gVar.f17827j) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f17867b;
            if (eVar2.f17947a) {
                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar2.mListAnchors;
                androidx.constraintlayout.core.widgets.d dVar = dVarArr[0];
                androidx.constraintlayout.core.widgets.d dVar2 = dVar.f17907f;
                if (dVar2 != null && dVarArr[1].f17907f != null) {
                    if (eVar2.i0()) {
                        this.f17873h.f17823f = this.f17867b.mListAnchors[0].f();
                        this.f17874i.f17823f = -this.f17867b.mListAnchors[1].f();
                        return;
                    }
                    f h10 = h(this.f17867b.mListAnchors[0]);
                    if (h10 != null) {
                        b(this.f17873h, h10, this.f17867b.mListAnchors[0].f());
                    }
                    f h11 = h(this.f17867b.mListAnchors[1]);
                    if (h11 != null) {
                        b(this.f17874i, h11, -this.f17867b.mListAnchors[1].f());
                    }
                    this.f17873h.f17819b = true;
                    this.f17874i.f17819b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f17873h, h12, this.f17867b.mListAnchors[0].f());
                        b(this.f17874i, this.f17873h, this.f17870e.f17824g);
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar3 = dVarArr[1];
                if (dVar3.f17907f != null) {
                    f h13 = h(dVar3);
                    if (h13 != null) {
                        b(this.f17874i, h13, -this.f17867b.mListAnchors[1].f());
                        b(this.f17873h, this.f17874i, -this.f17870e.f17824g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.core.widgets.i) || eVar2.K() == null || this.f17867b.o(d.a.CENTER).f17907f != null) {
                    return;
                }
                b(this.f17873h, this.f17867b.K().f17953d.f17873h, this.f17867b.X());
                b(this.f17874i, this.f17873h, this.f17870e.f17824g);
                return;
            }
        }
        if (this.f17869d == e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.core.widgets.e eVar3 = this.f17867b;
            int i10 = eVar3.f17987u;
            if (i10 == 2) {
                androidx.constraintlayout.core.widgets.e K12 = eVar3.K();
                if (K12 != null) {
                    g gVar2 = K12.f17955e.f17870e;
                    this.f17870e.f17829l.add(gVar2);
                    gVar2.f17828k.add(this.f17870e);
                    g gVar3 = this.f17870e;
                    gVar3.f17819b = true;
                    gVar3.f17828k.add(this.f17873h);
                    this.f17870e.f17828k.add(this.f17874i);
                }
            } else if (i10 == 3) {
                if (eVar3.f17989v == 3) {
                    this.f17873h.f17818a = this;
                    this.f17874i.f17818a = this;
                    n nVar = eVar3.f17955e;
                    nVar.f17873h.f17818a = this;
                    nVar.f17874i.f17818a = this;
                    gVar.f17818a = this;
                    if (eVar3.k0()) {
                        this.f17870e.f17829l.add(this.f17867b.f17955e.f17870e);
                        this.f17867b.f17955e.f17870e.f17828k.add(this.f17870e);
                        n nVar2 = this.f17867b.f17955e;
                        nVar2.f17870e.f17818a = this;
                        this.f17870e.f17829l.add(nVar2.f17873h);
                        this.f17870e.f17829l.add(this.f17867b.f17955e.f17874i);
                        this.f17867b.f17955e.f17873h.f17828k.add(this.f17870e);
                        this.f17867b.f17955e.f17874i.f17828k.add(this.f17870e);
                    } else if (this.f17867b.i0()) {
                        this.f17867b.f17955e.f17870e.f17829l.add(this.f17870e);
                        this.f17870e.f17828k.add(this.f17867b.f17955e.f17870e);
                    } else {
                        this.f17867b.f17955e.f17870e.f17829l.add(this.f17870e);
                    }
                } else {
                    g gVar4 = eVar3.f17955e.f17870e;
                    gVar.f17829l.add(gVar4);
                    gVar4.f17828k.add(this.f17870e);
                    this.f17867b.f17955e.f17873h.f17828k.add(this.f17870e);
                    this.f17867b.f17955e.f17874i.f17828k.add(this.f17870e);
                    g gVar5 = this.f17870e;
                    gVar5.f17819b = true;
                    gVar5.f17828k.add(this.f17873h);
                    this.f17870e.f17828k.add(this.f17874i);
                    this.f17873h.f17829l.add(this.f17870e);
                    this.f17874i.f17829l.add(this.f17870e);
                }
            }
        }
        androidx.constraintlayout.core.widgets.e eVar4 = this.f17867b;
        androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar4.mListAnchors;
        androidx.constraintlayout.core.widgets.d dVar4 = dVarArr2[0];
        androidx.constraintlayout.core.widgets.d dVar5 = dVar4.f17907f;
        if (dVar5 != null && dVarArr2[1].f17907f != null) {
            if (eVar4.i0()) {
                this.f17873h.f17823f = this.f17867b.mListAnchors[0].f();
                this.f17874i.f17823f = -this.f17867b.mListAnchors[1].f();
                return;
            }
            f h14 = h(this.f17867b.mListAnchors[0]);
            f h15 = h(this.f17867b.mListAnchors[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f17875j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h16 = h(dVar4);
            if (h16 != null) {
                b(this.f17873h, h16, this.f17867b.mListAnchors[0].f());
                c(this.f17874i, this.f17873h, 1, this.f17870e);
                return;
            }
            return;
        }
        androidx.constraintlayout.core.widgets.d dVar6 = dVarArr2[1];
        if (dVar6.f17907f != null) {
            f h17 = h(dVar6);
            if (h17 != null) {
                b(this.f17874i, h17, -this.f17867b.mListAnchors[1].f());
                c(this.f17873h, this.f17874i, -1, this.f17870e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof androidx.constraintlayout.core.widgets.i) || eVar4.K() == null) {
            return;
        }
        b(this.f17873h, this.f17867b.K().f17953d.f17873h, this.f17867b.X());
        c(this.f17874i, this.f17873h, 1, this.f17870e);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f17873h;
        if (fVar.f17827j) {
            this.f17867b.n1(fVar.f17824g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f17868c = null;
        this.f17873h.c();
        this.f17874i.c();
        this.f17870e.c();
        this.f17872g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public boolean m() {
        return this.f17869d != e.b.MATCH_CONSTRAINT || this.f17867b.f17987u == 0;
    }

    public final void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    public void r() {
        this.f17872g = false;
        this.f17873h.c();
        this.f17873h.f17827j = false;
        this.f17874i.c();
        this.f17874i.f17827j = false;
        this.f17870e.f17827j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f17867b.t();
    }
}
