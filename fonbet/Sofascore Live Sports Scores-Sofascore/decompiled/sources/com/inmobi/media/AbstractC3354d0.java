package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.U3;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3354d0 {
    public static void a(String str, String str2, AdResponse adResponse, C3906y9 c3906y9) {
        adResponse.getClass();
        if (c3906y9 == null) {
            return;
        }
        try {
            int i = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String requestId = adResponse.getRequestId();
            requestId.getClass();
            Xh xh = c3906y9.a;
            if (xh != null) {
                xh.a("requestID", requestId);
            }
            String valueOf = String.valueOf(adResponse.getPlacementId());
            valueOf.getClass();
            Xh xh2 = c3906y9.a;
            if (xh2 != null) {
                xh2.a("placementID", valueOf);
            }
            String valueOf2 = String.valueOf(str);
            Xh xh3 = c3906y9.a;
            if (xh3 != null) {
                xh3.a("adType", valueOf2);
            }
            String valueOf3 = String.valueOf(str2);
            Xh xh4 = c3906y9.a;
            if (xh4 != null) {
                xh4.a("placementType", valueOf3);
            }
            String valueOf4 = String.valueOf(E1.a);
            Xh xh5 = c3906y9.a;
            if (xh5 != null) {
                xh5.a("bundleID", valueOf4);
            }
            F5.a.getClass();
            String str3 = (String) F5.j.b;
            str3.getClass();
            Xh xh6 = c3906y9.a;
            if (xh6 != null) {
                xh6.a(U3.j.n, str3);
            }
            String o = F5.o();
            o.getClass();
            Xh xh7 = c3906y9.a;
            if (xh7 != null) {
                xh7.a("networkType", o);
            }
            String str4 = Build.MODEL;
            str4.getClass();
            Xh xh8 = c3906y9.a;
            if (xh8 != null) {
                xh8.a("deviceModel", str4);
            }
            String valueOf5 = String.valueOf(AbstractC3424fj.c);
            Xh xh9 = c3906y9.a;
            if (xh9 != null) {
                xh9.a("publisherID", valueOf5);
            }
            Xh xh10 = c3906y9.a;
            if (xh10 != null) {
                xh10.a("sdkVersion", "11.3.0");
            }
            String valueOf6 = String.valueOf(AbstractC3450gj.b);
            Xh xh11 = c3906y9.a;
            if (xh11 != null) {
                xh11.a("tpName", valueOf6);
            }
            String valueOf7 = String.valueOf(AbstractC3450gj.a);
            Xh xh12 = c3906y9.a;
            if (xh12 != null) {
                xh12.a("tpVersion", valueOf7);
            }
            Xh xh13 = c3906y9.a;
            if (xh13 != null) {
                xh13.a("source", "sdk_android");
            }
            String a = AbstractC3450gj.a();
            a.getClass();
            Xh xh14 = c3906y9.a;
            if (xh14 != null) {
                xh14.a("mkVersion", a);
            }
            String c = AbstractC3424fj.c();
            c.getClass();
            Xh xh15 = c3906y9.a;
            if (xh15 != null) {
                xh15.a("webViewUserAgent", c);
            }
            String valueOf8 = String.valueOf(adSet.getIsPod());
            valueOf8.getClass();
            Xh xh16 = c3906y9.a;
            if (xh16 != null) {
                xh16.a("sdkAdPod", valueOf8);
            }
            String valueOf9 = String.valueOf(adSet.getLogEnabled());
            valueOf9.getClass();
            Xh xh17 = c3906y9.a;
            if (xh17 != null) {
                xh17.a("isServerSideLogging", valueOf9);
            }
            String transactionId = adSet.getTransactionId();
            if (transactionId == null) {
                transactionId = "Not Set";
            }
            Xh xh18 = c3906y9.a;
            if (xh18 != null) {
                xh18.a("transactionID", transactionId);
            }
            String a2 = a();
            a2.getClass();
            Xh xh19 = c3906y9.a;
            if (xh19 != null) {
                xh19.a("configData", a2);
            }
            if (adSet.getIsPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c3906y9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i2 = i + 1;
                        if (i < 0) {
                            kotlin.collections.b.q();
                            throw null;
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i, ad.getCreativeId());
                        arrayList2.add(i, ad.getImpressionId());
                        i = i2;
                    }
                    String f0 = CollectionsKt.f0(arrayList, " , ", null, null, null, 62);
                    Xh xh20 = c3906y9.a;
                    if (xh20 != null) {
                        xh20.a("creativeID", f0);
                    }
                    String f02 = CollectionsKt.f0(arrayList2, " , ", null, null, null, 62);
                    Xh xh21 = c3906y9.a;
                    if (xh21 != null) {
                        xh21.a("impressionID", f02);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c3906y9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad2 = adSet.getAds().get(0);
                String creativeId = ad2.getCreativeId();
                creativeId.getClass();
                Xh xh22 = c3906y9.a;
                if (xh22 != null) {
                    xh22.a("creativeID", creativeId);
                }
                String impressionId = ad2.getImpressionId();
                impressionId.getClass();
                Xh xh23 = c3906y9.a;
                if (xh23 != null) {
                    xh23.a("impressionID", impressionId);
                }
            }
        } catch (JSONException e) {
            c3906y9.a("AdLogResponseHandler", "error while update vitals", e);
        }
        a(adResponse, c3906y9);
    }

    public static void a(AdResponse adResponse, C3906y9 c3906y9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c3906y9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c3906y9.a(logEnabled);
        } catch (JSONException e) {
            c3906y9.a("AdLogResponseHandler", "error while setting server-side lever", e);
            c3906y9.a(false);
        }
    }

    public static String a() {
        JSONObject jSONObject = new JSONObject();
        C3694q4 c3694q4 = AbstractC3435g4.a;
        jSONObject.put("root", ((RootConfig) c3694q4.a(RootConfig.class)).getLastUpdateTimeStamp());
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, ((AdConfig) c3694q4.a(AdConfig.class)).getLastUpdateTimeStamp());
        jSONObject.put("telemetry", ((TelemetryConfig) c3694q4.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        jSONObject.put("crashReporting", ((CrashConfig) c3694q4.a(CrashConfig.class)).getLastUpdateTimeStamp());
        jSONObject.put("signals", ((SignalsConfig) c3694q4.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }
}
