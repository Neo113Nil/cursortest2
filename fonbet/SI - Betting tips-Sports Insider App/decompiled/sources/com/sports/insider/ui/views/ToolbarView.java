package com.sports.insider.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.sports.insider.ui.views.ToolbarView;
import d9.e;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ve.c;
import ve.u0;
import ve.v0;
import ve.w0;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0003\u0016\u000eHB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR2\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00106\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0014\u00108\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0014\u0010:\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00101R\u0014\u0010<\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00101R\u0014\u0010?\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\u0014\u0010C\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0014\u0010E\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010>R\u0014\u0010G\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u00101¨\u0006I"}, d2 = {"Lcom/sports/insider/ui/views/ToolbarView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "", "keys", "", "setIconKeys", "(Ljava/util/List;)V", "Lve/v0;", "o0", "Lve/v0;", "getToolbarInterface", "()Lve/v0;", "setToolbarInterface", "(Lve/v0;)V", "toolbarInterface", "Lve/w0;", "p0", "Lve/w0;", "getToolbarMenuInterface", "()Lve/w0;", "setToolbarMenuInterface", "(Lve/w0;)V", "toolbarMenuInterface", "q0", "getToolbarMenuGenerale", "setToolbarMenuGenerale", "toolbarMenuGenerale", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "A0", "Lkotlin/jvm/functions/Function1;", "getBitmapProvider", "()Lkotlin/jvm/functions/Function1;", "setBitmapProvider", "(Lkotlin/jvm/functions/Function1;)V", "bitmapProvider", "B0", "getBitmapRequester", "setBitmapRequester", "bitmapRequester", "", "getDp56", "()F", "dp56", "getDp48", "dp48", "getDp4", "dp4", "getDp24", "dp24", "getDp20", "dp20", "getDp100", "dp100", "getMarginStartHomeIcon", "()I", "marginStartHomeIcon", "getMarginEndHomeIcon", "marginEndHomeIcon", "getMarginTopHomeIcon", "marginTopHomeIcon", "getMarginBottomHomeIcon", "marginBottomHomeIcon", "getRadiusMax", "radiusMax", "ve/u0", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nToolbarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolbarView.kt\ncom/sports/insider/ui/views/ToolbarView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1102:1\n404#2:1103\n404#2:1104\n404#2:1105\n13130#3,3:1106\n13130#3,3:1159\n44#4,8:1109\n44#4,8:1117\n44#4,8:1125\n44#4,8:1133\n121#4,8:1141\n44#4,8:1149\n37#5,2:1157\n*S KotlinDebug\n*F\n+ 1 ToolbarView.kt\ncom/sports/insider/ui/views/ToolbarView\n*L\n128#1:1103\n129#1:1104\n130#1:1105\n400#1:1106,3\n685#1:1159,3\n525#1:1109,8\n532#1:1117,8\n538#1:1125,8\n552#1:1133,8\n567#1:1141,8\n578#1:1149,8\n683#1:1157,2\n*E\n"})
/* loaded from: classes.dex */
public final class ToolbarView extends FrameLayout {
    public static final /* synthetic */ int D0 = 0;
    public final Rect A;

    /* renamed from: A0, reason: from kotlin metadata */
    public Function1 bitmapProvider;
    public final Rect B;

    /* renamed from: B0, reason: from kotlin metadata */
    public Function1 bitmapRequester;
    public final Paint C;
    public u0[] C0;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final Paint G;
    public GestureDetector H;
    public final TextPaint I;
    public final TextPaint J;
    public ValueAnimator K;
    public ValueAnimator L;

    /* renamed from: a, reason: collision with root package name */
    public final DisplayMetrics f8026a;

    /* renamed from: b, reason: collision with root package name */
    public int f8027b;

    /* renamed from: c, reason: collision with root package name */
    public int f8028c;

    /* renamed from: d, reason: collision with root package name */
    public int f8029d;

    /* renamed from: e, reason: collision with root package name */
    public int f8030e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8031f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8032g;

    /* renamed from: g0, reason: collision with root package name */
    public ValueAnimator f8033g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f8034h;

    /* renamed from: h0, reason: collision with root package name */
    public ValueAnimator f8035h0;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f8036i;

    /* renamed from: i0, reason: collision with root package name */
    public ValueAnimator f8037i0;
    public final Rect j;
    public float j0;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f8038k;
    public float k0;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f8039l;

    /* renamed from: l0, reason: collision with root package name */
    public float f8040l0;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f8041m;

    /* renamed from: m0, reason: collision with root package name */
    public float f8042m0;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f8043n;

    /* renamed from: n0, reason: collision with root package name */
    public float f8044n0;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f8045o;

    /* renamed from: o0, reason: collision with root package name and from kotlin metadata */
    public v0 toolbarInterface;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f8047p;

    /* renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public w0 toolbarMenuInterface;
    public final Rect q;

    /* renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public w0 toolbarMenuGenerale;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f8050r;

    /* renamed from: r0, reason: collision with root package name */
    public int f8051r0;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f8052s;

    /* renamed from: s0, reason: collision with root package name */
    public int f8053s0;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f8054t;

    /* renamed from: t0, reason: collision with root package name */
    public int f8055t0;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f8056u;

    /* renamed from: u0, reason: collision with root package name */
    public final SpannableString f8057u0;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f8058v;

    /* renamed from: v0, reason: collision with root package name */
    public SpannableString f8059v0;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f8060w;

    /* renamed from: w0, reason: collision with root package name */
    public SpannableString f8061w0;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f8062x;
    public Layout x0;

    /* renamed from: y, reason: collision with root package name */
    public final Rect f8063y;

    /* renamed from: y0, reason: collision with root package name */
    public Layout f8064y0;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f8065z;
    public final LinkedHashSet z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8036i = new Rect();
        this.j = new Rect();
        this.f8038k = new Rect();
        this.f8039l = new Rect();
        this.f8041m = new Rect();
        this.f8043n = new Rect();
        this.f8045o = new Rect();
        this.f8047p = new Rect();
        this.q = new Rect();
        this.f8050r = new Rect();
        this.f8052s = new Rect();
        this.f8054t = new Rect();
        this.f8056u = new Rect();
        this.f8058v = new Rect();
        this.f8060w = new Rect();
        this.f8062x = new Rect();
        this.f8063y = new Rect();
        this.f8065z = new Rect();
        this.A = new Rect();
        this.B = new Rect();
        Paint paint = new Paint(1);
        this.C = paint;
        this.D = new Paint(1);
        Paint paint2 = new Paint(1);
        this.E = paint2;
        Paint paint3 = new Paint(1);
        this.F = paint3;
        Paint paint4 = new Paint(1);
        this.G = paint4;
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.J = textPaint2;
        SpannableString spannableString = new SpannableString("Sports insider");
        this.f8057u0 = spannableString;
        this.f8059v0 = spannableString;
        this.z0 = new LinkedHashSet();
        this.C0 = new u0[0];
        this.f8026a = a.b(context, "getDisplayMetrics(...)");
        this.f8031f = Color.parseColor("#2A377C");
        this.f8032g = Color.parseColor("#425BB0");
        this.f8034h = Color.parseColor("#FF4F00");
        paint.setColor(this.f8031f);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setColor(-65536);
        paint2.setStyle(style);
        paint3.setColor(this.f8032g);
        paint3.setAlpha(200);
        paint3.setStyle(style);
        paint4.setColor(this.f8034h);
        paint4.setStyle(style);
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setLetterSpacing(0.0f);
        textPaint.setStrokeWidth(0.0f);
        textPaint.setColor(-1);
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        textPaint.setStyle(style2);
        DisplayMetrics displayMetrics = this.f8026a;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
        int i5 = Build.VERSION.SDK_INT;
        textPaint.setTextSize(i5 >= 34 ? TypedValue.applyDimension(2, 20.0f, displayMetrics) : displayMetrics.scaledDensity * 20.0f);
        textPaint2.setTypeface(Typeface.SANS_SERIF);
        textPaint2.setLetterSpacing(0.0f);
        textPaint2.setStrokeWidth(0.0f);
        textPaint2.setColor(-1);
        textPaint2.setStyle(style2);
        DisplayMetrics displayMetrics3 = this.f8026a;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics3;
        }
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        textPaint2.setTextSize(i5 >= 34 ? TypedValue.applyDimension(2, 16.0f, displayMetrics2) : 16.0f * displayMetrics2.scaledDensity);
        setWillNotDraw(false);
        e();
    }

    public static Layout d(ToolbarView toolbarView, CharSequence charSequence, int i5, TextPaint textPaint) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        if (Build.VERSION.SDK_INT >= 28) {
            DynamicLayout build = DynamicLayout.Builder.obtain(charSequence, textPaint, (int) textPaint.measureText(charSequence.toString())).setEllipsizedWidth(i5).setEllipsize(TextUtils.TruncateAt.END).setAlignment(alignment).setIncludePad(true).setLineSpacing(0.0f, 1.0f).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
        StaticLayout build2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) textPaint.measureText(charSequence.toString())).setEllipsizedWidth(i5).setAlignment(alignment).setEllipsize(TextUtils.TruncateAt.END).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(1).build();
        Intrinsics.checkNotNull(build2);
        return build2;
    }

    private final float getDp100() {
        float f6 = 100;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return f6 * displayMetrics.density;
    }

    private final float getDp20() {
        float f6 = 20;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return f6 * displayMetrics.density;
    }

    private final float getDp24() {
        float f6 = 24;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return f6 * displayMetrics.density;
    }

    private final float getDp4() {
        float f6 = 4;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return f6 * displayMetrics.density;
    }

    private final float getDp48() {
        float f6 = 48;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return f6 * displayMetrics.density;
    }

    private final float getDp56() {
        float f6 = 56;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return f6 * displayMetrics.density;
    }

    private final int getMarginBottomHomeIcon() {
        float f6 = 16;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return (int) (f6 * displayMetrics.density);
    }

    private final int getMarginEndHomeIcon() {
        float f6 = 16;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return (int) (f6 * displayMetrics.density);
    }

    private final int getMarginStartHomeIcon() {
        float f6 = 16;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return (int) (f6 * displayMetrics.density);
    }

    private final int getMarginTopHomeIcon() {
        float f6 = 16;
        DisplayMetrics displayMetrics = this.f8026a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return (int) (f6 * displayMetrics.density);
    }

    private final float getRadiusMax() {
        return getDp20();
    }

    public final void a() {
        Rect rect = this.f8036i;
        int height = (int) ((rect.height() - getDp48()) / 2.0f);
        int i5 = this.f8053s0;
        Rect rect2 = this.f8043n;
        Rect rect3 = this.f8038k;
        Rect rect4 = this.f8052s;
        if (i5 > 0) {
            rect4.left = (int) (rect.right - (getDp48() * Math.min(i5, 3)));
            rect4.top = rect.top + height;
            rect4.right = rect.right;
            rect4.bottom = rect.bottom - height;
            int i10 = rect4.left;
            int i11 = rect3.right;
            if (i10 - i11 > 0) {
                rect2.left = i11;
                rect2.top = rect.top;
                rect2.right = rect4.left;
                rect2.bottom = rect.bottom;
            }
        } else {
            int i12 = rect.right;
            rect4.left = i12;
            rect4.top = rect.top;
            rect4.right = i12;
            rect4.bottom = rect.bottom;
            rect2.left = rect3.right;
            rect2.top = rect.top;
            rect2.right = rect.right;
            rect2.bottom = rect.bottom;
        }
        this.f8055t0 = rect4.width();
    }

    public final Pair b(int i5, int i10) {
        if (i5 <= 0 || i10 <= 0) {
            e();
            return new Pair(Integer.valueOf(this.f8027b), Integer.valueOf(this.f8028c));
        }
        Rect rect = this.j;
        rect.left = 0;
        rect.top = 0;
        rect.right = i5;
        int i11 = this.f8051r0;
        rect.bottom = i11;
        Rect rect2 = this.f8036i;
        rect2.left = 0;
        rect2.top = i11;
        rect2.right = i5;
        rect2.bottom = (int) (getDp56() + this.f8051r0);
        int i12 = rect2.left;
        Rect rect3 = this.f8038k;
        rect3.left = i12;
        rect3.top = rect2.top;
        rect3.right = (int) (rect2.left + getDp56());
        rect3.bottom = rect2.bottom;
        Rect rect4 = this.f8039l;
        rect4.top = 0;
        rect4.left = 0;
        rect4.right = rect3.width();
        rect4.bottom = rect3.height();
        float width = rect3.width() / 2.0f;
        int i13 = (int) (rect4.left + width);
        int height = (int) (rect4.top + (rect3.height() / 2.0f));
        Rect rect5 = this.f8041m;
        rect5.left = i13;
        rect5.top = height;
        rect5.right = i13;
        rect5.bottom = height;
        a();
        return new Pair(Integer.valueOf(rect2.width()), Integer.valueOf(rect2.bottom - rect.top));
    }

    public final void c(Canvas canvas, Rect rect, Rect rect2, Rect rect3, float f6, float f10, boolean z5, Bitmap bitmap, boolean z7) {
        int save;
        if (z5 || f10 > 0.0f) {
            float f11 = rect3.left;
            float f12 = rect3.top;
            save = canvas.save();
            canvas.translate(f11, f12);
            try {
                canvas.clipRect(rect);
                float width = rect3.width() / 2.0f;
                float height = rect3.height() / 2.0f;
                if (z5) {
                    canvas.drawCircle(width, height, f6, this.G);
                }
                if (f10 > 0.0f) {
                    canvas.drawCircle(width, height, f10, this.F);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bitmap == null) {
            return;
        }
        save = canvas.save();
        canvas.clipRect(rect2);
        try {
            canvas.drawBitmap(bitmap, rect2.left, rect2.top, this.D);
            if (z7) {
                canvas.drawCircle(rect2.right - getDp4(), rect2.top + getDp4(), getDp4(), this.E);
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.j0 > 0.0f) {
            Rect rect = this.f8038k;
            float f6 = rect.left;
            float f10 = rect.top;
            int save = canvas.save();
            canvas.translate(f6, f10);
            try {
                canvas.clipRect(this.f8039l);
                Rect rect2 = this.f8041m;
                canvas.drawCircle(rect2.left, rect2.top, this.j0, this.F);
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void e() {
        Rect rect = this.f8036i;
        rect.left = 0;
        rect.top = this.f8051r0;
        rect.right = (int) ((getDp48() * 2) + 0 + getDp56() + getDp100());
        rect.bottom = (int) (this.f8051r0 + getDp56());
        Rect rect2 = this.j;
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = rect.right;
        rect2.bottom = this.f8051r0;
        int i5 = rect.left;
        Rect rect3 = this.f8038k;
        rect3.left = i5;
        rect3.top = rect.top;
        rect3.right = (int) (rect.left + getDp56());
        rect3.bottom = rect.bottom;
        int i10 = rect3.right;
        Rect rect4 = this.f8043n;
        rect4.left = i10;
        rect4.top = rect.top;
        rect4.right = (int) (i10 + getDp100());
        rect4.bottom = rect.bottom;
        int height = (int) ((rect.height() - getDp48()) / 2.0f);
        int i11 = rect4.right;
        Rect rect5 = this.f8052s;
        rect5.left = i11;
        rect5.top = rect.top + height;
        rect5.right = (int) ((getDp48() * 3) + i11);
        rect5.bottom = rect.bottom - height;
        this.f8027b = rect.width();
        this.f8028c = rect.bottom - rect2.top;
    }

    public final void f(CharSequence charSequence, CharSequence charSequence2) {
        this.f8059v0 = charSequence == null ? this.f8057u0 : new SpannableString(charSequence);
        this.f8061w0 = charSequence2 == null ? null : new SpannableString(charSequence2);
        h();
    }

    public final void g() {
        a();
        int i5 = this.f8053s0;
        Rect rect = this.f8065z;
        Rect rect2 = this.f8052s;
        if (i5 > 0) {
            rect.left = i5 == 1 ? rect2.left : rect2.right - ((int) getDp48());
            rect.top = rect2.top;
            rect.right = rect2.right;
            rect.bottom = rect2.bottom;
            Rect rect3 = this.A;
            rect3.left = 0;
            rect3.top = 0;
            rect3.right = rect.width();
            rect3.bottom = rect.height();
        } else {
            rect.setEmpty();
        }
        int i10 = this.f8053s0;
        Rect rect4 = this.f8060w;
        if (i10 > 1) {
            rect4.right = rect2.right - ((int) getDp48());
            rect4.left = rect4.right - ((int) getDp48());
            rect4.top = rect2.top;
            rect4.bottom = rect2.bottom;
            Rect rect5 = this.f8062x;
            rect5.left = 0;
            rect5.top = 0;
            rect5.right = rect4.width();
            rect5.bottom = rect4.height();
        } else {
            rect4.setEmpty();
        }
        int i11 = this.f8053s0;
        Rect rect6 = this.f8054t;
        if (i11 > 2) {
            rect6.right = rect2.right - ((int) (getDp48() * 2));
            rect6.left = rect6.right - ((int) getDp48());
            rect6.top = rect2.top;
            rect6.bottom = rect2.bottom;
            Rect rect7 = this.f8056u;
            rect7.left = 0;
            rect7.top = 0;
            rect7.right = rect6.width();
            rect7.bottom = rect6.height();
        } else {
            rect6.setEmpty();
        }
        int width = this.f8053s0 > 0 ? (int) ((rect.width() - getDp24()) / 2.0f) : 0;
        int i12 = this.f8053s0;
        Rect rect8 = this.f8058v;
        if (i12 > 2) {
            rect8.left = rect6.left + width;
            rect8.top = rect6.top + width;
            rect8.right = rect6.right - width;
            rect8.bottom = rect6.bottom - width;
        } else {
            rect8.setEmpty();
        }
        int i13 = this.f8053s0;
        Rect rect9 = this.f8063y;
        if (i13 > 1) {
            rect9.left = rect4.left + width;
            rect9.top = rect4.top + width;
            rect9.right = rect4.right - width;
            rect9.bottom = rect4.bottom - width;
        } else {
            rect9.setEmpty();
        }
        int i14 = this.f8053s0;
        Rect rect10 = this.B;
        if (i14 > 0) {
            rect10.left = rect.left + width;
            rect10.top = rect.top + width;
            rect10.right = rect.right - width;
            rect10.bottom = rect.bottom - width;
        } else {
            rect10.setEmpty();
        }
        h();
    }

    @Nullable
    public final Function1<Integer, Bitmap> getBitmapProvider() {
        return this.bitmapProvider;
    }

    @Nullable
    public final Function1<Integer, Unit> getBitmapRequester() {
        return this.bitmapRequester;
    }

    @Nullable
    public final v0 getToolbarInterface() {
        return this.toolbarInterface;
    }

    @Nullable
    public final w0 getToolbarMenuGenerale() {
        return this.toolbarMenuGenerale;
    }

    @Nullable
    public final w0 getToolbarMenuInterface() {
        return this.toolbarMenuInterface;
    }

    public final void h() {
        Layout d10;
        Layout layout;
        Rect rect = this.f8043n;
        int width = rect.width();
        SpannableString spannableString = this.f8059v0;
        Layout layout2 = null;
        if (spannableString == null || spannableString.length() == 0 || StringsKt.H(spannableString) || width <= 10) {
            d10 = null;
        } else {
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            d10 = d(this, spannableString, width, this.I);
        }
        this.x0 = d10;
        SpannableString spannableString2 = this.f8061w0;
        if (spannableString2 != null && spannableString2.length() != 0 && !StringsKt.H(spannableString2) && width > 10) {
            Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
            layout2 = d(this, spannableString2, width, this.J);
        }
        this.f8064y0 = layout2;
        Rect rect2 = this.f8050r;
        Rect rect3 = this.f8047p;
        Rect rect4 = this.q;
        Rect rect5 = this.f8045o;
        if (layout2 == null && this.x0 != null) {
            rect4.setEmpty();
            rect2.setEmpty();
            int i5 = rect.left;
            int i10 = rect.top;
            int i11 = rect.right;
            int i12 = rect.bottom;
            Layout layout3 = this.x0;
            Intrinsics.checkNotNull(layout3);
            float height = layout3.getHeight();
            float f6 = (i10 + ((i12 - i10) / 2.0f)) - (height / 2.0f);
            rect5.set(new Rect(i5, (int) f6, i11, (int) (f6 + height)));
            rect3.left = 0;
            rect3.top = 0;
            rect3.right = rect5.width();
            rect3.bottom = rect5.height();
        }
        if (this.f8064y0 != null && (layout = this.x0) != null) {
            int i13 = rect.left;
            int i14 = rect.top;
            int i15 = rect.right;
            int i16 = rect.bottom;
            Intrinsics.checkNotNull(layout);
            float height2 = layout.getHeight();
            float w10 = e.w((i16 - i14) / 4.0f, height2 / 2.0f, 2.0f, i14);
            rect5.set(new Rect(i13, (int) w10, i15, (int) (w10 + height2)));
            rect3.left = 0;
            rect3.top = 0;
            rect3.right = rect5.width();
            rect3.bottom = rect5.height();
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            int i20 = rect.bottom;
            Layout layout4 = this.f8064y0;
            Intrinsics.checkNotNull(layout4);
            float height3 = layout4.getHeight();
            float f10 = i20 - i18;
            float f11 = i18 + (f10 / 2.0f) + (((f10 / 4.0f) - (height3 / 2.0f)) / 2.0f);
            rect4.set(new Rect(i17, (int) f11, i19, (int) (f11 + height3)));
            rect2.left = 0;
            rect2.top = 0;
            rect2.right = rect4.width();
            rect2.bottom = rect4.height();
        }
        if (this.f8064y0 == null && this.x0 == null) {
            rect5.setEmpty();
            rect4.setEmpty();
            rect3.setEmpty();
            rect2.setEmpty();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
        this.H = new GestureDetector(getContext(), new c(6, this));
        final int i5 = 2;
        final int i10 = 0;
        final int i11 = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, getRadiusMax());
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(1);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ve.s0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolbarView f24832b;

            {
                this.f24832b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                switch (i10) {
                    case 0:
                        int i12 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue).floatValue();
                        ToolbarView toolbarView = this.f24832b;
                        toolbarView.j0 = floatValue;
                        Rect rect = toolbarView.f8038k;
                        toolbarView.postInvalidateDelayed(200L, rect.left, rect.top, rect.right, rect.bottom);
                        break;
                    case 1:
                        int i13 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue2 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue2 = ((Float) animatedValue2).floatValue();
                        ToolbarView toolbarView2 = this.f24832b;
                        toolbarView2.k0 = floatValue2;
                        Rect rect2 = toolbarView2.f8054t;
                        toolbarView2.postInvalidateDelayed(200L, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        break;
                    case 2:
                        int i14 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue3 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue3 = ((Float) animatedValue3).floatValue();
                        ToolbarView toolbarView3 = this.f24832b;
                        toolbarView3.f8040l0 = floatValue3;
                        Rect rect3 = toolbarView3.f8060w;
                        toolbarView3.postInvalidateDelayed(200L, rect3.left, rect3.top, rect3.right, rect3.bottom);
                        break;
                    case 3:
                        int i15 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue4 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue4 = ((Float) animatedValue4).floatValue();
                        ToolbarView toolbarView4 = this.f24832b;
                        toolbarView4.f8042m0 = floatValue4;
                        Rect rect4 = toolbarView4.f8065z;
                        toolbarView4.postInvalidateDelayed(200L, rect4.left, rect4.top, rect4.right, rect4.bottom);
                        break;
                    default:
                        int i16 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue5 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue5 = ((Float) animatedValue5).floatValue();
                        ToolbarView toolbarView5 = this.f24832b;
                        toolbarView5.f8044n0 = floatValue5;
                        toolbarView5.postInvalidateDelayed(200L);
                        break;
                }
            }
        });
        this.K = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, getRadiusMax());
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(1);
        ofFloat2.setDuration(300L);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ve.s0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolbarView f24832b;

            {
                this.f24832b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                switch (i11) {
                    case 0:
                        int i12 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue).floatValue();
                        ToolbarView toolbarView = this.f24832b;
                        toolbarView.j0 = floatValue;
                        Rect rect = toolbarView.f8038k;
                        toolbarView.postInvalidateDelayed(200L, rect.left, rect.top, rect.right, rect.bottom);
                        break;
                    case 1:
                        int i13 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue2 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue2 = ((Float) animatedValue2).floatValue();
                        ToolbarView toolbarView2 = this.f24832b;
                        toolbarView2.k0 = floatValue2;
                        Rect rect2 = toolbarView2.f8054t;
                        toolbarView2.postInvalidateDelayed(200L, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        break;
                    case 2:
                        int i14 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue3 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue3 = ((Float) animatedValue3).floatValue();
                        ToolbarView toolbarView3 = this.f24832b;
                        toolbarView3.f8040l0 = floatValue3;
                        Rect rect3 = toolbarView3.f8060w;
                        toolbarView3.postInvalidateDelayed(200L, rect3.left, rect3.top, rect3.right, rect3.bottom);
                        break;
                    case 3:
                        int i15 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue4 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue4 = ((Float) animatedValue4).floatValue();
                        ToolbarView toolbarView4 = this.f24832b;
                        toolbarView4.f8042m0 = floatValue4;
                        Rect rect4 = toolbarView4.f8065z;
                        toolbarView4.postInvalidateDelayed(200L, rect4.left, rect4.top, rect4.right, rect4.bottom);
                        break;
                    default:
                        int i16 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue5 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue5 = ((Float) animatedValue5).floatValue();
                        ToolbarView toolbarView5 = this.f24832b;
                        toolbarView5.f8044n0 = floatValue5;
                        toolbarView5.postInvalidateDelayed(200L);
                        break;
                }
            }
        });
        this.L = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, getRadiusMax());
        ofFloat3.setRepeatMode(2);
        ofFloat3.setRepeatCount(1);
        ofFloat3.setDuration(300L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ve.s0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolbarView f24832b;

            {
                this.f24832b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                switch (i5) {
                    case 0:
                        int i12 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue).floatValue();
                        ToolbarView toolbarView = this.f24832b;
                        toolbarView.j0 = floatValue;
                        Rect rect = toolbarView.f8038k;
                        toolbarView.postInvalidateDelayed(200L, rect.left, rect.top, rect.right, rect.bottom);
                        break;
                    case 1:
                        int i13 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue2 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue2 = ((Float) animatedValue2).floatValue();
                        ToolbarView toolbarView2 = this.f24832b;
                        toolbarView2.k0 = floatValue2;
                        Rect rect2 = toolbarView2.f8054t;
                        toolbarView2.postInvalidateDelayed(200L, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        break;
                    case 2:
                        int i14 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue3 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue3 = ((Float) animatedValue3).floatValue();
                        ToolbarView toolbarView3 = this.f24832b;
                        toolbarView3.f8040l0 = floatValue3;
                        Rect rect3 = toolbarView3.f8060w;
                        toolbarView3.postInvalidateDelayed(200L, rect3.left, rect3.top, rect3.right, rect3.bottom);
                        break;
                    case 3:
                        int i15 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue4 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue4 = ((Float) animatedValue4).floatValue();
                        ToolbarView toolbarView4 = this.f24832b;
                        toolbarView4.f8042m0 = floatValue4;
                        Rect rect4 = toolbarView4.f8065z;
                        toolbarView4.postInvalidateDelayed(200L, rect4.left, rect4.top, rect4.right, rect4.bottom);
                        break;
                    default:
                        int i16 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue5 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue5 = ((Float) animatedValue5).floatValue();
                        ToolbarView toolbarView5 = this.f24832b;
                        toolbarView5.f8044n0 = floatValue5;
                        toolbarView5.postInvalidateDelayed(200L);
                        break;
                }
            }
        });
        this.f8033g0 = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, getRadiusMax());
        ofFloat4.setRepeatMode(2);
        ofFloat4.setRepeatCount(1);
        ofFloat4.setDuration(300L);
        final int i12 = 3;
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ve.s0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolbarView f24832b;

            {
                this.f24832b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                switch (i12) {
                    case 0:
                        int i122 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue).floatValue();
                        ToolbarView toolbarView = this.f24832b;
                        toolbarView.j0 = floatValue;
                        Rect rect = toolbarView.f8038k;
                        toolbarView.postInvalidateDelayed(200L, rect.left, rect.top, rect.right, rect.bottom);
                        break;
                    case 1:
                        int i13 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue2 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue2 = ((Float) animatedValue2).floatValue();
                        ToolbarView toolbarView2 = this.f24832b;
                        toolbarView2.k0 = floatValue2;
                        Rect rect2 = toolbarView2.f8054t;
                        toolbarView2.postInvalidateDelayed(200L, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        break;
                    case 2:
                        int i14 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue3 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue3 = ((Float) animatedValue3).floatValue();
                        ToolbarView toolbarView3 = this.f24832b;
                        toolbarView3.f8040l0 = floatValue3;
                        Rect rect3 = toolbarView3.f8060w;
                        toolbarView3.postInvalidateDelayed(200L, rect3.left, rect3.top, rect3.right, rect3.bottom);
                        break;
                    case 3:
                        int i15 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue4 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue4 = ((Float) animatedValue4).floatValue();
                        ToolbarView toolbarView4 = this.f24832b;
                        toolbarView4.f8042m0 = floatValue4;
                        Rect rect4 = toolbarView4.f8065z;
                        toolbarView4.postInvalidateDelayed(200L, rect4.left, rect4.top, rect4.right, rect4.bottom);
                        break;
                    default:
                        int i16 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue5 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue5 = ((Float) animatedValue5).floatValue();
                        ToolbarView toolbarView5 = this.f24832b;
                        toolbarView5.f8044n0 = floatValue5;
                        toolbarView5.postInvalidateDelayed(200L);
                        break;
                }
            }
        });
        this.f8035h0 = ofFloat4;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(getDp24(), getDp20());
        ofFloat5.setRepeatMode(2);
        ofFloat5.setRepeatCount(-1);
        ofFloat5.setDuration(600L);
        final int i13 = 4;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: ve.s0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ToolbarView f24832b;

            {
                this.f24832b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator animation) {
                switch (i13) {
                    case 0:
                        int i122 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue = ((Float) animatedValue).floatValue();
                        ToolbarView toolbarView = this.f24832b;
                        toolbarView.j0 = floatValue;
                        Rect rect = toolbarView.f8038k;
                        toolbarView.postInvalidateDelayed(200L, rect.left, rect.top, rect.right, rect.bottom);
                        break;
                    case 1:
                        int i132 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue2 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue2 = ((Float) animatedValue2).floatValue();
                        ToolbarView toolbarView2 = this.f24832b;
                        toolbarView2.k0 = floatValue2;
                        Rect rect2 = toolbarView2.f8054t;
                        toolbarView2.postInvalidateDelayed(200L, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        break;
                    case 2:
                        int i14 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue3 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue3 = ((Float) animatedValue3).floatValue();
                        ToolbarView toolbarView3 = this.f24832b;
                        toolbarView3.f8040l0 = floatValue3;
                        Rect rect3 = toolbarView3.f8060w;
                        toolbarView3.postInvalidateDelayed(200L, rect3.left, rect3.top, rect3.right, rect3.bottom);
                        break;
                    case 3:
                        int i15 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue4 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue4, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue4 = ((Float) animatedValue4).floatValue();
                        ToolbarView toolbarView4 = this.f24832b;
                        toolbarView4.f8042m0 = floatValue4;
                        Rect rect4 = toolbarView4.f8065z;
                        toolbarView4.postInvalidateDelayed(200L, rect4.left, rect4.top, rect4.right, rect4.bottom);
                        break;
                    default:
                        int i16 = ToolbarView.D0;
                        Intrinsics.checkNotNullParameter(animation, "animation");
                        Object animatedValue5 = animation.getAnimatedValue();
                        Intrinsics.checkNotNull(animatedValue5, "null cannot be cast to non-null type kotlin.Float");
                        float floatValue5 = ((Float) animatedValue5).floatValue();
                        ToolbarView toolbarView5 = this.f24832b;
                        toolbarView5.f8044n0 = floatValue5;
                        toolbarView5.postInvalidateDelayed(200L);
                        break;
                }
            }
        });
        this.f8037i0 = ofFloat5;
        if (this.f8053s0 > 0) {
            u0[] u0VarArr = this.C0;
            int length = u0VarArr.length;
            int i14 = 0;
            while (i10 < length) {
                if (u0VarArr[i10].f24911b) {
                    i14++;
                }
                i10++;
            }
            if (i14 > 0) {
                ValueAnimator valueAnimator = this.f8037i0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                    return;
                }
                return;
            }
        }
        ValueAnimator valueAnimator2 = this.f8037i0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.K;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.K = null;
        ValueAnimator valueAnimator3 = this.L;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.L;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllUpdateListeners();
        }
        this.L = null;
        ValueAnimator valueAnimator5 = this.f8033g0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.f8033g0;
        if (valueAnimator6 != null) {
            valueAnimator6.removeAllUpdateListeners();
        }
        this.f8033g0 = null;
        ValueAnimator valueAnimator7 = this.f8035h0;
        if (valueAnimator7 != null) {
            valueAnimator7.cancel();
        }
        ValueAnimator valueAnimator8 = this.f8035h0;
        if (valueAnimator8 != null) {
            valueAnimator8.removeAllUpdateListeners();
        }
        this.f8035h0 = null;
        ValueAnimator valueAnimator9 = this.f8037i0;
        if (valueAnimator9 != null) {
            valueAnimator9.cancel();
        }
        ValueAnimator valueAnimator10 = this.f8037i0;
        if (valueAnimator10 != null) {
            valueAnimator10.removeAllUpdateListeners();
        }
        this.f8037i0 = null;
        this.H = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.j;
        int height = rect.height();
        Paint paint = this.C;
        if (height > 0) {
            canvas.drawRect(rect, paint);
        }
        canvas.drawRect(this.f8036i, paint);
        Rect rect2 = this.f8045o;
        if (!rect2.isEmpty()) {
            Rect rect3 = this.q;
            boolean isEmpty = rect3.isEmpty();
            Rect rect4 = this.f8047p;
            if (isEmpty) {
                float f6 = rect2.left;
                float f10 = rect2.top;
                save = canvas.save();
                canvas.translate(f6, f10);
                try {
                    canvas.clipRect(rect4);
                    Layout layout = this.x0;
                    if (layout != null) {
                        layout.draw(canvas);
                    }
                } finally {
                }
            } else {
                float f11 = rect2.left;
                float f12 = rect2.top;
                save = canvas.save();
                canvas.translate(f11, f12);
                try {
                    canvas.clipRect(rect4);
                    Layout layout2 = this.x0;
                    if (layout2 != null) {
                        layout2.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                    float f13 = rect3.left;
                    float f14 = rect3.top;
                    save = canvas.save();
                    canvas.translate(f13, f14);
                    try {
                        canvas.clipRect(this.f8050r);
                        Layout layout3 = this.f8064y0;
                        if (layout3 != null) {
                            layout3.draw(canvas);
                        }
                    } finally {
                    }
                } finally {
                }
            }
        }
        if (this.f8053s0 > 0 && this.f8055t0 > 0) {
            u0 u0Var = (u0) p.r(0, this.C0);
            LinkedHashSet linkedHashSet = this.z0;
            if (u0Var != null) {
                final int i5 = u0Var.f24910a;
                Function1 function1 = this.bitmapProvider;
                Bitmap bitmap = function1 != null ? (Bitmap) function1.invoke(Integer.valueOf(i5)) : null;
                if (bitmap == null && !linkedHashSet.contains(Integer.valueOf(i5))) {
                    linkedHashSet.add(Integer.valueOf(i5));
                    final int i10 = 0;
                    post(new Runnable(this) { // from class: ve.t0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ToolbarView f24836b;

                        {
                            this.f24836b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    ToolbarView toolbarView = this.f24836b;
                                    Function1 function12 = toolbarView.bitmapRequester;
                                    int i11 = i5;
                                    if (function12 != null) {
                                        function12.invoke(Integer.valueOf(i11));
                                    }
                                    toolbarView.z0.remove(Integer.valueOf(i11));
                                    break;
                                case 1:
                                    ToolbarView toolbarView2 = this.f24836b;
                                    Function1 function13 = toolbarView2.bitmapRequester;
                                    int i12 = i5;
                                    if (function13 != null) {
                                        function13.invoke(Integer.valueOf(i12));
                                    }
                                    toolbarView2.z0.remove(Integer.valueOf(i12));
                                    break;
                                default:
                                    ToolbarView toolbarView3 = this.f24836b;
                                    Function1 function14 = toolbarView3.bitmapRequester;
                                    int i13 = i5;
                                    if (function14 != null) {
                                        function14.invoke(Integer.valueOf(i13));
                                    }
                                    toolbarView3.z0.remove(Integer.valueOf(i13));
                                    break;
                            }
                        }
                    });
                }
                c(canvas, this.A, this.B, this.f8065z, this.f8044n0, this.f8042m0, u0Var.f24911b, bitmap, u0Var.f24912c);
            }
            u0 u0Var2 = (u0) p.r(1, this.C0);
            if (u0Var2 != null) {
                final int i11 = u0Var2.f24910a;
                Function1 function12 = this.bitmapProvider;
                Bitmap bitmap2 = function12 != null ? (Bitmap) function12.invoke(Integer.valueOf(i11)) : null;
                if (bitmap2 == null && !linkedHashSet.contains(Integer.valueOf(i11))) {
                    linkedHashSet.add(Integer.valueOf(i11));
                    final int i12 = 1;
                    post(new Runnable(this) { // from class: ve.t0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ToolbarView f24836b;

                        {
                            this.f24836b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    ToolbarView toolbarView = this.f24836b;
                                    Function1 function122 = toolbarView.bitmapRequester;
                                    int i112 = i11;
                                    if (function122 != null) {
                                        function122.invoke(Integer.valueOf(i112));
                                    }
                                    toolbarView.z0.remove(Integer.valueOf(i112));
                                    break;
                                case 1:
                                    ToolbarView toolbarView2 = this.f24836b;
                                    Function1 function13 = toolbarView2.bitmapRequester;
                                    int i122 = i11;
                                    if (function13 != null) {
                                        function13.invoke(Integer.valueOf(i122));
                                    }
                                    toolbarView2.z0.remove(Integer.valueOf(i122));
                                    break;
                                default:
                                    ToolbarView toolbarView3 = this.f24836b;
                                    Function1 function14 = toolbarView3.bitmapRequester;
                                    int i13 = i11;
                                    if (function14 != null) {
                                        function14.invoke(Integer.valueOf(i13));
                                    }
                                    toolbarView3.z0.remove(Integer.valueOf(i13));
                                    break;
                            }
                        }
                    });
                }
                c(canvas, this.f8062x, this.f8063y, this.f8060w, this.f8044n0, this.f8040l0, u0Var2.f24911b, bitmap2, u0Var2.f24912c);
            }
            u0 u0Var3 = (u0) p.r(2, this.C0);
            if (u0Var3 != null) {
                final int i13 = u0Var3.f24910a;
                Function1 function13 = this.bitmapProvider;
                Bitmap bitmap3 = function13 != null ? (Bitmap) function13.invoke(Integer.valueOf(i13)) : null;
                if (bitmap3 == null && !linkedHashSet.contains(Integer.valueOf(i13))) {
                    linkedHashSet.add(Integer.valueOf(i13));
                    final int i14 = 2;
                    post(new Runnable(this) { // from class: ve.t0

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ ToolbarView f24836b;

                        {
                            this.f24836b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i14) {
                                case 0:
                                    ToolbarView toolbarView = this.f24836b;
                                    Function1 function122 = toolbarView.bitmapRequester;
                                    int i112 = i13;
                                    if (function122 != null) {
                                        function122.invoke(Integer.valueOf(i112));
                                    }
                                    toolbarView.z0.remove(Integer.valueOf(i112));
                                    break;
                                case 1:
                                    ToolbarView toolbarView2 = this.f24836b;
                                    Function1 function132 = toolbarView2.bitmapRequester;
                                    int i122 = i13;
                                    if (function132 != null) {
                                        function132.invoke(Integer.valueOf(i122));
                                    }
                                    toolbarView2.z0.remove(Integer.valueOf(i122));
                                    break;
                                default:
                                    ToolbarView toolbarView3 = this.f24836b;
                                    Function1 function14 = toolbarView3.bitmapRequester;
                                    int i132 = i13;
                                    if (function14 != null) {
                                        function14.invoke(Integer.valueOf(i132));
                                    }
                                    toolbarView3.z0.remove(Integer.valueOf(i132));
                                    break;
                            }
                        }
                    });
                }
                c(canvas, this.f8056u, this.f8058v, this.f8054t, this.f8044n0, this.k0, u0Var3.f24911b, bitmap3, u0Var3.f24912c);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i10, int i11, int i12) {
        super.onLayout(z5, i5, i10, i11, i12);
        if (getChildCount() <= 0 || getChildCount() < 0) {
            return;
        }
        View childAt = getChildAt(0);
        if (childAt instanceof HomeRowView) {
            Rect rect = this.f8038k;
            ((HomeRowView) childAt).layout(rect.left + getMarginStartHomeIcon(), rect.top + getMarginTopHomeIcon(), rect.right - getMarginEndHomeIcon(), rect.bottom - getMarginBottomHomeIcon());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        Pair b10 = b(View.MeasureSpec.getSize(i5), View.MeasureSpec.getSize(i10));
        Object obj = b10.f19193b;
        ((Number) obj).intValue();
        setMeasuredDimension(((Number) b10.f19192a).intValue(), ((Number) obj).intValue());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 == 0 || i10 == 0) {
            return;
        }
        if (this.f8029d == i5 && this.f8030e == i10) {
            g();
            return;
        }
        this.f8029d = i5;
        this.f8030e = i10;
        Pair b10 = b(i5, i10);
        ((Number) b10.f19193b).intValue();
        ((Number) b10.f19192a).intValue();
        g();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.H;
        return gestureDetector != null ? gestureDetector.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void setBitmapProvider(@Nullable Function1<? super Integer, Bitmap> function1) {
        this.bitmapProvider = function1;
    }

    public final void setBitmapRequester(@Nullable Function1<? super Integer, Unit> function1) {
        this.bitmapRequester = function1;
    }

    public final void setIconKeys(@NotNull List<Integer> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        invalidate();
    }

    public final void setToolbarInterface(@Nullable v0 v0Var) {
        this.toolbarInterface = v0Var;
    }

    public final void setToolbarMenuGenerale(@Nullable w0 w0Var) {
        this.toolbarMenuGenerale = w0Var;
    }

    public final void setToolbarMenuInterface(@Nullable w0 w0Var) {
        this.toolbarMenuInterface = w0Var;
    }
}
