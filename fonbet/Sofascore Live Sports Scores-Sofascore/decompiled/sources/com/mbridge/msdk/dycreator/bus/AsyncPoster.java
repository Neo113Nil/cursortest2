package com.mbridge.msdk.dycreator.bus;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
class AsyncPoster implements Runnable {
    private final PendingPostQueue a = new PendingPostQueue();
    private final EventBus b;

    public AsyncPoster(EventBus eventBus) {
        this.b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.a.a(PendingPost.a(subscription, obj));
        EventBus.n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost a = this.a.a();
        if (a != null) {
            this.b.a(a);
        } else {
            a70.r("No pending post available");
        }
    }
}
