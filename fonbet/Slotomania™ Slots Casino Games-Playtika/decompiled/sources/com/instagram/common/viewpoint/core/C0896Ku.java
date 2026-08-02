package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0896Ku implements YI {
    public final /* synthetic */ C1370bR A00;

    public C0896Ku(C1370bR c1370bR) {
        this.A00 = c1370bR;
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AFx() {
        boolean z;
        ViewOnClickListenerC0893Kr viewOnClickListenerC0893Kr;
        z = this.A00.A09;
        if (!z) {
            return;
        }
        viewOnClickListenerC0893Kr = this.A00.A08;
        viewOnClickListenerC0893Kr.performClick();
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}
