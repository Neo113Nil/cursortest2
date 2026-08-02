package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC2197Yl implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC15136x A00;

    public AnimationAnimationListenerC2197Yl(ViewOnClickListenerC15136x viewOnClickListenerC15136x) {
        this.A00 = viewOnClickListenerC15136x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i;
        Handler handler;
        Runnable runnable;
        int i2;
        this.A00.A06();
        i = this.A00.A04;
        if (i > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i2 = this.A00.A04;
            handler.postDelayed(runnable, i2);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
