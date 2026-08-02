package com.unity3d.mediation;

import com.ironsource.C2556n4;
import com.ironsource.C2608q2;
import com.ironsource.C2778zb;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class LevelPlayAdInfo {
    private final String a;
    private final String b;
    private final String c;
    private final C2608q2 d;
    private final LevelPlayAdSize e;
    private final String f;
    private final Map<String, Object> g;

    public LevelPlayAdInfo(String adId, String adUnitId, String adFormat, C2608q2 c2608q2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        this.a = adId;
        this.b = adUnitId;
        this.c = adFormat;
        this.d = c2608q2;
        this.e = levelPlayAdSize;
        this.f = str;
        this.g = adapterData;
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

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C2608q2 c2608q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, Object obj) {
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
            c2608q2 = levelPlayAdInfo.d;
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
        return levelPlayAdInfo.copy(str, str2, str6, c2608q2, levelPlayAdSize2, str5, map2);
    }

    private final C2608q2 d() {
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

    public final LevelPlayAdInfo copy(String adId, String adUnitId, String adFormat, C2608q2 c2608q2, LevelPlayAdSize levelPlayAdSize, String str, Map<String, ? extends Object> adapterData) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        return new LevelPlayAdInfo(adId, adUnitId, adFormat, c2608q2, levelPlayAdSize, str, adapterData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return Intrinsics.areEqual(this.a, levelPlayAdInfo.a) && Intrinsics.areEqual(this.b, levelPlayAdInfo.b) && Intrinsics.areEqual(this.c, levelPlayAdInfo.c) && Intrinsics.areEqual(this.d, levelPlayAdInfo.d) && Intrinsics.areEqual(this.e, levelPlayAdInfo.e) && Intrinsics.areEqual(this.f, levelPlayAdInfo.f) && Intrinsics.areEqual(this.g, levelPlayAdInfo.g);
    }

    public final String getAdId() {
        return this.a;
    }

    public final LevelPlayAdSize getAdSize() {
        return this.e;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Double valueOf = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : Double.valueOf(m.optDouble("revenue"));
        if (Intrinsics.areEqual(valueOf, Double.NaN) || valueOf == null) {
            return 0.0d;
        }
        return valueOf.doubleValue();
    }

    public final String getPlacementName() {
        String str = this.f;
        return str == null ? "" : str;
    }

    public final String getPrecision() {
        C2778zb d;
        String c;
        C2608q2 c2608q2 = this.d;
        return (c2608q2 == null || (d = c2608q2.d()) == null || (c = d.c()) == null) ? getImpressionPrecision$mediationsdk_release() : c;
    }

    public final double getRevenue() {
        C2778zb d;
        C2608q2 c2608q2 = this.d;
        return (c2608q2 == null || (d = c2608q2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : d.d();
    }

    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        C2608q2 c2608q2 = this.d;
        int hashCode2 = (hashCode + (c2608q2 == null ? 0 : c2608q2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.e;
        int hashCode3 = (hashCode2 + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0033 -> B:8:0x0046). Please report as a decompilation issue!!! */
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject m;
        try {
            C2608q2 c2608q2 = this.d;
            if (c2608q2 == null || (m = c2608q2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> keys = m.keys();
                Intrinsics.checkNotNullExpressionValue(keys, "it.keys()");
                jSONObject = new JSONObject(m, (String[]) SequencesKt.toList(SequencesKt.asSequence(keys)).toArray(new String[0]));
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e);
            C2556n4.d().a(e);
            jSONObject = new JSONObject();
        }
        try {
            String placement = jSONObject.optString("placement");
            Intrinsics.checkNotNullExpressionValue(placement, "placement");
            if (placement.length() > 0 && (str = this.f) != null) {
                jSONObject.put("placement", StringsKt.replace$default(placement, d.r, str, false, 4, (Object) null));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("failed to put impression values", e2);
            C2556n4.d().a(e2);
        }
        return jSONObject;
    }

    public String toString() {
        return "adId: " + getAdId() + ", adUnitId: " + getAdUnitId() + ", adUnitName: " + getAdUnitName() + ", adSize: " + this.e + ", adFormat: " + getAdFormat() + ", placementName: " + getPlacementName() + ", auctionId: " + getAuctionId() + ", country: " + getCountry() + ", ab: " + getAb() + ", segmentName: " + getSegmentName() + ", adNetwork: " + getAdNetwork() + ", instanceName: " + getInstanceName() + ", instanceId: " + getInstanceId() + ", revenue: " + getRevenue() + ", precision: " + getPrecision() + ", encryptedCPM: " + getEncryptedCPM() + ", creativeId: " + getCreativeId();
    }

    private final /* synthetic */ <T> T a(String str) {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        T t = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : (T) m.opt(str);
        Intrinsics.reifiedOperationMarker(2, "T");
        return t;
    }

    public /* synthetic */ LevelPlayAdInfo(String str, String str2, String str3, C2608q2 c2608q2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : c2608q2, (i & 16) != 0 ? null : levelPlayAdSize, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? MapsKt.emptyMap() : map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(LevelPlayAdInfo adInfo, String str) {
        this(adInfo.a, adInfo.b, adInfo.c, adInfo.d, adInfo.e, str, adInfo.g);
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
    }

    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("precision");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getCreativeId() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("creativeId");
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
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("encryptedCPM");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getInstanceId() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("instanceId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getInstanceName() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("instanceName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getAdNetwork() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("adNetwork");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getSegmentName() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("segmentName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getAb() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("ab");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getCountry() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("country");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getAuctionId() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("auctionId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getAdFormat() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("adFormat");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.c : str;
    }

    public final String getAdUnitName() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("mediationAdUnitName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final String getAdUnitId() {
        JSONObject m;
        C2608q2 c2608q2 = this.d;
        Object opt = (c2608q2 == null || (m = c2608q2.m()) == null) ? null : m.opt("mediationAdUnitId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.b : str;
    }
}
