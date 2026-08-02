package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.analyzer.f;
import androidx.constraintlayout.core.widgets.analyzer.p;
import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f17850k;

    /* renamed from: l, reason: collision with root package name */
    public g f17851l;

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

    public n(androidx.constraintlayout.core.widgets.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f17850k = fVar;
        this.f17851l = null;
        this.f17873h.f17822e = f.a.TOP;
        this.f17874i.f17822e = f.a.BOTTOM;
        fVar.f17822e = f.a.BASELINE;
        this.f17871f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p, androidx.constraintlayout.core.widgets.analyzer.d
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
            n(dVar, eVar.f17932L, eVar.f17934N, 1);
            return;
        }
        g gVar = this.f17870e;
        if (gVar.f17820c && !gVar.f17827j && this.f17869d == e.b.MATCH_CONSTRAINT) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f17867b;
            int i12 = eVar2.f17989v;
            if (i12 == 2) {
                androidx.constraintlayout.core.widgets.e K10 = eVar2.K();
                if (K10 != null) {
                    if (K10.f17955e.f17870e.f17827j) {
                        this.f17870e.d((int) ((r7.f17824g * this.f17867b.f17922B) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f17953d.f17870e.f17827j) {
                int w10 = eVar2.w();
                if (w10 == -1) {
                    androidx.constraintlayout.core.widgets.e eVar3 = this.f17867b;
                    f10 = eVar3.f17953d.f17870e.f17824g;
                    v10 = eVar3.v();
                } else if (w10 == 0) {
                    f11 = r7.f17953d.f17870e.f17824g * this.f17867b.v();
                    i10 = (int) (f11 + 0.5f);
                    this.f17870e.d(i10);
                } else if (w10 != 1) {
                    i10 = 0;
                    this.f17870e.d(i10);
                } else {
                    androidx.constraintlayout.core.widgets.e eVar4 = this.f17867b;
                    f10 = eVar4.f17953d.f17870e.f17824g;
                    v10 = eVar4.v();
                }
                f11 = f10 / v10;
                i10 = (int) (f11 + 0.5f);
                this.f17870e.d(i10);
            }
        }
        f fVar = this.f17873h;
        if (fVar.f17820c) {
            f fVar2 = this.f17874i;
            if (fVar2.f17820c) {
                if (fVar.f17827j && fVar2.f17827j && this.f17870e.f17827j) {
                    return;
                }
                if (!this.f17870e.f17827j && this.f17869d == e.b.MATCH_CONSTRAINT) {
                    androidx.constraintlayout.core.widgets.e eVar5 = this.f17867b;
                    if (eVar5.f17987u == 0 && !eVar5.k0()) {
                        f fVar3 = (f) this.f17873h.f17829l.get(0);
                        f fVar4 = (f) this.f17874i.f17829l.get(0);
                        int i13 = fVar3.f17824g;
                        f fVar5 = this.f17873h;
                        int i14 = i13 + fVar5.f17823f;
                        int i15 = fVar4.f17824g + this.f17874i.f17823f;
                        fVar5.d(i14);
                        this.f17874i.d(i15);
                        this.f17870e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f17870e.f17827j && this.f17869d == e.b.MATCH_CONSTRAINT && this.f17866a == 1 && this.f17873h.f17829l.size() > 0 && this.f17874i.f17829l.size() > 0) {
                    f fVar6 = (f) this.f17873h.f17829l.get(0);
                    int i16 = (((f) this.f17874i.f17829l.get(0)).f17824g + this.f17874i.f17823f) - (fVar6.f17824g + this.f17873h.f17823f);
                    g gVar2 = this.f17870e;
                    int i17 = gVar2.f17838m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f17870e.f17827j && this.f17873h.f17829l.size() > 0 && this.f17874i.f17829l.size() > 0) {
                    f fVar7 = (f) this.f17873h.f17829l.get(0);
                    f fVar8 = (f) this.f17874i.f17829l.get(0);
                    int i18 = fVar7.f17824g + this.f17873h.f17823f;
                    int i19 = fVar8.f17824g + this.f17874i.f17823f;
                    float R10 = this.f17867b.R();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f17824g;
                        i19 = fVar8.f17824g;
                        R10 = 0.5f;
                    }
                    this.f17873h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f17870e.f17824g) * R10)));
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
            this.f17870e.d(eVar.x());
        }
        if (!this.f17870e.f17827j) {
            this.f17869d = this.f17867b.T();
            if (this.f17867b.Z()) {
                this.f17851l = new androidx.constraintlayout.core.widgets.analyzer.a(this);
            }
            e.b bVar = this.f17869d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (K11 = this.f17867b.K()) != null && K11.T() == e.b.FIXED) {
                    int x10 = (K11.x() - this.f17867b.f17932L.f()) - this.f17867b.f17934N.f();
                    b(this.f17873h, K11.f17955e.f17873h, this.f17867b.f17932L.f());
                    b(this.f17874i, K11.f17955e.f17874i, -this.f17867b.f17934N.f());
                    this.f17870e.d(x10);
                    return;
                }
                if (this.f17869d == e.b.FIXED) {
                    this.f17870e.d(this.f17867b.x());
                }
            }
        } else if (this.f17869d == e.b.MATCH_PARENT && (K10 = this.f17867b.K()) != null && K10.T() == e.b.FIXED) {
            b(this.f17873h, K10.f17955e.f17873h, this.f17867b.f17932L.f());
            b(this.f17874i, K10.f17955e.f17874i, -this.f17867b.f17934N.f());
            return;
        }
        g gVar = this.f17870e;
        boolean z10 = gVar.f17827j;
        if (z10) {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f17867b;
            if (eVar2.f17947a) {
                androidx.constraintlayout.core.widgets.d[] dVarArr = eVar2.mListAnchors;
                androidx.constraintlayout.core.widgets.d dVar = dVarArr[2];
                androidx.constraintlayout.core.widgets.d dVar2 = dVar.f17907f;
                if (dVar2 != null && dVarArr[3].f17907f != null) {
                    if (eVar2.k0()) {
                        this.f17873h.f17823f = this.f17867b.mListAnchors[2].f();
                        this.f17874i.f17823f = -this.f17867b.mListAnchors[3].f();
                    } else {
                        f h10 = h(this.f17867b.mListAnchors[2]);
                        if (h10 != null) {
                            b(this.f17873h, h10, this.f17867b.mListAnchors[2].f());
                        }
                        f h11 = h(this.f17867b.mListAnchors[3]);
                        if (h11 != null) {
                            b(this.f17874i, h11, -this.f17867b.mListAnchors[3].f());
                        }
                        this.f17873h.f17819b = true;
                        this.f17874i.f17819b = true;
                    }
                    if (this.f17867b.Z()) {
                        b(this.f17850k, this.f17873h, this.f17867b.p());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f17873h, h12, this.f17867b.mListAnchors[2].f());
                        b(this.f17874i, this.f17873h, this.f17870e.f17824g);
                        if (this.f17867b.Z()) {
                            b(this.f17850k, this.f17873h, this.f17867b.p());
                            return;
                        }
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar3 = dVarArr[3];
                if (dVar3.f17907f != null) {
                    f h13 = h(dVar3);
                    if (h13 != null) {
                        b(this.f17874i, h13, -this.f17867b.mListAnchors[3].f());
                        b(this.f17873h, this.f17874i, -this.f17870e.f17824g);
                    }
                    if (this.f17867b.Z()) {
                        b(this.f17850k, this.f17873h, this.f17867b.p());
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar4 = dVarArr[4];
                if (dVar4.f17907f != null) {
                    f h14 = h(dVar4);
                    if (h14 != null) {
                        b(this.f17850k, h14, 0);
                        b(this.f17873h, this.f17850k, -this.f17867b.p());
                        b(this.f17874i, this.f17873h, this.f17870e.f17824g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof androidx.constraintlayout.core.widgets.i) || eVar2.K() == null || this.f17867b.o(d.a.CENTER).f17907f != null) {
                    return;
                }
                b(this.f17873h, this.f17867b.K().f17955e.f17873h, this.f17867b.Y());
                b(this.f17874i, this.f17873h, this.f17870e.f17824g);
                if (this.f17867b.Z()) {
                    b(this.f17850k, this.f17873h, this.f17867b.p());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f17869d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            androidx.constraintlayout.core.widgets.e eVar3 = this.f17867b;
            int i10 = eVar3.f17989v;
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
            } else if (i10 == 3 && !eVar3.k0()) {
                androidx.constraintlayout.core.widgets.e eVar4 = this.f17867b;
                if (eVar4.f17987u != 3) {
                    g gVar4 = eVar4.f17953d.f17870e;
                    this.f17870e.f17829l.add(gVar4);
                    gVar4.f17828k.add(this.f17870e);
                    g gVar5 = this.f17870e;
                    gVar5.f17819b = true;
                    gVar5.f17828k.add(this.f17873h);
                    this.f17870e.f17828k.add(this.f17874i);
                }
            }
        }
        androidx.constraintlayout.core.widgets.e eVar5 = this.f17867b;
        androidx.constraintlayout.core.widgets.d[] dVarArr2 = eVar5.mListAnchors;
        androidx.constraintlayout.core.widgets.d dVar5 = dVarArr2[2];
        androidx.constraintlayout.core.widgets.d dVar6 = dVar5.f17907f;
        if (dVar6 != null && dVarArr2[3].f17907f != null) {
            if (eVar5.k0()) {
                this.f17873h.f17823f = this.f17867b.mListAnchors[2].f();
                this.f17874i.f17823f = -this.f17867b.mListAnchors[3].f();
            } else {
                f h15 = h(this.f17867b.mListAnchors[2]);
                f h16 = h(this.f17867b.mListAnchors[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f17875j = p.b.CENTER;
            }
            if (this.f17867b.Z()) {
                c(this.f17850k, this.f17873h, 1, this.f17851l);
            }
        } else if (dVar6 != null) {
            f h17 = h(dVar5);
            if (h17 != null) {
                b(this.f17873h, h17, this.f17867b.mListAnchors[2].f());
                c(this.f17874i, this.f17873h, 1, this.f17870e);
                if (this.f17867b.Z()) {
                    c(this.f17850k, this.f17873h, 1, this.f17851l);
                }
                e.b bVar2 = this.f17869d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f17867b.v() > 0.0f) {
                    l lVar = this.f17867b.f17953d;
                    if (lVar.f17869d == bVar3) {
                        lVar.f17870e.f17828k.add(this.f17870e);
                        this.f17870e.f17829l.add(this.f17867b.f17953d.f17870e);
                        this.f17870e.f17818a = this;
                    }
                }
            }
        } else {
            androidx.constraintlayout.core.widgets.d dVar7 = dVarArr2[3];
            if (dVar7.f17907f != null) {
                f h18 = h(dVar7);
                if (h18 != null) {
                    b(this.f17874i, h18, -this.f17867b.mListAnchors[3].f());
                    c(this.f17873h, this.f17874i, -1, this.f17870e);
                    if (this.f17867b.Z()) {
                        c(this.f17850k, this.f17873h, 1, this.f17851l);
                    }
                }
            } else {
                androidx.constraintlayout.core.widgets.d dVar8 = dVarArr2[4];
                if (dVar8.f17907f != null) {
                    f h19 = h(dVar8);
                    if (h19 != null) {
                        b(this.f17850k, h19, 0);
                        c(this.f17873h, this.f17850k, -1, this.f17851l);
                        c(this.f17874i, this.f17873h, 1, this.f17870e);
                    }
                } else if (!(eVar5 instanceof androidx.constraintlayout.core.widgets.i) && eVar5.K() != null) {
                    b(this.f17873h, this.f17867b.K().f17955e.f17873h, this.f17867b.Y());
                    c(this.f17874i, this.f17873h, 1, this.f17870e);
                    if (this.f17867b.Z()) {
                        c(this.f17850k, this.f17873h, 1, this.f17851l);
                    }
                    e.b bVar4 = this.f17869d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f17867b.v() > 0.0f) {
                        l lVar2 = this.f17867b.f17953d;
                        if (lVar2.f17869d == bVar5) {
                            lVar2.f17870e.f17828k.add(this.f17870e);
                            this.f17870e.f17829l.add(this.f17867b.f17953d.f17870e);
                            this.f17870e.f17818a = this;
                        }
                    }
                }
            }
        }
        if (this.f17870e.f17829l.size() == 0) {
            this.f17870e.f17820c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void e() {
        f fVar = this.f17873h;
        if (fVar.f17827j) {
            this.f17867b.o1(fVar.f17824g);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public void f() {
        this.f17868c = null;
        this.f17873h.c();
        this.f17874i.c();
        this.f17850k.c();
        this.f17870e.c();
        this.f17872g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.p
    public boolean m() {
        return this.f17869d != e.b.MATCH_CONSTRAINT || this.f17867b.f17989v == 0;
    }

    public void q() {
        this.f17872g = false;
        this.f17873h.c();
        this.f17873h.f17827j = false;
        this.f17874i.c();
        this.f17874i.f17827j = false;
        this.f17850k.c();
        this.f17850k.f17827j = false;
        this.f17870e.f17827j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f17867b.t();
    }
}
