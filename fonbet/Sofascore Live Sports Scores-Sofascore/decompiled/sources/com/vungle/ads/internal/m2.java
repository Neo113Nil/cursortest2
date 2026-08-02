package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class m2 extends h1 {
    public Long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        super(sDKMetricType);
        sDKMetricType.getClass();
    }

    public final void a(Long l) {
        this.c = l;
    }

    public final long c() {
        Long l = this.c;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }
}
