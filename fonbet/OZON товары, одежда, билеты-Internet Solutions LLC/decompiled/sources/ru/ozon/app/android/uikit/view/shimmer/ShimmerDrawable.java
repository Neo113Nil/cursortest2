package ru.ozon.app.android.uikit.view.shimmer;

import AX.a;
import Hj.C3143a;
import Sc.InterfaceC3999a;
import Sc.o;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.shimmer.Shimmer;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0015H\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0007¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\nH\u0007¢\u0006\u0004\b$\u0010\u0003J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\u0003R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00107¨\u00068"}, d2 = {"Lru/ozon/app/android/uikit/view/shimmer/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "", "start", "end", "percent", "offset", "(FFF)F", "", "updateValueAnimator", "updateShader", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer;", "shimmer", "setShimmer", "(Lru/ozon/app/android/uikit/view/shimmer/Shimmer;)V", "startShimmer", "stopShimmer", "", "isShimmerStarted", "()Z", "maybeStartShimmer", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/graphics/Paint;", "shimmerPaint", "Landroid/graphics/Paint;", "drawRect", "Landroid/graphics/Rect;", "Landroid/graphics/Matrix;", "mShaderMatrix", "Landroid/graphics/Matrix;", "Landroid/animation/ValueAnimator;", "valueAnimator", "Landroid/animation/ValueAnimator;", "Lru/ozon/app/android/uikit/view/shimmer/Shimmer;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShimmerDrawable extends Drawable {

    @NotNull
    private final Rect drawRect;

    @NotNull
    private final Matrix mShaderMatrix;
    private Shimmer shimmer;

    @NotNull
    private final Paint shimmerPaint;

    @NotNull
    private final ValueAnimator.AnimatorUpdateListener updateListener = new a(this, 0);
    private ValueAnimator valueAnimator;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Shimmer.Direction.values().length];
            try {
                iArr[Shimmer.Direction.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Shimmer.Direction.RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Shimmer.Direction.TOP_TO_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Shimmer.Direction.BOTTOM_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Shimmer.Shape.values().length];
            try {
                iArr2[Shimmer.Shape.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Shimmer.Shape.RADIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Shimmer.Shape.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ShimmerDrawable() {
        Paint paint = new Paint();
        this.shimmerPaint = paint;
        this.drawRect = new Rect();
        this.mShaderMatrix = new Matrix();
        paint.setAntiAlias(true);
    }

    private final float offset(float start, float end, float percent) {
        return C3143a.d(end, start, percent, start);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateListener$lambda$0(ShimmerDrawable shimmerDrawable, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        shimmerDrawable.invalidateSelf();
    }

    private final void updateShader() {
        Shader linearGradient;
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int width = bounds.width();
        int height = bounds.height();
        Shimmer shimmer = this.shimmer;
        if (width == 0 || height == 0 || shimmer == null) {
            return;
        }
        int width2 = shimmer.width(width);
        int height2 = shimmer.height(height);
        int i11 = WhenMappings.$EnumSwitchMapping$1[shimmer.getShape().ordinal()];
        boolean z11 = true;
        if (i11 == 1) {
            if (shimmer.getDirection() != Shimmer.Direction.TOP_TO_BOTTOM && shimmer.getDirection() != Shimmer.Direction.BOTTOM_TO_TOP) {
                z11 = false;
            }
            linearGradient = new LinearGradient(0.0f, 0.0f, z11 ? 0.0f : width2, z11 ? height2 : 0.0f, shimmer.getColors(), shimmer.getPositions(), Shader.TileMode.CLAMP);
        } else if (i11 == 2) {
            linearGradient = new RadialGradient(width2 / 2.0f, height2 / 2.0f, (float) (Math.max(width2, height2) / Math.sqrt(2.0d)), shimmer.getColors(), shimmer.getPositions(), Shader.TileMode.CLAMP);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            linearGradient = null;
        }
        this.shimmerPaint.setShader(linearGradient);
    }

    private final void updateValueAnimator() {
        Shimmer shimmer = this.shimmer;
        if (shimmer == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (shimmer.getRepeatDelay() / shimmer.getAnimationDuration()) + 1.0f);
        TimeInterpolator interpolator = shimmer.getInterpolator();
        if (interpolator == null) {
            interpolator = new LinearInterpolator();
        }
        ofFloat.setInterpolator(interpolator);
        ofFloat.setRepeatMode(shimmer.getRepeatMode());
        ofFloat.setStartDelay(shimmer.getStartDelay());
        ofFloat.setRepeatCount(shimmer.getRepeatCount());
        ofFloat.setDuration(shimmer.getRepeatDelay() + shimmer.getAnimationDuration());
        ofFloat.addUpdateListener(this.updateListener);
        this.valueAnimator = ofFloat;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        float f7;
        float offset;
        float f11;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Shimmer shimmer = this.shimmer;
        if (shimmer == null) {
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        float f12 = 0.0f;
        if (valueAnimator != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            f7 = ((Float) animatedValue).floatValue();
        } else {
            f7 = 0.0f;
        }
        if (shimmer.getShape() == Shimmer.Shape.SOLID) {
            this.shimmerPaint.setColor(c.b(1 - f7, shimmer.getBaseColor(), shimmer.getHighlightColor()));
            canvas.drawRect(this.drawRect, this.shimmerPaint);
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(shimmer.getTilt()));
        float width = (this.drawRect.width() * tan) + this.drawRect.height();
        float height = (tan * this.drawRect.height()) + this.drawRect.width();
        int i11 = WhenMappings.$EnumSwitchMapping$0[shimmer.getDirection().ordinal()];
        if (i11 == 1) {
            offset = offset(-height, height, f7);
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    f11 = offset(-width, width, f7);
                } else {
                    if (i11 != 4) {
                        throw new o();
                    }
                    f11 = offset(width, -width, f7);
                }
                this.mShaderMatrix.reset();
                this.mShaderMatrix.setRotate(shimmer.getTilt(), this.drawRect.width() / 2.0f, this.drawRect.height() / 2.0f);
                this.mShaderMatrix.postTranslate(f12, f11);
                this.shimmerPaint.getShader().setLocalMatrix(this.mShaderMatrix);
                canvas.drawRect(this.drawRect, this.shimmerPaint);
            }
            offset = offset(height, -height, f7);
        }
        f12 = offset;
        f11 = 0.0f;
        this.mShaderMatrix.reset();
        this.mShaderMatrix.setRotate(shimmer.getTilt(), this.drawRect.width() / 2.0f, this.drawRect.height() / 2.0f);
        this.mShaderMatrix.postTranslate(f12, f11);
        this.shimmerPaint.getShader().setLocalMatrix(this.mShaderMatrix);
        canvas.drawRect(this.drawRect, this.shimmerPaint);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC3999a
    public int getOpacity() {
        Shimmer shimmer = this.shimmer;
        if (shimmer != null) {
            return (shimmer.getClipToChildren() || shimmer.getAlphaShimmer()) ? -3 : -1;
        }
        return -1;
    }

    public final boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.valueAnimator;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    public final void maybeStartShimmer() {
        ValueAnimator valueAnimator = this.valueAnimator;
        Shimmer shimmer = this.shimmer;
        if (valueAnimator == null || valueAnimator.isStarted() || shimmer == null || !shimmer.getAutoStart() || getCallback() == null) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.drawRect.set(bounds);
        updateShader();
        maybeStartShimmer();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void setShimmer(Shimmer shimmer) {
        this.shimmer = shimmer;
        if (shimmer != null) {
            this.shimmerPaint.setXfermode(new PorterDuffXfermode(shimmer.getAlphaShimmer() ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        updateShader();
        updateValueAnimator();
        invalidateSelf();
    }

    public final void startShimmer() {
        ValueAnimator valueAnimator;
        if (isShimmerStarted() || getCallback() == null || (valueAnimator = this.valueAnimator) == null) {
            return;
        }
        valueAnimator.start();
    }

    public final void stopShimmer() {
        ValueAnimator valueAnimator;
        if (!isShimmerStarted() || (valueAnimator = this.valueAnimator) == null) {
            return;
        }
        valueAnimator.cancel();
    }
}
