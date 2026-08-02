package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import xsna.kt6;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public final class e extends i {
    public ConstraintWidget[] f1;
    public int I0 = -1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public float O0 = 0.5f;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public int U0 = 0;
    public int V0 = 0;
    public int W0 = 2;
    public int X0 = 2;
    public int Y0 = 0;
    public int Z0 = -1;
    public int a1 = 0;
    public final ArrayList<a> b1 = new ArrayList<>();
    public ConstraintWidget[] c1 = null;
    public ConstraintWidget[] d1 = null;
    public int[] e1 = null;
    public int g1 = 0;

    /* compiled from: Flow.java */
    /* loaded from: classes11.dex */
    public class a {
        public int a;
        public ConstraintAnchor d;
        public ConstraintAnchor e;
        public ConstraintAnchor f;
        public ConstraintAnchor g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int q;
        public ConstraintWidget b = null;
        public int c = 0;
        public int l = 0;
        public int m = 0;
        public int n = 0;
        public int o = 0;
        public int p = 0;

        public a(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2) {
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = e.this.B0;
            this.i = e.this.x0;
            this.j = e.this.C0;
            this.k = e.this.y0;
            this.q = i2;
        }

        public final void b(ConstraintWidget constraintWidget) {
            int i = this.a;
            e eVar = e.this;
            if (i == 0) {
                int d0 = eVar.d0(constraintWidget, this.q);
                if (constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    d0 = 0;
                }
                this.l = d0 + (constraintWidget.j0 != 8 ? eVar.U0 : 0) + this.l;
                int c0 = eVar.c0(constraintWidget, this.q);
                if (this.b == null || this.c < c0) {
                    this.b = constraintWidget;
                    this.c = c0;
                    this.m = c0;
                }
            } else {
                int d02 = eVar.d0(constraintWidget, this.q);
                int c02 = eVar.c0(constraintWidget, this.q);
                if (constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.p++;
                    c02 = 0;
                }
                this.m = c02 + (constraintWidget.j0 != 8 ? eVar.V0 : 0) + this.m;
                if (this.b == null || this.c < d02) {
                    this.b = constraintWidget;
                    this.c = d02;
                    this.l = d02;
                }
            }
            this.o++;
        }

        public final void c() {
            this.c = 0;
            this.b = null;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            this.o = 0;
            this.p = 0;
        }

        public final void d(int i, boolean z, boolean z2) {
            e eVar;
            int i2;
            int i3;
            int i4;
            ConstraintWidget constraintWidget;
            boolean z3;
            int i5;
            int i6;
            char c;
            float f;
            float f2;
            float f3;
            int i7;
            float f4;
            float f5;
            int i8;
            int i9 = this.o;
            int i10 = 0;
            while (true) {
                eVar = e.this;
                if (i10 >= i9 || (i8 = this.n + i10) >= eVar.g1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = eVar.f1[i8];
                if (constraintWidget2 != null) {
                    constraintWidget2.I();
                }
                i10++;
            }
            if (i9 == 0 || this.b == null) {
                return;
            }
            boolean z4 = z2 && i == 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < i9; i13++) {
                int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
                if (i14 >= eVar.g1) {
                    break;
                }
                ConstraintWidget constraintWidget3 = eVar.f1[i14];
                if (constraintWidget3 != null && constraintWidget3.j0 == 0) {
                    if (i11 == -1) {
                        i11 = i13;
                    }
                    i12 = i13;
                }
            }
            if (this.a == 0) {
                ConstraintWidget constraintWidget4 = this.b;
                constraintWidget4.n0 = eVar.J0;
                ConstraintAnchor constraintAnchor = constraintWidget4.N;
                ConstraintAnchor constraintAnchor2 = constraintWidget4.L;
                int i15 = this.i;
                if (i > 0) {
                    i15 += eVar.V0;
                }
                constraintAnchor2.a(this.e, i15);
                if (z2) {
                    constraintAnchor.a(this.g, this.k);
                }
                if (i > 0) {
                    this.e.d.N.a(constraintAnchor2, 0);
                }
                if (eVar.X0 == 3 && !constraintWidget4.F) {
                    for (int i16 = 0; i16 < i9; i16++) {
                        int i17 = this.n + (z ? (i9 - 1) - i16 : i16);
                        if (i17 >= eVar.g1) {
                            break;
                        }
                        constraintWidget = eVar.f1[i17];
                        if (constraintWidget.F) {
                            break;
                        }
                    }
                }
                constraintWidget = constraintWidget4;
                int i18 = 0;
                ConstraintWidget constraintWidget5 = null;
                while (i18 < i9) {
                    int i19 = z ? (i9 - 1) - i18 : i18;
                    int i20 = this.n + i19;
                    if (i20 >= eVar.g1) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = eVar.f1[i20];
                    if (constraintWidget6 == null) {
                        i6 = i9;
                        z3 = z4;
                        i5 = i12;
                        c = 3;
                    } else {
                        ConstraintAnchor constraintAnchor3 = constraintWidget6.N;
                        ConstraintAnchor constraintAnchor4 = constraintWidget6.L;
                        ConstraintAnchor constraintAnchor5 = constraintWidget6.K;
                        z3 = z4;
                        if (i18 == 0) {
                            i5 = i12;
                            constraintWidget6.j(constraintAnchor5, this.d, this.h);
                        } else {
                            i5 = i12;
                        }
                        if (i19 == 0) {
                            int i21 = eVar.I0;
                            if (z) {
                                f = 1.0f;
                                f2 = 1.0f - eVar.O0;
                            } else {
                                f = 1.0f;
                                f2 = eVar.O0;
                            }
                            if (this.n == 0) {
                                i7 = eVar.K0;
                                f3 = f2;
                                if (i7 != -1) {
                                    if (z) {
                                        f5 = eVar.Q0;
                                        f4 = f - f5;
                                        constraintWidget6.m0 = i7;
                                        constraintWidget6.g0 = f4;
                                    } else {
                                        f4 = eVar.Q0;
                                        constraintWidget6.m0 = i7;
                                        constraintWidget6.g0 = f4;
                                    }
                                }
                            } else {
                                f3 = f2;
                            }
                            if (!z2 || (i7 = eVar.M0) == -1) {
                                i7 = i21;
                                f4 = f3;
                            } else if (z) {
                                f5 = eVar.S0;
                                f4 = f - f5;
                            } else {
                                f4 = eVar.S0;
                            }
                            constraintWidget6.m0 = i7;
                            constraintWidget6.g0 = f4;
                        }
                        if (i18 == i9 - 1) {
                            i6 = i9;
                            constraintWidget6.j(constraintWidget6.M, this.f, this.j);
                        } else {
                            i6 = i9;
                        }
                        if (constraintWidget5 != null) {
                            ConstraintAnchor constraintAnchor6 = constraintWidget5.M;
                            constraintAnchor5.a(constraintAnchor6, eVar.U0);
                            if (i18 == i11) {
                                int i22 = this.h;
                                if (constraintAnchor5.h()) {
                                    constraintAnchor5.h = i22;
                                }
                            }
                            constraintAnchor6.a(constraintAnchor5, 0);
                            if (i18 == i5 + 1) {
                                int i23 = this.j;
                                if (constraintAnchor6.h()) {
                                    constraintAnchor6.h = i23;
                                }
                            }
                        }
                        if (constraintWidget6 != constraintWidget4) {
                            int i24 = eVar.X0;
                            c = 3;
                            if (i24 == 3 && constraintWidget.F && constraintWidget6 != constraintWidget && constraintWidget6.F) {
                                constraintWidget6.O.a(constraintWidget.O, 0);
                            } else if (i24 == 0) {
                                constraintAnchor4.a(constraintAnchor2, 0);
                            } else if (i24 == 1) {
                                constraintAnchor3.a(constraintAnchor, 0);
                            } else if (z3) {
                                constraintAnchor4.a(this.e, this.i);
                                constraintAnchor3.a(this.g, this.k);
                            } else {
                                constraintAnchor4.a(constraintAnchor2, 0);
                                constraintAnchor3.a(constraintAnchor, 0);
                            }
                        } else {
                            c = 3;
                        }
                        constraintWidget5 = constraintWidget6;
                    }
                    i18++;
                    z4 = z3;
                    i12 = i5;
                    i9 = i6;
                }
                return;
            }
            int i25 = i9;
            boolean z5 = z4;
            int i26 = i12;
            ConstraintWidget constraintWidget7 = this.b;
            constraintWidget7.m0 = eVar.I0;
            ConstraintAnchor constraintAnchor7 = constraintWidget7.K;
            ConstraintAnchor constraintAnchor8 = constraintWidget7.M;
            int i27 = this.h;
            if (i > 0) {
                i27 += eVar.U0;
            }
            if (z) {
                constraintAnchor8.a(this.f, i27);
                if (z2) {
                    constraintAnchor7.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.K.a(constraintAnchor8, 0);
                }
            } else {
                constraintAnchor7.a(this.d, i27);
                if (z2) {
                    constraintAnchor8.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.M.a(constraintAnchor7, 0);
                }
            }
            int i28 = 0;
            ConstraintWidget constraintWidget8 = null;
            while (true) {
                int i29 = i25;
                if (i28 >= i29 || (i2 = this.n + i28) >= eVar.g1) {
                    return;
                }
                ConstraintWidget constraintWidget9 = eVar.f1[i2];
                if (constraintWidget9 == null) {
                    i25 = i29;
                } else {
                    ConstraintAnchor constraintAnchor9 = constraintWidget9.L;
                    ConstraintAnchor constraintAnchor10 = constraintWidget9.M;
                    ConstraintAnchor constraintAnchor11 = constraintWidget9.K;
                    if (i28 == 0) {
                        constraintWidget9.j(constraintAnchor9, this.e, this.i);
                        int i30 = eVar.J0;
                        float f6 = eVar.P0;
                        if (this.n == 0) {
                            i4 = eVar.L0;
                            i25 = i29;
                            i3 = -1;
                            if (i4 != -1) {
                                f6 = eVar.R0;
                                i30 = i4;
                                constraintWidget9.n0 = i30;
                                constraintWidget9.h0 = f6;
                            }
                        } else {
                            i25 = i29;
                            i3 = -1;
                        }
                        if (z2 && (i4 = eVar.N0) != i3) {
                            f6 = eVar.T0;
                            i30 = i4;
                        }
                        constraintWidget9.n0 = i30;
                        constraintWidget9.h0 = f6;
                    } else {
                        i25 = i29;
                    }
                    if (i28 == i25 - 1) {
                        constraintWidget9.j(constraintWidget9.N, this.g, this.k);
                    }
                    if (constraintWidget8 != null) {
                        ConstraintAnchor constraintAnchor12 = constraintWidget8.N;
                        constraintAnchor9.a(constraintAnchor12, eVar.V0);
                        if (i28 == i11) {
                            int i31 = this.i;
                            if (constraintAnchor9.h()) {
                                constraintAnchor9.h = i31;
                            }
                        }
                        constraintAnchor12.a(constraintAnchor9, 0);
                        if (i28 == i26 + 1) {
                            int i32 = this.k;
                            if (constraintAnchor12.h()) {
                                constraintAnchor12.h = i32;
                            }
                        }
                    }
                    if (constraintWidget9 != constraintWidget7) {
                        if (z) {
                            int i33 = eVar.W0;
                            if (i33 == 0) {
                                constraintAnchor10.a(constraintAnchor8, 0);
                            } else if (i33 == 1) {
                                constraintAnchor11.a(constraintAnchor7, 0);
                            } else if (i33 == 2) {
                                constraintAnchor11.a(constraintAnchor7, 0);
                                constraintAnchor10.a(constraintAnchor8, 0);
                            }
                        } else {
                            int i34 = eVar.W0;
                            if (i34 == 0) {
                                constraintAnchor11.a(constraintAnchor7, 0);
                            } else if (i34 == 1) {
                                constraintAnchor10.a(constraintAnchor8, 0);
                            } else if (i34 == 2) {
                                if (z5) {
                                    constraintAnchor11.a(this.d, this.h);
                                    constraintAnchor10.a(this.f, this.j);
                                } else {
                                    constraintAnchor11.a(constraintAnchor7, 0);
                                    constraintAnchor10.a(constraintAnchor8, 0);
                                }
                            }
                            constraintWidget8 = constraintWidget9;
                        }
                    }
                    constraintWidget8 = constraintWidget9;
                }
                i28++;
            }
        }

        public final int e() {
            return this.a == 1 ? this.m - e.this.V0 : this.m;
        }

        public final int f() {
            return this.a == 0 ? this.l - e.this.U0 : this.l;
        }

        public final void g(int i) {
            int i2 = this.p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.n;
                int i7 = i6 + i5;
                e eVar = e.this;
                if (i7 >= eVar.g1) {
                    break;
                }
                ConstraintWidget constraintWidget = eVar.f1[i6 + i5];
                if (this.a == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                        if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.s == 0) {
                            eVar.b0(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i4, dimensionBehaviourArr[1], constraintWidget.p());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.V;
                    if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.t == 0) {
                        int i8 = i4;
                        eVar.b0(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.v(), ConstraintWidget.DimensionBehaviour.FIXED, i8);
                        i4 = i8;
                    }
                }
            }
            this.l = 0;
            this.m = 0;
            this.b = null;
            this.c = 0;
            int i9 = this.o;
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = this.n + i10;
                e eVar2 = e.this;
                if (i11 >= eVar2.g1) {
                    return;
                }
                ConstraintWidget constraintWidget2 = eVar2.f1[i11];
                if (this.a == 0) {
                    int v = constraintWidget2.v();
                    int i12 = eVar2.U0;
                    if (constraintWidget2.j0 == 8) {
                        i12 = 0;
                    }
                    this.l = v + i12 + this.l;
                    int c0 = eVar2.c0(constraintWidget2, this.q);
                    if (this.b == null || this.c < c0) {
                        this.b = constraintWidget2;
                        this.c = c0;
                        this.m = c0;
                    }
                } else {
                    int d0 = eVar2.d0(constraintWidget2, this.q);
                    int c02 = eVar2.c0(constraintWidget2, this.q);
                    int i13 = eVar2.V0;
                    if (constraintWidget2.j0 == 8) {
                        i13 = 0;
                    }
                    this.m = c02 + i13 + this.m;
                    if (this.b == null || this.c < d0) {
                        this.b = constraintWidget2;
                        this.c = d0;
                        this.l = d0;
                    }
                }
            }
        }

        public final void h(int i) {
            this.n = i;
        }

        public final void i(int i, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.d = constraintAnchor;
            this.e = constraintAnchor2;
            this.f = constraintAnchor3;
            this.g = constraintAnchor4;
            this.h = i2;
            this.i = i3;
            this.j = i4;
            this.k = i5;
            this.q = i6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06dd  */
    @Override // androidx.constraintlayout.core.widgets.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        a aVar;
        char c;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        ConstraintWidget constraintWidget;
        int i15;
        int i16;
        int i17;
        int i18;
        if (this.w0 > 0) {
            ConstraintWidget constraintWidget2 = this.W;
            kt6.b bVar = constraintWidget2 != null ? ((d) constraintWidget2).z0 : null;
            if (bVar == null) {
                this.E0 = 0;
                this.F0 = 0;
                this.D0 = false;
                return;
            }
            for (int i19 = 0; i19 < this.w0; i19++) {
                ConstraintWidget constraintWidget3 = this.v0[i19];
                if (constraintWidget3 != null && !(constraintWidget3 instanceof f)) {
                    ConstraintWidget.DimensionBehaviour o = constraintWidget3.o(0);
                    ConstraintWidget.DimensionBehaviour o2 = constraintWidget3.o(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (o != dimensionBehaviour || constraintWidget3.s == 1 || o2 != dimensionBehaviour || constraintWidget3.t == 1) {
                        if (o == dimensionBehaviour) {
                            o = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        }
                        if (o2 == dimensionBehaviour) {
                            o2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                        }
                        kt6.a aVar2 = this.G0;
                        aVar2.a = o;
                        aVar2.b = o2;
                        aVar2.c = constraintWidget3.v();
                        aVar2.d = constraintWidget3.p();
                        bVar.a(constraintWidget3, aVar2);
                        constraintWidget3.W(aVar2.e);
                        constraintWidget3.R(aVar2.f);
                        constraintWidget3.N(aVar2.g);
                    }
                }
            }
        }
        int i20 = this.B0;
        int i21 = this.C0;
        int i22 = this.x0;
        int i23 = this.y0;
        int[] iArr2 = new int[2];
        int i24 = (i2 - i20) - i21;
        int i25 = this.a1;
        if (i25 == 1) {
            i24 = (i4 - i22) - i23;
        }
        int i26 = i24;
        if (i25 == 0) {
            if (this.I0 == -1) {
                this.I0 = 0;
            }
            if (this.J0 == -1) {
                this.J0 = 0;
            }
        } else {
            if (this.I0 == -1) {
                this.I0 = 0;
            }
            if (this.J0 == -1) {
                this.J0 = 0;
            }
        }
        ConstraintWidget[] constraintWidgetArr = this.v0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (true) {
            i5 = this.w0;
            if (i27 >= i5) {
                break;
            }
            if (this.v0[i27].j0 == 8) {
                i28++;
            }
            i27++;
        }
        if (i28 > 0) {
            constraintWidgetArr = new ConstraintWidget[i5 - i28];
            i5 = 0;
            for (int i30 = 0; i30 < this.w0; i30++) {
                ConstraintWidget constraintWidget4 = this.v0[i30];
                if (constraintWidget4.j0 != 8) {
                    constraintWidgetArr[i5] = constraintWidget4;
                    i5++;
                }
            }
        }
        ConstraintWidget[] constraintWidgetArr2 = constraintWidgetArr;
        this.f1 = constraintWidgetArr2;
        this.g1 = i5;
        int i31 = this.Y0;
        ArrayList<a> arrayList = this.b1;
        if (i31 == 0) {
            i6 = i22;
            i7 = i23;
            iArr = iArr2;
            i8 = i20;
            i9 = i21;
            int i32 = this.a1;
            if (i5 != 0) {
                if (arrayList.size() == 0) {
                    aVar = new a(i32, this.K, this.L, this.M, this.N, i26);
                    arrayList.add(aVar);
                } else {
                    a aVar3 = arrayList.get(0);
                    aVar3.c();
                    aVar3.i(i32, this.K, this.L, this.M, this.N, this.B0, this.x0, this.C0, this.y0, i26);
                    aVar = aVar3;
                }
                for (int i33 = 0; i33 < i5; i33++) {
                    aVar.b(constraintWidgetArr2[i33]);
                }
                i29 = 0;
                iArr[0] = aVar.f();
                c = 1;
                iArr[1] = aVar.e();
                int i34 = iArr[i29] + i8 + i9;
                int i35 = iArr[c] + i6 + i7;
                if (i != 1073741824) {
                }
                if (i3 != 1073741824) {
                }
                this.E0 = i34;
                this.F0 = i35;
                W(i34);
                R(i35);
                this.D0 = this.w0 <= 0 ? c : i29;
            }
            c = 1;
            int i342 = iArr[i29] + i8 + i9;
            int i352 = iArr[c] + i6 + i7;
            if (i != 1073741824) {
            }
            if (i3 != 1073741824) {
            }
            this.E0 = i342;
            this.F0 = i352;
            W(i342);
            R(i352);
            this.D0 = this.w0 <= 0 ? c : i29;
        }
        ConstraintAnchor constraintAnchor = this.L;
        ConstraintAnchor constraintAnchor2 = this.K;
        i8 = i20;
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = this.N;
        if (i31 == 1) {
            i7 = i23;
            iArr = iArr2;
            i9 = i21;
            i6 = i22;
            int i36 = this.a1;
            if (i5 != 0) {
                arrayList.clear();
                a aVar4 = new a(i36, this.K, this.L, this.M, this.N, i26);
                arrayList.add(aVar4);
                if (i36 == 0) {
                    i10 = 0;
                    int i37 = 0;
                    int i38 = 0;
                    while (i38 < i5) {
                        ConstraintWidget constraintWidget5 = constraintWidgetArr2[i38];
                        int d0 = d0(constraintWidget5, i26);
                        if (constraintWidget5.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            i10++;
                        }
                        int i39 = i10;
                        boolean z = (i37 == i26 || (this.U0 + i37) + d0 > i26) && aVar4.b != null;
                        if (!z && i38 > 0 && (i12 = this.Z0) > 0 && i38 % i12 == 0) {
                            z = true;
                        }
                        if (z) {
                            aVar4 = new a(i36, this.K, this.L, this.M, this.N, i26);
                            aVar4.h(i38);
                            arrayList.add(aVar4);
                        } else if (i38 > 0) {
                            i37 = this.U0 + d0 + i37;
                            aVar4.b(constraintWidget5);
                            i38++;
                            i10 = i39;
                        }
                        i37 = d0;
                        aVar4.b(constraintWidget5);
                        i38++;
                        i10 = i39;
                    }
                } else {
                    i10 = 0;
                    int i40 = 0;
                    int i41 = 0;
                    while (i41 < i5) {
                        ConstraintWidget constraintWidget6 = constraintWidgetArr2[i41];
                        int c0 = c0(constraintWidget6, i26);
                        if (constraintWidget6.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            i10++;
                        }
                        int i42 = i10;
                        boolean z2 = (i40 == i26 || (this.V0 + i40) + c0 > i26) && aVar4.b != null;
                        if (!z2 && i41 > 0 && (i11 = this.Z0) > 0 && i41 % i11 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            aVar4 = new a(i36, this.K, this.L, this.M, this.N, i26);
                            aVar4.h(i41);
                            arrayList.add(aVar4);
                        } else if (i41 > 0) {
                            i40 = this.V0 + c0 + i40;
                            aVar4.b(constraintWidget6);
                            i41++;
                            i10 = i42;
                        }
                        i40 = c0;
                        aVar4.b(constraintWidget6);
                        i41++;
                        i10 = i42;
                    }
                }
                int size = arrayList.size();
                int i43 = this.B0;
                int i44 = this.x0;
                int i45 = this.C0;
                int i46 = this.y0;
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.V;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                boolean z3 = dimensionBehaviour2 == dimensionBehaviour3 || dimensionBehaviourArr[1] == dimensionBehaviour3;
                if (i10 > 0 && z3) {
                    for (int i47 = 0; i47 < size; i47++) {
                        a aVar5 = arrayList.get(i47);
                        if (i36 == 0) {
                            aVar5.g(i26 - aVar5.f());
                        } else {
                            aVar5.g(i26 - aVar5.e());
                        }
                    }
                }
                int i48 = i43;
                int i49 = i44;
                int i50 = i45;
                int i51 = i46;
                ConstraintAnchor constraintAnchor5 = constraintAnchor2;
                ConstraintAnchor constraintAnchor6 = constraintAnchor;
                int i52 = 0;
                int i53 = 0;
                ConstraintAnchor constraintAnchor7 = constraintAnchor3;
                ConstraintAnchor constraintAnchor8 = constraintAnchor4;
                for (int i54 = 0; i54 < size; i54++) {
                    a aVar6 = arrayList.get(i54);
                    if (i36 == 0) {
                        if (i54 < size - 1) {
                            constraintAnchor8 = arrayList.get(i54 + 1).b.L;
                            i51 = 0;
                        } else {
                            i51 = this.y0;
                            constraintAnchor8 = constraintAnchor4;
                        }
                        ConstraintAnchor constraintAnchor9 = aVar6.b.N;
                        aVar6.i(i36, constraintAnchor5, constraintAnchor6, constraintAnchor7, constraintAnchor8, i48, i49, i50, i51, i26);
                        i52 = Math.max(i52, aVar6.f());
                        int e = aVar6.e() + i53;
                        if (i54 > 0) {
                            e += this.V0;
                        }
                        constraintAnchor6 = constraintAnchor9;
                        i53 = e;
                        i49 = 0;
                    } else {
                        if (i54 < size - 1) {
                            constraintAnchor7 = arrayList.get(i54 + 1).b.K;
                            i50 = 0;
                        } else {
                            i50 = this.C0;
                            constraintAnchor7 = constraintAnchor3;
                        }
                        ConstraintAnchor constraintAnchor10 = aVar6.b.M;
                        aVar6.i(i36, constraintAnchor5, constraintAnchor6, constraintAnchor7, constraintAnchor8, i48, i49, i50, i51, i26);
                        int f = aVar6.f() + i52;
                        int max = Math.max(i53, aVar6.e());
                        if (i54 > 0) {
                            f += this.U0;
                        }
                        i53 = max;
                        constraintAnchor5 = constraintAnchor10;
                        i52 = f;
                        i48 = 0;
                    }
                }
                iArr[0] = i52;
                iArr[1] = i53;
            }
        } else {
            if (i31 == 2) {
                i7 = i23;
                iArr = iArr2;
                i9 = i21;
                i6 = i22;
                int i55 = this.a1;
                if (i55 == 0) {
                    int i56 = this.Z0;
                    if (i56 <= 0) {
                        int i57 = 0;
                        i14 = 0;
                        for (int i58 = 0; i58 < i5; i58++) {
                            if (i58 > 0) {
                                i57 += this.U0;
                            }
                            ConstraintWidget constraintWidget7 = constraintWidgetArr2[i58];
                            if (constraintWidget7 != null) {
                                int d02 = d0(constraintWidget7, i26) + i57;
                                if (d02 > i26) {
                                    break;
                                }
                                i14++;
                                i57 = d02;
                            }
                        }
                    } else {
                        i14 = i56;
                    }
                    i13 = 0;
                } else {
                    i13 = this.Z0;
                    if (i13 <= 0) {
                        int i59 = 0;
                        int i60 = 0;
                        for (int i61 = 0; i61 < i5; i61++) {
                            if (i61 > 0) {
                                i59 += this.V0;
                            }
                            ConstraintWidget constraintWidget8 = constraintWidgetArr2[i61];
                            if (constraintWidget8 != null) {
                                int c02 = c0(constraintWidget8, i26) + i59;
                                if (c02 > i26) {
                                    break;
                                }
                                i60++;
                                i59 = c02;
                            }
                        }
                        i13 = i60;
                    }
                    i14 = 0;
                }
                if (this.e1 == null) {
                    this.e1 = new int[2];
                }
                boolean z4 = (i13 == 0 && i55 == 1) || (i14 == 0 && i55 == 0);
                while (!z4) {
                    if (i55 == 0) {
                        i13 = (int) Math.ceil(i5 / i14);
                    } else {
                        i14 = (int) Math.ceil(i5 / i13);
                    }
                    ConstraintWidget[] constraintWidgetArr3 = this.d1;
                    if (constraintWidgetArr3 == null || constraintWidgetArr3.length < i14) {
                        obj = null;
                        this.d1 = new ConstraintWidget[i14];
                    } else {
                        obj = null;
                        Arrays.fill(constraintWidgetArr3, (Object) null);
                    }
                    ConstraintWidget[] constraintWidgetArr4 = this.c1;
                    if (constraintWidgetArr4 == null || constraintWidgetArr4.length < i13) {
                        this.c1 = new ConstraintWidget[i13];
                    } else {
                        Arrays.fill(constraintWidgetArr4, obj);
                    }
                    for (int i62 = 0; i62 < i14; i62++) {
                        for (int i63 = 0; i63 < i13; i63++) {
                            int i64 = (i63 * i14) + i62;
                            if (i55 == 1) {
                                i64 = (i62 * i13) + i63;
                            }
                            if (i64 < constraintWidgetArr2.length && (constraintWidget = constraintWidgetArr2[i64]) != null) {
                                int d03 = d0(constraintWidget, i26);
                                ConstraintWidget constraintWidget9 = this.d1[i62];
                                if (constraintWidget9 == null || constraintWidget9.v() < d03) {
                                    this.d1[i62] = constraintWidget;
                                }
                                int c03 = c0(constraintWidget, i26);
                                ConstraintWidget constraintWidget10 = this.c1[i63];
                                if (constraintWidget10 == null || constraintWidget10.p() < c03) {
                                    this.c1[i63] = constraintWidget;
                                }
                            }
                        }
                    }
                    int i65 = 0;
                    for (int i66 = 0; i66 < i14; i66++) {
                        ConstraintWidget constraintWidget11 = this.d1[i66];
                        if (constraintWidget11 != null) {
                            if (i66 > 0) {
                                i65 += this.U0;
                            }
                            i65 = d0(constraintWidget11, i26) + i65;
                        }
                    }
                    int i67 = 0;
                    for (int i68 = 0; i68 < i13; i68++) {
                        ConstraintWidget constraintWidget12 = this.c1[i68];
                        if (constraintWidget12 != null) {
                            if (i68 > 0) {
                                i67 += this.V0;
                            }
                            i67 = c0(constraintWidget12, i26) + i67;
                        }
                    }
                    iArr[0] = i65;
                    iArr[1] = i67;
                    if (i55 == 0) {
                        if (i65 > i26 && i14 > 1) {
                            i14--;
                        }
                        z4 = true;
                    } else {
                        if (i67 > i26 && i13 > 1) {
                            i13--;
                        }
                        z4 = true;
                    }
                }
                int[] iArr3 = this.e1;
                iArr3[0] = i14;
                iArr3[1] = i13;
                c = 1;
                int i3422 = iArr[i29] + i8 + i9;
                int i3522 = iArr[c] + i6 + i7;
                if (i != 1073741824) {
                    i3422 = i2;
                } else if (i == Integer.MIN_VALUE) {
                    i3422 = Math.min(i3422, i2);
                } else if (i != 0) {
                    i3422 = i29;
                }
                if (i3 != 1073741824) {
                    i3522 = i4;
                } else if (i3 == Integer.MIN_VALUE) {
                    i3522 = Math.min(i3522, i4);
                } else if (i3 != 0) {
                    i3522 = i29;
                }
                this.E0 = i3422;
                this.F0 = i3522;
                W(i3422);
                R(i3522);
                this.D0 = this.w0 <= 0 ? c : i29;
            }
            if (i31 == 3) {
                int i69 = this.a1;
                if (i5 != 0) {
                    arrayList.clear();
                    iArr = iArr2;
                    i6 = i22;
                    i7 = i23;
                    a aVar7 = new a(i69, this.K, this.L, this.M, this.N, i26);
                    arrayList.add(aVar7);
                    if (i69 == 0) {
                        int i70 = 0;
                        int i71 = 0;
                        i15 = 0;
                        int i72 = 0;
                        while (i70 < i5) {
                            i71++;
                            int i73 = i21;
                            ConstraintWidget constraintWidget13 = constraintWidgetArr2[i70];
                            int d04 = d0(constraintWidget13, i26);
                            a aVar8 = aVar7;
                            int i74 = i69;
                            if (constraintWidget13.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i15++;
                            }
                            int i75 = i15;
                            boolean z5 = (i72 == i26 || (this.U0 + i72) + d04 > i26) && aVar8.b != null;
                            if (!z5 && i70 > 0 && (i18 = this.Z0) > 0 && i71 > i18) {
                                z5 = true;
                            }
                            if (z5) {
                                i17 = i70;
                                i69 = i74;
                                aVar7 = new a(i69, this.K, this.L, this.M, this.N, i26);
                                aVar7.h(i17);
                                arrayList.add(aVar7);
                                i72 = d04;
                                i71 = 1;
                            } else {
                                i17 = i70;
                                i69 = i74;
                                i72 = i17 > 0 ? this.U0 + d04 + i72 : d04;
                                aVar7 = aVar8;
                            }
                            aVar7.b(constraintWidget13);
                            i70 = i17 + 1;
                            i15 = i75;
                            i21 = i73;
                        }
                        i9 = i21;
                    } else {
                        i9 = i21;
                        int i76 = 0;
                        int i77 = 0;
                        int i78 = 0;
                        int i79 = 0;
                        while (i79 < i5) {
                            i76++;
                            ConstraintWidget constraintWidget14 = constraintWidgetArr2[i79];
                            int c04 = c0(constraintWidget14, i26);
                            a aVar9 = aVar7;
                            if (constraintWidget14.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                                i77++;
                            }
                            int i80 = i77;
                            boolean z6 = (i78 == i26 || (this.V0 + i78) + c04 > i26) && aVar9.b != null;
                            if (!z6 && i79 > 0 && (i16 = this.Z0) > 0 && i76 > i16) {
                                z6 = true;
                            }
                            if (z6) {
                                aVar7 = new a(i69, this.K, this.L, this.M, this.N, i26);
                                aVar7.h(i79);
                                arrayList.add(aVar7);
                                i78 = c04;
                                i76 = 1;
                            } else {
                                i78 = i79 > 0 ? this.V0 + c04 + i78 : c04;
                                aVar7 = aVar9;
                            }
                            aVar7.b(constraintWidget14);
                            i79++;
                            i77 = i80;
                        }
                        i15 = i77;
                    }
                    int size2 = arrayList.size();
                    int i81 = this.B0;
                    int i82 = this.x0;
                    int i83 = this.C0;
                    int i84 = this.y0;
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr2[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    boolean z7 = dimensionBehaviour4 == dimensionBehaviour5 || dimensionBehaviourArr2[1] == dimensionBehaviour5;
                    if (i15 > 0 && z7) {
                        for (int i85 = 0; i85 < size2; i85++) {
                            a aVar10 = arrayList.get(i85);
                            if (i69 == 0) {
                                aVar10.g(i26 - aVar10.f());
                            } else {
                                aVar10.g(i26 - aVar10.e());
                            }
                        }
                    }
                    int i86 = i81;
                    int i87 = i82;
                    int i88 = i83;
                    int i89 = i84;
                    ConstraintAnchor constraintAnchor11 = constraintAnchor2;
                    ConstraintAnchor constraintAnchor12 = constraintAnchor;
                    int i90 = 0;
                    int i91 = 0;
                    ConstraintAnchor constraintAnchor13 = constraintAnchor3;
                    ConstraintAnchor constraintAnchor14 = constraintAnchor4;
                    for (int i92 = 0; i92 < size2; i92++) {
                        a aVar11 = arrayList.get(i92);
                        if (i69 == 0) {
                            if (i92 < size2 - 1) {
                                constraintAnchor14 = arrayList.get(i92 + 1).b.L;
                                i89 = 0;
                            } else {
                                i89 = this.y0;
                                constraintAnchor14 = constraintAnchor4;
                            }
                            ConstraintAnchor constraintAnchor15 = aVar11.b.N;
                            aVar11.i(i69, constraintAnchor11, constraintAnchor12, constraintAnchor13, constraintAnchor14, i86, i87, i88, i89, i26);
                            i90 = Math.max(i90, aVar11.f());
                            int e2 = aVar11.e() + i91;
                            if (i92 > 0) {
                                e2 += this.V0;
                            }
                            constraintAnchor12 = constraintAnchor15;
                            i91 = e2;
                            i87 = 0;
                        } else {
                            if (i92 < size2 - 1) {
                                constraintAnchor13 = arrayList.get(i92 + 1).b.K;
                                i88 = 0;
                            } else {
                                i88 = this.C0;
                                constraintAnchor13 = constraintAnchor3;
                            }
                            ConstraintAnchor constraintAnchor16 = aVar11.b.M;
                            aVar11.i(i69, constraintAnchor11, constraintAnchor12, constraintAnchor13, constraintAnchor14, i86, i87, i88, i89, i26);
                            int f2 = aVar11.f() + i90;
                            int max2 = Math.max(i91, aVar11.e());
                            if (i92 > 0) {
                                f2 += this.U0;
                            }
                            i91 = max2;
                            constraintAnchor11 = constraintAnchor16;
                            i90 = f2;
                            i86 = 0;
                        }
                    }
                    iArr[0] = i90;
                    iArr[1] = i91;
                }
            }
            i7 = i23;
            iArr = iArr2;
            i9 = i21;
            i6 = i22;
        }
        c = 1;
        int i34222 = iArr[i29] + i8 + i9;
        int i35222 = iArr[c] + i6 + i7;
        if (i != 1073741824) {
        }
        if (i3 != 1073741824) {
        }
        this.E0 = i34222;
        this.F0 = i35222;
        W(i34222);
        R(i35222);
        this.D0 = this.w0 <= 0 ? c : i29;
    }

    public final int c0(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.t;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.A * i);
                if (i3 != constraintWidget.p()) {
                    constraintWidget.g = true;
                    b0(constraintWidget, constraintWidget.V[0], constraintWidget.v(), ConstraintWidget.DimensionBehaviour.FIXED, i3);
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.p();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.v() * constraintWidget2.Z) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.p();
    }

    public final int d0(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i2 = constraintWidget.s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (constraintWidget.x * i);
                if (i3 != constraintWidget.v()) {
                    constraintWidget.g = true;
                    b0(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i3, constraintWidget.V[1], constraintWidget.p());
                }
                return i3;
            }
            constraintWidget2 = constraintWidget;
            if (i2 == 1) {
                return constraintWidget2.v();
            }
            if (i2 == 3) {
                return (int) ((constraintWidget2.p() * constraintWidget2.Z) + 0.5f);
            }
        } else {
            constraintWidget2 = constraintWidget;
        }
        return constraintWidget2.v();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void f(androidx.constraintlayout.core.c cVar, boolean z) {
        ConstraintWidget constraintWidget;
        float f;
        int i;
        super.f(cVar, z);
        ConstraintWidget constraintWidget2 = this.W;
        boolean z2 = constraintWidget2 != null && ((d) constraintWidget2).A0;
        int i2 = this.Y0;
        ArrayList<a> arrayList = this.b1;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    arrayList.get(i3).d(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        arrayList.get(i4).d(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.e1 != null && this.d1 != null && this.c1 != null) {
                for (int i5 = 0; i5 < this.g1; i5++) {
                    this.f1[i5].I();
                }
                int[] iArr = this.e1;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.O0;
                ConstraintWidget constraintWidget3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.O0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    ConstraintWidget constraintWidget4 = this.d1[i];
                    if (constraintWidget4 != null) {
                        ConstraintAnchor constraintAnchor = constraintWidget4.K;
                        if (constraintWidget4.j0 != 8) {
                            if (i8 == 0) {
                                constraintWidget4.j(constraintAnchor, this.K, this.B0);
                                constraintWidget4.m0 = this.I0;
                                constraintWidget4.g0 = f;
                            }
                            if (i8 == i6 - 1) {
                                constraintWidget4.j(constraintWidget4.M, this.M, this.C0);
                            }
                            if (i8 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor2 = constraintWidget3.M;
                                constraintWidget4.j(constraintAnchor, constraintAnchor2, this.U0);
                                constraintWidget3.j(constraintAnchor2, constraintAnchor, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    ConstraintWidget constraintWidget5 = this.c1[i9];
                    if (constraintWidget5 != null) {
                        ConstraintAnchor constraintAnchor3 = constraintWidget5.L;
                        if (constraintWidget5.j0 != 8) {
                            if (i9 == 0) {
                                constraintWidget5.j(constraintAnchor3, this.L, this.x0);
                                constraintWidget5.n0 = this.J0;
                                constraintWidget5.h0 = this.P0;
                            }
                            if (i9 == i7 - 1) {
                                constraintWidget5.j(constraintWidget5.N, this.N, this.y0);
                            }
                            if (i9 > 0 && constraintWidget3 != null) {
                                ConstraintAnchor constraintAnchor4 = constraintWidget3.N;
                                constraintWidget5.j(constraintAnchor3, constraintAnchor4, this.V0);
                                constraintWidget3.j(constraintAnchor4, constraintAnchor3, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.a1 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        ConstraintWidget[] constraintWidgetArr = this.f1;
                        if (i12 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i12]) != null && constraintWidget.j0 != 8) {
                            ConstraintWidget constraintWidget6 = this.d1[i10];
                            ConstraintWidget constraintWidget7 = this.c1[i11];
                            if (constraintWidget != constraintWidget6) {
                                constraintWidget.j(constraintWidget.K, constraintWidget6.K, 0);
                                constraintWidget.j(constraintWidget.M, constraintWidget6.M, 0);
                            }
                            if (constraintWidget != constraintWidget7) {
                                constraintWidget.j(constraintWidget.L, constraintWidget7.L, 0);
                                constraintWidget.j(constraintWidget.N, constraintWidget7.N, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).d(0, z2, true);
        }
        this.D0 = false;
    }

    @Override // xsna.e2v, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        e eVar = (e) constraintWidget;
        this.I0 = eVar.I0;
        this.J0 = eVar.J0;
        this.K0 = eVar.K0;
        this.L0 = eVar.L0;
        this.M0 = eVar.M0;
        this.N0 = eVar.N0;
        this.O0 = eVar.O0;
        this.P0 = eVar.P0;
        this.Q0 = eVar.Q0;
        this.R0 = eVar.R0;
        this.S0 = eVar.S0;
        this.T0 = eVar.T0;
        this.U0 = eVar.U0;
        this.V0 = eVar.V0;
        this.W0 = eVar.W0;
        this.X0 = eVar.X0;
        this.Y0 = eVar.Y0;
        this.Z0 = eVar.Z0;
        this.a1 = eVar.a1;
    }
}
