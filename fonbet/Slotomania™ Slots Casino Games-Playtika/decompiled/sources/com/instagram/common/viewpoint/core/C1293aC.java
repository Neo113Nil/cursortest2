package com.instagram.common.viewpoint.core;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1293aC extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C1300aJ A01;

    public C1293aC(C1300aJ c1300aJ, float f) {
        this.A01 = c1300aJ;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(XV.A00, XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
