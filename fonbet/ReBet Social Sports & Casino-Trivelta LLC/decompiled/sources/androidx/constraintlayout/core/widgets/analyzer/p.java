package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f17866a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.e f17867b;

    /* renamed from: c, reason: collision with root package name */
    public m f17868c;

    /* renamed from: d, reason: collision with root package name */
    public e.b f17869d;

    /* renamed from: e, reason: collision with root package name */
    public g f17870e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f17871f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17872g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f17873h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f17874i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public b f17875j = b.NONE;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[d.a.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(androidx.constraintlayout.core.widgets.e eVar) {
        this.f17867b = eVar;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public abstract void a(d dVar);

    public final void b(f fVar, f fVar2, int i10) {
        fVar.f17829l.add(fVar2);
        fVar.f17823f = i10;
        fVar2.f17828k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f17829l.add(fVar2);
        fVar.f17829l.add(this.f17870e);
        fVar.f17825h = i10;
        fVar.f17826i = gVar;
        fVar2.f17828k.add(fVar);
        gVar.f17828k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            androidx.constraintlayout.core.widgets.e eVar = this.f17867b;
            int i12 = eVar.f17993x;
            int max = Math.max(eVar.f17991w, i10);
            if (i12 > 0) {
                max = Math.min(i12, i10);
            }
            if (max != i10) {
                return max;
            }
        } else {
            androidx.constraintlayout.core.widgets.e eVar2 = this.f17867b;
            int i13 = eVar2.f17921A;
            int max2 = Math.max(eVar2.f17997z, i10);
            if (i13 > 0) {
                max2 = Math.min(i13, i10);
            }
            if (max2 != i10) {
                return max2;
            }
        }
        return i10;
    }

    public final f h(androidx.constraintlayout.core.widgets.d dVar) {
        androidx.constraintlayout.core.widgets.d dVar2 = dVar.f17907f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.e eVar = dVar2.f17905d;
        int i10 = a.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[dVar2.f17906e.ordinal()];
        if (i10 == 1) {
            return eVar.f17953d.f17873h;
        }
        if (i10 == 2) {
            return eVar.f17953d.f17874i;
        }
        if (i10 == 3) {
            return eVar.f17955e.f17873h;
        }
        if (i10 == 4) {
            return eVar.f17955e.f17850k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f17955e.f17874i;
    }

    public final f i(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        androidx.constraintlayout.core.widgets.d dVar2 = dVar.f17907f;
        if (dVar2 == null) {
            return null;
        }
        androidx.constraintlayout.core.widgets.e eVar = dVar2.f17905d;
        p pVar = i10 == 0 ? eVar.f17953d : eVar.f17955e;
        int i11 = a.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[dVar2.f17906e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f17874i;
        }
        return pVar.f17873h;
    }

    public long j() {
        if (this.f17870e.f17827j) {
            return r0.f17824g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f17872g;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f17866a;
        if (i12 == 0) {
            this.f17870e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f17870e.d(Math.min(g(this.f17870e.f17838m, i10), i11));
            return;
        }
        if (i12 == 2) {
            androidx.constraintlayout.core.widgets.e K10 = this.f17867b.K();
            if (K10 != null) {
                if ((i10 == 0 ? K10.f17953d : K10.f17955e).f17870e.f17827j) {
                    this.f17870e.d(g((int) ((r9.f17824g * (i10 == 0 ? this.f17867b.f17995y : this.f17867b.f17922B)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        androidx.constraintlayout.core.widgets.e eVar = this.f17867b;
        p pVar = eVar.f17953d;
        e.b bVar = pVar.f17869d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f17866a == 3) {
            n nVar = eVar.f17955e;
            if (nVar.f17869d == bVar2 && nVar.f17866a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar.f17955e;
        }
        if (pVar.f17870e.f17827j) {
            float v10 = eVar.v();
            this.f17870e.d(i10 == 1 ? (int) ((pVar.f17870e.f17824g / v10) + 0.5f) : (int) ((v10 * pVar.f17870e.f17824g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, androidx.constraintlayout.core.widgets.d dVar2, androidx.constraintlayout.core.widgets.d dVar3, int i10) {
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f17827j && h11.f17827j) {
            int f10 = h10.f17824g + dVar2.f();
            int f11 = h11.f17824g - dVar3.f();
            int i11 = f11 - f10;
            if (!this.f17870e.f17827j && this.f17869d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f17870e;
            if (gVar.f17827j) {
                if (gVar.f17824g == i11) {
                    this.f17873h.d(f10);
                    this.f17874i.d(f11);
                    return;
                }
                float y10 = i10 == 0 ? this.f17867b.y() : this.f17867b.R();
                if (h10 == h11) {
                    f10 = h10.f17824g;
                    f11 = h11.f17824g;
                    y10 = 0.5f;
                }
                this.f17873h.d((int) (f10 + 0.5f + (((f11 - f10) - this.f17870e.f17824g) * y10)));
                this.f17874i.d(this.f17873h.f17824g + this.f17870e.f17824g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}
