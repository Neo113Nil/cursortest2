package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class V8 {
    public static final a c = new a(null);
    public static final String d = "auctionId";
    public static final String e = "adUnit";
    public static final String f = "adFormat";
    public static final String g = "mediationAdUnitName";
    public static final String h = "mediationAdUnitId";
    public static final String i = "country";
    public static final String j = "ab";
    public static final String k = "segmentName";
    public static final String l = "placement";
    public static final String m = "adNetwork";
    public static final String n = "instanceName";
    public static final String o = "instanceId";
    public static final String p = "revenue";
    public static final String q = "precision";
    public static final String r = "encryptedCPM";
    public static final String s = "creativeId";
    private final LevelPlayAdInfo a;
    private final DecimalFormat b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public V8(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.a = adInfo;
        this.b = new DecimalFormat("#.#####");
    }

    public final String a() {
        return this.a.getAb();
    }

    public final String b() {
        return this.a.getAdFormat();
    }

    public final String c() {
        return this.a.getAdNetwork();
    }

    public final JSONObject d() {
        return this.a.impressionData$mediationsdk_release();
    }

    public final String e() {
        return this.a.getAuctionId();
    }

    public final String f() {
        return this.a.getCountry();
    }

    public final String g() {
        return this.a.getCreativeId();
    }

    public final String h() {
        return this.a.getEncryptedCPM();
    }

    public final String i() {
        return this.a.getInstanceId();
    }

    public final String j() {
        return this.a.getInstanceName();
    }

    public final String k() {
        return this.a.getAdUnitId();
    }

    public final String l() {
        return this.a.getAdUnitName();
    }

    public final String m() {
        return this.a.getPlacementName();
    }

    public final String n() {
        return this.a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.a.getImpressionRevenue$mediationsdk_release();
    }

    public final String p() {
        return this.a.getSegmentName();
    }

    public String toString() {
        String e2 = e();
        String l2 = l();
        String k2 = k();
        String b = b();
        String f2 = f();
        String a2 = a();
        String p2 = p();
        String m2 = m();
        String c2 = c();
        String j2 = j();
        String i2 = i();
        o();
        return "auctionId: '" + e2 + "', mediationAdUnitName: '" + l2 + "', mediationAdUnitId: '" + k2 + "', adFormat: '" + b + "', country: '" + f2 + "', ab: '" + a2 + "', segmentName: '" + p2 + "', placement: '" + m2 + "', adNetwork: '" + c2 + "', instanceName: '" + j2 + "', instanceId: '" + i2 + "', revenue: " + this.b.format(o()) + ", precision: '" + n() + "', encryptedCPM: '" + h() + "', creativeId: '" + g() + "'";
    }
}
