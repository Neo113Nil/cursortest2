package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC1249Yu implements Animation.AnimationListener {
    public final /* synthetic */ C1057Re A00;
    public final /* synthetic */ PJ A01;
    public final /* synthetic */ PJ A02;

    public AnimationAnimationListenerC1249Yu(PJ pj, PJ pj2, C1057Re c1057Re) {
        this.A01 = pj;
        this.A02 = pj2;
        this.A00 = c1057Re;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A06 = false;
        YB.A0H(this.A02);
        new Handler().postDelayed(new PQ(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
