package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QI implements InterfaceC1220Xr {
    public int A00;
    public final InterfaceC1220Xr A01;

    public QI(InterfaceC1220Xr interfaceC1220Xr, int i) {
        this.A01 = interfaceC1220Xr;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1220Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1220Xr
    public final void flush() {
        this.A01.flush();
    }
}
