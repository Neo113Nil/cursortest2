package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QL implements InterfaceC2177Xr {
    public int A00;
    public final InterfaceC2177Xr A01;
    public final InterfaceC2177Xr A02;

    public QL(InterfaceC2177Xr interfaceC2177Xr, int i, InterfaceC2177Xr interfaceC2177Xr2) {
        this.A01 = interfaceC2177Xr;
        this.A00 = i;
        this.A02 = interfaceC2177Xr2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Xr
    public final void flush() {
        this.A02.flush();
    }
}
