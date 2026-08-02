package j7;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;

/* renamed from: j7.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7300i {

    /* renamed from: a, reason: collision with root package name */
    private long f69477a;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f69479c = null;

    /* renamed from: d, reason: collision with root package name */
    private int f69480d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f69481e = 1;

    /* renamed from: b, reason: collision with root package name */
    private long f69478b = 150;

    public C7300i(long j11) {
        this.f69477a = j11;
    }

    @NonNull
    static C7300i b(@NonNull ObjectAnimator objectAnimator) {
        long startDelay = objectAnimator.getStartDelay();
        long duration = objectAnimator.getDuration();
        TimeInterpolator interpolator = objectAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            interpolator = C7292a.f69464b;
        } else if (interpolator instanceof AccelerateInterpolator) {
            interpolator = C7292a.f69465c;
        } else if (interpolator instanceof DecelerateInterpolator) {
            interpolator = C7292a.f69466d;
        }
        C7300i c7300i = new C7300i();
        c7300i.f69480d = 0;
        c7300i.f69481e = 1;
        c7300i.f69477a = startDelay;
        c7300i.f69478b = duration;
        c7300i.f69479c = interpolator;
        c7300i.f69480d = objectAnimator.getRepeatCount();
        c7300i.f69481e = objectAnimator.getRepeatMode();
        return c7300i;
    }

    public final void a(@NonNull Animator animator) {
        animator.setStartDelay(this.f69477a);
        animator.setDuration(this.f69478b);
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f69480d);
            valueAnimator.setRepeatMode(this.f69481e);
        }
    }

    public final long c() {
        return this.f69477a;
    }

    public final long d() {
        return this.f69478b;
    }

    public final TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f69479c;
        return timeInterpolator != null ? timeInterpolator : C7292a.f69464b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7300i)) {
            return false;
        }
        C7300i c7300i = (C7300i) obj;
        if (this.f69477a == c7300i.f69477a && this.f69478b == c7300i.f69478b && this.f69480d == c7300i.f69480d && this.f69481e == c7300i.f69481e) {
            return e().getClass().equals(c7300i.e().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j11 = this.f69477a;
        long j12 = this.f69478b;
        return ((((e().getClass().hashCode() + (((((int) (j11 ^ (j11 >>> 32))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31)) * 31) + this.f69480d) * 31) + this.f69481e;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(C7300i.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f69477a);
        sb2.append(" duration: ");
        sb2.append(this.f69478b);
        sb2.append(" interpolator: ");
        sb2.append(e().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f69480d);
        sb2.append(" repeatMode: ");
        return K00.b.e(this.f69481e, "}\n", sb2);
    }
}
