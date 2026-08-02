package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        InterfaceC2472dm interfaceC2472dm;
        int i;
        InterfaceC2472dm interfaceC2472dm2;
        interfaceC2472dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC2472dm.ADc(i);
        interfaceC2472dm2 = this.A00.A0P;
        interfaceC2472dm2.ADA();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        int i;
        boolean z;
        C1689Ek c1689Ek;
        int duration;
        boolean z2;
        int i2;
        InterfaceC2472dm interfaceC2472dm;
        i = this.A00.A0F;
        float f2 = i - f;
        z = this.A00.A0d;
        if (z) {
            duration = 0;
        } else {
            c1689Ek = this.A00.A0S;
            duration = c1689Ek.getDuration();
        }
        float totalForce = f2 + duration;
        z2 = this.A00.A0d;
        if (z2) {
            i2 = this.A00.A0F;
        } else {
            i2 = this.A00.A0E;
        }
        float seenTime = i2;
        float totalForce2 = totalForce / seenTime;
        interfaceC2472dm = this.A00.A0P;
        interfaceC2472dm.AKd(totalForce2);
    }
}
