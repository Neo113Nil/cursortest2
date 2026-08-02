package com.vungle.ads.internal;

import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m1 implements c1 {
    public final /* synthetic */ r1 a;

    public m1(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // com.vungle.ads.internal.c1
    public final void onImpression(View view) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "ImpressionTracker checked the native ad view become visible.");
        r1 r1Var = this.a;
        r1Var.getClass();
        r1.a(r1Var, "checkpoint.0");
        r1Var.a(11, (Map) null);
        r1 r1Var2 = this.a;
        long j = r1Var2.r.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = Long.valueOf(j);
        AnalyticsClient.a(analyticsClient, m2Var, r1Var2.m, 4);
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "Log metric AD_VISIBILITY: " + j);
    }

    @Override // com.vungle.ads.internal.c1
    public final void onViewInvisible(View view) {
        if (this.a.r.getAndSet(true)) {
            return;
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("NativeAdInternal", "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        m2Var.c = 1L;
        AnalyticsClient.a(analyticsClient, m2Var, this.a.m, 4);
    }
}
