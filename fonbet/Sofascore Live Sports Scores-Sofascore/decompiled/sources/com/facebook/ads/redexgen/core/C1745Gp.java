package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1745Gp implements InterfaceC2191Yf {
    public final /* synthetic */ AbstractC1739Gj A00;

    public C1745Gp(AbstractC1739Gj abstractC1739Gj) {
        this.A00 = abstractC1739Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2191Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
