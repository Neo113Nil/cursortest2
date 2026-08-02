package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class n2 extends h1 {
    public Long c;
    public Long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        sDKMetricType.getClass();
        sDKMetricType.getClass();
    }

    public final long c() {
        long nanoTime = System.nanoTime();
        Long l = this.d;
        long longValue = l != null ? l.longValue() : nanoTime;
        Long l2 = this.c;
        if (l2 != null) {
            nanoTime = l2.longValue();
        }
        return (longValue - nanoTime) / 1000000;
    }

    public void d() {
        this.d = Long.valueOf(System.nanoTime());
    }

    public void e() {
        this.c = Long.valueOf(System.nanoTime());
    }
}
