package ja;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: ja.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5111h {

    /* renamed from: a, reason: collision with root package name */
    public long f53869a;

    /* renamed from: b, reason: collision with root package name */
    public long f53870b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f53871c;

    /* renamed from: d, reason: collision with root package name */
    public int f53872d;

    /* renamed from: e, reason: collision with root package name */
    public int f53873e;

    public C5111h(long j10, long j11) {
        this.f53871c = null;
        this.f53872d = 0;
        this.f53873e = 1;
        this.f53869a = j10;
        this.f53870b = j11;
    }

    public static C5111h b(ValueAnimator valueAnimator) {
        C5111h c5111h = new C5111h(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        c5111h.f53872d = valueAnimator.getRepeatCount();
        c5111h.f53873e = valueAnimator.getRepeatMode();
        return c5111h;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(f());
            valueAnimator.setRepeatMode(g());
        }
    }

    public long c() {
        return this.f53869a;
    }

    public long d() {
        return this.f53870b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f53871c;
        return timeInterpolator != null ? timeInterpolator : AbstractC5104a.f53859b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5111h)) {
            return false;
        }
        C5111h c5111h = (C5111h) obj;
        if (c() == c5111h.c() && d() == c5111h.d() && f() == c5111h.f() && g() == c5111h.g()) {
            return e().getClass().equals(c5111h.e().getClass());
        }
        return false;
    }

    public int f() {
        return this.f53872d;
    }

    public int g() {
        return this.f53873e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public C5111h(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f53872d = 0;
        this.f53873e = 1;
        this.f53869a = j10;
        this.f53870b = j11;
        this.f53871c = timeInterpolator;
    }
}
