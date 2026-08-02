package com.unity3d.mediation;

import com.ironsource.Ab;
import com.ironsource.C4452n4;
import com.ironsource.C4504q2;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.brm0;
import xsna.dli0;
import xsna.epx;
import xsna.i5s;
import xsna.jgp;
import xsna.n6j;
import xsna.rli0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes14.dex */
public final class LevelPlayAdInfo {
    private final String a;
    private final String b;
    private final String c;
    private final C4504q2 d;
    private final LevelPlayAdSize e;
    private final String f;
    private final Map<String, Object> g;

    public LevelPlayAdInfo(String str, String str2, String str3, C4504q2 c4504q2, LevelPlayAdSize levelPlayAdSize, String str4, Map<String, ? extends Object> map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c4504q2;
        this.e = levelPlayAdSize;
        this.f = str4;
        this.g = map;
    }

    private final String a() {
        return this.a;
    }

    private final String b() {
        return this.b;
    }

    private final String c() {
        return this.c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C4504q2 c4504q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = levelPlayAdInfo.a;
        }
        if ((i & 2) != 0) {
            str2 = levelPlayAdInfo.b;
        }
        if ((i & 4) != 0) {
            str3 = levelPlayAdInfo.c;
        }
        if ((i & 8) != 0) {
            c4504q2 = levelPlayAdInfo.d;
        }
        if ((i & 16) != 0) {
            levelPlayAdSize = levelPlayAdInfo.e;
        }
        if ((i & 32) != 0) {
            str4 = levelPlayAdInfo.f;
        }
        if ((i & 64) != 0) {
            map = levelPlayAdInfo.g;
        }
        String str5 = str4;
        Map map2 = map;
        LevelPlayAdSize levelPlayAdSize2 = levelPlayAdSize;
        String str6 = str3;
        return levelPlayAdInfo.copy(str, str2, str6, c4504q2, levelPlayAdSize2, str5, map2);
    }

    private final C4504q2 d() {
        return this.d;
    }

    private final LevelPlayAdSize e() {
        return this.e;
    }

    private final String f() {
        return this.f;
    }

    private final Map<String, Object> g() {
        return this.g;
    }

    public final LevelPlayAdInfo copy(String str, String str2, String str3, C4504q2 c4504q2, LevelPlayAdSize levelPlayAdSize, String str4, Map<String, ? extends Object> map) {
        return new LevelPlayAdInfo(str, str2, str3, c4504q2, levelPlayAdSize, str4, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return epx.f(this.a, levelPlayAdInfo.a) && epx.f(this.b, levelPlayAdInfo.b) && epx.f(this.c, levelPlayAdInfo.c) && epx.f(this.d, levelPlayAdInfo.d) && epx.f(this.e, levelPlayAdInfo.e) && epx.f(this.f, levelPlayAdInfo.f) && epx.f(this.g, levelPlayAdInfo.g);
    }

    public final String getAb() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("ab");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getAdFormat() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("adFormat");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.c : str;
    }

    public final String getAdId() {
        return this.a;
    }

    public final String getAdNetwork() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("adNetwork");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.e;
    }

    public final String getAdUnitId() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("mediationAdUnitId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.b : str;
    }

    public final String getAdUnitName() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("mediationAdUnitName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getAuctionId() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("auctionId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getCountry() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("country");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getCreativeId() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("creativeId");
        if (!(opt instanceof String)) {
            opt = null;
        }
        String str = (String) opt;
        if (str != null) {
            return str;
        }
        Object obj = this.g.get("creativeId");
        String str2 = obj instanceof String ? (String) obj : null;
        return str2 == null ? "" : str2;
    }

    public final String getEncryptedCPM() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("encryptedCPM");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("precision");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Double valueOf = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : Double.valueOf(m.optDouble("revenue"));
        return (epx.b(valueOf, Double.NaN) || valueOf == null) ? ConnectivityTracker.DEFAULT_UPLINK_BITRATE : valueOf.doubleValue();
    }

    public final String getInstanceId() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("instanceId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getInstanceName() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("instanceName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getPlacementName() {
        String str = this.f;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        Ab d;
        String c;
        C4504q2 c4504q2 = this.d;
        return (c4504q2 == null || (d = c4504q2.d()) == null || (c = d.c()) == null) ? getImpressionPrecision$mediationsdk_release() : c;
    }

    public final double getRevenue() {
        Ab d;
        C4504q2 c4504q2 = this.d;
        return (c4504q2 == null || (d = c4504q2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : d.d();
    }

    public final String getSegmentName() {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        Object opt = (c4504q2 == null || (m = c4504q2.m()) == null) ? null : m.opt("segmentName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        C4504q2 c4504q2 = this.d;
        int hashCode = (a + (c4504q2 == null ? 0 : c4504q2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.e;
        int hashCode2 = (hashCode + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f;
        return this.g.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x002f -> B:8:0x0042). Please report as a decompilation issue!!! */
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject m;
        try {
            C4504q2 c4504q2 = this.d;
            jSONObject = (c4504q2 == null || (m = c4504q2.m()) == null) ? new JSONObject() : new JSONObject(m, (String[]) rli0.A(dli0.c(m.keys())).toArray(new String[0]));
        } catch (Exception e) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e);
            C4452n4.d().a(e);
            jSONObject = new JSONObject();
        }
        try {
            String optString = jSONObject.optString("placement");
            if (optString.length() > 0 && (str = this.f) != null) {
                jSONObject.put("placement", brm0.y(optString, d.r, str));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("failed to put impression values", e2);
            C4452n4.d().a(e2);
        }
        return jSONObject;
    }

    public String toString() {
        String adId = getAdId();
        String adUnitId = getAdUnitId();
        String adUnitName = getAdUnitName();
        LevelPlayAdSize levelPlayAdSize = this.e;
        String adFormat = getAdFormat();
        String placementName = getPlacementName();
        String auctionId = getAuctionId();
        String country = getCountry();
        String ab = getAb();
        String segmentName = getSegmentName();
        String adNetwork = getAdNetwork();
        String instanceName = getInstanceName();
        String instanceId = getInstanceId();
        double revenue = getRevenue();
        String precision = getPrecision();
        String encryptedCPM = getEncryptedCPM();
        String creativeId = getCreativeId();
        StringBuilder a = xe9.a("adId: ", adId, ", adUnitId: ", adUnitId, ", adUnitName: ");
        a.append(adUnitName);
        a.append(", adSize: ");
        a.append(levelPlayAdSize);
        a.append(", adFormat: ");
        n6j.b(a, adFormat, ", placementName: ", placementName, ", auctionId: ");
        n6j.b(a, auctionId, ", country: ", country, ", ab: ");
        n6j.b(a, ab, ", segmentName: ", segmentName, ", adNetwork: ");
        n6j.b(a, adNetwork, ", instanceName: ", instanceName, ", instanceId: ");
        a.append(instanceId);
        a.append(", revenue: ");
        a.append(revenue);
        n6j.b(a, ", precision: ", precision, ", encryptedCPM: ", encryptedCPM);
        return i5s.a(a, ", creativeId: ", creativeId);
    }

    private final <T> T a(String str) {
        JSONObject m;
        C4504q2 c4504q2 = this.d;
        if (c4504q2 != null && (m = c4504q2.m()) != null) {
            m.opt(str);
        }
        epx.k();
        throw null;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C4504q2 c4504q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : c4504q2, (i & 16) != 0 ? null : levelPlayAdSize, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? jgp.b : map);
    }

    public LevelPlayAdInfo(LevelPlayAdInfo levelPlayAdInfo, String str) {
        this(levelPlayAdInfo.a, levelPlayAdInfo.b, levelPlayAdInfo.c, levelPlayAdInfo.d, levelPlayAdInfo.e, str, levelPlayAdInfo.g);
    }
}
