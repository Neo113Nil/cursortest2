package com.vungle.ads.internal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x implements w {
    public final /* synthetic */ BlockingQueue a;

    public x(LinkedBlockingQueue linkedBlockingQueue) {
        this.a = linkedBlockingQueue;
    }

    @Override // com.vungle.ads.internal.w
    public final void a() {
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Failed to send ");
        a.append(this.a.size());
        a.append(" errors");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", a.toString());
        AnalyticsClient.INSTANCE.getClass();
        AnalyticsClient.a.addAll(this.a);
    }

    @Override // com.vungle.ads.internal.w
    public final void onSuccess() {
        boolean z = com.vungle.ads.internal.util.u.a;
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Sent ");
        a.append(this.a.size());
        a.append(" errors");
        com.vungle.ads.internal.util.t.a("AnalyticsClient", a.toString());
    }
}
