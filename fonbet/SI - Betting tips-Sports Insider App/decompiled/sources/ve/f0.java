package ve;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 extends View {
    public final float A;
    public String A0;
    public StaticLayout A1;
    public final float B;
    public String B0;
    public StaticLayout B1;
    public final float C;
    public String C0;
    public StaticLayout C1;
    public final float D;
    public String D0;
    public StaticLayout D1;
    public final float E;
    public String E0;
    public StaticLayout E1;
    public final float F;
    public final float F0;
    public final float F1;
    public final float G;
    public final float G0;
    public final float G1;
    public final float H;
    public final float H0;
    public final float H1;
    public final float I;
    public final float I0;
    public final float I1;
    public final float J;
    public final float J0;
    public final DisplayMetrics J1;
    public final float K;
    public final float K0;
    public final int[] K1;
    public float L;
    public final float L0;
    public final int[] L1;
    public final float M0;
    public final int[] M1;
    public final float N0;
    public final int[] N1;
    public final float O0;
    public LinearGradient O1;
    public final float P0;
    public int P1;
    public final float Q0;
    public final jg.d Q1;
    public final float R0;
    public boolean R1;
    public final float S0;
    public final float T0;
    public final float U0;
    public final float V0;
    public final float W0;
    public Typeface X0;
    public Typeface Y0;
    public final float Z0;

    /* renamed from: a, reason: collision with root package name */
    public final float f24625a;

    /* renamed from: a1, reason: collision with root package name */
    public RippleDrawable f24626a1;

    /* renamed from: b, reason: collision with root package name */
    public final float f24627b;

    /* renamed from: b1, reason: collision with root package name */
    public final int f24628b1;

    /* renamed from: c, reason: collision with root package name */
    public final float f24629c;

    /* renamed from: c1, reason: collision with root package name */
    public final int f24630c1;

    /* renamed from: d, reason: collision with root package name */
    public final float f24631d;
    public final int d1;

    /* renamed from: e, reason: collision with root package name */
    public final float f24632e;

    /* renamed from: e1, reason: collision with root package name */
    public final int f24633e1;

    /* renamed from: f, reason: collision with root package name */
    public final float f24634f;

    /* renamed from: f1, reason: collision with root package name */
    public final int f24635f1;

    /* renamed from: g, reason: collision with root package name */
    public final float f24636g;

    /* renamed from: g0, reason: collision with root package name */
    public final float f24637g0;

    /* renamed from: g1, reason: collision with root package name */
    public final Path f24638g1;

    /* renamed from: h, reason: collision with root package name */
    public final float f24639h;

    /* renamed from: h0, reason: collision with root package name */
    public Bitmap f24640h0;

    /* renamed from: h1, reason: collision with root package name */
    public final RectF f24641h1;

    /* renamed from: i, reason: collision with root package name */
    public final float f24642i;

    /* renamed from: i0, reason: collision with root package name */
    public final Matrix f24643i0;

    /* renamed from: i1, reason: collision with root package name */
    public final RectF f24644i1;
    public final float j;
    public final Paint j0;

    /* renamed from: j1, reason: collision with root package name */
    public final RectF f24645j1;

    /* renamed from: k, reason: collision with root package name */
    public final float f24646k;
    public final Paint k0;

    /* renamed from: k1, reason: collision with root package name */
    public final RectF f24647k1;

    /* renamed from: l, reason: collision with root package name */
    public final float f24648l;

    /* renamed from: l0, reason: collision with root package name */
    public final Paint f24649l0;

    /* renamed from: l1, reason: collision with root package name */
    public final RectF f24650l1;

    /* renamed from: m, reason: collision with root package name */
    public String f24651m;

    /* renamed from: m0, reason: collision with root package name */
    public final Paint f24652m0;

    /* renamed from: m1, reason: collision with root package name */
    public final RectF f24653m1;

    /* renamed from: n, reason: collision with root package name */
    public String f24654n;

    /* renamed from: n0, reason: collision with root package name */
    public final TextPaint f24655n0;

    /* renamed from: n1, reason: collision with root package name */
    public final RectF f24656n1;

    /* renamed from: o, reason: collision with root package name */
    public final StringBuilder f24657o;

    /* renamed from: o0, reason: collision with root package name */
    public final TextPaint f24658o0;

    /* renamed from: o1, reason: collision with root package name */
    public final RectF f24659o1;

    /* renamed from: p, reason: collision with root package name */
    public String f24660p;

    /* renamed from: p0, reason: collision with root package name */
    public final TextPaint f24661p0;

    /* renamed from: p1, reason: collision with root package name */
    public final RectF f24662p1;
    public final float q;

    /* renamed from: q0, reason: collision with root package name */
    public final TextPaint f24663q0;

    /* renamed from: q1, reason: collision with root package name */
    public final RectF f24664q1;

    /* renamed from: r, reason: collision with root package name */
    public final float f24665r;

    /* renamed from: r0, reason: collision with root package name */
    public final TextPaint f24666r0;

    /* renamed from: r1, reason: collision with root package name */
    public final RectF f24667r1;

    /* renamed from: s, reason: collision with root package name */
    public final float f24668s;

    /* renamed from: s0, reason: collision with root package name */
    public final TextPaint f24669s0;
    public final RectF s1;

    /* renamed from: t, reason: collision with root package name */
    public final float f24670t;

    /* renamed from: t0, reason: collision with root package name */
    public final TextPaint f24671t0;

    /* renamed from: t1, reason: collision with root package name */
    public final RectF f24672t1;

    /* renamed from: u, reason: collision with root package name */
    public final float f24673u;

    /* renamed from: u0, reason: collision with root package name */
    public final TextPaint f24674u0;

    /* renamed from: u1, reason: collision with root package name */
    public final RectF f24675u1;

    /* renamed from: v, reason: collision with root package name */
    public final float f24676v;

    /* renamed from: v0, reason: collision with root package name */
    public String f24677v0;

    /* renamed from: v1, reason: collision with root package name */
    public final RectF f24678v1;

    /* renamed from: w, reason: collision with root package name */
    public final float f24679w;

    /* renamed from: w0, reason: collision with root package name */
    public String f24680w0;

    /* renamed from: w1, reason: collision with root package name */
    public StaticLayout f24681w1;

    /* renamed from: x, reason: collision with root package name */
    public final float f24682x;
    public String x0;

    /* renamed from: x1, reason: collision with root package name */
    public StaticLayout f24683x1;

    /* renamed from: y, reason: collision with root package name */
    public final float f24684y;

    /* renamed from: y0, reason: collision with root package name */
    public String f24685y0;

    /* renamed from: y1, reason: collision with root package name */
    public StaticLayout f24686y1;

    /* renamed from: z, reason: collision with root package name */
    public final float f24687z;
    public String z0;

    /* renamed from: z1, reason: collision with root package name */
    public StaticLayout f24688z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24625a = 100.0f;
        this.f24627b = 10.0f;
        this.f24629c = 20.0f;
        this.f24631d = 10.0f;
        this.f24632e = 25.0f;
        this.f24634f = 30.0f;
        this.f24636g = 17.0f;
        this.f24639h = 17.0f;
        this.f24642i = 18.0f;
        this.j = 13.0f;
        this.f24646k = 25.0f;
        this.f24648l = 1.0f;
        this.f24651m = "__.__";
        this.f24654n = "--:--";
        this.f24657o = new StringBuilder(8);
        this.f24660p = "00:00:00";
        this.q = 13.0f;
        this.f24665r = 13.0f;
        this.f24668s = 20.0f;
        this.f24670t = 6.0f;
        this.f24673u = 20.0f;
        this.f24676v = 6.0f;
        this.f24679w = 3.0f;
        this.f24682x = 3.0f;
        this.f24684y = 20.0f;
        this.f24687z = 18.0f;
        this.A = 20.0f;
        this.B = 120.0f;
        this.C = 8.0f;
        this.D = 24.0f;
        this.E = 16.0f;
        this.F = 20.0f;
        this.G = 18.0f;
        this.H = 20.0f;
        this.I = 8.0f;
        this.J = 24.0f;
        this.K = 16.0f;
        this.L = 16.0f;
        this.f24637g0 = 120.0f;
        this.f24643i0 = new Matrix();
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.f24649l0 = new Paint(1);
        this.f24652m0 = new Paint(1);
        this.f24655n0 = new TextPaint(1);
        this.f24658o0 = new TextPaint(1);
        this.f24661p0 = new TextPaint(1);
        this.f24663q0 = new TextPaint(1);
        this.f24666r0 = new TextPaint(1);
        this.f24669s0 = new TextPaint(1);
        this.f24671t0 = new TextPaint(1);
        this.f24674u0 = new TextPaint(1);
        this.f24677v0 = "Premium prediction";
        this.f24680w0 = "Pending";
        this.x0 = "Check rate";
        this.f24685y0 = "Read prediction";
        this.z0 = "Waiting for the result";
        this.A0 = "WON";
        this.B0 = "LOST";
        this.C0 = "Return";
        this.D0 = "Total odds";
        this.E0 = "5.00";
        this.F0 = 20.0f;
        this.G0 = 10.0f;
        this.H0 = 10.0f;
        this.I0 = 25.0f;
        this.J0 = 30.0f;
        this.K0 = 17.0f;
        this.L0 = 17.0f;
        this.M0 = 18.0f;
        this.N0 = 13.0f;
        this.O0 = 25.0f;
        this.P0 = 45.0f;
        this.Q0 = 45.0f;
        this.R0 = 16.0f;
        this.S0 = 16.0f;
        this.T0 = 13.0f;
        this.U0 = 13.0f;
        this.V0 = 15.0f;
        this.W0 = 15.0f;
        this.Z0 = 1.0f;
        this.f24638g1 = new Path();
        this.f24641h1 = new RectF();
        this.f24644i1 = new RectF();
        this.f24645j1 = new RectF();
        this.f24647k1 = new RectF();
        this.f24650l1 = new RectF();
        this.f24653m1 = new RectF();
        this.f24656n1 = new RectF();
        this.f24659o1 = new RectF();
        this.f24662p1 = new RectF();
        this.f24664q1 = new RectF();
        this.f24667r1 = new RectF();
        this.s1 = new RectF();
        this.f24672t1 = new RectF();
        this.f24675u1 = new RectF();
        this.f24678v1 = new RectF();
        this.F1 = 1.0f;
        this.G1 = 69.0f;
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.K1 = iArr;
        this.L1 = new int[0];
        this.M1 = new int[]{R.attr.state_enabled};
        int[] iArr2 = new int[2];
        int i10 = 0;
        while (i10 < 2) {
            iArr2[i10] = i10 == 0 ? R.attr.state_pressed : 16842910;
            i10++;
        }
        this.N1 = iArr2;
        this.P1 = -3;
        lg.e eVar = eg.m0.f9201a;
        this.Q1 = eg.c0.b(jg.q.f18523a);
        TextPaint textPaint = this.f24671t0;
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.J1 = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 <= 0.0f ? this.f24648l : f6;
        this.Z0 = f6;
        this.F0 = this.f24629c * f6;
        this.G0 = this.f24631d * f6;
        this.H0 = this.f24627b * f6;
        DisplayMetrics displayMetrics3 = this.J1;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        this.I0 = androidx.core.view.h0.l(displayMetrics3, this.f24632e);
        DisplayMetrics displayMetrics4 = this.J1;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        this.J0 = androidx.core.view.h0.l(displayMetrics4, this.f24634f);
        DisplayMetrics displayMetrics5 = this.J1;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        this.K0 = androidx.core.view.h0.l(displayMetrics5, this.f24636g);
        DisplayMetrics displayMetrics6 = this.J1;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics6 = null;
        }
        this.L0 = androidx.core.view.h0.l(displayMetrics6, this.f24639h);
        DisplayMetrics displayMetrics7 = this.J1;
        if (displayMetrics7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics7 = null;
        }
        this.M0 = androidx.core.view.h0.l(displayMetrics7, this.f24642i);
        DisplayMetrics displayMetrics8 = this.J1;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics8 = null;
        }
        this.N0 = androidx.core.view.h0.l(displayMetrics8, this.j);
        DisplayMetrics displayMetrics9 = this.J1;
        if (displayMetrics9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics9;
        }
        this.O0 = androidx.core.view.h0.l(displayMetrics2, this.f24646k);
        float f10 = this.f24684y;
        float f11 = this.Z0;
        this.F = f10 * f11;
        this.G = this.f24687z * f11;
        this.H = this.A * f11;
        float f12 = this.C * f11;
        this.I = f12;
        this.L = f12 * 2.0f;
        this.f24637g0 = this.B * f11;
        this.f24673u = this.f24668s * f11;
        this.f24676v = this.f24670t * f11;
        this.f24682x = this.f24679w * f11;
        this.f24665r = this.q * f11;
        this.S0 = this.R0 * f11;
        this.U0 = this.T0 * f11;
        this.W0 = this.V0 * f11;
        this.Q0 = this.P0 * f11;
        this.G1 = 69.0f * f11;
        this.f24625a *= 1;
        this.F1 = f11 * 1.0f;
        this.J = this.D * f11;
        this.K = this.E * f11;
        this.f24628b1 = Color.parseColor("#E50957EE");
        this.f24630c1 = Color.parseColor("#E57B14CC");
        this.d1 = Color.parseColor("#3B3B3B");
        this.f24633e1 = Color.parseColor("#29BF57");
        this.f24635f1 = Color.parseColor("#A62921");
        int[] iArr3 = this.K1;
        iArr3[0] = this.f24628b1;
        iArr3[1] = this.f24630c1;
        TextPaint textPaint2 = this.f24655n0;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(-1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.I0);
        TextPaint textPaint3 = this.f24658o0;
        textPaint3.setTypeface(Typeface.DEFAULT);
        textPaint3.setColor(-1);
        textPaint3.setStyle(style);
        textPaint3.setTextSize(this.J0);
        TextPaint textPaint4 = this.f24661p0;
        textPaint4.setTypeface(typeface);
        textPaint4.setColor(-1);
        textPaint4.setStyle(style);
        textPaint4.setTextSize(this.J0);
        TextPaint textPaint5 = this.f24663q0;
        textPaint5.setTypeface(typeface);
        textPaint5.setColor(this.d1);
        textPaint5.setStyle(style);
        textPaint5.setTextSize(this.K0);
        TextPaint textPaint6 = this.f24666r0;
        textPaint6.setTypeface(typeface);
        textPaint6.setColor(this.d1);
        textPaint6.setStyle(style);
        textPaint6.setTextSize(this.L0);
        TextPaint textPaint7 = this.f24669s0;
        textPaint7.setTypeface(typeface);
        textPaint7.setColor(-1);
        textPaint7.setStyle(style);
        textPaint7.setTextSize(this.N0);
        textPaint.setTypeface(typeface);
        textPaint.setColor(-1);
        textPaint.setStyle(style);
        textPaint.setTextSize(this.M0);
        TextPaint textPaint8 = this.f24674u0;
        textPaint8.setTypeface(typeface);
        textPaint8.setColor(-1);
        textPaint8.setStyle(style);
        textPaint8.setTextSize(this.O0);
        Paint paint = this.j0;
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        paint.setColor(this.f24628b1);
        Paint paint2 = this.f24649l0;
        paint2.setStyle(style2);
        paint2.setColor(-1);
        Paint paint3 = this.f24652m0;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setStrokeWidth(this.F1);
        this.f24643i0.setScale(1.0f, 1.0f);
        this.f24657o.append("00:00:00");
        this.H1 = textPaint.measureText("00:00:00");
        this.I1 = textPaint.ascent() + textPaint.descent();
        f();
    }

    public static StaticLayout g(CharSequence charSequence, int i5, TextPaint textPaint, boolean z5, boolean z7) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        int min = Math.min(i5, (int) textPaint.measureText(charSequence.toString()));
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, min).setEllipsizedWidth(min).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(z7);
        if (z5) {
            includePad.setMaxLines(1);
        }
        return includePad.setLineSpacing(0.0f, 1.0f).build();
    }

    public static /* synthetic */ StaticLayout h(CharSequence charSequence, int i5, TextPaint textPaint, int i10) {
        return g(charSequence, i5, textPaint, false, (i10 & 16) != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.Y0, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.Y0 = typeface;
            this.f24661p0.setTypeface(typeface);
            this.f24655n0.setTypeface(this.Y0);
            this.f24669s0.setTypeface(this.Y0);
            this.f24674u0.setTypeface(this.Y0);
            this.f24663q0.setTypeface(this.Y0);
            this.f24671t0.setTypeface(this.Y0);
            this.f24666r0.setTypeface(this.Y0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.X0, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.X0 = typeface;
            this.f24658o0.setTypeface(typeface);
        }
    }

    public final void c() {
        this.f24641h1.setEmpty();
        this.f24638g1.reset();
        setPressed(false);
        RippleDrawable rippleDrawable = this.f24626a1;
        if (rippleDrawable != null) {
            rippleDrawable.setState(this.L1);
        }
        this.f24644i1.setEmpty();
        this.A1 = null;
        this.f24645j1.setEmpty();
        this.D1 = null;
        this.f24647k1.setEmpty();
        this.E1 = null;
        this.f24650l1.setEmpty();
        this.f24653m1.setEmpty();
        this.f24688z1 = null;
        this.f24656n1.setEmpty();
        this.f24681w1 = null;
        this.f24659o1.setEmpty();
        this.f24683x1 = null;
        this.f24662p1.setEmpty();
        this.B1 = null;
        this.f24664q1.setEmpty();
        this.C1 = null;
        this.f24667r1.setEmpty();
        this.s1.setEmpty();
        this.f24672t1.setEmpty();
        this.f24675u1.setEmpty();
        this.f24678v1.setEmpty();
        this.f24686y1 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0480  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i5, int i10) {
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        int i11;
        RectF rectF;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        RectF rectF2;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        float f36;
        float f37;
        if (i5 <= 0 || i10 <= 0) {
            c();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float abs = Math.abs(paddingEnd - paddingStart);
        float abs2 = Math.abs(paddingBottom - paddingTop);
        float f38 = (abs2 / 2.0f) + paddingTop;
        if (abs2 <= 0.0f || abs <= 0.0f) {
            c();
            return;
        }
        int i12 = (int) (abs - (this.H * 2.0f));
        StaticLayout g10 = g(this.f24651m, i12, this.f24658o0, true, false);
        StaticLayout g11 = g(this.f24654n, i12, this.f24661p0, true, false);
        int height = g10 != null ? g10.getHeight() : 0;
        int height2 = g11 != null ? g11.getHeight() : 0;
        int width = g10 != null ? g10.getWidth() : 0;
        int width2 = g11 != null ? g11.getWidth() : 0;
        int max = Math.max(width, width2);
        float f39 = this.G + paddingTop;
        float f40 = this.H;
        float f41 = paddingEnd - f40;
        float f42 = height + f39;
        float f43 = height2 + f42;
        float f44 = f41 - max;
        if (width > width2) {
            float f45 = (width - width2) / 2.0f;
            f12 = f41 - f45;
            f6 = f44 + f45;
            f11 = f41;
            f10 = f44;
        } else if (width < width2) {
            float f46 = (width2 - width) / 2.0f;
            f10 = f44 + f46;
            f11 = f41 - f46;
            f12 = f41;
            f6 = f44;
        } else {
            f6 = f44;
            f10 = f6;
            f11 = f41;
            f12 = f11;
        }
        float f47 = this.F;
        float f48 = paddingStart + f47;
        float f49 = f47 + paddingTop;
        float f50 = f44 - f40;
        StaticLayout h10 = h(this.f24677v0, (int) Math.abs(f50 - f48), this.f24655n0, 24);
        float height3 = (h10 != null ? h10.getHeight() : 0) + f49;
        float max2 = Math.max(height3, f43);
        float f51 = paddingEnd - this.K;
        float f52 = f51 - this.f24637g0;
        float f53 = this.J + f43;
        float f54 = this.I;
        float f55 = f51 - f54;
        float f56 = f54 + f52;
        float abs3 = Math.abs(f55 - f56);
        int i13 = this.P1;
        StaticLayout g12 = g(i13 != -2 ? i13 != -1 ? i13 != 0 ? i13 != 1 ? this.f24680w0 : this.A0 : this.B0 : this.C0 : this.f24680w0, (int) abs3, this.f24663q0, true, true);
        int height4 = g12 != null ? g12.getHeight() : 0;
        int width3 = g12 != null ? g12.getWidth() : 0;
        float f57 = this.I;
        float f58 = f53 + f57;
        float f59 = height4;
        float f60 = (f57 * 2.0f) + f53 + f59;
        float f61 = f60 - f57;
        float f62 = (abs3 - width3) / 2.0f;
        float abs4 = (Math.abs(f61 - f58) - f59) / 2.0f;
        float f63 = f56 + f62;
        float f64 = f58 + abs4;
        float f65 = f55 - f62;
        float f66 = f6;
        float f67 = f61 - abs4;
        float f68 = paddingStart + this.f24673u;
        float f69 = max2 + this.f24676v;
        float f70 = f10;
        float f71 = f52 - this.K;
        float f72 = f71 - f68;
        StaticLayout h11 = h(this.D0, (int) Math.abs(f72), this.f24669s0, 24);
        float height5 = (h11 != null ? h11.getHeight() : 0) + f69;
        float f73 = this.f24682x + height5;
        StaticLayout h12 = h(this.E0, (int) Math.abs(f72), this.f24674u0, 24);
        float height6 = (h12 != null ? h12.getHeight() : 0) + f73;
        this.B1 = h11;
        this.C1 = h12;
        this.f24688z1 = g12;
        this.A1 = h10;
        this.D1 = g10;
        this.E1 = g11;
        float max3 = Math.max(f60 + this.K, height6);
        float f74 = paddingEnd - this.W0;
        float f75 = paddingStart + this.S0;
        float f76 = max3 + this.U0;
        float f77 = this.Q0 + f76;
        int i14 = this.P1;
        TextPaint textPaint = this.f24666r0;
        if (i14 == -2) {
            float abs5 = Math.abs(f74 - f75);
            RectF rectF3 = this.f24675u1;
            RectF rectF4 = this.f24678v1;
            RectF rectF5 = this.f24667r1;
            f19 = f67;
            RectF rectF6 = this.f24672t1;
            if (abs5 <= 0.0f) {
                rectF6.setEmpty();
                rectF5.setEmpty();
                rectF4.setEmpty();
                this.f24686y1 = null;
                rectF3.setEmpty();
                f13 = f75;
                f14 = height5;
            } else {
                f14 = height5;
                float f78 = (abs5 - this.f24665r) / 2.0f;
                if (f78 > 0.0f) {
                    float f79 = f78 + f75;
                    float f80 = f77 - f76;
                    float abs6 = Math.abs(f80);
                    float abs7 = Math.abs(f79 - f75);
                    if (abs7 <= 0.0f || abs6 <= 0.0f) {
                        f13 = f75;
                        f29 = f79;
                        f15 = f73;
                        rectF2 = rectF4;
                        f16 = f68;
                        f17 = f69;
                        f18 = height6;
                        f20 = f71;
                        rectF6.setEmpty();
                        rectF5.setEmpty();
                    } else {
                        f29 = f79;
                        float f81 = this.H1;
                        if (f81 < abs7) {
                            float f82 = (abs7 - f81) / 2.0f;
                            f35 = f75 + f82;
                            float f83 = f29 - f82;
                            f17 = f69;
                            f34 = f83;
                        } else {
                            float f84 = (f81 - abs7) / 2.0f;
                            f34 = f29 + f84;
                            f35 = f75 - f84;
                            f17 = f69;
                        }
                        f15 = f73;
                        float f85 = this.I1;
                        if (f85 < abs6) {
                            float f86 = (abs6 - f85) / 2.0f;
                            f37 = f76 + f86;
                            float f87 = f77 - f86;
                            f16 = f68;
                            f36 = f87;
                        } else {
                            float f88 = (f85 - abs6) / 2.0f;
                            f36 = f88 + f77;
                            f37 = f76 - f88;
                            f16 = f68;
                        }
                        f18 = height6;
                        float f89 = this.F1 / 2.0f;
                        f20 = f71;
                        f13 = f75;
                        rectF2 = rectF4;
                        rectF6.set(f75 + f89, f76 + f89, f29 - f89, f77 - f89);
                        rectF5.set(f35, f37, f34, f36);
                    }
                    float f90 = f29 + this.f24665r;
                    int abs8 = (int) Math.abs(f74 - f90);
                    int abs9 = (int) Math.abs(f80);
                    if (abs8 <= 0 || abs9 <= 0) {
                        rectF2.setEmpty();
                        this.f24686y1 = null;
                        rectF3.setEmpty();
                    } else {
                        rectF3.set(f90, f76, f74, f77);
                        StaticLayout h13 = h(this.x0, abs8, textPaint, 8);
                        int width4 = h13 != null ? h13.getWidth() : 0;
                        int height7 = h13 != null ? h13.getHeight() : 0;
                        if (width4 < abs8) {
                            float f91 = (abs8 - width4) / 2.0f;
                            f30 = f90 + f91;
                            f31 = f74 - f91;
                        } else {
                            float f92 = (width4 - abs8) / 2.0f;
                            f30 = f90 - f92;
                            f31 = f92 + f74;
                        }
                        if (height7 < abs9) {
                            float f93 = (abs9 - height7) / 2.0f;
                            f32 = f76 + f93;
                            f33 = f77 - f93;
                        } else {
                            float f94 = (height7 - abs9) / 2.0f;
                            f32 = f76 - f94;
                            f33 = f94 + f77;
                        }
                        rectF2.set(f30, f32, f31, f33);
                        this.f24686y1 = h13;
                    }
                    i11 = this.P1;
                    if (i11 != -2) {
                        boolean z5 = i11 != -3;
                        int abs10 = (int) Math.abs(f74 - f13);
                        int abs11 = (int) Math.abs(f77 - f76);
                        RectF rectF7 = this.f24656n1;
                        RectF rectF8 = this.f24659o1;
                        if (abs10 <= 0 || abs11 <= 0) {
                            rectF8.setEmpty();
                            this.f24683x1 = null;
                            rectF7.setEmpty();
                            this.f24681w1 = null;
                        } else if (z5) {
                            StaticLayout h14 = h(this.f24685y0, abs10, textPaint, 8);
                            int width5 = h14 != null ? h14.getWidth() : 0;
                            int height8 = h14 != null ? h14.getHeight() : 0;
                            if (width5 < abs10) {
                                float f95 = (abs10 - width5) / 2.0f;
                                f25 = f13 + f95;
                                f26 = f74 - f95;
                            } else {
                                float f96 = (width5 - abs10) / 2.0f;
                                f25 = f13 - f96;
                                f26 = f96 + f74;
                            }
                            if (height8 < abs11) {
                                float f97 = (abs11 - height8) / 2.0f;
                                f27 = f76 + f97;
                                f28 = f77 - f97;
                            } else {
                                float f98 = (height8 - abs11) / 2.0f;
                                f27 = f76 - f98;
                                f28 = f98 + f77;
                            }
                            rectF8.set(f25, f27, f26, f28);
                            this.f24683x1 = h14;
                        } else {
                            StaticLayout h15 = h(this.z0, abs10, textPaint, 8);
                            int width6 = h15 != null ? h15.getWidth() : 0;
                            int height9 = h15 != null ? h15.getHeight() : 0;
                            if (width6 < abs10) {
                                float f99 = (abs10 - width6) / 2.0f;
                                f21 = f13 + f99;
                                f22 = f74 - f99;
                            } else {
                                float f100 = (width6 - abs10) / 2.0f;
                                f21 = f13 - f100;
                                f22 = f100 + f74;
                            }
                            if (height9 < abs11) {
                                float f101 = (abs11 - height9) / 2.0f;
                                f23 = f76 + f101;
                                f24 = f77 - f101;
                            } else {
                                float f102 = (height9 - abs11) / 2.0f;
                                f23 = f76 - f102;
                                f24 = f102 + f77;
                            }
                            rectF7.set(f21, f23, f22, f24);
                            this.f24681w1 = h15;
                        }
                    }
                    this.s1.set(f13, f76, f74, f77);
                    float f103 = f16;
                    float f104 = f20;
                    this.f24664q1.set(f103, f15, f104, f18);
                    this.f24662p1.set(f103, f17, f104, f14);
                    this.f24653m1.set(f63, f64, f65, f19);
                    this.f24650l1.set(f52, f53, f51, f60);
                    this.f24645j1.set(f70, f39, f11, f42);
                    this.f24647k1.set(f66, f42, f12, f43);
                    this.f24644i1.set(f48, f49, f50, height3);
                    rectF = this.f24641h1;
                    rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
                    Path path = this.f24638g1;
                    path.rewind();
                    float f105 = this.F0;
                    path.addRoundRect(rectF, f105, f105, Path.Direction.CW);
                    if (!rectF.isEmpty()) {
                        int i15 = (int) rectF.left;
                        int i16 = (int) rectF.top;
                        int i17 = (int) rectF.right;
                        int i18 = (int) rectF.bottom;
                        RippleDrawable rippleDrawable = this.f24626a1;
                        if (rippleDrawable != null) {
                            rippleDrawable.setBounds(i15, i16, i17, i18);
                            rippleDrawable.setHotspotBounds(i15, i16, i17, i18);
                        }
                    }
                    this.O1 = new LinearGradient(paddingStart, f38, paddingEnd, f38, this.K1, (float[]) null, Shader.TileMode.CLAMP);
                    invalidate();
                }
                rectF6.setEmpty();
                rectF5.setEmpty();
                rectF4.setEmpty();
                this.f24686y1 = null;
                rectF3.setEmpty();
                f13 = f75;
            }
            f15 = f73;
            f16 = f68;
            f17 = f69;
            f18 = height6;
        } else {
            f13 = f75;
            f14 = height5;
            f15 = f73;
            f16 = f68;
            f17 = f69;
            f18 = height6;
            f19 = f67;
        }
        f20 = f71;
        i11 = this.P1;
        if (i11 != -2) {
        }
        this.s1.set(f13, f76, f74, f77);
        float f1032 = f16;
        float f1042 = f20;
        this.f24664q1.set(f1032, f15, f1042, f18);
        this.f24662p1.set(f1032, f17, f1042, f14);
        this.f24653m1.set(f63, f64, f65, f19);
        this.f24650l1.set(f52, f53, f51, f60);
        this.f24645j1.set(f70, f39, f11, f42);
        this.f24647k1.set(f66, f42, f12, f43);
        this.f24644i1.set(f48, f49, f50, height3);
        rectF = this.f24641h1;
        rectF.set(paddingStart, paddingTop, paddingEnd, paddingBottom);
        Path path2 = this.f24638g1;
        path2.rewind();
        float f1052 = this.F0;
        path2.addRoundRect(rectF, f1052, f1052, Path.Direction.CW);
        if (!rectF.isEmpty()) {
        }
        this.O1 = new LinearGradient(paddingStart, f38, paddingEnd, f38, this.K1, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void e(int i5, String date, String time, String odds, long j) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(odds, "odds");
        this.f24654n = time;
        this.f24651m = date;
        this.E0 = odds;
        this.P1 = i5;
        this.f24663q0.setColor(i5 != -1 ? i5 != 0 ? i5 != 1 ? this.d1 : this.f24633e1 : this.f24635f1 : this.f24633e1);
        int i10 = this.P1;
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 != -1 && i10 != 0 && i10 != 1) {
                    j(0L);
                }
            } else if (j > 0) {
                j(j);
            } else {
                j(0L);
                this.P1 = -3;
            }
            requestLayout();
            invalidate();
        }
        j(0L);
        requestLayout();
        invalidate();
    }

    public final void f() {
        int[] iArr = this.K1;
        ColorStateList valueOf = ColorStateList.valueOf(iArr[0]);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(iArr[0]);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        float[] fArr = new float[8];
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = this.F0;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        this.f24626a1 = new RippleDrawable(valueOf, null, shapeDrawable);
    }

    public final int getHeightSize() {
        RectF rectF = this.f24641h1;
        return (int) Math.abs(rectF.bottom - rectF.top);
    }

    public final int getWidthSize() {
        RectF rectF = this.f24641h1;
        return (int) Math.abs(rectF.right - rectF.left);
    }

    public final void i(long j) {
        int i5 = this.P1;
        if (i5 != -3) {
            if (i5 != -2) {
                if (i5 != -1 && i5 != 0 && i5 != 1) {
                    j(0L);
                }
            } else if (j > 0) {
                j(j);
            } else {
                j(0L);
                this.P1 = -3;
            }
            invalidate();
        }
        j(0L);
        invalidate();
    }

    public final void j(long j) {
        if (j <= 0) {
            this.f24660p = "00:00:00";
            return;
        }
        long j6 = 86400;
        int i5 = (int) (j / j6);
        long j10 = 3600;
        int i10 = (int) ((j % j6) / j10);
        if (i5 > 0) {
            i10 += i5 * 24;
        }
        if (i10 > 99) {
            this.f24660p = "99:59:59";
            return;
        }
        long j11 = j % j10;
        long j12 = 60;
        int i11 = (int) (j11 / j12);
        int i12 = (int) (j % j12);
        char y5 = y4.a.y(i10);
        StringBuilder sb2 = this.f24657o;
        sb2.setCharAt(0, y5);
        sb2.setCharAt(1, y4.a.z(i10));
        sb2.setCharAt(3, y4.a.y(i11));
        sb2.setCharAt(4, y4.a.z(i11));
        sb2.setCharAt(6, y4.a.y(i12));
        sb2.setCharAt(7, y4.a.z(i12));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.f24660p = sb3;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() > 0 && getHeight() > 0) {
            d(getWidth(), getHeight());
        }
        if (this.f24626a1 == null) {
            f();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        if (this.R1) {
            eg.c0.h(this.Q1.f18494a);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f24641h1;
        if (rectF.isEmpty()) {
            return;
        }
        Path path = this.f24638g1;
        int save = canvas.save();
        try {
            if (!path.isEmpty() && (bitmap = this.f24640h0) != null) {
                save = canvas.save();
                canvas.clipPath(path);
                try {
                    if (!bitmap.isRecycled()) {
                        canvas.drawBitmap(bitmap, this.f24643i0, this.k0);
                    }
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            float f6 = this.F0;
            canvas.drawRoundRect(rectF, f6, f6, this.j0);
            int i5 = this.P1;
            RectF rectF2 = this.s1;
            Paint paint = this.f24649l0;
            if (-1 <= i5 && i5 < 2) {
                RectF rectF3 = this.f24650l1;
                float f10 = this.G0;
                canvas.drawRoundRect(rectF3, f10, f10, paint);
                float f11 = this.G0;
                canvas.drawRoundRect(rectF2, f11, f11, paint);
            } else if (i5 == -2) {
                RectF rectF4 = this.f24672t1;
                float f12 = this.H0;
                canvas.drawRoundRect(rectF4, f12, f12, this.f24652m0);
                RectF rectF5 = this.f24675u1;
                float f13 = this.G0;
                canvas.drawRoundRect(rectF5, f13, f13, paint);
            } else {
                float f14 = this.G0;
                canvas.drawRoundRect(rectF2, f14, f14, paint);
            }
            canvas.restoreToCount(save);
            RippleDrawable rippleDrawable = this.f24626a1;
            if (rippleDrawable != null) {
                rippleDrawable.draw(canvas);
            }
            StaticLayout staticLayout = this.A1;
            if (staticLayout != null) {
                RectF rectF6 = this.f24644i1;
                if (!rectF6.isEmpty()) {
                    save = canvas.save();
                    try {
                        canvas.translate(rectF6.left, rectF6.top);
                        staticLayout.draw(canvas);
                        canvas.restoreToCount(save);
                    } finally {
                    }
                }
            }
            StaticLayout staticLayout2 = this.D1;
            if (staticLayout2 != null) {
                RectF rectF7 = this.f24645j1;
                if (!rectF7.isEmpty()) {
                    save = canvas.save();
                    try {
                        canvas.translate(rectF7.left, rectF7.top);
                        staticLayout2.draw(canvas);
                        canvas.restoreToCount(save);
                    } finally {
                    }
                }
            }
            StaticLayout staticLayout3 = this.E1;
            if (staticLayout3 != null) {
                RectF rectF8 = this.f24647k1;
                if (!rectF8.isEmpty()) {
                    save = canvas.save();
                    try {
                        canvas.translate(rectF8.left, rectF8.top);
                        staticLayout3.draw(canvas);
                        canvas.restoreToCount(save);
                    } finally {
                    }
                }
            }
            int i10 = this.P1;
            if (-1 <= i10 && i10 < 2) {
                StaticLayout staticLayout4 = this.f24688z1;
                if (staticLayout4 != null) {
                    RectF rectF9 = this.f24653m1;
                    if (!rectF9.isEmpty()) {
                        save = canvas.save();
                        try {
                            canvas.translate(rectF9.left, rectF9.top);
                            staticLayout4.draw(canvas);
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                }
                StaticLayout staticLayout5 = this.f24683x1;
                if (staticLayout5 != null) {
                    RectF rectF10 = this.f24659o1;
                    if (!rectF10.isEmpty()) {
                        save = canvas.save();
                        try {
                            canvas.translate(rectF10.left, rectF10.top);
                            staticLayout5.draw(canvas);
                        } finally {
                        }
                    }
                }
            } else if (i10 == -2) {
                StaticLayout staticLayout6 = this.f24686y1;
                if (staticLayout6 != null) {
                    RectF rectF11 = this.f24678v1;
                    if (!rectF11.isEmpty()) {
                        save = canvas.save();
                        try {
                            canvas.translate(rectF11.left, rectF11.top);
                            staticLayout6.draw(canvas);
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                }
                String str = this.f24660p;
                RectF rectF12 = this.f24667r1;
                canvas.drawText(str, rectF12.left, rectF12.top, this.f24671t0);
            } else {
                StaticLayout staticLayout7 = this.f24681w1;
                if (staticLayout7 != null) {
                    RectF rectF13 = this.f24656n1;
                    if (!rectF13.isEmpty()) {
                        save = canvas.save();
                        try {
                            canvas.translate(rectF13.left, rectF13.top);
                            staticLayout7.draw(canvas);
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                }
            }
            StaticLayout staticLayout8 = this.B1;
            if (staticLayout8 != null) {
                RectF rectF14 = this.f24662p1;
                if (!rectF14.isEmpty()) {
                    save = canvas.save();
                    try {
                        canvas.translate(rectF14.left, rectF14.top);
                        staticLayout8.draw(canvas);
                    } finally {
                    }
                }
            }
            StaticLayout staticLayout9 = this.C1;
            if (staticLayout9 != null) {
                RectF rectF15 = this.f24664q1;
                if (rectF15.isEmpty()) {
                    return;
                }
                save = canvas.save();
                try {
                    canvas.translate(rectF15.left, rectF15.top);
                    staticLayout9.draw(canvas);
                } finally {
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = getPaddingEnd() + getPaddingStart() + (this.F * 2.0f) + (this.H * 2.0f);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        float f6 = size - paddingEnd;
        int i11 = (int) (f6 < 0.0f ? 0.0f : f6);
        StaticLayout g10 = g(this.f24651m, i11, this.f24658o0, true, false);
        StaticLayout g11 = g(this.f24654n, i11, this.f24661p0, true, false);
        int width = g10 != null ? g10.getWidth() : 0;
        int width2 = g11 != null ? g11.getWidth() : 0;
        int height = g10 != null ? g10.getHeight() : 0;
        int height2 = g11 != null ? g11.getHeight() : 0;
        float max = Math.max(width, width2);
        float f10 = f6 - max;
        StaticLayout h10 = h(this.f24677v0, (int) (f10 >= 0.0f ? f10 : 0.0f), this.f24655n0, 24);
        int width3 = h10 != null ? h10.getWidth() : 0;
        this.L = (this.I * 2.0f) + (g("В ожидании", (int) this.f24637g0, this.f24663q0, true, true) != null ? r9.getHeight() : 0);
        int max2 = (int) Math.max(width3 + paddingEnd + max, (this.K * 2.0f) + this.f24637g0 + 0);
        int max3 = (int) (Math.max(this.F + (h10 != null ? h10.getHeight() : 0), height + height2 + this.G) + paddingBottom + this.J + this.K + this.L + this.G1);
        if (mode == Integer.MIN_VALUE) {
            float f11 = max2;
            float f12 = this.f24625a;
            if (f11 < f12) {
                max2 = (int) f12;
            }
            size = Math.min(max2, size);
        } else if (mode != 1073741824) {
            float f13 = max2;
            float f14 = this.f24625a;
            size = f13 < f14 ? (int) f14 : max2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            float f15 = max3;
            float f16 = this.f24625a;
            if (f15 < f16) {
                max3 = (int) f16;
            }
            size2 = Math.min(max3, size2);
        } else if (mode2 != 1073741824) {
            float f17 = max3;
            float f18 = this.f24625a;
            size2 = f17 < f18 ? (int) f18 : max3;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        d(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.j0;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.O1;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
            invalidate();
            return;
        }
        d(i5, i10);
        LinearGradient linearGradient2 = this.O1;
        if (linearGradient2 != null) {
            paint.setShader(linearGradient2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.f24641h1;
        if (action == 0) {
            if (!rectF.isEmpty()) {
                float f6 = rectF.left;
                float f10 = rectF.right;
                float x10 = event.getX();
                if (f6 <= x10 && x10 <= f10) {
                    float f11 = rectF.top;
                    float f12 = rectF.bottom;
                    float y5 = event.getY();
                    if (f11 <= y5 && y5 <= f12) {
                        setPressed(true);
                        RippleDrawable rippleDrawable = this.f24626a1;
                        if (rippleDrawable != null) {
                            rippleDrawable.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable2 = this.f24626a1;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setState(this.N1);
                        }
                        invalidate();
                        return true;
                    }
                }
            }
            return false;
        }
        if (action != 1 && action != 3) {
            return super.onTouchEvent(event);
        }
        setPressed(false);
        RippleDrawable rippleDrawable3 = this.f24626a1;
        if (rippleDrawable3 != null) {
            rippleDrawable3.setState(this.M1);
        }
        invalidate();
        if (event.getAction() == 1 && !rectF.isEmpty()) {
            float f13 = rectF.left;
            float f14 = rectF.right;
            float x11 = event.getX();
            if (f13 <= x11 && x11 <= f14) {
                float f15 = rectF.top;
                float f16 = rectF.bottom;
                float y10 = event.getY();
                if (f15 <= y10 && y10 <= f16) {
                    super.performClick();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setBitmap(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.f24640h0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 100.0f && height > 100.0f) {
            RectF rectF = this.f24641h1;
            float abs = Math.abs(rectF.right - rectF.left);
            float abs2 = Math.abs(rectF.bottom - rectF.top);
            float max = Math.max(abs / width, abs2 / height);
            float f6 = abs - (width * max);
            float f10 = 2;
            float f11 = (abs2 - (height * max)) / f10;
            Matrix matrix = this.f24643i0;
            matrix.setScale(max, max);
            matrix.postTranslate(f6 / f10, f11);
            if (!bitmap.isRecycled()) {
                this.f24640h0 = bitmap;
            }
        }
        invalidate();
    }
}
