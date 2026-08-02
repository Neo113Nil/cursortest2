package com.ironsource;

import com.ironsource.sdk.IronSourceNetwork;

/* renamed from: com.ironsource.vc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4603vc implements InterfaceC4585uc {
    @Override // com.ironsource.InterfaceC4585uc
    public void a(K9 k9, C4621wc c4621wc) {
        IronSourceNetwork.loadAd(k9, c4621wc.a());
    }

    @Override // com.ironsource.InterfaceC4585uc
    public String a() {
        return IronSourceNetwork.getVersion();
    }
}
