package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC1220Xr {
    public final C1219Xq A00;
    public final InterfaceC1220Xr A01;

    public QF(InterfaceC1220Xr interfaceC1220Xr, int i, int i2) {
        this.A01 = interfaceC1220Xr;
        this.A00 = new C1219Xq(i, i2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1220Xr
    public final void AH8(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() == null) {
            return;
        }
        A08 = AbstractC1222Xt.A08(this.A00);
        if (A08) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1220Xr
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC1222Xt.A08(this.A00);
            if (A08) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
