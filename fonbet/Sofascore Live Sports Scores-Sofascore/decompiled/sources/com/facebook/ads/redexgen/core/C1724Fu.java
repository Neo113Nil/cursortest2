package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Fu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1724Fu implements InterfaceC2020Rk {
    public final /* synthetic */ C2014Re A00;
    public final /* synthetic */ C4U A01;

    public C1724Fu(C4U c4u, C2014Re c2014Re) {
        this.A01 = c4u;
        this.A00 = c2014Re;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2020Rk
    public final boolean AAI() {
        boolean A0j;
        boolean A0k;
        if (!this.A01.A0i()) {
            A0j = this.A01.A0j();
            if (A0j) {
                return true;
            }
            A0k = this.A01.A0k();
            return A0k;
        }
        this.A01.A0h(this.A00);
        return true;
    }
}
