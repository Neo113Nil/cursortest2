package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        InterfaceC1515dm interfaceC1515dm;
        int i;
        InterfaceC1515dm interfaceC1515dm2;
        interfaceC1515dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC1515dm.ADc(i);
        interfaceC1515dm2 = this.A00.A0P;
        interfaceC1515dm2.ADA();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        int i;
        boolean z;
        C0732Ek c0732Ek;
        int duration;
        boolean z2;
        int i2;
        InterfaceC1515dm interfaceC1515dm;
        i = this.A00.A0F;
        float f2 = i - f;
        z = this.A00.A0d;
        if (z) {
            duration = 0;
        } else {
            c0732Ek = this.A00.A0S;
            duration = c0732Ek.getDuration();
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
        interfaceC1515dm = this.A00.A0P;
        interfaceC1515dm.AKd(totalForce2);
    }
}
