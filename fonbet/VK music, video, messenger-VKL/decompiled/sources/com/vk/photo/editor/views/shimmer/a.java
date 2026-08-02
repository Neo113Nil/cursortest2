package com.vk.photo.editor.views.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.views.shimmer.Shimmer;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.lrb0;
import xsna.u11;

/* compiled from: ShimmerDrawable.kt */
/* loaded from: classes4.dex */
public final class a extends Drawable {
    public final lrb0 a = new lrb0(this, 3);
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Matrix d = new Matrix();
    public ValueAnimator e;
    public Shimmer f;

    /* compiled from: ShimmerDrawable.kt */
    /* renamed from: com.vk.photo.editor.views.shimmer.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1470a {
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
        if (!shimmer.j || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
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
            i = an10.b(shimmer.g * width);
        }
        Shimmer shimmer2 = this.f;
        if (shimmer2 == null) {
            shimmer2 = null;
        }
        int b = an10.b(shimmer2.h * height);
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
                    b = 0;
                }
                float f = i;
                float f2 = b;
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
        float f22 = b;
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
        int i = C1470a.$EnumSwitchMapping$0[shimmer2.c.ordinal()];
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
        if ((shimmer == null ? null : shimmer).i) {
            return -3;
        }
        if (shimmer == null) {
            shimmer = null;
        }
        return shimmer.k ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
