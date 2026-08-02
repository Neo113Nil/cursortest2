package com.instagram.common.viewpoint.core;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1363bK implements LayoutTransition.TransitionListener {
    public final /* synthetic */ C1364bL A00;

    public C1363bK(C1364bL c1364bL) {
        this.A00 = c1364bL;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        ((AbstractC1358bF) this.A00.A00.A00).A09.setAlpha(1.0f);
        this.A00.A00.A00.A0Q.setAlpha(1.0f);
        this.A00.A00.A00.A0P.setAlpha(1.0f);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }
}
