package com.vungle.ads.internal.load;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e {
    public final /* synthetic */ g a;
    public final /* synthetic */ h0 b;

    public e(g gVar, h0 h0Var) {
        this.a = gVar;
        this.b = h0Var;
    }

    public final void a() {
        this.a.w.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        g gVar = this.a;
        AnalyticsClient.a(analyticsClient, gVar.w, gVar.x, 4);
        boolean z = u.a;
        t.b("BaseAdLoader", "fail to load ad");
        this.a.i();
        a aVar = this.a.j;
        if (aVar != null) {
            aVar.onSuccess(this.b);
        }
    }

    public final void b() {
        this.a.w.d();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        g gVar = this.a;
        AnalyticsClient.a(analyticsClient, gVar.w, gVar.x, 4);
        this.a.i();
        a aVar = this.a.j;
        if (aVar != null) {
            aVar.onSuccess(this.b);
        }
    }
}
