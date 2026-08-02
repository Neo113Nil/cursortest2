package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2165Xf implements ViewpointAction<C2109Uw, V1> {
    public XM A00;

    public C2165Xf(XM xm) {
        this.A00 = xm;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(C3261rN<C2109Uw, V1> c3261rN, InterfaceC3252rD interfaceC3252rD) {
        switch (interfaceC3252rD.A9U(c3261rN)) {
            case A02:
            case A04:
                this.A00.A02(c3261rN, interfaceC3252rD);
                break;
        }
    }
}
