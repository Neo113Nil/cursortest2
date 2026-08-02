package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC2646gc {
    public final EnumC2638gU A00;
    public final AbstractC13932d A01;

    public CM(AbstractC13932d abstractC13932d, EnumC2638gU enumC2638gU) {
        this.A01 = abstractC13932d;
        this.A00 = enumC2638gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2646gc
    public void A4D(Map<InterfaceC2628gK, EnumC2651gh> map, Map<SyncModifiableBundle, EnumC2638gU> map2) {
        map2.put(null, this.A00);
    }
}
