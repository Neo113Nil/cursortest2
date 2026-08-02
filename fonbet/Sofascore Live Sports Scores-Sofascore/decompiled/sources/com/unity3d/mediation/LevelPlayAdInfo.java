package com.unity3d.mediation;

import com.ironsource.C4157k4;
import com.ironsource.C4227o2;
import com.ironsource.C4415yb;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.e5h;
import defpackage.i5h;
import defpackage.lm5;
import defpackage.mz1;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class LevelPlayAdInfo {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final String c;

    @Nullable
    private final C4227o2 d;

    @Nullable
    private final LevelPlayAdSize e;

    @Nullable
    private final String f;

    @NotNull
    private final Map<String, Object> g;

    public LevelPlayAdInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable C4227o2 c4227o2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str4, @NotNull Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = c4227o2;
        this.e = levelPlayAdSize;
        this.f = str4;
        this.g = map;
    }

    private final <T> T a(String str) {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        if (c4227o2 != null && (m = c4227o2.m()) != null) {
            m.opt(str);
        }
        Intrinsics.h();
        throw null;
    }

    private final String b() {
        return this.b;
    }

    private final String c() {
        return this.c;
    }

    public static /* synthetic */ LevelPlayAdInfo copy$default(LevelPlayAdInfo levelPlayAdInfo, String str, String str2, String str3, C4227o2 c4227o2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, Object obj) {
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
            c4227o2 = levelPlayAdInfo.d;
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
        return levelPlayAdInfo.copy(str, str2, str6, c4227o2, levelPlayAdSize2, str5, map2);
    }

    private final C4227o2 d() {
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

    @NotNull
    public final LevelPlayAdInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable C4227o2 c4227o2, @Nullable LevelPlayAdSize levelPlayAdSize, @Nullable String str4, @NotNull Map<String, ? extends Object> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        return new LevelPlayAdInfo(str, str2, str3, c4227o2, levelPlayAdSize, str4, map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayAdInfo)) {
            return false;
        }
        LevelPlayAdInfo levelPlayAdInfo = (LevelPlayAdInfo) obj;
        return Intrinsics.c(this.a, levelPlayAdInfo.a) && Intrinsics.c(this.b, levelPlayAdInfo.b) && Intrinsics.c(this.c, levelPlayAdInfo.c) && Intrinsics.c(this.d, levelPlayAdInfo.d) && Intrinsics.c(this.e, levelPlayAdInfo.e) && Intrinsics.c(this.f, levelPlayAdInfo.f) && Intrinsics.c(this.g, levelPlayAdInfo.g);
    }

    @NotNull
    public final String getAb() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("ab");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAdFormat() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("adFormat");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.c : str;
    }

    @NotNull
    public final String getAdId() {
        return this.a;
    }

    @NotNull
    public final String getAdNetwork() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("adNetwork");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @Nullable
    public final LevelPlayAdSize getAdSize() {
        return this.e;
    }

    @NotNull
    public final String getAdUnitId() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("mediationAdUnitId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? this.b : str;
    }

    @NotNull
    public final String getAdUnitName() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("mediationAdUnitName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getAuctionId() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("auctionId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCountry() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("country");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getCreativeId() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("creativeId");
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

    @NotNull
    public final String getEncryptedCPM() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("encryptedCPM");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getImpressionPrecision$mediationsdk_release() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("precision");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public final double getImpressionRevenue$mediationsdk_release() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Double valueOf = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : Double.valueOf(m.optDouble("revenue"));
        if (Intrinsics.a(valueOf, Double.NaN) || valueOf == null) {
            return 0.0d;
        }
        return valueOf.doubleValue();
    }

    @NotNull
    public final String getInstanceId() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("instanceId");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getInstanceName() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("instanceName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPlacementName() {
        String str = this.f;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPrecision() {
        C4415yb d;
        String c;
        C4227o2 c4227o2 = this.d;
        return (c4227o2 == null || (d = c4227o2.d()) == null || (c = d.c()) == null) ? getImpressionPrecision$mediationsdk_release() : c;
    }

    public final double getRevenue() {
        C4415yb d;
        C4227o2 c4227o2 = this.d;
        return (c4227o2 == null || (d = c4227o2.d()) == null) ? getImpressionRevenue$mediationsdk_release() : d.d();
    }

    @NotNull
    public final String getSegmentName() {
        JSONObject m;
        C4227o2 c4227o2 = this.d;
        Object opt = (c4227o2 == null || (m = c4227o2.m()) == null) ? null : m.opt("segmentName");
        String str = (String) (opt instanceof String ? opt : null);
        return str == null ? "" : str;
    }

    public int hashCode() {
        int c = dmi.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        C4227o2 c4227o2 = this.d;
        int hashCode = (c + (c4227o2 == null ? 0 : c4227o2.hashCode())) * 31;
        LevelPlayAdSize levelPlayAdSize = this.e;
        int hashCode2 = (hashCode + (levelPlayAdSize == null ? 0 : levelPlayAdSize.hashCode())) * 31;
        String str = this.f;
        return this.g.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0032 -> B:8:0x0045). Please report as a decompilation issue!!! */
    @NotNull
    public final JSONObject impressionData$mediationsdk_release() {
        JSONObject jSONObject;
        String str;
        JSONObject m;
        try {
            C4227o2 c4227o2 = this.d;
            if (c4227o2 == null || (m = c4227o2.m()) == null) {
                jSONObject = new JSONObject();
            } else {
                Iterator<String> keys = m.keys();
                keys.getClass();
                jSONObject = new JSONObject(m, (String[]) i5h.q(e5h.b(keys)).toArray(new String[0]));
            }
        } catch (Exception e) {
            IronLog.INTERNAL.error("failed to copy impression JSON", e);
            C4157k4.d().a(e);
            jSONObject = new JSONObject();
        }
        try {
            String optString = jSONObject.optString("placement");
            optString.getClass();
            if (optString.length() > 0 && (str = this.f) != null) {
                jSONObject.put("placement", c.r(optString, d.r, str, false));
            }
            if (getCreativeId().length() > 0) {
                jSONObject.put("creativeId", getCreativeId());
            }
        } catch (Exception e2) {
            IronLog.INTERNAL.error("failed to put impression values", e2);
            C4157k4.d().a(e2);
        }
        return jSONObject;
    }

    @NotNull
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
        StringBuilder s = mz1.s("adId: ", adId, ", adUnitId: ", adUnitId, ", adUnitName: ");
        s.append(adUnitName);
        s.append(", adSize: ");
        s.append(levelPlayAdSize);
        s.append(", adFormat: ");
        bf3.v(s, adFormat, ", placementName: ", placementName, ", auctionId: ");
        bf3.v(s, auctionId, ", country: ", country, ", ab: ");
        bf3.v(s, ab, ", segmentName: ", segmentName, ", adNetwork: ");
        bf3.v(s, adNetwork, ", instanceName: ", instanceName, ", instanceId: ");
        s.append(instanceId);
        s.append(", revenue: ");
        s.append(revenue);
        bf3.v(s, ", precision: ", precision, ", encryptedCPM: ", encryptedCPM);
        return mz1.o(s, ", creativeId: ", creativeId);
    }

    private final String a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayAdInfo(@NotNull LevelPlayAdInfo levelPlayAdInfo, @Nullable String str) {
        this(levelPlayAdInfo.a, levelPlayAdInfo.b, levelPlayAdInfo.c, levelPlayAdInfo.d, levelPlayAdInfo.e, str, levelPlayAdInfo.g);
        levelPlayAdInfo.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LevelPlayAdInfo(String str, String str2, String str3, C4227o2 c4227o2, LevelPlayAdSize levelPlayAdSize, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, c4227o2, levelPlayAdSize, str4, map);
        c4227o2 = (i & 8) != 0 ? null : c4227o2;
        levelPlayAdSize = (i & 16) != 0 ? null : levelPlayAdSize;
        str4 = (i & 32) != 0 ? null : str4;
        if ((i & 64) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }
}
