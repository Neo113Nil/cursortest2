package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes9.dex */
final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    private boolean f58363a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f58364b;

    b(d dVar) {
        this.f58364b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f58363a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f58364b;
        dVar.f58390q = 0;
        dVar.f58384k = null;
        if (this.f58363a) {
            return;
        }
        dVar.f58394u.c(4, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.f58364b;
        dVar.f58394u.c(0, false);
        dVar.f58390q = 1;
        dVar.f58384k = animator;
        this.f58363a = false;
    }
}
