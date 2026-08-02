package com.vungle.ads.internal.ui;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.joa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h implements com.vungle.ads.internal.ui.view.f {
    public final /* synthetic */ l a;
    public final /* synthetic */ joa b;

    public h(l lVar, joa joaVar) {
        this.a = lVar;
        this.b = joaVar;
    }

    @Override // com.vungle.ads.internal.ui.view.f
    public final void close() {
        com.vungle.ads.internal.presenter.r rVar = this.a.a;
        Long l = (rVar == null || rVar.j) ? null : 1L;
        if (l != null) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.AD_CLOSED_BEFORE_IMPRESSION, l.longValue(), this.a.e, null, 8);
        }
        r3 r3Var = this.a.b;
        if (r3Var != null) {
            l.a(this.b).b(r3Var);
        }
        this.a.finish();
    }
}
