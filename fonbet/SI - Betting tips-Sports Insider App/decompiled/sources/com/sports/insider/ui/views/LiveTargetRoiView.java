package com.sports.insider.ui.views;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.h0;
import eg.c0;
import eg.m0;
import jg.d;
import jg.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lg.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/sports/insider/ui/views/LiveTargetRoiView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "roi", "", "setROI", "(Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "setButtonTypeface", "(Landroid/graphics/Typeface;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveTargetRoiView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveTargetRoiView.kt\ncom/sports/insider/ui/views/LiveTargetRoiView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,809:1\n1#2:810\n404#3:811\n404#3:812\n27#4,7:813\n27#4,7:820\n135#4,8:827\n135#4,8:835\n135#4,8:843\n27#4,7:851\n*S KotlinDebug\n*F\n+ 1 LiveTargetRoiView.kt\ncom/sports/insider/ui/views/LiveTargetRoiView\n*L\n218#1:811\n219#1:812\n358#1:813,7\n365#1:820,7\n375#1:827,8\n383#1:835,8\n391#1:843,8\n399#1:851,7\n*E\n"})
/* loaded from: classes.dex */
public final class LiveTargetRoiView extends View {
    public float A;
    public final RectF A0;
    public float B;
    public final RectF B0;
    public float C;
    public final RectF C0;
    public float D;
    public final RectF D0;
    public float E;
    public final RectF E0;
    public final Paint F;
    public StaticLayout F0;
    public final Paint G;
    public final RectF G0;
    public final TextPaint H;
    public final RectF H0;
    public final TextPaint I;
    public StaticLayout I0;
    public final TextPaint J;
    public final RectF J0;
    public final TextPaint K;
    public final RectF K0;
    public String L;
    public final RectF L0;
    public final RectF M0;
    public StaticLayout N0;
    public StaticLayout O0;
    public final RectF P0;
    public final RectF Q0;
    public DisplayMetrics R0;
    public final int[] S0;
    public final int[] T0;
    public final int[] U0;
    public final int[] V0;
    public LinearGradient W0;
    public final d X0;

    /* renamed from: a, reason: collision with root package name */
    public final float f7642a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7643b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7644c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7645d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7646e;

    /* renamed from: f, reason: collision with root package name */
    public final float f7647f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7648g;

    /* renamed from: g0, reason: collision with root package name */
    public String f7649g0;

    /* renamed from: h, reason: collision with root package name */
    public final float f7650h;

    /* renamed from: h0, reason: collision with root package name */
    public String f7651h0;

    /* renamed from: i, reason: collision with root package name */
    public final float f7652i;

    /* renamed from: i0, reason: collision with root package name */
    public String f7653i0;
    public final float j;
    public float j0;

    /* renamed from: k, reason: collision with root package name */
    public final float f7654k;
    public float k0;

    /* renamed from: l, reason: collision with root package name */
    public final float f7655l;

    /* renamed from: l0, reason: collision with root package name */
    public float f7656l0;

    /* renamed from: m, reason: collision with root package name */
    public final float f7657m;

    /* renamed from: m0, reason: collision with root package name */
    public float f7658m0;

    /* renamed from: n, reason: collision with root package name */
    public final float f7659n;

    /* renamed from: n0, reason: collision with root package name */
    public float f7660n0;

    /* renamed from: o, reason: collision with root package name */
    public final float f7661o;

    /* renamed from: o0, reason: collision with root package name */
    public float f7662o0;

    /* renamed from: p, reason: collision with root package name */
    public final float f7663p;

    /* renamed from: p0, reason: collision with root package name */
    public float f7664p0;
    public final float q;

    /* renamed from: q0, reason: collision with root package name */
    public float f7665q0;

    /* renamed from: r, reason: collision with root package name */
    public final float f7666r;

    /* renamed from: r0, reason: collision with root package name */
    public float f7667r0;

    /* renamed from: s, reason: collision with root package name */
    public final float f7668s;

    /* renamed from: s0, reason: collision with root package name */
    public float f7669s0;

    /* renamed from: t, reason: collision with root package name */
    public float f7670t;

    /* renamed from: t0, reason: collision with root package name */
    public Typeface f7671t0;

    /* renamed from: u, reason: collision with root package name */
    public float f7672u;

    /* renamed from: u0, reason: collision with root package name */
    public String f7673u0;

    /* renamed from: v, reason: collision with root package name */
    public float f7674v;

    /* renamed from: v0, reason: collision with root package name */
    public float f7675v0;

    /* renamed from: w, reason: collision with root package name */
    public float f7676w;

    /* renamed from: w0, reason: collision with root package name */
    public RippleDrawable f7677w0;

    /* renamed from: x, reason: collision with root package name */
    public float f7678x;
    public int x0;

    /* renamed from: y, reason: collision with root package name */
    public float f7679y;

    /* renamed from: y0, reason: collision with root package name */
    public float f7680y0;

    /* renamed from: z, reason: collision with root package name */
    public float f7681z;
    public float z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTargetRoiView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7642a = 20.0f;
        this.f7643b = 10.0f;
        this.f7644c = 26.0f;
        this.f7645d = 18.0f;
        this.f7646e = 20.0f;
        this.f7647f = 12.0f;
        this.f7648g = 20.0f;
        this.f7650h = 12.0f;
        this.f7652i = 25.0f;
        this.j = 17.0f;
        this.f7654k = 1.0f;
        this.f7655l = 11.0f;
        this.f7657m = 20.0f;
        this.f7659n = 6.0f;
        this.f7661o = 3.0f;
        this.f7663p = 16.0f;
        this.q = 15.0f;
        this.f7666r = 11.0f;
        this.f7668s = 5.0f;
        this.f7670t = 11.0f;
        this.f7672u = 20.0f;
        this.f7674v = 0.0f;
        this.f7676w = 6.0f;
        this.f7678x = 0.0f;
        this.f7679y = 0.0f;
        this.f7681z = 0.0f;
        this.A = 3.0f;
        this.B = 16.0f;
        this.C = 15.0f;
        this.D = 11.0f;
        this.E = 5.0f;
        this.F = new Paint(1);
        this.G = new Paint(1);
        this.H = new TextPaint(1);
        this.I = new TextPaint(1);
        this.J = new TextPaint(1);
        this.K = new TextPaint(1);
        this.L = "Live - predictions";
        this.f7649g0 = "ROI all the time";
        this.f7651h0 = "+36%";
        this.f7653i0 = "Try for free";
        this.j0 = 20.0f;
        this.k0 = 10.0f;
        this.f7656l0 = 26.0f;
        this.f7658m0 = 18.0f;
        this.f7660n0 = 20.0f;
        this.f7662o0 = 12.0f;
        this.f7664p0 = 20.0f;
        this.f7665q0 = 12.0f;
        this.f7667r0 = 25.0f;
        this.f7669s0 = 17.0f;
        this.f7673u0 = "+36%";
        this.f7675v0 = 1.0f;
        this.f7680y0 = 1.0f;
        this.z0 = 45.0f;
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.G0 = new RectF();
        this.H0 = new RectF();
        this.J0 = new RectF();
        this.K0 = new RectF();
        this.L0 = new RectF();
        this.M0 = new RectF();
        this.P0 = new RectF();
        this.Q0 = new RectF();
        int[] iArr = new int[2];
        int i5 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = -1;
        }
        this.S0 = iArr;
        this.T0 = new int[0];
        this.U0 = new int[]{R.attr.state_enabled};
        int[] iArr2 = new int[2];
        while (i5 < 2) {
            iArr2[i5] = i5 == 0 ? R.attr.state_pressed : 16842910;
            i5++;
        }
        this.V0 = iArr2;
        e eVar = m0.f9201a;
        this.X0 = c0.b(q.f18523a);
        b(context);
    }

    public static StaticLayout f(String str, int i5, TextPaint textPaint) {
        if (str == null || str.length() == 0 || StringsKt.H(str) || i5 <= 5) {
            return null;
        }
        return StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, Math.min(i5, (int) textPaint.measureText(str.toString()))).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButtonTypeface(Typeface typeface) {
        if (typeface == null || !Intrinsics.areEqual(this.f7671t0, typeface)) {
            if (typeface == null) {
                typeface = Typeface.DEFAULT_BOLD;
            }
            this.f7671t0 = typeface;
            this.H.setTypeface(typeface);
            this.I.setTypeface(this.f7671t0);
            this.J.setTypeface(this.f7671t0);
            this.K.setTypeface(this.f7671t0);
        }
    }

    public final void b(Context context) {
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.R0 = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f6 = displayMetrics.density;
        if (f6 <= 0.0f) {
            f6 = this.f7654k;
        }
        this.f7675v0 = f6;
        this.j0 = this.f7642a * f6;
        this.k0 = this.f7643b * f6;
        DisplayMetrics displayMetrics3 = this.R0;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        this.f7656l0 = h0.l(displayMetrics3, this.f7644c);
        DisplayMetrics displayMetrics4 = this.R0;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        this.f7658m0 = h0.l(displayMetrics4, this.f7645d);
        DisplayMetrics displayMetrics5 = this.R0;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        this.f7660n0 = h0.l(displayMetrics5, this.f7648g);
        DisplayMetrics displayMetrics6 = this.R0;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics6 = null;
        }
        this.f7662o0 = h0.l(displayMetrics6, this.f7650h);
        DisplayMetrics displayMetrics7 = this.R0;
        if (displayMetrics7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics7 = null;
        }
        this.f7664p0 = h0.l(displayMetrics7, this.f7646e);
        DisplayMetrics displayMetrics8 = this.R0;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics8 = null;
        }
        this.f7665q0 = h0.l(displayMetrics8, this.f7647f);
        DisplayMetrics displayMetrics9 = this.R0;
        if (displayMetrics9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics9 = null;
        }
        this.f7667r0 = h0.l(displayMetrics9, this.f7652i);
        DisplayMetrics displayMetrics10 = this.R0;
        if (displayMetrics10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics10;
        }
        this.f7669s0 = h0.l(displayMetrics2, this.j);
        float f10 = this.f7675v0;
        this.f7670t = this.f7655l * f10;
        this.f7672u = this.f7657m * f10;
        float f11 = 0.0f * f10;
        this.f7674v = f11;
        this.f7676w = this.f7659n * f10;
        this.f7678x = f11;
        this.f7679y = f11;
        this.f7681z = f11;
        this.A = this.f7661o * f10;
        this.B = this.f7663p * f10;
        this.C = this.q * f10;
        this.D = this.f7666r * f10;
        this.E = this.f7668s * f10;
        float f12 = 1.0f * f10;
        this.f7680y0 = f12;
        this.z0 = f10 * 45.0f;
        int i5 = (int) f12;
        setPadding(i5, i5, i5, i5);
        this.x0 = Color.parseColor("#fda014");
        int parseColor = Color.parseColor("#f7d95f");
        int i10 = this.x0;
        int[] iArr = this.S0;
        iArr[0] = i10;
        iArr[1] = parseColor;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        TextPaint textPaint = this.H;
        textPaint.setTypeface(typeface);
        textPaint.setColor(-1);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style);
        textPaint.setTextSize(this.f7656l0);
        Paint.Align align = Paint.Align.LEFT;
        textPaint.setTextAlign(align);
        TextPaint textPaint2 = this.I;
        textPaint2.setTypeface(typeface);
        textPaint2.setColor(-1);
        textPaint2.setStyle(style);
        textPaint2.setTextSize(this.f7664p0);
        textPaint2.setTextAlign(align);
        TextPaint textPaint3 = this.J;
        textPaint3.setTypeface(typeface);
        textPaint3.setColor(-1);
        textPaint3.setStyle(style);
        textPaint3.setTextSize(this.f7667r0);
        textPaint3.setTextAlign(align);
        TextPaint textPaint4 = this.K;
        textPaint4.setTypeface(typeface);
        textPaint4.setColor(-1);
        textPaint4.setStyle(style);
        textPaint4.setTextSize(this.f7660n0);
        textPaint4.setTextAlign(Paint.Align.CENTER);
        Paint.Style style2 = Paint.Style.FILL;
        Paint paint = this.F;
        paint.setStyle(style2);
        paint.setColor(this.x0);
        Paint.Style style3 = Paint.Style.STROKE;
        Paint paint2 = this.G;
        paint2.setStyle(style3);
        paint2.setColor(-1);
        paint2.setStrokeWidth(this.f7680y0);
        e();
    }

    public final void c() {
        this.C0.setEmpty();
        setPressed(false);
        RippleDrawable rippleDrawable = this.f7677w0;
        if (rippleDrawable != null) {
            rippleDrawable.setState(this.T0);
        }
        this.E0.setEmpty();
        this.F0 = null;
        this.H0.setEmpty();
        this.I0 = null;
        this.M0.setEmpty();
        this.N0 = null;
        this.K0.setEmpty();
        this.O0 = null;
        this.Q0.setEmpty();
    }

    public final void d(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            c();
            return;
        }
        RectF rectF = this.A0;
        rectF.left = getPaddingStart() + 0.0f;
        rectF.top = getPaddingTop() + 0.0f;
        rectF.right = (i5 - getPaddingEnd()) + 0.0f;
        rectF.bottom = (i10 - getPaddingBottom()) + 0.0f;
        if (rectF.height() <= 0.0f || rectF.width() <= 0.0f || rectF.isEmpty()) {
            c();
            return;
        }
        rectF.centerX();
        rectF.centerY();
        float f6 = rectF.left;
        float f10 = this.f7672u;
        RectF rectF2 = this.D0;
        rectF2.left = f6 + f10;
        float f11 = rectF.top;
        float f12 = this.f7670t;
        rectF2.top = f11 + f12;
        rectF2.right = rectF.right - f10;
        rectF2.bottom = rectF.top + f12;
        StaticLayout g10 = g((int) rectF2.width(), this.L, this.H, this.f7658m0, this.f7656l0);
        float height = rectF2.top + (g10 != null ? g10.getHeight() : 0);
        rectF2.bottom = height;
        float f13 = height + this.f7674v;
        float f14 = rectF.left;
        float f15 = this.f7672u;
        RectF rectF3 = this.G0;
        rectF3.left = f14 + f15;
        float f16 = f13 + this.f7676w;
        rectF3.top = f16;
        rectF3.right = rectF.right - f15;
        rectF3.bottom = f16;
        StaticLayout g11 = g((int) rectF3.width(), this.f7649g0, this.I, this.f7665q0, this.f7664p0);
        float height2 = rectF3.top + (g11 != null ? g11.getHeight() : 0);
        rectF3.bottom = height2;
        float f17 = height2 + this.f7678x;
        float f18 = rectF.left;
        float f19 = this.f7672u;
        RectF rectF4 = this.L0;
        rectF4.left = f18 + f19;
        float f20 = f17 + this.f7679y;
        rectF4.top = f20;
        rectF4.right = rectF.right - f19;
        rectF4.bottom = f20;
        StaticLayout g12 = g((int) rectF4.width(), this.f7651h0, this.J, this.f7669s0, this.f7667r0);
        float height3 = rectF4.top + (g12 != null ? g12.getHeight() : 0);
        rectF4.bottom = height3;
        float f21 = height3 + this.f7681z;
        float f22 = rectF.left + this.B;
        RectF rectF5 = this.J0;
        rectF5.left = f22;
        float f23 = f21 + this.A;
        rectF5.top = f23;
        rectF5.right = rectF.right - this.C;
        rectF5.bottom = f23;
        StaticLayout g13 = g((int) (rectF5.width() - (this.E * 2.0f)), this.f7653i0, this.K, this.f7662o0, this.f7660n0);
        rectF5.bottom = (this.E * 2.0f) + rectF5.top + (g13 != null ? g13.getHeight() : 0);
        if (this.z0 > rectF5.height()) {
            rectF5.bottom = rectF5.top + this.z0;
        }
        float f24 = rectF5.left;
        float f25 = this.E;
        RectF rectF6 = this.P0;
        rectF6.left = f24 + f25;
        rectF6.top = rectF5.top + f25;
        rectF6.right = rectF5.right - f25;
        rectF6.bottom = rectF5.bottom - f25;
        float width = g13 != null ? g13.getWidth() : 0;
        float width2 = (width / 2.0f) + ((rectF6.width() - width) / 2.0f) + rectF6.left;
        rectF6.left = width2;
        rectF6.right = width2 + width;
        float height4 = ((rectF6.height() - (g13 != null ? g13.getHeight() : 0)) / 2.0f) + rectF6.top;
        rectF6.top = height4;
        rectF6.bottom = height4 + (g13 != null ? g13.getHeight() : 0);
        float f26 = rectF2.left;
        RectF rectF7 = this.E0;
        rectF7.left = f26;
        rectF7.top = rectF2.top;
        rectF7.right = rectF2.right;
        rectF7.bottom = rectF2.bottom;
        this.F0 = g10;
        float f27 = rectF3.left;
        RectF rectF8 = this.H0;
        rectF8.left = f27;
        rectF8.top = rectF3.top;
        rectF8.right = rectF3.right;
        rectF8.bottom = rectF3.bottom;
        this.I0 = g11;
        float f28 = rectF4.left;
        RectF rectF9 = this.M0;
        rectF9.left = f28;
        rectF9.top = rectF4.top;
        rectF9.right = rectF4.right;
        rectF9.bottom = rectF4.bottom;
        this.N0 = g12;
        float f29 = rectF5.left;
        RectF rectF10 = this.K0;
        rectF10.left = f29;
        rectF10.top = rectF5.top;
        rectF10.right = rectF5.right;
        rectF10.bottom = rectF5.bottom;
        this.O0 = g13;
        float f30 = rectF6.left;
        RectF rectF11 = this.Q0;
        rectF11.left = f30;
        rectF11.top = rectF6.top;
        rectF11.right = rectF6.right;
        rectF11.bottom = rectF6.bottom;
        float f31 = rectF.left;
        RectF rectF12 = this.C0;
        rectF12.left = f31;
        rectF12.top = rectF.top;
        rectF12.right = rectF.right;
        rectF12.bottom = rectF.bottom;
        float f32 = rectF.left;
        float f33 = this.f7680y0 / 2.0f;
        RectF rectF13 = this.B0;
        rectF13.left = f32 + f33;
        rectF13.top = rectF.top + f33;
        rectF13.right = rectF.right - f33;
        rectF13.bottom = rectF.bottom - f33;
        if (!rectF12.isEmpty()) {
            int i11 = (int) rectF12.left;
            int i12 = (int) rectF12.top;
            int i13 = (int) rectF12.right;
            int i14 = (int) rectF12.bottom;
            RippleDrawable rippleDrawable = this.f7677w0;
            if (rippleDrawable != null) {
                rippleDrawable.setBounds(i11, i12, i13, i14);
                rippleDrawable.setHotspotBounds(i11, i12, i13, i14);
            }
        }
        this.W0 = new LinearGradient(rectF.left, rectF.centerY(), rectF.right, rectF.centerY(), this.S0, (float[]) null, Shader.TileMode.CLAMP);
        invalidate();
    }

    public final void e() {
        int[] iArr = this.S0;
        ColorStateList valueOf = ColorStateList.valueOf(iArr[0]);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(iArr[0]);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        float[] fArr = new float[8];
        for (int i5 = 0; i5 < 8; i5++) {
            fArr[i5] = this.j0;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        this.f7677w0 = new RippleDrawable(valueOf, null, shapeDrawable);
    }

    public final StaticLayout g(int i5, String str, TextPaint textPaint, float f6, float f10) {
        if (str != null && str.length() != 0 && !StringsKt.H(str) && i5 > 5) {
            float max = Math.max(f10, f6);
            textPaint.setTextSize(max);
            StaticLayout f11 = f(str, i5, textPaint);
            if (f11 != null) {
                if (f11.getLineCount() >= 2) {
                    while (f11.getLineCount() >= 2 && max > f6) {
                        DisplayMetrics displayMetrics = this.R0;
                        if (displayMetrics == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("metrics");
                            displayMetrics = null;
                        }
                        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
                        max = Math.max(max - (Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 1.0f, displayMetrics) : displayMetrics.scaledDensity * 1.0f), f6);
                        textPaint.setTextSize(max);
                        StaticLayout f12 = f(str, i5, textPaint);
                        if (f12 != null) {
                            f11 = f12;
                        }
                    }
                }
                return f11;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getWidth() > 0 && getHeight() > 0) {
            d(getWidth(), getHeight());
        }
        if (this.f7677w0 == null) {
            e();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
        c0.g(this.X0, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.C0;
        boolean isEmpty = rectF.isEmpty();
        Paint paint = this.G;
        if (!isEmpty) {
            RectF rectF2 = this.B0;
            save = canvas.save();
            try {
                float f6 = this.j0;
                canvas.drawRoundRect(rectF, f6, f6, this.F);
                float f10 = this.j0;
                canvas.drawRoundRect(rectF2, f10, f10, paint);
                canvas.restoreToCount(save);
                RippleDrawable rippleDrawable = this.f7677w0;
                if (rippleDrawable != null) {
                    rippleDrawable.draw(canvas);
                }
                StaticLayout staticLayout = this.F0;
                if (staticLayout != null) {
                    RectF rectF3 = this.E0;
                    if (!rectF3.isEmpty()) {
                        save = canvas.save();
                        canvas.clipRect(rectF3);
                        try {
                            canvas.translate(rectF3.left, rectF3.top);
                            staticLayout.draw(canvas);
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                }
                StaticLayout staticLayout2 = this.I0;
                if (staticLayout2 != null) {
                    RectF rectF4 = this.H0;
                    if (!rectF4.isEmpty()) {
                        save = canvas.save();
                        canvas.clipRect(rectF4);
                        try {
                            canvas.translate(rectF4.left, rectF4.top);
                            staticLayout2.draw(canvas);
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                }
                StaticLayout staticLayout3 = this.N0;
                if (staticLayout3 != null) {
                    RectF rectF5 = this.M0;
                    if (!rectF5.isEmpty()) {
                        save = canvas.save();
                        canvas.clipRect(rectF5);
                        try {
                            canvas.translate(rectF5.left, rectF5.top);
                            staticLayout3.draw(canvas);
                            canvas.restoreToCount(save);
                        } finally {
                        }
                    }
                }
                StaticLayout staticLayout4 = this.O0;
                if (staticLayout4 != null) {
                    RectF rectF6 = this.Q0;
                    if (!rectF6.isEmpty()) {
                        save = canvas.save();
                        try {
                            canvas.translate(rectF6.left, rectF6.top);
                            staticLayout4.draw(canvas);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
        RectF rectF7 = this.K0;
        if (rectF7.isEmpty()) {
            return;
        }
        save = canvas.save();
        try {
            float f11 = this.k0;
            canvas.drawRoundRect(rectF7, f11, f11, paint);
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        float paddingEnd = (this.f7672u * 2.0f) + getPaddingEnd() + getPaddingStart();
        float f6 = size;
        float f10 = f6 - paddingEnd;
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        int i11 = (int) f10;
        StaticLayout g10 = g(i11, this.L, this.H, this.f7658m0, this.f7656l0);
        StaticLayout g11 = g(i11, this.f7649g0, this.I, this.f7665q0, this.f7664p0);
        StaticLayout g12 = g(i11, this.f7651h0, this.J, this.f7669s0, this.f7667r0);
        float paddingEnd2 = (this.E * 2.0f) + getPaddingEnd() + getPaddingStart() + this.B + this.C;
        float f11 = f6 - paddingEnd2;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        StaticLayout g13 = g((int) f11, this.f7653i0, this.K, this.f7662o0, this.f7660n0);
        int max = (int) Math.max(Math.max(Math.max(g10 != null ? g10.getWidth() : 0, g11 != null ? g11.getWidth() : 0), g12 != null ? g12.getWidth() : 0) + paddingEnd, (g13 != null ? g13.getWidth() : 0) + paddingEnd2);
        float paddingBottom = (this.E * 2.0f) + getPaddingBottom() + getPaddingTop() + this.f7670t + this.f7674v + this.f7676w + this.f7678x + this.f7679y + this.f7681z + this.A + this.D;
        float height = (this.E * 2.0f) + (g13 != null ? g13.getHeight() : 0);
        float f12 = this.z0;
        int height2 = (int) (paddingBottom + (g10 != null ? g10.getHeight() : 0) + (g11 != null ? g11.getHeight() : 0) + (g12 != null ? g12.getHeight() : 0) + (g13 != null ? g13.getHeight() : 0) + (f12 > height ? f12 - height : 0.0f));
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height2, size2);
        } else if (mode2 != 1073741824) {
            size2 = height2;
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
        Paint paint = this.F;
        if (i11 == i5 && i12 == i10) {
            LinearGradient linearGradient = this.W0;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
            invalidate();
            return;
        }
        d(i5, i10);
        LinearGradient linearGradient2 = this.W0;
        if (linearGradient2 != null) {
            paint.setShader(linearGradient2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.C0;
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
                        RippleDrawable rippleDrawable = this.f7677w0;
                        if (rippleDrawable != null) {
                            rippleDrawable.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable2 = this.f7677w0;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setState(this.V0);
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
        RippleDrawable rippleDrawable3 = this.f7677w0;
        if (rippleDrawable3 != null) {
            rippleDrawable3.setState(this.U0);
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

    public final void setROI(@NotNull String roi) {
        Intrinsics.checkNotNullParameter(roi, "roi");
        if (Intrinsics.areEqual(this.f7673u0, roi)) {
            return;
        }
        this.f7673u0 = roi;
        this.f7651h0 = roi;
        requestLayout();
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTargetRoiView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7642a = 20.0f;
        this.f7643b = 10.0f;
        this.f7644c = 26.0f;
        this.f7645d = 18.0f;
        this.f7646e = 20.0f;
        this.f7647f = 12.0f;
        this.f7648g = 20.0f;
        this.f7650h = 12.0f;
        this.f7652i = 25.0f;
        this.j = 17.0f;
        this.f7654k = 1.0f;
        this.f7655l = 11.0f;
        this.f7657m = 20.0f;
        this.f7659n = 6.0f;
        this.f7661o = 3.0f;
        this.f7663p = 16.0f;
        this.q = 15.0f;
        this.f7666r = 11.0f;
        this.f7668s = 5.0f;
        this.f7670t = 11.0f;
        this.f7672u = 20.0f;
        this.f7674v = 0.0f;
        this.f7676w = 6.0f;
        this.f7678x = 0.0f;
        this.f7679y = 0.0f;
        this.f7681z = 0.0f;
        this.A = 3.0f;
        this.B = 16.0f;
        this.C = 15.0f;
        this.D = 11.0f;
        this.E = 5.0f;
        this.F = new Paint(1);
        this.G = new Paint(1);
        this.H = new TextPaint(1);
        this.I = new TextPaint(1);
        this.J = new TextPaint(1);
        this.K = new TextPaint(1);
        this.L = "Live - predictions";
        this.f7649g0 = "ROI all the time";
        this.f7651h0 = "+36%";
        this.f7653i0 = "Try for free";
        this.j0 = 20.0f;
        this.k0 = 10.0f;
        this.f7656l0 = 26.0f;
        this.f7658m0 = 18.0f;
        this.f7660n0 = 20.0f;
        this.f7662o0 = 12.0f;
        this.f7664p0 = 20.0f;
        this.f7665q0 = 12.0f;
        this.f7667r0 = 25.0f;
        this.f7669s0 = 17.0f;
        this.f7673u0 = "+36%";
        this.f7675v0 = 1.0f;
        this.f7680y0 = 1.0f;
        this.z0 = 45.0f;
        this.A0 = new RectF();
        this.B0 = new RectF();
        this.C0 = new RectF();
        this.D0 = new RectF();
        this.E0 = new RectF();
        this.G0 = new RectF();
        this.H0 = new RectF();
        this.J0 = new RectF();
        this.K0 = new RectF();
        this.L0 = new RectF();
        this.M0 = new RectF();
        this.P0 = new RectF();
        this.Q0 = new RectF();
        int[] iArr = new int[2];
        int i5 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            iArr[i10] = -1;
        }
        this.S0 = iArr;
        this.T0 = new int[0];
        this.U0 = new int[]{R.attr.state_enabled};
        int[] iArr2 = new int[2];
        while (i5 < 2) {
            iArr2[i5] = i5 == 0 ? R.attr.state_pressed : 16842910;
            i5++;
        }
        this.V0 = iArr2;
        e eVar = m0.f9201a;
        this.X0 = c0.b(q.f18523a);
        b(context);
    }
}
