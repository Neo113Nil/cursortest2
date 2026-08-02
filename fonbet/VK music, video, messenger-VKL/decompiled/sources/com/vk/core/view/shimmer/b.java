package com.vk.core.view.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.shimmer.ThemableShimmer;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.ozl;
import xsna.too0;
import xsna.voo0;

/* compiled from: ThemableShimmerDrawable.kt */
/* loaded from: classes17.dex */
public final class b extends Drawable implements too0 {
    public ThemableShimmer b;
    public final voo0 c = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.voo0
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            com.vk.core.view.shimmer.b.this.invalidateSelf();
        }
    };
    public final Paint d = new Paint(1);
    public final Rect e = new Rect();
    public final Matrix f = new Matrix();
    public ValueAnimator g;

    /* compiled from: ThemableShimmerDrawable.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemableShimmer.Direction.values().length];
            try {
                iArr[ThemableShimmer.Direction.LEFT_TO_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemableShimmer.Direction.RIGHT_TO_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemableShimmer.Direction.TOP_TO_BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ThemableShimmer.Direction.BOTTOM_TO_TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.voo0] */
    public b(Context context) {
        this.b = new ThemableShimmer.a(context).a();
        b();
    }

    @Override // xsna.too0
    public final void Ng() {
        this.b.d();
        d();
    }

    public final void a(Canvas canvas, float f) {
        float f2;
        float f3;
        Paint paint = this.d;
        if (paint.getShader() == null) {
            return;
        }
        this.b.getClass();
        float tan = (float) Math.tan(Math.toRadians(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        Rect rect = this.e;
        float width = (rect.width() * tan) + rect.height();
        float height = (tan * rect.height()) + rect.width();
        ValueAnimator valueAnimator = this.g;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = a.$EnumSwitchMapping$0[this.b.d.ordinal()];
        if (i == 1) {
            float f4 = -height;
            f2 = ((height - f4) * animatedFraction) + f4 + f;
        } else {
            if (i != 2) {
                if (i == 3) {
                    float f5 = -width;
                    f3 = ((width - f5) * animatedFraction) + f5 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f3 = (((-width) - width) * animatedFraction) + width + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                f2 = 0.0f;
                Matrix matrix = this.f;
                matrix.reset();
                this.b.getClass();
                matrix.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(f2, f3);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
            f2 = (((-height) - height) * animatedFraction) + height + f;
        }
        f3 = 0.0f;
        Matrix matrix2 = this.f;
        matrix2.reset();
        this.b.getClass();
        matrix2.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
        matrix2.postTranslate(f2, f3);
        paint.getShader().setLocalMatrix(matrix2);
        canvas.drawRect(rect, paint);
    }

    public final void b() {
        boolean z;
        ValueAnimator valueAnimator;
        d();
        ValueAnimator valueAnimator2 = this.g;
        if (valueAnimator2 != null) {
            z = valueAnimator2.isStarted();
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        } else {
            z = false;
        }
        ValueAnimator a2 = this.b.a();
        this.g = a2;
        a2.addUpdateListener(this.c);
        if (z && (valueAnimator = this.g) != null) {
            valueAnimator.start();
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && getCallback() != null) {
                this.g.start();
            }
        }
    }

    public final void d() {
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0) {
            return;
        }
        ThemableShimmer themableShimmer = this.b;
        int i = themableShimmer.k;
        if (i <= 0) {
            i = an10.b(themableShimmer.m * width);
        }
        ThemableShimmer themableShimmer2 = this.b;
        int i2 = themableShimmer2.l;
        if (i2 <= 0) {
            i2 = an10.b(themableShimmer2.n * height);
        }
        ThemableShimmer.Direction direction = this.b.d;
        boolean z = direction == ThemableShimmer.Direction.TOP_TO_BOTTOM || direction == ThemableShimmer.Direction.BOTTOM_TO_TOP;
        if (z) {
            i = 0;
        }
        if (!z) {
            i2 = 0;
        }
        ThemableShimmer themableShimmer3 = this.b;
        this.d.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, themableShimmer3.c, themableShimmer3.b, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a(canvas, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e.set(0, 0, rect.width(), rect.height());
        d();
        ValueAnimator valueAnimator = this.g;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        this.b.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
