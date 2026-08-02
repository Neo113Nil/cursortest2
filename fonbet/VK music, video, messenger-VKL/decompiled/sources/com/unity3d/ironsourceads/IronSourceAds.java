package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.O9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.util.List;

/* loaded from: classes14.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");

        private final String a;

        AdFormat(String str) {
            this.a = str;
        }

        public final String getValue() {
            return this.a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.h().a(z);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.3";
    }

    public static final void init(Context context, InitRequest initRequest, InitListener initListener) {
        O9.a.a(context, initRequest, initListener);
    }

    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        O9.a.b(z);
    }

    public static final void setMetaData(String str, String str2) {
        IronLog.API.info("key = " + str + ", value = " + str2);
        O9.a.a(str, str2);
    }

    public static final void setMetaData(String str, List<String> list) {
        IronLog.API.info("key = " + str + ", values = " + list);
        p.h().a(str, list);
    }
}
