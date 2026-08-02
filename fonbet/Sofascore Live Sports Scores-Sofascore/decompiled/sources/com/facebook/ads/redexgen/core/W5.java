package com.facebook.ads.redexgen.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network/classes2.dex */
public class W5 implements InterfaceC2535ep {
    public final /* synthetic */ C2136Vz A00;

    public W5(C2136Vz c2136Vz) {
        this.A00 = c2136Vz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2535ep
    public final void AGT() {
        AtomicBoolean atomicBoolean;
        VV vv;
        VV vv2;
        AtomicBoolean atomicBoolean2;
        atomicBoolean = this.A00.A0H;
        atomicBoolean.set(true);
        vv = this.A00.A05;
        if (vv != null) {
            vv2 = this.A00.A05;
            atomicBoolean2 = this.A00.A0G;
            vv2.AFB(atomicBoolean2.get());
        }
    }
}
