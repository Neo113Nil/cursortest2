package androidx.swiperefreshlayout.widget;

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
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* renamed from: g, reason: collision with root package name */
    public static final LinearInterpolator f2662g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final q1.b f2663h = new q1.b();

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f2664i = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final c f2665a;

    /* renamed from: b, reason: collision with root package name */
    public float f2666b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f2667c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f2668d;

    /* renamed from: e, reason: collision with root package name */
    public float f2669e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2670f;

    public d(Context context) {
        context.getClass();
        this.f2667c = context.getResources();
        c cVar = new c();
        this.f2665a = cVar;
        cVar.f2651i = f2664i;
        cVar.a(0);
        cVar.f2650h = 2.5f;
        cVar.f2644b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f2662g);
        ofFloat.addListener(new ud.f(this, cVar));
        this.f2668d = ofFloat;
    }

    public static void d(float f6, c cVar) {
        if (f6 <= 0.75f) {
            cVar.f2661u = cVar.f2651i[cVar.j];
            return;
        }
        float f10 = (f6 - 0.75f) / 0.25f;
        int[] iArr = cVar.f2651i;
        int i5 = cVar.j;
        int i10 = iArr[i5];
        int i11 = iArr[(i5 + 1) % iArr.length];
        cVar.f2661u = ((((i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i11 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) - r1) * f10))) << 24) | ((((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i11 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) - r3) * f10))) << 16) | ((((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) ((((i11 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) - r4) * f10))) << 8) | ((i10 & KotlinVersion.MAX_COMPONENT_VALUE) + ((int) (f10 * ((i11 & KotlinVersion.MAX_COMPONENT_VALUE) - r2))));
    }

    public final void a(float f6, c cVar, boolean z5) {
        float interpolation;
        float f10;
        if (this.f2670f) {
            d(f6, cVar);
            float floor = (float) (Math.floor(cVar.f2654m / 0.8f) + 1.0d);
            float f11 = cVar.f2652k;
            float f12 = cVar.f2653l;
            cVar.f2647e = (((f12 - 0.01f) - f11) * f6) + f11;
            cVar.f2648f = f12;
            float f13 = cVar.f2654m;
            cVar.f2649g = d9.e.w(floor, f13, f6, f13);
            return;
        }
        if (f6 != 1.0f || z5) {
            float f14 = cVar.f2654m;
            q1.b bVar = f2663h;
            if (f6 < 0.5f) {
                interpolation = cVar.f2652k;
                f10 = (bVar.getInterpolation(f6 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = cVar.f2652k + 0.79f;
                interpolation = f15 - (((1.0f - bVar.getInterpolation((f6 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f10 = f15;
            }
            float f16 = (0.20999998f * f6) + f14;
            float f17 = (f6 + this.f2669e) * 216.0f;
            cVar.f2647e = interpolation;
            cVar.f2648f = f10;
            cVar.f2649g = f16;
            this.f2666b = f17;
        }
    }

    public final void b(float f6, float f10, float f11, float f12) {
        float f13 = this.f2667c.getDisplayMetrics().density;
        float f14 = f10 * f13;
        c cVar = this.f2665a;
        cVar.f2650h = f14;
        cVar.f2644b.setStrokeWidth(f14);
        cVar.q = f6 * f13;
        cVar.a(0);
        cVar.f2658r = (int) (f11 * f13);
        cVar.f2659s = (int) (f12 * f13);
    }

    public final void c(int i5) {
        if (i5 == 0) {
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
        canvas.rotate(this.f2666b, bounds.exactCenterX(), bounds.exactCenterY());
        c cVar = this.f2665a;
        Paint paint = cVar.f2644b;
        RectF rectF = cVar.f2643a;
        float f6 = cVar.q;
        float f10 = (cVar.f2650h / 2.0f) + f6;
        if (f6 <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((cVar.f2658r * cVar.f2657p) / 2.0f, cVar.f2650h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = cVar.f2647e;
        float f12 = cVar.f2649g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((cVar.f2648f + f12) * 360.0f) - f13;
        paint.setColor(cVar.f2661u);
        paint.setAlpha(cVar.f2660t);
        float f15 = cVar.f2650h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, cVar.f2646d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        Paint paint2 = cVar.f2645c;
        if (cVar.f2655n) {
            Path path = cVar.f2656o;
            if (path == null) {
                Path path2 = new Path();
                cVar.f2656o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (cVar.f2658r * cVar.f2657p) / 2.0f;
            cVar.f2656o.moveTo(0.0f, 0.0f);
            cVar.f2656o.lineTo(cVar.f2658r * cVar.f2657p, 0.0f);
            Path path3 = cVar.f2656o;
            float f18 = cVar.f2658r;
            float f19 = cVar.f2657p;
            path3.lineTo((f18 * f19) / 2.0f, cVar.f2659s * f19);
            cVar.f2656o.offset((rectF.centerX() + min) - f17, (cVar.f2650h / 2.0f) + rectF.centerY());
            cVar.f2656o.close();
            paint2.setColor(cVar.f2661u);
            paint2.setAlpha(cVar.f2660t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(cVar.f2656o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f2665a.f2660t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f2668d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        this.f2665a.f2660t = i5;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2665a.f2644b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f2668d.cancel();
        c cVar = this.f2665a;
        float f6 = cVar.f2647e;
        cVar.f2652k = f6;
        float f10 = cVar.f2648f;
        cVar.f2653l = f10;
        cVar.f2654m = cVar.f2649g;
        if (f10 != f6) {
            this.f2670f = true;
            this.f2668d.setDuration(666L);
            this.f2668d.start();
            return;
        }
        cVar.a(0);
        cVar.f2652k = 0.0f;
        cVar.f2653l = 0.0f;
        cVar.f2654m = 0.0f;
        cVar.f2647e = 0.0f;
        cVar.f2648f = 0.0f;
        cVar.f2649g = 0.0f;
        this.f2668d.setDuration(1332L);
        this.f2668d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f2668d.cancel();
        this.f2666b = 0.0f;
        c cVar = this.f2665a;
        if (cVar.f2655n) {
            cVar.f2655n = false;
        }
        cVar.a(0);
        cVar.f2652k = 0.0f;
        cVar.f2653l = 0.0f;
        cVar.f2654m = 0.0f;
        cVar.f2647e = 0.0f;
        cVar.f2648f = 0.0f;
        cVar.f2649g = 0.0f;
        invalidateSelf();
    }
}
