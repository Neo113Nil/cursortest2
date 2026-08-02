package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.eD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1541eD extends AbstractRunnableC1182Wc {
    public final /* synthetic */ C1691ge A00;

    public C1541eD(C1691ge c1691ge) {
        this.A00 = c1691ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1182Wc
    public final void A07() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
