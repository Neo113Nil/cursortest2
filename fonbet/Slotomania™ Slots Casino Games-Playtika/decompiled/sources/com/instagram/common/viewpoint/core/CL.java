package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC1689gc {
    public final C0673Cb A00;
    public final EnumC1694gh A01;

    public CL(C0673Cb c0673Cb, EnumC1694gh enumC1694gh) {
        this.A00 = c0673Cb;
        this.A01 = enumC1694gh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689gc
    public void A4D(Map<InterfaceC1671gK, EnumC1694gh> map, Map<SyncModifiableBundle, EnumC1681gU> map2) {
        map.put(this.A00, this.A01);
    }
}
