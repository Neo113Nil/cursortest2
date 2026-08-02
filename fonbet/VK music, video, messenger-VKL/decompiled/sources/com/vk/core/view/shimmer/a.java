package com.vk.core.view.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.shimmer.Shimmer;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.ndj0;
import xsna.u11;

/* compiled from: ShimmerDrawable.kt */
/* loaded from: classes17.dex */
public final class a extends Drawable {
    public final ndj0 a = new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.ndj0
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            com.vk.core.view.shimmer.a.this.invalidateSelf();
        }
    };
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Matrix d = new Matrix();
    public ValueAnimator e;
    public Shimmer f;

    /* compiled from: ShimmerDrawable.kt */
    /* renamed from: com.vk.core.view.shimmer.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0890a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        Shimmer shimmer = this.f;
        if (shimmer == null) {
            shimmer = null;
        }
        if (!shimmer.k || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b(Shimmer shimmer) {
        boolean z;
        ValueAnimator valueAnimator;
        this.f = shimmer;
        Shimmer shimmer2 = this.f;
        if (shimmer2 == null) {
            shimmer2 = null;
        }
        this.b.setXfermode(new PorterDuffXfermode(shimmer2.l ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        d();
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            z = valueAnimator2.isStarted();
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        } else {
            z = false;
        }
        Shimmer shimmer3 = this.f;
        Shimmer shimmer4 = shimmer3 != null ? shimmer3 : null;
        ValueAnimator valueAnimator3 = shimmer4.r;
        if (valueAnimator3 == null) {
            valueAnimator3 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (shimmer4.p / shimmer4.o) + 1.0f);
            valueAnimator3.setRepeatMode(shimmer4.n);
            valueAnimator3.setRepeatCount(shimmer4.m);
            valueAnimator3.setDuration(shimmer4.o);
            valueAnimator3.setInterpolator(shimmer4.q);
            shimmer4.r = valueAnimator3;
        }
        this.e = valueAnimator3;
        valueAnimator3.addUpdateListener(this.a);
        if (z && (valueAnimator = this.e) != null) {
            valueAnimator.start();
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && getCallback() != null) {
                this.e.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        boolean z;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0) {
            return;
        }
        Shimmer shimmer = this.f;
        if (shimmer == null) {
            shimmer = null;
        }
        int i = shimmer.f;
        if (i <= 0) {
            i = an10.b(shimmer.h * width);
        }
        Shimmer shimmer2 = this.f;
        if (shimmer2 == null) {
            shimmer2 = null;
        }
        int i2 = shimmer2.g;
        if (i2 <= 0) {
            i2 = an10.b(shimmer2.i * height);
        }
        Shimmer shimmer3 = this.f;
        if ((shimmer3 == null ? null : shimmer3).c != Shimmer.Direction.TOP_TO_BOTTOM) {
            if (shimmer3 == null) {
                shimmer3 = null;
            }
            if (shimmer3.c != Shimmer.Direction.BOTTOM_TO_TOP) {
                z = false;
                if (z) {
                    i = 0;
                }
                if (!z) {
                    i2 = 0;
                }
                float f = i;
                float f2 = i2;
                Shimmer shimmer4 = this.f;
                this.b.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2, (shimmer4 != null ? null : shimmer4).b, (shimmer4 != null ? shimmer4 : null).a, Shader.TileMode.CLAMP));
            }
        }
        z = true;
        if (z) {
        }
        if (!z) {
        }
        float f3 = i;
        float f22 = i2;
        Shimmer shimmer42 = this.f;
        this.b.setShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, f22, (shimmer42 != null ? null : shimmer42).b, (shimmer42 != null ? shimmer42 : null).a, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float b;
        float f;
        float b2;
        Paint paint = this.b;
        if (paint.getShader() == null) {
            return;
        }
        Shimmer shimmer = this.f;
        if (shimmer == null) {
            shimmer = null;
        }
        shimmer.getClass();
        float tan = (float) Math.tan(Math.toRadians(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        Rect rect = this.c;
        float width = (rect.width() * tan) + rect.height();
        float height = (tan * rect.height()) + rect.width();
        ValueAnimator valueAnimator = this.e;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        Shimmer shimmer2 = this.f;
        if (shimmer2 == null) {
            shimmer2 = null;
        }
        int i = C0890a.$EnumSwitchMapping$0[shimmer2.c.ordinal()];
        if (i == 1) {
            float f2 = -height;
            b = u11.b(height, f2, animatedFraction, f2);
        } else {
            if (i != 2) {
                if (i == 3) {
                    float f3 = -width;
                    b2 = u11.b(width, f3, animatedFraction, f3);
                } else {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b2 = u11.b(-width, width, animatedFraction, width);
                }
                f = b2;
                b = 0.0f;
                Matrix matrix = this.d;
                matrix.reset();
                Shimmer shimmer3 = this.f;
                (shimmer3 != null ? shimmer3 : null).getClass();
                matrix.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
                matrix.postTranslate(b, f);
                paint.getShader().setLocalMatrix(matrix);
                canvas.drawRect(rect, paint);
            }
            b = u11.b(-height, height, animatedFraction, height);
        }
        f = 0.0f;
        Matrix matrix2 = this.d;
        matrix2.reset();
        Shimmer shimmer32 = this.f;
        (shimmer32 != null ? shimmer32 : null).getClass();
        matrix2.setRotate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width() / 2.0f, rect.height() / 2.0f);
        matrix2.postTranslate(b, f);
        paint.getShader().setLocalMatrix(matrix2);
        canvas.drawRect(rect, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Shimmer shimmer = this.f;
        if ((shimmer == null ? null : shimmer).j) {
            return -3;
        }
        if (shimmer == null) {
            shimmer = null;
        }
        return shimmer.l ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        d();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
