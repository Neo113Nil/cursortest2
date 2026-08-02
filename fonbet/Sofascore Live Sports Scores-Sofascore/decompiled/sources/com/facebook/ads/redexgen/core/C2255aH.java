package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.TimeInterpolator;

/* renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2255aH extends Animator {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InterfaceC2244a6 A01;
    public final /* synthetic */ C2257aJ A02;

    public C2255aH(C2257aJ c2257aJ, int i, InterfaceC2244a6 interfaceC2244a6) {
        this.A02 = c2257aJ;
        this.A00 = i;
        this.A01 = interfaceC2244a6;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
    }

    @Override // android.animation.Animator
    public final void cancel() {
    }

    @Override // android.animation.Animator
    public final void end() {
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.A00;
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return 0L;
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        boolean z;
        z = this.A02.A04;
        return z;
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        return null;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
    }

    @Override // android.animation.Animator
    public final void setTarget(Object obj) {
        this.A01.AK7(obj, getDuration());
    }

    @Override // android.animation.Animator
    public final void start() {
    }
}
