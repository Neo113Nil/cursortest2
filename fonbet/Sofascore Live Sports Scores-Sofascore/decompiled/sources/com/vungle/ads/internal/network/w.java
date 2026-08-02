package com.vungle.ads.internal.network;

import com.vungle.ads.UserAgentError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.n2;
import defpackage.yn3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w implements yn3 {
    public final /* synthetic */ VungleApiClient a;
    public final /* synthetic */ n2 b;

    public w(VungleApiClient vungleApiClient, n2 n2Var) {
        this.a = vungleApiClient;
        this.b = n2Var;
    }

    @Override // defpackage.yn3
    public final void accept(Object obj) {
        String str;
        String str2 = (String) obj;
        if ((str2 == null || str2.length() == 0) && ((str = this.a.i) == null || str.length() == 0)) {
            ((com.vungle.ads.internal.platform.c) this.a.b).getClass();
            str2 = System.getProperty("http.agent");
        }
        if (str2 == null || str2.length() == 0) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.b("VungleApiClient", "All UA sources failed, logging USER_AGENT_ERROR");
            new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
        } else {
            this.b.d();
            AnalyticsClient.a(AnalyticsClient.INSTANCE, this.b, (com.vungle.ads.internal.util.s) null, 6);
            this.a.i = str2;
        }
    }
}
