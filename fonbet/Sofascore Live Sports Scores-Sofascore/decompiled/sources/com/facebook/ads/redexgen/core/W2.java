package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC2308b8 {
    public final /* synthetic */ C2136Vz A00;

    public W2(C2136Vz c2136Vz) {
        this.A00 = c2136Vz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2308b8
    public final void AE7(C2307b7 c2307b7) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        VV vv;
        VV vv2;
        atomicBoolean = this.A00.A0G;
        atomicBoolean.set(c2307b7.A00() != null);
        atomicBoolean2 = this.A00.A0H;
        if (atomicBoolean2.get()) {
            vv = this.A00.A05;
            if (vv != null) {
                vv2 = this.A00.A05;
                vv2.AFB(c2307b7.A00() != null);
            }
        }
    }
}
