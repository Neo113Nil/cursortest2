package com.instagram.common.viewpoint.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC1689gc {
    public final EnumC1681gU A00;
    public final AbstractC04362d A01;

    public CM(AbstractC04362d abstractC04362d, EnumC1681gU enumC1681gU) {
        this.A01 = abstractC04362d;
        this.A00 = enumC1681gU;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1689gc
    public void A4D(Map<InterfaceC1671gK, EnumC1694gh> map, Map<SyncModifiableBundle, EnumC1681gU> map2) {
        map2.put(null, this.A00);
    }
}
