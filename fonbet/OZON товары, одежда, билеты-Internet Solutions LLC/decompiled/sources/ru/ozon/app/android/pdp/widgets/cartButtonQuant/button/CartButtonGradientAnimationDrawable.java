package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import Bi.a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonGradientAnimationDrawable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140!J\u0006\u0010\"\u001a\u00020\u0014J\u0006\u0010#\u001a\u00020\u0014J\b\u0010$\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/button/CartButtonGradientAnimationDrawable;", "Landroid/graphics/drawable/Drawable;", "startColor", "", "endColor", "duration", "", "<init>", "(IIJ)V", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "rectF", "Landroid/graphics/RectF;", "fillPercentage", "", "animation", "Landroid/animation/ValueAnimator;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "startAnimation", "startValue", "endValue", "onFinish", "Lkotlin/Function0;", "applyEndColor", "cancel", "updateGradient", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CartButtonGradientAnimationDrawable extends Drawable {
    private ValueAnimator animation;
    private final long duration;
    private final int endColor;
    private float fillPercentage;

    @NotNull
    private final Paint paint;

    @NotNull
    private final Path path;

    @NotNull
    private final RectF rectF;
    private final int startColor;

    public CartButtonGradientAnimationDrawable(int i11, int i12, long j11) {
        this.startColor = i11;
        this.endColor = i12;
        this.duration = j11;
        Paint paint = new Paint(1);
        this.paint = paint;
        this.path = new Path();
        this.rectF = new RectF();
        paint.reset();
        paint.setColor(i11);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimation$lambda$2$lambda$0(CartButtonGradientAnimationDrawable cartButtonGradientAnimationDrawable, ValueAnimator valueAnimator) {
        cartButtonGradientAnimationDrawable.fillPercentage = ((Float) a.b(valueAnimator, "animation", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        cartButtonGradientAnimationDrawable.invalidateSelf();
    }

    private final void updateGradient() {
        Dimens dimens = Dimens.INSTANCE;
        int dp_48 = dimens.getDP_48();
        float dpf_12 = dimens.getDPF_12();
        float width = (1 - this.fillPercentage) * (getBounds().width() + dp_48 + dpf_12);
        this.paint.setShader(new LinearGradient(width, dpf_12, width - dp_48, 0.0f, new int[]{this.endColor, this.startColor}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void applyEndColor() {
        this.paint.reset();
        this.paint.setColor(this.endColor);
        invalidateSelf();
    }

    public final void cancel() {
        ValueAnimator valueAnimator = this.animation;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.fillPercentage != 0.0f) {
            updateGradient();
        }
        this.rectF.set(getBounds());
        this.path.reset();
        Path path = this.path;
        RectF rectF = this.rectF;
        Dimens dimens = Dimens.INSTANCE;
        path.addRoundRect(rectF, dimens.getDP_10(), dimens.getDP_10(), Path.Direction.CW);
        canvas.clipPath(this.path);
        canvas.drawRect(getBounds(), this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void startAnimation(float startValue, float endValue, @NotNull final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(startValue, endValue);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iD.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CartButtonGradientAnimationDrawable.startAnimation$lambda$2$lambda$0(CartButtonGradientAnimationDrawable.this, valueAnimator);
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonQuant.button.CartButtonGradientAnimationDrawable$startAnimation$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
                Paint paint;
                Paint paint2;
                int i11;
                CartButtonGradientAnimationDrawable.this.fillPercentage = 0.0f;
                paint = CartButtonGradientAnimationDrawable.this.paint;
                paint.reset();
                paint2 = CartButtonGradientAnimationDrawable.this.paint;
                i11 = CartButtonGradientAnimationDrawable.this.endColor;
                paint2.setColor(i11);
                CartButtonGradientAnimationDrawable.this.invalidateSelf();
                onFinish.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
            }
        });
        ofFloat.setDuration(this.duration * ((long) endValue));
        ofFloat.start();
        this.animation = ofFloat;
    }
}
