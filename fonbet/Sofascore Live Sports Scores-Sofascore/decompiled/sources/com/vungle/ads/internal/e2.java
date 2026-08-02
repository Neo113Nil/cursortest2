package com.vungle.ads.internal;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e2 extends w1 {
    public final /* synthetic */ ServiceLocator b;

    public e2(ServiceLocator serviceLocator) {
        this.b = serviceLocator;
    }

    @Override // com.vungle.ads.internal.w1
    public final Object a() {
        return new com.vungle.ads.internal.task.s((com.vungle.ads.internal.task.e) this.b.a(com.vungle.ads.internal.task.e.class), ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) this.b.a(com.vungle.ads.internal.executor.a.class))).c, new com.vungle.ads.internal.task.i());
    }
}
