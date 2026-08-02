package com.vungle.ads.internal;

import com.vungle.ads.internal.util.PathProvider;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z1 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ServiceLocator serviceLocator) {
        super(false);
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final com.vungle.ads.internal.downloader.h a() {
        return new com.vungle.ads.internal.downloader.h(((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).f, (PathProvider) this.b.a(PathProvider.class));
    }
}
