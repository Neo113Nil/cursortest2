package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;

/* loaded from: classes13.dex */
public final class I2 implements H2 {
    private final InterfaceC4538s1 a;
    private final Executor b;

    public I2(InterfaceC4538s1 interfaceC4538s1, Executor executor) {
        this.a = interfaceC4538s1;
        this.b = executor;
    }

    @Override // com.ironsource.H2
    public BannerAdView a(K9 k9, C4331g8 c4331g8, Y1 y1) {
        return new BannerAdView(new P2(k9, c4331g8, y1, this.a, null, null, null, null, null, 496, null));
    }
}
