package com.sports.insider.ui.views;

import android.content.Context;
import android.content.res.Resources;
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
import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import d9.e;
import f0.l;
import ic.b;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
import ve.i;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0015B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001cR\u001a\u0010$\u001a\u00020\u001f8BX\u0082D¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u001f8BX\u0082D¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001a\u0010)\u001a\u00020\u001f8BX\u0082D¢\u0006\f\n\u0004\b!\u0010!\u001a\u0004\b(\u0010#R\u0014\u0010+\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010#R\u0014\u0010-\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010#R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001cR\u0014\u00105\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001cR\u0014\u00107\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001c¨\u00068"}, d2 = {"Lcom/sports/insider/ui/views/CheckPrice;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enable", "", "set1RubWeekCloudPayment", "(Z)V", "", PredictionTable.oddsColumn, "setOdds", "(Ljava/lang/String;)V", "", "typePrediction", "setTypePrediction", "(I)V", "Lve/i;", "listener", "setListenerCheckPrice", "(Lve/i;)V", "getMinOddsBySubs", "()Ljava/lang/String;", "getCountPredictionBySub", "()I", "getPercentBySub", "getPassage", "", "y", "F", "getOuterRadius", "()F", "outerRadius", "z", "getInnerRadius", "innerRadius", "getPaddingInnerPanel", "paddingInnerPanel", "getCenterXAbsolute", "centerXAbsolute", "getRadiusStar", "radiusStar", "Lnc/g;", "getResourceGetter", "()Lnc/g;", "resourceGetter", "getHeightTextLayoutHintFirst", "heightTextLayoutHintFirst", "getHeightTextLayoutHintSecond", "heightTextLayoutHintSecond", "getMaxTextLayoutHintTrial", "maxTextLayoutHintTrial", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckPrice.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckPrice.kt\ncom/sports/insider/ui/views/CheckPrice\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,1679:1\n1#2:1680\n404#3:1681\n404#3:1757\n404#3:1758\n404#3:1759\n404#3:1760\n404#3:1761\n404#3:1762\n404#3:1763\n404#3:1764\n404#3:1765\n27#4,7:1682\n27#4,7:1689\n27#4,7:1696\n27#4,7:1703\n44#4,8:1710\n44#4,8:1718\n44#4,8:1726\n44#4,8:1734\n44#4,8:1742\n27#4,7:1750\n*S KotlinDebug\n*F\n+ 1 CheckPrice.kt\ncom/sports/insider/ui/views/CheckPrice\n*L\n209#1:1681\n1041#1:1757\n1043#1:1758\n1056#1:1759\n1058#1:1760\n1071#1:1761\n1073#1:1762\n1092#1:1763\n1094#1:1764\n1574#1:1765\n736#1:1682,7\n739#1:1689,7\n759#1:1696,7\n762#1:1703,7\n829#1:1710,8\n840#1:1718,8\n849#1:1726,8\n866#1:1734,8\n876#1:1742,8\n924#1:1750,7\n*E\n"})
/* loaded from: classes.dex */
public final class CheckPrice extends View {
    public boolean A;
    public Layout A0;
    public final Paint B;
    public SpannableString B0;
    public LinearGradient C;
    public SpannableString C0;
    public final Paint D;
    public final TextPaint D0;
    public LinearGradient E;
    public final TextPaint E0;

    /* renamed from: F, reason: from kotlin metadata */
    public final float paddingInnerPanel;
    public final TextPaint F0;
    public final float G;
    public Layout G0;
    public final float H;
    public Layout H0;
    public final Path I;
    public Layout I0;
    public RectF J;
    public Layout J0;
    public RectF K;
    public final TextPaint K0;
    public LinearGradient L;
    public final TextPaint L0;
    public Layout M0;
    public Layout N0;
    public SpannableString O0;
    public SpannableString P0;
    public SpannableString Q0;
    public SpannableString R0;
    public b S0;
    public b T0;
    public b U0;
    public b V0;
    public int W0;
    public final SpannableString X0;
    public SpannableString Y0;
    public SpannableString Z0;

    /* renamed from: a, reason: collision with root package name */
    public GestureDetector f7209a;

    /* renamed from: a1, reason: collision with root package name */
    public String f7210a1;

    /* renamed from: b, reason: collision with root package name */
    public final DisplayMetrics f7211b;

    /* renamed from: b1, reason: collision with root package name */
    public String f7212b1;

    /* renamed from: c, reason: collision with root package name */
    public int f7213c;

    /* renamed from: c1, reason: collision with root package name */
    public final Rect f7214c1;

    /* renamed from: d, reason: collision with root package name */
    public int f7215d;
    public final Rect d1;

    /* renamed from: e, reason: collision with root package name */
    public int f7216e;

    /* renamed from: e1, reason: collision with root package name */
    public final TextPaint f7217e1;

    /* renamed from: f, reason: collision with root package name */
    public int f7218f;

    /* renamed from: f1, reason: collision with root package name */
    public Layout f7219f1;

    /* renamed from: g, reason: collision with root package name */
    public final float f7220g;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint f7221g0;

    /* renamed from: g1, reason: collision with root package name */
    public Layout f7222g1;

    /* renamed from: h, reason: collision with root package name */
    public final float f7223h;

    /* renamed from: h0, reason: collision with root package name */
    public RectF f7224h0;

    /* renamed from: h1, reason: collision with root package name */
    public int f7225h1;

    /* renamed from: i, reason: collision with root package name */
    public Path f7226i;

    /* renamed from: i0, reason: collision with root package name */
    public RectF f7227i0;

    /* renamed from: i1, reason: collision with root package name */
    public int f7228i1;
    public Path j;
    public LinearGradient j0;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f7229j1;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f7230k;
    public final Paint k0;

    /* renamed from: k1, reason: collision with root package name */
    public i f7231k1;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f7232l;

    /* renamed from: l0, reason: collision with root package name */
    public int f7233l0;

    /* renamed from: l1, reason: collision with root package name */
    public int f7234l1;

    /* renamed from: m, reason: collision with root package name */
    public Path f7235m;

    /* renamed from: m0, reason: collision with root package name */
    public int f7236m0;

    /* renamed from: n, reason: collision with root package name */
    public Path f7237n;

    /* renamed from: n0, reason: collision with root package name */
    public final float f7238n0;

    /* renamed from: o, reason: collision with root package name */
    public RectF f7239o;

    /* renamed from: o0, reason: collision with root package name */
    public final float f7240o0;

    /* renamed from: p, reason: collision with root package name */
    public RectF f7241p;

    /* renamed from: p0, reason: collision with root package name */
    public final float f7242p0;
    public LinearGradient q;

    /* renamed from: q0, reason: collision with root package name */
    public final float f7243q0;

    /* renamed from: r, reason: collision with root package name */
    public LinearGradient f7244r;

    /* renamed from: r0, reason: collision with root package name */
    public final Typeface f7245r0;

    /* renamed from: s, reason: collision with root package name */
    public LinearGradient f7246s;

    /* renamed from: s0, reason: collision with root package name */
    public final Typeface f7247s0;

    /* renamed from: t, reason: collision with root package name */
    public LinearGradient f7248t;

    /* renamed from: t0, reason: collision with root package name */
    public final TextPaint f7249t0;

    /* renamed from: u, reason: collision with root package name */
    public final Paint f7250u;

    /* renamed from: u0, reason: collision with root package name */
    public Layout f7251u0;

    /* renamed from: v, reason: collision with root package name */
    public final Paint f7252v;

    /* renamed from: v0, reason: collision with root package name */
    public Layout f7253v0;

    /* renamed from: w, reason: collision with root package name */
    public final Path f7254w;

    /* renamed from: w0, reason: collision with root package name */
    public SpannableString f7255w0;

    /* renamed from: x, reason: collision with root package name */
    public final Path f7256x;
    public SpannableString x0;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final float outerRadius;

    /* renamed from: y0, reason: collision with root package name */
    public final TextPaint f7258y0;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final float innerRadius;
    public Layout z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPrice(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint;
        LinearGradient linearGradient;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7220g = 15.0f;
        this.f7223h = 5.0f;
        Paint paint = new Paint(1);
        this.f7230k = paint;
        Paint paint2 = new Paint(1);
        this.f7232l = paint2;
        this.f7239o = new RectF();
        this.f7241p = new RectF();
        Paint paint3 = new Paint(1);
        this.f7250u = paint3;
        Paint paint4 = new Paint(1);
        this.f7252v = paint4;
        this.f7254w = new Path();
        this.f7256x = new Path();
        this.outerRadius = 20.0f;
        this.innerRadius = 16.0f;
        Paint paint5 = new Paint(1);
        this.B = paint5;
        Paint paint6 = new Paint(1);
        this.D = paint6;
        this.paddingInnerPanel = 9.0f;
        this.G = 11.0f;
        this.I = new Path();
        this.J = new RectF();
        this.K = new RectF();
        Paint paint7 = new Paint(1);
        this.f7221g0 = paint7;
        this.f7224h0 = new RectF();
        this.f7227i0 = new RectF();
        Paint paint8 = new Paint(1);
        this.k0 = paint8;
        this.f7233l0 = 21;
        this.f7236m0 = 81;
        TextPaint textPaint2 = new TextPaint(1);
        this.f7249t0 = textPaint2;
        this.f7255w0 = new SpannableString("");
        this.x0 = new SpannableString("");
        TextPaint textPaint3 = new TextPaint(1);
        this.f7258y0 = textPaint3;
        this.B0 = new SpannableString("");
        this.C0 = new SpannableString("");
        TextPaint textPaint4 = new TextPaint(1);
        this.D0 = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        this.E0 = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        this.F0 = textPaint6;
        TextPaint textPaint7 = new TextPaint(1);
        this.K0 = textPaint7;
        TextPaint textPaint8 = new TextPaint(1);
        this.L0 = textPaint8;
        this.Q0 = new SpannableString("");
        this.R0 = new SpannableString("");
        this.W0 = 2;
        this.Y0 = new SpannableString("Payment launch");
        this.Z0 = new SpannableString("Payment launch");
        this.f7210a1 = CommonUrlParts.Values.FALSE_INTEGER;
        this.f7212b1 = "...";
        this.f7214c1 = new Rect();
        this.d1 = new Rect();
        TextPaint textPaint9 = new TextPaint(1);
        this.f7217e1 = textPaint9;
        this.f7225h1 = 10;
        this.f7228i1 = 10;
        this.f7211b = a.b(context, "getDisplayMetrics(...)");
        Typeface DEFAULT_BOLD = l.b(context, R.font.arimo_bold);
        if (DEFAULT_BOLD == null) {
            DEFAULT_BOLD = Typeface.DEFAULT_BOLD;
            textPaint = textPaint8;
            Intrinsics.checkNotNullExpressionValue(DEFAULT_BOLD, "DEFAULT_BOLD");
        } else {
            textPaint = textPaint8;
        }
        this.f7245r0 = DEFAULT_BOLD;
        Typeface DEFAULT = l.b(context, R.font.arimo_regular);
        if (DEFAULT == null) {
            DEFAULT = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        }
        this.f7247s0 = DEFAULT;
        this.X0 = new SpannableString(((za.i) getResourceGetter()).g(R.string.one_bonus));
        this.f7213c = 0;
        float f6 = 15;
        DisplayMetrics displayMetrics = this.f7211b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        this.f7220g = f6 * displayMetrics.density;
        float f10 = 5;
        DisplayMetrics displayMetrics2 = this.f7211b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        this.f7223h = f10 * displayMetrics2.density;
        float f11 = 11;
        DisplayMetrics displayMetrics3 = this.f7211b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        this.G = f11 * displayMetrics3.density;
        float f12 = 2;
        DisplayMetrics displayMetrics4 = this.f7211b;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        this.H = f12 * displayMetrics4.density;
        float f13 = 16;
        DisplayMetrics displayMetrics5 = this.f7211b;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        this.f7238n0 = f13 * displayMetrics5.density;
        float f14 = 24;
        DisplayMetrics displayMetrics6 = this.f7211b;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics6 = null;
        }
        this.f7240o0 = displayMetrics6.density * f14;
        DisplayMetrics displayMetrics7 = this.f7211b;
        if (displayMetrics7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics7 = null;
        }
        this.f7242p0 = f14 * displayMetrics7.density;
        float f15 = 10;
        DisplayMetrics displayMetrics8 = this.f7211b;
        if (displayMetrics8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics8 = null;
        }
        this.f7243q0 = f15 * displayMetrics8.density;
        float f16 = this.f7216e / 2.0f;
        RectF rectF = new RectF(0.0f, f16, this.f7215d, f16);
        float f17 = this.f7216e / 2.0f;
        RectF rectF2 = new RectF(0.0f, f17, this.f7215d, f17);
        e(rectF, rectF2);
        Paint.Style style = Paint.Style.FILL;
        paint7.setStyle(style);
        LinearGradient linearGradient2 = this.L;
        if (linearGradient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameLeft");
            linearGradient2 = null;
        }
        paint7.setShader(linearGradient2);
        paint8.setStyle(style);
        LinearGradient linearGradient3 = this.j0;
        if (linearGradient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameRight");
            linearGradient3 = null;
        }
        paint8.setShader(linearGradient3);
        d(rectF, rectF2);
        g(rectF, rectF2);
        paint3.setStyle(style);
        LinearGradient linearGradient4 = this.f7246s;
        if (linearGradient4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarLeft");
            linearGradient4 = null;
        }
        paint3.setShader(linearGradient4);
        paint4.setStyle(style);
        LinearGradient linearGradient5 = this.f7248t;
        if (linearGradient5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarRight");
            linearGradient5 = null;
        }
        paint4.setShader(linearGradient5);
        f(rectF, rectF2);
        paint5.setStyle(style);
        LinearGradient linearGradient6 = this.C;
        if (linearGradient6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedLeft");
            linearGradient6 = null;
        }
        paint5.setShader(linearGradient6);
        paint6.setStyle(style);
        LinearGradient linearGradient7 = this.E;
        if (linearGradient7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedRight");
            linearGradient7 = null;
        }
        paint6.setShader(linearGradient7);
        paint.setStyle(style);
        if (this.A) {
            linearGradient = this.f7244r;
            if (linearGradient == null) {
                str = "shaderIcOkRight";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                linearGradient = null;
            }
        } else {
            linearGradient = this.q;
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
        DisplayMetrics displayMetrics9 = this.f7211b;
        if (displayMetrics9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics9 = null;
        }
        paint2.setStrokeWidth(displayMetrics9.density * 2.0f);
        Typeface typeface = this.f7247s0;
        if (typeface == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            typeface = null;
        }
        textPaint9.setTypeface(typeface);
        textPaint9.setLetterSpacing(0.1f);
        DisplayMetrics displayMetrics10 = this.f7211b;
        if (displayMetrics10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics10 = null;
        }
        textPaint9.setStrokeWidth(h0.l(displayMetrics10, 1.0f));
        textPaint9.setColor(-1);
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        textPaint9.setStyle(style2);
        DisplayMetrics displayMetrics11 = this.f7211b;
        if (displayMetrics11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics11 = null;
        }
        textPaint9.setTextSize(h0.l(displayMetrics11, 11.0f));
        Typeface typeface2 = this.f7245r0;
        if (typeface2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface2 = null;
        }
        textPaint2.setTypeface(typeface2);
        textPaint2.setLetterSpacing(0.0f);
        textPaint2.setStrokeWidth(0.0f);
        textPaint2.setColor(-1);
        textPaint2.setStyle(style2);
        DisplayMetrics displayMetrics12 = this.f7211b;
        if (displayMetrics12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics12 = null;
        }
        textPaint2.setTextSize(h0.l(displayMetrics12, 16.0f));
        Typeface typeface3 = this.f7247s0;
        if (typeface3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            typeface3 = null;
        }
        textPaint3.setTypeface(typeface3);
        textPaint3.setLetterSpacing(0.0f);
        textPaint3.setStrokeWidth(0.0f);
        textPaint3.setColor(Color.parseColor("#d7d7d7"));
        textPaint3.setStyle(style2);
        DisplayMetrics displayMetrics13 = this.f7211b;
        if (displayMetrics13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics13 = null;
        }
        textPaint3.setTextSize(h0.l(displayMetrics13, 10.0f));
        Typeface typeface4 = this.f7245r0;
        if (typeface4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface4 = null;
        }
        textPaint7.setTypeface(typeface4);
        textPaint7.setLetterSpacing(0.0f);
        textPaint7.setStrokeWidth(0.0f);
        textPaint7.setColor(-1);
        textPaint7.setStyle(style2);
        DisplayMetrics displayMetrics14 = this.f7211b;
        if (displayMetrics14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics14 = null;
        }
        textPaint7.setTextSize(h0.l(displayMetrics14, 15.0f));
        Typeface typeface5 = this.f7245r0;
        if (typeface5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface5 = null;
        }
        TextPaint textPaint10 = textPaint;
        textPaint10.setTypeface(typeface5);
        textPaint10.setLetterSpacing(0.0f);
        textPaint10.setStrokeWidth(0.0f);
        textPaint10.setColor(-1);
        textPaint10.setStyle(style2);
        DisplayMetrics displayMetrics15 = this.f7211b;
        if (displayMetrics15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics15 = null;
        }
        textPaint10.setTextSize(h0.l(displayMetrics15, 18.0f));
        Typeface typeface6 = this.f7245r0;
        if (typeface6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface6 = null;
        }
        textPaint5.setTypeface(typeface6);
        textPaint5.setLetterSpacing(0.0f);
        textPaint5.setStrokeWidth(0.0f);
        textPaint5.setColor(-1);
        textPaint5.setStyle(style2);
        DisplayMetrics displayMetrics16 = this.f7211b;
        if (displayMetrics16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics16 = null;
        }
        textPaint5.setTextSize(h0.l(displayMetrics16, 11.0f));
        Typeface typeface7 = this.f7245r0;
        if (typeface7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoBold");
            typeface7 = null;
        }
        textPaint6.setTypeface(typeface7);
        textPaint6.setLetterSpacing(0.0f);
        textPaint6.setStrokeWidth(0.0f);
        textPaint6.setColor(-1);
        textPaint6.setStyle(style2);
        DisplayMetrics displayMetrics17 = this.f7211b;
        if (displayMetrics17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics17 = null;
        }
        textPaint6.setTextSize(h0.l(displayMetrics17, 10.0f));
        Typeface typeface8 = this.f7247s0;
        if (typeface8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fontArimoRegular");
            typeface8 = null;
        }
        textPaint4.setTypeface(typeface8);
        textPaint4.setUnderlineText(true);
        textPaint4.setLetterSpacing(0.0f);
        textPaint4.setStrokeWidth(0.0f);
        textPaint4.setColor(-1);
        textPaint4.setStyle(style2);
        DisplayMetrics displayMetrics18 = this.f7211b;
        if (displayMetrics18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics18 = null;
        }
        textPaint4.setTextSize(h0.l(displayMetrics18, 12.0f));
    }

    public static int b(Double d10, Double d11) {
        if (d10 == null || d11 == null || d10.doubleValue() <= 0.0d || d11.doubleValue() <= 0.0d) {
            return 0;
        }
        return (int) Math.abs(((d10.doubleValue() - d11.doubleValue()) / d10.doubleValue()) * 100);
    }

    public static Layout c(CheckPrice checkPrice, CharSequence charSequence, Integer num, TextPaint textPaint, int i5) {
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
        return this.f7215d / 2;
    }

    private final int getHeightTextLayoutHintFirst() {
        Layout layout = this.I0;
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    private final int getHeightTextLayoutHintSecond() {
        Layout layout = this.J0;
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    private final float getInnerRadius() {
        DisplayMetrics displayMetrics = this.f7211b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return this.innerRadius * displayMetrics.density;
    }

    private final int getMaxTextLayoutHintTrial() {
        int max = Math.max(getHeightTextLayoutHintFirst(), getHeightTextLayoutHintSecond());
        return max > 0 ? max + ((int) this.f7220g) : max;
    }

    private final float getOuterRadius() {
        DisplayMetrics displayMetrics = this.f7211b;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return this.outerRadius * displayMetrics.density;
    }

    private final float getPaddingInnerPanel() {
        DisplayMetrics displayMetrics = this.f7211b;
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

    public static final String h(CheckPrice checkPrice, b bVar) {
        int intValue;
        int intValue2;
        Pair j = aa.b.j(bVar != null ? bVar.f11078d : null);
        if (j == null) {
            return "";
        }
        Object obj = j.f19192a;
        Character ch2 = (Character) j.f19193b;
        if ((ch2.charValue() == 'D' && ((Number) obj).intValue() == 7) || (ch2.charValue() == 'W' && ((Number) obj).intValue() == 1)) {
            return ((za.i) checkPrice.getResourceGetter()).g(R.string.per_week);
        }
        if ((ch2.charValue() == 'M' && ((Number) obj).intValue() == 1) || ((ch2.charValue() == 'D' && 28 <= (intValue2 = ((Number) obj).intValue()) && intValue2 < 32) || (ch2.charValue() == 'W' && 3 <= (intValue = ((Number) obj).intValue()) && intValue < 5))) {
            return ((za.i) checkPrice.getResourceGetter()).g(R.string.per_month);
        }
        if ((ch2.charValue() != 'W' || ((Number) obj).intValue() <= 1) && ((ch2.charValue() != 'M' || ((Number) obj).intValue() <= 1) && (ch2.charValue() != 'D' || ((Number) obj).intValue() <= 0))) {
            return "";
        }
        return aa.b.k(bVar != null ? bVar.f11078d : null, checkPrice.getResources()) == null ? "" : ((za.i) checkPrice.getResourceGetter()).h(R.string.per_period_count_args, j);
    }

    public final int a() {
        float f6 = 13;
        DisplayMetrics displayMetrics = null;
        DisplayMetrics displayMetrics2 = this.f7211b;
        if (displayMetrics2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics2 = null;
        }
        float f10 = (displayMetrics2.density * f6) + this.f7238n0;
        Layout layout = this.f7251u0;
        int height = layout != null ? layout.getHeight() : 0;
        float max = f10 + Math.max(height, this.f7253v0 != null ? r6.getHeight() : 0);
        float f11 = 10;
        DisplayMetrics displayMetrics3 = this.f7211b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        float f12 = (displayMetrics3.density * f11) + max;
        Layout layout2 = this.M0;
        int height2 = layout2 != null ? layout2.getHeight() : 0;
        float max2 = f12 + Math.max(height2, this.N0 != null ? r7.getHeight() : 0);
        float f13 = 3;
        DisplayMetrics displayMetrics4 = this.f7211b;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        float f14 = (f13 * displayMetrics4.density) + max2;
        Layout layout3 = this.z0;
        int height3 = layout3 != null ? layout3.getHeight() : 0;
        float max3 = f14 + Math.max(height3, this.A0 != null ? r7.getHeight() : 0);
        DisplayMetrics displayMetrics5 = this.f7211b;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics5 = null;
        }
        float f15 = (f11 * displayMetrics5.density) + max3;
        Layout layout4 = this.G0;
        int height4 = layout4 != null ? layout4.getHeight() : 0;
        float max4 = f15 + Math.max(height4, this.H0 != null ? r6.getHeight() : 0);
        DisplayMetrics displayMetrics6 = this.f7211b;
        if (displayMetrics6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics = displayMetrics6;
        }
        return (int) ((f6 * displayMetrics.density) + max4 + this.f7243q0 + ((getHeightTextLayoutHintFirst() == 0 && getHeightTextLayoutHintSecond() == 0) ? 0.0f : getMaxTextLayoutHintTrial() + this.f7243q0));
    }

    public final void d(RectF rectF, RectF rectF2) {
        int parseColor = Color.parseColor(this.W0 == 3 ? "#40F9E324" : "#800957ee");
        int parseColor2 = Color.parseColor(this.W0 == 3 ? "#40FA3636" : "#807b14cc");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.C = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
        this.E = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
    }

    public final void e(RectF rectF, RectF rectF2) {
        int parseColor = Color.parseColor(this.W0 == 3 ? "#e5F9E324" : "#e50957EE");
        int parseColor2 = Color.parseColor(this.W0 == 3 ? "#e5FA3636" : "#e57B14CC");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.L = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
        this.j0 = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
    }

    public final void f(RectF rectF, RectF rectF2) {
        int parseColor = Color.parseColor(this.W0 == 3 ? "#FFFA3636" : "#FF0957EE");
        int parseColor2 = Color.parseColor(this.W0 == 3 ? "#FFF9E324" : "#FF7B14CC");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.q = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
        this.f7244r = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
    }

    public final void g(RectF rectF, RectF rectF2) {
        int parseColor = Color.parseColor(this.W0 == 3 ? "#FFFA3636" : "#FF0957EE");
        int parseColor2 = Color.parseColor(this.W0 == 3 ? "#FFF9E324" : "#FF7B14CC");
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f7246s = new LinearGradient(rectF.right - getOuterRadius(), ((rectF.bottom - rectF.top) / 2.0f) - getOuterRadius(), rectF.right + getOuterRadius(), ((rectF.bottom - rectF.top) / 2.0f) + getOuterRadius(), new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
        this.f7248t = new LinearGradient(rectF2.right - getOuterRadius(), ((rectF2.bottom - rectF2.top) / 2.0f) - getOuterRadius(), rectF2.right + getOuterRadius(), ((rectF2.bottom - rectF2.top) / 2.0f) + getOuterRadius(), new int[]{parseColor, parseColor2}, (float[]) null, tileMode);
    }

    /* renamed from: getCountPredictionBySub, reason: from getter */
    public final int getF7233l0() {
        return this.f7233l0;
    }

    @NotNull
    /* renamed from: getMinOddsBySubs, reason: from getter */
    public final String getF7210a1() {
        return this.f7210a1;
    }

    /* renamed from: getPassage, reason: from getter */
    public final int getF7236m0() {
        return this.f7236m0;
    }

    /* renamed from: getPercentBySub, reason: from getter */
    public final int getF7228i1() {
        return this.f7228i1;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0391  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        SpannableString spannableString;
        SpannableString spannableString2;
        String upperCase;
        String g10;
        String h10;
        int i5;
        b bVar;
        Long l6;
        int b10;
        b bVar2;
        Long l10;
        int b11;
        b bVar3;
        Long l11;
        long longValue;
        String str;
        Double d10;
        int b12;
        b bVar4;
        b bVar5;
        b bVar6;
        int i10;
        boolean z5;
        SpannableString spannableString3;
        b bVar7;
        SpannableString spannableString4;
        LinearGradient linearGradient;
        String str2;
        b bVar8;
        SpannableString spannableString5;
        boolean z7;
        Integer num;
        SpannableString spannableString6;
        SpannableString spannableString7;
        int a7;
        Character valueOf;
        String str3;
        String str4;
        String h11;
        Character valueOf2;
        b bVar9;
        SpannableString spannableString8;
        SpannableString spannableString9;
        int i11 = this.W0;
        if (i11 == 2 || i11 == 3) {
            SpannableString spannableString10 = new SpannableString(((za.i) getResourceGetter()).g(R.string.coefficient) + ' ' + this.f7212b1);
            DisplayMetrics displayMetrics = this.f7211b;
            if (displayMetrics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics = null;
            }
            Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
            spannableString10.setSpan(new AbsoluteSizeSpan((int) (Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 12.0f, displayMetrics) : displayMetrics.scaledDensity * 12.0f)), spannableString10.length() - this.f7212b1.length(), spannableString10.length(), 18);
            spannableString = spannableString10;
        } else {
            spannableString = new SpannableString("");
        }
        this.Q0 = spannableString;
        b bVar10 = this.U0;
        int i12 = bVar10 != null ? bVar10.j : 0;
        int i13 = this.W0;
        if (i13 == 4) {
            spannableString2 = new SpannableString("");
        } else if (i12 > 0) {
            if (this.f7229j1) {
                upperCase = "Первые 7 дней за 1 ₽".toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } else {
                g resourceGetter = getResourceGetter();
                b bVar11 = this.U0;
                upperCase = ((za.i) resourceGetter).h(R.string.days3_for_free, String.valueOf(aa.b.k(bVar11 != null ? bVar11.f11077c : null, getResources()))).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            }
            spannableString2 = new SpannableString(upperCase);
        } else if (i13 == 2) {
            String upperCase2 = ((za.i) getResourceGetter()).h(R.string.premium_every_day_args, this.f7210a1).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            spannableString2 = new SpannableString(upperCase2);
        } else if (i13 == 3) {
            String upperCase3 = ((za.i) getResourceGetter()).h(R.string.express_every_day_args, this.f7210a1).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            spannableString2 = new SpannableString(upperCase3);
        } else {
            spannableString2 = new SpannableString("");
        }
        this.R0 = spannableString2;
        int i14 = this.W0;
        if (i14 == 2) {
            g10 = ((za.i) getResourceGetter()).g(R.string.one_prediction);
        } else if (i14 == 3) {
            g10 = ((za.i) getResourceGetter()).g(R.string.one_express);
        } else if (i14 != 4) {
            g10 = "";
        } else {
            b bVar12 = this.S0;
            int i15 = bVar12 != null ? bVar12.j : 0;
            g10 = i15 > 0 ? ((za.i) getResourceGetter()).h(R.string.days3free_next, Integer.valueOf(i15)) : ((za.i) getResourceGetter()).g(R.string.forecast_week);
        }
        this.f7255w0 = new SpannableString(g10);
        int i16 = this.W0;
        if (i16 == 2) {
            h10 = ((za.i) getResourceGetter()).h(R.string.prediction_count_args, String.valueOf(this.f7233l0), ((za.i) getResourceGetter()).d(R.plurals.forecast_plurals, this.f7233l0));
        } else if (i16 == 3) {
            h10 = ((za.i) getResourceGetter()).h(R.string.express_count_args, String.valueOf(this.f7233l0), ((za.i) getResourceGetter()).d(R.plurals.express_plurals, this.f7233l0));
        } else if (i16 != 4) {
            h10 = ((za.i) getResourceGetter()).g(R.string.all_forecasts);
        } else {
            b bVar13 = this.U0;
            int i17 = bVar13 != null ? bVar13.j : 0;
            h10 = i17 > 0 ? ((za.i) getResourceGetter()).h(R.string.days3free_next, Integer.valueOf(i17)) : ((za.i) getResourceGetter()).g(R.string.forecast_month);
        }
        this.x0 = new SpannableString(h10);
        b bVar14 = this.S0;
        this.B0 = new SpannableString(bVar14 == null ? "" : bVar14.f11081g ? ((za.i) getResourceGetter()).g(R.string.for_a_prediction) : h(this, bVar14));
        b bVar15 = this.U0;
        this.C0 = new SpannableString(bVar15 == null ? "" : bVar15.f11081g ? ((za.i) getResourceGetter()).g(R.string.for_a_prediction) : h(this, bVar15));
        b bVar16 = this.S0;
        if (bVar16 != null) {
            Long l12 = bVar16.f11075a;
            if (this.T0 != null) {
                if (bVar16.f11080f != null) {
                    l12 = bVar16.f11076b;
                }
                i5 = b(Double.valueOf(l12.longValue()), this.T0 != null ? Double.valueOf(r8.f11075a.longValue()) : null);
                int i18 = this.W0 != 4 ? this.f7233l0 : 4;
                bVar = this.U0;
                if ((bVar == null ? bVar.f11080f : null) != null) {
                    if (bVar != null) {
                        l6 = bVar.f11075a;
                    }
                    l6 = null;
                } else if (bVar != null) {
                    l6 = bVar.f11076b;
                } else {
                    if (bVar != null) {
                        l6 = bVar.f11075a;
                    }
                    l6 = null;
                }
                b10 = b(l6 == null ? Double.valueOf(l6.longValue()) : null, this.V0 == null ? Double.valueOf(r12.f11075a.longValue()) : null);
                bVar2 = this.T0;
                if ((bVar2 == null ? bVar2.f11080f : null) != null) {
                    if (bVar2 != null) {
                        l10 = bVar2.f11075a;
                    }
                    l10 = null;
                } else if (bVar2 != null) {
                    l10 = bVar2.f11076b;
                } else {
                    if (bVar2 != null) {
                        l10 = bVar2.f11075a;
                    }
                    l10 = null;
                }
                b11 = b(l10 == null ? Double.valueOf(l10.longValue() * i18) : null, this.U0 == null ? Double.valueOf(r13.f11075a.longValue()) : null);
                bVar3 = this.S0;
                if ((bVar3 == null ? bVar3.f11080f : null) != null) {
                    if (bVar3 != null) {
                        l11 = bVar3.f11075a;
                    }
                    l11 = null;
                } else {
                    if (bVar3 != null) {
                        l11 = bVar3.f11076b;
                    }
                    l11 = null;
                }
                if (l11 == null) {
                    longValue = l11.longValue();
                } else {
                    Long l13 = bVar3 != null ? bVar3.f11075a : null;
                    longValue = l13 != null ? l13.longValue() : 0L;
                }
                if (this.U0 == null) {
                    str = "";
                    d10 = Double.valueOf(r15.f11075a.longValue());
                } else {
                    str = "";
                    d10 = null;
                }
                b12 = b(Double.valueOf(longValue * i18), d10);
                if (b10 > b11 || b10 <= b12) {
                    b10 = (b11 > b10 || b11 <= b12) ? (b12 > b10 || b12 <= b11) ? 0 : b12 : b11;
                }
                if (this.f7225h1 != i5) {
                    this.f7225h1 = i5;
                    i();
                }
                if (this.f7228i1 != b10) {
                    this.f7228i1 = b10;
                    i();
                    i iVar = this.f7231k1;
                    if (iVar != null) {
                        iVar.q(this.f7228i1, this.f7210a1);
                    }
                }
                bVar4 = this.U0;
                if (bVar4 != null) {
                    String str5 = bVar4.f11082h;
                    if (str5 == null) {
                        str5 = bVar4.f11083i;
                    }
                    if (str5 == null) {
                        spannableString9 = new SpannableString("Payment launch");
                    } else {
                        b bVar17 = this.V0;
                        if (bVar17 == null || bVar17.f11075a.longValue() == 0) {
                            spannableString9 = new SpannableString(str5);
                        } else {
                            b bVar18 = this.V0;
                            spannableString9 = l(bVar18 != null ? bVar18.f11075a.longValue() : 0L, str5);
                        }
                    }
                    this.Z0 = spannableString9;
                }
                bVar5 = this.S0;
                if (bVar5 != null) {
                    String str6 = bVar5.f11082h;
                    if (str6 == null) {
                        str6 = bVar5.f11083i;
                    }
                    if (str6 == null) {
                        spannableString8 = new SpannableString("Payment launch");
                    } else {
                        b bVar19 = this.T0;
                        if (bVar19 == null || bVar19.f11075a.longValue() == 0) {
                            spannableString8 = new SpannableString(str6);
                        } else {
                            b bVar20 = this.T0;
                            spannableString8 = l(bVar20 != null ? bVar20.f11075a.longValue() : 0L, str6);
                        }
                    }
                    this.Y0 = spannableString8;
                }
                bVar6 = this.S0;
                if (bVar6 != null || bVar6.f11081g) {
                    i10 = 0;
                    z5 = true;
                    spannableString3 = new SpannableString(((za.i) getResourceGetter()).g(R.string.PurchasesTerms));
                } else {
                    int i19 = bVar6.j;
                    if (i19 > 0) {
                        i10 = 0;
                        String str7 = bVar6.f11082h;
                        if (str7 == null && (str7 = bVar6.f11083i) == null) {
                            str7 = str;
                        }
                        z5 = true;
                        spannableString3 = new SpannableString(((za.i) getResourceGetter()).h(R.string.trial_time_next_price0, Integer.valueOf(i19), str7, this.B0));
                    } else {
                        i10 = 0;
                        z5 = true;
                        b bVar21 = this.U0;
                        String str8 = bVar21 != null ? bVar21.f11078d : null;
                        if (str8 != null) {
                            String upperCase4 = str8.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                            char[] charArray = upperCase4.toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                            if (charArray.length == 3 && charArray[0] == 'P') {
                                valueOf2 = Character.valueOf(charArray[2]);
                                String string = (valueOf2 != null && valueOf2.charValue() == 'W') ? getResources().getString(R.string.in_week) : (valueOf2 != null && valueOf2.charValue() == 'M') ? getResources().getString(R.string.in_month) : str;
                                Intrinsics.checkNotNull(string);
                                bVar9 = this.U0;
                                if (bVar9 != null || (r2 = bVar9.f11083i) == null) {
                                    String str9 = str;
                                }
                                spannableString3 = new SpannableString(getResources().getString(R.string.SubscriptionTermsWithPrice, str9, string));
                            }
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                            Intrinsics.checkNotNull(string);
                            bVar9 = this.U0;
                            if (bVar9 != null) {
                            }
                            String str92 = str;
                            spannableString3 = new SpannableString(getResources().getString(R.string.SubscriptionTermsWithPrice, str92, string));
                        }
                        if (valueOf2 != null) {
                            Intrinsics.checkNotNull(string);
                            bVar9 = this.U0;
                            if (bVar9 != null) {
                            }
                            String str922 = str;
                            spannableString3 = new SpannableString(getResources().getString(R.string.SubscriptionTermsWithPrice, str922, string));
                        }
                        Intrinsics.checkNotNull(string);
                        bVar9 = this.U0;
                        if (bVar9 != null) {
                        }
                        String str9222 = str;
                        spannableString3 = new SpannableString(getResources().getString(R.string.SubscriptionTermsWithPrice, str9222, string));
                    }
                }
                this.O0 = spannableString3;
                bVar7 = this.U0;
                if (bVar7 != null || bVar7.f11081g == z5) {
                    spannableString4 = new SpannableString(((za.i) getResourceGetter()).g(R.string.PurchasesTerms));
                } else {
                    int i20 = bVar7.j;
                    if (i20 > 0) {
                        String str10 = bVar7.f11082h;
                        if (str10 == null) {
                            str4 = bVar7.f11083i;
                            if (str4 == null) {
                                str4 = str;
                            }
                        } else {
                            str4 = str10;
                        }
                        if (this.f7229j1) {
                            h11 = "Пробный период 7 дней за 1₽, далее " + str4 + ' ' + ((Object) this.C0);
                        } else {
                            g resourceGetter2 = getResourceGetter();
                            Integer valueOf3 = Integer.valueOf(i20);
                            SpannableString spannableString11 = this.C0;
                            Object[] objArr = new Object[3];
                            objArr[i10] = valueOf3;
                            objArr[1] = str4;
                            objArr[2] = spannableString11;
                            h11 = ((za.i) resourceGetter2).h(R.string.trial_time_next_price0, objArr);
                        }
                        spannableString4 = new SpannableString(h11);
                    } else {
                        String str11 = bVar7.f11078d;
                        if (str11 != null) {
                            String upperCase5 = str11.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
                            char[] charArray2 = upperCase5.toCharArray();
                            Intrinsics.checkNotNullExpressionValue(charArray2, "toCharArray(...)");
                            if (charArray2.length == 3 && charArray2[i10] == 'P') {
                                valueOf = Character.valueOf(charArray2[2]);
                                String string2 = (valueOf != null && valueOf.charValue() == 'W') ? getResources().getString(R.string.in_week) : (valueOf != null && valueOf.charValue() == 'M') ? getResources().getString(R.string.in_month) : str;
                                Intrinsics.checkNotNull(string2);
                                b bVar22 = this.U0;
                                String str12 = (bVar22 != null || (str3 = bVar22.f11083i) == null) ? str : str3;
                                Resources resources = getResources();
                                Object[] objArr2 = new Object[2];
                                objArr2[i10] = str12;
                                objArr2[1] = string2;
                                spannableString4 = new SpannableString(resources.getString(R.string.SubscriptionTermsWithPrice, objArr2));
                            }
                        }
                        valueOf = null;
                        if (valueOf != null) {
                            Intrinsics.checkNotNull(string2);
                            b bVar222 = this.U0;
                            if (bVar222 != null) {
                            }
                            Resources resources2 = getResources();
                            Object[] objArr22 = new Object[2];
                            objArr22[i10] = str12;
                            objArr22[1] = string2;
                            spannableString4 = new SpannableString(resources2.getString(R.string.SubscriptionTermsWithPrice, objArr22));
                        }
                        if (valueOf != null) {
                            Intrinsics.checkNotNull(string2);
                            b bVar2222 = this.U0;
                            if (bVar2222 != null) {
                            }
                            Resources resources22 = getResources();
                            Object[] objArr222 = new Object[2];
                            objArr222[i10] = str12;
                            objArr222[1] = string2;
                            spannableString4 = new SpannableString(resources22.getString(R.string.SubscriptionTermsWithPrice, objArr222));
                        }
                        Intrinsics.checkNotNull(string2);
                        b bVar22222 = this.U0;
                        if (bVar22222 != null) {
                        }
                        Resources resources222 = getResources();
                        Object[] objArr2222 = new Object[2];
                        objArr2222[i10] = str12;
                        objArr2222[1] = string2;
                        spannableString4 = new SpannableString(resources222.getString(R.string.SubscriptionTermsWithPrice, objArr2222));
                    }
                }
                this.P0 = spannableString4;
                if (this.A) {
                    linearGradient = this.q;
                    if (linearGradient == null) {
                        str2 = "shaderIcOkLeft";
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        linearGradient = null;
                    }
                } else {
                    linearGradient = this.f7244r;
                    if (linearGradient == null) {
                        str2 = "shaderIcOkRight";
                        Intrinsics.throwUninitializedPropertyAccessException(str2);
                        linearGradient = null;
                    }
                }
                this.f7230k.setShader(linearGradient);
                String i21 = e.i(new StringBuilder("-"), this.f7225h1, '%');
                int length = i21.length();
                Rect rect = this.f7214c1;
                TextPaint textPaint = this.f7217e1;
                int i22 = i10;
                textPaint.getTextBounds(i21, i22, length, rect);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                this.f7219f1 = c(this, i21, null, textPaint, 106);
                String i23 = e.i(new StringBuilder("-"), this.f7228i1, '%');
                textPaint.getTextBounds(i23, i22, i23.length(), this.d1);
                this.f7222g1 = c(this, i23, null, textPaint, 106);
                SpannableString spannableString12 = this.f7255w0;
                float f6 = 2;
                int paddingInnerPanel = (int) ((this.J.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                Integer valueOf4 = paddingInnerPanel <= 0 ? Integer.valueOf(paddingInnerPanel) : null;
                TextPaint textPaint2 = this.f7249t0;
                this.f7251u0 = c(this, spannableString12, valueOf4, textPaint2, 32);
                SpannableString spannableString13 = this.x0;
                int paddingInnerPanel2 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.f7224h0.left);
                this.f7253v0 = c(this, spannableString13, paddingInnerPanel2 <= 0 ? Integer.valueOf(paddingInnerPanel2) : null, textPaint2, 32);
                SpannableString spannableString14 = this.B0;
                int paddingInnerPanel3 = (int) ((this.J.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                Integer valueOf5 = paddingInnerPanel3 <= 0 ? Integer.valueOf(paddingInnerPanel3) : null;
                TextPaint textPaint3 = this.f7258y0;
                this.z0 = c(this, spannableString14, valueOf5, textPaint3, 96);
                SpannableString spannableString15 = this.C0;
                int paddingInnerPanel4 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.f7224h0.left);
                this.A0 = c(this, spannableString15, paddingInnerPanel4 <= 0 ? Integer.valueOf(paddingInnerPanel4) : null, textPaint3, 96);
                bVar8 = this.S0;
                spannableString5 = this.X0;
                if (bVar8 != null) {
                    z7 = true;
                    if (this.f7234l1 == 1) {
                        if (spannableString5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("textBonus");
                            spannableString5 = null;
                        }
                        int paddingInnerPanel5 = (int) ((this.J.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                        this.M0 = c(this, spannableString5, paddingInnerPanel5 > 0 ? Integer.valueOf(paddingInnerPanel5) : null, this.K0, 32);
                        SpannableString spannableString16 = this.Z0;
                        int paddingInnerPanel6 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.f7224h0.left);
                        this.N0 = c(this, spannableString16, paddingInnerPanel6 > 0 ? Integer.valueOf(paddingInnerPanel6) : null, this.L0, 32);
                        if (this.Q0.length() == 0 || this.R0.length() != 0) {
                            num = null;
                            SpannableString spannableString17 = this.Q0;
                            int paddingInnerPanel7 = (int) ((this.J.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                            this.G0 = c(this, spannableString17, paddingInnerPanel7 > 0 ? Integer.valueOf(paddingInnerPanel7) : null, this.E0, 32);
                            SpannableString spannableString18 = this.R0;
                            int paddingInnerPanel8 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.f7224h0.left);
                            this.H0 = c(this, spannableString18, paddingInnerPanel8 > 0 ? Integer.valueOf(paddingInnerPanel8) : null, this.F0, 32);
                        } else {
                            num = null;
                            this.G0 = null;
                            this.H0 = null;
                        }
                        spannableString6 = this.O0;
                        TextPaint textPaint4 = this.D0;
                        if (spannableString6 != null) {
                            int paddingInnerPanel9 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                            this.I0 = c(this, spannableString6, paddingInnerPanel9 > 0 ? Integer.valueOf(paddingInnerPanel9) : num, textPaint4, 32);
                        }
                        spannableString7 = this.P0;
                        if (spannableString7 != null) {
                            int paddingInnerPanel10 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                            this.J0 = c(this, spannableString7, paddingInnerPanel10 > 0 ? Integer.valueOf(paddingInnerPanel10) : num, textPaint4, 32);
                        }
                        a7 = a();
                        if (a7 == this.f7213c) {
                            invalidate();
                            return;
                        } else {
                            this.f7218f = a7;
                            requestLayout();
                            return;
                        }
                    }
                } else {
                    z7 = true;
                }
                if (bVar8 != null || bVar8.f11081g != z7 || this.f7234l1 != z7) {
                    spannableString5 = this.Y0;
                } else if (spannableString5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textBonus");
                    spannableString5 = null;
                }
                int paddingInnerPanel52 = (int) ((this.J.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                this.M0 = c(this, spannableString5, paddingInnerPanel52 > 0 ? Integer.valueOf(paddingInnerPanel52) : null, this.K0, 32);
                SpannableString spannableString162 = this.Z0;
                int paddingInnerPanel62 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.f7224h0.left);
                this.N0 = c(this, spannableString162, paddingInnerPanel62 > 0 ? Integer.valueOf(paddingInnerPanel62) : null, this.L0, 32);
                if (this.Q0.length() == 0) {
                }
                num = null;
                SpannableString spannableString172 = this.Q0;
                int paddingInnerPanel72 = (int) ((this.J.right - (getPaddingInnerPanel() * f6)) - this.J.left);
                this.G0 = c(this, spannableString172, paddingInnerPanel72 > 0 ? Integer.valueOf(paddingInnerPanel72) : null, this.E0, 32);
                SpannableString spannableString182 = this.R0;
                int paddingInnerPanel82 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f6)) - this.f7224h0.left);
                this.H0 = c(this, spannableString182, paddingInnerPanel82 > 0 ? Integer.valueOf(paddingInnerPanel82) : null, this.F0, 32);
                spannableString6 = this.O0;
                TextPaint textPaint42 = this.D0;
                if (spannableString6 != null) {
                }
                spannableString7 = this.P0;
                if (spannableString7 != null) {
                }
                a7 = a();
                if (a7 == this.f7213c) {
                }
            }
        }
        i5 = 0;
        if (this.W0 != 4) {
        }
        bVar = this.U0;
        if ((bVar == null ? bVar.f11080f : null) != null) {
        }
        if (l6 == null) {
        }
        b10 = b(l6 == null ? Double.valueOf(l6.longValue()) : null, this.V0 == null ? Double.valueOf(r12.f11075a.longValue()) : null);
        bVar2 = this.T0;
        if ((bVar2 == null ? bVar2.f11080f : null) != null) {
        }
        if (l10 == null) {
        }
        b11 = b(l10 == null ? Double.valueOf(l10.longValue() * i18) : null, this.U0 == null ? Double.valueOf(r13.f11075a.longValue()) : null);
        bVar3 = this.S0;
        if ((bVar3 == null ? bVar3.f11080f : null) != null) {
        }
        if (l11 == null) {
        }
        if (this.U0 == null) {
        }
        b12 = b(Double.valueOf(longValue * i18), d10);
        if (b10 > b11) {
        }
        if (b11 > b10) {
        }
        if (this.f7225h1 != i5) {
        }
        if (this.f7228i1 != b10) {
        }
        bVar4 = this.U0;
        if (bVar4 != null) {
        }
        bVar5 = this.S0;
        if (bVar5 != null) {
        }
        bVar6 = this.S0;
        if (bVar6 != null) {
        }
        i10 = 0;
        z5 = true;
        spannableString3 = new SpannableString(((za.i) getResourceGetter()).g(R.string.PurchasesTerms));
        this.O0 = spannableString3;
        bVar7 = this.U0;
        if (bVar7 != null) {
        }
        spannableString4 = new SpannableString(((za.i) getResourceGetter()).g(R.string.PurchasesTerms));
        this.P0 = spannableString4;
        if (this.A) {
        }
        this.f7230k.setShader(linearGradient);
        String i212 = e.i(new StringBuilder("-"), this.f7225h1, '%');
        int length2 = i212.length();
        Rect rect2 = this.f7214c1;
        TextPaint textPaint5 = this.f7217e1;
        int i222 = i10;
        textPaint5.getTextBounds(i212, i222, length2, rect2);
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        this.f7219f1 = c(this, i212, null, textPaint5, 106);
        String i232 = e.i(new StringBuilder("-"), this.f7228i1, '%');
        textPaint5.getTextBounds(i232, i222, i232.length(), this.d1);
        this.f7222g1 = c(this, i232, null, textPaint5, 106);
        SpannableString spannableString122 = this.f7255w0;
        float f62 = 2;
        int paddingInnerPanel11 = (int) ((this.J.right - (getPaddingInnerPanel() * f62)) - this.J.left);
        if (paddingInnerPanel11 <= 0) {
        }
        TextPaint textPaint22 = this.f7249t0;
        this.f7251u0 = c(this, spannableString122, valueOf4, textPaint22, 32);
        SpannableString spannableString132 = this.x0;
        int paddingInnerPanel22 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f62)) - this.f7224h0.left);
        this.f7253v0 = c(this, spannableString132, paddingInnerPanel22 <= 0 ? Integer.valueOf(paddingInnerPanel22) : null, textPaint22, 32);
        SpannableString spannableString142 = this.B0;
        int paddingInnerPanel32 = (int) ((this.J.right - (getPaddingInnerPanel() * f62)) - this.J.left);
        if (paddingInnerPanel32 <= 0) {
        }
        TextPaint textPaint32 = this.f7258y0;
        this.z0 = c(this, spannableString142, valueOf5, textPaint32, 96);
        SpannableString spannableString152 = this.C0;
        int paddingInnerPanel42 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f62)) - this.f7224h0.left);
        this.A0 = c(this, spannableString152, paddingInnerPanel42 <= 0 ? Integer.valueOf(paddingInnerPanel42) : null, textPaint32, 96);
        bVar8 = this.S0;
        spannableString5 = this.X0;
        if (bVar8 != null) {
        }
        if (bVar8 != null) {
        }
        spannableString5 = this.Y0;
        int paddingInnerPanel522 = (int) ((this.J.right - (getPaddingInnerPanel() * f62)) - this.J.left);
        this.M0 = c(this, spannableString5, paddingInnerPanel522 > 0 ? Integer.valueOf(paddingInnerPanel522) : null, this.K0, 32);
        SpannableString spannableString1622 = this.Z0;
        int paddingInnerPanel622 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f62)) - this.f7224h0.left);
        this.N0 = c(this, spannableString1622, paddingInnerPanel622 > 0 ? Integer.valueOf(paddingInnerPanel622) : null, this.L0, 32);
        if (this.Q0.length() == 0) {
        }
        num = null;
        SpannableString spannableString1722 = this.Q0;
        int paddingInnerPanel722 = (int) ((this.J.right - (getPaddingInnerPanel() * f62)) - this.J.left);
        this.G0 = c(this, spannableString1722, paddingInnerPanel722 > 0 ? Integer.valueOf(paddingInnerPanel722) : null, this.E0, 32);
        SpannableString spannableString1822 = this.R0;
        int paddingInnerPanel822 = (int) ((this.f7224h0.right - (getPaddingInnerPanel() * f62)) - this.f7224h0.left);
        this.H0 = c(this, spannableString1822, paddingInnerPanel822 > 0 ? Integer.valueOf(paddingInnerPanel822) : null, this.F0, 32);
        spannableString6 = this.O0;
        TextPaint textPaint422 = this.D0;
        if (spannableString6 != null) {
        }
        spannableString7 = this.P0;
        if (spannableString7 != null) {
        }
        a7 = a();
        if (a7 == this.f7213c) {
        }
    }

    public final void j() {
        float f6;
        float f10;
        LinearGradient linearGradient;
        float f11 = this.f7216e - this.f7243q0;
        if (getHeightTextLayoutHintFirst() == 0 && getHeightTextLayoutHintSecond() == 0) {
            f6 = 0.0f;
        } else {
            float maxTextLayoutHintTrial = getMaxTextLayoutHintTrial();
            DisplayMetrics displayMetrics = this.f7211b;
            if (displayMetrics == null) {
                Intrinsics.throwUninitializedPropertyAccessException("metrics");
                displayMetrics = null;
            }
            f6 = (10.0f * displayMetrics.density) + maxTextLayoutHintTrial;
        }
        float f12 = f11 - f6;
        this.J = new RectF(this.f7240o0 + 0.0f, this.f7238n0 + 0.0f, getCenterXAbsolute() - (this.f7242p0 / 4.0f), f12);
        RectF rectF = this.J;
        float f13 = rectF.left;
        float f14 = this.H;
        this.K = new RectF(f13 + f14, rectF.top + f14, rectF.right - f14, rectF.bottom - f14);
        this.f7224h0 = new RectF((this.f7240o0 / 4.0f) + getCenterXAbsolute(), this.f7238n0 + 0.0f, this.f7215d - this.f7242p0, f12);
        RectF rectF2 = this.f7224h0;
        float f15 = rectF2.left;
        float f16 = this.H;
        this.f7227i0 = new RectF(f15 + f16, rectF2.top + f16, rectF2.right - f16, rectF2.bottom - f16);
        RectF rectF3 = this.J;
        float f17 = rectF3.right;
        float f18 = this.f7220g;
        float f19 = rectF3.top;
        float f20 = this.f7223h;
        this.f7239o = new RectF(f17 - f18, f19 - f20, f17 + f20, f19 + f18);
        RectF rectF4 = this.f7224h0;
        float f21 = rectF4.right;
        float f22 = this.f7220g;
        float f23 = rectF4.top;
        float f24 = this.f7223h;
        RectF rectF5 = new RectF(f21 - f22, f23 - f24, f21 + f24, f23 + f22);
        this.f7241p = rectF5;
        RectF rectF6 = this.f7239o;
        DisplayMetrics displayMetrics2 = this.f7211b;
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
        this.f7235m = path;
        Path path2 = new Path();
        path2.moveTo(rectF5.right - f26, rectF5.top + f26);
        path2.lineTo(rectF5.right - f27, rectF5.bottom - f26);
        path2.lineTo(rectF5.left + f28, rectF5.bottom - f29);
        this.f7237n = path2;
        f(this.f7239o, this.f7241p);
        RectF rectF7 = this.J;
        RectF rectF8 = this.f7224h0;
        DisplayMetrics displayMetrics3 = this.f7211b;
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
        this.f7226i = path3;
        Path path4 = new Path();
        path4.moveTo(rectF8.right - f31, rectF8.top);
        path4.lineTo(rectF8.right - f33, rectF8.top);
        path4.lineTo(rectF8.right - f33, rectF8.top + f32);
        path4.lineTo(rectF8.right - f34, rectF8.top + f35);
        path4.lineTo(rectF8.right - f31, rectF8.top + f32);
        path4.close();
        this.j = path4;
        e(this.J, this.f7224h0);
        LinearGradient linearGradient2 = this.L;
        if (linearGradient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameLeft");
            linearGradient2 = null;
        }
        this.f7221g0.setShader(linearGradient2);
        LinearGradient linearGradient3 = this.j0;
        if (linearGradient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderFrameRight");
            linearGradient3 = null;
        }
        this.k0.setShader(linearGradient3);
        d(this.J, this.f7224h0);
        LinearGradient linearGradient4 = this.C;
        if (linearGradient4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedLeft");
            linearGradient4 = null;
        }
        this.B.setShader(linearGradient4);
        LinearGradient linearGradient5 = this.E;
        if (linearGradient5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderBackgroundCheckedRight");
            linearGradient5 = null;
        }
        this.D.setShader(linearGradient5);
        RectF rectF9 = this.J;
        RectF rectF10 = this.f7224h0;
        double d10 = 3.141592653589793d / 23;
        float radiusStar = (rectF9.right - (getRadiusStar() * 2.0f)) + getOuterRadius();
        float radiusStar2 = (((rectF9.bottom - rectF9.top) / 2.0f) - getRadiusStar()) + getOuterRadius();
        float radiusStar3 = (rectF10.right - (getRadiusStar() * 2.0f)) + getOuterRadius();
        float radiusStar4 = (((rectF10.bottom - rectF10.top) / 2.0f) - getRadiusStar()) + getOuterRadius();
        Path path5 = this.f7254w;
        if (!path5.isEmpty()) {
            path5.reset();
        }
        Path path6 = this.f7256x;
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
        g(this.J, this.f7224h0);
        LinearGradient linearGradient6 = this.f7246s;
        if (linearGradient6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarLeft");
            linearGradient6 = null;
        }
        this.f7250u.setShader(linearGradient6);
        LinearGradient linearGradient7 = this.f7248t;
        if (linearGradient7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shaderStarRight");
            linearGradient = null;
        } else {
            linearGradient = linearGradient7;
        }
        this.f7252v.setShader(linearGradient);
        i();
    }

    public final void k(int i5, int i10, String odds) {
        Intrinsics.checkNotNullParameter(odds, "odds");
        if (Intrinsics.areEqual(this.f7210a1, odds) && this.f7233l0 == i5) {
            return;
        }
        this.f7210a1 = odds;
        this.f7233l0 = i5;
        this.f7236m0 = i10;
        i();
        i iVar = this.f7231k1;
        if (iVar != null) {
            iVar.q(this.f7228i1, this.f7210a1);
        }
    }

    public final SpannableString l(long j, String str) {
        if (j == 0) {
            return new SpannableString(str);
        }
        String str2 = str + '\n' + (j / 1000000.0d);
        SpannableString spannableString = new SpannableString(str2);
        int length = str.length() + 1;
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D7D7D7")), length, str2.length(), 18);
        spannableString.setSpan(new StrikethroughSpan(), length, str2.length(), 18);
        DisplayMetrics displayMetrics = this.f7211b;
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
        j();
        this.f7209a = new GestureDetector(getContext(), new c(2, this));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7231k1 = null;
        this.f7209a = null;
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
        Rect rect = this.d1;
        Rect rect2 = this.f7214c1;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        boolean z5 = this.A;
        RectF rectF = z5 ? this.f7227i0 : this.K;
        float f6 = this.G;
        float f10 = this.H;
        float f11 = f6 - f10;
        canvas.drawRoundRect(rectF, f11, f11, z5 ? this.D : this.B);
        Path path3 = this.I;
        path3.rewind();
        RectF rectF2 = this.K;
        float f12 = f6 - f10;
        Path.Direction direction = Path.Direction.CCW;
        path3.addRoundRect(rectF2, f12, f12, direction);
        s6.a.c(canvas, path3);
        path3.rewind();
        path3.addRoundRect(this.J, f6, f6, direction);
        Paint paint = this.f7221g0;
        canvas.drawPath(path3, paint);
        path3.rewind();
        float f13 = f6 - f10;
        path3.addRoundRect(this.f7227i0, f13, f13, direction);
        s6.a.c(canvas, path3);
        path3.rewind();
        path3.addRoundRect(this.f7224h0, f6, f6, direction);
        Paint paint2 = this.k0;
        canvas.drawPath(path3, paint2);
        canvas.restore();
        canvas.drawOval(this.A ? this.f7241p : this.f7239o, this.f7230k);
        if (this.A) {
            path = this.f7237n;
            if (path == null) {
                str = "pathIcOkRight";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                path = null;
            }
        } else {
            path = this.f7235m;
            if (path == null) {
                str = "pathIcOkLeft";
                Intrinsics.throwUninitializedPropertyAccessException(str);
                path = null;
            }
        }
        canvas.drawPath(path, this.f7232l);
        if (this.A) {
            path2 = this.f7226i;
            if (path2 == null) {
                str2 = "pathIcMarkLeft";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                path2 = null;
            }
        } else {
            path2 = this.j;
            if (path2 == null) {
                str2 = "pathIcMarkRight";
                Intrinsics.throwUninitializedPropertyAccessException(str2);
                path2 = null;
            }
        }
        if (!this.A) {
            paint = paint2;
        }
        canvas.drawPath(path2, paint);
        if (this.f7225h1 > 0) {
            save = canvas.save();
            try {
                canvas.drawPath(this.f7254w, this.f7250u);
                canvas.restoreToCount(save);
                save = canvas.save();
                try {
                    RectF rectF3 = this.J;
                    float f14 = rectF3.right - ((rect2.right - rect2.left) / 2.0f);
                    float height = ((rect2.height() - ((Math.abs(rect2.top) - Math.abs(rect2.bottom)) / 2)) / 2.0f) + ((rectF3.bottom - rectF3.top) / 2.0f);
                    RectF rectF4 = this.J;
                    float f15 = (f14 - rectF4.right) + (rect2.right - rect2.left);
                    float height2 = (height - ((rectF4.bottom - rectF4.top) / 2.0f)) + (rect2.height() - ((Math.abs(rect2.top) - Math.abs(rect2.bottom)) / 2));
                    canvas.translate(f14, height);
                    canvas.rotate(20.0f, f15, height2);
                    Layout layout2 = this.f7219f1;
                    if (layout2 != null) {
                        layout2.draw(canvas);
                        Unit unit = Unit.f19194a;
                    }
                } finally {
                }
            } finally {
            }
        }
        if (this.f7228i1 > 0) {
            save = canvas.save();
            try {
                canvas.drawPath(this.f7256x, this.f7252v);
                canvas.restoreToCount(save);
                save = canvas.save();
                try {
                    RectF rectF5 = this.f7224h0;
                    float f16 = rectF5.right - ((rect.right - rect.left) / 2.0f);
                    float height3 = ((rect.height() - ((Math.abs(rect.top) - Math.abs(rect.bottom)) / 2)) / 2.0f) + ((rectF5.bottom - rectF5.top) / 2.0f);
                    RectF rectF6 = this.f7224h0;
                    float f17 = (f16 - rectF6.right) + (rect.right - rect.left);
                    float height4 = (height3 - ((rectF6.bottom - rectF6.top) / 2.0f)) + (rect.height() - ((Math.abs(rect.top) - Math.abs(rect.bottom)) / 2));
                    canvas.translate(f16, height3);
                    canvas.rotate(30.0f, f17, height4);
                    Layout layout3 = this.f7222g1;
                    if (layout3 != null) {
                        layout3.draw(canvas);
                        Unit unit2 = Unit.f19194a;
                    }
                } finally {
                }
            } finally {
            }
        }
        float f18 = this.J.top;
        float f19 = 13;
        DisplayMetrics displayMetrics3 = this.f7211b;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        } else {
            displayMetrics = displayMetrics3;
        }
        float f20 = (f19 * displayMetrics.density) + f18;
        Layout layout4 = this.f7251u0;
        int i5 = 0;
        int height5 = layout4 != null ? layout4.getHeight() : 0;
        Layout layout5 = this.f7253v0;
        int height6 = layout5 != null ? layout5.getHeight() : 0;
        int max = Math.max(height5, height6);
        int i10 = (max - height5) / 2;
        int i11 = (max - height6) / 2;
        canvas.save();
        float paddingInnerPanel = this.J.left + getPaddingInnerPanel();
        float f21 = 0.0f;
        if (this.f7251u0 == null) {
            d10 = 0.0f;
        } else {
            RectF rectF7 = this.J;
            float width = (rectF7.right - rectF7.left) - r12.getWidth();
            float f22 = 2;
            d10 = e.d(getPaddingInnerPanel(), f22, width, f22);
        }
        canvas.translate(paddingInnerPanel + d10, i10 + f20);
        Layout layout6 = this.f7251u0;
        if (layout6 != null) {
            layout6.draw(canvas);
            Unit unit3 = Unit.f19194a;
        }
        canvas.restore();
        canvas.save();
        float paddingInnerPanel2 = this.f7224h0.left + getPaddingInnerPanel();
        if (this.f7253v0 == null) {
            d11 = 0.0f;
        } else {
            RectF rectF8 = this.f7224h0;
            float width2 = (rectF8.right - rectF8.left) - r11.getWidth();
            float f23 = 2;
            d11 = e.d(getPaddingInnerPanel(), f23, width2, f23);
        }
        canvas.translate(paddingInnerPanel2 + d11, i11 + f20);
        Layout layout7 = this.f7253v0;
        if (layout7 != null) {
            layout7.draw(canvas);
            Unit unit4 = Unit.f19194a;
        }
        canvas.restore();
        canvas.save();
        Layout layout8 = this.M0;
        int height7 = layout8 != null ? layout8.getHeight() : 0;
        Layout layout9 = this.N0;
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
        float paddingInnerPanel3 = this.J.left + getPaddingInnerPanel();
        if (this.M0 == null) {
            d12 = 0.0f;
        } else {
            RectF rectF9 = this.J;
            float width3 = (rectF9.right - rectF9.left) - r14.getWidth();
            float f27 = 2;
            d12 = e.d(getPaddingInnerPanel(), f27, width3, f27);
        }
        canvas.translate(paddingInnerPanel3 + d12, i12 + f26);
        Layout layout10 = this.M0;
        if (layout10 != null) {
            layout10.draw(canvas);
            Unit unit5 = Unit.f19194a;
        }
        canvas.restore();
        float paddingInnerPanel4 = this.f7224h0.left + getPaddingInnerPanel();
        if (this.N0 == null) {
            d13 = 0.0f;
        } else {
            RectF rectF10 = this.f7224h0;
            float width4 = (rectF10.right - rectF10.left) - r7.getWidth();
            float f28 = 2;
            d13 = e.d(getPaddingInnerPanel(), f28, width4, f28);
        }
        save = canvas.save();
        canvas.translate(paddingInnerPanel4 + d13, f26 + i13);
        try {
            Layout layout11 = this.N0;
            if (layout11 != null) {
                layout11.draw(canvas);
                Unit unit6 = Unit.f19194a;
            }
            canvas.restoreToCount(save);
            float paddingInnerPanel5 = this.J.left + getPaddingInnerPanel();
            if (this.z0 == null) {
                d14 = 0.0f;
            } else {
                RectF rectF11 = this.J;
                float width5 = (rectF11.right - rectF11.left) - r7.getWidth();
                float f29 = 2;
                d14 = e.d(getPaddingInnerPanel(), f29, width5, f29);
            }
            float f30 = paddingInnerPanel5 + d14;
            save = canvas.save();
            canvas.translate(f30, max2);
            try {
                Layout layout12 = this.z0;
                if (layout12 != null) {
                    layout12.draw(canvas);
                    Unit unit7 = Unit.f19194a;
                }
                canvas.restoreToCount(save);
                float paddingInnerPanel6 = this.f7224h0.left + getPaddingInnerPanel();
                if (this.A0 == null) {
                    d15 = 0.0f;
                } else {
                    RectF rectF12 = this.f7224h0;
                    float width6 = (rectF12.right - rectF12.left) - r7.getWidth();
                    float f31 = 2;
                    d15 = e.d(getPaddingInnerPanel(), f31, width6, f31);
                }
                float f32 = paddingInnerPanel6 + d15;
                save = canvas.save();
                canvas.translate(f32, max2);
                try {
                    Layout layout13 = this.A0;
                    if (layout13 != null) {
                        layout13.draw(canvas);
                        Unit unit8 = Unit.f19194a;
                    }
                    canvas.restoreToCount(save);
                    Layout layout14 = this.z0;
                    int height9 = layout14 != null ? layout14.getHeight() : 0;
                    float max3 = max2 + Math.max(height9, this.A0 != null ? r7.getHeight() : 0);
                    if (displayMetrics3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("metrics");
                        displayMetrics3 = null;
                    }
                    float f33 = (f25 * displayMetrics3.density) + max3;
                    float paddingInnerPanel7 = this.J.left + getPaddingInnerPanel();
                    if (this.G0 == null) {
                        d16 = 0.0f;
                    } else {
                        RectF rectF13 = this.J;
                        float width7 = (rectF13.right - rectF13.left) - r3.getWidth();
                        float f34 = 2;
                        d16 = e.d(getPaddingInnerPanel(), f34, width7, f34);
                    }
                    float f35 = paddingInnerPanel7 + d16;
                    save = canvas.save();
                    canvas.translate(f35, f33);
                    try {
                        Layout layout15 = this.G0;
                        if (layout15 != null) {
                            layout15.draw(canvas);
                            Unit unit9 = Unit.f19194a;
                        }
                        canvas.restoreToCount(save);
                        float paddingInnerPanel8 = this.f7224h0.left + getPaddingInnerPanel();
                        if (this.H0 != null) {
                            RectF rectF14 = this.f7224h0;
                            float width8 = (rectF14.right - rectF14.left) - r3.getWidth();
                            float f36 = 2;
                            f21 = e.d(getPaddingInnerPanel(), f36, width8, f36);
                        }
                        save = canvas.save();
                        canvas.translate(paddingInnerPanel8 + f21, f33);
                        try {
                            Layout layout16 = this.H0;
                            if (layout16 != null) {
                                layout16.draw(canvas);
                                Unit unit10 = Unit.f19194a;
                            }
                            canvas.restoreToCount(save);
                            boolean z7 = this.A;
                            Layout layout17 = ((z7 || (layout = this.I0) == null) && (!z7 || (layout = this.J0) == null)) ? null : layout;
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
                                canvas.translate(this.J.left, this.f7224h0.bottom + this.f7243q0 + i5);
                                layout17.draw(canvas);
                                canvas.restoreToCount(save);
                                Unit unit11 = Unit.f19194a;
                            }
                            if (this.f7216e != this.f7218f) {
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
        this.f7215d = size;
        int a7 = a();
        if (a7 != this.f7213c) {
            this.f7213c = a7;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(this.f7213c, size2);
        } else if (mode2 != 1073741824) {
            size2 = this.f7213c;
        }
        this.f7216e = size2;
        setMeasuredDimension(this.f7215d, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f7216e = i10;
        this.f7215d = i5;
        if (i5 == 0 || i10 == 0) {
            return;
        }
        j();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.f7209a;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void set1RubWeekCloudPayment(boolean enable) {
        this.f7229j1 = enable;
        i();
    }

    public final void setListenerCheckPrice(@Nullable i listener) {
        this.f7231k1 = listener;
    }

    public final void setOdds(@Nullable String odds) {
        if (odds == null || Intrinsics.areEqual(this.f7212b1, odds)) {
            return;
        }
        this.f7212b1 = odds;
        i();
    }

    public final void setTypePrediction(int typePrediction) {
        if (this.W0 != typePrediction) {
            this.W0 = typePrediction;
            i();
        }
    }
}
