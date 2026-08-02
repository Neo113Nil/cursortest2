package com.sports.insider.ui.views;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
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
import android.view.animation.AccelerateDecelerateInterpolator;
import com.sports.insider.data.repository.room.news.NewsTable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sports/insider/ui/views/CustomButton;", "Landroid/view/View;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Typeface;", "typeface", "", "setButtonTypeface", "(Landroid/graphics/Typeface;)V", "", NewsTable.TEXT_COLUMN, "setButtonText", "(Ljava/lang/CharSequence;)V", "", "(Ljava/lang/String;)V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCustomButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomButton.kt\ncom/sports/insider/ui/views/CustomButton\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,608:1\n1#2:609\n404#3:610\n404#3:611\n404#3:612\n404#3:613\n135#4,8:614\n27#4,7:622\n*S KotlinDebug\n*F\n+ 1 CustomButton.kt\ncom/sports/insider/ui/views/CustomButton\n*L\n130#1:610\n131#1:611\n132#1:612\n133#1:613\n237#1:614,8\n252#1:622,7\n*E\n"})
/* loaded from: classes.dex */
public final class CustomButton extends View implements ValueAnimator.AnimatorUpdateListener {
    public final RectF A;
    public final RectF B;
    public final RectF C;
    public StaticLayout D;
    public float E;
    public float F;
    public final DisplayMetrics G;
    public final int[] H;
    public final int[] I;
    public final int[] J;
    public final float[] K;
    public ColorStateList L;

    /* renamed from: a, reason: collision with root package name */
    public final float f7282a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7283b;

    /* renamed from: c, reason: collision with root package name */
    public final float f7284c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7285d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7286e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7287f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7288g;

    /* renamed from: g0, reason: collision with root package name */
    public RoundRectShape f7289g0;

    /* renamed from: h, reason: collision with root package name */
    public final String f7290h;

    /* renamed from: h0, reason: collision with root package name */
    public ShapeDrawable f7291h0;

    /* renamed from: i, reason: collision with root package name */
    public final String f7292i;
    public final Paint j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f7293k;

    /* renamed from: l, reason: collision with root package name */
    public final TextPaint f7294l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7295m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f7296n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7297o;

    /* renamed from: p, reason: collision with root package name */
    public final float f7298p;
    public final float q;

    /* renamed from: r, reason: collision with root package name */
    public float f7299r;

    /* renamed from: s, reason: collision with root package name */
    public float f7300s;

    /* renamed from: t, reason: collision with root package name */
    public float f7301t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7302u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7303v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7304w;

    /* renamed from: x, reason: collision with root package name */
    public RippleDrawable f7305x;

    /* renamed from: y, reason: collision with root package name */
    public float f7306y;

    /* renamed from: z, reason: collision with root package name */
    public ValueAnimator f7307z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7282a = 37.0f;
        this.f7283b = 16.0f;
        this.f7284c = 19.0f;
        this.f7285d = 12.0f;
        this.f7286e = 1.0f;
        this.f7287f = "#20003F";
        this.f7288g = "#C8C8C8";
        this.f7290h = "#D0D0D0";
        this.f7292i = "#8020003F";
        this.j = new Paint(1);
        this.f7293k = new Paint(1);
        this.f7294l = new TextPaint(1);
        this.f7295m = true;
        this.f7296n = "Button";
        this.f7298p = 37.0f;
        this.q = 16.0f;
        this.f7299r = 19.0f;
        this.f7300s = 19.0f;
        this.f7301t = 12.0f;
        this.f7306y = 1.0f;
        this.A = new RectF();
        this.B = new RectF();
        this.C = new RectF();
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
            fArr[i10] = this.f7298p;
        }
        this.K = fArr;
        float f6 = this.f7284c;
        setClickable(true);
        setFocusable(true);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        this.G = displayMetrics;
        DisplayMetrics displayMetrics2 = null;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        float f10 = displayMetrics.density;
        f10 = f10 <= 0.0f ? this.f7286e : f10;
        this.f7298p = this.f7282a * f10;
        this.q = this.f7283b * f10;
        this.f7302u = Color.parseColor(this.f7287f);
        this.f7303v = Color.parseColor(this.f7288g);
        this.f7304w = Color.parseColor(this.f7290h);
        Color.parseColor(this.f7292i);
        DisplayMetrics displayMetrics3 = this.G;
        if (displayMetrics3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics3 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics3, "<this>");
        int i11 = Build.VERSION.SDK_INT;
        this.f7299r = i11 >= 34 ? TypedValue.applyDimension(2, f6, displayMetrics3) : displayMetrics3.scaledDensity * f6;
        DisplayMetrics displayMetrics4 = this.G;
        if (displayMetrics4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics4 = null;
        }
        Intrinsics.checkNotNullParameter(displayMetrics4, "<this>");
        this.f7300s = i11 >= 34 ? TypedValue.applyDimension(2, f6, displayMetrics4) : displayMetrics4.scaledDensity * f6;
        DisplayMetrics displayMetrics5 = this.G;
        if (displayMetrics5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
        } else {
            displayMetrics2 = displayMetrics5;
        }
        float f11 = this.f7285d;
        Intrinsics.checkNotNullParameter(displayMetrics2, "<this>");
        this.f7301t = i11 >= 34 ? TypedValue.applyDimension(2, f11, displayMetrics2) : f11 * displayMetrics2.scaledDensity;
        TextPaint textPaint = this.f7294l;
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        textPaint.setColor(this.f7302u);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setTextSize(this.f7299r);
        textPaint.setTextAlign(Paint.Align.CENTER);
        Paint paint = this.j;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        Paint paint2 = this.f7293k;
        paint2.setStyle(style);
        paint2.setColor(this.f7303v);
        c();
    }

    public final void a() {
        RippleDrawable rippleDrawable;
        this.f7306y = 1.0f;
        this.f7297o = false;
        if (!this.f7295m && (rippleDrawable = this.f7305x) != null) {
            rippleDrawable.setState(this.H);
        }
        this.A.setEmpty();
        this.B.setEmpty();
        this.C.setEmpty();
        this.D = null;
    }

    public final void b(int i5, int i10) {
        RippleDrawable rippleDrawable;
        if (i5 <= 0 || i10 <= 0) {
            a();
            return;
        }
        float paddingStart = getPaddingStart() + 0.0f;
        float paddingTop = getPaddingTop() + 0.0f;
        float paddingEnd = (i5 - getPaddingEnd()) + 0.0f;
        float paddingBottom = (i10 - getPaddingBottom()) + 0.0f;
        float f6 = paddingEnd - paddingStart;
        float f10 = paddingBottom - paddingTop;
        if (f10 <= 0.0f || f6 <= 0.0f) {
            a();
            return;
        }
        this.E = (f6 / 2.0f) + paddingStart;
        this.F = (f10 / 2.0f) + paddingTop;
        float f11 = this.q;
        float f12 = paddingStart + f11;
        float f13 = paddingTop + f11;
        float f14 = (paddingBottom - f11) - f13;
        float f15 = (paddingEnd - f11) - f12;
        RectF rectF = this.A;
        RectF rectF2 = this.C;
        RectF rectF3 = this.B;
        if (f14 <= 0.0f || f15 <= 0.0f) {
            rectF3.setEmpty();
            rectF2.setEmpty();
            this.D = null;
            rectF.left = paddingStart;
            rectF.top = paddingTop;
            rectF.right = paddingEnd;
            rectF.bottom = paddingBottom;
            return;
        }
        StaticLayout e7 = e((int) f15, this.f7296n);
        if (e7 == null || e7.getHeight() <= 0 || e7.getWidth() <= 0) {
            rectF3.setEmpty();
            rectF2.setEmpty();
            this.D = null;
            rectF.left = paddingStart;
            rectF.top = paddingTop;
            rectF.right = paddingEnd;
            rectF.bottom = paddingBottom;
            return;
        }
        float width = e7.getWidth();
        float height = e7.getHeight();
        float f16 = f12 + ((f15 - width) / 2.0f);
        float f17 = f13 + ((f14 - height) / 2.0f);
        float f18 = width + f16;
        float f19 = height + f17;
        float width2 = e7.getWidth() / 2.0f;
        rectF3.left = f16 + width2;
        rectF3.top = f17;
        rectF3.right = width2 + f18;
        rectF3.bottom = f19;
        rectF2.left = f16;
        rectF2.top = f17;
        rectF2.right = f18;
        rectF2.bottom = f19;
        this.D = e7;
        rectF.left = paddingStart;
        rectF.top = paddingTop;
        rectF.right = paddingEnd;
        rectF.bottom = paddingBottom;
        if (this.f7295m || (rippleDrawable = this.f7305x) == null) {
            return;
        }
        int i11 = (int) paddingStart;
        int i12 = (int) paddingTop;
        int i13 = (int) paddingEnd;
        int i14 = (int) paddingBottom;
        if (rippleDrawable.getBounds().left == i11 && rippleDrawable.getBounds().top == i12 && rippleDrawable.getBounds().right == i13 && rippleDrawable.getBounds().bottom == i14) {
            return;
        }
        rippleDrawable.setHotspotBounds(i11, i12, i13, i14);
        rippleDrawable.setBounds(i11, i12, i13, i14);
    }

    public final void c() {
        float[] fArr = this.K;
        float f6 = this.f7298p;
        fArr[0] = f6;
        fArr[1] = f6;
        fArr[2] = f6;
        fArr[3] = f6;
        fArr[4] = f6;
        fArr[5] = f6;
        fArr[6] = f6;
        fArr[7] = f6;
        if (this.L == null) {
            this.L = ColorStateList.valueOf(this.f7304w);
        }
        if (this.f7289g0 == null) {
            this.f7289g0 = new RoundRectShape(fArr, null, null);
        }
        if (this.f7291h0 == null) {
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.getPaint().setColor(-1);
            shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
            shapeDrawable.setShape(this.f7289g0);
            this.f7291h0 = shapeDrawable;
        }
        ColorStateList colorStateList = this.L;
        if (colorStateList != null) {
            this.f7305x = new RippleDrawable(colorStateList, null, this.f7291h0);
        }
    }

    public final StaticLayout d(int i5, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0 || StringsKt.H(charSequence) || i5 <= 5) {
            return null;
        }
        String obj = charSequence.toString();
        TextPaint textPaint = this.f7294l;
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, Math.min(i5, (int) textPaint.measureText(obj))).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i5).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(true).setLineSpacing(0.0f, 1.0f).setMaxLines(2).build();
    }

    public final StaticLayout e(int i5, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0 && !StringsKt.H(charSequence) && i5 > 5) {
            float max = Math.max(this.f7300s, this.f7301t);
            this.f7299r = max;
            TextPaint textPaint = this.f7294l;
            textPaint.setTextSize(max);
            StaticLayout d10 = d(i5, charSequence);
            if (d10 != null) {
                if (d10.getLineCount() >= 2) {
                    while (d10.getLineCount() >= 2) {
                        float f6 = this.f7299r;
                        if (f6 <= this.f7301t) {
                            break;
                        }
                        DisplayMetrics displayMetrics = this.G;
                        if (displayMetrics == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("metrics");
                            displayMetrics = null;
                        }
                        Intrinsics.checkNotNullParameter(displayMetrics, "<this>");
                        float max2 = Math.max(f6 - (Build.VERSION.SDK_INT >= 34 ? TypedValue.applyDimension(2, 1.0f, displayMetrics) : displayMetrics.scaledDensity * 1.0f), this.f7301t);
                        this.f7299r = max2;
                        textPaint.setTextSize(max2);
                        StaticLayout d11 = d(i5, charSequence);
                        if (d11 != null) {
                            d10 = d11;
                        }
                    }
                }
                return d10;
            }
        }
        return null;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f7306y = ((Float) animatedValue).floatValue();
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7306y, 1.0f);
        ofFloat.setDuration(100L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(this);
        this.f7307z = ofFloat;
        if (this.f7305x == null) {
            c();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f7307z;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f7307z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.f7307z = null;
        a();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.A;
        if (rectF.isEmpty()) {
            return;
        }
        float f6 = this.f7306y;
        canvas.scale(f6, f6, this.E, this.F);
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            boolean z5 = this.f7295m;
            Paint paint = this.j;
            if (z5) {
                float f10 = this.f7298p;
                if (this.f7297o) {
                    paint = this.f7293k;
                }
                canvas.drawRoundRect(rectF, f10, f10, paint);
            } else {
                float f11 = this.f7298p;
                canvas.drawRoundRect(rectF, f11, f11, paint);
                RippleDrawable rippleDrawable = this.f7305x;
                if (rippleDrawable != null) {
                    rippleDrawable.draw(canvas);
                }
            }
            canvas.restoreToCount(save);
            RectF rectF2 = this.C;
            StaticLayout staticLayout = this.D;
            if (staticLayout != null) {
                save = canvas.save();
                try {
                    if (!rectF2.isEmpty()) {
                        canvas.clipRect(rectF2);
                    }
                    RectF rectF3 = this.B;
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
        int width = (int) ((e((int) f6, this.f7296n) != null ? r4.getWidth() : 0) + paddingEnd);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        float paddingBottom = (this.q * 2.0f) + getPaddingBottom() + getPaddingTop();
        float paddingStart = ((size - getPaddingStart()) - getPaddingEnd()) - (this.q * 2.0f);
        int height = (int) ((e((int) (paddingStart >= 0.0f ? paddingStart : 0.0f), this.f7296n) != null ? r0.getHeight() : 0) + paddingBottom);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        int resolveSize = View.resolveSize(size, i5);
        int resolveSize2 = View.resolveSize(size2, i10);
        setMeasuredDimension(resolveSize, resolveSize2);
        b(resolveSize, resolveSize2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 <= 0 || i10 <= 0) {
            return;
        }
        if (i11 == i5 && i12 == i10) {
            invalidate();
        } else {
            b(i5, i10);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        RippleDrawable rippleDrawable;
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        RectF rectF = this.A;
        if (action != 0) {
            if (action != 1 && action != 3) {
                return super.onTouchEvent(event);
            }
            this.f7297o = false;
            ValueAnimator valueAnimator = this.f7307z;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                valueAnimator.setFloatValues(this.f7306y, 1.0f);
                valueAnimator.start();
            }
            if (!this.f7295m && (rippleDrawable = this.f7305x) != null) {
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
                    this.f7297o = true;
                    if (!this.f7295m) {
                        RippleDrawable rippleDrawable2 = this.f7305x;
                        if (rippleDrawable2 != null) {
                            rippleDrawable2.setHotspot(event.getX(), event.getY());
                        }
                        RippleDrawable rippleDrawable3 = this.f7305x;
                        if (rippleDrawable3 != null) {
                            rippleDrawable3.setState(this.J);
                        }
                    }
                    ValueAnimator valueAnimator2 = this.f7307z;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        valueAnimator2.setFloatValues(this.f7306y, 0.99f);
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
        this.f7295m = false;
        this.f7296n = text;
        requestLayout();
        invalidate();
    }

    public final void setButtonTypeface(@Nullable Typeface typeface) {
        this.f7295m = false;
        if (typeface == null) {
            typeface = Typeface.DEFAULT_BOLD;
        }
        this.f7294l.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public final void setButtonText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f7295m = false;
        this.f7296n = text;
        requestLayout();
        invalidate();
    }
}
