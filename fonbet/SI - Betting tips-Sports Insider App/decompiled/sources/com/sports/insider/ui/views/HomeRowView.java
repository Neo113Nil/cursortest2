package com.sports.insider.ui.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import d9.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yg.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/sports/insider/ui/views/HomeRowView;", "Landroid/view/View;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "animate", "", "setArrow", "(Z)V", "setHome", "", "getXCenter", "()F", "xCenter", "getYCenter", "yCenter", "getDpx", "dpx", "getDp7f", "dp7f", "getDp6f", "dp6f", "getDp3dot5f", "dp3dot5f", "getDpy", "dpy", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeRowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeRowView.kt\ncom/sports/insider/ui/views/HomeRowView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,463:1\n404#2:464\n62#3,8:465\n*S KotlinDebug\n*F\n+ 1 HomeRowView.kt\ncom/sports/insider/ui/views/HomeRowView\n*L\n137#1:464\n442#1:465,8\n*E\n"})
/* loaded from: classes.dex */
public final class HomeRowView extends View implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayMetrics f7516a;

    /* renamed from: b, reason: collision with root package name */
    public int f7517b;

    /* renamed from: c, reason: collision with root package name */
    public int f7518c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7519d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7520e;

    /* renamed from: f, reason: collision with root package name */
    public int f7521f;

    /* renamed from: g, reason: collision with root package name */
    public int f7522g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7523h;

    /* renamed from: i, reason: collision with root package name */
    public final Path f7524i;
    public final Path j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f7525k;

    /* renamed from: l, reason: collision with root package name */
    public float f7526l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f7527m;

    /* renamed from: n, reason: collision with root package name */
    public final float f7528n;

    /* renamed from: o, reason: collision with root package name */
    public float f7529o;

    /* renamed from: p, reason: collision with root package name */
    public float f7530p;
    public ValueAnimator q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRowView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7524i = new Path();
        this.j = new Path();
        this.f7525k = new Path();
        Paint paint = new Paint(1);
        this.f7527m = paint;
        this.f7528n = 2.0f;
        this.f7516a = a.b(context, "getDisplayMetrics(...)");
        this.f7519d = (int) getDpx();
        this.f7520e = (int) getDpy();
        Color.parseColor("#2A377C");
        DisplayMetrics displayMetrics = this.f7516a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        this.f7528n = displayMetrics.density * 2.0f;
        paint.setColor(-1);
        paint.setStrokeWidth(this.f7528n);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        double d10 = 2.0f;
        this.f7526l = (this.f7528n / 2.0f) / ((float) Math.sqrt(d10));
        float sqrt = this.f7528n / ((float) Math.sqrt(d10));
        this.f7529o = (sqrt * sqrt) / this.f7528n;
    }

    public static float a(float f6, float f10, float f11) {
        return e.w(f10, f6, f11, f6);
    }

    public static Path b(float f6, float f10, float f11, float f12) {
        Path path = new Path();
        path.moveTo(f6, f10);
        path.lineTo(f11, f12);
        return path;
    }

    private final float getDp3dot5f() {
        DisplayMetrics displayMetrics = this.f7516a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return displayMetrics.density * 4.0f;
    }

    private final float getDp6f() {
        DisplayMetrics displayMetrics = this.f7516a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return displayMetrics.density * 6.0f;
    }

    private final float getDp7f() {
        DisplayMetrics displayMetrics = this.f7516a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return displayMetrics.density * 4.0f;
    }

    private final float getDpx() {
        DisplayMetrics displayMetrics = this.f7516a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return displayMetrics.density * 24.0f;
    }

    private final float getDpy() {
        DisplayMetrics displayMetrics = this.f7516a;
        if (displayMetrics == null) {
            Intrinsics.throwUninitializedPropertyAccessException("metrics");
            displayMetrics = null;
        }
        return displayMetrics.density * 24.0f;
    }

    private final float getXCenter() {
        return this.f7517b / 2.0f;
    }

    private final float getYCenter() {
        return this.f7518c / 2.0f;
    }

    private final void setArrow(boolean animate) {
        if (this.f7523h) {
            e(true);
            return;
        }
        this.f7523h = true;
        if (!animate) {
            e(true);
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.q;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    private final void setHome(boolean animate) {
        if (!this.f7523h) {
            e(false);
            return;
        }
        this.f7523h = false;
        if (!animate) {
            e(false);
            return;
        }
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.q;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public final void c(boolean z5, float f6) {
        this.f7530p = 180 * f6 * (z5 ? -1.0f : 1.0f);
        Path path = this.f7524i;
        path.reset();
        path.addPath(!z5 ? b(a(getDp3dot5f() + this.f7526l, getDp3dot5f(), f6), a(getYCenter() + this.f7526l, getDp6f(), f6), a(getXCenter() + this.f7526l, this.f7517b - getDp3dot5f(), f6), a(getDp7f() + this.f7526l, getDp6f(), f6)) : b(a(this.f7517b - getDp3dot5f(), (this.f7517b - getDp3dot5f()) - this.f7526l, f6), a(getDp6f(), getYCenter() + this.f7526l, f6), a(getDp3dot5f(), getXCenter() - this.f7526l, f6), a(getDp6f(), getDp7f() + this.f7526l, f6)));
        Path path2 = this.f7525k;
        path2.reset();
        path2.addPath(!z5 ? b(a(getDp3dot5f() + this.f7526l, getDp3dot5f(), f6), a(getYCenter() - this.f7526l, this.f7518c - getDp6f(), f6), a(getXCenter() + this.f7526l, this.f7517b - getDp3dot5f(), f6), a((this.f7518c - getDp7f()) - this.f7526l, this.f7518c - getDp6f(), f6)) : b(a(this.f7517b - getDp3dot5f(), (this.f7517b - getDp3dot5f()) - this.f7526l, f6), a(this.f7518c - getDp6f(), getYCenter() - this.f7526l, f6), a(getDp3dot5f(), getXCenter() - this.f7526l, f6), a(this.f7518c - getDp6f(), (this.f7518c - this.f7526l) - getDp7f(), f6)));
        Path path3 = this.j;
        path3.reset();
        path3.addPath(!z5 ? b(a(getDp3dot5f() + this.f7529o, getDp3dot5f(), f6), getYCenter(), this.f7517b - getDp3dot5f(), getYCenter()) : b(a(this.f7517b - getDp3dot5f(), (this.f7517b - getDp3dot5f()) - this.f7529o, f6), getYCenter(), 0 + getDp3dot5f(), getYCenter()));
        invalidate();
    }

    public final void d() {
        this.f7527m.setStrokeWidth(this.f7528n);
        double d10 = 2.0f;
        this.f7526l = (this.f7528n / 2.0f) / ((float) Math.sqrt(d10));
        float sqrt = this.f7528n / ((float) Math.sqrt(d10));
        this.f7529o = (sqrt * sqrt) / this.f7528n;
        c(this.f7523h, 1.0f);
    }

    public final void e(boolean z5) {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(z5, 1.0f);
    }

    public final void f(boolean z5) {
        if (z5) {
            setHome(true);
        } else {
            setArrow(true);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Float f6 = animatedValue instanceof Float ? (Float) animatedValue : null;
        c(this.f7523h, f6 != null ? f6.floatValue() : 1.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(this);
        this.q = ofFloat;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.q;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.q = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f7527m;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f6 = this.f7530p;
        float xCenter = getXCenter();
        float yCenter = getYCenter();
        int save = canvas.save();
        canvas.rotate(f6, xCenter, yCenter);
        try {
            canvas.drawPath(this.f7524i, paint);
            canvas.drawPath(this.j, paint);
            canvas.drawPath(this.f7525k, paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i10) {
        super.onMeasure(i5, i10);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        int min = Math.min(size, View.MeasureSpec.getSize(i10));
        int min2 = Math.min(this.f7519d, this.f7520e);
        this.f7517b = mode != Integer.MIN_VALUE ? mode != 1073741824 ? min2 : min : Math.min(min2, min);
        if (mode2 == Integer.MIN_VALUE) {
            min = Math.min(min2, min);
        } else if (mode2 != 1073741824) {
            min = min2;
        }
        this.f7518c = min;
        setMeasuredDimension(this.f7517b, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        if (i5 == 0 || i10 == 0) {
            return;
        }
        if (this.f7521f == i5 && this.f7522g == i10) {
            return;
        }
        this.f7521f = i5;
        this.f7522g = i10;
        this.f7518c = i10;
        this.f7517b = i5;
        d();
    }
}
