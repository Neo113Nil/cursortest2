package com.vungle.ads.internal.bidding;

import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.GzipEncodeError;
import com.vungle.ads.JsonEncodeError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.l3;
import com.vungle.ads.internal.model.o3;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.network.d0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.cga;
import defpackage.duf;
import defpackage.sha;
import defpackage.yea;
import defpackage.ypa;
import defpackage.ysa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e {
    public final Context a;
    public m2 b;
    public int c;
    public final yea d;
    public long e;

    public e(Context context) {
        context.getClass();
        this.a = context;
        this.b = new m2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUESTED);
        this.d = cga.c(d.a);
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.a(new a(this));
    }

    public final String a() {
        VungleApiClient vungleApiClient = (VungleApiClient) ypa.a(ysa.a, new c(this.a)).getValue();
        ConfigManager.INSTANCE.getClass();
        t1 a = vungleApiClient.a(!ConfigManager.r(), ConfigManager.b());
        o3 o3Var = new o3(a.a(), a.d(), a.b(), new l3(d0.d()), this.c);
        yea yeaVar = this.d;
        return yeaVar.c(sha.Q(yeaVar.b, duf.b(o3.class)), o3Var);
    }

    public final b b() {
        this.c++;
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.b, (s) null, 6);
        try {
            String a = a();
            boolean z = u.a;
            t.a("BidTokenEncoder", "BidToken: " + a);
            try {
                String str = "6:" + q.a(a);
                t.a("BidTokenEncoder", "After conversion: ".concat(str));
                return new b(str, "");
            } catch (Throwable th) {
                StringBuilder a2 = l.a("Fail to gzip token data. ");
                a2.append(th.getLocalizedMessage());
                String sb = a2.toString();
                new GzipEncodeError(sb).logErrorNoReturnValue$vungle_ads_release();
                return new b("", sb);
            }
        } catch (Throwable th2) {
            StringBuilder a3 = l.a("Failed to encode TokenParameters. ");
            a3.append(th2.getLocalizedMessage());
            String sb2 = a3.toString();
            new JsonEncodeError(sb2).logErrorNoReturnValue$vungle_ads_release();
            return new b("", sb2);
        }
    }
}
