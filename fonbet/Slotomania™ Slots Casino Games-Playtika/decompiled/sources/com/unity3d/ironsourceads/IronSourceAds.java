package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.N9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
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

    @JvmStatic
    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.h().a(z);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.0";
    }

    @JvmStatic
    public static final void init(Context context, InitRequest initRequest, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        N9.a.a(context, initRequest, initializationListener);
    }

    @JvmStatic
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        N9.a.b(z);
    }

    @JvmStatic
    public static final void setMetaData(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        N9.a.a(key, value);
    }

    @JvmStatic
    public static final void setMetaData(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        p.h().a(key, values);
    }
}
