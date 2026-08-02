package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mv2 extends Drawable implements Animatable {
    public static final LinearInterpolator g = new LinearInterpolator();
    public static final qq7 h = new qq7(1);
    public static final int[] i = {-16777216};
    public final lv2 a;
    public float b;
    public final Resources c;
    public final ValueAnimator d;
    public float e;
    public boolean f;

    public mv2(Context context) {
        context.getClass();
        this.c = context.getResources();
        lv2 lv2Var = new lv2();
        this.a = lv2Var;
        lv2Var.i = i;
        lv2Var.a(0);
        lv2Var.h = 2.5f;
        lv2Var.b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.addUpdateListener(new kv2(0, this, lv2Var));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(g);
        ofFloat.addListener(new i6(this, lv2Var));
        this.d = ofFloat;
    }

    public static void d(float f, lv2 lv2Var) {
        if (f <= 0.75f) {
            lv2Var.u = lv2Var.i[lv2Var.j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = lv2Var.i;
        int i2 = lv2Var.j;
        int i3 = iArr[i2];
        int i4 = iArr[(i2 + 1) % iArr.length];
        lv2Var.u = ((((i3 >> 24) & 255) + ((int) ((((i4 >> 24) & 255) - r1) * f2))) << 24) | ((((i3 >> 16) & 255) + ((int) ((((i4 >> 16) & 255) - r3) * f2))) << 16) | ((((i3 >> 8) & 255) + ((int) ((((i4 >> 8) & 255) - r4) * f2))) << 8) | ((i3 & 255) + ((int) (f2 * ((i4 & 255) - r2))));
    }

    public final void a(float f, lv2 lv2Var, boolean z) {
        float f2;
        if (this.f) {
            d(f, lv2Var);
            float floor = (float) (Math.floor(lv2Var.m / 0.8f) + 1.0d);
            float f3 = lv2Var.k;
            float f4 = lv2Var.l;
            lv2Var.e = (((f4 - 0.01f) - f3) * f) + f3;
            lv2Var.f = f4;
            float f5 = lv2Var.m;
            lv2Var.g = me4.b(floor, f5, f, f5);
            return;
        }
        if (f != 1.0f || z) {
            float f6 = lv2Var.m;
            float f7 = lv2Var.k;
            qq7 qq7Var = h;
            if (f < 0.5f) {
                f2 = (qq7Var.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f8 = f7 + 0.79f;
                f7 = f8 - (((1.0f - qq7Var.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            float f9 = (0.20999998f * f) + f6;
            float f10 = (f + this.e) * 216.0f;
            lv2Var.e = f7;
            lv2Var.f = f2;
            lv2Var.g = f9;
            this.b = f10;
        }
    }

    public final void b(float f, float f2, float f3, float f4) {
        float f5 = this.c.getDisplayMetrics().density;
        float f6 = f2 * f5;
        lv2 lv2Var = this.a;
        lv2Var.h = f6;
        lv2Var.b.setStrokeWidth(f6);
        lv2Var.q = f * f5;
        lv2Var.a(0);
        lv2Var.r = (int) (f3 * f5);
        lv2Var.s = (int) (f4 * f5);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        lv2 lv2Var = this.a;
        Paint paint = lv2Var.b;
        RectF rectF = lv2Var.a;
        float f = lv2Var.q;
        float f2 = (lv2Var.h / 2.0f) + f;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((lv2Var.r * lv2Var.p) / 2.0f, lv2Var.h / 2.0f);
        }
        rectF.set(bounds.centerX() - f2, bounds.centerY() - f2, bounds.centerX() + f2, bounds.centerY() + f2);
        float f3 = lv2Var.e;
        float f4 = lv2Var.g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((lv2Var.f + f4) * 360.0f) - f5;
        paint.setColor(lv2Var.u);
        paint.setAlpha(lv2Var.t);
        float f7 = lv2Var.h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, lv2Var.d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, paint);
        Paint paint2 = lv2Var.c;
        if (lv2Var.n) {
            Path path = lv2Var.o;
            if (path == null) {
                Path path2 = new Path();
                lv2Var.o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f9 = (lv2Var.r * lv2Var.p) / 2.0f;
            lv2Var.o.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            lv2Var.o.lineTo(lv2Var.r * lv2Var.p, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path3 = lv2Var.o;
            float f10 = lv2Var.r;
            float f11 = lv2Var.p;
            path3.lineTo((f10 * f11) / 2.0f, lv2Var.s * f11);
            lv2Var.o.offset((rectF.centerX() + min) - f9, (lv2Var.h / 2.0f) + rectF.centerY());
            lv2Var.o.close();
            paint2.setColor(lv2Var.u);
            paint2.setAlpha(lv2Var.t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(lv2Var.o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.a.t = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator = this.d;
        valueAnimator.cancel();
        lv2 lv2Var = this.a;
        float f = lv2Var.e;
        lv2Var.k = f;
        float f2 = lv2Var.f;
        lv2Var.l = f2;
        lv2Var.m = lv2Var.g;
        if (f2 != f) {
            this.f = true;
            valueAnimator.setDuration(666L);
            valueAnimator.start();
            return;
        }
        lv2Var.a(0);
        lv2Var.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        valueAnimator.setDuration(1332L);
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.d.cancel();
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2 lv2Var = this.a;
        if (lv2Var.n) {
            lv2Var.n = false;
        }
        lv2Var.a(0);
        lv2Var.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.l = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.m = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        lv2Var.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        invalidateSelf();
    }
}
