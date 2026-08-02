package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import xsna.cec;

/* compiled from: FabTransformationBehavior.java */
/* loaded from: classes13.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ cec b;

    public c(cec cecVar) {
        this.b = cecVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cec cecVar = this.b;
        cec.d revealInfo = cecVar.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        cecVar.setRevealInfo(revealInfo);
    }
}
