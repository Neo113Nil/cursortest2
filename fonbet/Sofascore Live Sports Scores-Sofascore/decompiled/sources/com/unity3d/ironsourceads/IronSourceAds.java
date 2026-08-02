package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.N9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class IronSourceAds {

    @NotNull
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        @NotNull
        private final String a;

        AdFormat(String str) {
            this.a = str;
        }

        @NotNull
        public final String getValue() {
            return this.a;
        }
    }

    private IronSourceAds() {
    }

    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.g().a(z);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.5.0";
    }

    public static final void init(@NotNull Context context, @NotNull InitRequest initRequest, @NotNull InitListener initListener) {
        context.getClass();
        initRequest.getClass();
        initListener.getClass();
        N9.a.a(context, initRequest, initListener);
    }

    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        N9.a.b(z);
    }

    public static final void setMetaData(@NotNull String str, @NotNull List<String> list) {
        str.getClass();
        list.getClass();
        IronLog.API.info("key = " + str + ", values = " + list);
        p.g().a(str, list);
    }

    public static final void setMetaData(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        IronLog.API.info("key = " + str + ", value = " + str2);
        N9.a.a(str, str2);
    }
}
