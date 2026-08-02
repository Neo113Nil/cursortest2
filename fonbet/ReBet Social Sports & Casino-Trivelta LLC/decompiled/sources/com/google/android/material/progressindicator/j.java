package com.google.android.material.progressindicator;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import com.google.android.material.progressindicator.l;
import ja.AbstractC5104a;
import s0.AbstractC6307a;

/* loaded from: classes3.dex */
public final class j extends k {

    /* renamed from: C, reason: collision with root package name */
    public static final O0.i f35660C = new a("indicatorLevel");

    /* renamed from: A, reason: collision with root package name */
    public TimeInterpolator f35661A;

    /* renamed from: B, reason: collision with root package name */
    public TimeInterpolator f35662B;

    /* renamed from: r, reason: collision with root package name */
    public l f35663r;

    /* renamed from: s, reason: collision with root package name */
    public final O0.m f35664s;

    /* renamed from: t, reason: collision with root package name */
    public final O0.l f35665t;

    /* renamed from: u, reason: collision with root package name */
    public final l.a f35666u;

    /* renamed from: v, reason: collision with root package name */
    public float f35667v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f35668w;

    /* renamed from: x, reason: collision with root package name */
    public final ValueAnimator f35669x;

    /* renamed from: y, reason: collision with root package name */
    public ValueAnimator f35670y;

    /* renamed from: z, reason: collision with root package name */
    public TimeInterpolator f35671z;

    public class a extends O0.i {
        public a(String str) {
            super(str);
        }

        @Override // O0.i
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(j jVar) {
            return jVar.E() * 10000.0f;
        }

        @Override // O0.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(j jVar, float f10) {
            jVar.K(f10 / 10000.0f);
            jVar.G((int) f10);
        }
    }

    public j(Context context, final c cVar, l lVar) {
        super(context, cVar);
        this.f35668w = false;
        I(lVar);
        l.a aVar = new l.a();
        this.f35666u = aVar;
        aVar.f35703h = true;
        O0.m mVar = new O0.m();
        this.f35664s = mVar;
        mVar.f(1.0f);
        mVar.h(50.0f);
        O0.l lVar2 = new O0.l(this, f35660C);
        this.f35665t = lVar2;
        lVar2.x(mVar);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f35669x = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.progressindicator.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                j.v(j.this, cVar, valueAnimator2);
            }
        });
        if (cVar.b(true) && cVar.f35613l != 0) {
            valueAnimator.start();
        }
        p(1.0f);
    }

    public static j A(Context context, g gVar, d dVar) {
        return new j(context, gVar, dVar);
    }

    public static j B(Context context, r rVar, o oVar) {
        return new j(context, rVar, oVar);
    }

    public static /* synthetic */ void v(j jVar, c cVar, ValueAnimator valueAnimator) {
        jVar.getClass();
        if (cVar.b(true) && cVar.f35613l != 0 && jVar.isVisible()) {
            jVar.invalidateSelf();
        }
    }

    public final float C(int i10) {
        float f10 = i10;
        return (f10 < 1000.0f || f10 > 9000.0f) ? 0.0f : 1.0f;
    }

    public l D() {
        return this.f35663r;
    }

    public final float E() {
        return this.f35666u.f35697b;
    }

    public final void F() {
        if (this.f35670y != null) {
            return;
        }
        Context context = this.f35673a;
        int i10 = ia.c.f48231e0;
        TimeInterpolator timeInterpolator = AbstractC5104a.f53858a;
        this.f35661A = za.h.g(context, i10, timeInterpolator);
        this.f35662B = za.h.g(this.f35673a, ia.c.f48221Z, timeInterpolator);
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f35670y = valueAnimator;
        valueAnimator.setDuration(500L);
        this.f35670y.setFloatValues(0.0f, 1.0f);
        this.f35670y.setInterpolator(null);
        this.f35670y.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.progressindicator.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                j.this.f35666u.f35700e = r0.f35671z.getInterpolation(r0.f35670y.getAnimatedFraction());
            }
        });
    }

    public final void G(int i10) {
        if (this.f35674b.b(true)) {
            F();
            float C10 = C(i10);
            if (C10 == this.f35667v) {
                if (this.f35670y.isRunning()) {
                    return;
                }
                H(C10);
                return;
            }
            if (this.f35670y.isRunning()) {
                this.f35670y.cancel();
            }
            this.f35667v = C10;
            if (C10 == 1.0f) {
                this.f35671z = this.f35661A;
                this.f35670y.start();
            } else {
                this.f35671z = this.f35662B;
                this.f35670y.reverse();
            }
        }
    }

    public final void H(float f10) {
        this.f35666u.f35700e = f10;
        invalidateSelf();
    }

    public void I(l lVar) {
        this.f35663r = lVar;
    }

    public void J(boolean z10) {
        if (z10 && !this.f35669x.isRunning()) {
            this.f35669x.start();
        } else {
            if (z10 || !this.f35669x.isRunning()) {
                return;
            }
            this.f35669x.cancel();
        }
    }

    public final void K(float f10) {
        this.f35666u.f35697b = f10;
        invalidateSelf();
    }

    public void L(float f10) {
        setLevel((int) (f10 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(this.f35688p)) {
            canvas.save();
            this.f35663r.h(canvas, getBounds(), h(), m(), l());
            this.f35666u.f35701f = i();
            this.f35686n.setStyle(Paint.Style.FILL);
            this.f35686n.setAntiAlias(true);
            l.a aVar = this.f35666u;
            c cVar = this.f35674b;
            aVar.f35698c = cVar.indicatorColors[0];
            int i10 = cVar.f35609h;
            if (i10 > 0) {
                if (!(this.f35663r instanceof o)) {
                    i10 = (int) ((i10 * AbstractC6307a.a(E(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f35663r.d(canvas, this.f35686n, E(), 1.0f, this.f35674b.f35606e, getAlpha(), i10);
            } else {
                this.f35663r.d(canvas, this.f35686n, 0.0f, 1.0f, cVar.f35606e, getAlpha(), 0);
            }
            this.f35663r.c(canvas, this.f35686n, this.f35666u, getAlpha());
            this.f35663r.b(canvas, this.f35686n, this.f35674b.indicatorColors[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f35663r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f35663r.f();
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f35665t.y();
        K(getLevel() / 10000.0f);
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ void o(androidx.vectordrawable.graphics.drawable.b bVar) {
        super.o(bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        float C10 = C(i10);
        if (!this.f35668w) {
            this.f35665t.n(E() * 10000.0f);
            this.f35665t.t(i10);
            return true;
        }
        this.f35665t.y();
        K(i10 / 10000.0f);
        H(C10);
        return true;
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean s(boolean z10, boolean z11, boolean z12) {
        return super.s(z10, z11, z12);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i10) {
        super.setAlpha(i10);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11);
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // com.google.android.material.progressindicator.k, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // com.google.android.material.progressindicator.k
    public boolean t(boolean z10, boolean z11, boolean z12) {
        boolean t10 = super.t(z10, z11, z12);
        float a10 = this.f35675c.a(this.f35673a.getContentResolver());
        if (a10 == 0.0f) {
            this.f35668w = true;
            return t10;
        }
        this.f35668w = false;
        this.f35664s.h(50.0f / a10);
        return t10;
    }

    @Override // com.google.android.material.progressindicator.k
    public /* bridge */ /* synthetic */ boolean u(androidx.vectordrawable.graphics.drawable.b bVar) {
        return super.u(bVar);
    }
}
