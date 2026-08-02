package androidx.constraintlayout.core.state;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;
import xsna.bnx0;
import xsna.dpf0;
import xsna.lhq;
import xsna.xym;
import xsna.zo10;
import xsna.zok;

/* compiled from: ConstraintReference.java */
/* loaded from: classes11.dex */
public class a implements dpf0 {
    public Object a;
    public final State b;
    public float b0;
    public float c0;
    public xym e0;
    public xym f0;
    public zo10 g0;
    public ConstraintWidget h0;
    public final HashMap<String, Integer> i0;
    public HashMap<String, Float> j0;
    public Object c = null;
    public int d = 0;
    public int e = 0;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = 0.5f;
    public float i = 0.5f;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public float x = Float.NaN;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public int I = 0;
    public Object J = null;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;

    @Nullable
    public a T = null;
    public Object U = null;
    public Object V = null;

    @Nullable
    public a W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public Object a0 = null;
    public State.Constraint d0 = null;

    /* compiled from: ConstraintReference.java */
    /* renamed from: androidx.constraintlayout.core.state.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0016a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            a = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[State.Constraint.TOP_TO_BASELINE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[State.Constraint.BOTTOM_TO_BASELINE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[State.Constraint.BASELINE_TO_TOP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[State.Constraint.CENTER_VERTICALLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public a(State state) {
        String str = xym.h;
        xym xymVar = new xym(str);
        String str2 = xym.i;
        xymVar.f = str2;
        this.e0 = xymVar;
        xym xymVar2 = new xym(str);
        xymVar2.f = str2;
        this.f0 = xymVar2;
        this.i0 = new HashMap<>();
        this.j0 = new HashMap<>();
        this.b = state;
    }

    @Override // xsna.dpf0
    public ConstraintWidget a() {
        if (this.h0 == null) {
            ConstraintWidget constraintWidget = new ConstraintWidget(this.e0.d, this.f0.d);
            this.h0 = constraintWidget;
            constraintWidget.i0 = this.g0;
        }
        return this.h0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xsna.lhq] */
    @Override // xsna.dpf0
    public void apply() {
        if (this.h0 == null) {
            return;
        }
        ?? r0 = this.c;
        if (r0 != 0) {
            r0.apply();
        }
        this.e0.a(this.h0, 0);
        this.f0.a(this.h0, 1);
        this.J = j(this.J);
        this.K = j(this.K);
        this.L = j(this.L);
        this.M = j(this.M);
        this.N = j(this.N);
        this.O = j(this.O);
        this.P = j(this.P);
        this.Q = j(this.Q);
        this.R = j(this.R);
        this.S = j(this.S);
        this.U = j(this.U);
        this.V = j(this.V);
        this.X = j(this.X);
        this.Y = j(this.Y);
        this.Z = j(this.Z);
        d(this.h0, this.J, State.Constraint.LEFT_TO_LEFT);
        d(this.h0, this.K, State.Constraint.LEFT_TO_RIGHT);
        d(this.h0, this.L, State.Constraint.RIGHT_TO_LEFT);
        d(this.h0, this.M, State.Constraint.RIGHT_TO_RIGHT);
        d(this.h0, this.N, State.Constraint.START_TO_START);
        d(this.h0, this.O, State.Constraint.START_TO_END);
        d(this.h0, this.P, State.Constraint.END_TO_START);
        d(this.h0, this.Q, State.Constraint.END_TO_END);
        d(this.h0, this.R, State.Constraint.TOP_TO_TOP);
        d(this.h0, this.S, State.Constraint.TOP_TO_BOTTOM);
        d(this.h0, this.T, State.Constraint.TOP_TO_BASELINE);
        d(this.h0, this.U, State.Constraint.BOTTOM_TO_TOP);
        d(this.h0, this.V, State.Constraint.BOTTOM_TO_BOTTOM);
        d(this.h0, this.W, State.Constraint.BOTTOM_TO_BASELINE);
        d(this.h0, this.X, State.Constraint.BASELINE_TO_BASELINE);
        d(this.h0, this.Y, State.Constraint.BASELINE_TO_TOP);
        d(this.h0, this.Z, State.Constraint.BASELINE_TO_BOTTOM);
        d(this.h0, this.a0, State.Constraint.CIRCULAR_CONSTRAINT);
        int i = this.d;
        if (i != 0) {
            this.h0.m0 = i;
        }
        int i2 = this.e;
        if (i2 != 0) {
            this.h0.n0 = i2;
        }
        float f = this.f;
        if (f != -1.0f) {
            this.h0.o0[0] = f;
        }
        float f2 = this.g;
        if (f2 != -1.0f) {
            this.h0.o0[1] = f2;
        }
        ConstraintWidget constraintWidget = this.h0;
        constraintWidget.g0 = this.h;
        constraintWidget.h0 = this.i;
        bnx0 bnx0Var = constraintWidget.j;
        bnx0Var.f = this.x;
        bnx0Var.g = this.y;
        bnx0Var.h = this.z;
        bnx0Var.i = this.A;
        bnx0Var.j = this.B;
        bnx0Var.k = this.C;
        bnx0Var.l = this.D;
        bnx0Var.m = this.E;
        bnx0Var.n = this.G;
        bnx0Var.o = this.H;
        bnx0Var.p = this.F;
        int i3 = this.I;
        bnx0Var.q = i3;
        constraintWidget.j0 = i3;
        HashMap<String, Integer> hashMap = this.i0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                Integer num = hashMap.get(str);
                bnx0 bnx0Var2 = this.h0.j;
                int intValue = num.intValue();
                HashMap<String, zok> hashMap2 = bnx0Var2.r;
                if (hashMap2.containsKey(str)) {
                    hashMap2.get(str).c = intValue;
                } else {
                    zok zokVar = new zok();
                    zokVar.d = Float.NaN;
                    zokVar.a = str;
                    zokVar.b = 902;
                    zokVar.c = intValue;
                    hashMap2.put(str, zokVar);
                }
            }
        }
        HashMap<String, Float> hashMap3 = this.j0;
        if (hashMap3 != null) {
            for (String str2 : hashMap3.keySet()) {
                float floatValue = this.j0.get(str2).floatValue();
                HashMap<String, zok> hashMap4 = this.h0.j.r;
                if (hashMap4.containsKey(str2)) {
                    hashMap4.get(str2).d = floatValue;
                } else {
                    zok zokVar2 = new zok();
                    zokVar2.c = Integer.MIN_VALUE;
                    zokVar2.a = str2;
                    zokVar2.b = 901;
                    zokVar2.d = floatValue;
                    hashMap4.put(str2, zokVar2);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.lhq] */
    @Override // xsna.dpf0
    public final lhq b() {
        return this.c;
    }

    @Override // xsna.dpf0
    public final void c(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.h0 = constraintWidget;
        constraintWidget.i0 = this.g0;
    }

    public final void d(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintWidget a = obj instanceof dpf0 ? ((dpf0) obj).a() : null;
        if (a == null) {
            return;
        }
        int[] iArr = C0016a.a;
        int i = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                constraintWidget.n(type).b(a.n(type), this.j, this.p, false);
                break;
            case 2:
                constraintWidget.n(ConstraintAnchor.Type.LEFT).b(a.n(ConstraintAnchor.Type.RIGHT), this.j, this.p, false);
                break;
            case 3:
                constraintWidget.n(ConstraintAnchor.Type.RIGHT).b(a.n(ConstraintAnchor.Type.LEFT), this.k, this.q, false);
                break;
            case 4:
                ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.n(type2).b(a.n(type2), this.k, this.q, false);
                break;
            case 5:
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                constraintWidget.n(type3).b(a.n(type3), this.l, this.r, false);
                break;
            case 6:
                constraintWidget.n(ConstraintAnchor.Type.LEFT).b(a.n(ConstraintAnchor.Type.RIGHT), this.l, this.r, false);
                break;
            case 7:
                constraintWidget.n(ConstraintAnchor.Type.RIGHT).b(a.n(ConstraintAnchor.Type.LEFT), this.m, this.s, false);
                break;
            case 8:
                ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.n(type4).b(a.n(type4), this.m, this.s, false);
                break;
            case 9:
                ConstraintAnchor.Type type5 = ConstraintAnchor.Type.TOP;
                constraintWidget.n(type5).b(a.n(type5), this.n, this.t, false);
                break;
            case 10:
                constraintWidget.n(ConstraintAnchor.Type.TOP).b(a.n(ConstraintAnchor.Type.BOTTOM), this.n, this.t, false);
                break;
            case 11:
                constraintWidget.A(ConstraintAnchor.Type.TOP, a, ConstraintAnchor.Type.BASELINE, this.n, this.t);
                break;
            case 12:
                constraintWidget.n(ConstraintAnchor.Type.BOTTOM).b(a.n(ConstraintAnchor.Type.TOP), this.o, this.u, false);
                break;
            case 13:
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.BOTTOM;
                constraintWidget.n(type6).b(a.n(type6), this.o, this.u, false);
                break;
            case 14:
                constraintWidget.A(ConstraintAnchor.Type.BOTTOM, a, ConstraintAnchor.Type.BASELINE, this.o, this.u);
                break;
            case 15:
                constraintWidget.A(ConstraintAnchor.Type.BASELINE, a, ConstraintAnchor.Type.BOTTOM, this.v, this.w);
                break;
            case 16:
                constraintWidget.A(ConstraintAnchor.Type.BASELINE, a, ConstraintAnchor.Type.TOP, this.v, this.w);
                break;
            case 17:
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.BASELINE;
                constraintWidget.A(type7, a, type7, this.v, this.w);
                break;
            case 18:
                float f = this.b0;
                int i2 = (int) this.c0;
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.CENTER;
                constraintWidget.A(type8, a, type8, i2, 0);
                constraintWidget.E = f;
                break;
        }
    }

    public final void e(Object obj) {
        this.d0 = State.Constraint.BOTTOM_TO_BOTTOM;
        this.V = obj;
    }

    public final void f() {
        State.Constraint constraint = this.d0;
        if (constraint == null) {
            this.J = null;
            this.K = null;
            this.j = 0;
            this.L = null;
            this.M = null;
            this.k = 0;
            this.N = null;
            this.O = null;
            this.l = 0;
            this.P = null;
            this.Q = null;
            this.m = 0;
            this.R = null;
            this.S = null;
            this.n = 0;
            this.U = null;
            this.V = null;
            this.o = 0;
            this.X = null;
            this.a0 = null;
            this.h = 0.5f;
            this.i = 0.5f;
            this.p = 0;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            return;
        }
        switch (C0016a.a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.J = null;
                this.K = null;
                this.j = 0;
                this.p = 0;
                break;
            case 3:
            case 4:
                this.L = null;
                this.M = null;
                this.k = 0;
                this.q = 0;
                break;
            case 5:
            case 6:
                this.N = null;
                this.O = null;
                this.l = 0;
                this.r = 0;
                break;
            case 7:
            case 8:
                this.P = null;
                this.Q = null;
                this.m = 0;
                this.s = 0;
                break;
            case 9:
            case 10:
            case 11:
                this.R = null;
                this.S = null;
                this.T = null;
                this.n = 0;
                this.t = 0;
                break;
            case 12:
            case 13:
            case 14:
                this.U = null;
                this.V = null;
                this.W = null;
                this.o = 0;
                this.u = 0;
                break;
            case 17:
                this.X = null;
                break;
            case 18:
                this.a0 = null;
                break;
        }
    }

    public final void g() {
        if (this.N != null) {
            this.d0 = State.Constraint.START_TO_START;
        } else {
            this.d0 = State.Constraint.START_TO_END;
        }
        f();
        if (this.P != null) {
            this.d0 = State.Constraint.END_TO_START;
        } else {
            this.d0 = State.Constraint.END_TO_END;
        }
        f();
        if (this.J != null) {
            this.d0 = State.Constraint.LEFT_TO_LEFT;
        } else {
            this.d0 = State.Constraint.LEFT_TO_RIGHT;
        }
        f();
        if (this.L != null) {
            this.d0 = State.Constraint.RIGHT_TO_LEFT;
        } else {
            this.d0 = State.Constraint.RIGHT_TO_RIGHT;
        }
        f();
    }

    @Override // xsna.dpf0
    public final Object getKey() {
        return this.a;
    }

    public final void h() {
        if (this.R != null) {
            this.d0 = State.Constraint.TOP_TO_TOP;
        } else {
            this.d0 = State.Constraint.TOP_TO_BOTTOM;
        }
        f();
        this.d0 = State.Constraint.BASELINE_TO_BASELINE;
        f();
        if (this.U != null) {
            this.d0 = State.Constraint.BOTTOM_TO_TOP;
        } else {
            this.d0 = State.Constraint.BOTTOM_TO_BOTTOM;
        }
        f();
    }

    public final void i(Object obj) {
        this.d0 = State.Constraint.END_TO_END;
        this.Q = obj;
    }

    public final Object j(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.b.c.get(obj) : obj;
    }

    public a k(int i) {
        State.Constraint constraint = this.d0;
        if (constraint == null) {
            this.j = i;
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            return this;
        }
        switch (C0016a.a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.j = i;
                break;
            case 3:
            case 4:
                this.k = i;
                break;
            case 5:
            case 6:
                this.l = i;
                break;
            case 7:
            case 8:
                this.m = i;
                break;
            case 9:
            case 10:
            case 11:
                this.n = i;
                break;
            case 12:
            case 13:
            case 14:
                this.o = i;
                break;
            case 15:
            case 16:
            case 17:
                this.v = i;
                break;
            case 18:
                this.c0 = i;
                break;
        }
        return this;
    }

    public a l(Float f) {
        return k(this.b.c(f));
    }

    public final void m(int i) {
        State.Constraint constraint = this.d0;
        if (constraint == null) {
            this.p = i;
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            return;
        }
        switch (C0016a.a[constraint.ordinal()]) {
            case 1:
            case 2:
                this.p = i;
                break;
            case 3:
            case 4:
                this.q = i;
                break;
            case 5:
            case 6:
                this.r = i;
                break;
            case 7:
            case 8:
                this.s = i;
                break;
            case 9:
            case 10:
            case 11:
                this.t = i;
                break;
            case 12:
            case 13:
            case 14:
                this.u = i;
                break;
            case 15:
            case 16:
            case 17:
                this.w = i;
                break;
        }
    }

    public final void n(Float f) {
        m(this.b.c(f));
    }

    public final void o(Object obj) {
        this.d0 = State.Constraint.START_TO_START;
        this.N = obj;
    }

    public final void p(Object obj) {
        this.d0 = State.Constraint.TOP_TO_TOP;
        this.R = obj;
    }
}
