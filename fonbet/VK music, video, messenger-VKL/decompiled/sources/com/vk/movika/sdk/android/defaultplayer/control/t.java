package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.vk.movika.sdk.android.defaultplayer.control.s;

/* loaded from: classes3.dex */
public final class t implements Animator.AnimatorListener {
    public final /* synthetic */ s b;
    public final /* synthetic */ s.c c;
    public final /* synthetic */ ValueAnimator d;

    public t(s sVar, s.c cVar, ValueAnimator valueAnimator) {
        this.b = sVar;
        this.c = cVar;
        this.d = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s sVar = this.b;
        sVar.b.remove(this.c);
        this.d.removeAllListeners();
        sVar.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
