package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.d;
import androidx.constraintlayout.core.widgets.e;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: B0, reason: collision with root package name */
    public float f18070B0 = -1.0f;

    /* renamed from: C0, reason: collision with root package name */
    public int f18071C0 = -1;

    /* renamed from: D0, reason: collision with root package name */
    public int f18072D0 = -1;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f18073E0 = true;

    /* renamed from: F0, reason: collision with root package name */
    public d f18074F0 = this.f17932L;

    /* renamed from: G0, reason: collision with root package name */
    public int f18075G0 = 0;

    /* renamed from: H0, reason: collision with root package name */
    public int f18076H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f18077I0;

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
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f17939S.clear();
        this.f17939S.add(this.f18074F0);
        int length = this.mListAnchors.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.mListAnchors[i10] = this.f18074F0;
        }
    }

    public void A1(float f10) {
        if (f10 > -1.0f) {
            this.f18070B0 = f10;
            this.f18071C0 = -1;
            this.f18072D0 = -1;
        }
    }

    public void B1(int i10) {
        if (this.f18075G0 == i10) {
            return;
        }
        this.f18075G0 = i10;
        this.f17939S.clear();
        if (this.f18075G0 == 1) {
            this.f18074F0 = this.f17931K;
        } else {
            this.f18074F0 = this.f17932L;
        }
        this.f17939S.add(this.f18074F0);
        int length = this.mListAnchors.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.mListAnchors[i11] = this.f18074F0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void g(androidx.constraintlayout.core.d dVar, boolean z10) {
        f fVar = (f) K();
        if (fVar == null) {
            return;
        }
        d o10 = fVar.o(d.a.LEFT);
        d o11 = fVar.o(d.a.RIGHT);
        e eVar = this.f17940T;
        boolean z11 = eVar != null && eVar.mListDimensionBehaviors[0] == e.b.WRAP_CONTENT;
        if (this.f18075G0 == 0) {
            o10 = fVar.o(d.a.TOP);
            o11 = fVar.o(d.a.BOTTOM);
            e eVar2 = this.f17940T;
            z11 = eVar2 != null && eVar2.mListDimensionBehaviors[1] == e.b.WRAP_CONTENT;
        }
        if (this.f18077I0 && this.f18074F0.n()) {
            androidx.constraintlayout.core.i q10 = dVar.q(this.f18074F0);
            dVar.f(q10, this.f18074F0.e());
            if (this.f18071C0 != -1) {
                if (z11) {
                    dVar.h(dVar.q(o11), q10, 0, 5);
                }
            } else if (this.f18072D0 != -1 && z11) {
                androidx.constraintlayout.core.i q11 = dVar.q(o11);
                dVar.h(q10, dVar.q(o10), 0, 5);
                dVar.h(q11, q10, 0, 5);
            }
            this.f18077I0 = false;
            return;
        }
        if (this.f18071C0 != -1) {
            androidx.constraintlayout.core.i q12 = dVar.q(this.f18074F0);
            dVar.e(q12, dVar.q(o10), this.f18071C0, 8);
            if (z11) {
                dVar.h(dVar.q(o11), q12, 0, 5);
                return;
            }
            return;
        }
        if (this.f18072D0 == -1) {
            if (this.f18070B0 != -1.0f) {
                dVar.d(androidx.constraintlayout.core.d.s(dVar, dVar.q(this.f18074F0), dVar.q(o11), this.f18070B0));
                return;
            }
            return;
        }
        androidx.constraintlayout.core.i q13 = dVar.q(this.f18074F0);
        androidx.constraintlayout.core.i q14 = dVar.q(o11);
        dVar.e(q13, q14, -this.f18072D0, 8);
        if (z11) {
            dVar.h(q13, dVar.q(o10), 0, 5);
            dVar.h(q14, q13, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean h() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean n0() {
        return this.f18077I0;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public d o(d.a aVar) {
        int i10 = a.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f18075G0 == 1) {
                return this.f18074F0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f18075G0 == 0) {
            return this.f18074F0;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public boolean o0() {
        return this.f18077I0;
    }

    @Override // androidx.constraintlayout.core.widgets.e
    public void r1(androidx.constraintlayout.core.d dVar, boolean z10) {
        if (K() == null) {
            return;
        }
        int y10 = dVar.y(this.f18074F0);
        if (this.f18075G0 == 1) {
            n1(y10);
            o1(0);
            M0(K().x());
            l1(0);
            return;
        }
        n1(0);
        o1(y10);
        l1(K().W());
        M0(0);
    }

    public d s1() {
        return this.f18074F0;
    }

    public int t1() {
        return this.f18075G0;
    }

    public int u1() {
        return this.f18071C0;
    }

    public int v1() {
        return this.f18072D0;
    }

    public float w1() {
        return this.f18070B0;
    }

    public void x1(int i10) {
        this.f18074F0.t(i10);
        this.f18077I0 = true;
    }

    public void y1(int i10) {
        if (i10 > -1) {
            this.f18070B0 = -1.0f;
            this.f18071C0 = i10;
            this.f18072D0 = -1;
        }
    }

    public void z1(int i10) {
        if (i10 > -1) {
            this.f18070B0 = -1.0f;
            this.f18071C0 = -1;
            this.f18072D0 = i10;
        }
    }
}
