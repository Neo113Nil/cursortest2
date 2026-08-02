package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.joa;
import defpackage.wem;
import defpackage.ypa;
import defpackage.ysa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z2 {
    public static void a(Context context, BidTokenCallback bidTokenCallback) {
        context.getClass();
        bidTokenCallback.getClass();
        if (com.vungle.ads.internal.util.z.a()) {
            new SdkVersionTooLow("RTB: SDK is supported only for API versions 25 and above.").logErrorNoReturnValue$vungle_ads_release();
            bidTokenCallback.onBidTokenError("RTB: SDK is supported only for API versions 25 and above.");
            return;
        }
        if (!VungleAds.INSTANCE.isInitialized()) {
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            privacyManager.a(applicationContext);
        }
        ysa ysaVar = ysa.a;
        ((com.vungle.ads.internal.executor.d) ypa.a(ysaVar, new y2(context)).getValue()).a().execute(new wem(21, bidTokenCallback, ypa.a(ysaVar, new x2(context))));
    }

    public static final void a(BidTokenCallback bidTokenCallback, joa joaVar) {
        bidTokenCallback.getClass();
        joaVar.getClass();
        n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_RESPONSE_DURATION_MS);
        n2Var.e();
        com.vungle.ads.internal.bidding.b b = ((com.vungle.ads.internal.bidding.e) joaVar.getValue()).b();
        n2Var.d();
        if (b.a().length() > 0) {
            bidTokenCallback.onBidTokenCollected(b.a());
        } else {
            n2Var.a(Sdk.SDKMetric.SDKMetricType.BID_TOKEN_REQUEST_TO_FAIL_DURATION_MS);
            n2Var.a(b.b());
            bidTokenCallback.onBidTokenError(b.b());
        }
        AnalyticsClient.a(AnalyticsClient.INSTANCE, n2Var, (com.vungle.ads.internal.util.s) null, 6);
    }
}
