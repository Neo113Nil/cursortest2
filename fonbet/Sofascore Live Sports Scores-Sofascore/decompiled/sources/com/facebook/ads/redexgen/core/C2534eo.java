package com.facebook.ads.redexgen.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2534eo extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C2536eq A01;

    public C2534eo(C2536eq c2536eq, float f) {
        this.A01 = c2536eq;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
