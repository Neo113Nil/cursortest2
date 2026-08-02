package com.airbnb.lottie.utils;

import android.view.Choreographer;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.C2940j;

/* loaded from: classes.dex */
public class j extends c implements Choreographer.FrameCallback {

    /* renamed from: l, reason: collision with root package name */
    public C2940j f29125l;

    /* renamed from: d, reason: collision with root package name */
    public float f29117d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29118e = false;

    /* renamed from: f, reason: collision with root package name */
    public long f29119f = 0;

    /* renamed from: g, reason: collision with root package name */
    public float f29120g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f29121h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f29122i = 0;

    /* renamed from: j, reason: collision with root package name */
    public float f29123j = -2.1474836E9f;

    /* renamed from: k, reason: collision with root package name */
    public float f29124k = 2.1474836E9f;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29126m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29127n = false;

    public void A(float f10) {
        B(this.f29123j, f10);
    }

    public void B(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        C2940j c2940j = this.f29125l;
        float p10 = c2940j == null ? -3.4028235E38f : c2940j.p();
        C2940j c2940j2 = this.f29125l;
        float f12 = c2940j2 == null ? Float.MAX_VALUE : c2940j2.f();
        float b10 = l.b(f10, p10, f12);
        float b11 = l.b(f11, p10, f12);
        if (b10 == this.f29123j && b11 == this.f29124k) {
            return;
        }
        this.f29123j = b10;
        this.f29124k = b11;
        z((int) l.b(this.f29121h, b10, b11));
    }

    public void C(int i10) {
        B(i10, (int) this.f29124k);
    }

    public void D(float f10) {
        this.f29117d = f10;
    }

    public void E(boolean z10) {
        this.f29127n = z10;
    }

    public final void F() {
        if (this.f29125l == null) {
            return;
        }
        float f10 = this.f29121h;
        if (f10 < this.f29123j || f10 > this.f29124k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f29123j), Float.valueOf(this.f29124k), Float.valueOf(this.f29121h)));
        }
    }

    @Override // com.airbnb.lottie.utils.c
    public void a() {
        super.a();
        b(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        u();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        t();
        if (this.f29125l == null || !isRunning()) {
            return;
        }
        if (AbstractC2935e.h()) {
            AbstractC2935e.b("LottieValueAnimator#doFrame");
        }
        float m10 = (this.f29119f != 0 ? j10 - r2 : 0L) / m();
        float f10 = this.f29120g;
        if (q()) {
            m10 = -m10;
        }
        float f11 = f10 + m10;
        boolean d10 = l.d(f11, o(), n());
        float f12 = this.f29120g;
        float b10 = l.b(f11, o(), n());
        this.f29120g = b10;
        if (this.f29127n) {
            b10 = (float) Math.floor(b10);
        }
        this.f29121h = b10;
        this.f29119f = j10;
        if (d10) {
            h(f12);
        } else if (getRepeatCount() == -1 || this.f29122i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f29118e = !this.f29118e;
                x();
            } else {
                float n10 = q() ? n() : o();
                this.f29120g = n10;
                this.f29121h = n10;
            }
            this.f29119f = j10;
            h(f12);
            d();
            this.f29122i++;
        } else {
            float o10 = this.f29117d < 0.0f ? o() : n();
            this.f29120g = o10;
            this.f29121h = o10;
            u();
            h(f12);
            b(q());
        }
        F();
        if (AbstractC2935e.h()) {
            AbstractC2935e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float o10;
        float n10;
        float o11;
        if (this.f29125l == null) {
            return 0.0f;
        }
        if (q()) {
            o10 = n() - this.f29121h;
            n10 = n();
            o11 = o();
        } else {
            o10 = this.f29121h - o();
            n10 = n();
            o11 = o();
        }
        return o10 / (n10 - o11);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(k());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C2940j c2940j = this.f29125l;
        if (c2940j == null) {
            return 0L;
        }
        return (long) c2940j.d();
    }

    public final void h(float f10) {
        if (this.f29127n && this.f29120g == f10) {
            return;
        }
        g();
    }

    public void i() {
        this.f29125l = null;
        this.f29123j = -2.1474836E9f;
        this.f29124k = 2.1474836E9f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f29126m;
    }

    public void j() {
        u();
        b(q());
    }

    public float k() {
        C2940j c2940j = this.f29125l;
        if (c2940j == null) {
            return 0.0f;
        }
        return (this.f29121h - c2940j.p()) / (this.f29125l.f() - this.f29125l.p());
    }

    public float l() {
        return this.f29121h;
    }

    public final float m() {
        C2940j c2940j = this.f29125l;
        if (c2940j == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c2940j.i()) / Math.abs(this.f29117d);
    }

    public float n() {
        C2940j c2940j = this.f29125l;
        if (c2940j == null) {
            return 0.0f;
        }
        float f10 = this.f29124k;
        return f10 == 2.1474836E9f ? c2940j.f() : f10;
    }

    public float o() {
        C2940j c2940j = this.f29125l;
        if (c2940j == null) {
            return 0.0f;
        }
        float f10 = this.f29123j;
        return f10 == -2.1474836E9f ? c2940j.p() : f10;
    }

    public float p() {
        return this.f29117d;
    }

    public final boolean q() {
        return p() < 0.0f;
    }

    public void r() {
        u();
        c();
    }

    public void s() {
        this.f29126m = true;
        f(q());
        z((int) (q() ? n() : o()));
        this.f29119f = 0L;
        this.f29122i = 0;
        t();
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f29118e) {
            return;
        }
        this.f29118e = false;
        x();
    }

    public void t() {
        if (isRunning()) {
            v(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void u() {
        v(true);
    }

    public void v(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f29126m = false;
        }
    }

    public void w() {
        this.f29126m = true;
        t();
        this.f29119f = 0L;
        if (q() && l() == o()) {
            z(n());
        } else if (!q() && l() == n()) {
            z(o());
        }
        e();
    }

    public void x() {
        D(-p());
    }

    public void y(C2940j c2940j) {
        boolean z10 = this.f29125l == null;
        this.f29125l = c2940j;
        if (z10) {
            B(Math.max(this.f29123j, c2940j.p()), Math.min(this.f29124k, c2940j.f()));
        } else {
            B((int) c2940j.p(), (int) c2940j.f());
        }
        float f10 = this.f29121h;
        this.f29121h = 0.0f;
        this.f29120g = 0.0f;
        z((int) f10);
        g();
    }

    public void z(float f10) {
        if (this.f29120g == f10) {
            return;
        }
        float b10 = l.b(f10, o(), n());
        this.f29120g = b10;
        if (this.f29127n) {
            b10 = (float) Math.floor(b10);
        }
        this.f29121h = b10;
        this.f29119f = 0L;
        g();
    }
}
