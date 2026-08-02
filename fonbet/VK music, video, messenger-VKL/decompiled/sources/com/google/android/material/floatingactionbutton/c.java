package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes13.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d.g c;
    public final /* synthetic */ d d;

    public c(d dVar, boolean z, a aVar) {
        this.d = dVar;
        this.b = z;
        this.c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.d;
        dVar.r = 0;
        dVar.l = null;
        d.g gVar = this.c;
        if (gVar != null) {
            ((a) gVar).a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.d;
        dVar.v.a(0, this.b);
        dVar.r = 2;
        dVar.l = animator;
    }
}
