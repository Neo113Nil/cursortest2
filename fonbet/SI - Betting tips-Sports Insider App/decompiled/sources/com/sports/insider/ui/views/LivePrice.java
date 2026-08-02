package com.sports.insider.ui.views;

import aa.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.h0;
import com.google.android.gms.internal.measurement.y3;
import com.sports.insider.R;
import d9.e;
import f0.l;
import ic.d;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nc.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.c;
import ve.y;
import yg.a;
import za.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168BX\u0082D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00168BX\u0082D¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\u00168BX\u0082D¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0014\u0010#\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001aR\u0014\u0010%\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001aR\u0014\u0010)\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010,R\u0014\u00101\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010,¨\u00062"}, d2 = {"Lcom/sports/insider/ui/views/LivePrice;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enable", "", "set1RubWeekCloudPayment", "(Z)V", "Lic/e;", "updateData", "setDetailsSecond", "(Lic/e;)V", "setDetailsFirst", "Lve/y;", "listener", "setListenerCheckPrice", "(Lve/y;)V", "", "z", "F", "getOuterRadius", "()F", "outerRadius", "A", "getInnerRadius", "innerRadius", "G", "getPaddingInnerPanel", "paddingInnerPanel", "getCenterXAbsolute", "centerXAbsolute", "getRadiusStar", "radiusStar", "Lnc/g;", "getResourceGetter", "()Lnc/g;", "resourceGetter", "", "getHeightTextLayoutHintFirst", "()I", "heightTextLayoutHintFirst", "getHeightTextLayoutHintSecond", "heightTextLayoutHintSecond", "getMaxTextLayoutHintTrial", "maxTextLayoutHintTrial", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLivePrice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LivePrice.kt\ncom/sports/insider/ui/views/LivePrice\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,1398:1\n404#2:1399\n404#2:1400\n404#2:1401\n404#2:1402\n404#2:1403\n404#2:1404\n404#2:1405\n1#3:1406\n27#4,7:1407\n27#4,7:1414\n27#4,7:1421\n27#4,7:1428\n44#4,8:1435\n44#4,8:1443\n44#4,8:1451\n44#4,8:1459\n44#4,8:1467\n27#4,7:1475\n*S KotlinDebug\n*F\n+ 1 LivePrice.kt\ncom/sports/insider/ui/views/LivePrice\n*L\n128#1:1399\n129#1:1400\n130#1:1401\n131#1:1402\n132#1:1403\n133#1:1404\n134#1:1405\n699#1:1407,7\n702#1:1414,7\n722#1:1421,7\n725#1:1428,7\n792#1:1435,8\n803#1:1443,8\n812#1:1451,8\n829#1:1459,8\n839#1:1467,8\n868#1:1475,7\n*E\n"})
/* loaded from: classes.dex */
public final class LivePrice extends View {

    /* renamed from: A, reason: from kotlin metadata */
    public final float innerRadius;
    public Layout A0;
    public boolean B;
    public Layout B0;
    public final Paint C;
    public SpannableString C0;
    public LinearGradient D;
    public SpannableString D0;
    public final Paint E;
    public final TextPaint E0;
    public LinearGradient F;
    public Layout F0;

    /* renamed from: G, reason: from kotlin metadata */
    public final float paddingInnerPanel;
    public Layout G0;
    public final float H;
    public SpannableString H0;
    public final float I;
    public SpannableString I0;
    public final Path J;
    public final TextPaint J0;
    public RectF K;
    public final TextPaint K0;
    public RectF L;
    public final TextPaint L0;
    public Layout M0;
    public Layout N0;
    public Layout O0;
    public Layout P0;
    public final TextPaint Q0;
    public final TextPaint R0;
    public Layout S0;
    public Layout T0;
    public SpannableString U0;
    public SpannableString V0;
    public SpannableString W0;
    public SpannableString X0;
    public d Y0;
    public d Z0;

    /* renamed from: a, reason: collision with root package name */
    public GestureDetector f7590a;

    /* renamed from: a1, reason: collision with root package name */
    public d f7591a1;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f7592b;

    /* renamed from: b1, reason: collision with root package name */
    public d f7593b1;

    /* renamed from: c, reason: collision with root package name */
    public int f7594c;

    /* renamed from: c1, reason: collision with root package name */
    public SpannableString f7595c1;

    /* renamed from: d, reason: collision with root package name */
    public int f7596d;
    public SpannableString d1;

    /* renamed from: e, reason: collision with root package name */
    public int f7597e;

    /* renamed from: e1, reason: collision with root package name */
    public final Rect f7598e1;

    /* renamed from: f, reason: collision with root package name */
    public int f7599f;

    /* renamed from: f1, reason: collision with root package name */
    public final Rect f7600f1;

    /* renamed from: g, reason: collision with root package name */
    public final float f7601g;

    /* renamed from: g0, reason: collision with root package name */
    public LinearGradient f7602g0;

    /* renamed from: g1, reason: collision with root package name */
    public final TextPaint f7603g1;

    /* renamed from: h, reason: collision with root package name */
    public final float f7604h;

    /* renamed from: h0, reason: collision with root package name */
    public final Paint f7605h0;

    /* renamed from: h1, reason: collision with root package name */
    public Layout f7606h1;

    /* renamed from: i, reason: collision with root package name */
    public final String f7607i;

    /* renamed from: i0, reason: collision with root package name */
    public RectF f7608i0;

    /* renamed from: i1, reason: collision with root package name */
    public Layout f7609i1;
    public Path j;
    public RectF j0;

    /* renamed from: j1, reason: collision with root package name */
    public int f7610j1;

    /* renamed from: k, reason: collision with root package name */
    public Path f7611k;
    public LinearGradient k0;

    /* renamed from: k1, reason: collision with root package name */
    public int f7612k1;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f7613l;

    /* renamed from: l0, reason: collision with root package name */
    public final Paint f7614l0;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f7615l1;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f7616m;

    /* renamed from: m0, reason: collision with root package name */
    public final int f7617m0;

    /* renamed from: m1, reason: collision with root package name */
    public y f7618m1;

    /* renamed from: n, reason: collision with root package name */
    public Path f7619n;

    /* renamed from: n0, reason: collision with root package name */
    public final int f7620n0;

    /* renamed from: o, reason: collision with root package name */
    public Path f7621o;

    /* renamed from: o0, reason: collision with root package name */
    public final int f7622o0;

    /* renamed from: p, reason: collision with root package name */
    public RectF f7623p;

    /* renamed from: p0, reason: collision with root package name */
    public final int f7624p0;
    public RectF q;

    /* renamed from: q0, reason: collision with root package name */
    public final int f7625q0;

    /* renamed from: r, reason: collision with root package name */
    public LinearGradient f7626r;

    /* renamed from: r0, reason: collision with root package name */
    public final int f7627r0;

    /* renamed from: s, reason: collision with root package name */
    public LinearGradient f7628s;

    /* renamed from: s0, reason: collision with root package name */
    public final int f7629s0;

    /* renamed from: t, reason: collision with root package name */
    public LinearGradient f7630t;

    /* renamed from: t0, reason: collision with root package name */
    public final float f7631t0;

    /* renamed from: u, reason: collision with root package name */
    public LinearGradient f7632u;

    /* renamed from: u0, reason: collision with root package name */
    public final float f7633u0;

    /* renamed from: v, reason: collision with root package name */
    public final Paint f7634v;

    /* renamed from: v0, reason: collision with root package name */
    public final float f7635v0;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f7636w;

    /* renamed from: w0, reason: collision with root package name */
    public final float f7637w0;

    /* renamed from: x, reason: collision with root package name */
    public final Path f7638x;
    public final Typeface x0;

    /* renamed from: y, reason: collision with root package name */
    public final Path f7639y;

    /* renamed from: y0, reason: collision with root package name */
    public final Typeface f7640y0;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final float outerRadius;
    public final TextPaint z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePrice(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearGradient linearGradient;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7601g = 15.0f;
        this.f7604h = 5.0f;
        this.f7607i = "Payment launch";
        Paint paint = new Paint(1);
        this.f7613l = paint;
        Paint paint2 = new Paint(1);
        this.f7616m = paint2;
        this.f7623p = new RectF();
        this.q = new RectF();
        Paint paint3 = new Paint(1);
        this.f7634v = paint3;
        Paint paint4 = new Paint(1);
        this.f7636w = paint4;
        this.f7638x = new Path();
        this.f7639y = new Path();
        this.outerRadius = 20.0f;
        this.innerRadius = 16.0f;
        Paint paint5 = new Paint(1);
        this.C = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        this.paddingInnerPanel = 9.0f;
        this.H = 11.0f;
        this.J = new Path();
        this.K = new RectF();
        this.L = new RectF();
        Paint paint7 = new Paint(1);
        this.f7605h0 = paint7;
        this.f7608i0 = new RectF();
        this.j0 = new RectF();
        Paint paint8 = new Paint(1);
        this.f7614l0 = paint8;
        TextPaint textPaint = new TextPaint(1);
        this.z0 = textPaint;
        this.C0 = new SpannableString("");
        this.D0 = new SpannableString("");
        TextPaint textPaint2 = new TextPaint(1);
        this.E0 = textPaint2;
        this.H0 = new SpannableString("");
        this.I0 = new SpannableString("");
        TextPaint textPaint3 = new TextPaint(1);
        this.J0 = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        this.K0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.L0 = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        this.Q0 = textPaint6;
        TextPaint textPaint7 = new TextPaint(1);
        this.R0 = textPaint7;
        this.W0 = new SpannableString("");
        this.X0 = new SpannableString("");
        this.f7595c1 = new SpannableString("Payment launch");
        this.d1 = new SpannableString("Payment launch");
        this.f7598e1 = new Rect();
        this.f7600f1 = new Rect();
        TextPaint textPaint8 = new TextPaint(1);
        this.f7603g1 = textPaint8;
        this.f7610j1 = 10;
        this.f7612k1 = 10;
        this.f7617m0 = Color.parseColor("#D7D7D7");
        this.f7620n0 = Color.parseColor("#e50957EE");
        this.f7622o0 = Color.parseColor("#e57B14CC");
        this.f7624p0 = Color.parseColor("#800957ee");
        this.f7625q0 = Color.parseColor("#807b14cc");
        this.f7627r0 = Color.parseColor("#FF0957EE");
        this.f7629s0 = Color.parseColor("#FF7B14CC");
        this.f7592b = a.b(context, "getDisplayMetrics(...)");
        Typeface DEFAULT_BOLD = ((i) getResourceGetter()).a();
        if (DEFAULT_BOLD == null && (DEFAULT_BOLD = l.b(context, R.font.arimo_bold)) == null) {
            DEFAULT_BOLD = Typeface.DEFAULT_BOLD;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_BOLD, "DEFAULT_BOLD");
        }
        this.x0 = DEFAULT_BOLD;
        Typeface DEFAULT = ((i) getResourceGetter()).b();
        if (DEFAULT == null && (DEFAULT = l.b(context, R.font.arimo_regular)) == null) {
            DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        }
        this.f7640y0 = DEFAULT;
        this.f7594c = 0;
        float f6 = 15;
        DisplayMetrics displayMetrics = this.f7592b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        this.f7601g = f6 * displayMetrics.density;
        float f10 = 5;
        DisplayMetrics displayMetrics2 = this.f7592b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        this.f7604h = f10 * displayMetrics2.density;
        float f11 = 11;
        DisplayMetrics displayMetrics3 = this.f7592b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        this.H = f11 * displayMetrics3.density;
        float f12 = 2;
        DisplayMetrics displayMetrics4 = this.f7592b;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        this.I = f12 * displayMetrics4.density;
        float f13 = 16;
        DisplayMetrics displayMetrics5 = this.f7592b;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        this.f7631t0 = f13 * displayMetrics5.density;
        float f14 = 24;
        DisplayMetrics displayMetrics6 = this.f7592b;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics6 = null;
        }
        this.f7633u0 = displayMetrics6.density * f14;
        DisplayMetrics displayMetrics7 = this.f7592b;
        if (displayMetrics7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics7 = null;
        }
        this.f7635v0 = f14 * displayMetrics7.density;
        float f15 = 10;
        DisplayMetrics displayMetrics8 = this.f7592b;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics8 = null;
        }
        this.f7637w0 = f15 * displayMetrics8.density;
        float f16 = this.f7597e / 2.0f;
        RectF rectF = new RectF(0.0f, f16, this.f7596d, f16);
        float f17 = this.f7597e / 2.0f;
        RectF rectF2 = new RectF(0.0f, f17, this.f7596d, f17);
        e(rectF, rectF2);
        Paint.Style style = Paint.Style.FILL;
        paint7.setStyle(style);
        LinearGradient linearGradient2 = this.f7602g0;
        if (linearGradient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameLeft");
            linearGradient2 = null;
        }
        paint7.setShader(linearGradient2);
        paint8.setStyle(style);
        LinearGradient linearGradient3 = this.k0;
        if (linearGradient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameRight");
            linearGradient3 = null;
        }
        paint8.setShader(linearGradient3);
        d(rectF, rectF2);
        g(rectF, rectF2);
        paint3.setStyle(style);
        LinearGradient linearGradient4 = this.f7630t;
        if (linearGradient4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarLeft");
            linearGradient4 = null;
        }
        paint3.setShader(linearGradient4);
        paint4.setStyle(style);
        LinearGradient linearGradient5 = this.f7632u;
        if (linearGradient5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarRight");
            linearGradient5 = null;
        }
        paint4.setShader(linearGradient5);
        f(rectF, rectF2);
        paint5.setStyle(style);
        LinearGradient linearGradient6 = this.D;
        if (linearGradient6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedLeft");
            linearGradient6 = null;
        }
        paint5.setShader(linearGradient6);
        paint6.setStyle(style);
        LinearGradient linearGradient7 = this.F;
        if (linearGradient7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedRight");
            linearGradient7 = null;
        }
        paint6.setShader(linearGradient7);
        paint.setStyle(style);
        if (this.B) {
            linearGradient = this.f7628s;
            if (linearGradient == null) {
                str = "shaderIcOkRight";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                linearGradient = null;
            }
        } else {
            linearGradient = this.f7626r;
            if (linearGradient == null) {
                str = "shaderIcOkLeft";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                linearGradient = null;
            }
        }
        paint.setShader(linearGradient);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        DisplayMetrics displayMetrics9 = this.f7592b;
        if (displayMetrics9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics9 = null;
        }
        paint2.setStrokeWidth(displayMetrics9.density * 2.0f);
        Typeface typeface = this.f7640y0;
        if (typeface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            typeface = null;
        }
        textPaint8.setTypeface(typeface);
        textPaint8.setLetterSpacing(0.1f);
        DisplayMetrics displayMetrics10 = this.f7592b;
        if (displayMetrics10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics10 = null;
        }
        textPaint8.setStrokeWidth(h0.l(displayMetrics10, 1.0f));
        textPaint8.setColor(-1);
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        textPaint8.setStyle(style2);
        DisplayMetrics displayMetrics11 = this.f7592b;
        if (displayMetrics11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics11 = null;
        }
        textPaint8.setTextSize(h0.l(displayMetrics11, 11.0f));
        Typeface typeface2 = this.x0;
        if (typeface2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface2 = null;
        }
        textPaint.setTypeface(typeface2);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setStrokeWidth(0.0f);
        textPaint.setColor(-1);
        textPaint.setStyle(style2);
        DisplayMetrics displayMetrics12 = this.f7592b;
        if (displayMetrics12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics12 = null;
        }
        textPaint.setTextSize(h0.l(displayMetrics12, 16.0f));
        Typeface typeface3 = this.f7640y0;
        if (typeface3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            typeface3 = null;
        }
        textPaint2.setTypeface(typeface3);
        textPaint2.setLetterSpacing(0.0f);
        textPaint2.setStrokeWidth(0.0f);
        textPaint2.setColor(this.f7617m0);
        textPaint2.setStyle(style2);
        DisplayMetrics displayMetrics13 = this.f7592b;
        if (displayMetrics13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics13 = null;
        }
        textPaint2.setTextSize(h0.l(displayMetrics13, 10.0f));
        Typeface typeface4 = this.x0;
        if (typeface4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface4 = null;
        }
        textPaint6.setTypeface(typeface4);
        textPaint6.setLetterSpacing(0.0f);
        textPaint6.setStrokeWidth(0.0f);
        textPaint6.setColor(-1);
        textPaint6.setStyle(style2);
        DisplayMetrics displayMetrics14 = this.f7592b;
        if (displayMetrics14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics14 = null;
        }
        textPaint6.setTextSize(h0.l(displayMetrics14, 15.0f));
        Typeface typeface5 = this.x0;
        if (typeface5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface5 = null;
        }
        textPaint7.setTypeface(typeface5);
        textPaint7.setLetterSpacing(0.0f);
        textPaint7.setStrokeWidth(0.0f);
        textPaint7.setColor(-1);
        textPaint7.setStyle(style2);
        DisplayMetrics displayMetrics15 = this.f7592b;
        if (displayMetrics15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics15 = null;
        }
        textPaint7.setTextSize(h0.l(displayMetrics15, 18.0f));
        Typeface typeface6 = this.x0;
        if (typeface6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface6 = null;
        }
        textPaint4.setTypeface(typeface6);
        textPaint4.setLetterSpacing(0.0f);
        textPaint4.setStrokeWidth(0.0f);
        textPaint4.setColor(-1);
        textPaint4.setStyle(style2);
        DisplayMetrics displayMetrics16 = this.f7592b;
        if (displayMetrics16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics16 = null;
        }
        textPaint4.setTextSize(h0.l(displayMetrics16, 11.0f));
        Typeface typeface7 = this.x0;
        if (typeface7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface7 = null;
        }
        textPaint5.setTypeface(typeface7);
        textPaint5.setLetterSpacing(0.0f);
        textPaint5.setStrokeWidth(0.0f);
        textPaint5.setColor(-1);
        textPaint5.setStyle(style2);
        DisplayMetrics displayMetrics17 = this.f7592b;
        if (displayMetrics17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics17 = null;
        }
        textPaint5.setTextSize(h0.l(displayMetrics17, 10.0f));
        Typeface typeface8 = this.f7640y0;
        if (typeface8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            typeface8 = null;
        }
        textPaint3.setTypeface(typeface8);
        textPaint3.setUnderlineText(true);
        textPaint3.setLetterSpacing(0.0f);
        textPaint3.setStrokeWidth(0.0f);
        textPaint3.setColor(-1);
        textPaint3.setStyle(style2);
        DisplayMetrics displayMetrics18 = this.f7592b;
        if (displayMetrics18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics18 = null;
        }
        textPaint3.setTextSize(h0.l(displayMetrics18, 12.0f));
    }

    public static int b(Double d10, Double d11) {
        if (d10 == null || d11 == null || d10.doubleValue() <= 0.0d || d11.doubleValue() <= 0.0d) {
            return 0;
        }
        return (int) Math.abs(((d10.doubleValue() - d11.doubleValue()) / d10.doubleValue()) * 100);
    }

    public static Layout c(LivePrice livePrice, CharSequence charSequence, Integer num, TextPaint textPaint, int i5) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        if ((i5 & 2) != 0) {
            num = null;
        }
        boolean z5 = (i5 & 8) != 0;
        float f6 = (i5 & 64) != 0 ? 0.0f : 1.0f;
        if (Build.VERSION.SDK_INT >= 28) {
            DynamicLayout build = DynamicLayout.Builder.obtain(charSequence, textPaint, num != null ? num.intValue() : (int) textPaint.measureText(charSequence.toString())).setAlignment(alignment).setIncludePad(z5).setLineSpacing(0.0f, f6).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
        StaticLayout build2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, num != null ? num.intValue() : (int) textPaint.measureText(charSequence.toString())).setAlignment(alignment).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(z5).setLineSpacing(0.0f, f6).setMaxLines(Integer.MAX_VALUE).build();
        Intrinsics.checkNotNull(build2);
        return build2;
    }

    private final float getCenterXAbsolute() {
        return this.f7596d / 2;
    }

    private final int getHeightTextLayoutHintFirst() {
        Layout layout = this.O0;
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    private final int getHeightTextLayoutHintSecond() {
        Layout layout = this.P0;
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    private final float getInnerRadius() {
        DisplayMetrics displayMetrics = this.f7592b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return this.innerRadius * displayMetrics.density;
    }

    private final int getMaxTextLayoutHintTrial() {
        int max = Math.max(getHeightTextLayoutHintFirst(), getHeightTextLayoutHintSecond());
        return max > 0 ? max + ((int) this.f7601g) : max;
    }

    private final float getOuterRadius() {
        DisplayMetrics displayMetrics = this.f7592b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return this.outerRadius * displayMetrics.density;
    }

    private final float getPaddingInnerPanel() {
        DisplayMetrics displayMetrics = this.f7592b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return this.paddingInnerPanel * displayMetrics.density;
    }

    private final float getRadiusStar() {
        return getOuterRadius() / 2;
    }

    private final g getResourceGetter() {
        return (g) y3.m(g.class, null, 6);
    }

    public static boolean h() {
        String str = gc.d.f9945a;
        return Intrinsics.areEqual(d2.i.c(), "ru");
    }

    public static final String i(LivePrice livePrice, d dVar) {
        int intValue;
        int intValue2;
        Pair j = b.j(dVar != null ? (String) dVar.f11093e : null);
        if (j == null) {
            return "";
        }
        Object obj = j.f19192a;
        Character ch2 = (Character) j.f19193b;
        if ((ch2.charValue() == 'D' && ((Number) obj).intValue() == 7) || (ch2.charValue() == 'W' && ((Number) obj).intValue() == 1)) {
            return h() ? "в неделю" : "per week";
        }
        if ((ch2.charValue() == 'M' && ((Number) obj).intValue() == 1) || ((ch2.charValue() == 'D' && 28 <= (intValue2 = ((Number) obj).intValue()) && intValue2 < 32) || (ch2.charValue() == 'W' && 3 <= (intValue = ((Number) obj).intValue()) && intValue < 5))) {
            return h() ? "в месяц" : "per month";
        }
        if ((ch2.charValue() != 'W' || ((Number) obj).intValue() <= 1) && ((ch2.charValue() != 'M' || ((Number) obj).intValue() <= 1) && (ch2.charValue() != 'D' || ((Number) obj).intValue() <= 0))) {
            return "";
        }
        if (b.k(dVar != null ? (String) dVar.f11093e : null, livePrice.getResources()) == null) {
            return "";
        }
        StringBuilder sb2 = h() ? new StringBuilder("в ") : new StringBuilder("per ");
        sb2.append(j);
        return sb2.toString();
    }

    public final int a() {
        float f6 = 13;
        DisplayMetrics displayMetrics = null;
        DisplayMetrics displayMetrics2 = this.f7592b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        float f10 = (displayMetrics2.density * f6) + this.f7631t0;
        Layout layout = this.A0;
        int height = layout != null ? layout.getHeight() : 0;
        float max = f10 + Math.max(height, this.B0 != null ? r6.getHeight() : 0);
        float f11 = 10;
        DisplayMetrics displayMetrics3 = this.f7592b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        float f12 = (displayMetrics3.density * f11) + max;
        Layout layout2 = this.S0;
        int height2 = layout2 != null ? layout2.getHeight() : 0;
        float max2 = f12 + Math.max(height2, this.T0 != null ? r7.getHeight() : 0);
        float f13 = 3;
        DisplayMetrics displayMetrics4 = this.f7592b;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        float f14 = (f13 * displayMetrics4.density) + max2;
        Layout layout3 = this.F0;
        int height3 = layout3 != null ? layout3.getHeight() : 0;
        float max3 = f14 + Math.max(height3, this.G0 != null ? r7.getHeight() : 0);
        DisplayMetrics displayMetrics5 = this.f7592b;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        float f15 = (f11 * displayMetrics5.density) + max3;
        Layout layout4 = this.M0;
        int height4 = layout4 != null ? layout4.getHeight() : 0;
        float max4 = f15 + Math.max(height4, this.N0 != null ? r6.getHeight() : 0);
        DisplayMetrics displayMetrics6 = this.f7592b;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics6;
        }
        return (int) ((f6 * displayMetrics.density) + max4 + this.f7637w0 + ((getHeightTextLayoutHintFirst() == 0 && getHeightTextLayoutHintSecond() == 0) ? 0.0f : getMaxTextLayoutHintTrial() + this.f7637w0));
    }

    public final void d(RectF rectF, RectF rectF2) {
        float f6 = rectF.left;
        float f10 = rectF.top;
        float f11 = rectF.right;
        float f12 = rectF.bottom;
        int i5 = this.f7624p0;
        int i10 = this.f7625q0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.D = new LinearGradient(f6, f10, f11, f12, new int[]{i5, i10}, (float[]) null, tileMode);
        this.F = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, new int[]{i5, i10}, (float[]) null, tileMode);
    }

    public final void e(RectF rectF, RectF rectF2) {
        float f6 = rectF.left;
        float f10 = rectF.top;
        float f11 = rectF.right;
        float f12 = rectF.bottom;
        int i5 = this.f7620n0;
        int i10 = this.f7622o0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7602g0 = new LinearGradient(f6, f10, f11, f12, new int[]{i5, i10}, (float[]) null, tileMode);
        this.k0 = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, new int[]{i5, i10}, (float[]) null, tileMode);
    }

    public final void f(RectF rectF, RectF rectF2) {
        float f6 = rectF.left;
        float f10 = rectF.top;
        float f11 = rectF.right;
        float f12 = rectF.bottom;
        int i5 = this.f7627r0;
        int i10 = this.f7629s0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7626r = new LinearGradient(f6, f10, f11, f12, new int[]{i5, i10}, (float[]) null, tileMode);
        this.f7628s = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, new int[]{i5, i10}, (float[]) null, tileMode);
    }

    public final void g(RectF rectF, RectF rectF2) {
        float outerRadius = rectF.right - getOuterRadius();
        float outerRadius2 = ((rectF.bottom - rectF.top) / 2.0f) - getOuterRadius();
        float outerRadius3 = rectF.right + getOuterRadius();
        float outerRadius4 = ((rectF.bottom - rectF.top) / 2.0f) + getOuterRadius();
        int i5 = this.f7627r0;
        int i10 = this.f7629s0;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7630t = new LinearGradient(outerRadius, outerRadius2, outerRadius3, outerRadius4, new int[]{i5, i10}, (float[]) null, tileMode);
        this.f7632u = new LinearGradient(rectF2.right - getOuterRadius(), ((rectF2.bottom - rectF2.top) / 2.0f) - getOuterRadius(), rectF2.right + getOuterRadius(), ((rectF2.bottom - rectF2.top) / 2.0f) + getOuterRadius(), new int[]{i5, i10}, (float[]) null, tileMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        String str;
        String str2;
        int i5;
        d dVar;
        Long l6;
        int b10;
        d dVar2;
        Long l10;
        int b11;
        d dVar3;
        Long l11;
        long longValue;
        int b12;
        d dVar4;
        d dVar5;
        d dVar6;
        CharSequence charSequence;
        SpannableString spannableString;
        d dVar7;
        SpannableString spannableString2;
        LinearGradient linearGradient;
        String str3;
        float f6;
        Integer num;
        SpannableString spannableString3;
        SpannableString spannableString4;
        int a7;
        Character valueOf;
        String str4;
        String str5;
        String str6;
        Character valueOf2;
        d dVar8;
        String str7;
        String str8;
        SpannableString spannableString5;
        SpannableString spannableString6;
        StringBuilder sb2;
        this.W0 = new SpannableString("");
        this.X0 = new SpannableString("");
        d dVar9 = this.Y0;
        int i10 = dVar9 != null ? dVar9.f11090b : 0;
        if (i10 <= 0) {
            str = h() ? "Неделя прогнозов" : "Week access";
        } else if (this.f7615l1) {
            str = h() ? "1 ₽ за 7 дней, далее" : "1 ₽ for 7 days, then";
        } else {
            if (h()) {
                sb2 = new StringBuilder();
                sb2.append(i10);
                sb2.append(" дня бесплатно, далее");
            } else {
                sb2 = new StringBuilder();
                sb2.append(i10);
                sb2.append(" days free, then");
            }
            str = sb2.toString();
        }
        this.C0 = new SpannableString(str);
        d dVar10 = this.f7591a1;
        int i11 = dVar10 != null ? dVar10.f11090b : 0;
        if (i11 <= 0) {
            str2 = h() ? "Месяц прогнозов" : "Month access";
        } else if (h()) {
            str2 = i11 + " дня бесплатно, далее";
        } else {
            str2 = i11 + " days free, then";
        }
        this.D0 = new SpannableString(str2);
        String str9 = h() ? "за прогноз" : "for a prediction";
        d dVar11 = this.Y0;
        this.H0 = new SpannableString(dVar11 == null ? "" : dVar11.f11089a ? str9 : i(this, dVar11));
        d dVar12 = this.f7591a1;
        if (dVar12 == null) {
            str9 = "";
        } else if (!dVar12.f11089a) {
            str9 = i(this, dVar12);
        }
        this.I0 = new SpannableString(str9);
        d dVar13 = this.Y0;
        if (dVar13 != null) {
            Long l12 = (Long) dVar13.f11091c;
            if (this.Z0 != null) {
                if (((String) dVar13.f11094f) != null) {
                    l12 = (Long) dVar13.f11092d;
                }
                i5 = b(Double.valueOf(l12.longValue()), this.Z0 != null ? Double.valueOf(((Long) r5.f11091c).longValue()) : null);
                dVar = this.f7591a1;
                if ((dVar == null ? (String) dVar.f11094f : null) != null) {
                    if (dVar != null) {
                        l6 = (Long) dVar.f11091c;
                    }
                    l6 = null;
                } else if (dVar != null) {
                    l6 = (Long) dVar.f11092d;
                } else {
                    if (dVar != null) {
                        l6 = (Long) dVar.f11091c;
                    }
                    l6 = null;
                }
                b10 = b(l6 == null ? Double.valueOf(l6.longValue()) : null, this.f7593b1 == null ? Double.valueOf(((Long) r7.f11091c).longValue()) : null);
                dVar2 = this.Z0;
                if ((dVar2 == null ? (String) dVar2.f11094f : null) != null) {
                    if (dVar2 != null) {
                        l10 = (Long) dVar2.f11091c;
                    }
                    l10 = null;
                } else if (dVar2 != null) {
                    l10 = (Long) dVar2.f11092d;
                } else {
                    if (dVar2 != null) {
                        l10 = (Long) dVar2.f11091c;
                    }
                    l10 = null;
                }
                b11 = b(l10 == null ? Double.valueOf(l10.longValue() * 4) : null, this.f7591a1 == null ? Double.valueOf(((Long) r9.f11091c).longValue()) : null);
                dVar3 = this.Y0;
                if ((dVar3 == null ? (String) dVar3.f11094f : null) != null) {
                    if (dVar3 != null) {
                        l11 = (Long) dVar3.f11091c;
                    }
                    l11 = null;
                } else {
                    if (dVar3 != null) {
                        l11 = (Long) dVar3.f11092d;
                    }
                    l11 = null;
                }
                if (l11 == null) {
                    longValue = l11.longValue();
                } else {
                    Long l13 = dVar3 != null ? (Long) dVar3.f11091c : null;
                    longValue = l13 != null ? l13.longValue() : 0L;
                }
                b12 = b(Double.valueOf(longValue * 4), this.f7591a1 == null ? Double.valueOf(((Long) r13.f11091c).longValue()) : null);
                if (b10 > b11 || b10 <= b12) {
                    b10 = (b11 > b10 || b11 <= b12) ? (b12 > b10 || b12 <= b11) ? 0 : b12 : b11;
                }
                if (this.f7610j1 != i5) {
                    this.f7610j1 = i5;
                    j();
                }
                if (this.f7612k1 != b10) {
                    this.f7612k1 = b10;
                    j();
                }
                dVar4 = this.f7591a1;
                String str10 = this.f7607i;
                if (dVar4 != null) {
                    String str11 = (String) dVar4.f11095g;
                    if (str11 == null) {
                        spannableString6 = new SpannableString(str10);
                    } else {
                        d dVar14 = this.f7593b1;
                        if (dVar14 == null || ((Long) dVar14.f11091c).longValue() == 0) {
                            spannableString6 = new SpannableString(str11);
                        } else {
                            d dVar15 = this.f7593b1;
                            spannableString6 = l(dVar15 != null ? ((Long) dVar15.f11091c).longValue() : 0L, str11);
                        }
                    }
                    this.d1 = spannableString6;
                }
                dVar5 = this.Y0;
                if (dVar5 != null) {
                    String str12 = (String) dVar5.f11095g;
                    if (str12 == null) {
                        spannableString5 = new SpannableString(str10);
                    } else {
                        d dVar16 = this.Z0;
                        if (dVar16 == null || ((Long) dVar16.f11091c).longValue() == 0) {
                            spannableString5 = new SpannableString(str12);
                        } else {
                            d dVar17 = this.Z0;
                            spannableString5 = l(dVar17 != null ? ((Long) dVar17.f11091c).longValue() : 0L, str12);
                        }
                    }
                    this.f7595c1 = spannableString5;
                }
                dVar6 = this.Y0;
                String str13 = "in month";
                if (dVar6 == null) {
                    charSequence = "Terms of purchase and return";
                    if (!dVar6.f11089a) {
                        int i12 = dVar6.f11090b;
                        if (i12 > 0) {
                            String str14 = (String) dVar6.f11095g;
                            if (str14 == null) {
                                str14 = "";
                            }
                            if (this.f7615l1) {
                                if (h()) {
                                    str8 = "Пробный период 7 дней за 1₽, далее " + str14 + ' ' + ((Object) this.H0);
                                } else {
                                    str8 = "Trial period of 7 days for 1₽, then " + str14 + ' ' + ((Object) this.H0);
                                }
                            } else if (h()) {
                                str8 = "Бесплатный пробный период " + i12 + " дня, далее " + str14 + ' ' + ((Object) this.H0);
                            } else {
                                str8 = "Free trial period of " + i12 + " days, then " + str14 + ' ' + ((Object) this.H0);
                            }
                        } else {
                            d dVar18 = this.f7591a1;
                            String str15 = dVar18 != null ? (String) dVar18.f11093e : null;
                            if (str15 != null) {
                                String upperCase = str15.toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                char[] charArray = upperCase.toCharArray();
                                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                                if (charArray.length == 3 && charArray[0] == 'P') {
                                    valueOf2 = Character.valueOf(charArray[2]);
                                    String str16 = (valueOf2 != null && valueOf2.charValue() == 'W') ? !h() ? "в неделю" : "in week" : (valueOf2 != null && valueOf2.charValue() == 'M') ? !h() ? "в месяц" : "in month" : "";
                                    dVar8 = this.f7591a1;
                                    if (dVar8 != null || (str7 = (String) dVar8.f11096h) == null) {
                                        str7 = "";
                                    }
                                    if (h()) {
                                        str8 = str7 + '/' + str16 + " Subscription terms";
                                    } else {
                                        str8 = str7 + '/' + str16 + " Условия подписки";
                                    }
                                }
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                                dVar8 = this.f7591a1;
                                if (dVar8 != null) {
                                }
                                str7 = "";
                                if (h()) {
                                }
                            }
                            if (valueOf2 != null) {
                                dVar8 = this.f7591a1;
                                if (dVar8 != null) {
                                }
                                str7 = "";
                                if (h()) {
                                }
                            }
                            dVar8 = this.f7591a1;
                            if (dVar8 != null) {
                            }
                            str7 = "";
                            if (h()) {
                            }
                        }
                        spannableString = new SpannableString(str8);
                        this.U0 = spannableString;
                        dVar7 = this.f7591a1;
                        if (dVar7 != null || dVar7.f11089a) {
                            spannableString2 = new SpannableString(h() ? "Условия покупки и возврата" : charSequence);
                        } else {
                            int i13 = dVar7.f11090b;
                            if (i13 > 0) {
                                String str17 = (String) dVar7.f11095g;
                                if (str17 == null) {
                                    str17 = "";
                                }
                                if (h()) {
                                    str6 = "Бесплатный пробный период " + i13 + " дня, далее " + str17 + ' ' + ((Object) this.I0);
                                } else {
                                    str6 = "Free trial period of " + i13 + " days, then " + str17 + ' ' + ((Object) this.I0);
                                }
                                spannableString2 = new SpannableString(str6);
                            } else {
                                String str18 = (String) dVar7.f11093e;
                                if (str18 != null) {
                                    String upperCase2 = str18.toUpperCase(Locale.ROOT);
                                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                                    char[] charArray2 = upperCase2.toCharArray();
                                    Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
                                    if (charArray2.length == 3 && charArray2[0] == 'P') {
                                        valueOf = Character.valueOf(charArray2[2]);
                                        if (valueOf != null && valueOf.charValue() == 'W') {
                                            str13 = !h() ? "в неделю" : "in week";
                                        } else if (valueOf == null || valueOf.charValue() != 'M') {
                                            str13 = "";
                                        } else if (h()) {
                                            str13 = "в месяц";
                                        }
                                        d dVar19 = this.f7591a1;
                                        String str19 = (dVar19 != null || (str5 = (String) dVar19.f11096h) == null) ? "" : str5;
                                        if (h()) {
                                            str4 = str19 + '/' + str13 + " Subscription terms";
                                        } else {
                                            str4 = str19 + '/' + str13 + " Условия подписки";
                                        }
                                        spannableString2 = new SpannableString(str4);
                                    }
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                    if (!h()) {
                                    }
                                    d dVar192 = this.f7591a1;
                                    if (dVar192 != null) {
                                    }
                                    if (h()) {
                                    }
                                    spannableString2 = new SpannableString(str4);
                                }
                                if (valueOf == null) {
                                    if (h()) {
                                    }
                                    d dVar1922 = this.f7591a1;
                                    if (dVar1922 != null) {
                                    }
                                    if (h()) {
                                    }
                                    spannableString2 = new SpannableString(str4);
                                }
                                str13 = "";
                                d dVar19222 = this.f7591a1;
                                if (dVar19222 != null) {
                                }
                                if (h()) {
                                }
                                spannableString2 = new SpannableString(str4);
                            }
                        }
                        this.V0 = spannableString2;
                        if (this.B) {
                            linearGradient = this.f7628s;
                            if (linearGradient == null) {
                                str3 = "shaderIcOkRight";
                                Intrinsics.throwUninitializedPropertyAccessException(str3);
                                linearGradient = null;
                            }
                        } else {
                            linearGradient = this.f7626r;
                            if (linearGradient == null) {
                                str3 = "shaderIcOkLeft";
                                Intrinsics.throwUninitializedPropertyAccessException(str3);
                                linearGradient = null;
                            }
                        }
                        this.f7613l.setShader(linearGradient);
                        String i14 = e.i(new StringBuilder("-"), this.f7610j1, '%');
                        int length = i14.length();
                        Rect rect = this.f7598e1;
                        TextPaint textPaint = this.f7603g1;
                        textPaint.getTextBounds(i14, 0, length, rect);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        this.f7606h1 = c(this, i14, null, textPaint, 106);
                        String i15 = e.i(new StringBuilder("-"), this.f7612k1, '%');
                        textPaint.getTextBounds(i15, 0, i15.length(), this.f7600f1);
                        this.f7609i1 = c(this, i15, null, textPaint, 106);
                        SpannableString spannableString7 = this.C0;
                        f6 = 2;
                        int paddingInnerPanel = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                        Integer valueOf3 = paddingInnerPanel > 0 ? Integer.valueOf(paddingInnerPanel) : null;
                        TextPaint textPaint2 = this.z0;
                        this.A0 = c(this, spannableString7, valueOf3, textPaint2, 32);
                        SpannableString spannableString8 = this.D0;
                        int paddingInnerPanel2 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                        this.B0 = c(this, spannableString8, paddingInnerPanel2 > 0 ? Integer.valueOf(paddingInnerPanel2) : null, textPaint2, 32);
                        SpannableString spannableString9 = this.H0;
                        int paddingInnerPanel3 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                        Integer valueOf4 = paddingInnerPanel3 > 0 ? Integer.valueOf(paddingInnerPanel3) : null;
                        TextPaint textPaint3 = this.E0;
                        this.F0 = c(this, spannableString9, valueOf4, textPaint3, 96);
                        SpannableString spannableString10 = this.I0;
                        int paddingInnerPanel4 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                        this.G0 = c(this, spannableString10, paddingInnerPanel4 > 0 ? Integer.valueOf(paddingInnerPanel4) : null, textPaint3, 96);
                        SpannableString spannableString11 = this.f7595c1;
                        int paddingInnerPanel5 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                        this.S0 = c(this, spannableString11, paddingInnerPanel5 > 0 ? Integer.valueOf(paddingInnerPanel5) : null, this.Q0, 32);
                        SpannableString spannableString12 = this.d1;
                        int paddingInnerPanel6 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                        this.T0 = c(this, spannableString12, paddingInnerPanel6 > 0 ? Integer.valueOf(paddingInnerPanel6) : null, this.R0, 32);
                        if (this.W0.length() == 0 || this.X0.length() != 0) {
                            num = null;
                            SpannableString spannableString13 = this.W0;
                            int paddingInnerPanel7 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                            this.M0 = c(this, spannableString13, paddingInnerPanel7 > 0 ? Integer.valueOf(paddingInnerPanel7) : null, this.K0, 32);
                            SpannableString spannableString14 = this.X0;
                            int paddingInnerPanel8 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                            this.N0 = c(this, spannableString14, paddingInnerPanel8 > 0 ? Integer.valueOf(paddingInnerPanel8) : null, this.L0, 32);
                        } else {
                            num = null;
                            this.M0 = null;
                            this.N0 = null;
                        }
                        spannableString3 = this.U0;
                        TextPaint textPaint4 = this.J0;
                        if (spannableString3 != null) {
                            int paddingInnerPanel9 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                            this.O0 = c(this, spannableString3, paddingInnerPanel9 > 0 ? Integer.valueOf(paddingInnerPanel9) : num, textPaint4, 32);
                        }
                        spannableString4 = this.V0;
                        if (spannableString4 != null) {
                            int paddingInnerPanel10 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                            this.P0 = c(this, spannableString4, paddingInnerPanel10 > 0 ? Integer.valueOf(paddingInnerPanel10) : num, textPaint4, 32);
                        }
                        a7 = a();
                        if (a7 == this.f7594c) {
                            invalidate();
                            return;
                        } else {
                            this.f7599f = a7;
                            requestLayout();
                            return;
                        }
                    }
                } else {
                    charSequence = "Terms of purchase and return";
                }
                spannableString = new SpannableString(!h() ? "Условия покупки и возврата" : charSequence);
                this.U0 = spannableString;
                dVar7 = this.f7591a1;
                if (dVar7 != null) {
                }
                spannableString2 = new SpannableString(h() ? "Условия покупки и возврата" : charSequence);
                this.V0 = spannableString2;
                if (this.B) {
                }
                this.f7613l.setShader(linearGradient);
                String i142 = e.i(new StringBuilder("-"), this.f7610j1, '%');
                int length2 = i142.length();
                Rect rect2 = this.f7598e1;
                TextPaint textPaint5 = this.f7603g1;
                textPaint5.getTextBounds(i142, 0, length2, rect2);
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                this.f7606h1 = c(this, i142, null, textPaint5, 106);
                String i152 = e.i(new StringBuilder("-"), this.f7612k1, '%');
                textPaint5.getTextBounds(i152, 0, i152.length(), this.f7600f1);
                this.f7609i1 = c(this, i152, null, textPaint5, 106);
                SpannableString spannableString72 = this.C0;
                f6 = 2;
                int paddingInnerPanel11 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                if (paddingInnerPanel11 > 0) {
                }
                TextPaint textPaint22 = this.z0;
                this.A0 = c(this, spannableString72, valueOf3, textPaint22, 32);
                SpannableString spannableString82 = this.D0;
                int paddingInnerPanel22 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                this.B0 = c(this, spannableString82, paddingInnerPanel22 > 0 ? Integer.valueOf(paddingInnerPanel22) : null, textPaint22, 32);
                SpannableString spannableString92 = this.H0;
                int paddingInnerPanel32 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                if (paddingInnerPanel32 > 0) {
                }
                TextPaint textPaint32 = this.E0;
                this.F0 = c(this, spannableString92, valueOf4, textPaint32, 96);
                SpannableString spannableString102 = this.I0;
                int paddingInnerPanel42 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                this.G0 = c(this, spannableString102, paddingInnerPanel42 > 0 ? Integer.valueOf(paddingInnerPanel42) : null, textPaint32, 96);
                SpannableString spannableString112 = this.f7595c1;
                int paddingInnerPanel52 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                this.S0 = c(this, spannableString112, paddingInnerPanel52 > 0 ? Integer.valueOf(paddingInnerPanel52) : null, this.Q0, 32);
                SpannableString spannableString122 = this.d1;
                int paddingInnerPanel62 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                this.T0 = c(this, spannableString122, paddingInnerPanel62 > 0 ? Integer.valueOf(paddingInnerPanel62) : null, this.R0, 32);
                if (this.W0.length() == 0) {
                }
                num = null;
                SpannableString spannableString132 = this.W0;
                int paddingInnerPanel72 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
                this.M0 = c(this, spannableString132, paddingInnerPanel72 > 0 ? Integer.valueOf(paddingInnerPanel72) : null, this.K0, 32);
                SpannableString spannableString142 = this.X0;
                int paddingInnerPanel82 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
                this.N0 = c(this, spannableString142, paddingInnerPanel82 > 0 ? Integer.valueOf(paddingInnerPanel82) : null, this.L0, 32);
                spannableString3 = this.U0;
                TextPaint textPaint42 = this.J0;
                if (spannableString3 != null) {
                }
                spannableString4 = this.V0;
                if (spannableString4 != null) {
                }
                a7 = a();
                if (a7 == this.f7594c) {
                }
            }
        }
        i5 = 0;
        dVar = this.f7591a1;
        if ((dVar == null ? (String) dVar.f11094f : null) != null) {
        }
        if (l6 == null) {
        }
        b10 = b(l6 == null ? Double.valueOf(l6.longValue()) : null, this.f7593b1 == null ? Double.valueOf(((Long) r7.f11091c).longValue()) : null);
        dVar2 = this.Z0;
        if ((dVar2 == null ? (String) dVar2.f11094f : null) != null) {
        }
        if (l10 == null) {
        }
        b11 = b(l10 == null ? Double.valueOf(l10.longValue() * 4) : null, this.f7591a1 == null ? Double.valueOf(((Long) r9.f11091c).longValue()) : null);
        dVar3 = this.Y0;
        if ((dVar3 == null ? (String) dVar3.f11094f : null) != null) {
        }
        if (l11 == null) {
        }
        b12 = b(Double.valueOf(longValue * 4), this.f7591a1 == null ? Double.valueOf(((Long) r13.f11091c).longValue()) : null);
        if (b10 > b11) {
        }
        if (b11 > b10) {
        }
        if (this.f7610j1 != i5) {
        }
        if (this.f7612k1 != b10) {
        }
        dVar4 = this.f7591a1;
        String str102 = this.f7607i;
        if (dVar4 != null) {
        }
        dVar5 = this.Y0;
        if (dVar5 != null) {
        }
        dVar6 = this.Y0;
        String str132 = "in month";
        if (dVar6 == null) {
        }
        spannableString = new SpannableString(!h() ? "Условия покупки и возврата" : charSequence);
        this.U0 = spannableString;
        dVar7 = this.f7591a1;
        if (dVar7 != null) {
        }
        spannableString2 = new SpannableString(h() ? "Условия покупки и возврата" : charSequence);
        this.V0 = spannableString2;
        if (this.B) {
        }
        this.f7613l.setShader(linearGradient);
        String i1422 = e.i(new StringBuilder("-"), this.f7610j1, '%');
        int length22 = i1422.length();
        Rect rect22 = this.f7598e1;
        TextPaint textPaint52 = this.f7603g1;
        textPaint52.getTextBounds(i1422, 0, length22, rect22);
        Layout.Alignment alignment22 = Layout.Alignment.ALIGN_CENTER;
        this.f7606h1 = c(this, i1422, null, textPaint52, 106);
        String i1522 = e.i(new StringBuilder("-"), this.f7612k1, '%');
        textPaint52.getTextBounds(i1522, 0, i1522.length(), this.f7600f1);
        this.f7609i1 = c(this, i1522, null, textPaint52, 106);
        SpannableString spannableString722 = this.C0;
        f6 = 2;
        int paddingInnerPanel112 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
        if (paddingInnerPanel112 > 0) {
        }
        TextPaint textPaint222 = this.z0;
        this.A0 = c(this, spannableString722, valueOf3, textPaint222, 32);
        SpannableString spannableString822 = this.D0;
        int paddingInnerPanel222 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
        this.B0 = c(this, spannableString822, paddingInnerPanel222 > 0 ? Integer.valueOf(paddingInnerPanel222) : null, textPaint222, 32);
        SpannableString spannableString922 = this.H0;
        int paddingInnerPanel322 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
        if (paddingInnerPanel322 > 0) {
        }
        TextPaint textPaint322 = this.E0;
        this.F0 = c(this, spannableString922, valueOf4, textPaint322, 96);
        SpannableString spannableString1022 = this.I0;
        int paddingInnerPanel422 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
        this.G0 = c(this, spannableString1022, paddingInnerPanel422 > 0 ? Integer.valueOf(paddingInnerPanel422) : null, textPaint322, 96);
        SpannableString spannableString1122 = this.f7595c1;
        int paddingInnerPanel522 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
        this.S0 = c(this, spannableString1122, paddingInnerPanel522 > 0 ? Integer.valueOf(paddingInnerPanel522) : null, this.Q0, 32);
        SpannableString spannableString1222 = this.d1;
        int paddingInnerPanel622 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
        this.T0 = c(this, spannableString1222, paddingInnerPanel622 > 0 ? Integer.valueOf(paddingInnerPanel622) : null, this.R0, 32);
        if (this.W0.length() == 0) {
        }
        num = null;
        SpannableString spannableString1322 = this.W0;
        int paddingInnerPanel722 = (int) ((this.K.right - (getPaddingInnerPanel() * f6)) - this.K.left);
        this.M0 = c(this, spannableString1322, paddingInnerPanel722 > 0 ? Integer.valueOf(paddingInnerPanel722) : null, this.K0, 32);
        SpannableString spannableString1422 = this.X0;
        int paddingInnerPanel822 = (int) ((this.f7608i0.right - (getPaddingInnerPanel() * f6)) - this.f7608i0.left);
        this.N0 = c(this, spannableString1422, paddingInnerPanel822 > 0 ? Integer.valueOf(paddingInnerPanel822) : null, this.L0, 32);
        spannableString3 = this.U0;
        TextPaint textPaint422 = this.J0;
        if (spannableString3 != null) {
        }
        spannableString4 = this.V0;
        if (spannableString4 != null) {
        }
        a7 = a();
        if (a7 == this.f7594c) {
        }
    }

    public final void k() {
        float f6;
        float f10;
        LinearGradient linearGradient;
        float f11 = this.f7597e - this.f7637w0;
        if (getHeightTextLayoutHintFirst() == 0 && getHeightTextLayoutHintSecond() == 0) {
            f6 = 0.0f;
        } else {
            float maxTextLayoutHintTrial = getMaxTextLayoutHintTrial();
            DisplayMetrics displayMetrics = this.f7592b;
            if (displayMetrics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics = null;
            }
            f6 = (10.0f * displayMetrics.density) + maxTextLayoutHintTrial;
        }
        float f12 = f11 - f6;
        this.K = new RectF(this.f7633u0 + 0.0f, this.f7631t0 + 0.0f, getCenterXAbsolute() - (this.f7635v0 / 4.0f), f12);
        RectF rectF = this.K;
        float f13 = rectF.left;
        float f14 = this.I;
        this.L = new RectF(f13 + f14, rectF.top + f14, rectF.right - f14, rectF.bottom - f14);
        this.f7608i0 = new RectF((this.f7633u0 / 4.0f) + getCenterXAbsolute(), this.f7631t0 + 0.0f, this.f7596d - this.f7635v0, f12);
        RectF rectF2 = this.f7608i0;
        float f15 = rectF2.left;
        float f16 = this.I;
        this.j0 = new RectF(f15 + f16, rectF2.top + f16, rectF2.right - f16, rectF2.bottom - f16);
        RectF rectF3 = this.K;
        float f17 = rectF3.right;
        float f18 = this.f7601g;
        float f19 = rectF3.top;
        float f20 = this.f7604h;
        this.f7623p = new RectF(f17 - f18, f19 - f20, f17 + f20, f19 + f18);
        RectF rectF4 = this.f7608i0;
        float f21 = rectF4.right;
        float f22 = this.f7601g;
        float f23 = rectF4.top;
        float f24 = this.f7604h;
        RectF rectF5 = new RectF(f21 - f22, f23 - f24, f21 + f24, f23 + f22);
        this.q = rectF5;
        RectF rectF6 = this.f7623p;
        DisplayMetrics displayMetrics2 = this.f7592b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        float f25 = displayMetrics2.density;
        float f26 = 7.2f * f25;
        float f27 = 12.0f * f25;
        float f28 = 6.4f * f25;
        float f29 = f25 * 9.0f;
        Path path = new Path();
        path.moveTo(rectF6.right - f26, rectF6.top + f26);
        path.lineTo(rectF6.right - f27, rectF6.bottom - f26);
        path.lineTo(rectF6.left + f28, rectF6.bottom - f29);
        this.f7619n = path;
        Path path2 = new Path();
        path2.moveTo(rectF5.right - f26, rectF5.top + f26);
        path2.lineTo(rectF5.right - f27, rectF5.bottom - f26);
        path2.lineTo(rectF5.left + f28, rectF5.bottom - f29);
        this.f7621o = path2;
        f(this.f7623p, this.q);
        RectF rectF7 = this.K;
        RectF rectF8 = this.f7608i0;
        DisplayMetrics displayMetrics3 = this.f7592b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        float f30 = displayMetrics3.density;
        float f31 = 25.0f * f30;
        float f32 = 15.0f * f30;
        float f33 = 13.0f * f30;
        float f34 = 19.0f * f30;
        float f35 = f30 * 11.9f;
        Path path3 = new Path();
        path3.moveTo(rectF7.right - f31, rectF7.top);
        path3.lineTo(rectF7.right - f33, rectF7.top);
        path3.lineTo(rectF7.right - f33, rectF7.top + f32);
        path3.lineTo(rectF7.right - f34, rectF7.top + f35);
        path3.lineTo(rectF7.right - f31, rectF7.top + f32);
        path3.close();
        this.j = path3;
        Path path4 = new Path();
        path4.moveTo(rectF8.right - f31, rectF8.top);
        path4.lineTo(rectF8.right - f33, rectF8.top);
        path4.lineTo(rectF8.right - f33, rectF8.top + f32);
        path4.lineTo(rectF8.right - f34, rectF8.top + f35);
        path4.lineTo(rectF8.right - f31, rectF8.top + f32);
        path4.close();
        this.f7611k = path4;
        e(this.K, this.f7608i0);
        LinearGradient linearGradient2 = this.f7602g0;
        if (linearGradient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameLeft");
            linearGradient2 = null;
        }
        this.f7605h0.setShader(linearGradient2);
        LinearGradient linearGradient3 = this.k0;
        if (linearGradient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameRight");
            linearGradient3 = null;
        }
        this.f7614l0.setShader(linearGradient3);
        d(this.K, this.f7608i0);
        LinearGradient linearGradient4 = this.D;
        if (linearGradient4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedLeft");
            linearGradient4 = null;
        }
        this.C.setShader(linearGradient4);
        LinearGradient linearGradient5 = this.F;
        if (linearGradient5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedRight");
            linearGradient5 = null;
        }
        this.E.setShader(linearGradient5);
        RectF rectF9 = this.K;
        RectF rectF10 = this.f7608i0;
        double d10 = 3.141592653589793d / 23;
        float radiusStar = (rectF9.right - (getRadiusStar() * 2.0f)) + getOuterRadius();
        float radiusStar2 = (((rectF9.bottom - rectF9.top) / 2.0f) - getRadiusStar()) + getOuterRadius();
        float radiusStar3 = (rectF10.right - (getRadiusStar() * 2.0f)) + getOuterRadius();
        float radiusStar4 = (((rectF10.bottom - rectF10.top) / 2.0f) - getRadiusStar()) + getOuterRadius();
        Path path5 = this.f7638x;
        if (!path5.isEmpty()) {
            path5.reset();
        }
        Path path6 = this.f7639y;
        if (!path6.isEmpty()) {
            path6.reset();
        }
        path5.moveTo(radiusStar, radiusStar2 - getOuterRadius());
        path6.moveTo(radiusStar3, radiusStar4 - getOuterRadius());
        double d11 = 4.71238898038469d;
        int i5 = 0;
        while (true) {
            f10 = radiusStar;
            double d12 = d10;
            float cos = (float) (Math.cos(d11) * getOuterRadius());
            float sin = (float) (Math.sin(d11) * getOuterRadius());
            path5.lineTo(f10 + cos, radiusStar2 + sin);
            path6.lineTo(cos + radiusStar3, sin + radiusStar4);
            double d13 = d11 + d12;
            float cos2 = (float) (Math.cos(d13) * getInnerRadius());
            float sin2 = (float) (Math.sin(d13) * getInnerRadius());
            path5.lineTo(f10 + cos2, radiusStar2 + sin2);
            path6.lineTo(cos2 + radiusStar3, sin2 + radiusStar4);
            d11 = d13 + d12;
            if (i5 == 23) {
                break;
            }
            i5++;
            radiusStar = f10;
            d10 = d12;
        }
        path5.lineTo(f10, radiusStar2 - getOuterRadius());
        path5.close();
        path6.lineTo(radiusStar3, radiusStar4 - getOuterRadius());
        path6.close();
        g(this.K, this.f7608i0);
        LinearGradient linearGradient6 = this.f7630t;
        if (linearGradient6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarLeft");
            linearGradient6 = null;
        }
        this.f7634v.setShader(linearGradient6);
        LinearGradient linearGradient7 = this.f7632u;
        if (linearGradient7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarRight");
            linearGradient = null;
        } else {
            linearGradient = linearGradient7;
        }
        this.f7636w.setShader(linearGradient);
        j();
    }

    public final SpannableString l(long j, String str) {
        if (j == 0) {
            return new SpannableString(str);
        }
        String str2 = str + '\n' + (j / 1000000.0d);
        SpannableString spannableString = new SpannableString(str2);
        int length = str.length() + 1;
        spannableString.setSpan(new ForegroundColorSpan(this.f7617m0), length, str2.length(), 18);
        spannableString.setSpan(new StrikethroughSpan(), length, str2.length(), 18);
        DisplayMetrics displayMetrics = this.f7592b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        spannableString.setSpan(new AbsoluteSizeSpan((int) (Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 12.0f, displayMetrics) : displayMetrics.scaledDensity * 12.0f)), length, str2.length(), 18);
        return spannableString;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
        this.f7590a = new GestureDetector(getContext(), new c(3, this));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7618m1 = null;
        this.f7590a = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path;
        String str;
        Path path2;
        String str2;
        DisplayMetrics displayMetrics;
        float d10;
        float d11;
        DisplayMetrics displayMetrics2;
        float d12;
        float d13;
        int save;
        float d14;
        float d15;
        float d16;
        Layout layout;
        Rect rect = this.f7600f1;
        Rect rect2 = this.f7598e1;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        boolean z5 = this.B;
        RectF rectF = z5 ? this.j0 : this.L;
        float f6 = this.H;
        float f10 = this.I;
        float f11 = f6 - f10;
        canvas.drawRoundRect(rectF, f11, f11, z5 ? this.E : this.C);
        Path path3 = this.J;
        path3.rewind();
        RectF rectF2 = this.L;
        float f12 = f6 - f10;
        Path.Direction direction = Path.Direction.CCW;
        path3.addRoundRect(rectF2, f12, f12, direction);
        s6.a.c(canvas, path3);
        path3.rewind();
        path3.addRoundRect(this.K, f6, f6, direction);
        Paint paint = this.f7605h0;
        canvas.drawPath(path3, paint);
        path3.rewind();
        float f13 = f6 - f10;
        path3.addRoundRect(this.j0, f13, f13, direction);
        s6.a.c(canvas, path3);
        path3.rewind();
        path3.addRoundRect(this.f7608i0, f6, f6, direction);
        Paint paint2 = this.f7614l0;
        canvas.drawPath(path3, paint2);
        canvas.restore();
        canvas.drawOval(this.B ? this.q : this.f7623p, this.f7613l);
        if (this.B) {
            path = this.f7621o;
            if (path == null) {
                str = "pathIcOkRight";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                path = null;
            }
        } else {
            path = this.f7619n;
            if (path == null) {
                str = "pathIcOkLeft";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                path = null;
            }
        }
        canvas.drawPath(path, this.f7616m);
        if (this.B) {
            path2 = this.j;
            if (path2 == null) {
                str2 = "pathIcMarkLeft";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                path2 = null;
            }
        } else {
            path2 = this.f7611k;
            if (path2 == null) {
                str2 = "pathIcMarkRight";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                path2 = null;
            }
        }
        if (!this.B) {
            paint = paint2;
        }
        canvas.drawPath(path2, paint);
        if (this.f7610j1 > 0) {
            save = canvas.save();
            try {
                canvas.drawPath(this.f7638x, this.f7634v);
                canvas.restoreToCount(save);
                save = canvas.save();
                try {
                    RectF rectF3 = this.K;
                    float f14 = rectF3.right - ((rect2.right - rect2.left) / 2.0f);
                    float height = ((rect2.height() - ((Math.abs(rect2.top) - Math.abs(rect2.bottom)) / 2)) / 2.0f) + ((rectF3.bottom - rectF3.top) / 2.0f);
                    RectF rectF4 = this.K;
                    float f15 = (f14 - rectF4.right) + (rect2.right - rect2.left);
                    float height2 = (height - ((rectF4.bottom - rectF4.top) / 2.0f)) + (rect2.height() - ((Math.abs(rect2.top) - Math.abs(rect2.bottom)) / 2));
                    canvas.translate(f14, height);
                    canvas.rotate(20.0f, f15, height2);
                    Layout layout2 = this.f7606h1;
                    if (layout2 != null) {
                        layout2.draw(canvas);
                        Unit unit = Unit.f19194a;
                    }
                } finally {
                }
            } finally {
            }
        }
        if (this.f7612k1 > 0) {
            save = canvas.save();
            try {
                canvas.drawPath(this.f7639y, this.f7636w);
                canvas.restoreToCount(save);
                save = canvas.save();
                try {
                    RectF rectF5 = this.f7608i0;
                    float f16 = rectF5.right - ((rect.right - rect.left) / 2.0f);
                    float height3 = ((rect.height() - ((Math.abs(rect.top) - Math.abs(rect.bottom)) / 2)) / 2.0f) + ((rectF5.bottom - rectF5.top) / 2.0f);
                    RectF rectF6 = this.f7608i0;
                    float f17 = (f16 - rectF6.right) + (rect.right - rect.left);
                    float height4 = (height3 - ((rectF6.bottom - rectF6.top) / 2.0f)) + (rect.height() - ((Math.abs(rect.top) - Math.abs(rect.bottom)) / 2));
                    canvas.translate(f16, height3);
                    canvas.rotate(30.0f, f17, height4);
                    Layout layout3 = this.f7609i1;
                    if (layout3 != null) {
                        layout3.draw(canvas);
                        Unit unit2 = Unit.f19194a;
                    }
                } finally {
                }
            } finally {
            }
        }
        float f18 = this.K.top;
        float f19 = 13;
        DisplayMetrics displayMetrics3 = this.f7592b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        } else {
            displayMetrics = displayMetrics3;
        }
        float f20 = (f19 * displayMetrics.density) + f18;
        Layout layout4 = this.A0;
        int i5 = 0;
        int height5 = layout4 != null ? layout4.getHeight() : 0;
        Layout layout5 = this.B0;
        int height6 = layout5 != null ? layout5.getHeight() : 0;
        int max = Math.max(height5, height6);
        int i10 = (max - height5) / 2;
        int i11 = (max - height6) / 2;
        canvas.save();
        float paddingInnerPanel = this.K.left + getPaddingInnerPanel();
        float f21 = 0.0f;
        if (this.A0 == null) {
            d10 = 0.0f;
        } else {
            RectF rectF7 = this.K;
            float width = (rectF7.right - rectF7.left) - r12.getWidth();
            float f22 = 2;
            d10 = e.d(getPaddingInnerPanel(), f22, width, f22);
        }
        canvas.translate(paddingInnerPanel + d10, i10 + f20);
        Layout layout6 = this.A0;
        if (layout6 != null) {
            layout6.draw(canvas);
            Unit unit3 = Unit.f19194a;
        }
        canvas.restore();
        canvas.save();
        float paddingInnerPanel2 = this.f7608i0.left + getPaddingInnerPanel();
        if (this.B0 == null) {
            d11 = 0.0f;
        } else {
            RectF rectF8 = this.f7608i0;
            float width2 = (rectF8.right - rectF8.left) - r11.getWidth();
            float f23 = 2;
            d11 = e.d(getPaddingInnerPanel(), f23, width2, f23);
        }
        canvas.translate(paddingInnerPanel2 + d11, i11 + f20);
        Layout layout7 = this.B0;
        if (layout7 != null) {
            layout7.draw(canvas);
            Unit unit4 = Unit.f19194a;
        }
        canvas.restore();
        canvas.save();
        Layout layout8 = this.S0;
        int height7 = layout8 != null ? layout8.getHeight() : 0;
        Layout layout9 = this.T0;
        int height8 = layout9 != null ? layout9.getHeight() : 0;
        float f24 = f20 + max;
        float f25 = 10;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        } else {
            displayMetrics2 = displayMetrics3;
        }
        float f26 = (displayMetrics2.density * f25) + f24;
        int i12 = height7 < height8 ? (height8 - height7) / 2 : 0;
        int i13 = height8 < height7 ? (height7 - height8) / 2 : 0;
        float max2 = Math.max(height7, height8) + f26;
        float paddingInnerPanel3 = this.K.left + getPaddingInnerPanel();
        if (this.S0 == null) {
            d12 = 0.0f;
        } else {
            RectF rectF9 = this.K;
            float width3 = (rectF9.right - rectF9.left) - r14.getWidth();
            float f27 = 2;
            d12 = e.d(getPaddingInnerPanel(), f27, width3, f27);
        }
        canvas.translate(paddingInnerPanel3 + d12, i12 + f26);
        Layout layout10 = this.S0;
        if (layout10 != null) {
            layout10.draw(canvas);
            Unit unit5 = Unit.f19194a;
        }
        canvas.restore();
        float paddingInnerPanel4 = this.f7608i0.left + getPaddingInnerPanel();
        if (this.T0 == null) {
            d13 = 0.0f;
        } else {
            RectF rectF10 = this.f7608i0;
            float width4 = (rectF10.right - rectF10.left) - r7.getWidth();
            float f28 = 2;
            d13 = e.d(getPaddingInnerPanel(), f28, width4, f28);
        }
        save = canvas.save();
        canvas.translate(paddingInnerPanel4 + d13, f26 + i13);
        try {
            Layout layout11 = this.T0;
            if (layout11 != null) {
                layout11.draw(canvas);
                Unit unit6 = Unit.f19194a;
            }
            canvas.restoreToCount(save);
            float paddingInnerPanel5 = this.K.left + getPaddingInnerPanel();
            if (this.F0 == null) {
                d14 = 0.0f;
            } else {
                RectF rectF11 = this.K;
                float width5 = (rectF11.right - rectF11.left) - r7.getWidth();
                float f29 = 2;
                d14 = e.d(getPaddingInnerPanel(), f29, width5, f29);
            }
            float f30 = paddingInnerPanel5 + d14;
            save = canvas.save();
            canvas.translate(f30, max2);
            try {
                Layout layout12 = this.F0;
                if (layout12 != null) {
                    layout12.draw(canvas);
                    Unit unit7 = Unit.f19194a;
                }
                canvas.restoreToCount(save);
                float paddingInnerPanel6 = this.f7608i0.left + getPaddingInnerPanel();
                if (this.G0 == null) {
                    d15 = 0.0f;
                } else {
                    RectF rectF12 = this.f7608i0;
                    float width6 = (rectF12.right - rectF12.left) - r7.getWidth();
                    float f31 = 2;
                    d15 = e.d(getPaddingInnerPanel(), f31, width6, f31);
                }
                float f32 = paddingInnerPanel6 + d15;
                save = canvas.save();
                canvas.translate(f32, max2);
                try {
                    Layout layout13 = this.G0;
                    if (layout13 != null) {
                        layout13.draw(canvas);
                        Unit unit8 = Unit.f19194a;
                    }
                    canvas.restoreToCount(save);
                    Layout layout14 = this.F0;
                    int height9 = layout14 != null ? layout14.getHeight() : 0;
                    float max3 = max2 + Math.max(height9, this.G0 != null ? r7.getHeight() : 0);
                    if (displayMetrics3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("metrics");
                        displayMetrics3 = null;
                    }
                    float f33 = (f25 * displayMetrics3.density) + max3;
                    float paddingInnerPanel7 = this.K.left + getPaddingInnerPanel();
                    if (this.M0 == null) {
                        d16 = 0.0f;
                    } else {
                        RectF rectF13 = this.K;
                        float width7 = (rectF13.right - rectF13.left) - r3.getWidth();
                        float f34 = 2;
                        d16 = e.d(getPaddingInnerPanel(), f34, width7, f34);
                    }
                    float f35 = paddingInnerPanel7 + d16;
                    save = canvas.save();
                    canvas.translate(f35, f33);
                    try {
                        Layout layout15 = this.M0;
                        if (layout15 != null) {
                            layout15.draw(canvas);
                            Unit unit9 = Unit.f19194a;
                        }
                        canvas.restoreToCount(save);
                        float paddingInnerPanel8 = this.f7608i0.left + getPaddingInnerPanel();
                        if (this.N0 != null) {
                            RectF rectF14 = this.f7608i0;
                            float width8 = (rectF14.right - rectF14.left) - r3.getWidth();
                            float f36 = 2;
                            f21 = e.d(getPaddingInnerPanel(), f36, width8, f36);
                        }
                        save = canvas.save();
                        canvas.translate(paddingInnerPanel8 + f21, f33);
                        try {
                            Layout layout16 = this.N0;
                            if (layout16 != null) {
                                layout16.draw(canvas);
                                Unit unit10 = Unit.f19194a;
                            }
                            canvas.restoreToCount(save);
                            boolean z7 = this.B;
                            Layout layout17 = ((z7 || (layout = this.O0) == null) && (!z7 || (layout = this.P0) == null)) ? null : layout;
                            if (layout17 != null) {
                                int heightTextLayoutHintSecond = z7 ? getHeightTextLayoutHintSecond() : getHeightTextLayoutHintFirst();
                                int maxTextLayoutHintTrial = getMaxTextLayoutHintTrial();
                                save = canvas.save();
                                if (maxTextLayoutHintTrial > heightTextLayoutHintSecond) {
                                    try {
                                        i5 = (maxTextLayoutHintTrial - heightTextLayoutHintSecond) / 2;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                canvas.translate(this.K.left, this.f7608i0.bottom + this.f7637w0 + i5);
                                layout17.draw(canvas);
                                canvas.restoreToCount(save);
                                Unit unit11 = Unit.f19194a;
                            }
                            if (this.f7597e != this.f7599f) {
                                requestLayout();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
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
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(0, size);
        }
        this.f7596d = size;
        int a7 = a();
        if (a7 != this.f7594c) {
            this.f7594c = a7;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(this.f7594c, size2);
        } else if (mode2 != 1073741824) {
            size2 = this.f7594c;
        }
        this.f7597e = size2;
        setMeasuredDimension(this.f7596d, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7597e = i10;
        this.f7596d = i5;
        if (i5 == 0 || i10 == 0) {
            return;
        }
        k();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.f7590a;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void set1RubWeekCloudPayment(boolean enable) {
        this.f7615l1 = enable;
        j();
    }

    public final void setDetailsFirst(@Nullable ic.e updateData) {
        if (Intrinsics.areEqual(this.Y0, updateData != null ? updateData.f11103a : null)) {
            if (Intrinsics.areEqual(this.Z0, updateData != null ? updateData.f11104b : null)) {
                return;
            }
        }
        this.Y0 = updateData != null ? updateData.f11103a : null;
        this.Z0 = updateData != null ? updateData.f11104b : null;
        j();
    }

    public final void setDetailsSecond(@Nullable ic.e updateData) {
        if (Intrinsics.areEqual(this.f7591a1, updateData != null ? updateData.f11103a : null)) {
            if (Intrinsics.areEqual(this.f7593b1, updateData != null ? updateData.f11104b : null)) {
                return;
            }
        }
        this.f7591a1 = updateData != null ? updateData.f11103a : null;
        this.f7593b1 = updateData != null ? updateData.f11104b : null;
        j();
    }

    public final void setListenerCheckPrice(@Nullable y listener) {
        this.f7618m1 = listener;
    }
}
