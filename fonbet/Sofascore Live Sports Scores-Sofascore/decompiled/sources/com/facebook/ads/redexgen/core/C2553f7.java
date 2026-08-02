package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.f7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2553f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C14163c A00;

    public C2553f7(C14163c c14163c) {
        this.A00 = c14163c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C1661Di(this), 2000L);
    }
}
