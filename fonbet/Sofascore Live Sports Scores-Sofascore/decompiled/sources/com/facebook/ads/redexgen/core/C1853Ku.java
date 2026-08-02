package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1853Ku implements YI {
    public final /* synthetic */ C2327bR A00;

    public C1853Ku(C2327bR c2327bR) {
        this.A00 = c2327bR;
    }

    @Override // com.facebook.ads.redexgen.core.YI
    public final void AFx() {
        boolean z;
        ViewOnClickListenerC1850Kr viewOnClickListenerC1850Kr;
        z = this.A00.A09;
        if (!z) {
            return;
        }
        viewOnClickListenerC1850Kr = this.A00.A08;
        viewOnClickListenerC1850Kr.performClick();
    }

    @Override // com.facebook.ads.redexgen.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}
