package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4270q9;
import com.ironsource.C4289rb;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import defpackage.bf3;
import defpackage.wx4;
import java.util.Iterator;
import java.util.List;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlay {

    @NotNull
    public static final LevelPlay INSTANCE = new LevelPlay();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


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

    private LevelPlay() {
    }

    private final void a(String str) {
        if (c.o(str, com.ironsource.mediationsdk.metadata.a.a, true)) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        List<String> list = com.ironsource.mediationsdk.metadata.a.g;
        list.getClass();
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (c.o((String) it.next(), str, true)) {
                    a(str, "LevelPlayPrivacySettings.setCOPPA()");
                    return;
                }
            }
        }
    }

    @wx4
    public static final void addImpressionDataListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        IronLog.API.info("adding listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C4289rb.a.a(levelPlayImpressionDataListener);
    }

    public static final void addImpressionLevelRevenueListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener, @NotNull String str) {
        levelPlayImpressionDataListener.getClass();
        str.getClass();
        IronLog.API.info("adding listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C4289rb.a.a(levelPlayImpressionDataListener, str);
    }

    @NotNull
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.5.0";
    }

    public static final void init(@NotNull Context context, @NotNull LevelPlayInitRequest levelPlayInitRequest, @NotNull LevelPlayInitListener levelPlayInitListener) {
        context.getClass();
        levelPlayInitRequest.getClass();
        levelPlayInitListener.getClass();
        C4289rb.a.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public static final void launchTestSuite(@NotNull Context context) {
        context.getClass();
        IronLog.API.info("");
        p.g().c(context);
    }

    @wx4
    public static final void removeImpressionDataListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        IronLog.API.info("removing listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C4289rb.a.b(levelPlayImpressionDataListener);
    }

    public static final void removeImpressionLevelRevenueListener(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        levelPlayImpressionDataListener.getClass();
        IronLog.API.info("removing subscriber listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C4289rb.a.c(levelPlayImpressionDataListener);
    }

    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.g().a(z);
    }

    @wx4
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        p.g().b(z);
    }

    public static final boolean setDynamicUserId(@NotNull String str) {
        str.getClass();
        IronLog.API.info("dynamicUserId: " + str);
        return p.g().b(str);
    }

    public static final void setMetaData(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        IronLog.API.info("key = " + str + ", value = " + str2);
        INSTANCE.a(str);
        C4289rb.a.a(str, str2);
    }

    public static final void setNetworkData(@NotNull String str, @NotNull JSONObject jSONObject) {
        str.getClass();
        jSONObject.getClass();
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        p.g().b(str, jSONObject);
    }

    public static final void setSegment(@NotNull LevelPlaySegment levelPlaySegment) {
        levelPlaySegment.getClass();
        IronLog.API.info("");
        C4289rb.a.b(levelPlaySegment);
    }

    public static final void validateIntegration(@NotNull Context context) {
        context.getClass();
        IronLog.API.info("");
        C4270q9.a.a(context);
    }

    public static final void setMetaData(@NotNull String str, @NotNull List<String> list) {
        str.getClass();
        list.getClass();
        IronLog.API.info("key = " + str + ", values = " + list);
        INSTANCE.a(str);
        C4289rb.a.a(str, list);
    }

    private final void a(String str, String str2) {
        IronLog.API.warning(bf3.k("Setting '", str, "' via setMetaData is deprecated. Use ", str2, " instead."));
    }
}
