package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y {
    public final String a;
    public final HashMap b;
    public String c;

    public y(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7) {
        String a;
        int i = com.fyber.inneractive.sdk.config.k.a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            a = "https://" + IAConfigManager.N.i.f;
        } else {
            a = com.fyber.inneractive.sdk.config.a.a(property, "Event");
        }
        this.c = null;
        if (TextUtils.isEmpty(a)) {
            throw new InvalidParameterException();
        }
        this.b = new HashMap();
        this.a = a;
        a(str7 == null ? "8.4.5" : str7, L6.V);
        a(com.fyber.inneractive.sdk.util.o.a.getPackageName(), "pkgn");
        if (IAConfigManager.c()) {
            return;
        }
        a(U3.d, "osn");
        a(Build.VERSION.RELEASE, L6.G);
        a(com.fyber.inneractive.sdk.util.k.j(), L6.B);
        a(com.fyber.inneractive.sdk.util.k.l(), "pkgv");
        a(str, "appid");
        a(str2, "session");
        a(str3, "adnt");
        a(l, "adnt_id");
        a(str4, CampaignEx.JSON_KEY_CREATIVE_ID);
        a(str5, "adomain");
        a(str6, Payload.CAMPAIGN_ID);
    }

    public final void a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
