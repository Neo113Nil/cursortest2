package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import xsna.bnx0;
import xsna.era;
import xsna.fpr0;
import xsna.fw3;
import xsna.h5s;
import xsna.i5s;
import xsna.jh;
import xsna.jv8;
import xsna.mzl;
import xsna.n6j;
import xsna.nyh0;
import xsna.yfv;

/* loaded from: classes.dex */
public class ConstraintWidget {
    public float A;
    public int B;
    public float C;
    public int[] D;
    public float E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public final ConstraintAnchor K;
    public final ConstraintAnchor L;
    public final ConstraintAnchor M;
    public final ConstraintAnchor N;
    public final ConstraintAnchor O;
    public final ConstraintAnchor P;
    public final ConstraintAnchor Q;
    public final ConstraintAnchor R;
    public final ConstraintAnchor[] S;
    public final ArrayList<ConstraintAnchor> T;
    public final boolean[] U;
    public DimensionBehaviour[] V;
    public ConstraintWidget W;
    public int X;
    public int Y;
    public float Z;
    public boolean a;
    public int a0;
    public era b;
    public int b0;
    public era c;
    public int c0;
    public yfv d;
    public int d0;
    public fpr0 e;
    public int e0;
    public final boolean[] f;
    public int f0;
    public boolean g;
    public float g0;
    public int h;
    public float h0;
    public int i;
    public Object i0;
    public final bnx0 j;
    public int j0;
    public String k;
    public boolean k0;
    public boolean l;
    public String l0;
    public boolean m;
    public int m0;
    public boolean n;
    public int n0;
    public boolean o;
    public final float[] o0;
    public int p;
    public final ConstraintWidget[] p0;
    public int q;
    public final ConstraintWidget[] q0;
    public int r;
    public ConstraintWidget r0;
    public int s;
    public ConstraintWidget s0;
    public int t;
    public int t0;
    public final int[] u;
    public int u0;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DimensionBehaviour {
        private static final /* synthetic */ DimensionBehaviour[] $VALUES;
        public static final DimensionBehaviour FIXED;
        public static final DimensionBehaviour MATCH_CONSTRAINT;
        public static final DimensionBehaviour MATCH_PARENT;
        public static final DimensionBehaviour WRAP_CONTENT;

        static {
            DimensionBehaviour dimensionBehaviour = new DimensionBehaviour("FIXED", 0);
            FIXED = dimensionBehaviour;
            DimensionBehaviour dimensionBehaviour2 = new DimensionBehaviour("WRAP_CONTENT", 1);
            WRAP_CONTENT = dimensionBehaviour2;
            DimensionBehaviour dimensionBehaviour3 = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            MATCH_CONSTRAINT = dimensionBehaviour3;
            DimensionBehaviour dimensionBehaviour4 = new DimensionBehaviour("MATCH_PARENT", 3);
            MATCH_PARENT = dimensionBehaviour4;
            $VALUES = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour2, dimensionBehaviour3, dimensionBehaviour4};
        }

        public DimensionBehaviour() {
            throw null;
        }

        public static DimensionBehaviour valueOf(String str) {
            return (DimensionBehaviour) Enum.valueOf(DimensionBehaviour.class, str);
        }

        public static DimensionBehaviour[] values() {
            return (DimensionBehaviour[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConstraintAnchor.Type.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConstraintAnchor.Type.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public ConstraintWidget() {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new bnx0(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.O = constraintAnchor5;
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.R = constraintAnchor6;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.T = new ArrayList<>();
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new float[]{-1.0f, -1.0f};
        this.p0 = new ConstraintWidget[]{null, null};
        this.q0 = new ConstraintWidget[]{null, null};
        this.r0 = null;
        this.s0 = null;
        this.t0 = -1;
        this.u0 = -1;
        d();
    }

    public static void L(String str, int i, int i2, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        nyh0.a(i, str, " :   ", ",\n", sb);
    }

    public static void M(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void t(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, DimensionBehaviour dimensionBehaviour) {
        sb.append(str);
        sb.append(" :  {\n");
        String obj = dimensionBehaviour.toString();
        if (!DimensionBehaviour.FIXED.toString().equals(obj)) {
            n6j.b(sb, "      behavior", " :   ", obj, ",\n");
        }
        L("      size", i, 0, sb);
        L("      min", i2, 0, sb);
        L("      max", i3, Integer.MAX_VALUE, sb);
        L("      matchMin", i4, 0, sb);
        L("      matchDef", i5, 0, sb);
        M(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    public static void u(StringBuilder sb, String str, ConstraintAnchor constraintAnchor) {
        if (constraintAnchor.f == null) {
            return;
        }
        jh.f(sb, "    ", str, " : [ '");
        sb.append(constraintAnchor.f);
        sb.append("'");
        if (constraintAnchor.h != Integer.MIN_VALUE || constraintAnchor.g != 0) {
            sb.append(StringUtils.COMMA);
            sb.append(constraintAnchor.g);
            if (constraintAnchor.h != Integer.MIN_VALUE) {
                sb.append(StringUtils.COMMA);
                sb.append(constraintAnchor.h);
                sb.append(StringUtils.COMMA);
            }
        }
        sb.append(" ] ,\n");
    }

    public final void A(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i, int i2) {
        n(type).b(constraintWidget.n(type2), i, i2, true);
    }

    public final boolean B(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor3 = constraintAnchorArr[i2];
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return (constraintAnchor4 == null || constraintAnchor4.f == constraintAnchor3 || (constraintAnchor2 = (constraintAnchor = constraintAnchorArr[i2 + 1]).f) == null || constraintAnchor2.f != constraintAnchor) ? false : true;
    }

    public final boolean C() {
        ConstraintAnchor constraintAnchor = this.K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public final boolean D() {
        ConstraintAnchor constraintAnchor = this.L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.N;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public final boolean E() {
        return this.g && this.j0 != 8;
    }

    public boolean F() {
        if (this.l) {
            return true;
        }
        return this.K.c && this.M.c;
    }

    public boolean G() {
        if (this.m) {
            return true;
        }
        return this.L.c && this.N.c;
    }

    public void H() {
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.W = null;
        this.E = Float.NaN;
        this.X = 0;
        this.Y = 0;
        this.Z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.i0 = null;
        this.j0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        float[] fArr = this.o0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.p = -1;
        this.q = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.s = 0;
        this.t = 0;
        this.x = 1.0f;
        this.A = 1.0f;
        this.w = Integer.MAX_VALUE;
        this.z = Integer.MAX_VALUE;
        this.v = 0;
        this.y = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public final void I() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof d)) {
            ((d) constraintWidget).getClass();
        }
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).j();
        }
    }

    public final void J() {
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = arrayList.get(i);
            constraintAnchor.c = false;
            constraintAnchor.b = 0;
        }
    }

    public void K(jv8 jv8Var) {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.R.k();
        this.P.k();
        this.Q.k();
    }

    public final void N(int i) {
        this.d0 = i;
        this.F = i > 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public final void O(String str) {
        float f;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.Z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i2 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i2 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f = Float.parseFloat(substring2);
            }
            f = i;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && parseFloat2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f = i;
        }
        i = (f > i ? 1 : (f == i ? 0 : -1));
        if (i > 0) {
            this.Z = f;
            this.a0 = i2;
        }
    }

    public final void P(int i, int i2) {
        if (this.l) {
            return;
        }
        this.K.l(i);
        this.M.l(i2);
        this.b0 = i;
        this.X = i2 - i;
        this.l = true;
    }

    public final void Q(int i, int i2) {
        if (this.m) {
            return;
        }
        this.L.l(i);
        this.N.l(i2);
        this.c0 = i;
        this.Y = i2 - i;
        if (this.F) {
            this.O.l(i + this.d0);
        }
        this.m = true;
    }

    public final void R(int i) {
        this.Y = i;
        int i2 = this.f0;
        if (i < i2) {
            this.Y = i2;
        }
    }

    public final void S(DimensionBehaviour dimensionBehaviour) {
        this.V[0] = dimensionBehaviour;
    }

    public final void T(float f, int i, int i2, int i3) {
        this.s = i;
        this.v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.w = i3;
        this.x = f;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f || i != 0) {
            return;
        }
        this.s = 2;
    }

    public final void U(DimensionBehaviour dimensionBehaviour) {
        this.V[1] = dimensionBehaviour;
    }

    public final void V(float f, int i, int i2, int i3) {
        this.t = i;
        this.y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.z = i3;
        this.A = f;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 1.0f || i != 0) {
            return;
        }
        this.t = 2;
    }

    public final void W(int i) {
        this.X = i;
        int i2 = this.e0;
        if (i < i2) {
            this.X = i2;
        }
    }

    public void X(boolean z, boolean z2) {
        int i;
        int i2;
        yfv yfvVar = this.d;
        boolean z3 = z & yfvVar.g;
        fpr0 fpr0Var = this.e;
        boolean z4 = z2 & fpr0Var.g;
        int i3 = yfvVar.h.g;
        int i4 = fpr0Var.h.g;
        int i5 = yfvVar.i.g;
        int i6 = fpr0Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.b0 = i3;
        }
        if (z4) {
            this.c0 = i4;
        }
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (z3) {
            if (this.V[0] == DimensionBehaviour.FIXED && i8 < (i2 = this.X)) {
                i8 = i2;
            }
            this.X = i8;
            int i10 = this.e0;
            if (i8 < i10) {
                this.X = i10;
            }
        }
        if (z4) {
            if (this.V[1] == DimensionBehaviour.FIXED && i9 < (i = this.Y)) {
                i9 = i;
            }
            this.Y = i9;
            int i11 = this.f0;
            if (i9 < i11) {
                this.Y = i11;
            }
        }
    }

    public void Y(androidx.constraintlayout.core.c cVar, boolean z) {
        int i;
        int i2;
        fpr0 fpr0Var;
        yfv yfvVar;
        cVar.getClass();
        int n = androidx.constraintlayout.core.c.n(this.K);
        int n2 = androidx.constraintlayout.core.c.n(this.L);
        int n3 = androidx.constraintlayout.core.c.n(this.M);
        int n4 = androidx.constraintlayout.core.c.n(this.N);
        if (z && (yfvVar = this.d) != null) {
            mzl mzlVar = yfvVar.h;
            if (mzlVar.j) {
                mzl mzlVar2 = yfvVar.i;
                if (mzlVar2.j) {
                    n = mzlVar.g;
                    n3 = mzlVar2.g;
                }
            }
        }
        if (z && (fpr0Var = this.e) != null) {
            mzl mzlVar3 = fpr0Var.h;
            if (mzlVar3.j) {
                mzl mzlVar4 = fpr0Var.i;
                if (mzlVar4.j) {
                    n2 = mzlVar3.g;
                    n4 = mzlVar4.g;
                }
            }
        }
        int i3 = n4 - n2;
        if (n3 - n < 0 || i3 < 0 || n == Integer.MIN_VALUE || n == Integer.MAX_VALUE || n2 == Integer.MIN_VALUE || n2 == Integer.MAX_VALUE || n3 == Integer.MIN_VALUE || n3 == Integer.MAX_VALUE || n4 == Integer.MIN_VALUE || n4 == Integer.MAX_VALUE) {
            n = 0;
            n2 = 0;
            n3 = 0;
            n4 = 0;
        }
        int i4 = n3 - n;
        int i5 = n4 - n2;
        this.b0 = n;
        this.c0 = n2;
        if (this.j0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i4 < (i2 = this.X)) {
            i4 = i2;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i5 < (i = this.Y)) {
            i5 = i;
        }
        this.X = i4;
        this.Y = i5;
        int i6 = this.f0;
        if (i5 < i6) {
            this.Y = i6;
        }
        int i7 = this.e0;
        if (i4 < i7) {
            this.X = i7;
        }
        int i8 = this.w;
        if (i8 > 0 && dimensionBehaviour == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i8);
        }
        int i9 = this.z;
        if (i9 > 0 && this.V[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i9);
        }
        int i10 = this.X;
        if (i4 != i10) {
            this.h = i10;
        }
        int i11 = this.Y;
        if (i5 != i11) {
            this.i = i11;
        }
    }

    public final void d() {
        ConstraintAnchor constraintAnchor = this.K;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        arrayList.add(constraintAnchor);
        arrayList.add(this.L);
        arrayList.add(this.M);
        arrayList.add(this.N);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.R);
        arrayList.add(this.O);
    }

    public final void e(d dVar, androidx.constraintlayout.core.c cVar, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            g.a(dVar, cVar, this);
            hashSet.remove(this);
            f(cVar, dVar.f0(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.e(dVar, cVar, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.e(dVar, cVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.e(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.e(dVar, cVar, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.e(dVar, cVar, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r13 != 3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05e8, code lost:
    
        if (r59.j0 == r9) goto L379;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02aa  */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [int] */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v46, types: [androidx.constraintlayout.core.widgets.d] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r59v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget] */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(androidx.constraintlayout.core.c cVar, boolean z) {
        boolean z2;
        boolean z3;
        ?? r19;
        ?? r17;
        boolean z4;
        boolean z5;
        int i;
        boolean z6;
        boolean z7;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean[] zArr;
        ConstraintAnchor constraintAnchor;
        boolean[] zArr2;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i2;
        int i3;
        float f;
        SolverVariable solverVariable;
        SolverVariable solverVariable2;
        ConstraintAnchor constraintAnchor4;
        int i4;
        int i5;
        int i6;
        boolean z11;
        int i7;
        boolean z12;
        DimensionBehaviour dimensionBehaviour;
        DimensionBehaviour dimensionBehaviour2;
        DimensionBehaviour dimensionBehaviour3;
        boolean z13;
        ConstraintAnchor constraintAnchor5;
        boolean z14;
        boolean z15;
        ConstraintAnchor constraintAnchor6;
        SolverVariable solverVariable3;
        DimensionBehaviour dimensionBehaviour4;
        SolverVariable solverVariable4;
        DimensionBehaviour dimensionBehaviour5;
        ConstraintAnchor constraintAnchor7;
        boolean z16;
        boolean z17;
        boolean z18;
        SolverVariable solverVariable5;
        ConstraintAnchor constraintAnchor8;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        int i8;
        boolean[] zArr3;
        SolverVariable solverVariable8;
        SolverVariable solverVariable9;
        SolverVariable solverVariable10;
        int i9;
        int i10;
        int i11;
        int i12;
        SolverVariable solverVariable11;
        SolverVariable solverVariable12;
        ?? r27;
        fpr0 fpr0Var;
        mzl mzlVar;
        ConstraintWidget constraintWidget3;
        yfv yfvVar;
        mzl mzlVar2;
        int i13;
        boolean C;
        ?? r12;
        boolean D;
        yfv yfvVar2;
        fpr0 fpr0Var2;
        boolean z19;
        androidx.constraintlayout.core.c cVar2 = cVar;
        ConstraintAnchor constraintAnchor9 = this.K;
        SolverVariable k = cVar2.k(constraintAnchor9);
        ConstraintAnchor constraintAnchor10 = this.M;
        SolverVariable k2 = cVar2.k(constraintAnchor10);
        ConstraintAnchor constraintAnchor11 = this.L;
        SolverVariable k3 = cVar2.k(constraintAnchor11);
        ConstraintAnchor constraintAnchor12 = this.N;
        SolverVariable k4 = cVar2.k(constraintAnchor12);
        ConstraintAnchor constraintAnchor13 = this.O;
        SolverVariable k5 = cVar2.k(constraintAnchor13);
        ConstraintWidget constraintWidget4 = this.W;
        if (constraintWidget4 != null) {
            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget4.V;
            r17 = 0;
            r17 = 0;
            z3 = false;
            r17 = 0;
            DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
            DimensionBehaviour dimensionBehaviour7 = DimensionBehaviour.WRAP_CONTENT;
            z4 = dimensionBehaviour6 == dimensionBehaviour7;
            z5 = dimensionBehaviourArr[1] == dimensionBehaviour7;
            int i14 = this.r;
            if (i14 != 1) {
                boolean z20 = true;
                if (i14 != 2) {
                    z2 = z20;
                    r19 = z20;
                } else {
                    z4 = false;
                    r19 = z20;
                }
            } else {
                r19 = 1;
                z5 = false;
            }
            i = this.j0;
            boolean[] zArr4 = this.U;
            boolean z21 = z5;
            if (i == 8 || this.k0) {
                z6 = z4;
            } else {
                ArrayList<ConstraintAnchor> arrayList = this.T;
                int size = arrayList.size();
                z6 = z4;
                int i15 = r17;
                while (true) {
                    if (i15 < size) {
                        int i16 = size;
                        HashSet<ConstraintAnchor> hashSet = arrayList.get(i15).a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i15++;
                        size = i16;
                    } else if (!zArr4[r17] && !zArr4[r19]) {
                        return;
                    }
                }
            }
            z7 = this.l;
            if (!z7 || this.m) {
                if (z7) {
                    cVar2.d(k, this.b0);
                    cVar2.d(k2, this.b0 + this.X);
                    if (z6 && (constraintWidget2 = this.W) != null) {
                        d dVar = (d) constraintWidget2;
                        WeakReference<ConstraintAnchor> weakReference = dVar.M0;
                        if (weakReference == null || weakReference.get() == null || constraintAnchor9.d() > dVar.M0.get().d()) {
                            dVar.M0 = new WeakReference<>(constraintAnchor9);
                        }
                        WeakReference<ConstraintAnchor> weakReference2 = dVar.O0;
                        if (weakReference2 == null || weakReference2.get() == null || constraintAnchor10.d() > dVar.O0.get().d()) {
                            dVar.O0 = new WeakReference<>(constraintAnchor10);
                        }
                    }
                }
                if (this.m) {
                    cVar2.d(k3, this.c0);
                    cVar2.d(k4, this.c0 + this.Y);
                    HashSet<ConstraintAnchor> hashSet2 = constraintAnchor13.a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar2.d(k5, this.c0 + this.d0);
                    }
                    if (z21 && (constraintWidget = this.W) != null) {
                        d dVar2 = (d) constraintWidget;
                        WeakReference<ConstraintAnchor> weakReference3 = dVar2.L0;
                        if (weakReference3 == null || weakReference3.get() == null || constraintAnchor11.d() > dVar2.L0.get().d()) {
                            dVar2.L0 = new WeakReference<>(constraintAnchor11);
                        }
                        WeakReference<ConstraintAnchor> weakReference4 = dVar2.N0;
                        if (weakReference4 == null || weakReference4.get() == null || constraintAnchor12.d() > dVar2.N0.get().d()) {
                            dVar2.N0 = new WeakReference<>(constraintAnchor12);
                        }
                    }
                }
                if (this.l && this.m) {
                    boolean z22 = r17;
                    this.l = z22;
                    this.m = z22;
                    return;
                }
            }
            zArr = this.f;
            if (z || (yfvVar2 = this.d) == null || (fpr0Var2 = this.e) == null) {
                constraintAnchor = constraintAnchor13;
                zArr2 = zArr;
            } else {
                constraintAnchor = constraintAnchor13;
                mzl mzlVar3 = yfvVar2.h;
                zArr2 = zArr;
                if (mzlVar3.j && yfvVar2.i.j && fpr0Var2.h.j && fpr0Var2.i.j) {
                    cVar2.d(k, mzlVar3.g);
                    cVar2.d(k2, this.d.i.g);
                    cVar2.d(k3, this.e.h.g);
                    cVar2.d(k4, this.e.i.g);
                    cVar2.d(k5, this.e.k.g);
                    if (this.W != null) {
                        if (z6 && zArr2[0] && !C()) {
                            cVar2.f(cVar2.k(this.W.M), k2, 0, 8);
                        }
                        if (z21 && zArr2[r19] && !D()) {
                            z19 = false;
                            cVar2.f(cVar2.k(this.W.N), k4, 0, 8);
                            this.l = z19;
                            this.m = z19;
                            return;
                        }
                    }
                    z19 = false;
                    this.l = z19;
                    this.m = z19;
                    return;
                }
            }
            if (this.W == null) {
                if (B(0)) {
                    ((d) this.W).a0(this, 0);
                    C = r19;
                    r12 = C;
                } else {
                    C = C();
                    r12 = r19;
                }
                if (B(r12)) {
                    ((d) this.W).a0(this, r12);
                    D = true;
                } else {
                    D = D();
                }
                if (!C && z6 && this.j0 != 8 && constraintAnchor9.f == null && constraintAnchor10.f == null) {
                    constraintAnchor2 = constraintAnchor9;
                    cVar2.f(cVar2.k(this.W.M), k2, 0, 1);
                } else {
                    constraintAnchor2 = constraintAnchor9;
                }
                if (!D && z21 && this.j0 != 8 && constraintAnchor11.f == null && constraintAnchor12.f == null && constraintAnchor == null) {
                    cVar2.f(cVar2.k(this.W.N), k4, 0, 1);
                }
                constraintAnchor3 = constraintAnchor10;
                z8 = z21;
                z10 = D;
                z9 = C;
            } else {
                constraintAnchor2 = constraintAnchor9;
                constraintAnchor3 = constraintAnchor10;
                z8 = z21;
                z9 = false;
                z10 = false;
            }
            i2 = this.X;
            i3 = this.e0;
            if (i2 >= i3) {
                i3 = i2;
            }
            int i17 = this.Y;
            ConstraintAnchor constraintAnchor14 = constraintAnchor3;
            int i18 = this.f0;
            int i19 = i17 >= i18 ? i18 : i17;
            DimensionBehaviour[] dimensionBehaviourArr2 = this.V;
            DimensionBehaviour dimensionBehaviour8 = dimensionBehaviourArr2[0];
            boolean z23 = z8;
            DimensionBehaviour dimensionBehaviour9 = DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z24 = dimensionBehaviour8 == dimensionBehaviour9;
            DimensionBehaviour dimensionBehaviour10 = dimensionBehaviourArr2[1];
            boolean z25 = dimensionBehaviour10 == dimensionBehaviour9;
            int i20 = this.a0;
            this.B = i20;
            f = this.Z;
            this.C = f;
            int i21 = this.s;
            int i22 = this.t;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                solverVariable = k4;
                if (this.j0 != 8) {
                    i5 = (dimensionBehaviour8 == dimensionBehaviour9 && i21 == 0) ? 3 : i21;
                    int i23 = (dimensionBehaviour10 == dimensionBehaviour9 && i22 == 0) ? 3 : i22;
                    if (dimensionBehaviour8 == dimensionBehaviour9 && dimensionBehaviour10 == dimensionBehaviour9) {
                        solverVariable2 = k5;
                        if (i5 == 3 && i23 == 3) {
                            if (i20 == -1) {
                                if (z24 && !z25) {
                                    this.B = 0;
                                } else if (!z24 && z25) {
                                    this.B = 1;
                                    if (i20 == -1) {
                                        this.C = 1.0f / f;
                                    }
                                }
                            }
                            if (this.B == 0 && (!constraintAnchor11.h() || !constraintAnchor12.h())) {
                                this.B = 1;
                            } else if (this.B == 1 && (!constraintAnchor2.h() || !constraintAnchor14.h())) {
                                this.B = 0;
                            }
                            if (this.B == -1 && (!constraintAnchor11.h() || !constraintAnchor12.h() || !constraintAnchor2.h() || !constraintAnchor14.h())) {
                                if (constraintAnchor11.h() && constraintAnchor12.h()) {
                                    this.B = 0;
                                } else if (constraintAnchor2.h() && constraintAnchor14.h()) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                            if (this.B == -1) {
                                int i24 = this.v;
                                if (i24 > 0 && this.y == 0) {
                                    this.B = 0;
                                } else if (i24 == 0 && this.y > 0) {
                                    this.C = 1.0f / this.C;
                                    this.B = 1;
                                }
                            }
                            constraintAnchor4 = constraintAnchor;
                            i4 = i19;
                            z11 = true;
                            i6 = i23;
                            int[] iArr = this.u;
                            iArr[0] = i5;
                            iArr[1] = i6;
                            if (z11) {
                                i7 = -1;
                            } else {
                                int i25 = this.B;
                                i7 = -1;
                                if (i25 == 0 || i25 == -1) {
                                    z12 = true;
                                    boolean z26 = !z11 && ((i13 = this.B) == 1 || i13 == i7);
                                    dimensionBehaviour = this.V[0];
                                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                                    if (dimensionBehaviour == dimensionBehaviour2 || !(this instanceof d)) {
                                        dimensionBehaviour3 = dimensionBehaviour2;
                                        z13 = false;
                                    } else {
                                        dimensionBehaviour3 = dimensionBehaviour2;
                                        z13 = true;
                                    }
                                    if (z13) {
                                        i3 = 0;
                                    }
                                    constraintAnchor5 = this.R;
                                    z14 = !constraintAnchor5.h();
                                    z15 = zArr4[0];
                                    boolean z27 = zArr4[1];
                                    if (this.p != 2 && !this.l) {
                                        if (z && (yfvVar = this.d) != null) {
                                            mzlVar2 = yfvVar.h;
                                            if (!mzlVar2.j && yfvVar.i.j) {
                                                if (z) {
                                                    cVar2.d(k, mzlVar2.g);
                                                    cVar2.d(k2, this.d.i.g);
                                                    if (this.W != null && z6 && zArr2[0] && !C()) {
                                                        cVar2.f(cVar2.k(this.W.M), k2, 0, 8);
                                                    }
                                                }
                                            }
                                        }
                                        ConstraintWidget constraintWidget5 = this.W;
                                        SolverVariable k6 = constraintWidget5 == null ? cVar2.k(constraintWidget5.M) : null;
                                        ConstraintWidget constraintWidget6 = this.W;
                                        SolverVariable k7 = constraintWidget6 == null ? cVar2.k(constraintWidget6.K) : null;
                                        boolean z28 = zArr2[0];
                                        DimensionBehaviour[] dimensionBehaviourArr3 = this.V;
                                        z17 = z6;
                                        i8 = i5;
                                        DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr3[0];
                                        z16 = z9;
                                        int i26 = this.b0;
                                        int i27 = this.e0;
                                        int i28 = this.D[0];
                                        float f2 = this.g0;
                                        boolean z29 = dimensionBehaviourArr3[1] != dimensionBehaviour9;
                                        constraintAnchor7 = constraintAnchor5;
                                        dimensionBehaviour4 = dimensionBehaviour9;
                                        solverVariable4 = k2;
                                        solverVariable3 = k;
                                        z18 = z23;
                                        solverVariable5 = k3;
                                        constraintAnchor8 = constraintAnchor12;
                                        solverVariable6 = solverVariable;
                                        solverVariable7 = solverVariable2;
                                        constraintAnchor6 = constraintAnchor4;
                                        dimensionBehaviour5 = dimensionBehaviour3;
                                        zArr3 = zArr2;
                                        cVar2 = cVar;
                                        h(cVar2, true, z17, z18, z28, k7, k6, dimensionBehaviour11, z13, this.K, this.M, i26, i3, i27, i28, f2, z12, z29, z16, z10, z15, i8, i6, this.v, this.w, this.x, z14);
                                        if (z && (fpr0Var = this.e) != null) {
                                            mzlVar = fpr0Var.h;
                                            if (mzlVar.j && fpr0Var.i.j) {
                                                int i29 = mzlVar.g;
                                                solverVariable8 = solverVariable5;
                                                cVar2.d(solverVariable8, i29);
                                                solverVariable9 = solverVariable6;
                                                cVar2.d(solverVariable9, this.e.i.g);
                                                solverVariable10 = solverVariable7;
                                                cVar2.d(solverVariable10, this.e.k.g);
                                                constraintWidget3 = this.W;
                                                if (constraintWidget3 == null && !z10 && z18) {
                                                    i11 = 1;
                                                    if (zArr3[1]) {
                                                        i9 = 0;
                                                        i10 = 8;
                                                        cVar2.f(cVar2.k(constraintWidget3.N), solverVariable9, 0, 8);
                                                    } else {
                                                        i9 = 0;
                                                        i10 = 8;
                                                    }
                                                } else {
                                                    i9 = 0;
                                                    i10 = 8;
                                                    i11 = 1;
                                                }
                                                i12 = i9;
                                                if (this.q == 2) {
                                                    i12 = i9;
                                                }
                                                if (i12 != 0 || this.m) {
                                                    solverVariable11 = solverVariable8;
                                                    solverVariable12 = solverVariable9;
                                                } else {
                                                    int i30 = (this.V[i11] == dimensionBehaviour5 && (this instanceof d)) ? i11 : i9;
                                                    int i31 = i30 != 0 ? i9 : i4;
                                                    ConstraintWidget constraintWidget7 = this.W;
                                                    SolverVariable k8 = constraintWidget7 != null ? cVar2.k(constraintWidget7.N) : null;
                                                    ConstraintWidget constraintWidget8 = this.W;
                                                    SolverVariable k9 = constraintWidget8 != null ? cVar2.k(constraintWidget8.L) : null;
                                                    int i32 = this.d0;
                                                    if (i32 <= 0) {
                                                        r27 = z14;
                                                    }
                                                    ConstraintAnchor constraintAnchor15 = constraintAnchor6;
                                                    if (constraintAnchor15.f != null) {
                                                        cVar2.e(solverVariable10, solverVariable8, i32, i10);
                                                        cVar2.e(solverVariable10, cVar2.k(constraintAnchor15.f), constraintAnchor15.e(), i10);
                                                        if (z18) {
                                                            cVar2.f(k8, cVar2.k(constraintAnchor8), i9, 5);
                                                        }
                                                        r27 = i9;
                                                    } else if (this.j0 == i10) {
                                                        cVar2.e(solverVariable10, solverVariable8, constraintAnchor15.e(), i10);
                                                        r27 = z14;
                                                    } else {
                                                        cVar2.e(solverVariable10, solverVariable8, i32, i10);
                                                        r27 = z14;
                                                    }
                                                    boolean z30 = zArr3[i11];
                                                    DimensionBehaviour[] dimensionBehaviourArr4 = this.V;
                                                    int i33 = i9;
                                                    int i34 = i11;
                                                    solverVariable12 = solverVariable9;
                                                    solverVariable11 = solverVariable8;
                                                    cVar2 = cVar;
                                                    h(cVar2, false, z18, z17, z30, k9, k8, dimensionBehaviourArr4[i11], i30, this.L, this.N, this.c0, i31, this.f0, this.D[i34], this.h0, z26, dimensionBehaviourArr4[i33] == dimensionBehaviour4 ? i34 : i33, z10, z16, z27, i6, i8, this.y, this.z, this.A, r27);
                                                }
                                                if (z11) {
                                                    if (this.B == 1) {
                                                        float f3 = this.C;
                                                        androidx.constraintlayout.core.b l = cVar2.l();
                                                        l.d.b(solverVariable12, -1.0f);
                                                        l.d.b(solverVariable11, 1.0f);
                                                        l.d.b(solverVariable4, f3);
                                                        l.d.b(solverVariable3, -f3);
                                                        cVar2.c(l);
                                                    } else {
                                                        float f4 = this.C;
                                                        androidx.constraintlayout.core.b l2 = cVar2.l();
                                                        l2.d.b(solverVariable4, -1.0f);
                                                        l2.d.b(solverVariable3, 1.0f);
                                                        l2.d.b(solverVariable12, f4);
                                                        l2.d.b(solverVariable11, -f4);
                                                        cVar2.c(l2);
                                                    }
                                                }
                                                if (constraintAnchor7.h()) {
                                                    ConstraintAnchor constraintAnchor16 = constraintAnchor7;
                                                    ConstraintWidget constraintWidget9 = constraintAnchor16.f.d;
                                                    float radians = (float) Math.toRadians(this.E + 90.0f);
                                                    int e = constraintAnchor16.e();
                                                    ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                                                    SolverVariable k10 = cVar2.k(n(type));
                                                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                                                    SolverVariable k11 = cVar2.k(n(type2));
                                                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                                                    SolverVariable k12 = cVar2.k(n(type3));
                                                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                                                    SolverVariable k13 = cVar2.k(n(type4));
                                                    SolverVariable k14 = cVar2.k(constraintWidget9.n(type));
                                                    SolverVariable k15 = cVar2.k(constraintWidget9.n(type2));
                                                    SolverVariable k16 = cVar2.k(constraintWidget9.n(type3));
                                                    SolverVariable k17 = cVar2.k(constraintWidget9.n(type4));
                                                    androidx.constraintlayout.core.b l3 = cVar2.l();
                                                    double d = radians;
                                                    double sin = Math.sin(d);
                                                    double d2 = e;
                                                    l3.d.b(k15, 0.5f);
                                                    l3.d.b(k17, 0.5f);
                                                    l3.d.b(k11, -0.5f);
                                                    l3.d.b(k13, -0.5f);
                                                    l3.b = -((float) (sin * d2));
                                                    cVar2.c(l3);
                                                    androidx.constraintlayout.core.b l4 = cVar2.l();
                                                    float cos = (float) (Math.cos(d) * d2);
                                                    l4.d.b(k14, 0.5f);
                                                    l4.d.b(k16, 0.5f);
                                                    l4.d.b(k10, -0.5f);
                                                    l4.d.b(k12, -0.5f);
                                                    l4.b = -cos;
                                                    cVar2.c(l4);
                                                }
                                                this.l = false;
                                                this.m = false;
                                            }
                                        }
                                        solverVariable8 = solverVariable5;
                                        solverVariable9 = solverVariable6;
                                        solverVariable10 = solverVariable7;
                                        i9 = 0;
                                        i10 = 8;
                                        i11 = 1;
                                        i12 = 1;
                                        if (this.q == 2) {
                                        }
                                        if (i12 != 0) {
                                        }
                                        solverVariable11 = solverVariable8;
                                        solverVariable12 = solverVariable9;
                                        if (z11) {
                                        }
                                        if (constraintAnchor7.h()) {
                                        }
                                        this.l = false;
                                        this.m = false;
                                    }
                                    constraintAnchor6 = constraintAnchor4;
                                    solverVariable3 = k;
                                    dimensionBehaviour4 = dimensionBehaviour9;
                                    solverVariable4 = k2;
                                    dimensionBehaviour5 = dimensionBehaviour3;
                                    constraintAnchor7 = constraintAnchor5;
                                    z16 = z9;
                                    z17 = z6;
                                    z18 = z23;
                                    solverVariable5 = k3;
                                    constraintAnchor8 = constraintAnchor12;
                                    solverVariable6 = solverVariable;
                                    solverVariable7 = solverVariable2;
                                    i8 = i5;
                                    zArr3 = zArr2;
                                    if (z) {
                                        mzlVar = fpr0Var.h;
                                        if (mzlVar.j) {
                                            int i292 = mzlVar.g;
                                            solverVariable8 = solverVariable5;
                                            cVar2.d(solverVariable8, i292);
                                            solverVariable9 = solverVariable6;
                                            cVar2.d(solverVariable9, this.e.i.g);
                                            solverVariable10 = solverVariable7;
                                            cVar2.d(solverVariable10, this.e.k.g);
                                            constraintWidget3 = this.W;
                                            if (constraintWidget3 == null) {
                                            }
                                            i9 = 0;
                                            i10 = 8;
                                            i11 = 1;
                                            i12 = i9;
                                            if (this.q == 2) {
                                            }
                                            if (i12 != 0) {
                                            }
                                            solverVariable11 = solverVariable8;
                                            solverVariable12 = solverVariable9;
                                            if (z11) {
                                            }
                                            if (constraintAnchor7.h()) {
                                            }
                                            this.l = false;
                                            this.m = false;
                                        }
                                    }
                                    solverVariable8 = solverVariable5;
                                    solverVariable9 = solverVariable6;
                                    solverVariable10 = solverVariable7;
                                    i9 = 0;
                                    i10 = 8;
                                    i11 = 1;
                                    i12 = 1;
                                    if (this.q == 2) {
                                    }
                                    if (i12 != 0) {
                                    }
                                    solverVariable11 = solverVariable8;
                                    solverVariable12 = solverVariable9;
                                    if (z11) {
                                    }
                                    if (constraintAnchor7.h()) {
                                    }
                                    this.l = false;
                                    this.m = false;
                                }
                            }
                            z12 = false;
                            if (z11) {
                            }
                            dimensionBehaviour = this.V[0];
                            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                            if (dimensionBehaviour == dimensionBehaviour2) {
                            }
                            dimensionBehaviour3 = dimensionBehaviour2;
                            z13 = false;
                            if (z13) {
                            }
                            constraintAnchor5 = this.R;
                            z14 = !constraintAnchor5.h();
                            z15 = zArr4[0];
                            boolean z272 = zArr4[1];
                            if (this.p != 2) {
                                if (z) {
                                    mzlVar2 = yfvVar.h;
                                    if (!mzlVar2.j) {
                                    }
                                }
                                ConstraintWidget constraintWidget52 = this.W;
                                if (constraintWidget52 == null) {
                                }
                                ConstraintWidget constraintWidget62 = this.W;
                                if (constraintWidget62 == null) {
                                }
                                boolean z282 = zArr2[0];
                                DimensionBehaviour[] dimensionBehaviourArr32 = this.V;
                                z17 = z6;
                                i8 = i5;
                                DimensionBehaviour dimensionBehaviour112 = dimensionBehaviourArr32[0];
                                z16 = z9;
                                int i262 = this.b0;
                                int i272 = this.e0;
                                int i282 = this.D[0];
                                float f22 = this.g0;
                                if (dimensionBehaviourArr32[1] != dimensionBehaviour9) {
                                }
                                constraintAnchor7 = constraintAnchor5;
                                dimensionBehaviour4 = dimensionBehaviour9;
                                solverVariable4 = k2;
                                solverVariable3 = k;
                                z18 = z23;
                                solverVariable5 = k3;
                                constraintAnchor8 = constraintAnchor12;
                                solverVariable6 = solverVariable;
                                solverVariable7 = solverVariable2;
                                constraintAnchor6 = constraintAnchor4;
                                dimensionBehaviour5 = dimensionBehaviour3;
                                zArr3 = zArr2;
                                cVar2 = cVar;
                                h(cVar2, true, z17, z18, z282, k7, k6, dimensionBehaviour112, z13, this.K, this.M, i262, i3, i272, i282, f22, z12, z29, z16, z10, z15, i8, i6, this.v, this.w, this.x, z14);
                                if (z) {
                                }
                                solverVariable8 = solverVariable5;
                                solverVariable9 = solverVariable6;
                                solverVariable10 = solverVariable7;
                                i9 = 0;
                                i10 = 8;
                                i11 = 1;
                                i12 = 1;
                                if (this.q == 2) {
                                }
                                if (i12 != 0) {
                                }
                                solverVariable11 = solverVariable8;
                                solverVariable12 = solverVariable9;
                                if (z11) {
                                }
                                if (constraintAnchor7.h()) {
                                }
                                this.l = false;
                                this.m = false;
                            }
                            constraintAnchor6 = constraintAnchor4;
                            solverVariable3 = k;
                            dimensionBehaviour4 = dimensionBehaviour9;
                            solverVariable4 = k2;
                            dimensionBehaviour5 = dimensionBehaviour3;
                            constraintAnchor7 = constraintAnchor5;
                            z16 = z9;
                            z17 = z6;
                            z18 = z23;
                            solverVariable5 = k3;
                            constraintAnchor8 = constraintAnchor12;
                            solverVariable6 = solverVariable;
                            solverVariable7 = solverVariable2;
                            i8 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            solverVariable8 = solverVariable5;
                            solverVariable9 = solverVariable6;
                            solverVariable10 = solverVariable7;
                            i9 = 0;
                            i10 = 8;
                            i11 = 1;
                            i12 = 1;
                            if (this.q == 2) {
                            }
                            if (i12 != 0) {
                            }
                            solverVariable11 = solverVariable8;
                            solverVariable12 = solverVariable9;
                            if (z11) {
                            }
                            if (constraintAnchor7.h()) {
                            }
                            this.l = false;
                            this.m = false;
                        }
                    } else {
                        solverVariable2 = k5;
                    }
                    if (dimensionBehaviour8 == dimensionBehaviour9 && i5 == 3) {
                        this.B = 0;
                        i3 = (int) (i17 * f);
                        constraintAnchor4 = constraintAnchor;
                        i4 = i19;
                        if (dimensionBehaviour10 != dimensionBehaviour9) {
                            i5 = 4;
                            z11 = false;
                            i6 = i23;
                            int[] iArr2 = this.u;
                            iArr2[0] = i5;
                            iArr2[1] = i6;
                            if (z11) {
                            }
                            z12 = false;
                            if (z11) {
                            }
                            dimensionBehaviour = this.V[0];
                            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                            if (dimensionBehaviour == dimensionBehaviour2) {
                            }
                            dimensionBehaviour3 = dimensionBehaviour2;
                            z13 = false;
                            if (z13) {
                            }
                            constraintAnchor5 = this.R;
                            z14 = !constraintAnchor5.h();
                            z15 = zArr4[0];
                            boolean z2722 = zArr4[1];
                            if (this.p != 2) {
                            }
                            constraintAnchor6 = constraintAnchor4;
                            solverVariable3 = k;
                            dimensionBehaviour4 = dimensionBehaviour9;
                            solverVariable4 = k2;
                            dimensionBehaviour5 = dimensionBehaviour3;
                            constraintAnchor7 = constraintAnchor5;
                            z16 = z9;
                            z17 = z6;
                            z18 = z23;
                            solverVariable5 = k3;
                            constraintAnchor8 = constraintAnchor12;
                            solverVariable6 = solverVariable;
                            solverVariable7 = solverVariable2;
                            i8 = i5;
                            zArr3 = zArr2;
                            if (z) {
                            }
                            solverVariable8 = solverVariable5;
                            solverVariable9 = solverVariable6;
                            solverVariable10 = solverVariable7;
                            i9 = 0;
                            i10 = 8;
                            i11 = 1;
                            i12 = 1;
                            if (this.q == 2) {
                            }
                            if (i12 != 0) {
                            }
                            solverVariable11 = solverVariable8;
                            solverVariable12 = solverVariable9;
                            if (z11) {
                            }
                            if (constraintAnchor7.h()) {
                            }
                            this.l = false;
                            this.m = false;
                        }
                    } else {
                        if (dimensionBehaviour10 == dimensionBehaviour9 && i23 == 3) {
                            this.B = 1;
                            if (i20 == -1) {
                                this.C = 1.0f / f;
                            }
                            i4 = (int) (this.C * i2);
                            if (dimensionBehaviour8 != dimensionBehaviour9) {
                                constraintAnchor4 = constraintAnchor;
                                i6 = 4;
                                z11 = false;
                                int[] iArr22 = this.u;
                                iArr22[0] = i5;
                                iArr22[1] = i6;
                                if (z11) {
                                }
                                z12 = false;
                                if (z11) {
                                }
                                dimensionBehaviour = this.V[0];
                                dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                                if (dimensionBehaviour == dimensionBehaviour2) {
                                }
                                dimensionBehaviour3 = dimensionBehaviour2;
                                z13 = false;
                                if (z13) {
                                }
                                constraintAnchor5 = this.R;
                                z14 = !constraintAnchor5.h();
                                z15 = zArr4[0];
                                boolean z27222 = zArr4[1];
                                if (this.p != 2) {
                                }
                                constraintAnchor6 = constraintAnchor4;
                                solverVariable3 = k;
                                dimensionBehaviour4 = dimensionBehaviour9;
                                solverVariable4 = k2;
                                dimensionBehaviour5 = dimensionBehaviour3;
                                constraintAnchor7 = constraintAnchor5;
                                z16 = z9;
                                z17 = z6;
                                z18 = z23;
                                solverVariable5 = k3;
                                constraintAnchor8 = constraintAnchor12;
                                solverVariable6 = solverVariable;
                                solverVariable7 = solverVariable2;
                                i8 = i5;
                                zArr3 = zArr2;
                                if (z) {
                                }
                                solverVariable8 = solverVariable5;
                                solverVariable9 = solverVariable6;
                                solverVariable10 = solverVariable7;
                                i9 = 0;
                                i10 = 8;
                                i11 = 1;
                                i12 = 1;
                                if (this.q == 2) {
                                }
                                if (i12 != 0) {
                                }
                                solverVariable11 = solverVariable8;
                                solverVariable12 = solverVariable9;
                                if (z11) {
                                }
                                if (constraintAnchor7.h()) {
                                }
                                this.l = false;
                                this.m = false;
                            }
                            constraintAnchor4 = constraintAnchor;
                        }
                        constraintAnchor4 = constraintAnchor;
                        i4 = i19;
                    }
                    z11 = true;
                    i6 = i23;
                    int[] iArr222 = this.u;
                    iArr222[0] = i5;
                    iArr222[1] = i6;
                    if (z11) {
                    }
                    z12 = false;
                    if (z11) {
                    }
                    dimensionBehaviour = this.V[0];
                    dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour2) {
                    }
                    dimensionBehaviour3 = dimensionBehaviour2;
                    z13 = false;
                    if (z13) {
                    }
                    constraintAnchor5 = this.R;
                    z14 = !constraintAnchor5.h();
                    z15 = zArr4[0];
                    boolean z272222 = zArr4[1];
                    if (this.p != 2) {
                    }
                    constraintAnchor6 = constraintAnchor4;
                    solverVariable3 = k;
                    dimensionBehaviour4 = dimensionBehaviour9;
                    solverVariable4 = k2;
                    dimensionBehaviour5 = dimensionBehaviour3;
                    constraintAnchor7 = constraintAnchor5;
                    z16 = z9;
                    z17 = z6;
                    z18 = z23;
                    solverVariable5 = k3;
                    constraintAnchor8 = constraintAnchor12;
                    solverVariable6 = solverVariable;
                    solverVariable7 = solverVariable2;
                    i8 = i5;
                    zArr3 = zArr2;
                    if (z) {
                    }
                    solverVariable8 = solverVariable5;
                    solverVariable9 = solverVariable6;
                    solverVariable10 = solverVariable7;
                    i9 = 0;
                    i10 = 8;
                    i11 = 1;
                    i12 = 1;
                    if (this.q == 2) {
                    }
                    if (i12 != 0) {
                    }
                    solverVariable11 = solverVariable8;
                    solverVariable12 = solverVariable9;
                    if (z11) {
                    }
                    if (constraintAnchor7.h()) {
                    }
                    this.l = false;
                    this.m = false;
                }
            } else {
                solverVariable = k4;
            }
            solverVariable2 = k5;
            constraintAnchor4 = constraintAnchor;
            i4 = i19;
            i5 = i21;
            i6 = i22;
            z11 = false;
            int[] iArr2222 = this.u;
            iArr2222[0] = i5;
            iArr2222[1] = i6;
            if (z11) {
            }
            z12 = false;
            if (z11) {
            }
            dimensionBehaviour = this.V[0];
            dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour == dimensionBehaviour2) {
            }
            dimensionBehaviour3 = dimensionBehaviour2;
            z13 = false;
            if (z13) {
            }
            constraintAnchor5 = this.R;
            z14 = !constraintAnchor5.h();
            z15 = zArr4[0];
            boolean z2722222 = zArr4[1];
            if (this.p != 2) {
            }
            constraintAnchor6 = constraintAnchor4;
            solverVariable3 = k;
            dimensionBehaviour4 = dimensionBehaviour9;
            solverVariable4 = k2;
            dimensionBehaviour5 = dimensionBehaviour3;
            constraintAnchor7 = constraintAnchor5;
            z16 = z9;
            z17 = z6;
            z18 = z23;
            solverVariable5 = k3;
            constraintAnchor8 = constraintAnchor12;
            solverVariable6 = solverVariable;
            solverVariable7 = solverVariable2;
            i8 = i5;
            zArr3 = zArr2;
            if (z) {
            }
            solverVariable8 = solverVariable5;
            solverVariable9 = solverVariable6;
            solverVariable10 = solverVariable7;
            i9 = 0;
            i10 = 8;
            i11 = 1;
            i12 = 1;
            if (this.q == 2) {
            }
            if (i12 != 0) {
            }
            solverVariable11 = solverVariable8;
            solverVariable12 = solverVariable9;
            if (z11) {
            }
            if (constraintAnchor7.h()) {
            }
            this.l = false;
            this.m = false;
        }
        z2 = true;
        z3 = false;
        z5 = z3 ? 1 : 0;
        z4 = z5;
        r17 = z3;
        r19 = z2;
        i = this.j0;
        boolean[] zArr42 = this.U;
        boolean z212 = z5;
        if (i == 8) {
        }
        z6 = z4;
        z7 = this.l;
        if (!z7) {
        }
        if (z7) {
        }
        if (this.m) {
        }
        if (this.l) {
            boolean z222 = r17;
            this.l = z222;
            this.m = z222;
            return;
        }
        zArr = this.f;
        if (z) {
        }
        constraintAnchor = constraintAnchor13;
        zArr2 = zArr;
        if (this.W == null) {
        }
        i2 = this.X;
        i3 = this.e0;
        if (i2 >= i3) {
        }
        int i172 = this.Y;
        ConstraintAnchor constraintAnchor142 = constraintAnchor3;
        int i182 = this.f0;
        if (i172 >= i182) {
        }
        DimensionBehaviour[] dimensionBehaviourArr22 = this.V;
        DimensionBehaviour dimensionBehaviour82 = dimensionBehaviourArr22[0];
        boolean z232 = z8;
        DimensionBehaviour dimensionBehaviour92 = DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour82 == dimensionBehaviour92) {
        }
        DimensionBehaviour dimensionBehaviour102 = dimensionBehaviourArr22[1];
        if (dimensionBehaviour102 == dimensionBehaviour92) {
        }
        int i202 = this.a0;
        this.B = i202;
        f = this.Z;
        this.C = f;
        int i212 = this.s;
        int i222 = this.t;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        solverVariable2 = k5;
        constraintAnchor4 = constraintAnchor;
        i4 = i19;
        i5 = i212;
        i6 = i222;
        z11 = false;
        int[] iArr22222 = this.u;
        iArr22222[0] = i5;
        iArr22222[1] = i6;
        if (z11) {
        }
        z12 = false;
        if (z11) {
        }
        dimensionBehaviour = this.V[0];
        dimensionBehaviour2 = DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour == dimensionBehaviour2) {
        }
        dimensionBehaviour3 = dimensionBehaviour2;
        z13 = false;
        if (z13) {
        }
        constraintAnchor5 = this.R;
        z14 = !constraintAnchor5.h();
        z15 = zArr42[0];
        boolean z27222222 = zArr42[1];
        if (this.p != 2) {
        }
        constraintAnchor6 = constraintAnchor4;
        solverVariable3 = k;
        dimensionBehaviour4 = dimensionBehaviour92;
        solverVariable4 = k2;
        dimensionBehaviour5 = dimensionBehaviour3;
        constraintAnchor7 = constraintAnchor5;
        z16 = z9;
        z17 = z6;
        z18 = z232;
        solverVariable5 = k3;
        constraintAnchor8 = constraintAnchor12;
        solverVariable6 = solverVariable;
        solverVariable7 = solverVariable2;
        i8 = i5;
        zArr3 = zArr2;
        if (z) {
        }
        solverVariable8 = solverVariable5;
        solverVariable9 = solverVariable6;
        solverVariable10 = solverVariable7;
        i9 = 0;
        i10 = 8;
        i11 = 1;
        i12 = 1;
        if (this.q == 2) {
        }
        if (i12 != 0) {
        }
        solverVariable11 = solverVariable8;
        solverVariable12 = solverVariable9;
        if (z11) {
        }
        if (constraintAnchor7.h()) {
        }
        this.l = false;
        this.m = false;
    }

    public boolean g() {
        return this.j0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(androidx.constraintlayout.core.c cVar, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, DimensionBehaviour dimensionBehaviour, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        boolean z13;
        SolverVariable k;
        SolverVariable k2;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable3;
        boolean z14;
        int i12;
        SolverVariable solverVariable4;
        SolverVariable solverVariable5;
        SolverVariable solverVariable6;
        SolverVariable solverVariable7;
        int i13;
        int i14;
        int i15;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        ConstraintWidget constraintWidget;
        int i16;
        int i17;
        ConstraintAnchor constraintAnchor4;
        boolean z19;
        int i18;
        boolean z20;
        int i19;
        int i20;
        HashSet<ConstraintAnchor> hashSet;
        boolean z21;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z22;
        boolean z23;
        int i27;
        androidx.constraintlayout.core.c cVar2 = cVar;
        int i28 = i7;
        int i29 = i8;
        SolverVariable k3 = cVar2.k(constraintAnchor);
        SolverVariable k4 = cVar2.k(constraintAnchor2);
        SolverVariable k5 = cVar2.k(constraintAnchor.f);
        SolverVariable k6 = cVar2.k(constraintAnchor2.f);
        boolean h = constraintAnchor.h();
        boolean h2 = constraintAnchor2.h();
        boolean h3 = this.R.h();
        int i30 = h2 ? (h ? 1 : 0) + 1 : h ? 1 : 0;
        if (h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i5;
        int ordinal = dimensionBehaviour.ordinal();
        boolean z24 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i32 == 4) ? false : true;
        int i33 = this.h;
        if (i33 != -1 && z) {
            this.h = -1;
            i2 = i33;
            z24 = false;
        }
        int i34 = this.i;
        if (i34 == -1 || z) {
            i34 = i2;
        } else {
            this.i = -1;
            z24 = false;
        }
        int i35 = i34;
        if (this.j0 == 8) {
            z24 = false;
            i9 = 0;
        } else {
            i9 = i35;
        }
        if (z11) {
            if (!h && !h2 && !h3) {
                cVar2.d(k3, i);
            } else if (h && !h2) {
                z12 = z24;
                i10 = 8;
                cVar2.e(k3, k5, constraintAnchor.e(), 8);
            }
            z12 = z24;
            i10 = 8;
        } else {
            z12 = z24;
            i10 = 8;
        }
        if (z12) {
            if (i31 == 2 || z6 || !(i32 == 1 || i32 == 0)) {
                if (i28 == -2) {
                    i28 = i9;
                }
                if (i29 == -2) {
                    i29 = i9;
                }
                if (i9 > 0 && i32 != 1) {
                    i9 = 0;
                }
                if (i28 > 0) {
                    cVar2.f(k4, k3, i28, 8);
                    i9 = Math.max(i9, i28);
                }
                if (i29 > 0) {
                    if (!z2 || i32 != 1) {
                        cVar2.g(k4, k3, i29, 8);
                    }
                    i9 = Math.min(i9, i29);
                }
                if (i32 == 1) {
                    if (z2) {
                        cVar2.e(k4, k3, i9, 8);
                    } else if (z8) {
                        cVar2.e(k4, k3, i9, 5);
                        cVar2.g(k4, k3, i9, 8);
                    } else {
                        cVar2.e(k4, k3, i9, 5);
                        cVar2.g(k4, k3, i9, 8);
                    }
                } else if (i32 == 2) {
                    ConstraintAnchor.Type type = constraintAnchor.e;
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.TOP;
                    if (type == type2 || type == ConstraintAnchor.Type.BOTTOM) {
                        k = cVar2.k(this.W.n(type2));
                        k2 = cVar2.k(this.W.n(ConstraintAnchor.Type.BOTTOM));
                    } else {
                        k = cVar2.k(this.W.n(ConstraintAnchor.Type.LEFT));
                        k2 = cVar2.k(this.W.n(ConstraintAnchor.Type.RIGHT));
                    }
                    androidx.constraintlayout.core.b l = cVar2.l();
                    int i36 = i28;
                    l.d.b(k4, -1.0f);
                    l.d.b(k3, 1.0f);
                    l.d.b(k2, f2);
                    l.d.b(k, -f2);
                    cVar2.c(l);
                    if (z2) {
                        z12 = false;
                    }
                    z13 = z4;
                    i11 = i36;
                } else {
                    i11 = i28;
                    z13 = true;
                }
            } else {
                int max = Math.max(i28, i9);
                if (i29 > 0) {
                    max = Math.min(i29, max);
                }
                cVar2.e(k4, k3, max, 8);
                z13 = z4;
                i11 = i28;
                z12 = false;
            }
            if (z11 || z8) {
                boolean z25 = z13;
                if (i31 >= 2 && z2 && z25) {
                    cVar2.f(k3, solverVariable, 0, 8);
                    ConstraintAnchor constraintAnchor5 = this.O;
                    boolean z26 = z || constraintAnchor5.f == null;
                    if (!z && (constraintAnchor3 = constraintAnchor5.f) != null) {
                        ConstraintWidget constraintWidget2 = constraintAnchor3.d;
                        if (constraintWidget2.Z != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            DimensionBehaviour[] dimensionBehaviourArr = constraintWidget2.V;
                            DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[0];
                            DimensionBehaviour dimensionBehaviour3 = DimensionBehaviour.MATCH_CONSTRAINT;
                            if (dimensionBehaviour2 == dimensionBehaviour3 && dimensionBehaviourArr[1] == dimensionBehaviour3) {
                                z26 = true;
                            }
                        }
                        z26 = false;
                    }
                    if (z26) {
                        cVar2.f(solverVariable2, k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!h && !h2 && !h3) {
                constraintAnchor4 = constraintAnchor2;
                solverVariable6 = k4;
                z14 = z13;
                solverVariable3 = k6;
            } else if (!h || h2) {
                if (h || !h2) {
                    solverVariable3 = k6;
                    if (h && h2) {
                        ConstraintWidget constraintWidget3 = constraintAnchor.f.d;
                        ConstraintWidget constraintWidget4 = constraintAnchor2.f.d;
                        z14 = z13;
                        ConstraintWidget constraintWidget5 = this.W;
                        int i37 = 6;
                        if (z12) {
                            if (i32 == 0) {
                                if (i29 != 0 || i11 != 0) {
                                    i25 = 5;
                                    i26 = 5;
                                    z22 = true;
                                    z23 = false;
                                    z16 = true;
                                } else if (k5.g && solverVariable3.g) {
                                    cVar2.e(k3, k5, constraintAnchor.e(), 8);
                                    cVar2.e(k4, solverVariable3, -constraintAnchor2.e(), 8);
                                    return;
                                } else {
                                    i25 = 8;
                                    i26 = 8;
                                    z22 = false;
                                    z23 = true;
                                    z16 = false;
                                }
                                if ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a)) {
                                    i14 = i25;
                                    solverVariable7 = k5;
                                    cVar2 = cVar;
                                    i12 = i32;
                                    solverVariable5 = k3;
                                    solverVariable6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    solverVariable4 = solverVariable2;
                                    z15 = z22;
                                    i15 = 4;
                                    if (z16 || solverVariable7 != solverVariable3 || constraintWidget3 == constraintWidget5) {
                                        z18 = true;
                                    } else {
                                        z16 = false;
                                        z18 = false;
                                    }
                                    if (z15) {
                                        constraintWidget = constraintWidget4;
                                        i16 = i11;
                                        i17 = i12;
                                        constraintAnchor4 = constraintAnchor2;
                                        z19 = z2;
                                    } else {
                                        if (z12 || z7 || z9 || solverVariable7 != solverVariable || solverVariable3 != solverVariable4) {
                                            z19 = z2;
                                            z21 = z18;
                                            i21 = i14;
                                            i22 = i13;
                                        } else {
                                            i22 = 8;
                                            z19 = false;
                                            i21 = 8;
                                            z21 = false;
                                        }
                                        SolverVariable solverVariable8 = solverVariable7;
                                        i16 = i11;
                                        i17 = i12;
                                        constraintWidget = constraintWidget4;
                                        constraintAnchor4 = constraintAnchor2;
                                        cVar2.b(solverVariable5, solverVariable8, constraintAnchor.e(), f, solverVariable3, solverVariable6, constraintAnchor2.e(), i22);
                                        solverVariable7 = solverVariable8;
                                        i14 = i21;
                                        z18 = z21;
                                    }
                                    if (this.j0 != 8 && ((hashSet = constraintAnchor4.a) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z16) {
                                        if (z19 && solverVariable7 != solverVariable3 && !z12 && ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.a))) {
                                            i14 = 6;
                                        }
                                        cVar2.f(solverVariable5, solverVariable7, constraintAnchor.e(), i14);
                                        cVar2.g(solverVariable6, solverVariable3, -constraintAnchor4.e(), i14);
                                    }
                                    if (z19 || !z10 || (constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) || constraintWidget == constraintWidget5) {
                                        i18 = i15;
                                        z20 = z18;
                                    } else {
                                        i18 = 6;
                                        i14 = 6;
                                        z20 = true;
                                    }
                                    if (z20) {
                                        if (z17 && (!z9 || z3)) {
                                            if (constraintWidget3 != constraintWidget5 && constraintWidget != constraintWidget5) {
                                                i37 = i18;
                                            }
                                            if ((constraintWidget3 instanceof f) || (constraintWidget instanceof f)) {
                                                i37 = 5;
                                            }
                                            if ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget instanceof androidx.constraintlayout.core.widgets.a)) {
                                                i37 = 5;
                                            }
                                            i18 = Math.max(z9 ? 5 : i37, i18);
                                        }
                                        if (z19) {
                                            i18 = Math.min(i14, i18);
                                            if (z6 && !z9 && (constraintWidget3 == constraintWidget5 || constraintWidget == constraintWidget5)) {
                                                i20 = 4;
                                                cVar2.e(solverVariable5, solverVariable7, constraintAnchor.e(), i20);
                                                cVar2.e(solverVariable6, solverVariable3, -constraintAnchor4.e(), i20);
                                            }
                                        }
                                        i20 = i18;
                                        cVar2.e(solverVariable5, solverVariable7, constraintAnchor.e(), i20);
                                        cVar2.e(solverVariable6, solverVariable3, -constraintAnchor4.e(), i20);
                                    }
                                    if (z19) {
                                        int e = solverVariable == solverVariable7 ? constraintAnchor.e() : 0;
                                        if (solverVariable7 != solverVariable) {
                                            cVar2.f(solverVariable5, solverVariable, e, 5);
                                        }
                                    }
                                    if (z19 && z12 && i3 == 0 && i16 == 0) {
                                        if (z12 || i17 != 3) {
                                            i19 = 5;
                                            cVar2.f(solverVariable6, solverVariable5, 0, 5);
                                        } else {
                                            cVar2.f(solverVariable6, solverVariable5, 0, 8);
                                        }
                                    }
                                    i19 = 5;
                                } else {
                                    i14 = i25;
                                    solverVariable7 = k5;
                                    cVar2 = cVar;
                                    solverVariable5 = k3;
                                    solverVariable6 = k4;
                                    i13 = 6;
                                    z17 = z23;
                                    z15 = z22;
                                    i15 = i26;
                                    i12 = i32;
                                    solverVariable4 = solverVariable2;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.j0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                        if (z12) {
                                        }
                                        i19 = 5;
                                        cVar2.f(solverVariable6, solverVariable5, 0, 5);
                                    }
                                    i19 = 5;
                                }
                            } else {
                                if (i32 == 2) {
                                    if ((constraintWidget3 instanceof androidx.constraintlayout.core.widgets.a) || (constraintWidget4 instanceof androidx.constraintlayout.core.widgets.a)) {
                                        cVar2 = cVar;
                                        i12 = i32;
                                        solverVariable5 = k3;
                                        solverVariable6 = k4;
                                        solverVariable7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                    } else {
                                        cVar2 = cVar;
                                        i12 = i32;
                                        solverVariable5 = k3;
                                        solverVariable6 = k4;
                                        solverVariable7 = k5;
                                        i13 = 6;
                                        i14 = 5;
                                        i15 = 5;
                                        z15 = true;
                                        z16 = true;
                                        z17 = false;
                                        solverVariable4 = solverVariable2;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.j0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                } else if (i32 == 1) {
                                    cVar2 = cVar;
                                    i12 = i32;
                                    solverVariable5 = k3;
                                    solverVariable6 = k4;
                                    solverVariable7 = k5;
                                    i13 = 6;
                                    i14 = 8;
                                } else if (i32 == 3) {
                                    i12 = i32;
                                    if (this.B == -1) {
                                        if (z9) {
                                            cVar2 = cVar;
                                            solverVariable4 = solverVariable2;
                                            solverVariable5 = k3;
                                            solverVariable6 = k4;
                                            solverVariable7 = k5;
                                            i13 = z2 ? 5 : 4;
                                        } else {
                                            cVar2 = cVar;
                                            solverVariable4 = solverVariable2;
                                            solverVariable5 = k3;
                                            solverVariable6 = k4;
                                            solverVariable7 = k5;
                                            i13 = 8;
                                        }
                                        i14 = 8;
                                    } else {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i23 = 5;
                                                i24 = 4;
                                            } else {
                                                i23 = 8;
                                                i24 = 5;
                                            }
                                            i15 = i24;
                                            solverVariable5 = k3;
                                            solverVariable6 = k4;
                                            solverVariable7 = k5;
                                            i13 = 6;
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            solverVariable4 = solverVariable2;
                                        } else if (i29 > 0) {
                                            cVar2 = cVar;
                                            solverVariable4 = solverVariable2;
                                            solverVariable5 = k3;
                                            solverVariable6 = k4;
                                            solverVariable7 = k5;
                                            i13 = 6;
                                            i14 = 5;
                                        } else {
                                            if (i29 != 0 || i11 != 0) {
                                                cVar2 = cVar;
                                                solverVariable4 = solverVariable2;
                                                solverVariable5 = k3;
                                                solverVariable6 = k4;
                                                solverVariable7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 4;
                                            } else if (z9) {
                                                i23 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                solverVariable4 = solverVariable2;
                                                solverVariable5 = k3;
                                                solverVariable6 = k4;
                                                solverVariable7 = k5;
                                                i13 = 6;
                                                i15 = 4;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                            } else {
                                                cVar2 = cVar;
                                                solverVariable4 = solverVariable2;
                                                solverVariable5 = k3;
                                                solverVariable6 = k4;
                                                solverVariable7 = k5;
                                                i13 = 6;
                                                i14 = 5;
                                                i15 = 8;
                                            }
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                            if (z16) {
                                            }
                                            z18 = true;
                                            if (z15) {
                                            }
                                            if (this.j0 != 8) {
                                            }
                                            if (z16) {
                                            }
                                            if (z19) {
                                            }
                                            i18 = i15;
                                            z20 = z18;
                                            if (z20) {
                                            }
                                            if (z19) {
                                            }
                                            if (z19) {
                                            }
                                            i19 = 5;
                                        }
                                        i14 = i23;
                                        cVar2 = cVar;
                                        if (z16) {
                                        }
                                        z18 = true;
                                        if (z15) {
                                        }
                                        if (this.j0 != 8) {
                                        }
                                        if (z16) {
                                        }
                                        if (z19) {
                                        }
                                        i18 = i15;
                                        z20 = z18;
                                        if (z20) {
                                        }
                                        if (z19) {
                                        }
                                        if (z19) {
                                        }
                                        i19 = 5;
                                    }
                                    i15 = 5;
                                    z15 = true;
                                    z16 = true;
                                    z17 = true;
                                    if (z16) {
                                    }
                                    z18 = true;
                                    if (z15) {
                                    }
                                    if (this.j0 != 8) {
                                    }
                                    if (z16) {
                                    }
                                    if (z19) {
                                    }
                                    i18 = i15;
                                    z20 = z18;
                                    if (z20) {
                                    }
                                    if (z19) {
                                    }
                                    if (z19) {
                                    }
                                    i19 = 5;
                                } else {
                                    i12 = i32;
                                    cVar2 = cVar;
                                    solverVariable4 = solverVariable2;
                                    solverVariable5 = k3;
                                    solverVariable6 = k4;
                                    solverVariable7 = k5;
                                    i13 = 6;
                                    i14 = 5;
                                    i15 = 4;
                                    z15 = false;
                                    z16 = false;
                                }
                                i15 = 4;
                                z15 = true;
                                z16 = true;
                                z17 = false;
                                solverVariable4 = solverVariable2;
                                if (z16) {
                                }
                                z18 = true;
                                if (z15) {
                                }
                                if (this.j0 != 8) {
                                }
                                if (z16) {
                                }
                                if (z19) {
                                }
                                i18 = i15;
                                z20 = z18;
                                if (z20) {
                                }
                                if (z19) {
                                }
                                if (z19) {
                                }
                                i19 = 5;
                            }
                            i27 = i19;
                            if (z19 && z14) {
                                int e2 = constraintAnchor4.f != null ? constraintAnchor4.e() : 0;
                                if (solverVariable3 != solverVariable2) {
                                    cVar2.f(solverVariable2, solverVariable6, e2, i27);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i12 = i32;
                        if (k5.g && solverVariable3.g) {
                            cVar.b(k3, k5, constraintAnchor.e(), f, solverVariable3, k4, constraintAnchor2.e(), 8);
                            if (z2 && z14) {
                                int e3 = constraintAnchor2.f != null ? constraintAnchor2.e() : 0;
                                if (solverVariable3 != solverVariable2) {
                                    cVar.f(solverVariable2, k4, e3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cVar2 = cVar;
                        solverVariable4 = solverVariable2;
                        solverVariable5 = k3;
                        solverVariable6 = k4;
                        solverVariable7 = k5;
                        i13 = 6;
                        i14 = 5;
                        i15 = 4;
                        z15 = true;
                        z16 = true;
                        z17 = false;
                        if (z16) {
                        }
                        z18 = true;
                        if (z15) {
                        }
                        if (this.j0 != 8) {
                        }
                        if (z16) {
                        }
                        if (z19) {
                        }
                        i18 = i15;
                        z20 = z18;
                        if (z20) {
                        }
                        if (z19) {
                        }
                        if (z19) {
                        }
                        i19 = 5;
                        i27 = i19;
                        if (z19) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    solverVariable3 = k6;
                    cVar2.e(k4, solverVariable3, -constraintAnchor2.e(), 8);
                    if (z2) {
                        cVar2.f(k3, solverVariable, 0, 5);
                        constraintAnchor4 = constraintAnchor2;
                        i19 = 5;
                        solverVariable6 = k4;
                        z14 = z13;
                        z19 = z2;
                        i27 = i19;
                        if (z19) {
                        }
                    }
                }
                constraintAnchor4 = constraintAnchor2;
                solverVariable6 = k4;
                z14 = z13;
            } else {
                constraintAnchor4 = constraintAnchor2;
                solverVariable6 = k4;
                z14 = z13;
                solverVariable3 = k6;
                z19 = z2;
                i27 = (z2 && (constraintAnchor.f.d instanceof androidx.constraintlayout.core.widgets.a)) ? 8 : 5;
                if (z19) {
                }
            }
            i19 = 5;
            z19 = z2;
            i27 = i19;
            if (z19) {
            }
        } else if (z5) {
            cVar2.e(k4, k3, 0, 3);
            if (i3 > 0) {
                cVar2.f(k4, k3, i3, i10);
            }
            if (i4 < Integer.MAX_VALUE) {
                cVar2.g(k4, k3, i4, i10);
            }
        } else {
            cVar2.e(k4, k3, i9, i10);
        }
        z13 = z4;
        i11 = i28;
        if (z11) {
        }
        boolean z252 = z13;
        if (i31 >= 2) {
        }
    }

    public final void i(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type == type5) {
            if (type2 != type5) {
                ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                if (type2 == type6 || type2 == ConstraintAnchor.Type.RIGHT) {
                    i(type6, constraintWidget, type2, 0);
                    i(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                    n(type5).a(constraintWidget.n(type2), 0);
                    return;
                }
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.TOP;
                if (type2 == type7 || type2 == ConstraintAnchor.Type.BOTTOM) {
                    i(type7, constraintWidget, type2, 0);
                    i(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                    n(type5).a(constraintWidget.n(type2), 0);
                    return;
                }
                return;
            }
            ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor n = n(type8);
            ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor n2 = n(type9);
            ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor n3 = n(type10);
            ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor n4 = n(type11);
            boolean z2 = true;
            if ((n == null || !n.h()) && (n2 == null || !n2.h())) {
                i(type8, constraintWidget, type8, 0);
                i(type9, constraintWidget, type9, 0);
                z = true;
            } else {
                z = false;
            }
            if ((n3 == null || !n3.h()) && (n4 == null || !n4.h())) {
                i(type10, constraintWidget, type10, 0);
                i(type11, constraintWidget, type11, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                n(type5).a(constraintWidget.n(type5), 0);
                return;
            }
            if (z) {
                ConstraintAnchor.Type type12 = ConstraintAnchor.Type.CENTER_X;
                n(type12).a(constraintWidget.n(type12), 0);
                return;
            } else {
                if (z2) {
                    ConstraintAnchor.Type type13 = ConstraintAnchor.Type.CENTER_Y;
                    n(type13).a(constraintWidget.n(type13), 0);
                    return;
                }
                return;
            }
        }
        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.CENTER_X;
        if (type == type14 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
            ConstraintAnchor n5 = n(type4);
            ConstraintAnchor n6 = constraintWidget.n(type2);
            ConstraintAnchor n7 = n(ConstraintAnchor.Type.RIGHT);
            n5.a(n6, 0);
            n7.a(n6, 0);
            n(type14).a(n6, 0);
            return;
        }
        ConstraintAnchor.Type type15 = ConstraintAnchor.Type.CENTER_Y;
        if (type == type15 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
            ConstraintAnchor n8 = constraintWidget.n(type2);
            n(type3).a(n8, 0);
            n(ConstraintAnchor.Type.BOTTOM).a(n8, 0);
            n(type15).a(n8, 0);
            return;
        }
        if (type == type14 && type2 == type14) {
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.LEFT;
            n(type16).a(constraintWidget.n(type16), 0);
            ConstraintAnchor.Type type17 = ConstraintAnchor.Type.RIGHT;
            n(type17).a(constraintWidget.n(type17), 0);
            n(type14).a(constraintWidget.n(type2), 0);
            return;
        }
        if (type == type15 && type2 == type15) {
            ConstraintAnchor.Type type18 = ConstraintAnchor.Type.TOP;
            n(type18).a(constraintWidget.n(type18), 0);
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.BOTTOM;
            n(type19).a(constraintWidget.n(type19), 0);
            n(type15).a(constraintWidget.n(type2), 0);
            return;
        }
        ConstraintAnchor n9 = n(type);
        ConstraintAnchor n10 = constraintWidget.n(type2);
        if (n9.i(n10)) {
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.BASELINE;
            if (type == type20) {
                ConstraintAnchor n11 = n(ConstraintAnchor.Type.TOP);
                ConstraintAnchor n12 = n(ConstraintAnchor.Type.BOTTOM);
                if (n11 != null) {
                    n11.j();
                }
                if (n12 != null) {
                    n12.j();
                }
            } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                ConstraintAnchor n13 = n(type20);
                if (n13 != null) {
                    n13.j();
                }
                ConstraintAnchor n14 = n(type5);
                if (n14.f != n10) {
                    n14.j();
                }
                ConstraintAnchor f = n(type).f();
                ConstraintAnchor n15 = n(type15);
                if (n15.h()) {
                    f.j();
                    n15.j();
                }
            } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                ConstraintAnchor n16 = n(type5);
                if (n16.f != n10) {
                    n16.j();
                }
                ConstraintAnchor f2 = n(type).f();
                ConstraintAnchor n17 = n(type14);
                if (n17.h()) {
                    f2.j();
                    n17.j();
                }
            }
            n9.a(n10, i);
        }
    }

    public final void j(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        if (constraintAnchor.d == this) {
            i(constraintAnchor.e, constraintAnchor2.d, constraintAnchor2.e, i);
        }
    }

    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.p = constraintWidget.p;
        this.q = constraintWidget.q;
        this.s = constraintWidget.s;
        this.t = constraintWidget.t;
        int[] iArr = constraintWidget.u;
        int i = iArr[0];
        int[] iArr2 = this.u;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.v = constraintWidget.v;
        this.w = constraintWidget.w;
        this.y = constraintWidget.y;
        this.z = constraintWidget.z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        this.C = constraintWidget.C;
        int[] iArr3 = constraintWidget.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.Q.j();
        this.R.j();
        this.V = (DimensionBehaviour[]) Arrays.copyOf(this.V, 2);
        this.W = this.W == null ? null : hashMap.get(constraintWidget.W);
        this.X = constraintWidget.X;
        this.Y = constraintWidget.Y;
        this.Z = constraintWidget.Z;
        this.a0 = constraintWidget.a0;
        this.b0 = constraintWidget.b0;
        this.c0 = constraintWidget.c0;
        this.d0 = constraintWidget.d0;
        this.e0 = constraintWidget.e0;
        this.f0 = constraintWidget.f0;
        this.g0 = constraintWidget.g0;
        this.h0 = constraintWidget.h0;
        this.i0 = constraintWidget.i0;
        this.j0 = constraintWidget.j0;
        this.k0 = constraintWidget.k0;
        this.l0 = constraintWidget.l0;
        this.m0 = constraintWidget.m0;
        this.n0 = constraintWidget.n0;
        float[] fArr = constraintWidget.o0;
        float f = fArr[0];
        float[] fArr2 = this.o0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        ConstraintWidget[] constraintWidgetArr = constraintWidget.p0;
        ConstraintWidget constraintWidget2 = constraintWidgetArr[0];
        ConstraintWidget[] constraintWidgetArr2 = this.p0;
        constraintWidgetArr2[0] = constraintWidget2;
        constraintWidgetArr2[1] = constraintWidgetArr[1];
        ConstraintWidget[] constraintWidgetArr3 = constraintWidget.q0;
        ConstraintWidget constraintWidget3 = constraintWidgetArr3[0];
        ConstraintWidget[] constraintWidgetArr4 = this.q0;
        constraintWidgetArr4[0] = constraintWidget3;
        constraintWidgetArr4[1] = constraintWidgetArr3[1];
        ConstraintWidget constraintWidget4 = constraintWidget.r0;
        this.r0 = constraintWidget4 == null ? null : hashMap.get(constraintWidget4);
        ConstraintWidget constraintWidget5 = constraintWidget.s0;
        this.s0 = constraintWidget5 != null ? hashMap.get(constraintWidget5) : null;
    }

    public final void l(androidx.constraintlayout.core.c cVar) {
        cVar.k(this.K);
        cVar.k(this.L);
        cVar.k(this.M);
        cVar.k(this.N);
        if (this.d0 > 0) {
            cVar.k(this.O);
        }
    }

    public final void m() {
        if (this.d == null) {
            yfv yfvVar = new yfv(this);
            yfvVar.h.e = mzl.a.LEFT;
            yfvVar.i.e = mzl.a.RIGHT;
            yfvVar.f = 0;
            this.d = yfvVar;
        }
        if (this.e == null) {
            fpr0 fpr0Var = new fpr0(this);
            mzl mzlVar = new mzl(fpr0Var);
            fpr0Var.k = mzlVar;
            fpr0Var.l = null;
            fpr0Var.h.e = mzl.a.TOP;
            fpr0Var.i.e = mzl.a.BOTTOM;
            mzlVar.e = mzl.a.BASELINE;
            fpr0Var.f = 1;
            this.e = fpr0Var;
        }
    }

    public ConstraintAnchor n(ConstraintAnchor.Type type) {
        switch (a.a[type.ordinal()]) {
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            case 9:
                return null;
            default:
                throw new AssertionError(type.name());
        }
    }

    public final DimensionBehaviour o(int i) {
        if (i == 0) {
            return this.V[0];
        }
        if (i == 1) {
            return this.V[1];
        }
        return null;
    }

    public final int p() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public final ConstraintWidget q(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.N).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public final ConstraintWidget r(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.L).f) != null && constraintAnchor2.f == constraintAnchor) {
                return constraintAnchor2.d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.K;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        if (constraintAnchor4 == null || constraintAnchor4.f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.d;
    }

    public void s(StringBuilder sb) {
        sb.append("  " + this.k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.X);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.Y);
        sb.append("\n");
        sb.append("    actualLeft:" + this.b0);
        sb.append("\n");
        sb.append("    actualTop:" + this.c0);
        sb.append("\n");
        u(sb, TtmlNode.LEFT, this.K);
        u(sb, "top", this.L);
        u(sb, TtmlNode.RIGHT, this.M);
        u(sb, "bottom", this.N);
        u(sb, "baseline", this.O);
        u(sb, "centerX", this.P);
        u(sb, "centerY", this.Q);
        int i = this.X;
        int i2 = this.e0;
        int i3 = this.D[0];
        int i4 = this.v;
        int i5 = this.s;
        float f = this.x;
        DimensionBehaviour dimensionBehaviour = this.V[0];
        float[] fArr = this.o0;
        float f2 = fArr[0];
        t(sb, "    width", i, i2, i3, i4, i5, f, dimensionBehaviour);
        int i6 = this.Y;
        int i7 = this.f0;
        int i8 = this.D[1];
        int i9 = this.y;
        int i10 = this.t;
        float f3 = this.A;
        DimensionBehaviour dimensionBehaviour2 = this.V[1];
        float f4 = fArr[1];
        t(sb, "    height", i6, i7, i8, i9, i10, f3, dimensionBehaviour2);
        float f5 = this.Z;
        int i11 = this.a0;
        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(StringUtils.COMMA);
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        M(sb, "    horizontalBias", this.g0, 0.5f);
        M(sb, "    verticalBias", this.h0, 0.5f);
        L("    horizontalChainStyle", this.m0, 0, sb);
        L("    verticalChainStyle", this.n0, 0, sb);
        sb.append("  }");
    }

    public String toString() {
        StringBuilder e = fw3.e("");
        e.append(this.l0 != null ? i5s.a(new StringBuilder("id: "), this.l0, " ") : "");
        e.append("(");
        e.append(this.b0);
        e.append(", ");
        e.append(this.c0);
        e.append(") - (");
        e.append(this.X);
        e.append(" x ");
        return h5s.c(this.Y, ")", e);
    }

    public final int v() {
        if (this.j0 == 8) {
            return 0;
        }
        return this.X;
    }

    public final int w() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.b0 : ((d) constraintWidget).C0 + this.b0;
    }

    public final int x() {
        ConstraintWidget constraintWidget = this.W;
        return (constraintWidget == null || !(constraintWidget instanceof d)) ? this.c0 : ((d) constraintWidget).D0 + this.c0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(int i) {
        if (i == 0) {
            return (this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2;
        }
        if ((this.L.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) + (this.O.f != null ? 1 : 0) < 2) {
        }
    }

    public final boolean z(int i, int i2) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (i == 0) {
            ConstraintAnchor constraintAnchor5 = this.K;
            ConstraintAnchor constraintAnchor6 = constraintAnchor5.f;
            if (constraintAnchor6 == null || !constraintAnchor6.c || (constraintAnchor4 = (constraintAnchor3 = this.M).f) == null || !constraintAnchor4.c) {
                return false;
            }
            return (constraintAnchor4.d() - constraintAnchor3.e()) - (constraintAnchor5.e() + constraintAnchor5.f.d()) >= i2;
        }
        ConstraintAnchor constraintAnchor7 = this.L;
        ConstraintAnchor constraintAnchor8 = constraintAnchor7.f;
        if (constraintAnchor8 == null || !constraintAnchor8.c || (constraintAnchor2 = (constraintAnchor = this.N).f) == null || !constraintAnchor2.c) {
            return false;
        }
        return (constraintAnchor2.d() - constraintAnchor.e()) - (constraintAnchor7.e() + constraintAnchor7.f.d()) >= i2;
    }

    public ConstraintWidget(int i, int i2) {
        this.a = false;
        this.d = null;
        this.e = null;
        this.f = new boolean[]{true, true};
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = new bnx0(this);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = -1;
        this.q = -1;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = new int[2];
        this.v = 0;
        this.w = 0;
        this.x = 1.0f;
        this.y = 0;
        this.z = 0;
        this.A = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = Float.NaN;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.O = constraintAnchor5;
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.R = constraintAnchor6;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.T = new ArrayList<>();
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.Z = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a0 = -1;
        this.d0 = 0;
        this.g0 = 0.5f;
        this.h0 = 0.5f;
        this.j0 = 0;
        this.k0 = false;
        this.l0 = null;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = new float[]{-1.0f, -1.0f};
        this.p0 = new ConstraintWidget[]{null, null};
        this.q0 = new ConstraintWidget[]{null, null};
        this.r0 = null;
        this.s0 = null;
        this.t0 = -1;
        this.u0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.X = i;
        this.Y = i2;
        d();
    }
}
