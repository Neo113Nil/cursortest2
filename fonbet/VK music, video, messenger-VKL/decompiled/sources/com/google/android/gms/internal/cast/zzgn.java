package com.google.android.gms.internal.cast;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import xsna.dpj0;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public class zzgn extends AnimatorListenerAdapter {
    private final dpj0 zza = new dpj0();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.zza.put(animator, Boolean.TRUE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.zza.put(animator, Boolean.FALSE);
    }

    public final boolean zza(Animator animator) {
        dpj0 dpj0Var = this.zza;
        return dpj0Var.containsKey(animator) && ((Boolean) dpj0Var.get(animator)).booleanValue();
    }
}
