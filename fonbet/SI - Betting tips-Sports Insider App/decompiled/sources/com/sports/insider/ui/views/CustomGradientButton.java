package com.sports.insider.ui.views;

import android.R;
import android.animation.ValueAnimator;
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
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.sports.insider.data.repository.room.news.NewsTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sports/insider/ui/views/CustomGradientButton;", "Landroid/view/View;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setButtonTypeface", "(Landroid/graphics/Typeface;)V", "", NewsTable.TEXT_COLUMN, "setButtonText", "(Ljava/lang/CharSequence;)V", "", "(Ljava/lang/String;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomGradientButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomGradientButton.kt\ncom/sports/insider/ui/views/CustomGradientButton\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,661:1\n1#2:662\n404#3:663\n404#3:664\n404#3:665\n404#3:666\n404#3:667\n404#3:668\n135#4,8:669\n27#4,7:677\n*S KotlinDebug\n*F\n+ 1 CustomGradientButton.kt\ncom/sports/insider/ui/views/CustomGradientButton\n*L\n142#1:663\n143#1:664\n144#1:665\n145#1:666\n149#1:667\n150#1:668\n289#1:669,8\n304#1:677,7\n*E\n"})
/* loaded from: classes.dex */
public final class CustomGradientButton extends View implements ValueAnimator.AnimatorUpdateListener {
    public final RectF A;
    public final RectF B;
    public StaticLayout C;
    public float D;
    public float E;
    public final DisplayMetrics F;
    public int[] G;
    public final int[] H;
    public final int[] I;
    public final int[] J;
    public final float[] K;
    public ColorStateList L;

    /* renamed from: a, reason: collision with root package name */
    public final float f7308a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7309b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7310c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7311d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7312e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7313f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7314g;

    /* renamed from: g0, reason: collision with root package name */
    public RoundRectShape f7315g0;

    /* renamed from: h, reason: collision with root package name */
    public final String f7316h;

    /* renamed from: h0, reason: collision with root package name */
    public ShapeDrawable f7317h0;

    /* renamed from: i, reason: collision with root package name */
    public final String f7318i;

    /* renamed from: i0, reason: collision with root package name */
    public LinearGradient f7319i0;
    public final Paint j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f7320k;

    /* renamed from: l, reason: collision with root package name */
    public final TextPaint f7321l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7322m;

    /* renamed from: n, reason: collision with root package name */
    public SpannableString f7323n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7324o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7325p;
    public final float q;

    /* renamed from: r, reason: collision with root package name */
    public float f7326r;

    /* renamed from: s, reason: collision with root package name */
    public float f7327s;

    /* renamed from: t, reason: collision with root package name */
    public float f7328t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7329u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7330v;

    /* renamed from: w, reason: collision with root package name */
    public RippleDrawable f7331w;

    /* renamed from: x, reason: collision with root package name */
    public float f7332x;

    /* renamed from: y, reason: collision with root package name */
    public ValueAnimator f7333y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f7334z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomGradientButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7308a = 37.0f;
        this.f7309b = 16.0f;
        this.f7310c = 19.0f;
        this.f7311d = 12.0f;
        this.f7312e = 1.0f;
        this.f7313f = "#20003F";
        this.f7314g = "#C8C8C8";
        this.f7316h = "#D0D0D0";
        this.f7318i = "#8020003F";
        this.j = new Paint(1);
        this.f7320k = new Paint(1);
        this.f7321l = new TextPaint(1);
        this.f7322m = true;
        this.f7323n = new SpannableString("Button");
        this.f7325p = 37.0f;
        this.q = 16.0f;
        this.f7326r = 19.0f;
        this.f7327s = 19.0f;
        this.f7328t = 12.0f;
        this.f7332x = 1.0f;
        this.f7334z = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.G = new int[]{-1, -1};
        this.H = new int[0];
        this.I = new int[]{R.attr.state_enabled};
        int[] iArr = new int[2];
        int i5 = 0;
        while (i5 < 2) {
            iArr[i5] = i5 == 0 ? R.attr.state_pressed : 16842910;
            i5++;
        }
        this.J = iArr;
        float[] fArr = new float[8];
        for (int i10 = 0; i10 < 8; i10++) {
            fArr[i10] = this.f7325p;
        }
        this.K = fArr;
        float f6 = this.f7310c;
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.F = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f10 = displayMetrics.density;
        f10 = f10 <= 0.0f ? this.f7312e : f10;
        this.f7325p = this.f7308a * f10;
        this.q = this.f7309b * f10;
        Color.parseColor(this.f7313f);
        this.f7329u = Color.parseColor(this.f7314g);
        Color.parseColor(this.f7316h);
        Color.parseColor(this.f7318i);
        DisplayMetrics displayMetrics3 = this.F;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics3, "<this>");
        int i11 = Build.VERSION.SDK_INT;
        this.f7326r = i11 >= 34 ? TypedValue.applyDimension(2, f6, displayMetrics3) : displayMetrics3.scaledDensity * f6;
        DisplayMetrics displayMetrics4 = this.F;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics4, "<this>");
        this.f7327s = i11 >= 34 ? TypedValue.applyDimension(2, f6, displayMetrics4) : displayMetrics4.scaledDensity * f6;
        DisplayMetrics displayMetrics5 = this.F;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics5;
        }
        float f11 = this.f7311d;
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        this.f7328t = i11 >= 34 ? TypedValue.applyDimension(2, f11, displayMetrics2) : f11 * displayMetrics2.scaledDensity;
        this.f7330v = Color.parseColor("#0957EE");
        this.G = new int[]{this.f7330v, Color.parseColor("#7B14CC")};
        TextPaint textPaint = this.f7321l;
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(-1);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setTextSize(this.f7326r);
        textPaint.setTextAlign(Paint.Align.CENTER);
        Paint paint = this.j;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        Paint paint2 = this.f7320k;
        paint2.setStyle(style);
        paint2.setColor(this.f7329u);
        e();
    }

    public final void a() {
        LinearGradient linearGradient = this.f7319i0;
        if (linearGradient != null) {
            this.j.setShader(linearGradient);
        }
        LinearGradient linearGradient2 = this.f7319i0;
        if (linearGradient2 != null) {
            this.f7320k.setShader(linearGradient2);
        }
    }

    public final void b() {
        RippleDrawable rippleDrawable;
        this.f7332x = 1.0f;
        this.f7324o = false;
        if (!this.f7322m && (rippleDrawable = this.f7331w) != null) {
            rippleDrawable.setState(this.H);
        }
        this.f7334z.setEmpty();
        this.A.setEmpty();
        this.B.setEmpty();
        this.C = null;
    }

    public final void c(int i5, int i10) {
        RippleDrawable rippleDrawable;
        if (i5 <= 0 || i10 <= 0) {
            b();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = paddingBottom - paddingTop;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            b();
            return;
        }
        this.D = (f6 / 2.0f) + paddingStart;
        this.E = (f10 / 2.0f) + paddingTop;
        float f11 = this.q;
        float f12 = paddingStart + f11;
        float f13 = paddingTop + f11;
        float f14 = (paddingBottom - f11) - f13;
        float f15 = (paddingEnd - f11) - f12;
        RectF rectF = this.B;
        RectF rectF2 = this.A;
        RectF rectF3 = this.f7334z;
        if (f14 <= 0.0f || f15 <= 0.0f) {
            rectF2.setEmpty();
            rectF.setEmpty();
            this.C = null;
            rectF3.left = paddingStart;
            rectF3.top = paddingTop;
            rectF3.right = paddingEnd;
            rectF3.bottom = paddingBottom;
            return;
        }
        StaticLayout g10 = g((int) f15, this.f7323n);
        if (g10 == null || g10.getHeight() <= 0 || g10.getWidth() <= 0) {
            rectF2.setEmpty();
            rectF.setEmpty();
            this.C = null;
            rectF3.left = paddingStart;
            rectF3.top = paddingTop;
            rectF3.right = paddingEnd;
            rectF3.bottom = paddingBottom;
            return;
        }
        float width = g10.getWidth();
        float height = g10.getHeight();
        float f16 = f12 + ((f15 - width) / 2.0f);
        float f17 = f13 + ((f14 - height) / 2.0f);
        float f18 = width + f16;
        float f19 = height + f17;
        float width2 = g10.getWidth() / 2.0f;
        rectF2.left = f16 + width2;
        rectF2.top = f17;
        rectF2.right = width2 + f18;
        rectF2.bottom = f19;
        rectF.left = f16;
        rectF.top = f17;
        rectF.right = f18;
        rectF.bottom = f19;
        this.C = g10;
        rectF3.left = paddingStart;
        rectF3.top = paddingTop;
        rectF3.right = paddingEnd;
        rectF3.bottom = paddingBottom;
        if (!this.f7322m && (rippleDrawable = this.f7331w) != null) {
            int i11 = (int) paddingStart;
            int i12 = (int) paddingTop;
            int i13 = (int) paddingEnd;
            int i14 = (int) paddingBottom;
            if (rippleDrawable.getBounds().left != i11 || rippleDrawable.getBounds().top != i12 || rippleDrawable.getBounds().right != i13 || rippleDrawable.getBounds().bottom != i14) {
                rippleDrawable.setHotspotBounds(i11, i12, i13, i14);
                rippleDrawable.setBounds(i11, i12, i13, i14);
            }
        }
        this.f7319i0 = new LinearGradient(rectF3.left, rectF3.centerY(), rectF3.right, rectF3.centerY(), this.G, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void d(int i5, int i10) {
        this.f7322m = false;
        this.G = new int[]{i5, i10};
        RippleDrawable rippleDrawable = this.f7331w;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(i10));
        }
        RectF rectF = this.f7334z;
        if (!rectF.isEmpty()) {
            this.f7319i0 = new LinearGradient(rectF.left, rectF.centerY(), rectF.right, rectF.centerY(), this.G, (float[]) null, Shader.TileMode.CLAMP);
        }
        a();
        requestLayout();
        invalidate();
    }

    public final void e() {
        float[] fArr = this.K;
        float f6 = this.f7325p;
        fArr[0] = f6;
        fArr[1] = f6;
        fArr[2] = f6;
        fArr[3] = f6;
        fArr[4] = f6;
        fArr[5] = f6;
        fArr[6] = f6;
        fArr[7] = f6;
        if (this.L == null) {
            this.L = ColorStateList.valueOf(this.G[1]);
        }
        if (this.f7315g0 == null) {
            this.f7315g0 = new RoundRectShape(fArr, null, null);
        }
        if (this.f7317h0 == null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.getPaint().setColor(this.G[1]);
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.setShape(this.f7315g0);
            this.f7317h0 = shapeDrawable;
        }
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            this.f7331w = new RippleDrawable(colorStateList, null, this.f7317h0);
        }
    }

    public final StaticLayout f(int i5, SpannableString spannableString) {
        if (spannableString == null || spannableString.length() == 0 || StringsKt.H(spannableString) || i5 <= 5) {
            return null;
        }
        String obj = spannableString.toString();
        TextPaint textPaint = this.f7321l;
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, Math.min(i5, (int) textPaint.measureText(obj))).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
    }

    public final StaticLayout g(int i5, SpannableString spannableString) {
        if (spannableString != null && spannableString.length() != 0 && !StringsKt.H(spannableString) && i5 > 5) {
            float max = Math.max(this.f7327s, this.f7328t);
            this.f7326r = max;
            TextPaint textPaint = this.f7321l;
            textPaint.setTextSize(max);
            StaticLayout f6 = f(i5, spannableString);
            if (f6 != null) {
                if (f6.getLineCount() >= 2) {
                    while (f6.getLineCount() >= 2) {
                        float f10 = this.f7326r;
                        if (f10 <= this.f7328t) {
                            break;
                        }
                        DisplayMetrics displayMetrics = this.F;
                        if (displayMetrics == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("metrics");
                            displayMetrics = null;
                        }
                        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
                        float max2 = Math.max(f10 - (Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 1.0f, displayMetrics) : displayMetrics.scaledDensity * 1.0f), this.f7328t);
                        this.f7326r = max2;
                        textPaint.setTextSize(max2);
                        StaticLayout f11 = f(i5, spannableString);
                        if (f11 != null) {
                            f6 = f11;
                        }
                    }
                }
                return f6;
            }
        }
        return null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f7332x = ((Float) animatedValue).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7332x, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(this);
        this.f7333y = ofFloat;
        if (this.f7331w == null) {
            e();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f7333y;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f7333y;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f7333y = null;
        b();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.f7334z;
        if (rectF.isEmpty()) {
            return;
        }
        float f6 = this.f7332x;
        canvas.scale(f6, f6, this.D, this.E);
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            boolean z5 = this.f7322m;
            Paint paint = this.j;
            if (z5) {
                float f10 = this.f7325p;
                if (this.f7324o) {
                    paint = this.f7320k;
                }
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                float f11 = this.f7325p;
                canvas.drawRoundRect(rectF, f11, f11, paint);
                RippleDrawable rippleDrawable = this.f7331w;
                if (rippleDrawable != null) {
                    rippleDrawable.draw(canvas);
                }
            }
            canvas.restoreToCount(save);
            RectF rectF2 = this.B;
            StaticLayout staticLayout = this.C;
            if (staticLayout != null) {
                save = canvas.save();
                try {
                    if (!rectF2.isEmpty()) {
                        canvas.clipRect(rectF2);
                    }
                    RectF rectF3 = this.A;
                    canvas.translate(rectF3.left, rectF3.top);
                    staticLayout.draw(canvas);
                    canvas.restoreToCount(save);
                } finally {
                }
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
        float paddingEnd = (this.q * 2.0f) + getPaddingEnd() + getPaddingStart();
        float f6 = size - paddingEnd;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        int width = (int) ((g((int) f6, this.f7323n) != null ? r4.getWidth() : 0) + paddingEnd);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        float paddingBottom = (this.q * 2.0f) + getPaddingBottom() + getPaddingTop();
        float paddingStart = ((size - getPaddingStart()) - getPaddingEnd()) - (this.q * 2.0f);
        int height = (int) ((g((int) (paddingStart >= 0.0f ? paddingStart : 0.0f), this.f7323n) != null ? r0.getHeight() : 0) + paddingBottom);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        int resolveSize = View.resolveSize(size, i5);
        int resolveSize2 = View.resolveSize(size2, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        c(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        if (i11 == i5 && i12 == i10) {
            a();
            invalidate();
        } else {
            c(i5, i10);
            a();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        RippleDrawable rippleDrawable;
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.f7334z;
        if (action != 0) {
            if (action != 1 && action != 3) {
                return super.onTouchEvent(event);
            }
            this.f7324o = false;
            ValueAnimator valueAnimator = this.f7333y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.setFloatValues(this.f7332x, 1.0f);
                valueAnimator.start();
            }
            if (!this.f7322m && (rippleDrawable = this.f7331w) != null) {
                rippleDrawable.setState(this.I);
            }
            invalidate();
            if (event.getAction() == 1 && !rectF.isEmpty()) {
                float f6 = rectF.left;
                float f10 = rectF.right;
                float x10 = event.getX();
                if (f6 <= x10 && x10 <= f10) {
                    float f11 = rectF.top;
                    float f12 = rectF.bottom;
                    float y5 = event.getY();
                    if (f11 <= y5 && y5 <= f12) {
                        super.performClick();
                        return true;
                    }
                }
            }
        } else if (!rectF.isEmpty()) {
            float f13 = rectF.left;
            float f14 = rectF.right;
            float x11 = event.getX();
            if (f13 <= x11 && x11 <= f14) {
                float f15 = rectF.top;
                float f16 = rectF.bottom;
                float y10 = event.getY();
                if (f15 <= y10 && y10 <= f16) {
                    this.f7324o = true;
                    if (!this.f7322m) {
                        RippleDrawable rippleDrawable2 = this.f7331w;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable3 = this.f7331w;
                        if (rippleDrawable3 != null) {
                            rippleDrawable3.setState(this.J);
                        }
                    }
                    ValueAnimator valueAnimator2 = this.f7333y;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        valueAnimator2.setFloatValues(this.f7332x, 0.99f);
                        valueAnimator2.start();
                    }
                    invalidate();
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

    public final void setButtonText(@NotNull CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f7323n = new SpannableString(text);
        requestLayout();
        invalidate();
    }

    public final void setButtonTypeface(@Nullable Typeface typeface) {
        if (typeface == null) {
            typeface = Typeface.DEFAULT_BOLD;
        }
        this.f7321l.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void setButtonText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f7323n = new SpannableString(text);
        requestLayout();
        invalidate();
    }
}
