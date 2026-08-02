package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1577eo extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1579eq A01;

    public C1577eo(C1579eq c1579eq, float f) {
        this.A01 = c1579eq;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
