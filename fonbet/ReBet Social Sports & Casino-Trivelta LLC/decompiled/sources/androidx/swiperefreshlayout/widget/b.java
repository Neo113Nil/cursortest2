package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
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
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import x0.f;

/* loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* renamed from: a, reason: collision with root package name */
    public final c f23501a;

    /* renamed from: b, reason: collision with root package name */
    public float f23502b;

    /* renamed from: c, reason: collision with root package name */
    public Resources f23503c;

    /* renamed from: d, reason: collision with root package name */
    public Animator f23504d;

    /* renamed from: e, reason: collision with root package name */
    public float f23505e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f23506f;

    /* renamed from: g, reason: collision with root package name */
    public static final Interpolator f23499g = new LinearInterpolator();

    /* renamed from: h, reason: collision with root package name */
    public static final Interpolator f23500h = new T0.b();
    private static final int[] COLORS = {-16777216};

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f23507a;

        public a(c cVar) {
            this.f23507a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.o(floatValue, this.f23507a);
            b.this.b(floatValue, this.f23507a, false);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    public class C0411b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f23509a;

        public C0411b(c cVar) {
            this.f23509a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f23509a, true);
            this.f23509a.A();
            this.f23509a.l();
            b bVar = b.this;
            if (!bVar.f23506f) {
                bVar.f23505e += 1.0f;
                return;
            }
            bVar.f23506f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f23509a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f23505e = 0.0f;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f23511a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public final Paint f23512b;

        /* renamed from: c, reason: collision with root package name */
        public final Paint f23513c;

        /* renamed from: d, reason: collision with root package name */
        public final Paint f23514d;

        /* renamed from: e, reason: collision with root package name */
        public float f23515e;

        /* renamed from: f, reason: collision with root package name */
        public float f23516f;

        /* renamed from: g, reason: collision with root package name */
        public float f23517g;

        /* renamed from: h, reason: collision with root package name */
        public float f23518h;

        /* renamed from: i, reason: collision with root package name */
        public int f23519i;

        /* renamed from: j, reason: collision with root package name */
        public float f23520j;

        /* renamed from: k, reason: collision with root package name */
        public float f23521k;

        /* renamed from: l, reason: collision with root package name */
        public float f23522l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f23523m;
        int[] mColors;

        /* renamed from: n, reason: collision with root package name */
        public Path f23524n;

        /* renamed from: o, reason: collision with root package name */
        public float f23525o;

        /* renamed from: p, reason: collision with root package name */
        public float f23526p;

        /* renamed from: q, reason: collision with root package name */
        public int f23527q;

        /* renamed from: r, reason: collision with root package name */
        public int f23528r;

        /* renamed from: s, reason: collision with root package name */
        public int f23529s;

        /* renamed from: t, reason: collision with root package name */
        public int f23530t;

        public c() {
            Paint paint = new Paint();
            this.f23512b = paint;
            Paint paint2 = new Paint();
            this.f23513c = paint2;
            Paint paint3 = new Paint();
            this.f23514d = paint3;
            this.f23515e = 0.0f;
            this.f23516f = 0.0f;
            this.f23517g = 0.0f;
            this.f23518h = 5.0f;
            this.f23525o = 1.0f;
            this.f23529s = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f23520j = this.f23515e;
            this.f23521k = this.f23516f;
            this.f23522l = this.f23517g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f23511a;
            float f10 = this.f23526p;
            float f11 = (this.f23518h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f23527q * this.f23525o) / 2.0f, this.f23518h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f23515e;
            float f13 = this.f23517g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f23516f + f13) * 360.0f) - f14;
            this.f23512b.setColor(this.f23530t);
            this.f23512b.setAlpha(this.f23529s);
            float f16 = this.f23518h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f23514d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f23512b);
            b(canvas, f14, f15, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f23523m) {
                Path path = this.f23524n;
                if (path == null) {
                    Path path2 = new Path();
                    this.f23524n = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f23527q * this.f23525o) / 2.0f;
                this.f23524n.moveTo(0.0f, 0.0f);
                this.f23524n.lineTo(this.f23527q * this.f23525o, 0.0f);
                Path path3 = this.f23524n;
                float f13 = this.f23527q;
                float f14 = this.f23525o;
                path3.lineTo((f13 * f14) / 2.0f, this.f23528r * f14);
                this.f23524n.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f23518h / 2.0f));
                this.f23524n.close();
                this.f23513c.setColor(this.f23530t);
                this.f23513c.setAlpha(this.f23529s);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f23524n, this.f23513c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f23529s;
        }

        public float d() {
            return this.f23516f;
        }

        public int e() {
            return this.mColors[f()];
        }

        public int f() {
            return (this.f23519i + 1) % this.mColors.length;
        }

        public float g() {
            return this.f23515e;
        }

        public int h() {
            return this.mColors[this.f23519i];
        }

        public float i() {
            return this.f23521k;
        }

        public float j() {
            return this.f23522l;
        }

        public float k() {
            return this.f23520j;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f23520j = 0.0f;
            this.f23521k = 0.0f;
            this.f23522l = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i10) {
            this.f23529s = i10;
        }

        public void o(float f10, float f11) {
            this.f23527q = (int) f10;
            this.f23528r = (int) f11;
        }

        public void p(float f10) {
            if (f10 != this.f23525o) {
                this.f23525o = f10;
            }
        }

        public void q(float f10) {
            this.f23526p = f10;
        }

        public void r(int i10) {
            this.f23530t = i10;
        }

        public void s(ColorFilter colorFilter) {
            this.f23512b.setColorFilter(colorFilter);
        }

        public void t(int i10) {
            this.f23519i = i10;
            this.f23530t = this.mColors[i10];
        }

        public void u(int[] iArr) {
            this.mColors = iArr;
            t(0);
        }

        public void v(float f10) {
            this.f23516f = f10;
        }

        public void w(float f10) {
            this.f23517g = f10;
        }

        public void x(boolean z10) {
            if (this.f23523m != z10) {
                this.f23523m = z10;
            }
        }

        public void y(float f10) {
            this.f23515e = f10;
        }

        public void z(float f10) {
            this.f23518h = f10;
            this.f23512b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f23503c = ((Context) f.g(context)).getResources();
        c cVar = new c();
        this.f23501a = cVar;
        cVar.u(COLORS);
        l(2.5f);
        n();
    }

    public final void a(float f10, c cVar) {
        o(f10, cVar);
        float floor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((floor - cVar.j()) * f10));
    }

    public void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f23506f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float j10 = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                f11 = (f23500h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float k10 = cVar.k() + 0.79f;
                interpolation = k10 - (((1.0f - f23500h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = k10;
            }
            float f12 = j10 + (0.20999998f * f10);
            float f13 = (f10 + this.f23505e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(f11);
            cVar.w(f12);
            i(f13);
        }
    }

    public final int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    public void d(boolean z10) {
        this.f23501a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f23502b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f23501a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f23501a.p(f10);
        invalidateSelf();
    }

    public void f(float f10) {
        this.f23501a.q(f10);
        invalidateSelf();
    }

    public void g(int... iArr) {
        this.f23501a.u(iArr);
        this.f23501a.t(0);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23501a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h(float f10) {
        this.f23501a.w(f10);
        invalidateSelf();
    }

    public final void i(float f10) {
        this.f23502b = f10;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f23504d.isRunning();
    }

    public final void j(float f10, float f11, float f12, float f13) {
        c cVar = this.f23501a;
        float f14 = this.f23503c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    public void k(float f10, float f11) {
        this.f23501a.y(f10);
        this.f23501a.v(f11);
        invalidateSelf();
    }

    public void l(float f10) {
        this.f23501a.z(f10);
        invalidateSelf();
    }

    public void m(int i10) {
        if (i10 == 0) {
            j(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            j(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void n() {
        c cVar = this.f23501a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f23499g);
        ofFloat.addListener(new C0411b(cVar));
        this.f23504d = ofFloat;
    }

    public void o(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f23501a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23501a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f23504d.cancel();
        this.f23501a.A();
        if (this.f23501a.d() != this.f23501a.g()) {
            this.f23506f = true;
            this.f23504d.setDuration(666L);
            this.f23504d.start();
        } else {
            this.f23501a.t(0);
            this.f23501a.m();
            this.f23504d.setDuration(1332L);
            this.f23504d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f23504d.cancel();
        i(0.0f);
        this.f23501a.x(false);
        this.f23501a.t(0);
        this.f23501a.m();
        invalidateSelf();
    }
}
