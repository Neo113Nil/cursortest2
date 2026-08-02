package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class e extends Drawable {
    public final d a = new d(this);
    public final Paint b;
    public final Rect c;
    public final Matrix d;
    public ValueAnimator e;
    public c f;

    public e() {
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        c cVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (cVar = this.f) == null || !cVar.o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b() {
        c cVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (cVar = this.f) == null) {
            return;
        }
        int i = cVar.g;
        if (i <= 0) {
            i = Math.round(cVar.i * width);
        }
        c cVar2 = this.f;
        int i2 = cVar2.h;
        if (i2 <= 0) {
            i2 = Math.round(cVar2.j * height);
        }
        c cVar3 = this.f;
        boolean z = true;
        if (cVar3.f != 1) {
            int i3 = cVar3.c;
            if (i3 != 1 && i3 != 3) {
                z = false;
            }
            if (z) {
                i = 0;
            }
            if (!z) {
                i2 = 0;
            }
            c cVar4 = this.f;
            radialGradient = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, cVar4.b, cVar4.a, Shader.TileMode.CLAMP);
        } else {
            float max = (float) (Math.max(i, i2) / Math.sqrt(2.0d));
            c cVar5 = this.f;
            radialGradient = new RadialGradient(i / 2.0f, i2 / 2.0f, max, cVar5.b, cVar5.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float b;
        float b2;
        if (this.f != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float tan = (float) Math.tan(Math.toRadians(this.f.m));
            Rect rect = this.c;
            float width = (rect.width() * tan) + rect.height();
            float height = (tan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f.c;
            if (i != 1) {
                if (i == 2) {
                    b2 = me4.b(-height, height, animatedFraction, height);
                } else if (i != 3) {
                    float f2 = -height;
                    b2 = me4.b(height, f2, animatedFraction, f2);
                } else {
                    b = me4.b(-width, width, animatedFraction, width);
                }
                f = b2;
                b = 0.0f;
            } else {
                float f3 = -width;
                b = me4.b(width, f3, animatedFraction, f3);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, b);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        c cVar = this.f;
        if (cVar != null) {
            return (cVar.n || cVar.p) ? -3 : -1;
        }
        return -1;
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
