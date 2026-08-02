package com.facebook.shimmer;

import Hj.C3143a;
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
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private final ValueAnimator.AnimatorUpdateListener f57761a = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Paint f57762b;

    /* renamed from: c, reason: collision with root package name */
    private final Rect f57763c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f57764d;

    /* renamed from: e, reason: collision with root package name */
    private ValueAnimator f57765e;

    /* renamed from: f, reason: collision with root package name */
    private com.facebook.shimmer.a f57766f;

    final class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            b.this.invalidateSelf();
        }
    }

    public b() {
        Paint paint = new Paint();
        this.f57762b = paint;
        this.f57763c = new Rect();
        this.f57764d = new Matrix();
        paint.setAntiAlias(true);
    }

    private void e() {
        com.facebook.shimmer.a aVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (aVar = this.f57766f) == null) {
            return;
        }
        int i11 = aVar.f57746g;
        if (i11 <= 0) {
            i11 = Math.round(aVar.f57748i * width);
        }
        com.facebook.shimmer.a aVar2 = this.f57766f;
        int i12 = aVar2.f57747h;
        if (i12 <= 0) {
            i12 = Math.round(aVar2.f57749j * height);
        }
        com.facebook.shimmer.a aVar3 = this.f57766f;
        boolean z11 = true;
        if (aVar3.f57745f != 1) {
            int i13 = aVar3.f57742c;
            if (i13 != 1 && i13 != 3) {
                z11 = false;
            }
            if (z11) {
                i11 = 0;
            }
            if (!z11) {
                i12 = 0;
            }
            com.facebook.shimmer.a aVar4 = this.f57766f;
            radialGradient = new LinearGradient(0.0f, 0.0f, i11, i12, aVar4.f57741b, aVar4.f57740a, Shader.TileMode.CLAMP);
        } else {
            float max = (float) (Math.max(i11, i12) / Math.sqrt(2.0d));
            com.facebook.shimmer.a aVar5 = this.f57766f;
            radialGradient = new RadialGradient(i11 / 2.0f, i12 / 2.0f, max, aVar5.f57741b, aVar5.f57740a, Shader.TileMode.CLAMP);
        }
        this.f57762b.setShader(radialGradient);
    }

    final void a() {
        com.facebook.shimmer.a aVar;
        ValueAnimator valueAnimator = this.f57765e;
        if (valueAnimator == null || valueAnimator.isStarted() || (aVar = this.f57766f) == null || !aVar.f57754o || getCallback() == null) {
            return;
        }
        this.f57765e.start();
    }

    public final void b(com.facebook.shimmer.a aVar) {
        boolean z11;
        this.f57766f = aVar;
        if (aVar != null) {
            this.f57762b.setXfermode(new PorterDuffXfermode(this.f57766f.f57755p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        e();
        if (this.f57766f != null) {
            ValueAnimator valueAnimator = this.f57765e;
            if (valueAnimator != null) {
                z11 = valueAnimator.isStarted();
                this.f57765e.cancel();
                this.f57765e.removeAllUpdateListeners();
            } else {
                z11 = false;
            }
            com.facebook.shimmer.a aVar2 = this.f57766f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (aVar2.f57759t / aVar2.f57758s) + 1.0f);
            this.f57765e = ofFloat;
            ofFloat.setRepeatMode(this.f57766f.f57757r);
            this.f57765e.setRepeatCount(this.f57766f.f57756q);
            ValueAnimator valueAnimator2 = this.f57765e;
            com.facebook.shimmer.a aVar3 = this.f57766f;
            valueAnimator2.setDuration(aVar3.f57758s + aVar3.f57759t);
            this.f57765e.addUpdateListener(this.f57761a);
            if (z11) {
                this.f57765e.start();
            }
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.f57765e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && getCallback() != null) {
                this.f57765e.start();
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f57765e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.f57765e.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        float d11;
        float d12;
        if (this.f57766f != null) {
            Paint paint = this.f57762b;
            if (paint.getShader() == null) {
                return;
            }
            float tan = (float) Math.tan(Math.toRadians(this.f57766f.f57752m));
            Rect rect = this.f57763c;
            float width = (rect.width() * tan) + rect.height();
            float height = (tan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.f57765e;
            float f7 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i11 = this.f57766f.f57742c;
            if (i11 != 1) {
                if (i11 == 2) {
                    d12 = C3143a.d(-height, height, animatedFraction, height);
                } else if (i11 != 3) {
                    float f11 = -height;
                    d12 = C3143a.d(height, f11, animatedFraction, f11);
                } else {
                    d11 = C3143a.d(-width, width, animatedFraction, width);
                }
                f7 = d12;
                d11 = 0.0f;
            } else {
                float f12 = -width;
                d11 = C3143a.d(width, f12, animatedFraction, f12);
            }
            Matrix matrix = this.f57764d;
            matrix.reset();
            matrix.setRotate(this.f57766f.f57752m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f7, d11);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        com.facebook.shimmer.a aVar = this.f57766f;
        if (aVar != null) {
            return (aVar.f57753n || aVar.f57755p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f57763c.set(0, 0, rect.width(), rect.height());
        e();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
