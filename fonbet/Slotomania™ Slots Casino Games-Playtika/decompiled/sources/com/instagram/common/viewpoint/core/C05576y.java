package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05576y implements InterfaceC1125Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C05576y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACm() {
        WT.A00(new C1120Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACq() {
        WT.A00(new C1121Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ADp(C1167Vm c1167Vm) {
        WT.A00(new C1123Tt(this, c1167Vm));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void AEl() {
        WT.A00(new C1119Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1125Tv
    public final void AEq() {
        WT.A00(new C1122Ts(this));
    }
}
