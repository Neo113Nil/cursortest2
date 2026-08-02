package com.google.android.gms.internal.cast;

import android.animation.Animator;
import defpackage.fhh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgp extends zzgn {
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        fhh fhhVar = this.a;
        if (fhhVar.containsKey(animator) && ((Boolean) fhhVar.get(animator)).booleanValue()) {
            return;
        }
        ((zzgw) zzgw.a.get()).a();
    }
}
