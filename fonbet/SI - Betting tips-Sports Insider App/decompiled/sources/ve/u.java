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
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u extends View implements v {
    public final float A;
    public Bitmap A0;
    public final RectF A1;
    public final float B;
    public Bitmap B0;
    public final RectF B1;
    public final float C;
    public Bitmap C0;
    public final RectF C1;
    public final float D;
    public final Matrix D0;
    public final RectF D1;
    public final float E;
    public final Matrix E0;
    public final RectF E1;
    public final float F;
    public final Matrix F0;
    public final RectF F1;
    public final float G;
    public final Paint G0;
    public StaticLayout G1;
    public final float H;
    public final Paint H0;
    public StaticLayout H1;
    public final float I;
    public final Paint I0;
    public StaticLayout I1;
    public final float J;
    public final TextPaint J0;
    public StaticLayout J1;
    public final float K;
    public final TextPaint K0;
    public StaticLayout K1;
    public final float L;
    public final TextPaint L0;
    public StaticLayout L1;
    public final TextPaint M0;
    public StaticLayout M1;
    public final TextPaint N0;
    public StaticLayout N1;
    public final TextPaint O0;
    public StaticLayout O1;
    public final Paint P0;
    public final float P1;
    public final TextPaint Q0;
    public final float Q1;
    public final TextPaint R0;
    public final float R1;
    public final TextPaint S0;
    public final DisplayMetrics S1;
    public String T0;
    public final float[] T1;
    public String U0;
    public final int[] U1;
    public String V0;
    public final int[] V1;
    public String W0;
    public final int[] W1;
    public final float X0;
    public final int[] X1;
    public final float Y0;
    public final int[] Y1;
    public final float Z0;
    public LinearGradient Z1;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f24838a;

    /* renamed from: a1, reason: collision with root package name */
    public final float f24839a1;

    /* renamed from: a2, reason: collision with root package name */
    public LinearGradient f24840a2;

    /* renamed from: b, reason: collision with root package name */
    public final float f24841b;

    /* renamed from: b1, reason: collision with root package name */
    public final float f24842b1;

    /* renamed from: b2, reason: collision with root package name */
    public final jg.d f24843b2;

    /* renamed from: c, reason: collision with root package name */
    public final float f24844c;

    /* renamed from: c1, reason: collision with root package name */
    public final float f24845c1;
    public boolean c2;

    /* renamed from: d, reason: collision with root package name */
    public final float f24846d;
    public final float d1;

    /* renamed from: d2, reason: collision with root package name */
    public String f24847d2;

    /* renamed from: e, reason: collision with root package name */
    public final float f24848e;

    /* renamed from: e1, reason: collision with root package name */
    public final float f24849e1;

    /* renamed from: e2, reason: collision with root package name */
    public int f24850e2;

    /* renamed from: f, reason: collision with root package name */
    public final float f24851f;

    /* renamed from: f1, reason: collision with root package name */
    public Typeface f24852f1;

    /* renamed from: f2, reason: collision with root package name */
    public String f24853f2;

    /* renamed from: g, reason: collision with root package name */
    public final float f24854g;

    /* renamed from: g0, reason: collision with root package name */
    public final float f24855g0;

    /* renamed from: g1, reason: collision with root package name */
    public Typeface f24856g1;

    /* renamed from: g2, reason: collision with root package name */
    public String f24857g2;

    /* renamed from: h, reason: collision with root package name */
    public final float f24858h;

    /* renamed from: h0, reason: collision with root package name */
    public final float f24859h0;

    /* renamed from: h1, reason: collision with root package name */
    public final float f24860h1;

    /* renamed from: h2, reason: collision with root package name */
    public String f24861h2;

    /* renamed from: i, reason: collision with root package name */
    public final float f24862i;

    /* renamed from: i0, reason: collision with root package name */
    public final float f24863i0;

    /* renamed from: i1, reason: collision with root package name */
    public RippleDrawable f24864i1;

    /* renamed from: i2, reason: collision with root package name */
    public String f24865i2;
    public final float j;
    public final float j0;

    /* renamed from: j1, reason: collision with root package name */
    public final int f24866j1;

    /* renamed from: k, reason: collision with root package name */
    public float f24867k;
    public final float k0;

    /* renamed from: k1, reason: collision with root package name */
    public final int f24868k1;

    /* renamed from: l, reason: collision with root package name */
    public final float f24869l;

    /* renamed from: l0, reason: collision with root package name */
    public final float f24870l0;

    /* renamed from: l1, reason: collision with root package name */
    public final int f24871l1;

    /* renamed from: m, reason: collision with root package name */
    public final float f24872m;

    /* renamed from: m0, reason: collision with root package name */
    public final float f24873m0;

    /* renamed from: m1, reason: collision with root package name */
    public final int f24874m1;

    /* renamed from: n, reason: collision with root package name */
    public final float f24875n;

    /* renamed from: n0, reason: collision with root package name */
    public final float f24876n0;

    /* renamed from: n1, reason: collision with root package name */
    public final Path f24877n1;

    /* renamed from: o, reason: collision with root package name */
    public final float f24878o;

    /* renamed from: o0, reason: collision with root package name */
    public final float f24879o0;

    /* renamed from: o1, reason: collision with root package name */
    public final Path f24880o1;

    /* renamed from: p, reason: collision with root package name */
    public final float f24881p;

    /* renamed from: p0, reason: collision with root package name */
    public final float f24882p0;

    /* renamed from: p1, reason: collision with root package name */
    public final RectF f24883p1;
    public final float q;

    /* renamed from: q0, reason: collision with root package name */
    public final float f24884q0;

    /* renamed from: q1, reason: collision with root package name */
    public final RectF f24885q1;

    /* renamed from: r, reason: collision with root package name */
    public final float f24886r;

    /* renamed from: r0, reason: collision with root package name */
    public final float f24887r0;

    /* renamed from: r1, reason: collision with root package name */
    public final RectF f24888r1;

    /* renamed from: s, reason: collision with root package name */
    public final float f24889s;

    /* renamed from: s0, reason: collision with root package name */
    public String f24890s0;
    public final RectF s1;

    /* renamed from: t, reason: collision with root package name */
    public final float f24891t;

    /* renamed from: t0, reason: collision with root package name */
    public String f24892t0;

    /* renamed from: t1, reason: collision with root package name */
    public final RectF f24893t1;

    /* renamed from: u, reason: collision with root package name */
    public final float f24894u;

    /* renamed from: u0, reason: collision with root package name */
    public final StringBuilder f24895u0;

    /* renamed from: u1, reason: collision with root package name */
    public final RectF f24896u1;

    /* renamed from: v, reason: collision with root package name */
    public final float f24897v;

    /* renamed from: v0, reason: collision with root package name */
    public String f24898v0;

    /* renamed from: v1, reason: collision with root package name */
    public final RectF f24899v1;

    /* renamed from: w, reason: collision with root package name */
    public final float f24900w;

    /* renamed from: w0, reason: collision with root package name */
    public final float f24901w0;

    /* renamed from: w1, reason: collision with root package name */
    public final RectF f24902w1;

    /* renamed from: x, reason: collision with root package name */
    public final float f24903x;
    public final float x0;

    /* renamed from: x1, reason: collision with root package name */
    public final RectF f24904x1;

    /* renamed from: y, reason: collision with root package name */
    public final float f24905y;

    /* renamed from: y0, reason: collision with root package name */
    public final float f24906y0;

    /* renamed from: y1, reason: collision with root package name */
    public final RectF f24907y1;

    /* renamed from: z, reason: collision with root package name */
    public final float f24908z;
    public final float z0;

    /* renamed from: z1, reason: collision with root package name */
    public final RectF f24909z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24838a = new ArrayList();
        this.f24841b = 200.0f;
        this.f24844c = 165.0f;
        this.f24846d = 96.0f;
        this.f24848e = 60.0f;
        this.f24851f = 15.0f;
        this.f24854g = 15.0f;
        this.f24858h = 18.0f;
        this.f24862i = 165.0f;
        this.j = 96.0f;
        this.f24869l = 15.0f;
        this.f24872m = 15.0f;
        this.f24875n = 15.0f;
        this.f24878o = 15.0f;
        this.f24881p = 20.0f;
        this.q = 5.0f;
        this.f24886r = 16.0f;
        this.f24889s = 6.0f;
        this.f24891t = 23.0f;
        this.f24894u = 16.0f;
        this.f24897v = 6.0f;
        this.f24900w = 23.0f;
        this.f24903x = 10.0f;
        this.f24905y = 23.0f;
        this.f24908z = 130.0f;
        this.A = 96.0f;
        this.B = 13.0f;
        this.C = 16.0f;
        this.D = 15.0f;
        this.E = 2.0f;
        this.F = 72.0f;
        this.G = 96.0f;
        this.H = 13.0f;
        this.I = 16.0f;
        this.J = 15.0f;
        this.K = 2.0f;
        this.L = 72.0f;
        this.f24855g0 = 10.0f;
        this.f24859h0 = 23.0f;
        this.f24863i0 = 130.0f;
        this.j0 = 10.0f;
        this.k0 = 20.0f;
        this.f24870l0 = 30.0f;
        this.f24873m0 = 22.0f;
        this.f24876n0 = 11.0f;
        this.f24879o0 = 14.0f;
        this.f24882p0 = 16.0f;
        this.f24884q0 = 16.0f;
        this.f24887r0 = 1.0f;
        this.f24890s0 = "__.__";
        this.f24892t0 = "--:--";
        this.f24895u0 = new StringBuilder(8);
        this.f24898v0 = "00:00:00";
        this.f24901w0 = 18.0f;
        this.x0 = 20.0f;
        this.f24906y0 = 18.0f;
        this.z0 = 20.0f;
        this.D0 = new Matrix();
        this.E0 = new Matrix();
        this.F0 = new Matrix();
        this.G0 = new Paint(1);
        this.H0 = new Paint(1);
        this.I0 = new Paint(1);
        this.J0 = new TextPaint(1);
        this.K0 = new TextPaint(1);
        this.L0 = new TextPaint(1);
        this.M0 = new TextPaint(1);
        this.N0 = new TextPaint(1);
        this.O0 = new TextPaint(1);
        this.P0 = new Paint(1);
        this.Q0 = new TextPaint(1);
        this.R0 = new TextPaint(1);
        this.S0 = new TextPaint(1);
        this.T0 = "Our forecast";
        this.U0 = "Odds";
        this.V0 = "Odds: -";
        this.W0 = "Bla bla care";
        this.X0 = 20.0f;
        this.Y0 = 10.0f;
        this.Z0 = 30.0f;
        this.f24839a1 = 22.0f;
        this.f24842b1 = 11.0f;
        this.f24845c1 = 14.0f;
        this.d1 = 16.0f;
        this.f24849e1 = 16.0f;
        this.f24860h1 = 1.0f;
        this.f24877n1 = new Path();
        this.f24880o1 = new Path();
        this.f24883p1 = new RectF();
        this.f24885q1 = new RectF();
        this.f24888r1 = new RectF();
        this.s1 = new RectF();
        this.f24893t1 = new RectF();
        this.f24896u1 = new RectF();
        this.f24899v1 = new RectF();
        this.f24902w1 = new RectF();
        this.f24904x1 = new RectF();
        this.f24907y1 = new RectF();
        this.f24909z1 = new RectF();
        this.A1 = new RectF();
        this.B1 = new RectF();
        this.C1 = new RectF();
        this.D1 = new RectF();
        this.E1 = new RectF();
        this.F1 = new RectF();
        this.P1 = 1.0f;
        this.Q1 = 60.0f;
        this.R1 = 20.0f;
        this.T1 = new float[8];
        int[] iArr = new int[2];
        for (int i5 = 0; i5 < 2; i5++) {
            iArr[i5] = -1;
        }
        this.U1 = iArr;
        int[] iArr2 = new int[2];
        for (int i10 = 0; i10 < 2; i10++) {
            iArr2[i10] = -1;
        }
        this.V1 = iArr2;
        this.W1 = new int[0];
        this.X1 = new int[]{R.attr.state_enabled};
        int[] iArr3 = new int[2];
        int i11 = 0;
        while (i11 < 2) {
            iArr3[i11] = i11 == 0 ? R.attr.state_pressed : 16842910;
            i11++;
        }
        this.Y1 = iArr3;
        lg.e eVar = eg.m0.f9201a;
        this.f24843b2 = eg.c0.b(jg.q.f18523a);
        this.f24850e2 = -1;
        this.f24853f2 = "";
        this.f24857g2 = "";
        this.f24861h2 = "";
        this.f24865i2 = "";
        TextPaint textPaint = this.R0;
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.S1 = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        f6 = f6 <= 0.0f ? this.f24887r0 : f6;
        this.f24860h1 = f6;
        this.f24848e = f6 * 60.0f;
        float f10 = f6 * 15.0f;
        this.f24851f = f10;
        this.f24854g = f10;
        this.f24858h = f6 * 18.0f;
        this.f24869l = f10;
        this.f24872m = f10;
        this.f24875n = f10;
        this.f24878o = f10;
        this.f24881p = f6 * 20.0f;
        this.q = 5.0f * f6;
        this.f24862i = this.f24844c * f6;
        this.j = this.f24846d * f6;
        this.G = this.A * f6;
        this.X0 = this.k0 * f6;
        this.Y0 = this.j0 * f6;
        DisplayMetrics displayMetrics3 = this.S1;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        this.Z0 = androidx.core.view.h0.l(displayMetrics3, this.f24870l0);
        DisplayMetrics displayMetrics4 = this.S1;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        this.f24839a1 = androidx.core.view.h0.l(displayMetrics4, this.f24873m0);
        DisplayMetrics displayMetrics5 = this.S1;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        this.f24842b1 = androidx.core.view.h0.l(displayMetrics5, this.f24876n0);
        DisplayMetrics displayMetrics6 = this.S1;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics6 = null;
        }
        this.f24845c1 = androidx.core.view.h0.l(displayMetrics6, this.f24879o0);
        DisplayMetrics displayMetrics7 = this.S1;
        if (displayMetrics7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics7 = null;
        }
        this.d1 = androidx.core.view.h0.l(displayMetrics7, this.f24882p0);
        DisplayMetrics displayMetrics8 = this.S1;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics8;
        }
        this.f24849e1 = androidx.core.view.h0.l(displayMetrics2, this.f24884q0);
        float f11 = this.f24901w0;
        float f12 = this.f24860h1;
        this.f24906y0 = f11 * f12;
        this.z0 = this.x0 * f12;
        this.H = this.B * f12;
        this.I = this.C * f12;
        this.J = this.D * f12;
        this.K = this.E * f12;
        this.L = this.F * f12;
        this.f24859h0 = this.f24905y * f12;
        this.f24863i0 = this.f24908z * f12;
        this.f24855g0 = this.f24903x * f12;
        this.f24894u = this.f24886r * f12;
        this.f24897v = this.f24889s * f12;
        this.f24900w = this.f24891t * f12;
        this.f24841b *= f12;
        this.P1 = f12 * 1.0f;
        this.Q1 = f12 * 60.0f;
        this.f24866j1 = Color.parseColor("#D9000000");
        this.f24868k1 = Color.parseColor("#D903F39E");
        this.f24871l1 = Color.parseColor("#40007E");
        int parseColor = Color.parseColor("#03F39E");
        this.f24874m1 = parseColor;
        int[] iArr4 = this.U1;
        iArr4[0] = this.f24866j1;
        iArr4[1] = this.f24868k1;
        int[] iArr5 = this.V1;
        iArr5[0] = this.f24871l1;
        iArr5[1] = parseColor;
        float[] fArr = this.T1;
        float f13 = this.Y0;
        fArr[0] = f13;
        fArr[1] = f13;
        fArr[2] = f13;
        fArr[3] = f13;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        TextPaint textPaint2 = this.J0;
        Typeface typeface = Typeface.DEFAULT;
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(-1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.Z0);
        TextPaint textPaint3 = this.K0;
        Typeface typeface2 = Typeface.DEFAULT_BOLD;
        textPaint3.setTypeface(typeface2);
        textPaint3.setColor(-1);
        textPaint3.setStyle(style);
        textPaint3.setTextSize(this.Z0);
        TextPaint textPaint4 = this.L0;
        textPaint4.setTypeface(typeface);
        textPaint4.setColor(-1);
        textPaint4.setStyle(style);
        textPaint4.setTextSize(this.f24839a1);
        TextPaint textPaint5 = this.M0;
        textPaint5.setTypeface(typeface);
        textPaint5.setColor(-1);
        textPaint5.setStyle(style);
        textPaint5.setTextSize(this.f24839a1);
        TextPaint textPaint6 = this.N0;
        textPaint6.setTypeface(typeface);
        textPaint6.setColor(-1);
        textPaint6.setAlpha(179);
        textPaint6.setStyle(style);
        textPaint6.setTextSize(this.f24839a1);
        TextPaint textPaint7 = this.O0;
        textPaint7.setTypeface(typeface2);
        textPaint7.setColor(-1);
        textPaint7.setStyle(style);
        textPaint7.setTextSize(this.f24842b1);
        TextPaint textPaint8 = this.Q0;
        textPaint8.setTypeface(typeface);
        textPaint8.setColor(-1);
        textPaint8.setAlpha(179);
        textPaint8.setStyle(style);
        textPaint8.setTextSize(this.d1);
        textPaint.setTypeface(typeface2);
        textPaint.setColor(-1);
        textPaint.setStyle(style);
        textPaint.setTextSize(this.f24845c1);
        TextPaint textPaint9 = this.S0;
        textPaint9.setTypeface(typeface2);
        textPaint9.setColor(-1);
        textPaint9.setStyle(style);
        textPaint9.setTextSize(this.f24849e1);
        Paint paint = this.G0;
        Paint.Style style2 = Paint.Style.FILL;
        paint.setStyle(style2);
        paint.setColor(this.f24874m1);
        paint.setDither(true);
        this.H0.setFilterBitmap(true);
        Paint paint2 = this.P0;
        paint2.setStyle(style2);
        paint2.setColor(this.f24874m1);
        paint2.setDither(true);
        Paint paint3 = this.I0;
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        paint3.setStrokeWidth(this.P1);
        this.D0.setScale(1.0f, 1.0f);
        this.E0.setScale(1.0f, 1.0f);
        this.F0.setScale(1.0f, 1.0f);
        this.f24895u0.append("00:00:00");
        this.Q1 = textPaint.measureText("00:00:00");
        this.R1 = textPaint.descent() - textPaint.ascent();
        h();
    }

    public static StringBuilder g(int i5, Integer num) {
        StringBuilder sb2 = new StringBuilder("");
        if (num == null) {
            sb2.append(i5);
            return sb2;
        }
        sb2.append(i5);
        sb2.append("(");
        sb2.append(num.intValue());
        sb2.append(")");
        return sb2;
    }

    public static StaticLayout i(CharSequence charSequence, int i5, TextPaint textPaint, boolean z5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        int min = Math.min(i5, (int) textPaint.measureText(charSequence.toString()));
        StaticLayout.Builder includePad = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, min).setEllipsizedWidth(min).setEllipsize(TextUtils.TruncateAt.END).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true);
        if (z5) {
            includePad.setMaxLines(1);
        }
        return includePad.setLineSpacing(0.0f, 1.0f).build();
    }

    public static StaticLayout j(CharSequence charSequence, TextPaint textPaint, int i5) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(charSequence.toString()))).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
    }

    public static StaticLayout k(TextPaint textPaint, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence)) {
            return null;
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) textPaint.measureText(charSequence.toString())).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimBoldTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f24856g1, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f24856g1 = typeface;
            this.K0.setTypeface(typeface);
            this.R0.setTypeface(this.f24856g1);
            this.O0.setTypeface(this.f24856g1);
            this.S0.setTypeface(this.f24856g1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setArimoRegularTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f24852f1, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            this.f24852f1 = typeface;
            this.J0.setTypeface(typeface);
            this.L0.setTypeface(this.f24852f1);
            this.M0.setTypeface(this.f24852f1);
            this.N0.setTypeface(this.f24852f1);
            this.Q0.setTypeface(this.f24852f1);
        }
    }

    @Override // ve.v
    public final void a(String str) {
        Iterator it = this.f24838a.iterator();
        while (it.hasNext()) {
            ((v) it.next()).a(str);
        }
    }

    public final void d() {
        this.f24883p1.setEmpty();
        this.f24880o1.reset();
        setPressed(false);
        RippleDrawable rippleDrawable = this.f24864i1;
        if (rippleDrawable != null) {
            rippleDrawable.setState(this.W1);
        }
        this.f24909z1.setEmpty();
        this.A1.setEmpty();
        this.B1.setEmpty();
        this.E1.setEmpty();
        this.F1.setEmpty();
        this.G1 = null;
        this.C1.setEmpty();
        this.N1 = null;
        this.D1.setEmpty();
        this.O1 = null;
        this.f24893t1.setEmpty();
        this.H1 = null;
        this.f24896u1.setEmpty();
        this.I1 = null;
        this.f24885q1.setEmpty();
        this.f24888r1.setEmpty();
        this.s1.setEmpty();
        this.f24899v1.setEmpty();
        this.J1 = null;
        this.f24902w1.setEmpty();
        this.L1 = null;
        this.f24904x1.setEmpty();
        this.K1 = null;
        this.f24907y1.setEmpty();
        this.M1 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0427 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(int i5, int i10) {
        float f6;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        int i12;
        boolean z5;
        StaticLayout i13;
        StaticLayout i14;
        StaticLayout i15;
        float f16;
        int i16;
        float f17;
        int i17;
        float f18;
        int i18;
        float f19;
        int i19;
        float f20;
        RectF rectF;
        float f21;
        RectF rectF2;
        RectF rectF3;
        float f22;
        RectF rectF4;
        float f23;
        float f24;
        RectF rectF5;
        int i20;
        float f25;
        float abs;
        float f26;
        int i21;
        int i22;
        float f27;
        float f28;
        RectF rectF6;
        RectF rectF7;
        Path path;
        RectF rectF8;
        if (i5 <= 0 || i10 <= 0) {
            d();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float abs2 = Math.abs(paddingEnd - paddingStart);
        float abs3 = Math.abs(((i10 - getPaddingBottom()) + 0.0f) - paddingTop);
        float f29 = (abs3 / 2.0f) + paddingTop;
        if (abs3 <= 0.0f || abs2 <= 0.0f) {
            d();
            return;
        }
        int i23 = (int) (abs2 - (this.z0 * 2.0f));
        StaticLayout i24 = i(this.f24890s0, i23, this.J0, true);
        StaticLayout i25 = i(this.f24892t0, i23, this.K0, true);
        int height = i24 != null ? i24.getHeight() : 0;
        int height2 = i25 != null ? i25.getHeight() : 0;
        int width = i24 != null ? i24.getWidth() : 0;
        int width2 = i25 != null ? i25.getWidth() : 0;
        float f30 = 0.0f;
        int max = Math.max(width, width2);
        float f31 = this.f24906y0 + paddingTop;
        float f32 = this.z0;
        float f33 = paddingEnd - f32;
        float f34 = height + f31;
        float f35 = height2 + f34;
        float f36 = f33 - max;
        if (width > width2) {
            float f37 = (width - width2) / 2.0f;
            f12 = f33 - f37;
            f6 = f36 + f37;
            f11 = f33;
            f10 = f36;
        } else if (width < width2) {
            float f38 = (width2 - width) / 2.0f;
            f10 = f36 + f38;
            f11 = f33 - f38;
            f12 = f33;
            f6 = f36;
        } else {
            f6 = f36;
            f10 = f6;
            f11 = f33;
            f12 = f11;
        }
        float f39 = f36 - f32;
        float f40 = this.f24854g + paddingStart;
        float f41 = this.f24858h + paddingTop;
        float f42 = this.f24848e;
        float f43 = f41 + f42;
        float f44 = f39 - f40;
        float f45 = f43 - f41;
        RectF rectF9 = this.s1;
        RectF rectF10 = this.f24888r1;
        RectF rectF11 = this.f24885q1;
        if (f44 > 10.0f && f45 > 10.0f) {
            f13 = paddingStart;
            float f46 = this.f24851f;
            if ((f42 * 2.0f) + f46 <= f44) {
                float f47 = f40 + f42;
                f14 = paddingEnd;
                float f48 = f47 + f46;
                f15 = f6;
                float f49 = f48 + f42;
                rectF11.set(f40, f41, f49, f43);
                rectF10.set(f40, f41, f47, f43);
                rectF9.set(f48, f41, f49, f43);
            } else {
                f14 = paddingEnd;
                f15 = f6;
                float f50 = f44 / 9.0f;
                float f51 = 4.0f * f50;
                if (f51 <= 10.0f) {
                    rectF11.setEmpty();
                    rectF10.setEmpty();
                    rectF9.setEmpty();
                } else {
                    float f52 = f40 + f51;
                    float f53 = f41 + f51;
                    float f54 = f52 + f50;
                    float f55 = f51 + f54;
                    float f56 = f53 - f41;
                    if (f55 - f40 <= 10.0f || f56 <= 10.0f) {
                        rectF11.setEmpty();
                        rectF10.setEmpty();
                        rectF9.setEmpty();
                    } else {
                        rectF11.set(f40, f41, f55, f53);
                        rectF10.set(f40, f41, f52, f53);
                        rectF9.set(f54, f41, f55, f53);
                        f43 = f53;
                    }
                }
            }
            this.H1 = i24;
            this.I1 = i25;
            float max2 = Math.max(f43 + this.f24858h, f35);
            i11 = this.f24850e2;
            TextPaint textPaint = this.M0;
            TextPaint textPaint2 = this.N0;
            TextPaint textPaint3 = i11 != 1 ? textPaint2 : textPaint;
            if (i11 == 0) {
                textPaint = textPaint2;
            }
            i12 = (int) (abs2 - ((this.f24872m + this.f24875n) + this.f24881p));
            if (i12 >= 5) {
                i13 = null;
                z5 = true;
            } else {
                z5 = true;
                i13 = i(this.f24853f2, i12, textPaint3, true);
            }
            StaticLayout i26 = i12 >= 5 ? null : i(this.f24857g2, i12, textPaint, z5);
            i14 = i12 >= 5 ? null : i(this.f24861h2, i12, textPaint3, z5);
            i15 = i12 >= 5 ? null : i(this.f24865i2, i12, textPaint, z5);
            int max3 = Math.max(i13 == null ? i13.getHeight() : 0, i14 == null ? i14.getHeight() : 0);
            int max4 = Math.max(i26 == null ? i26.getHeight() : 0, i15 == null ? i15.getHeight() : 0);
            float f57 = this.f24869l + max2;
            float f58 = max3;
            float f59 = f57 + f58 + this.q + max4 + this.f24878o;
            float f60 = f13 + this.f24872m;
            float f61 = f14 - (this.f24875n + this.f24881p);
            float height3 = (i13 == null ? i13.getHeight() : 0) + f57;
            float f62 = (f59 - this.f24878o) - f58;
            float height4 = (i26 == null ? i26.getHeight() : 0) + f62;
            float f63 = f14 - this.f24875n;
            if (i14 == null) {
                f16 = f31;
                i16 = i14.getWidth();
            } else {
                f16 = f31;
                i16 = 0;
            }
            float f64 = f63 - i16;
            if (i14 == null) {
                f17 = f34;
                i17 = i14.getHeight();
            } else {
                f17 = f34;
                i17 = 0;
            }
            float f65 = i17 + f57;
            if (i15 == null) {
                f18 = f10;
                i18 = i15.getWidth();
            } else {
                f18 = f10;
                i18 = 0;
            }
            float f66 = f63 - i18;
            if (i15 == null) {
                f19 = f59;
                i19 = i15.getHeight();
            } else {
                f19 = f59;
                i19 = 0;
            }
            float f67 = i19 + f62;
            f20 = f61 - f60;
            rectF = this.f24899v1;
            if (f20 > 0.0f || height3 - f57 <= 0.0f) {
                this.J1 = null;
                rectF.setEmpty();
            } else {
                this.J1 = i13;
                rectF.set(f60, f57, f61, height3);
            }
            f21 = f63 - f64;
            rectF2 = this.f24902w1;
            if (f21 > 0.0f || f65 - f57 <= 0.0f) {
                this.L1 = null;
                rectF2.setEmpty();
            } else {
                this.L1 = i14;
                rectF2.set(f64, f57, f63, f65);
            }
            rectF3 = this.f24904x1;
            if (f20 > 0.0f || height4 - f62 <= 0.0f) {
                this.K1 = null;
                rectF3.setEmpty();
            } else {
                this.K1 = i26;
                rectF3.set(f60, f62, f61, height4);
            }
            f22 = f63 - f66;
            rectF4 = this.f24907y1;
            if (f22 > 0.0f || f67 - f62 <= 0.0f) {
                this.M1 = null;
                rectF4.setEmpty();
            } else {
                this.M1 = i15;
                rectF4.set(f66, f62, f63, f67);
            }
            float max5 = Math.max(f19, max2 + this.f24867k);
            float f68 = this.G + max5;
            float f69 = f13 + this.I;
            float f70 = max5 + this.H;
            float f71 = f14 - this.J;
            float f72 = this.L + f70;
            float f73 = this.K;
            f23 = f71 - f73;
            float f74 = f73 + f70;
            f24 = f23 - this.Q1;
            float f75 = this.R1 + f74;
            rectF5 = this.f24909z1;
            if (f23 > f24 || f75 <= f74 || Intrinsics.areEqual(this.f24898v0, "00:00:00")) {
                rectF5.setEmpty();
            } else {
                rectF5.set(f24, f74, f23, f75);
            }
            StaticLayout k6 = k(this.O0, this.T0);
            int width3 = k6 == null ? k6.getWidth() : 0;
            int height5 = k6 == null ? k6.getHeight() : 0;
            float f76 = this.f24894u + f69;
            float f77 = this.K;
            float f78 = f76 + f77;
            float f79 = f70 + f77;
            float f80 = width3;
            float f81 = (this.f24897v * 2.0f) + f78 + f80;
            float f82 = this.f24900w + f79;
            float f83 = (((f81 - f78) - f80) / 2.0f) + f78;
            float f84 = f82 - f79;
            i20 = width3;
            float f85 = height5;
            float f86 = ((f84 - f85) / 2.0f) + f79;
            float f87 = f80 + f83;
            int i27 = height5;
            float f88 = f86 + f85;
            float f89 = f69 + f77;
            float f90 = this.f24859h0 + f79;
            f25 = f71 - f77;
            float f91 = f72 - f77;
            abs = f25 > f89 ? 0.0f : Math.abs(f25 - f89);
            if (abs > 0.0f) {
                f26 = f72;
            } else {
                f26 = f72;
                float f92 = (abs - (this.f24855g0 * 2.0f)) - (this.W0.length() == 0 ? 0.0f : this.f24855g0);
                if (f92 > 0.0f) {
                    i21 = (int) f92;
                    StaticLayout i28 = i(this.V0, i21, this.S0, false);
                    int width4 = i28 != null ? i28.getWidth() : 0;
                    int height6 = i28 != null ? i28.getHeight() : 0;
                    StaticLayout j = j(this.W0, this.Q0, i21 - width4);
                    this.N1 = j;
                    this.O1 = i28;
                    int width5 = j != null ? j.getWidth() : 0;
                    int height7 = j != null ? j.getHeight() : 0;
                    float f93 = this.f24855g0;
                    float f94 = f89 + f93;
                    float f95 = f91 - f90;
                    float f96 = height7;
                    float f97 = ((f95 - f96) / 2.0f) + f90;
                    float f98 = width5 + f94;
                    i22 = width5;
                    float f99 = f97 + f96;
                    float f100 = f98 + f93;
                    float f101 = f100 + width4;
                    float f102 = height6;
                    float f103 = ((f95 - f102) / 2.0f) + f90;
                    int i29 = width4;
                    float f104 = f103 + f102;
                    float f105 = (f93 * 2.0f) + i22 + i29;
                    if (i22 > 0) {
                        f30 = f93;
                    }
                    f27 = f105 + f30;
                    f28 = this.f24863i0;
                    if (f27 < f28) {
                        f27 = f28;
                    }
                    float f106 = f89 + f27;
                    float f107 = f106 >= f25 ? f25 : f106;
                    rectF6 = this.F1;
                    rectF7 = this.E1;
                    path = this.f24877n1;
                    if (i20 > 0 || i27 <= 0 || f81 <= f78 || f82 <= f79) {
                        this.G1 = null;
                        rectF7.setEmpty();
                        rectF6.setEmpty();
                        path.reset();
                    } else {
                        this.G1 = k6;
                        rectF7.set(f78, f79, f81, f82);
                        rectF6.set(f83, f86, f87, f88);
                        path.rewind();
                        path.addRoundRect(f78, f79, f81, f82, this.T1, Path.Direction.CCW);
                        float f108 = (f84 / 2.0f) + f79;
                        this.f24840a2 = new LinearGradient(f78, f108, f81, f108, this.V1, (float[]) null, Shader.TileMode.CLAMP);
                    }
                    this.C1.set(f94, f97, f98, f99);
                    this.D1.set(f100, f103, f101, f104);
                    this.B1.set(f89, f90, f107, f91);
                    this.A1.set(f69, f70, f71, f26);
                    float f109 = f17;
                    this.f24893t1.set(f18, f16, f11, f109);
                    this.f24896u1.set(f15, f109, f12, f35);
                    rectF8 = this.f24883p1;
                    float f110 = f13;
                    float f111 = f14;
                    rectF8.set(f110, paddingTop, f111, f68);
                    Path path2 = this.f24880o1;
                    path2.rewind();
                    float f112 = this.X0;
                    path2.addRoundRect(rectF8, f112, f112, Path.Direction.CW);
                    if (!rectF8.isEmpty()) {
                        int i30 = (int) rectF8.left;
                        int i31 = (int) rectF8.top;
                        int i32 = (int) rectF8.right;
                        int i33 = (int) rectF8.bottom;
                        RippleDrawable rippleDrawable = this.f24864i1;
                        if (rippleDrawable != null) {
                            rippleDrawable.setBounds(i30, i31, i32, i33);
                            rippleDrawable.setHotspotBounds(i30, i31, i32, i33);
                        }
                    }
                    this.Z1 = new LinearGradient(f110, f29, f111, f29, this.U1, (float[]) null, Shader.TileMode.CLAMP);
                    invalidate();
                }
            }
            i21 = 0;
            StaticLayout i282 = i(this.V0, i21, this.S0, false);
            if (i282 != null) {
            }
            if (i282 != null) {
            }
            StaticLayout j6 = j(this.W0, this.Q0, i21 - width4);
            this.N1 = j6;
            this.O1 = i282;
            if (j6 != null) {
            }
            if (j6 != null) {
            }
            float f932 = this.f24855g0;
            float f942 = f89 + f932;
            float f952 = f91 - f90;
            float f962 = height7;
            float f972 = ((f952 - f962) / 2.0f) + f90;
            float f982 = width5 + f942;
            i22 = width5;
            float f992 = f972 + f962;
            float f1002 = f982 + f932;
            float f1012 = f1002 + width4;
            float f1022 = height6;
            float f1032 = ((f952 - f1022) / 2.0f) + f90;
            int i292 = width4;
            float f1042 = f1032 + f1022;
            float f1052 = (f932 * 2.0f) + i22 + i292;
            if (i22 > 0) {
            }
            f27 = f1052 + f30;
            f28 = this.f24863i0;
            if (f27 < f28) {
            }
            float f1062 = f89 + f27;
            if (f1062 >= f25) {
            }
            rectF6 = this.F1;
            rectF7 = this.E1;
            path = this.f24877n1;
            if (i20 > 0) {
            }
            this.G1 = null;
            rectF7.setEmpty();
            rectF6.setEmpty();
            path.reset();
            this.C1.set(f942, f972, f982, f992);
            this.D1.set(f1002, f1032, f1012, f1042);
            this.B1.set(f89, f90, f107, f91);
            this.A1.set(f69, f70, f71, f26);
            float f1092 = f17;
            this.f24893t1.set(f18, f16, f11, f1092);
            this.f24896u1.set(f15, f1092, f12, f35);
            rectF8 = this.f24883p1;
            float f1102 = f13;
            float f1112 = f14;
            rectF8.set(f1102, paddingTop, f1112, f68);
            Path path22 = this.f24880o1;
            path22.rewind();
            float f1122 = this.X0;
            path22.addRoundRect(rectF8, f1122, f1122, Path.Direction.CW);
            if (!rectF8.isEmpty()) {
            }
            this.Z1 = new LinearGradient(f1102, f29, f1112, f29, this.U1, (float[]) null, Shader.TileMode.CLAMP);
            invalidate();
        }
        f13 = paddingStart;
        f14 = paddingEnd;
        f15 = f6;
        rectF11.setEmpty();
        rectF10.setEmpty();
        rectF9.setEmpty();
        f43 = paddingTop;
        this.H1 = i24;
        this.I1 = i25;
        float max22 = Math.max(f43 + this.f24858h, f35);
        i11 = this.f24850e2;
        TextPaint textPaint4 = this.M0;
        TextPaint textPaint22 = this.N0;
        if (i11 != 1) {
        }
        if (i11 == 0) {
        }
        i12 = (int) (abs2 - ((this.f24872m + this.f24875n) + this.f24881p));
        if (i12 >= 5) {
        }
        if (i12 >= 5) {
        }
        if (i12 >= 5) {
        }
        if (i12 >= 5) {
        }
        int max32 = Math.max(i13 == null ? i13.getHeight() : 0, i14 == null ? i14.getHeight() : 0);
        int max42 = Math.max(i26 == null ? i26.getHeight() : 0, i15 == null ? i15.getHeight() : 0);
        float f572 = this.f24869l + max22;
        float f582 = max32;
        float f592 = f572 + f582 + this.q + max42 + this.f24878o;
        float f602 = f13 + this.f24872m;
        float f612 = f14 - (this.f24875n + this.f24881p);
        float height32 = (i13 == null ? i13.getHeight() : 0) + f572;
        float f622 = (f592 - this.f24878o) - f582;
        float height42 = (i26 == null ? i26.getHeight() : 0) + f622;
        float f632 = f14 - this.f24875n;
        if (i14 == null) {
        }
        float f642 = f632 - i16;
        if (i14 == null) {
        }
        float f652 = i17 + f572;
        if (i15 == null) {
        }
        float f662 = f632 - i18;
        if (i15 == null) {
        }
        float f672 = i19 + f622;
        f20 = f612 - f602;
        rectF = this.f24899v1;
        if (f20 > 0.0f) {
        }
        this.J1 = null;
        rectF.setEmpty();
        f21 = f632 - f642;
        rectF2 = this.f24902w1;
        if (f21 > 0.0f) {
        }
        this.L1 = null;
        rectF2.setEmpty();
        rectF3 = this.f24904x1;
        if (f20 > 0.0f) {
        }
        this.K1 = null;
        rectF3.setEmpty();
        f22 = f632 - f662;
        rectF4 = this.f24907y1;
        if (f22 > 0.0f) {
        }
        this.M1 = null;
        rectF4.setEmpty();
        float max52 = Math.max(f19, max22 + this.f24867k);
        float f682 = this.G + max52;
        float f692 = f13 + this.I;
        float f702 = max52 + this.H;
        float f712 = f14 - this.J;
        float f722 = this.L + f702;
        float f732 = this.K;
        f23 = f712 - f732;
        float f742 = f732 + f702;
        f24 = f23 - this.Q1;
        float f752 = this.R1 + f742;
        rectF5 = this.f24909z1;
        if (f23 > f24) {
        }
        rectF5.setEmpty();
        StaticLayout k62 = k(this.O0, this.T0);
        if (k62 == null) {
        }
        if (k62 == null) {
        }
        float f762 = this.f24894u + f692;
        float f772 = this.K;
        float f782 = f762 + f772;
        float f792 = f702 + f772;
        float f802 = width3;
        float f812 = (this.f24897v * 2.0f) + f782 + f802;
        float f822 = this.f24900w + f792;
        float f832 = (((f812 - f782) - f802) / 2.0f) + f782;
        float f842 = f822 - f792;
        i20 = width3;
        float f852 = height5;
        float f862 = ((f842 - f852) / 2.0f) + f792;
        float f872 = f802 + f832;
        int i272 = height5;
        float f882 = f862 + f852;
        float f892 = f692 + f772;
        float f902 = this.f24859h0 + f792;
        f25 = f712 - f772;
        float f912 = f722 - f772;
        if (f25 > f892) {
        }
        if (abs > 0.0f) {
        }
        i21 = 0;
        StaticLayout i2822 = i(this.V0, i21, this.S0, false);
        if (i2822 != null) {
        }
        if (i2822 != null) {
        }
        StaticLayout j62 = j(this.W0, this.Q0, i21 - width4);
        this.N1 = j62;
        this.O1 = i2822;
        if (j62 != null) {
        }
        if (j62 != null) {
        }
        float f9322 = this.f24855g0;
        float f9422 = f892 + f9322;
        float f9522 = f912 - f902;
        float f9622 = height7;
        float f9722 = ((f9522 - f9622) / 2.0f) + f902;
        float f9822 = width5 + f9422;
        i22 = width5;
        float f9922 = f9722 + f9622;
        float f10022 = f9822 + f9322;
        float f10122 = f10022 + width4;
        float f10222 = height6;
        float f10322 = ((f9522 - f10222) / 2.0f) + f902;
        int i2922 = width4;
        float f10422 = f10322 + f10222;
        float f10522 = (f9322 * 2.0f) + i22 + i2922;
        if (i22 > 0) {
        }
        f27 = f10522 + f30;
        f28 = this.f24863i0;
        if (f27 < f28) {
        }
        float f10622 = f892 + f27;
        if (f10622 >= f25) {
        }
        rectF6 = this.F1;
        rectF7 = this.E1;
        path = this.f24877n1;
        if (i20 > 0) {
        }
        this.G1 = null;
        rectF7.setEmpty();
        rectF6.setEmpty();
        path.reset();
        this.C1.set(f9422, f9722, f9822, f9922);
        this.D1.set(f10022, f10322, f10122, f10422);
        this.B1.set(f892, f902, f107, f912);
        this.A1.set(f692, f702, f712, f26);
        float f10922 = f17;
        this.f24893t1.set(f18, f16, f11, f10922);
        this.f24896u1.set(f15, f10922, f12, f35);
        rectF8 = this.f24883p1;
        float f11022 = f13;
        float f11122 = f14;
        rectF8.set(f11022, paddingTop, f11122, f682);
        Path path222 = this.f24880o1;
        path222.rewind();
        float f11222 = this.X0;
        path222.addRoundRect(rectF8, f11222, f11222, Path.Direction.CW);
        if (!rectF8.isEmpty()) {
        }
        this.Z1 = new LinearGradient(f11022, f29, f11122, f29, this.U1, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r10.intValue() > r11.intValue()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r8.intValue() > r9.intValue()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String date, String time, String str, String str2, long j, Integer num, Integer num2, Integer num3, Integer num4, String nameHome, String nameGuest) {
        String str3;
        String str4;
        String str5;
        String sb2;
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(nameHome, "nameHome");
        Intrinsics.checkNotNullParameter(nameGuest, "nameGuest");
        this.f24847d2 = str;
        this.f24853f2 = nameHome;
        this.f24857g2 = nameGuest;
        String str6 = "";
        if (num == null || (str3 = g(num.intValue(), num3).toString()) == null) {
            str3 = "";
        }
        this.f24861h2 = str3;
        if (num2 != null && (sb2 = g(num2.intValue(), num4).toString()) != null) {
            str6 = sb2;
        }
        this.f24865i2 = str6;
        int i5 = -1;
        if (num != null && num2 != null) {
            if (num3 == null || num4 == null) {
                if (!Intrinsics.areEqual(num, num2)) {
                }
            } else if (!Intrinsics.areEqual(num3, num4)) {
            }
        }
        this.f24850e2 = i5;
        this.f24892t0 = time;
        this.f24890s0 = date;
        if (str2 == null || (str4 = d9.e.m(new StringBuilder(), this.U0, ": ", str2)) == null) {
            str4 = "Odds: -";
        }
        this.V0 = str4;
        if (str == null || (str5 = kotlin.text.z.m(str, "\n", " ")) == null) {
            str5 = "Bla bla care";
        }
        this.W0 = str5;
        if (j > 0) {
            m(j);
        } else {
            m(0L);
        }
        requestLayout();
        invalidate();
    }

    public final int getHeightSize() {
        RectF rectF = this.f24883p1;
        return (int) Math.abs(rectF.bottom - rectF.top);
    }

    public final int getWidthGuestFlagSize() {
        RectF rectF = this.s1;
        return (int) Math.abs(rectF.right - rectF.left);
    }

    public final int getWidthHomeFlagSize() {
        RectF rectF = this.f24888r1;
        return (int) Math.abs(rectF.right - rectF.left);
    }

    public final int getWidthSize() {
        RectF rectF = this.f24883p1;
        return (int) Math.abs(rectF.right - rectF.left);
    }

    public final void h() {
        int[] iArr = this.U1;
        ColorStateList valueOf = ColorStateList.valueOf(iArr[0]);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(iArr[0]);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        float[] fArr = new float[8];
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = this.X0;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        this.f24864i1 = new RippleDrawable(valueOf, null, shapeDrawable);
    }

    public final void l(long j) {
        if (j > 0) {
            m(j);
        } else {
            m(0L);
        }
        invalidate();
    }

    public final void m(long j) {
        if (j <= 0) {
            this.f24898v0 = "00:00:00";
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
            this.f24898v0 = "99:59:59";
            return;
        }
        long j11 = j % j10;
        long j12 = 60;
        int i11 = (int) (j11 / j12);
        int i12 = (int) (j % j12);
        char w10 = rh.g.w(i10);
        StringBuilder sb2 = this.f24895u0;
        sb2.setCharAt(0, w10);
        sb2.setCharAt(1, rh.g.x(i10));
        sb2.setCharAt(3, rh.g.w(i11));
        sb2.setCharAt(4, rh.g.x(i11));
        sb2.setCharAt(6, rh.g.w(i12));
        sb2.setCharAt(7, rh.g.x(i12));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.f24898v0 = sb3;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() > 0 && getHeight() > 0) {
            e(getWidth(), getHeight());
        }
        if (this.f24864i1 == null) {
            h();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        if (this.c2) {
            eg.c0.h(this.f24843b2.f18494a);
        }
        this.f24838a.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        RectF rectF = this.F1;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF2 = this.f24883p1;
        if (rectF2.isEmpty()) {
            return;
        }
        Path path = this.f24880o1;
        boolean isEmpty = path.isEmpty();
        Paint paint = this.H0;
        if (!isEmpty && (bitmap3 = this.A0) != null) {
            save = canvas.save();
            canvas.clipPath(path);
            try {
                if (!bitmap3.isRecycled()) {
                    canvas.drawBitmap(bitmap3, this.D0, paint);
                }
                canvas.restoreToCount(save);
            } finally {
            }
        }
        save = canvas.save();
        try {
            float f6 = this.X0;
            canvas.drawRoundRect(rectF2, f6, f6, this.G0);
            canvas.restoreToCount(save);
            RectF rectF3 = this.f24888r1;
            if (!rectF3.isEmpty() && (bitmap2 = this.B0) != null) {
                save = canvas.save();
                canvas.clipRect(rectF3);
                try {
                    canvas.translate(rectF3.left, rectF3.top);
                    if (!bitmap2.isRecycled()) {
                        canvas.drawBitmap(bitmap2, this.E0, paint);
                    }
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            RectF rectF4 = this.s1;
            if (!rectF4.isEmpty() && (bitmap = this.C0) != null) {
                save = canvas.save();
                canvas.clipRect(rectF4);
                try {
                    canvas.translate(rectF4.left, rectF4.top);
                    if (!bitmap.isRecycled()) {
                        canvas.drawBitmap(bitmap, this.F0, paint);
                    }
                    canvas.restoreToCount(save);
                } finally {
                }
            }
            save = canvas.save();
            try {
                if (!rectF.isEmpty()) {
                    canvas.drawPath(this.f24877n1, this.P0);
                }
                RectF rectF5 = this.B1;
                float f10 = this.Y0;
                canvas.drawRoundRect(rectF5, f10, f10, this.I0);
                canvas.restoreToCount(save);
                RippleDrawable rippleDrawable = this.f24864i1;
                if (rippleDrawable != null) {
                    rippleDrawable.draw(canvas);
                }
                TextPaint textPaint = this.R0;
                StaticLayout staticLayout = this.H1;
                if (staticLayout != null) {
                    RectF rectF6 = this.f24893t1;
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
                StaticLayout staticLayout2 = this.I1;
                if (staticLayout2 != null) {
                    RectF rectF7 = this.f24896u1;
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
                StaticLayout staticLayout3 = this.J1;
                if (staticLayout3 != null) {
                    RectF rectF8 = this.f24899v1;
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
                StaticLayout staticLayout4 = this.K1;
                if (staticLayout4 != null) {
                    RectF rectF9 = this.f24904x1;
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
                StaticLayout staticLayout5 = this.L1;
                if (staticLayout5 != null) {
                    RectF rectF10 = this.f24902w1;
                    if (!rectF10.isEmpty()) {
                        save = canvas.save();
                        try {
                            canvas.translate(rectF10.left, rectF10.top);
                            staticLayout5.draw(canvas);
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                }
                StaticLayout staticLayout6 = this.M1;
                if (staticLayout6 != null) {
                    RectF rectF11 = this.f24907y1;
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
                StaticLayout staticLayout7 = this.G1;
                if (staticLayout7 != null && !rectF.isEmpty()) {
                    save = canvas.save();
                    try {
                        canvas.translate(rectF.left, rectF.top);
                        staticLayout7.draw(canvas);
                        canvas.restoreToCount(save);
                    } finally {
                    }
                }
                RectF rectF12 = this.f24909z1;
                if (!rectF12.isEmpty()) {
                    save = canvas.save();
                    try {
                        canvas.drawText(this.f24898v0, rectF12.left, rectF12.top - textPaint.ascent(), textPaint);
                    } finally {
                    }
                }
                StaticLayout staticLayout8 = this.N1;
                if (staticLayout8 != null) {
                    RectF rectF13 = this.C1;
                    if (!rectF13.isEmpty()) {
                        save = canvas.save();
                        try {
                            canvas.translate(rectF13.left, rectF13.top);
                            staticLayout8.draw(canvas);
                        } finally {
                        }
                    }
                }
                StaticLayout staticLayout9 = this.O1;
                if (staticLayout9 != null) {
                    RectF rectF14 = this.D1;
                    if (rectF14.isEmpty()) {
                        return;
                    }
                    save = canvas.save();
                    try {
                        canvas.translate(rectF14.left, rectF14.top);
                        staticLayout9.draw(canvas);
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        int height;
        int height2;
        int max;
        float max2;
        int i11;
        float f6;
        int width;
        int i12;
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = getPaddingEnd() + getPaddingStart() + (this.z0 * 2.0f);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        TextPaint textPaint = this.K0;
        TextPaint textPaint2 = this.J0;
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            float max3 = Math.max(size, (int) this.f24841b) - paddingEnd;
            if (max3 < 0.0f) {
                max3 = 0.0f;
            }
            int i13 = (int) max3;
            StaticLayout i14 = i(this.f24890s0, i13, textPaint2, true);
            StaticLayout i15 = i(this.f24892t0, i13, textPaint, true);
            int width2 = i14 != null ? i14.getWidth() : 0;
            int width3 = i15 != null ? i15.getWidth() : 0;
            height = i14 != null ? i14.getHeight() : 0;
            height2 = i15 != null ? i15.getHeight() : 0;
            max = Math.max(width2, width3);
        } else {
            StaticLayout k6 = k(textPaint2, this.f24890s0);
            StaticLayout k9 = k(textPaint, this.f24892t0);
            int width4 = k6 != null ? k6.getWidth() : 0;
            int width5 = k9 != null ? k9.getWidth() : 0;
            height = k6 != null ? k6.getHeight() : 0;
            height2 = k9 != null ? k9.getHeight() : 0;
            max = Math.max(width4, width5);
        }
        float f10 = this.f24906y0;
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            float max4 = Math.max(size, (int) this.f24841b) - (max + paddingEnd);
            max2 = max4 >= this.f24862i ? Math.max(this.j, height + height2 + f10) : Math.max((this.f24858h * 2.0f) + (((max4 - (this.f24854g * 2.0f)) / 9.0f) * 4.0f), height + height2 + f10);
        } else {
            max2 = Math.max(this.j, height + height2 + f10);
        }
        float min = mode != Integer.MIN_VALUE ? mode != 1073741824 ? paddingEnd + max + this.f24862i : size : Math.min(paddingEnd + max + this.f24862i, size);
        String str = "Manchester United";
        String str2 = (this.f24853f2.length() == 0 || StringsKt.H(this.f24853f2)) ? "Manchester United" : this.f24853f2;
        if (this.f24857g2.length() != 0 && !StringsKt.H(this.f24857g2)) {
            str = this.f24857g2;
        }
        TextPaint textPaint3 = this.L0;
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            int i16 = size - ((int) ((this.f24872m + this.f24875n) + this.f24881p));
            if (i16 > 5.0f) {
                if (Intrinsics.areEqual(str2, str)) {
                    StaticLayout j = j(str2, textPaint3, i16);
                    if (j != null) {
                        j.getWidth();
                    }
                    if (j != null) {
                        r11 = j.getHeight();
                    }
                } else {
                    StaticLayout j6 = j(str2, textPaint3, i16);
                    StaticLayout j10 = j(str, textPaint3, i16);
                    if (j6 != null) {
                        j6.getWidth();
                    }
                    int height3 = j6 != null ? j6.getHeight() : 0;
                    if (j10 != null) {
                        j10.getWidth();
                    }
                    r11 = height3;
                    i11 = j10 != null ? j10.getHeight() : 0;
                    f6 = size;
                }
            }
            i11 = r11;
            f6 = size;
        } else {
            if (str2.length() == str.length()) {
                StaticLayout k10 = k(textPaint3, str2);
                i12 = k10 != null ? k10.getWidth() : 0;
                r11 = k10 != null ? k10.getHeight() : 0;
                width = i12;
                i11 = r11;
            } else {
                StaticLayout k11 = k(textPaint3, str2);
                StaticLayout k12 = k(textPaint3, str);
                int width6 = k11 != null ? k11.getWidth() : 0;
                int height4 = k11 != null ? k11.getHeight() : 0;
                width = k12 != null ? k12.getWidth() : 0;
                r11 = height4;
                i11 = k12 != null ? k12.getHeight() : 0;
                i12 = width6;
            }
            f6 = this.f24872m + this.f24875n + this.f24881p + Math.max(i12, width) + getPaddingStart() + getPaddingEnd();
        }
        float f11 = this.f24869l + this.f24878o + this.q + r11 + i11;
        this.f24867k = f11;
        int max5 = (int) Math.max(f6, min);
        int i17 = (int) (paddingBottom + f11 + max2 + this.G);
        if (mode == Integer.MIN_VALUE) {
            float f12 = max5;
            float f13 = this.f24841b;
            if (f12 < f13) {
                max5 = (int) f13;
            }
            size = Math.min(max5, size);
        } else if (mode != 1073741824) {
            float f14 = max5;
            float f15 = this.f24841b;
            size = f14 < f15 ? (int) f15 : max5;
        }
        if (mode2 == Integer.MIN_VALUE) {
            float f16 = i17;
            float f17 = this.f24841b;
            if (f16 < f17) {
                i17 = (int) f17;
            }
            size2 = Math.min(i17, size2);
        } else if (mode2 != 1073741824) {
            float f18 = i17;
            float f19 = this.f24841b;
            size2 = f18 < f19 ? (int) f19 : i17;
        }
        Integer valueOf = Integer.valueOf(size);
        Integer valueOf2 = Integer.valueOf(size2);
        int resolveSize = View.resolveSize(valueOf.intValue(), i5);
        int resolveSize2 = View.resolveSize(valueOf2.intValue(), i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        e(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        Paint paint = this.P0;
        Paint paint2 = this.G0;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.Z1;
            if (linearGradient != null) {
                paint2.setShader(linearGradient);
            }
            LinearGradient linearGradient2 = this.f24840a2;
            if (linearGradient2 != null) {
                paint.setShader(linearGradient2);
            }
            invalidate();
            return;
        }
        e(i5, i10);
        LinearGradient linearGradient3 = this.Z1;
        if (linearGradient3 != null) {
            paint2.setShader(linearGradient3);
        }
        LinearGradient linearGradient4 = this.f24840a2;
        if (linearGradient4 != null) {
            paint.setShader(linearGradient4);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.f24883p1;
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
                        RippleDrawable rippleDrawable = this.f24864i1;
                        if (rippleDrawable != null) {
                            rippleDrawable.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable2 = this.f24864i1;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setState(this.Y1);
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
        RippleDrawable rippleDrawable3 = this.f24864i1;
        if (rippleDrawable3 != null) {
            rippleDrawable3.setState(this.X1);
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
                    RectF rectF2 = this.B1;
                    if (!rectF2.isEmpty()) {
                        float f17 = rectF2.left;
                        float f18 = rectF2.right;
                        float x12 = event.getX();
                        if (f17 <= x12 && x12 <= f18) {
                            float f19 = rectF2.top;
                            float f20 = rectF2.bottom;
                            float y11 = event.getY();
                            if (f19 <= y11 && y11 <= f20) {
                                playSoundEffect(0);
                                a(this.f24847d2);
                                return false;
                            }
                        }
                    }
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
            this.A0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 100.0f && height > 100.0f) {
            RectF rectF = this.f24883p1;
            float abs = Math.abs(rectF.right - rectF.left);
            float abs2 = Math.abs(rectF.bottom - rectF.top);
            float max = Math.max(abs / width, abs2 / height);
            float f6 = abs - (width * max);
            float f10 = 2;
            float f11 = (abs2 - (height * max)) / f10;
            Matrix matrix = this.D0;
            matrix.setScale(max, max);
            matrix.postTranslate(f6 / f10, f11);
            if (!bitmap.isRecycled()) {
                this.A0 = bitmap;
            }
        }
        invalidate();
    }

    public final void setBitmapFlagGuest(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.C0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 10.0f && height > 10.0f) {
            RectF rectF = this.s1;
            float abs = Math.abs(rectF.right - rectF.left);
            float abs2 = Math.abs(rectF.bottom - rectF.top);
            float min = Math.min(abs / width, abs2 / height);
            float f6 = abs - (width * min);
            float f10 = 2;
            float f11 = (abs2 - (height * min)) / f10;
            Matrix matrix = this.F0;
            matrix.setScale(min, min);
            matrix.postTranslate(f6 / f10, f11);
            if (!bitmap.isRecycled()) {
                this.C0 = bitmap;
            }
        }
        invalidate();
    }

    public final void setBitmapFlagHome(@Nullable Bitmap bitmap) {
        if (bitmap == null) {
            this.B0 = null;
        }
        float width = bitmap != null ? bitmap.getWidth() : 0.0f;
        float height = bitmap != null ? bitmap.getHeight() : 0.0f;
        if (bitmap != null && width > 10.0f && height > 10.0f) {
            RectF rectF = this.f24888r1;
            float abs = Math.abs(rectF.right - rectF.left);
            float abs2 = Math.abs(rectF.bottom - rectF.top);
            float min = Math.min(abs / width, abs2 / height);
            float f6 = abs - (width * min);
            float f10 = 2;
            float f11 = (abs2 - (height * min)) / f10;
            Matrix matrix = this.E0;
            matrix.setScale(min, min);
            matrix.postTranslate(f6 / f10, f11);
            if (!bitmap.isRecycled()) {
                this.B0 = bitmap;
            }
        }
        invalidate();
    }

    public final void setHolderListener(@Nullable v vVar) {
        if (vVar == null) {
            return;
        }
        this.f24838a.add(vVar);
    }
}
