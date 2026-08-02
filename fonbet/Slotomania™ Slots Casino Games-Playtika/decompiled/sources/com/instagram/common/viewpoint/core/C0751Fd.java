package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Fd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0751Fd implements InterfaceC1063Rk {
    public final /* synthetic */ C1057Re A00;
    public final /* synthetic */ C4T A01;

    public C0751Fd(C4T c4t, C1057Re c1057Re) {
        this.A01 = c4t;
        this.A00 = c1057Re;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1063Rk
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
