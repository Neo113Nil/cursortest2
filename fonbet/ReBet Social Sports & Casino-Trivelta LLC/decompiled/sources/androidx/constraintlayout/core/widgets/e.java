package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.n;
import androidx.constraintlayout.core.widgets.analyzer.p;
import androidx.constraintlayout.core.widgets.d;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import h0.C4397a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: A0, reason: collision with root package name */
    public static float f17920A0 = 0.5f;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17927G;

    /* renamed from: R, reason: collision with root package name */
    public d f17938R;

    /* renamed from: S, reason: collision with root package name */
    public ArrayList f17939S;

    /* renamed from: T, reason: collision with root package name */
    public e f17940T;

    /* renamed from: U, reason: collision with root package name */
    public int f17941U;

    /* renamed from: V, reason: collision with root package name */
    public int f17942V;

    /* renamed from: W, reason: collision with root package name */
    public float f17943W;

    /* renamed from: X, reason: collision with root package name */
    public int f17944X;

    /* renamed from: Y, reason: collision with root package name */
    public int f17945Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f17946Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f17948a0;

    /* renamed from: b, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f17949b;

    /* renamed from: b0, reason: collision with root package name */
    public int f17950b0;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.c f17951c;

    /* renamed from: c0, reason: collision with root package name */
    public int f17952c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f17954d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f17956e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f17958f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f17960g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f17962h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f17964i0;

    /* renamed from: j0, reason: collision with root package name */
    public Object f17966j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f17968k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f17970l0;

    /* renamed from: m, reason: collision with root package name */
    public String f17971m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f17972m0;
    private boolean[] mIsInBarrier;
    public d[] mListAnchors;
    public b[] mListDimensionBehaviors;
    protected e[] mListNextMatchConstraintsWidget;
    protected e[] mNextChainWidget;
    public float[] mWeight;

    /* renamed from: n0, reason: collision with root package name */
    public String f17974n0;

    /* renamed from: o0, reason: collision with root package name */
    public String f17976o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f17978p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f17980q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f17982r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f17984s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f17986t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f17988u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f17990v0;

    /* renamed from: w0, reason: collision with root package name */
    public e f17992w0;

    /* renamed from: x0, reason: collision with root package name */
    public e f17994x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f17996y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f17998z0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f17947a = false;
    public p[] run = new p[2];

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.analyzer.l f17953d = null;

    /* renamed from: e, reason: collision with root package name */
    public n f17955e = null;
    public boolean[] isTerminalWidget = {true, true};

    /* renamed from: f, reason: collision with root package name */
    public boolean f17957f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17959g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17961h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17963i = true;

    /* renamed from: j, reason: collision with root package name */
    public int f17965j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f17967k = -1;

    /* renamed from: l, reason: collision with root package name */
    public C4397a f17969l = new C4397a(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f17973n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17975o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17977p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17979q = false;

    /* renamed from: r, reason: collision with root package name */
    public int f17981r = -1;

    /* renamed from: s, reason: collision with root package name */
    public int f17983s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f17985t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f17987u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f17989v = 0;
    public int[] mResolvedMatchConstraintDefault = new int[2];

    /* renamed from: w, reason: collision with root package name */
    public int f17991w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f17993x = 0;

    /* renamed from: y, reason: collision with root package name */
    public float f17995y = 1.0f;

    /* renamed from: z, reason: collision with root package name */
    public int f17997z = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f17921A = 0;

    /* renamed from: B, reason: collision with root package name */
    public float f17922B = 1.0f;

    /* renamed from: C, reason: collision with root package name */
    public int f17923C = -1;

    /* renamed from: D, reason: collision with root package name */
    public float f17924D = 1.0f;
    private int[] mMaxDimension = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: E, reason: collision with root package name */
    public float f17925E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    public boolean f17926F = false;

    /* renamed from: H, reason: collision with root package name */
    public boolean f17928H = false;

    /* renamed from: I, reason: collision with root package name */
    public int f17929I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f17930J = 0;

    /* renamed from: K, reason: collision with root package name */
    public d f17931K = new d(this, d.a.LEFT);

    /* renamed from: L, reason: collision with root package name */
    public d f17932L = new d(this, d.a.TOP);

    /* renamed from: M, reason: collision with root package name */
    public d f17933M = new d(this, d.a.RIGHT);

    /* renamed from: N, reason: collision with root package name */
    public d f17934N = new d(this, d.a.BOTTOM);

    /* renamed from: O, reason: collision with root package name */
    public d f17935O = new d(this, d.a.BASELINE);

    /* renamed from: P, reason: collision with root package name */
    public d f17936P = new d(this, d.a.CENTER_X);

    /* renamed from: Q, reason: collision with root package name */
    public d f17937Q = new d(this, d.a.CENTER_Y);

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
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[d.a.RIGHT.ordinal()] = 3;
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

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.f17938R = dVar;
        this.mListAnchors = new d[]{this.f17931K, this.f17933M, this.f17932L, this.f17934N, this.f17935O, dVar};
        this.f17939S = new ArrayList();
        this.mIsInBarrier = new boolean[2];
        b bVar = b.FIXED;
        this.mListDimensionBehaviors = new b[]{bVar, bVar};
        this.f17940T = null;
        this.f17941U = 0;
        this.f17942V = 0;
        this.f17943W = 0.0f;
        this.f17944X = -1;
        this.f17945Y = 0;
        this.f17946Z = 0;
        this.f17948a0 = 0;
        this.f17950b0 = 0;
        this.f17952c0 = 0;
        this.f17954d0 = 0;
        this.f17956e0 = 0;
        float f10 = f17920A0;
        this.f17962h0 = f10;
        this.f17964i0 = f10;
        this.f17968k0 = 0;
        this.f17970l0 = 0;
        this.f17972m0 = false;
        this.f17974n0 = null;
        this.f17976o0 = null;
        this.f17982r0 = false;
        this.f17984s0 = 0;
        this.f17986t0 = 0;
        this.mWeight = new float[]{-1.0f, -1.0f};
        this.mListNextMatchConstraintsWidget = new e[]{null, null};
        this.mNextChainWidget = new e[]{null, null};
        this.f17992w0 = null;
        this.f17994x0 = null;
        this.f17996y0 = -1;
        this.f17998z0 = -1;
        d();
    }

    public b A() {
        return this.mListDimensionBehaviors[0];
    }

    public final void A0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public int B() {
        d dVar = this.f17931K;
        int i10 = dVar != null ? dVar.f17908g : 0;
        d dVar2 = this.f17933M;
        return dVar2 != null ? i10 + dVar2.f17908g : i10;
    }

    public void B0(int i10) {
        this.f17956e0 = i10;
        this.f17926F = i10 > 0;
    }

    public int C() {
        return this.f17929I;
    }

    public void C0(Object obj) {
        this.f17966j0 = obj;
    }

    public int D() {
        return this.f17930J;
    }

    public void D0(String str) {
        this.f17974n0 = str;
    }

    public int E(int i10) {
        if (i10 == 0) {
            return W();
        }
        if (i10 == 1) {
            return x();
        }
        return 0;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0086 -> B:31:0x0087). Please report as a decompilation issue!!! */
    public void E0(String str) {
        float f10;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f17943W = 0.0f;
            return;
        }
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i11 = -1;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            i11 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
            r3 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(r3);
            if (substring2.length() > 0) {
                f10 = Float.parseFloat(substring2);
            }
            f10 = i10;
        } else {
            String substring3 = str.substring(r3, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f10 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f10 = i10;
        }
        i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
        if (i10 > 0) {
            this.f17943W = f10;
            this.f17944X = i11;
        }
    }

    public int F() {
        return this.mMaxDimension[1];
    }

    public void F0(int i10) {
        if (this.f17926F) {
            int i11 = i10 - this.f17956e0;
            int i12 = this.f17942V + i11;
            this.f17946Z = i11;
            this.f17932L.t(i11);
            this.f17934N.t(i12);
            this.f17935O.t(i10);
            this.f17975o = true;
        }
    }

    public int G() {
        return this.mMaxDimension[0];
    }

    public void G0(int i10, int i11) {
        if (this.f17973n) {
            return;
        }
        this.f17931K.t(i10);
        this.f17933M.t(i11);
        this.f17945Y = i10;
        this.f17941U = i11 - i10;
        this.f17973n = true;
    }

    public int H() {
        return this.f17960g0;
    }

    public void H0(int i10) {
        this.f17931K.t(i10);
        this.f17945Y = i10;
    }

    public int I() {
        return this.f17958f0;
    }

    public void I0(int i10) {
        this.f17932L.t(i10);
        this.f17946Z = i10;
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f17934N).f17907f) != null && dVar2.f17907f == dVar) {
                return dVar2.f17905d;
            }
            return null;
        }
        d dVar3 = this.f17933M;
        d dVar4 = dVar3.f17907f;
        if (dVar4 == null || dVar4.f17907f != dVar3) {
            return null;
        }
        return dVar4.f17905d;
    }

    public void J0(int i10, int i11) {
        if (this.f17975o) {
            return;
        }
        this.f17932L.t(i10);
        this.f17934N.t(i11);
        this.f17946Z = i10;
        this.f17942V = i11 - i10;
        if (this.f17926F) {
            this.f17935O.t(i10 + this.f17956e0);
        }
        this.f17975o = true;
    }

    public e K() {
        return this.f17940T;
    }

    public void K0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f17945Y = i10;
        this.f17946Z = i11;
        if (this.f17970l0 == 8) {
            this.f17941U = 0;
            this.f17942V = 0;
            return;
        }
        b[] bVarArr = this.mListDimensionBehaviors;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f17941U)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f17942V)) {
            i17 = i14;
        }
        this.f17941U = i16;
        this.f17942V = i17;
        int i18 = this.f17960g0;
        if (i17 < i18) {
            this.f17942V = i18;
        }
        int i19 = this.f17958f0;
        if (i16 < i19) {
            this.f17941U = i19;
        }
        int i20 = this.f17993x;
        if (i20 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f17941U = Math.min(this.f17941U, i20);
        }
        int i21 = this.f17921A;
        if (i21 > 0 && this.mListDimensionBehaviors[1] == b.MATCH_CONSTRAINT) {
            this.f17942V = Math.min(this.f17942V, i21);
        }
        int i22 = this.f17941U;
        if (i16 != i22) {
            this.f17965j = i22;
        }
        int i23 = this.f17942V;
        if (i17 != i23) {
            this.f17967k = i23;
        }
    }

    public e L(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.f17932L).f17907f) != null && dVar2.f17907f == dVar) {
                return dVar2.f17905d;
            }
            return null;
        }
        d dVar3 = this.f17931K;
        d dVar4 = dVar3.f17907f;
        if (dVar4 == null || dVar4.f17907f != dVar3) {
            return null;
        }
        return dVar4.f17905d;
    }

    public void L0(boolean z10) {
        this.f17926F = z10;
    }

    public int M() {
        return X() + this.f17941U;
    }

    public void M0(int i10) {
        this.f17942V = i10;
        int i11 = this.f17960g0;
        if (i10 < i11) {
            this.f17942V = i11;
        }
    }

    public p N(int i10) {
        if (i10 == 0) {
            return this.f17953d;
        }
        if (i10 == 1) {
            return this.f17955e;
        }
        return null;
    }

    public void N0(float f10) {
        this.f17962h0 = f10;
    }

    public void O(StringBuilder sb2) {
        sb2.append("  " + this.f17971m + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f17941U);
        sb2.append(sb3.toString());
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("    actualHeight:" + this.f17942V);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("    actualLeft:" + this.f17945Y);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("    actualTop:" + this.f17946Z);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        Q(sb2, ViewProps.LEFT, this.f17931K);
        Q(sb2, ViewProps.TOP, this.f17932L);
        Q(sb2, ViewProps.RIGHT, this.f17933M);
        Q(sb2, ViewProps.BOTTOM, this.f17934N);
        Q(sb2, "baseline", this.f17935O);
        Q(sb2, "centerX", this.f17936P);
        Q(sb2, "centerY", this.f17937Q);
        P(sb2, "    width", this.f17941U, this.f17958f0, this.mMaxDimension[0], this.f17965j, this.f17991w, this.f17987u, this.f17995y, this.mListDimensionBehaviors[0], this.mWeight[0]);
        P(sb2, "    height", this.f17942V, this.f17960g0, this.mMaxDimension[1], this.f17967k, this.f17997z, this.f17989v, this.f17922B, this.mListDimensionBehaviors[1], this.mWeight[1]);
        A0(sb2, "    dimensionRatio", this.f17943W, this.f17944X);
        x0(sb2, "    horizontalBias", this.f17962h0, f17920A0);
        x0(sb2, "    verticalBias", this.f17964i0, f17920A0);
        y0(sb2, "    horizontalChainStyle", this.f17984s0, 0);
        y0(sb2, "    verticalChainStyle", this.f17986t0, 0);
        sb2.append("  }");
    }

    public void O0(int i10) {
        this.f17984s0 = i10;
    }

    public final void P(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, b bVar, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        z0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        y0(sb2, "      size", i10, 0);
        y0(sb2, "      min", i11, 0);
        y0(sb2, "      max", i12, Integer.MAX_VALUE);
        y0(sb2, "      matchMin", i14, 0);
        y0(sb2, "      matchDef", i15, 0);
        x0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public void P0(int i10, int i11) {
        this.f17945Y = i10;
        int i12 = i11 - i10;
        this.f17941U = i12;
        int i13 = this.f17958f0;
        if (i12 < i13) {
            this.f17941U = i13;
        }
    }

    public final void Q(StringBuilder sb2, String str, d dVar) {
        if (dVar.f17907f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f17907f);
        sb2.append("'");
        if (dVar.f17909h != Integer.MIN_VALUE || dVar.f17908g != 0) {
            sb2.append(",");
            sb2.append(dVar.f17908g);
            if (dVar.f17909h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f17909h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public void Q0(b bVar) {
        this.mListDimensionBehaviors[0] = bVar;
    }

    public float R() {
        return this.f17964i0;
    }

    public void R0(int i10, int i11, int i12, float f10) {
        this.f17987u = i10;
        this.f17991w = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f17993x = i12;
        this.f17995y = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f17987u = 2;
    }

    public int S() {
        return this.f17986t0;
    }

    public void S0(float f10) {
        this.mWeight[0] = f10;
    }

    public b T() {
        return this.mListDimensionBehaviors[1];
    }

    public void T0(int i10, boolean z10) {
        this.mIsInBarrier[i10] = z10;
    }

    public int U() {
        int i10 = this.f17931K != null ? this.f17932L.f17908g : 0;
        return this.f17933M != null ? i10 + this.f17934N.f17908g : i10;
    }

    public void U0(boolean z10) {
        this.f17927G = z10;
    }

    public int V() {
        return this.f17970l0;
    }

    public void V0(boolean z10) {
        this.f17928H = z10;
    }

    public int W() {
        if (this.f17970l0 == 8) {
            return 0;
        }
        return this.f17941U;
    }

    public void W0(int i10, int i11) {
        this.f17929I = i10;
        this.f17930J = i11;
        Z0(false);
    }

    public int X() {
        e eVar = this.f17940T;
        return (eVar == null || !(eVar instanceof f)) ? this.f17945Y : ((f) eVar).f18009I0 + this.f17945Y;
    }

    public void X0(int i10) {
        this.mMaxDimension[1] = i10;
    }

    public int Y() {
        e eVar = this.f17940T;
        return (eVar == null || !(eVar instanceof f)) ? this.f17946Z : ((f) eVar).f18010J0 + this.f17946Z;
    }

    public void Y0(int i10) {
        this.mMaxDimension[0] = i10;
    }

    public boolean Z() {
        return this.f17926F;
    }

    public void Z0(boolean z10) {
        this.f17959g = z10;
    }

    public boolean a0(int i10) {
        if (i10 == 0) {
            return (this.f17931K.f17907f != null ? 1 : 0) + (this.f17933M.f17907f != null ? 1 : 0) < 2;
        }
        return ((this.f17932L.f17907f != null ? 1 : 0) + (this.f17934N.f17907f != null ? 1 : 0)) + (this.f17935O.f17907f != null ? 1 : 0) < 2;
    }

    public void a1(int i10) {
        if (i10 < 0) {
            this.f17960g0 = 0;
        } else {
            this.f17960g0 = i10;
        }
    }

    public boolean b0() {
        int size = this.f17939S.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((d) this.f17939S.get(i10)).m()) {
                return true;
            }
        }
        return false;
    }

    public void b1(int i10) {
        if (i10 < 0) {
            this.f17958f0 = 0;
        } else {
            this.f17958f0 = i10;
        }
    }

    public boolean c0() {
        return (this.f17965j == -1 && this.f17967k == -1) ? false : true;
    }

    public void c1(int i10, int i11) {
        this.f17945Y = i10;
        this.f17946Z = i11;
    }

    public final void d() {
        this.f17939S.add(this.f17931K);
        this.f17939S.add(this.f17932L);
        this.f17939S.add(this.f17933M);
        this.f17939S.add(this.f17934N);
        this.f17939S.add(this.f17936P);
        this.f17939S.add(this.f17937Q);
        this.f17939S.add(this.f17938R);
        this.f17939S.add(this.f17935O);
    }

    public boolean d0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.f17931K.f17907f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.f17933M.f17907f) != null && dVar2.n() && (this.f17933M.f17907f.e() - this.f17933M.f()) - (this.f17931K.f17907f.e() + this.f17931K.f()) >= i11;
        }
        d dVar4 = this.f17932L.f17907f;
        if (dVar4 != null && dVar4.n() && (dVar = this.f17934N.f17907f) != null && dVar.n() && (this.f17934N.f17907f.e() - this.f17934N.f()) - (this.f17932L.f17907f.e() + this.f17932L.f()) >= i11) {
            return true;
        }
        return false;
    }

    public void d1(e eVar) {
        this.f17940T = eVar;
    }

    public void e(f fVar, androidx.constraintlayout.core.d dVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.V1(64));
        }
        if (i10 == 0) {
            HashSet d10 = this.f17931K.d();
            if (d10 != null) {
                Iterator it = d10.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f17905d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet d11 = this.f17933M.d();
            if (d11 != null) {
                Iterator it2 = d11.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f17905d.e(fVar, dVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet d12 = this.f17932L.d();
        if (d12 != null) {
            Iterator it3 = d12.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f17905d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet d13 = this.f17934N.d();
        if (d13 != null) {
            Iterator it4 = d13.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f17905d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet d14 = this.f17935O.d();
        if (d14 != null) {
            Iterator it5 = d14.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f17905d.e(fVar, dVar, hashSet, i10, true);
            }
        }
    }

    public void e0(d.a aVar, e eVar, d.a aVar2, int i10, int i11) {
        o(aVar).b(eVar.o(aVar2), i10, i11, true);
    }

    public void e1(float f10) {
        this.f17964i0 = f10;
    }

    public boolean f() {
        return (this instanceof l) || (this instanceof h);
    }

    public final boolean f0(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.mListAnchors;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f17907f;
        return (dVar4 == null || dVar4.f17907f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f17907f) == null || dVar2.f17907f != dVar) ? false : true;
    }

    public void f1(int i10) {
        this.f17986t0 = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        if (r13 != 3) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0210  */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(androidx.constraintlayout.core.d dVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        e eVar;
        e eVar2;
        boolean z14;
        boolean z15;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        int i15;
        androidx.constraintlayout.core.i iVar;
        int i16;
        int i17;
        boolean z16;
        int i18;
        boolean z17;
        b bVar;
        boolean z18;
        int i19;
        boolean z19;
        boolean z20;
        androidx.constraintlayout.core.i iVar2;
        boolean z21;
        b bVar2;
        boolean z22;
        b bVar3;
        androidx.constraintlayout.core.i iVar3;
        androidx.constraintlayout.core.i iVar4;
        androidx.constraintlayout.core.i iVar5;
        int i20;
        boolean z23;
        androidx.constraintlayout.core.i iVar6;
        androidx.constraintlayout.core.i iVar7;
        androidx.constraintlayout.core.i iVar8;
        int i21;
        int i22;
        ?? r21;
        int i23;
        e eVar3;
        androidx.constraintlayout.core.i iVar9;
        androidx.constraintlayout.core.i iVar10;
        androidx.constraintlayout.core.d dVar2;
        n nVar;
        androidx.constraintlayout.core.widgets.analyzer.f fVar;
        e eVar4;
        boolean z24;
        androidx.constraintlayout.core.widgets.analyzer.l lVar;
        androidx.constraintlayout.core.widgets.analyzer.f fVar2;
        int i24;
        int i25;
        boolean i02;
        boolean k02;
        androidx.constraintlayout.core.widgets.analyzer.l lVar2;
        n nVar2;
        androidx.constraintlayout.core.widgets.analyzer.f fVar3;
        boolean[] zArr;
        androidx.constraintlayout.core.d dVar3 = dVar;
        androidx.constraintlayout.core.i q10 = dVar3.q(this.f17931K);
        androidx.constraintlayout.core.i q11 = dVar3.q(this.f17933M);
        androidx.constraintlayout.core.i q12 = dVar3.q(this.f17932L);
        androidx.constraintlayout.core.i q13 = dVar3.q(this.f17934N);
        androidx.constraintlayout.core.i q14 = dVar3.q(this.f17935O);
        e eVar5 = this.f17940T;
        if (eVar5 != null) {
            z12 = eVar5 != null && eVar5.mListDimensionBehaviors[0] == b.WRAP_CONTENT;
            z11 = eVar5 != null && eVar5.mListDimensionBehaviors[1] == b.WRAP_CONTENT;
            int i26 = this.f17985t;
            if (i26 == 1) {
                z11 = false;
            } else if (i26 == 2) {
                z12 = false;
            }
            if (this.f17970l0 == 8 && !this.f17972m0 && !b0()) {
                zArr = this.mIsInBarrier;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
            z13 = this.f17973n;
            if (!z13 || this.f17975o) {
                if (z13) {
                    dVar3.f(q10, this.f17945Y);
                    dVar3.f(q11, this.f17945Y + this.f17941U);
                    if (z12 && (eVar2 = this.f17940T) != null) {
                        if (this.f17963i) {
                            f fVar4 = (f) eVar2;
                            fVar4.A1(this.f17931K);
                            fVar4.z1(this.f17933M);
                        } else {
                            dVar3.h(dVar3.q(eVar2.f17933M), q11, 0, 5);
                        }
                    }
                }
                if (this.f17975o) {
                    dVar3.f(q12, this.f17946Z);
                    dVar3.f(q13, this.f17946Z + this.f17942V);
                    if (this.f17935O.m()) {
                        dVar3.f(q14, this.f17946Z + this.f17956e0);
                    }
                    if (z11 && (eVar = this.f17940T) != null) {
                        if (this.f17963i) {
                            f fVar5 = (f) eVar;
                            fVar5.F1(this.f17932L);
                            fVar5.E1(this.f17934N);
                        } else {
                            dVar3.h(dVar3.q(eVar.f17934N), q13, 0, 5);
                        }
                    }
                }
                if (this.f17973n && this.f17975o) {
                    this.f17973n = false;
                    this.f17975o = false;
                    return;
                }
            }
            boolean z25 = androidx.constraintlayout.core.d.f17728p;
            if (z10 && (lVar2 = this.f17953d) != null && (nVar2 = this.f17955e) != null) {
                fVar3 = lVar2.f17873h;
                if (fVar3.f17827j && lVar2.f17874i.f17827j && nVar2.f17873h.f17827j && nVar2.f17874i.f17827j) {
                    dVar3.f(q10, fVar3.f17824g);
                    dVar3.f(q11, this.f17953d.f17874i.f17824g);
                    dVar3.f(q12, this.f17955e.f17873h.f17824g);
                    dVar3.f(q13, this.f17955e.f17874i.f17824g);
                    dVar3.f(q14, this.f17955e.f17850k.f17824g);
                    if (this.f17940T != null) {
                        if (z12 && this.isTerminalWidget[0] && !i0()) {
                            dVar3.h(dVar3.q(this.f17940T.f17933M), q11, 0, 8);
                        }
                        if (z11 && this.isTerminalWidget[1] && !k0()) {
                            dVar3.h(dVar3.q(this.f17940T.f17934N), q13, 0, 8);
                        }
                    }
                    this.f17973n = false;
                    this.f17975o = false;
                    return;
                }
            }
            if (this.f17940T == null) {
                if (f0(0)) {
                    ((f) this.f17940T).w1(this, 0);
                    i02 = true;
                } else {
                    i02 = i0();
                }
                if (f0(1)) {
                    ((f) this.f17940T).w1(this, 1);
                    k02 = true;
                } else {
                    k02 = k0();
                }
                if (!i02 && z12 && this.f17970l0 != 8 && this.f17931K.f17907f == null && this.f17933M.f17907f == null) {
                    dVar3.h(dVar3.q(this.f17940T.f17933M), q11, 0, 1);
                }
                if (!k02 && z11 && this.f17970l0 != 8 && this.f17932L.f17907f == null && this.f17934N.f17907f == null && this.f17935O == null) {
                    dVar3.h(dVar3.q(this.f17940T.f17934N), q13, 0, 1);
                }
                z14 = i02;
                z15 = k02;
            } else {
                z14 = false;
                z15 = false;
            }
            i10 = this.f17941U;
            i11 = this.f17958f0;
            if (i10 >= i11) {
                i11 = i10;
            }
            i12 = this.f17942V;
            i13 = this.f17960g0;
            if (i12 >= i13) {
                i13 = i12;
            }
            b[] bVarArr = this.mListDimensionBehaviors;
            b bVar4 = bVarArr[0];
            b bVar5 = b.MATCH_CONSTRAINT;
            boolean z26 = bVar4 == bVar5;
            b bVar6 = bVarArr[1];
            boolean z27 = bVar6 == bVar5;
            int i27 = this.f17944X;
            this.f17923C = i27;
            i14 = i11;
            f10 = this.f17943W;
            this.f17924D = f10;
            int i28 = this.f17987u;
            int i29 = this.f17989v;
            if (f10 <= 0.0f) {
                i15 = i13;
                if (this.f17970l0 != 8) {
                    i16 = (bVar4 == bVar5 && i28 == 0) ? 3 : i28;
                    int i30 = (bVar6 == bVar5 && i29 == 0) ? 3 : i29;
                    if (bVar4 == bVar5 && bVar6 == bVar5) {
                        iVar = q11;
                        i25 = 3;
                        if (i16 == 3 && i30 == 3) {
                            p1(z12, z11, z26, z27);
                            i17 = i30;
                            z16 = true;
                            int[] iArr = this.mResolvedMatchConstraintDefault;
                            iArr[0] = i16;
                            iArr[1] = i17;
                            this.f17957f = z16;
                            if (z16) {
                                i18 = -1;
                            } else {
                                int i31 = this.f17923C;
                                i18 = -1;
                                if (i31 == 0 || i31 == -1) {
                                    z17 = true;
                                    boolean z28 = !z16 && ((i24 = this.f17923C) == 1 || i24 == i18);
                                    b bVar7 = this.mListDimensionBehaviors[0];
                                    bVar = b.WRAP_CONTENT;
                                    z18 = bVar7 != bVar && (this instanceof f);
                                    i19 = z18 ? 0 : i14;
                                    z19 = !this.f17938R.o();
                                    boolean[] zArr2 = this.mIsInBarrier;
                                    z20 = zArr2[0];
                                    boolean z29 = zArr2[1];
                                    if (this.f17981r != 2 && !this.f17973n) {
                                        if (z10 && (lVar = this.f17953d) != null) {
                                            fVar2 = lVar.f17873h;
                                            if (fVar2.f17827j && lVar.f17874i.f17827j) {
                                                if (z10) {
                                                    dVar3.f(q10, fVar2.f17824g);
                                                    androidx.constraintlayout.core.i iVar11 = iVar;
                                                    dVar3.f(iVar11, this.f17953d.f17874i.f17824g);
                                                    if (this.f17940T != null && z12 && this.isTerminalWidget[0] && !i0()) {
                                                        dVar3.h(dVar3.q(this.f17940T.f17933M), iVar11, 0, 8);
                                                    }
                                                    iVar2 = q10;
                                                    z21 = z16;
                                                    bVar2 = bVar;
                                                    z22 = z11;
                                                    iVar = iVar11;
                                                    i20 = i16;
                                                    z23 = z12;
                                                    bVar3 = bVar5;
                                                    iVar5 = q12;
                                                    iVar4 = q13;
                                                    iVar3 = q14;
                                                    if (z10 && (nVar = this.f17955e) != null) {
                                                        fVar = nVar.f17873h;
                                                        if (fVar.f17827j && nVar.f17874i.f17827j) {
                                                            int i32 = fVar.f17824g;
                                                            iVar6 = iVar5;
                                                            dVar3.f(iVar6, i32);
                                                            iVar7 = iVar4;
                                                            dVar3.f(iVar7, this.f17955e.f17874i.f17824g);
                                                            iVar8 = iVar3;
                                                            dVar3.f(iVar8, this.f17955e.f17850k.f17824g);
                                                            eVar4 = this.f17940T;
                                                            if (eVar4 == null && !z15 && z22) {
                                                                z24 = true;
                                                                z24 = true;
                                                                if (this.isTerminalWidget[1]) {
                                                                    i21 = 0;
                                                                    i22 = 8;
                                                                    dVar3.h(dVar3.q(eVar4.f17934N), iVar7, 0, 8);
                                                                } else {
                                                                    i21 = 0;
                                                                    i22 = 8;
                                                                }
                                                            } else {
                                                                i21 = 0;
                                                                i22 = 8;
                                                                z24 = true;
                                                            }
                                                            i23 = i21;
                                                            r21 = z24;
                                                            if ((this.f17983s != 2 ? i21 : i23) != 0 || this.f17975o) {
                                                                eVar3 = this;
                                                                iVar9 = iVar6;
                                                                iVar10 = iVar7;
                                                            } else {
                                                                boolean z30 = (this.mListDimensionBehaviors[r21] == bVar2 && (this instanceof f)) ? r21 : i21;
                                                                int i33 = z30 ? i21 : i15;
                                                                e eVar6 = this.f17940T;
                                                                androidx.constraintlayout.core.i q15 = eVar6 != null ? dVar3.q(eVar6.f17934N) : null;
                                                                e eVar7 = this.f17940T;
                                                                androidx.constraintlayout.core.i q16 = eVar7 != null ? dVar3.q(eVar7.f17932L) : null;
                                                                if (this.f17956e0 > 0 || this.f17970l0 == i22) {
                                                                    d dVar4 = this.f17935O;
                                                                    if (dVar4.f17907f != null) {
                                                                        dVar3.e(iVar8, iVar6, p(), i22);
                                                                        dVar3.e(iVar8, dVar3.q(this.f17935O.f17907f), this.f17935O.f(), i22);
                                                                        if (z22) {
                                                                            dVar3.h(q15, dVar3.q(this.f17934N), i21, 5);
                                                                        }
                                                                        z19 = i21;
                                                                    } else if (this.f17970l0 == i22) {
                                                                        dVar3.e(iVar8, iVar6, dVar4.f(), i22);
                                                                    } else {
                                                                        dVar3.e(iVar8, iVar6, p(), i22);
                                                                    }
                                                                }
                                                                boolean z31 = this.isTerminalWidget[r21];
                                                                b[] bVarArr2 = this.mListDimensionBehaviors;
                                                                int i34 = i21;
                                                                iVar9 = iVar6;
                                                                iVar10 = iVar7;
                                                                i(dVar, false, z22, z23, z31, q16, q15, bVarArr2[r21], z30, this.f17932L, this.f17934N, this.f17946Z, i33, this.f17960g0, this.mMaxDimension[r21], this.f17964i0, z28, bVarArr2[i34] == bVar3 ? r21 : i34, z15, z14, z29, i17, i20, this.f17997z, this.f17921A, this.f17922B, z19);
                                                                eVar3 = this;
                                                            }
                                                            if (z21) {
                                                                if (eVar3.f17923C != 1) {
                                                                    dVar.k(iVar, iVar2, iVar10, iVar9, eVar3.f17924D, 8);
                                                                    dVar2 = dVar;
                                                                    if (eVar3.f17938R.o()) {
                                                                        dVar2.b(eVar3, eVar3.f17938R.j().h(), (float) Math.toRadians(eVar3.f17925E + 90.0f), eVar3.f17938R.f());
                                                                    }
                                                                    eVar3.f17973n = false;
                                                                    eVar3.f17975o = false;
                                                                }
                                                                dVar.k(iVar10, iVar9, iVar, iVar2, eVar3.f17924D, 8);
                                                            }
                                                            dVar2 = dVar;
                                                            if (eVar3.f17938R.o()) {
                                                            }
                                                            eVar3.f17973n = false;
                                                            eVar3.f17975o = false;
                                                        }
                                                    }
                                                    iVar6 = iVar5;
                                                    iVar7 = iVar4;
                                                    iVar8 = iVar3;
                                                    i21 = 0;
                                                    i22 = 8;
                                                    r21 = 1;
                                                    i23 = 1;
                                                    if ((this.f17983s != 2 ? i21 : i23) != 0) {
                                                    }
                                                    eVar3 = this;
                                                    iVar9 = iVar6;
                                                    iVar10 = iVar7;
                                                    if (z21) {
                                                    }
                                                    dVar2 = dVar;
                                                    if (eVar3.f17938R.o()) {
                                                    }
                                                    eVar3.f17973n = false;
                                                    eVar3.f17975o = false;
                                                }
                                            }
                                        }
                                        androidx.constraintlayout.core.i iVar12 = iVar;
                                        e eVar8 = this.f17940T;
                                        androidx.constraintlayout.core.i q17 = eVar8 == null ? dVar3.q(eVar8.f17933M) : null;
                                        e eVar9 = this.f17940T;
                                        androidx.constraintlayout.core.i q18 = eVar9 == null ? dVar3.q(eVar9.f17931K) : null;
                                        boolean z32 = this.isTerminalWidget[0];
                                        b[] bVarArr3 = this.mListDimensionBehaviors;
                                        iVar = iVar12;
                                        b bVar8 = bVarArr3[0];
                                        d dVar5 = this.f17931K;
                                        androidx.constraintlayout.core.i iVar13 = q18;
                                        d dVar6 = this.f17933M;
                                        z21 = z16;
                                        z23 = z12;
                                        int i35 = this.f17945Y;
                                        int i36 = this.f17958f0;
                                        int i37 = this.mMaxDimension[0];
                                        float f11 = this.f17962h0;
                                        boolean z33 = bVarArr3[1] != bVar5;
                                        iVar2 = q10;
                                        boolean z34 = z11;
                                        androidx.constraintlayout.core.i iVar14 = q17;
                                        z22 = z34;
                                        i20 = i16;
                                        bVar3 = bVar5;
                                        iVar5 = q12;
                                        iVar4 = q13;
                                        iVar3 = q14;
                                        bVar2 = bVar;
                                        dVar3 = dVar;
                                        i(dVar3, true, z23, z22, z32, iVar13, iVar14, bVar8, z18, dVar5, dVar6, i35, i19, i36, i37, f11, z17, z33, z14, z15, z20, i20, i17, this.f17991w, this.f17993x, this.f17995y, z19);
                                        if (z10) {
                                            fVar = nVar.f17873h;
                                            if (fVar.f17827j) {
                                                int i322 = fVar.f17824g;
                                                iVar6 = iVar5;
                                                dVar3.f(iVar6, i322);
                                                iVar7 = iVar4;
                                                dVar3.f(iVar7, this.f17955e.f17874i.f17824g);
                                                iVar8 = iVar3;
                                                dVar3.f(iVar8, this.f17955e.f17850k.f17824g);
                                                eVar4 = this.f17940T;
                                                if (eVar4 == null) {
                                                }
                                                i21 = 0;
                                                i22 = 8;
                                                z24 = true;
                                                i23 = i21;
                                                r21 = z24;
                                                if ((this.f17983s != 2 ? i21 : i23) != 0) {
                                                }
                                                eVar3 = this;
                                                iVar9 = iVar6;
                                                iVar10 = iVar7;
                                                if (z21) {
                                                }
                                                dVar2 = dVar;
                                                if (eVar3.f17938R.o()) {
                                                }
                                                eVar3.f17973n = false;
                                                eVar3.f17975o = false;
                                            }
                                        }
                                        iVar6 = iVar5;
                                        iVar7 = iVar4;
                                        iVar8 = iVar3;
                                        i21 = 0;
                                        i22 = 8;
                                        r21 = 1;
                                        i23 = 1;
                                        if ((this.f17983s != 2 ? i21 : i23) != 0) {
                                        }
                                        eVar3 = this;
                                        iVar9 = iVar6;
                                        iVar10 = iVar7;
                                        if (z21) {
                                        }
                                        dVar2 = dVar;
                                        if (eVar3.f17938R.o()) {
                                        }
                                        eVar3.f17973n = false;
                                        eVar3.f17975o = false;
                                    }
                                    iVar2 = q10;
                                    z21 = z16;
                                    bVar2 = bVar;
                                    z22 = z11;
                                    i20 = i16;
                                    z23 = z12;
                                    bVar3 = bVar5;
                                    iVar5 = q12;
                                    iVar4 = q13;
                                    iVar3 = q14;
                                    if (z10) {
                                    }
                                    iVar6 = iVar5;
                                    iVar7 = iVar4;
                                    iVar8 = iVar3;
                                    i21 = 0;
                                    i22 = 8;
                                    r21 = 1;
                                    i23 = 1;
                                    if ((this.f17983s != 2 ? i21 : i23) != 0) {
                                    }
                                    eVar3 = this;
                                    iVar9 = iVar6;
                                    iVar10 = iVar7;
                                    if (z21) {
                                    }
                                    dVar2 = dVar;
                                    if (eVar3.f17938R.o()) {
                                    }
                                    eVar3.f17973n = false;
                                    eVar3.f17975o = false;
                                }
                            }
                            z17 = false;
                            if (z16) {
                            }
                            b bVar72 = this.mListDimensionBehaviors[0];
                            bVar = b.WRAP_CONTENT;
                            if (bVar72 != bVar) {
                            }
                            if (z18) {
                            }
                            z19 = !this.f17938R.o();
                            boolean[] zArr22 = this.mIsInBarrier;
                            z20 = zArr22[0];
                            boolean z292 = zArr22[1];
                            if (this.f17981r != 2) {
                                if (z10) {
                                    fVar2 = lVar.f17873h;
                                    if (fVar2.f17827j) {
                                        if (z10) {
                                        }
                                    }
                                }
                                androidx.constraintlayout.core.i iVar122 = iVar;
                                e eVar82 = this.f17940T;
                                if (eVar82 == null) {
                                }
                                e eVar92 = this.f17940T;
                                if (eVar92 == null) {
                                }
                                boolean z322 = this.isTerminalWidget[0];
                                b[] bVarArr32 = this.mListDimensionBehaviors;
                                iVar = iVar122;
                                b bVar82 = bVarArr32[0];
                                d dVar52 = this.f17931K;
                                androidx.constraintlayout.core.i iVar132 = q18;
                                d dVar62 = this.f17933M;
                                z21 = z16;
                                z23 = z12;
                                int i352 = this.f17945Y;
                                int i362 = this.f17958f0;
                                int i372 = this.mMaxDimension[0];
                                float f112 = this.f17962h0;
                                if (bVarArr32[1] != bVar5) {
                                }
                                iVar2 = q10;
                                boolean z342 = z11;
                                androidx.constraintlayout.core.i iVar142 = q17;
                                z22 = z342;
                                i20 = i16;
                                bVar3 = bVar5;
                                iVar5 = q12;
                                iVar4 = q13;
                                iVar3 = q14;
                                bVar2 = bVar;
                                dVar3 = dVar;
                                i(dVar3, true, z23, z22, z322, iVar132, iVar142, bVar82, z18, dVar52, dVar62, i352, i19, i362, i372, f112, z17, z33, z14, z15, z20, i20, i17, this.f17991w, this.f17993x, this.f17995y, z19);
                                if (z10) {
                                }
                                iVar6 = iVar5;
                                iVar7 = iVar4;
                                iVar8 = iVar3;
                                i21 = 0;
                                i22 = 8;
                                r21 = 1;
                                i23 = 1;
                                if ((this.f17983s != 2 ? i21 : i23) != 0) {
                                }
                                eVar3 = this;
                                iVar9 = iVar6;
                                iVar10 = iVar7;
                                if (z21) {
                                }
                                dVar2 = dVar;
                                if (eVar3.f17938R.o()) {
                                }
                                eVar3.f17973n = false;
                                eVar3.f17975o = false;
                            }
                            iVar2 = q10;
                            z21 = z16;
                            bVar2 = bVar;
                            z22 = z11;
                            i20 = i16;
                            z23 = z12;
                            bVar3 = bVar5;
                            iVar5 = q12;
                            iVar4 = q13;
                            iVar3 = q14;
                            if (z10) {
                            }
                            iVar6 = iVar5;
                            iVar7 = iVar4;
                            iVar8 = iVar3;
                            i21 = 0;
                            i22 = 8;
                            r21 = 1;
                            i23 = 1;
                            if ((this.f17983s != 2 ? i21 : i23) != 0) {
                            }
                            eVar3 = this;
                            iVar9 = iVar6;
                            iVar10 = iVar7;
                            if (z21) {
                            }
                            dVar2 = dVar;
                            if (eVar3.f17938R.o()) {
                            }
                            eVar3.f17973n = false;
                            eVar3.f17975o = false;
                        }
                    } else {
                        iVar = q11;
                        i25 = 3;
                    }
                    if (bVar4 != bVar5 || i16 != i25) {
                        if (bVar6 == bVar5 && i30 == i25) {
                            this.f17923C = 1;
                            if (i27 == -1) {
                                this.f17924D = 1.0f / f10;
                            }
                            i15 = (int) (this.f17924D * i10);
                            if (bVar4 != bVar5) {
                                i17 = 4;
                            }
                        }
                        i17 = i30;
                        z16 = true;
                        int[] iArr2 = this.mResolvedMatchConstraintDefault;
                        iArr2[0] = i16;
                        iArr2[1] = i17;
                        this.f17957f = z16;
                        if (z16) {
                        }
                        z17 = false;
                        if (z16) {
                        }
                        b bVar722 = this.mListDimensionBehaviors[0];
                        bVar = b.WRAP_CONTENT;
                        if (bVar722 != bVar) {
                        }
                        if (z18) {
                        }
                        z19 = !this.f17938R.o();
                        boolean[] zArr222 = this.mIsInBarrier;
                        z20 = zArr222[0];
                        boolean z2922 = zArr222[1];
                        if (this.f17981r != 2) {
                        }
                        iVar2 = q10;
                        z21 = z16;
                        bVar2 = bVar;
                        z22 = z11;
                        i20 = i16;
                        z23 = z12;
                        bVar3 = bVar5;
                        iVar5 = q12;
                        iVar4 = q13;
                        iVar3 = q14;
                        if (z10) {
                        }
                        iVar6 = iVar5;
                        iVar7 = iVar4;
                        iVar8 = iVar3;
                        i21 = 0;
                        i22 = 8;
                        r21 = 1;
                        i23 = 1;
                        if ((this.f17983s != 2 ? i21 : i23) != 0) {
                        }
                        eVar3 = this;
                        iVar9 = iVar6;
                        iVar10 = iVar7;
                        if (z21) {
                        }
                        dVar2 = dVar;
                        if (eVar3.f17938R.o()) {
                        }
                        eVar3.f17973n = false;
                        eVar3.f17975o = false;
                    }
                    this.f17923C = 0;
                    i14 = (int) (i12 * f10);
                    if (bVar6 == bVar5) {
                        i17 = i30;
                        z16 = true;
                        int[] iArr22 = this.mResolvedMatchConstraintDefault;
                        iArr22[0] = i16;
                        iArr22[1] = i17;
                        this.f17957f = z16;
                        if (z16) {
                        }
                        z17 = false;
                        if (z16) {
                        }
                        b bVar7222 = this.mListDimensionBehaviors[0];
                        bVar = b.WRAP_CONTENT;
                        if (bVar7222 != bVar) {
                        }
                        if (z18) {
                        }
                        z19 = !this.f17938R.o();
                        boolean[] zArr2222 = this.mIsInBarrier;
                        z20 = zArr2222[0];
                        boolean z29222 = zArr2222[1];
                        if (this.f17981r != 2) {
                        }
                        iVar2 = q10;
                        z21 = z16;
                        bVar2 = bVar;
                        z22 = z11;
                        i20 = i16;
                        z23 = z12;
                        bVar3 = bVar5;
                        iVar5 = q12;
                        iVar4 = q13;
                        iVar3 = q14;
                        if (z10) {
                        }
                        iVar6 = iVar5;
                        iVar7 = iVar4;
                        iVar8 = iVar3;
                        i21 = 0;
                        i22 = 8;
                        r21 = 1;
                        i23 = 1;
                        if ((this.f17983s != 2 ? i21 : i23) != 0) {
                        }
                        eVar3 = this;
                        iVar9 = iVar6;
                        iVar10 = iVar7;
                        if (z21) {
                        }
                        dVar2 = dVar;
                        if (eVar3.f17938R.o()) {
                        }
                        eVar3.f17973n = false;
                        eVar3.f17975o = false;
                    }
                    i16 = 4;
                    i17 = i30;
                    z16 = false;
                    int[] iArr222 = this.mResolvedMatchConstraintDefault;
                    iArr222[0] = i16;
                    iArr222[1] = i17;
                    this.f17957f = z16;
                    if (z16) {
                    }
                    z17 = false;
                    if (z16) {
                    }
                    b bVar72222 = this.mListDimensionBehaviors[0];
                    bVar = b.WRAP_CONTENT;
                    if (bVar72222 != bVar) {
                    }
                    if (z18) {
                    }
                    z19 = !this.f17938R.o();
                    boolean[] zArr22222 = this.mIsInBarrier;
                    z20 = zArr22222[0];
                    boolean z292222 = zArr22222[1];
                    if (this.f17981r != 2) {
                    }
                    iVar2 = q10;
                    z21 = z16;
                    bVar2 = bVar;
                    z22 = z11;
                    i20 = i16;
                    z23 = z12;
                    bVar3 = bVar5;
                    iVar5 = q12;
                    iVar4 = q13;
                    iVar3 = q14;
                    if (z10) {
                    }
                    iVar6 = iVar5;
                    iVar7 = iVar4;
                    iVar8 = iVar3;
                    i21 = 0;
                    i22 = 8;
                    r21 = 1;
                    i23 = 1;
                    if ((this.f17983s != 2 ? i21 : i23) != 0) {
                    }
                    eVar3 = this;
                    iVar9 = iVar6;
                    iVar10 = iVar7;
                    if (z21) {
                    }
                    dVar2 = dVar;
                    if (eVar3.f17938R.o()) {
                    }
                    eVar3.f17973n = false;
                    eVar3.f17975o = false;
                }
            } else {
                i15 = i13;
            }
            iVar = q11;
            i16 = i28;
            i17 = i29;
            z16 = false;
            int[] iArr2222 = this.mResolvedMatchConstraintDefault;
            iArr2222[0] = i16;
            iArr2222[1] = i17;
            this.f17957f = z16;
            if (z16) {
            }
            z17 = false;
            if (z16) {
            }
            b bVar722222 = this.mListDimensionBehaviors[0];
            bVar = b.WRAP_CONTENT;
            if (bVar722222 != bVar) {
            }
            if (z18) {
            }
            z19 = !this.f17938R.o();
            boolean[] zArr222222 = this.mIsInBarrier;
            z20 = zArr222222[0];
            boolean z2922222 = zArr222222[1];
            if (this.f17981r != 2) {
            }
            iVar2 = q10;
            z21 = z16;
            bVar2 = bVar;
            z22 = z11;
            i20 = i16;
            z23 = z12;
            bVar3 = bVar5;
            iVar5 = q12;
            iVar4 = q13;
            iVar3 = q14;
            if (z10) {
            }
            iVar6 = iVar5;
            iVar7 = iVar4;
            iVar8 = iVar3;
            i21 = 0;
            i22 = 8;
            r21 = 1;
            i23 = 1;
            if ((this.f17983s != 2 ? i21 : i23) != 0) {
            }
            eVar3 = this;
            iVar9 = iVar6;
            iVar10 = iVar7;
            if (z21) {
            }
            dVar2 = dVar;
            if (eVar3.f17938R.o()) {
            }
            eVar3.f17973n = false;
            eVar3.f17975o = false;
        }
        z11 = false;
        z12 = false;
        if (this.f17970l0 == 8) {
            zArr = this.mIsInBarrier;
            if (!zArr[0]) {
                return;
            }
        }
        z13 = this.f17973n;
        if (!z13) {
        }
        if (z13) {
        }
        if (this.f17975o) {
        }
        if (this.f17973n) {
            this.f17973n = false;
            this.f17975o = false;
            return;
        }
        boolean z252 = androidx.constraintlayout.core.d.f17728p;
        if (z10) {
            fVar3 = lVar2.f17873h;
            if (fVar3.f17827j) {
                dVar3.f(q10, fVar3.f17824g);
                dVar3.f(q11, this.f17953d.f17874i.f17824g);
                dVar3.f(q12, this.f17955e.f17873h.f17824g);
                dVar3.f(q13, this.f17955e.f17874i.f17824g);
                dVar3.f(q14, this.f17955e.f17850k.f17824g);
                if (this.f17940T != null) {
                }
                this.f17973n = false;
                this.f17975o = false;
                return;
            }
        }
        if (this.f17940T == null) {
        }
        i10 = this.f17941U;
        i11 = this.f17958f0;
        if (i10 >= i11) {
        }
        i12 = this.f17942V;
        i13 = this.f17960g0;
        if (i12 >= i13) {
        }
        b[] bVarArr4 = this.mListDimensionBehaviors;
        b bVar42 = bVarArr4[0];
        b bVar52 = b.MATCH_CONSTRAINT;
        if (bVar42 == bVar52) {
        }
        b bVar62 = bVarArr4[1];
        if (bVar62 == bVar52) {
        }
        int i272 = this.f17944X;
        this.f17923C = i272;
        i14 = i11;
        f10 = this.f17943W;
        this.f17924D = f10;
        int i282 = this.f17987u;
        int i292 = this.f17989v;
        if (f10 <= 0.0f) {
        }
        iVar = q11;
        i16 = i282;
        i17 = i292;
        z16 = false;
        int[] iArr22222 = this.mResolvedMatchConstraintDefault;
        iArr22222[0] = i16;
        iArr22222[1] = i17;
        this.f17957f = z16;
        if (z16) {
        }
        z17 = false;
        if (z16) {
        }
        b bVar7222222 = this.mListDimensionBehaviors[0];
        bVar = b.WRAP_CONTENT;
        if (bVar7222222 != bVar) {
        }
        if (z18) {
        }
        z19 = !this.f17938R.o();
        boolean[] zArr2222222 = this.mIsInBarrier;
        z20 = zArr2222222[0];
        boolean z29222222 = zArr2222222[1];
        if (this.f17981r != 2) {
        }
        iVar2 = q10;
        z21 = z16;
        bVar2 = bVar;
        z22 = z11;
        i20 = i16;
        z23 = z12;
        bVar3 = bVar52;
        iVar5 = q12;
        iVar4 = q13;
        iVar3 = q14;
        if (z10) {
        }
        iVar6 = iVar5;
        iVar7 = iVar4;
        iVar8 = iVar3;
        i21 = 0;
        i22 = 8;
        r21 = 1;
        i23 = 1;
        if ((this.f17983s != 2 ? i21 : i23) != 0) {
        }
        eVar3 = this;
        iVar9 = iVar6;
        iVar10 = iVar7;
        if (z21) {
        }
        dVar2 = dVar;
        if (eVar3.f17938R.o()) {
        }
        eVar3.f17973n = false;
        eVar3.f17975o = false;
    }

    public boolean g0() {
        return this.f17977p;
    }

    public void g1(int i10, int i11) {
        this.f17946Z = i10;
        int i12 = i11 - i10;
        this.f17942V = i12;
        int i13 = this.f17960g0;
        if (i12 < i13) {
            this.f17942V = i13;
        }
    }

    public boolean h() {
        return this.f17970l0 != 8;
    }

    public boolean h0(int i10) {
        return this.mIsInBarrier[i10];
    }

    public void h1(b bVar) {
        this.mListDimensionBehaviors[1] = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0513 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(androidx.constraintlayout.core.d dVar, boolean z10, boolean z11, boolean z12, boolean z13, androidx.constraintlayout.core.i iVar, androidx.constraintlayout.core.i iVar2, b bVar, boolean z14, d dVar2, d dVar3, int i10, int i11, int i12, int i13, float f10, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i14, int i15, int i16, int i17, float f11, boolean z20) {
        boolean z21;
        int i18;
        boolean z22;
        int i19;
        int i20;
        androidx.constraintlayout.core.i iVar3;
        int i21;
        androidx.constraintlayout.core.i iVar4;
        boolean z23;
        boolean z24;
        int i22;
        int i23;
        androidx.constraintlayout.core.i q10;
        androidx.constraintlayout.core.i q11;
        androidx.constraintlayout.core.i iVar5;
        int i24;
        char c10;
        int i25;
        d dVar4;
        boolean z25;
        androidx.constraintlayout.core.i iVar6;
        androidx.constraintlayout.core.i iVar7;
        androidx.constraintlayout.core.i iVar8;
        androidx.constraintlayout.core.i iVar9;
        boolean z26;
        boolean z27;
        int i26;
        int i27;
        int i28;
        boolean z28;
        boolean z29;
        e eVar;
        androidx.constraintlayout.core.i iVar10;
        androidx.constraintlayout.core.i iVar11;
        e eVar2;
        e eVar3;
        boolean z30;
        int i29;
        boolean z31;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z32;
        boolean z33;
        e eVar4;
        int i38;
        e eVar5;
        androidx.constraintlayout.core.d dVar5 = dVar;
        androidx.constraintlayout.core.i q12 = dVar5.q(dVar2);
        androidx.constraintlayout.core.i q13 = dVar5.q(dVar3);
        androidx.constraintlayout.core.i q14 = dVar5.q(dVar2.j());
        androidx.constraintlayout.core.i q15 = dVar5.q(dVar3.j());
        androidx.constraintlayout.core.d.x();
        boolean o10 = dVar2.o();
        boolean o11 = dVar3.o();
        boolean o12 = this.f17938R.o();
        int i39 = o11 ? (o10 ? 1 : 0) + 1 : o10 ? 1 : 0;
        if (o12) {
            i39++;
        }
        int i40 = z15 ? 3 : i14;
        int ordinal = bVar.ordinal();
        boolean z34 = (ordinal == 0 || ordinal == 1 || ordinal != 2 || i40 == 4) ? false : true;
        int i41 = this.f17965j;
        if (i41 != -1 && z10) {
            this.f17965j = -1;
            i11 = i41;
            z34 = false;
        }
        int i42 = this.f17967k;
        if (i42 == -1 || z10) {
            i42 = i11;
        } else {
            this.f17967k = -1;
            z34 = false;
        }
        int i43 = i42;
        if (this.f17970l0 == 8) {
            i18 = 0;
            z21 = false;
        } else {
            z21 = z34;
            i18 = i43;
        }
        if (z20) {
            if (!o10 && !o11 && !o12) {
                dVar5.f(q12, i10);
            } else if (o10 && !o11) {
                z22 = z21;
                i19 = 8;
                dVar5.e(q12, q14, dVar2.f(), 8);
            }
            z22 = z21;
            i19 = 8;
        } else {
            z22 = z21;
            i19 = 8;
        }
        if (!z22) {
            if (z14) {
                dVar5.e(q13, q12, 0, 3);
                if (i12 > 0) {
                    dVar5.h(q13, q12, i12, 8);
                }
                if (i13 < Integer.MAX_VALUE) {
                    dVar5.j(q13, q12, i13, 8);
                }
            } else {
                dVar5.e(q13, q12, i18, i19);
            }
            i23 = i17;
            iVar3 = q13;
            i21 = i39;
            iVar4 = q15;
            z23 = z22;
            z24 = z13;
            i22 = i16;
        } else if (i39 == 2 || z15 || !(i40 == 1 || i40 == 0)) {
            int i44 = i16 == -2 ? i18 : i16;
            int i45 = i17 == -2 ? i18 : i17;
            if (i18 > 0 && i40 != 1) {
                i18 = 0;
            }
            if (i44 > 0) {
                dVar5.h(q13, q12, i44, 8);
                i18 = Math.max(i18, i44);
            }
            if (i45 > 0) {
                if (!z11 || i40 != 1) {
                    dVar5.j(q13, q12, i45, 8);
                }
                i18 = Math.min(i18, i45);
            }
            if (i40 == 1) {
                if (z11) {
                    dVar5.e(q13, q12, i18, 8);
                } else if (z17) {
                    dVar5.e(q13, q12, i18, 5);
                    dVar5.j(q13, q12, i18, 8);
                } else {
                    dVar5.e(q13, q12, i18, 5);
                    dVar5.j(q13, q12, i18, 8);
                }
                iVar3 = q13;
                iVar4 = q15;
                z23 = z22;
                z24 = z13;
                i22 = i44;
                i23 = i45;
                i21 = i39;
            } else {
                if (i40 == 2) {
                    d.a k10 = dVar2.k();
                    d.a aVar = d.a.TOP;
                    if (k10 == aVar || dVar2.k() == d.a.BOTTOM) {
                        q10 = dVar5.q(this.f17940T.o(aVar));
                        q11 = dVar5.q(this.f17940T.o(d.a.BOTTOM));
                    } else {
                        q10 = dVar5.q(this.f17940T.o(d.a.LEFT));
                        q11 = dVar5.q(this.f17940T.o(d.a.RIGHT));
                    }
                    androidx.constraintlayout.core.i iVar12 = q11;
                    iVar3 = q13;
                    i20 = i45;
                    i21 = i39;
                    iVar4 = q15;
                    dVar5.d(dVar5.r().k(iVar3, q12, iVar12, q10, f11));
                    if (z11) {
                        z22 = false;
                    }
                    z24 = z13;
                    z23 = z22;
                } else {
                    i20 = i45;
                    iVar3 = q13;
                    i21 = i39;
                    iVar4 = q15;
                    z23 = z22;
                    z24 = true;
                }
                i22 = i44;
                i23 = i20;
            }
        } else {
            int max = Math.max(i16, i18);
            if (i17 > 0) {
                max = Math.min(i17, max);
            }
            dVar5.e(q13, q12, max, 8);
            i22 = i16;
            i23 = i17;
            iVar3 = q13;
            i21 = i39;
            iVar4 = q15;
            z23 = false;
            z24 = z13;
        }
        if (!z20) {
            iVar5 = iVar2;
            i24 = 8;
            c10 = 1;
            i25 = 2;
        } else if (z17) {
            iVar5 = iVar2;
            i25 = 2;
            i24 = 8;
            c10 = 1;
        } else {
            if (o10 || o11 || o12) {
                if (o10 && !o11) {
                    i38 = (z11 && (dVar2.f17907f.f17905d instanceof androidx.constraintlayout.core.widgets.a)) ? 8 : 5;
                    z31 = z11;
                    iVar10 = iVar4;
                    if (z31) {
                    }
                } else if (!o10 && o11) {
                    dVar5.e(iVar3, iVar4, -dVar3.f(), 8);
                    if (z11) {
                        if (this.f17961h && q12.f17766g && (eVar4 = this.f17940T) != null) {
                            f fVar = (f) eVar4;
                            if (z10) {
                                fVar.A1(dVar2);
                            } else {
                                fVar.F1(dVar2);
                            }
                        } else {
                            i32 = 5;
                            dVar5.h(q12, iVar, 0, 5);
                            iVar10 = iVar4;
                            z31 = z11;
                            i38 = i32;
                            if (z31) {
                            }
                        }
                    }
                } else if (o10 && o11) {
                    e eVar6 = dVar2.f17907f.f17905d;
                    e eVar7 = dVar3.f17907f.f17905d;
                    e K10 = K();
                    int i46 = 6;
                    if (z23) {
                        if (i40 == 0) {
                            if (i23 != 0 || i22 != 0) {
                                i36 = 5;
                                i37 = 5;
                                z32 = true;
                                z33 = false;
                                z26 = true;
                            } else if (q14.f17766g && iVar4.f17766g) {
                                dVar5.e(q12, q14, dVar2.f(), 8);
                                dVar5.e(iVar3, iVar4, -dVar3.f(), 8);
                                return;
                            } else {
                                i36 = 8;
                                i37 = 8;
                                z32 = false;
                                z33 = true;
                                z26 = false;
                            }
                            if ((eVar6 instanceof androidx.constraintlayout.core.widgets.a) || (eVar7 instanceof androidx.constraintlayout.core.widgets.a)) {
                                androidx.constraintlayout.core.i iVar13 = iVar4;
                                iVar6 = q12;
                                iVar7 = iVar13;
                                z27 = z32;
                                z28 = z33;
                                z25 = true;
                                i28 = 4;
                            } else {
                                androidx.constraintlayout.core.i iVar14 = iVar4;
                                iVar6 = q12;
                                iVar7 = iVar14;
                                i28 = i37;
                                z27 = z32;
                                z28 = z33;
                                z25 = true;
                            }
                            i27 = i36;
                            iVar8 = q14;
                            i26 = 6;
                        } else {
                            if (i40 == 2) {
                                if ((eVar6 instanceof androidx.constraintlayout.core.widgets.a) || (eVar7 instanceof androidx.constraintlayout.core.widgets.a)) {
                                    androidx.constraintlayout.core.i iVar15 = iVar4;
                                    iVar6 = q12;
                                    iVar7 = iVar15;
                                    iVar8 = q14;
                                    i26 = 6;
                                    z25 = true;
                                    i28 = 4;
                                } else {
                                    androidx.constraintlayout.core.i iVar16 = iVar4;
                                    iVar6 = q12;
                                    iVar7 = iVar16;
                                    iVar8 = q14;
                                    i26 = 6;
                                    z25 = true;
                                    i28 = 5;
                                }
                                i27 = 5;
                            } else if (i40 == 1) {
                                androidx.constraintlayout.core.i iVar17 = iVar4;
                                iVar6 = q12;
                                iVar7 = iVar17;
                                iVar8 = q14;
                                i26 = 6;
                                z25 = true;
                                i28 = 4;
                                i27 = 8;
                            } else if (i40 != 3) {
                                z25 = true;
                                androidx.constraintlayout.core.i iVar18 = iVar4;
                                iVar6 = q12;
                                iVar7 = iVar18;
                                dVar5 = dVar;
                                iVar8 = q14;
                                i26 = 6;
                                i28 = 4;
                                i27 = 5;
                                z26 = false;
                                z27 = false;
                                z28 = false;
                            } else if (this.f17923C == -1) {
                                if (z18) {
                                    androidx.constraintlayout.core.i iVar19 = iVar4;
                                    iVar6 = q12;
                                    iVar7 = iVar19;
                                    dVar5 = dVar;
                                    iVar8 = q14;
                                    z25 = true;
                                    i26 = z11 ? 5 : 4;
                                } else {
                                    androidx.constraintlayout.core.i iVar20 = iVar4;
                                    iVar6 = q12;
                                    iVar7 = iVar20;
                                    dVar5 = dVar;
                                    iVar8 = q14;
                                    z25 = true;
                                    i26 = 8;
                                }
                                i28 = 5;
                                i27 = 8;
                                z26 = true;
                                z27 = true;
                                z28 = true;
                            } else {
                                if (z15) {
                                    if (i15 != 2) {
                                        z25 = true;
                                        if (i15 != 1) {
                                            i34 = 8;
                                            i35 = 5;
                                            androidx.constraintlayout.core.i iVar21 = iVar4;
                                            iVar6 = q12;
                                            iVar7 = iVar21;
                                            i27 = i34;
                                            i28 = i35;
                                            z26 = z25;
                                            z27 = z26;
                                            z28 = z27;
                                            iVar8 = q14;
                                            i26 = 6;
                                        }
                                    } else {
                                        z25 = true;
                                    }
                                    i34 = 5;
                                    i35 = 4;
                                    androidx.constraintlayout.core.i iVar212 = iVar4;
                                    iVar6 = q12;
                                    iVar7 = iVar212;
                                    i27 = i34;
                                    i28 = i35;
                                    z26 = z25;
                                    z27 = z26;
                                    z28 = z27;
                                    iVar8 = q14;
                                    i26 = 6;
                                } else {
                                    z25 = true;
                                    if (i23 > 0) {
                                        androidx.constraintlayout.core.i iVar22 = iVar4;
                                        iVar6 = q12;
                                        iVar7 = iVar22;
                                        dVar5 = dVar;
                                        z26 = true;
                                        z27 = true;
                                        z28 = true;
                                        iVar8 = q14;
                                        i26 = 6;
                                        i28 = 5;
                                    } else if (i23 != 0 || i22 != 0) {
                                        androidx.constraintlayout.core.i iVar23 = iVar4;
                                        iVar6 = q12;
                                        iVar7 = iVar23;
                                        dVar5 = dVar;
                                        z26 = true;
                                        z27 = true;
                                        z28 = true;
                                        iVar8 = q14;
                                        i26 = 6;
                                        i28 = 4;
                                    } else if (z18) {
                                        androidx.constraintlayout.core.i iVar24 = iVar4;
                                        iVar6 = q12;
                                        iVar7 = iVar24;
                                        i27 = (eVar6 == K10 || eVar7 == K10) ? 5 : 4;
                                        z26 = true;
                                        z27 = true;
                                        z28 = true;
                                        iVar8 = q14;
                                        i26 = 6;
                                        i28 = 4;
                                    } else {
                                        androidx.constraintlayout.core.i iVar25 = iVar4;
                                        iVar6 = q12;
                                        iVar7 = iVar25;
                                        dVar5 = dVar;
                                        z26 = true;
                                        z27 = true;
                                        z28 = true;
                                        iVar8 = q14;
                                        i26 = 6;
                                        i28 = 8;
                                    }
                                    i27 = 5;
                                }
                                dVar5 = dVar;
                            }
                            z26 = true;
                            z27 = true;
                            z28 = false;
                        }
                        iVar9 = iVar2;
                    } else {
                        z25 = true;
                        if (q14.f17766g && iVar4.f17766g) {
                            androidx.constraintlayout.core.i iVar26 = iVar4;
                            dVar.c(q12, q14, dVar2.f(), f10, iVar26, iVar3, dVar3.f(), 8);
                            if (z11 && z24) {
                                int f12 = dVar3.f17907f != null ? dVar3.f() : 0;
                                if (iVar26 != iVar2) {
                                    dVar.h(iVar2, iVar3, f12, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        androidx.constraintlayout.core.i iVar27 = iVar4;
                        iVar6 = q12;
                        iVar7 = iVar27;
                        dVar5 = dVar;
                        iVar8 = q14;
                        iVar9 = iVar2;
                        z26 = true;
                        z27 = true;
                        i26 = 6;
                        i27 = 5;
                        i28 = 4;
                        z28 = false;
                    }
                    if (z26 && iVar8 == iVar7 && eVar6 != K10) {
                        z26 = false;
                        z29 = false;
                    } else {
                        z29 = z25;
                    }
                    if (z27) {
                        if (z23 || z16 || z18 || iVar8 != iVar || iVar7 != iVar9) {
                            z30 = z25;
                            i33 = i26;
                            z31 = z11;
                        } else {
                            z30 = z25;
                            i33 = 8;
                            z31 = false;
                            i27 = 8;
                            z29 = false;
                        }
                        androidx.constraintlayout.core.i iVar28 = iVar6;
                        eVar = eVar6;
                        eVar2 = eVar7;
                        eVar3 = K10;
                        i29 = 8;
                        androidx.constraintlayout.core.i iVar29 = iVar3;
                        dVar5.c(iVar28, iVar8, dVar2.f(), f10, iVar7, iVar29, dVar3.f(), i33);
                        androidx.constraintlayout.core.i iVar30 = iVar7;
                        iVar11 = iVar28;
                        iVar10 = iVar30;
                        iVar3 = iVar29;
                    } else {
                        androidx.constraintlayout.core.i iVar31 = iVar6;
                        eVar = eVar6;
                        iVar10 = iVar7;
                        iVar11 = iVar31;
                        eVar2 = eVar7;
                        eVar3 = K10;
                        z30 = z25;
                        i29 = 8;
                        z31 = z11;
                    }
                    if (this.f17970l0 != i29 || dVar3.m()) {
                        if (z26) {
                            int i47 = (!z31 || iVar8 == iVar10 || z23 || !((eVar instanceof androidx.constraintlayout.core.widgets.a) || (eVar2 instanceof androidx.constraintlayout.core.widgets.a))) ? i27 : 6;
                            dVar5.h(iVar11, iVar8, dVar2.f(), i47);
                            dVar5.j(iVar3, iVar10, -dVar3.f(), i47);
                            i27 = i47;
                        }
                        if (!z31 || !z19 || (eVar instanceof androidx.constraintlayout.core.widgets.a) || (eVar2 instanceof androidx.constraintlayout.core.widgets.a) || eVar2 == eVar3) {
                            i30 = i28;
                            i31 = i27;
                            z30 = z29;
                        } else {
                            i30 = 6;
                            i31 = 6;
                        }
                        if (z30) {
                            if (z28 && (!z18 || z12)) {
                                if (eVar != eVar3 && eVar2 != eVar3) {
                                    i46 = i30;
                                }
                                if ((eVar instanceof h) || (eVar2 instanceof h)) {
                                    i46 = 5;
                                }
                                if ((eVar instanceof androidx.constraintlayout.core.widgets.a) || (eVar2 instanceof androidx.constraintlayout.core.widgets.a)) {
                                    i46 = 5;
                                }
                                i30 = Math.max(z18 ? 5 : i46, i30);
                            }
                            if (z31) {
                                i30 = Math.min(i31, i30);
                                if (z15 && !z18 && (eVar == eVar3 || eVar2 == eVar3)) {
                                    i30 = 4;
                                }
                            }
                            dVar5.e(iVar11, iVar8, dVar2.f(), i30);
                            dVar5.e(iVar3, iVar10, -dVar3.f(), i30);
                        }
                        if (z31) {
                            int f13 = iVar == iVar8 ? dVar2.f() : 0;
                            if (iVar8 != iVar) {
                                dVar5.h(iVar11, iVar, f13, 5);
                            }
                        }
                        if (z31 && z23 && i12 == 0 && i22 == 0) {
                            if (!z23 || i40 != 3) {
                                i32 = 5;
                                dVar5.h(iVar3, iVar11, 0, 5);
                                i38 = i32;
                                if (z31 && z24) {
                                    int f14 = dVar3.f17907f != null ? dVar3.f() : 0;
                                    if (iVar10 != iVar2) {
                                        if (!this.f17961h || !iVar3.f17766g || (eVar5 = this.f17940T) == null) {
                                            dVar5.h(iVar2, iVar3, f14, i38);
                                            return;
                                        }
                                        f fVar2 = (f) eVar5;
                                        if (z10) {
                                            fVar2.z1(dVar3);
                                            return;
                                        } else {
                                            fVar2.E1(dVar3);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            dVar5.h(iVar3, iVar11, 0, i29);
                        }
                        i32 = 5;
                        i38 = i32;
                        if (z31) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
            }
            iVar10 = iVar4;
            i32 = 5;
            z31 = z11;
            i38 = i32;
            if (z31) {
            }
        }
        if (i21 < i25 && z11 && z24) {
            dVar5.h(q12, iVar, 0, i24);
            char c11 = (z10 || this.f17935O.f17907f == null) ? c10 : (char) 0;
            if (!z10 && (dVar4 = this.f17935O.f17907f) != null) {
                e eVar8 = dVar4.f17905d;
                if (eVar8.f17943W != 0.0f) {
                    b[] bVarArr = eVar8.mListDimensionBehaviors;
                    b bVar2 = bVarArr[0];
                    b bVar3 = b.MATCH_CONSTRAINT;
                    if (bVar2 == bVar3 && bVarArr[c10] == bVar3) {
                        c11 = c10;
                    }
                }
                c11 = 0;
            }
            if (c11 != 0) {
                dVar5.h(iVar5, iVar3, 0, i24);
            }
        }
    }

    public boolean i0() {
        d dVar = this.f17931K;
        d dVar2 = dVar.f17907f;
        if (dVar2 != null && dVar2.f17907f == dVar) {
            return true;
        }
        d dVar3 = this.f17933M;
        d dVar4 = dVar3.f17907f;
        return dVar4 != null && dVar4.f17907f == dVar3;
    }

    public void i1(int i10, int i11, int i12, float f10) {
        this.f17989v = i10;
        this.f17997z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f17921A = i12;
        this.f17922B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f17989v = 2;
    }

    public void j(d.a aVar, e eVar, d.a aVar2, int i10) {
        d.a aVar3;
        d.a aVar4;
        boolean z10;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    j(aVar6, eVar, aVar2, 0);
                    j(d.a.RIGHT, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    j(aVar7, eVar, aVar2, 0);
                    j(d.a.BOTTOM, eVar, aVar2, 0);
                    o(aVar5).a(eVar.o(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d o10 = o(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d o11 = o(aVar9);
            d.a aVar10 = d.a.TOP;
            d o12 = o(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d o13 = o(aVar11);
            boolean z11 = true;
            if ((o10 == null || !o10.o()) && (o11 == null || !o11.o())) {
                j(aVar8, eVar, aVar8, 0);
                j(aVar9, eVar, aVar9, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((o12 == null || !o12.o()) && (o13 == null || !o13.o())) {
                j(aVar10, eVar, aVar10, 0);
                j(aVar11, eVar, aVar11, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                o(aVar5).a(eVar.o(aVar5), 0);
                return;
            }
            if (z10) {
                d.a aVar12 = d.a.CENTER_X;
                o(aVar12).a(eVar.o(aVar12), 0);
                return;
            } else {
                if (z11) {
                    d.a aVar13 = d.a.CENTER_Y;
                    o(aVar13).a(eVar.o(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d o14 = o(aVar4);
            d o15 = eVar.o(aVar2);
            d o16 = o(d.a.RIGHT);
            o14.a(o15, 0);
            o16.a(o15, 0);
            o(aVar14).a(o15, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d o17 = eVar.o(aVar2);
            o(aVar3).a(o17, 0);
            o(d.a.BOTTOM).a(o17, 0);
            o(aVar15).a(o17, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            o(aVar16).a(eVar.o(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            o(aVar17).a(eVar.o(aVar17), 0);
            o(aVar14).a(eVar.o(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            o(aVar18).a(eVar.o(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            o(aVar19).a(eVar.o(aVar19), 0);
            o(aVar15).a(eVar.o(aVar2), 0);
            return;
        }
        d o18 = o(aVar);
        d o19 = eVar.o(aVar2);
        if (o18.p(o19)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d o20 = o(d.a.TOP);
                d o21 = o(d.a.BOTTOM);
                if (o20 != null) {
                    o20.q();
                }
                if (o21 != null) {
                    o21.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d o22 = o(aVar20);
                if (o22 != null) {
                    o22.q();
                }
                d o23 = o(aVar5);
                if (o23.j() != o19) {
                    o23.q();
                }
                d g10 = o(aVar).g();
                d o24 = o(aVar15);
                if (o24.o()) {
                    g10.q();
                    o24.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d o25 = o(aVar5);
                if (o25.j() != o19) {
                    o25.q();
                }
                d g11 = o(aVar).g();
                d o26 = o(aVar14);
                if (o26.o()) {
                    g11.q();
                    o26.q();
                }
            }
            o18.a(o19, i10);
        }
    }

    public boolean j0() {
        return this.f17927G;
    }

    public void j1(float f10) {
        this.mWeight[1] = f10;
    }

    public void k(d dVar, d dVar2, int i10) {
        if (dVar.h() == this) {
            j(dVar.k(), dVar2.h(), dVar2.k(), i10);
        }
    }

    public boolean k0() {
        d dVar = this.f17932L;
        d dVar2 = dVar.f17907f;
        if (dVar2 != null && dVar2.f17907f == dVar) {
            return true;
        }
        d dVar3 = this.f17934N;
        d dVar4 = dVar3.f17907f;
        return dVar4 != null && dVar4.f17907f == dVar3;
    }

    public void k1(int i10) {
        this.f17970l0 = i10;
    }

    public void l(e eVar, float f10, int i10) {
        d.a aVar = d.a.CENTER;
        e0(aVar, eVar, aVar, i10, 0);
        this.f17925E = f10;
    }

    public boolean l0() {
        return this.f17928H;
    }

    public void l1(int i10) {
        this.f17941U = i10;
        int i11 = this.f17958f0;
        if (i10 < i11) {
            this.f17941U = i11;
        }
    }

    public void m(androidx.constraintlayout.core.d dVar) {
        dVar.q(this.f17931K);
        dVar.q(this.f17932L);
        dVar.q(this.f17933M);
        dVar.q(this.f17934N);
        if (this.f17956e0 > 0) {
            dVar.q(this.f17935O);
        }
    }

    public boolean m0() {
        return this.f17959g && this.f17970l0 != 8;
    }

    public void m1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f17985t = i10;
    }

    public void n() {
        if (this.f17953d == null) {
            this.f17953d = new androidx.constraintlayout.core.widgets.analyzer.l(this);
        }
        if (this.f17955e == null) {
            this.f17955e = new n(this);
        }
    }

    public boolean n0() {
        if (this.f17973n) {
            return true;
        }
        return this.f17931K.n() && this.f17933M.n();
    }

    public void n1(int i10) {
        this.f17945Y = i10;
    }

    public d o(d.a aVar) {
        switch (a.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[aVar.ordinal()]) {
            case 1:
                return this.f17931K;
            case 2:
                return this.f17932L;
            case 3:
                return this.f17933M;
            case 4:
                return this.f17934N;
            case 5:
                return this.f17935O;
            case 6:
                return this.f17938R;
            case 7:
                return this.f17936P;
            case 8:
                return this.f17937Q;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean o0() {
        if (this.f17975o) {
            return true;
        }
        return this.f17932L.n() && this.f17934N.n();
    }

    public void o1(int i10) {
        this.f17946Z = i10;
    }

    public int p() {
        return this.f17956e0;
    }

    public boolean p0() {
        return this.f17979q;
    }

    public void p1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.f17923C == -1) {
            if (z12 && !z13) {
                this.f17923C = 0;
            } else if (!z12 && z13) {
                this.f17923C = 1;
                if (this.f17944X == -1) {
                    this.f17924D = 1.0f / this.f17924D;
                }
            }
        }
        if (this.f17923C == 0 && (!this.f17932L.o() || !this.f17934N.o())) {
            this.f17923C = 1;
        } else if (this.f17923C == 1 && (!this.f17931K.o() || !this.f17933M.o())) {
            this.f17923C = 0;
        }
        if (this.f17923C == -1 && (!this.f17932L.o() || !this.f17934N.o() || !this.f17931K.o() || !this.f17933M.o())) {
            if (this.f17932L.o() && this.f17934N.o()) {
                this.f17923C = 0;
            } else if (this.f17931K.o() && this.f17933M.o()) {
                this.f17924D = 1.0f / this.f17924D;
                this.f17923C = 1;
            }
        }
        if (this.f17923C == -1) {
            int i10 = this.f17991w;
            if (i10 > 0 && this.f17997z == 0) {
                this.f17923C = 0;
            } else {
                if (i10 != 0 || this.f17997z <= 0) {
                    return;
                }
                this.f17924D = 1.0f / this.f17924D;
                this.f17923C = 1;
            }
        }
    }

    public float q(int i10) {
        if (i10 == 0) {
            return this.f17962h0;
        }
        if (i10 == 1) {
            return this.f17964i0;
        }
        return -1.0f;
    }

    public void q0() {
        this.f17977p = true;
    }

    public void q1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f17953d.k();
        boolean k11 = z11 & this.f17955e.k();
        androidx.constraintlayout.core.widgets.analyzer.l lVar = this.f17953d;
        int i12 = lVar.f17873h.f17824g;
        n nVar = this.f17955e;
        int i13 = nVar.f17873h.f17824g;
        int i14 = lVar.f17874i.f17824g;
        int i15 = nVar.f17874i.f17824g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f17945Y = i12;
        }
        if (k11) {
            this.f17946Z = i13;
        }
        if (this.f17970l0 == 8) {
            this.f17941U = 0;
            this.f17942V = 0;
            return;
        }
        if (k10) {
            if (this.mListDimensionBehaviors[0] == b.FIXED && i17 < (i11 = this.f17941U)) {
                i17 = i11;
            }
            this.f17941U = i17;
            int i19 = this.f17958f0;
            if (i17 < i19) {
                this.f17941U = i19;
            }
        }
        if (k11) {
            if (this.mListDimensionBehaviors[1] == b.FIXED && i18 < (i10 = this.f17942V)) {
                i18 = i10;
            }
            this.f17942V = i18;
            int i20 = this.f17960g0;
            if (i18 < i20) {
                this.f17942V = i20;
            }
        }
    }

    public int r() {
        return Y() + this.f17942V;
    }

    public void r0() {
        this.f17979q = true;
    }

    public void r1(androidx.constraintlayout.core.d dVar, boolean z10) {
        n nVar;
        androidx.constraintlayout.core.widgets.analyzer.l lVar;
        int y10 = dVar.y(this.f17931K);
        int y11 = dVar.y(this.f17932L);
        int y12 = dVar.y(this.f17933M);
        int y13 = dVar.y(this.f17934N);
        if (z10 && (lVar = this.f17953d) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar = lVar.f17873h;
            if (fVar.f17827j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar2 = lVar.f17874i;
                if (fVar2.f17827j) {
                    y10 = fVar.f17824g;
                    y12 = fVar2.f17824g;
                }
            }
        }
        if (z10 && (nVar = this.f17955e) != null) {
            androidx.constraintlayout.core.widgets.analyzer.f fVar3 = nVar.f17873h;
            if (fVar3.f17827j) {
                androidx.constraintlayout.core.widgets.analyzer.f fVar4 = nVar.f17874i;
                if (fVar4.f17827j) {
                    y11 = fVar3.f17824g;
                    y13 = fVar4.f17824g;
                }
            }
        }
        int i10 = y13 - y11;
        if (y12 - y10 < 0 || i10 < 0 || y10 == Integer.MIN_VALUE || y10 == Integer.MAX_VALUE || y11 == Integer.MIN_VALUE || y11 == Integer.MAX_VALUE || y12 == Integer.MIN_VALUE || y12 == Integer.MAX_VALUE || y13 == Integer.MIN_VALUE || y13 == Integer.MAX_VALUE) {
            y10 = 0;
            y13 = 0;
            y11 = 0;
            y12 = 0;
        }
        K0(y10, y11, y12, y13);
    }

    public Object s() {
        return this.f17966j0;
    }

    public boolean s0() {
        b[] bVarArr = this.mListDimensionBehaviors;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String t() {
        return this.f17974n0;
    }

    public void t0() {
        this.f17931K.q();
        this.f17932L.q();
        this.f17933M.q();
        this.f17934N.q();
        this.f17935O.q();
        this.f17936P.q();
        this.f17937Q.q();
        this.f17938R.q();
        this.f17940T = null;
        this.f17925E = Float.NaN;
        this.f17941U = 0;
        this.f17942V = 0;
        this.f17943W = 0.0f;
        this.f17944X = -1;
        this.f17945Y = 0;
        this.f17946Z = 0;
        this.f17952c0 = 0;
        this.f17954d0 = 0;
        this.f17956e0 = 0;
        this.f17958f0 = 0;
        this.f17960g0 = 0;
        float f10 = f17920A0;
        this.f17962h0 = f10;
        this.f17964i0 = f10;
        b[] bVarArr = this.mListDimensionBehaviors;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f17966j0 = null;
        this.f17968k0 = 0;
        this.f17970l0 = 0;
        this.f17976o0 = null;
        this.f17978p0 = false;
        this.f17980q0 = false;
        this.f17984s0 = 0;
        this.f17986t0 = 0;
        this.f17988u0 = false;
        this.f17990v0 = false;
        float[] fArr = this.mWeight;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f17981r = -1;
        this.f17983s = -1;
        int[] iArr = this.mMaxDimension;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f17987u = 0;
        this.f17989v = 0;
        this.f17995y = 1.0f;
        this.f17922B = 1.0f;
        this.f17993x = Integer.MAX_VALUE;
        this.f17921A = Integer.MAX_VALUE;
        this.f17991w = 0;
        this.f17997z = 0;
        this.f17957f = false;
        this.f17923C = -1;
        this.f17924D = 1.0f;
        this.f17982r0 = false;
        boolean[] zArr = this.isTerminalWidget;
        zArr[0] = true;
        zArr[1] = true;
        this.f17928H = false;
        boolean[] zArr2 = this.mIsInBarrier;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f17959g = true;
        int[] iArr2 = this.mResolvedMatchConstraintDefault;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f17965j = -1;
        this.f17967k = -1;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f17976o0 != null) {
            str = "type: " + this.f17976o0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f17974n0 != null) {
            str2 = "id: " + this.f17974n0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f17945Y);
        sb2.append(", ");
        sb2.append(this.f17946Z);
        sb2.append(") - (");
        sb2.append(this.f17941U);
        sb2.append(" x ");
        sb2.append(this.f17942V);
        sb2.append(")");
        return sb2.toString();
    }

    public b u(int i10) {
        if (i10 == 0) {
            return A();
        }
        if (i10 == 1) {
            return T();
        }
        return null;
    }

    public void u0() {
        e K10 = K();
        if (K10 != null && (K10 instanceof f) && ((f) K()).N1()) {
            return;
        }
        int size = this.f17939S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f17939S.get(i10)).q();
        }
    }

    public float v() {
        return this.f17943W;
    }

    public void v0() {
        this.f17973n = false;
        this.f17975o = false;
        this.f17977p = false;
        this.f17979q = false;
        int size = this.f17939S.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) this.f17939S.get(i10)).r();
        }
    }

    public int w() {
        return this.f17944X;
    }

    public void w0(androidx.constraintlayout.core.c cVar) {
        this.f17931K.s(cVar);
        this.f17932L.s(cVar);
        this.f17933M.s(cVar);
        this.f17934N.s(cVar);
        this.f17935O.s(cVar);
        this.f17938R.s(cVar);
        this.f17936P.s(cVar);
        this.f17937Q.s(cVar);
    }

    public int x() {
        if (this.f17970l0 == 8) {
            return 0;
        }
        return this.f17942V;
    }

    public final void x0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public float y() {
        return this.f17962h0;
    }

    public final void y0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public int z() {
        return this.f17984s0;
    }

    public final void z0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }
}
