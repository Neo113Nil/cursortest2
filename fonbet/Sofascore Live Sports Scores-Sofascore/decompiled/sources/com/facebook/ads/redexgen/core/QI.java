package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC2177Xr {
    public int A00;
    public final InterfaceC2177Xr A01;

    public QI(InterfaceC2177Xr interfaceC2177Xr, int i) {
        this.A01 = interfaceC2177Xr;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2177Xr
    public final void flush() {
        this.A01.flush();
    }
}
