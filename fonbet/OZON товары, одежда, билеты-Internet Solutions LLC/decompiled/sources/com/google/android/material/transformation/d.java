package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import m7.InterfaceC8100b;

/* loaded from: classes9.dex */
final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC8100b f58861a;

    d(InterfaceC8100b interfaceC8100b) {
        this.f58861a = interfaceC8100b;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC8100b interfaceC8100b = this.f58861a;
        interfaceC8100b.c().f74615c = Float.MAX_VALUE;
        interfaceC8100b.a();
    }
}
