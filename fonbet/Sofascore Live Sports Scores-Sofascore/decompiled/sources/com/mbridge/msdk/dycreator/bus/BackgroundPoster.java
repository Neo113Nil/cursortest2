package com.mbridge.msdk.dycreator.bus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
final class BackgroundPoster implements Runnable {
    private final PendingPostQueue a = new PendingPostQueue();
    private volatile boolean b;
    private final EventBus c;

    public BackgroundPoster(EventBus eventBus) {
        this.c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost a = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.a.a(a);
                if (!this.b) {
                    this.b = true;
                    EventBus.n.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost a = this.a.a(1000);
                    if (a == null) {
                        synchronized (this) {
                            a = this.a.a();
                            if (a == null) {
                                this.b = false;
                                this.b = false;
                                return;
                            }
                        }
                    }
                    this.c.a(a);
                } catch (InterruptedException unused) {
                    Thread.currentThread().getName();
                    this.b = false;
                    return;
                }
            } catch (Throwable th) {
                this.b = false;
                throw th;
            }
        }
    }
}
