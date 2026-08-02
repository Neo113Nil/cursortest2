package com.bytedance.adsdk.sf.wh;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class pcc extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> pcc = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorListener> sf = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> gm = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.sf.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.gm.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.pcc.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void gm() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.pcc.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    public void oo() {
        Iterator<Animator.AnimatorPauseListener> it = this.gm.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    public void pcc(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.sf.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this, z);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.sf.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.pcc.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.sf.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.gm.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.pcc.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public void sf(boolean z) {
        Iterator<Animator.AnimatorListener> it = this.sf.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this, z);
        }
    }

    public void vj() {
        Iterator<Animator.AnimatorPauseListener> it = this.gm.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    public void pcc() {
        Iterator<Animator.AnimatorListener> it = this.sf.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    public void sf() {
        Iterator<Animator.AnimatorListener> it = this.sf.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }
}
