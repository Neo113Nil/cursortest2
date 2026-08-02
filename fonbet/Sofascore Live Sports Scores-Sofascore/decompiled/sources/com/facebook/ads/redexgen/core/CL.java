package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC2646gc {
    public final C1630Cb A00;
    public final EnumC2651gh A01;

    public CL(C1630Cb c1630Cb, EnumC2651gh enumC2651gh) {
        this.A00 = c1630Cb;
        this.A01 = enumC2651gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2646gc
    public void A4D(Map<InterfaceC2628gK, EnumC2651gh> map, Map<SyncModifiableBundle, EnumC2638gU> map2) {
        map.put(this.A00, this.A01);
    }
}
