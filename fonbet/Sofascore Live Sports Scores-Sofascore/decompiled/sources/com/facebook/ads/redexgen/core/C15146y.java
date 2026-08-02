package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C15146y implements InterfaceC2082Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C15146y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACm() {
        WT.A00(new C2077Tq(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ACq() {
        WT.A00(new C2078Tr(this));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void ADp(C2124Vm c2124Vm) {
        WT.A00(new C2080Tt(this, c2124Vm));
    }

    @Override // com.facebook.ads.redexgen.core.VP
    public final void AEl() {
        WT.A00(new C2076Tp(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2082Tv
    public final void AEq() {
        WT.A00(new C2079Ts(this));
    }
}
