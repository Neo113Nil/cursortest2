package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzs extends AnimatorListenerAdapter {
    public final /* synthetic */ zzu a;

    public zzs(zzu zzuVar) {
        this.a = zzuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zzu zzuVar = this.a;
        zzuVar.setEnabled(true);
        zzuVar.a.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zzu zzuVar = this.a;
        zzuVar.setEnabled(true);
        zzuVar.a.setEnabled(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zzu zzuVar = this.a;
        zzuVar.setEnabled(false);
        zzuVar.a.setEnabled(false);
    }
}
