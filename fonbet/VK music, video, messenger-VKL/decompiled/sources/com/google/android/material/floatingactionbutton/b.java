package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: classes13.dex */
public final class b extends AnimatorListenerAdapter {
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ d.g d;
    public final /* synthetic */ d e;

    public b(d dVar, boolean z, a aVar) {
        this.e = dVar;
        this.c = z;
        this.d = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.e;
        dVar.r = 0;
        dVar.l = null;
        if (this.b) {
            return;
        }
        FloatingActionButton floatingActionButton = dVar.v;
        boolean z = this.c;
        floatingActionButton.a(z ? 8 : 4, z);
        d.g gVar = this.d;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.a.a(aVar.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.e;
        dVar.v.a(0, this.c);
        dVar.r = 1;
        dVar.l = animator;
        this.b = false;
    }
}
