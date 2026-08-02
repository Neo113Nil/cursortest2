package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class smb extends ValueAnimator implements Choreographer.FrameCallback {
    public plb l;
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;
    public float g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public float h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public int i = 0;
    public float j = -2.1474836E9f;
    public float k = 2.1474836E9f;
    public boolean m = false;
    public boolean n = false;

    public final float a() {
        plb plbVar = this.l;
        if (plbVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.h;
        float f2 = plbVar.l;
        return (f - f2) / (plbVar.m - f2);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.add(animatorUpdateListener);
    }

    public final float b() {
        plb plbVar = this.l;
        if (plbVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.k;
        return f == 2.1474836E9f ? plbVar.m : f;
    }

    public final float c() {
        plb plbVar = this.l;
        if (plbVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = this.j;
        return f == -2.1474836E9f ? plbVar.l : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        f(e());
        h(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        boolean z = false;
        if (this.m) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        plb plbVar = this.l;
        if (plbVar == null || !this.m) {
            return;
        }
        float abs = (this.f != 0 ? j - r2 : 0L) / ((1.0E9f / plbVar.n) / Math.abs(this.d));
        float f = this.g;
        if (e()) {
            abs = -abs;
        }
        float f2 = f + abs;
        float c = c();
        float b = b();
        PointF pointF = pkc.a;
        if (f2 >= c && f2 <= b) {
            z = true;
        }
        float f3 = this.g;
        float b2 = pkc.b(f2, c(), b());
        this.g = b2;
        if (this.n) {
            b2 = (float) Math.floor(b2);
        }
        this.h = b2;
        this.f = j;
        if (z) {
            if (!this.n || this.g != f3) {
                g();
            }
        } else if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float b3 = e() ? b() : c();
                this.g = b3;
                this.h = b3;
            }
            this.f = j;
            if (!this.n || this.g != f3) {
                g();
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
            }
            this.i++;
        } else {
            float c2 = this.d < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? c() : b();
            this.g = c2;
            this.h = c2;
            h(true);
            if (!this.n || this.g != f3) {
                g();
            }
            f(e());
        }
        if (this.l == null) {
            return;
        }
        float f4 = this.h;
        float f5 = this.j;
        if (f4 < f5 || f4 > this.k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f5), Float.valueOf(this.k), Float.valueOf(this.h)));
        }
    }

    public final boolean e() {
        return this.d < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void f(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationEnd(this, z);
        }
    }

    public final void g() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float c;
        float b;
        float c2;
        if (this.l == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (e()) {
            c = b() - this.h;
            b = b();
            c2 = c();
        } else {
            c = this.h - c();
            b = b();
            c2 = c();
        }
        return c / (b - c2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        plb plbVar = this.l;
        if (plbVar == null) {
            return 0L;
        }
        return (long) plbVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.m = false;
        }
    }

    public final void i(float f) {
        if (this.g == f) {
            return;
        }
        float b = pkc.b(f, c(), b());
        this.g = b;
        if (this.n) {
            b = (float) Math.floor(b);
        }
        this.h = b;
        this.f = 0L;
        g();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.m;
    }

    public final void j(float f, float f2) {
        if (f > f2) {
            zzl.k("minFrame (", f, ") must be <= maxFrame (", f2, ")");
            return;
        }
        plb plbVar = this.l;
        float f3 = plbVar == null ? -3.4028235E38f : plbVar.l;
        float f4 = plbVar == null ? Float.MAX_VALUE : plbVar.m;
        float b = pkc.b(f, f3, f4);
        float b2 = pkc.b(f2, f3, f4);
        if (b == this.j && b2 == this.k) {
            return;
        }
        this.j = b;
        this.k = b2;
        i((int) pkc.b(this.h, b, b2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }
}
