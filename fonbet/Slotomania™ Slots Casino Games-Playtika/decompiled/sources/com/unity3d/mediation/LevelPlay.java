package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C2545mb;
import com.ironsource.C2597p9;
import com.ironsource.C2670tb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");

        private final String a;

        AdFormat(String str) {
            this.a = str;
        }

        public final String getValue() {
            return this.a;
        }
    }

    private LevelPlay() {
    }

    private final void a(String str) {
        if (StringsKt.equals(str, "do_not_sell", true)) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        List<String> a = C2545mb.c.a();
        if ((a instanceof Collection) && a.isEmpty()) {
            return;
        }
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            if (StringsKt.equals((String) it.next(), str, true)) {
                a(str, "LevelPlayPrivacySettings.setCOPPA()");
                return;
            }
        }
    }

    @JvmStatic
    public static final void addImpressionDataListener(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        C2670tb.a.a(listener);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.0";
    }

    @JvmStatic
    public static final void init(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C2670tb.a.a(context, initRequest, listener);
    }

    @JvmStatic
    public static final void launchTestSuite(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        p.h().c(context);
    }

    @JvmStatic
    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("removing listener: " + listener.getClass().getSimpleName());
        C2670tb.a.b(listener);
    }

    @JvmStatic
    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.h().a(z);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "use LevelPlayPrivacySettings.setGDPRConsents() for GDPR consent management.", replaceWith = @ReplaceWith(expression = "LevelPlayPrivacySettings.setGDPRConsents(networkConsents)", imports = {"com.unity3d.mediation.LevelPlayPrivacySettings"}))
    @JvmStatic
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        p.h().b(z);
    }

    @JvmStatic
    public static final boolean setDynamicUserId(String dynamicUserId) {
        Intrinsics.checkNotNullParameter(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return p.h().b(dynamicUserId);
    }

    @JvmStatic
    public static final void setMetaData(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        INSTANCE.a(key);
        C2670tb.a.a(key, value);
    }

    @JvmStatic
    public static final void setNetworkData(String networkKey, JSONObject networkData) {
        Intrinsics.checkNotNullParameter(networkKey, "networkKey");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        p.h().b(networkKey, networkData);
    }

    @JvmStatic
    public static final void setSegment(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        IronLog.API.info("");
        C2670tb.a.b(segment);
    }

    @JvmStatic
    public static final void validateIntegration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        C2597p9.a.a(context);
    }

    @JvmStatic
    public static final void setMetaData(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        INSTANCE.a(key);
        C2670tb.a.a(key, values);
    }

    private final void a(String str, String str2) {
        IronLog.API.warning("Setting '" + str + "' via setMetaData is deprecated. Use " + str2 + " instead.");
    }
}
