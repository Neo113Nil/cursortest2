package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlayer;

/* renamed from: com.facebook.ads.redexgen.X.f7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1596f7 extends AnimatorListenerAdapter {
    public final /* synthetic */ C04593c A00;

    public C1596f7(C04593c c04593c) {
        this.A00 = c04593c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C0704Di(this), ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
    }
}
