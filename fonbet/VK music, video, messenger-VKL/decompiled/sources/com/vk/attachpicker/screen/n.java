package com.vk.attachpicker.screen;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import xsna.i0q0;
import xsna.z27;

/* compiled from: TrimScreen.java */
/* loaded from: classes15.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ m b;

    public n(m mVar) {
        this.b = mVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i0q0.d(16L, new z27(this, 16));
    }
}
