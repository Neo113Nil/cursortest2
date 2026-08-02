package com.vungle.ads.internal;

import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.util.PathProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c2 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public c2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new com.vungle.ads.internal.network.r((VungleApiClient) this.b.a(VungleApiClient.class), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).a, ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).c, (PathProvider) this.b.a(PathProvider.class), (com.vungle.ads.internal.signals.j) this.b.a(com.vungle.ads.internal.signals.j.class));
    }
}
