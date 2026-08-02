package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C4459nb;
import com.ironsource.C4511q9;
import com.ironsource.C4584ub;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.p;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import xsna.brm0;
import xsna.ozl;
import xsna.ss9;

/* loaded from: classes14.dex */
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
        if (brm0.w(str, "do_not_sell", true)) {
            a(str, "LevelPlayPrivacySettings.setCCPA()");
            return;
        }
        List<String> a = C4459nb.c.a();
        if ((a instanceof Collection) && a.isEmpty()) {
            return;
        }
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            if (brm0.w((String) it.next(), str, true)) {
                a(str, "LevelPlayPrivacySettings.setCOPPA()");
                return;
            }
        }
    }

    public static final void addImpressionDataListener(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("adding listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C4584ub.a.a(levelPlayImpressionDataListener);
    }

    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.4.3";
    }

    public static final void init(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        C4584ub.a.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    public static final void launchTestSuite(Context context) {
        IronLog.API.info("");
        p.h().c(context);
    }

    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        IronLog.API.info("removing listener: ".concat(levelPlayImpressionDataListener.getClass().getSimpleName()));
        C4584ub.a.b(levelPlayImpressionDataListener);
    }

    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        p.h().a(z);
    }

    @ozl
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        p.h().b(z);
    }

    public static final boolean setDynamicUserId(String str) {
        IronLog.API.info("dynamicUserId: ".concat(str));
        return p.h().b(str);
    }

    public static final void setMetaData(String str, String str2) {
        IronLog.API.info("key = " + str + ", value = " + str2);
        INSTANCE.a(str);
        C4584ub.a.a(str, str2);
    }

    public static final void setNetworkData(String str, JSONObject jSONObject) {
        IronLog.API.info("networkKey = " + str + ", networkData = " + jSONObject);
        p.h().b(str, jSONObject);
    }

    public static final void setSegment(LevelPlaySegment levelPlaySegment) {
        IronLog.API.info("");
        C4584ub.a.b(levelPlaySegment);
    }

    public static final void validateIntegration(Context context) {
        IronLog.API.info("");
        C4511q9.a.a(context);
    }

    public static final void setMetaData(String str, List<String> list) {
        IronLog.API.info("key = " + str + ", values = " + list);
        INSTANCE.a(str);
        C4584ub.a.a(str, list);
    }

    private final void a(String str, String str2) {
        IronLog.API.warning(ss9.a("Setting '", str, "' via setMetaData is deprecated. Use ", str2, " instead."));
    }
}
