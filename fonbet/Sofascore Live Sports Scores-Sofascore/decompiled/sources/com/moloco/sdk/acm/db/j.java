package com.moloco.sdk.acm.db;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j {
    public final MetricsDb_Impl a;
    public final f b;
    public final com.facebook.b c = new com.facebook.b(12);
    public final g d;

    public j(MetricsDb_Impl metricsDb_Impl) {
        this.a = metricsDb_Impl;
        int i = 0;
        this.b = new f(this, metricsDb_Impl, i);
        int i2 = 1;
        new f(this, metricsDb_Impl, i2);
        new g(metricsDb_Impl, i);
        this.d = new g(metricsDb_Impl, i2);
    }

    public final void a(b bVar) {
        MetricsDb_Impl metricsDb_Impl = this.a;
        metricsDb_Impl.assertNotSuspendingTransaction();
        metricsDb_Impl.beginTransaction();
        try {
            this.b.z(bVar);
            metricsDb_Impl.setTransactionSuccessful();
        } finally {
            metricsDb_Impl.endTransaction();
        }
    }
}
