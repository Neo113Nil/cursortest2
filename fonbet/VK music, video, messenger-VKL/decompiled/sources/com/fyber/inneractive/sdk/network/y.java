package com.fyber.inneractive.sdk.network;

import android.os.Build;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.O6;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.security.InvalidParameterException;
import java.util.HashMap;

/* loaded from: classes12.dex */
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
        a(str7 == null ? "8.4.5" : str7, O6.V);
        a(com.fyber.inneractive.sdk.util.o.a.getPackageName(), "pkgn");
        if (IAConfigManager.c()) {
            return;
        }
        a(X3.d, "osn");
        a(Build.VERSION.RELEASE, O6.G);
        a(com.fyber.inneractive.sdk.util.k.j(), "model");
        a(com.fyber.inneractive.sdk.util.k.l(), "pkgv");
        a(str, HiAnalyticsConstant.HaKey.BI_KEY_APPID);
        a(str2, "session");
        a(str3, "adnt");
        a(l, "adnt_id");
        a(str4, CampaignEx.JSON_KEY_CREATIVE_ID);
        a(str5, "adomain");
        a(str6, "campaign_id");
    }

    public final void a(Object obj, String str) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        this.b.put(str, obj);
    }
}
