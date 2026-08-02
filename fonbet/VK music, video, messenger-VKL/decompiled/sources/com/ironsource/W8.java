package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import java.text.DecimalFormat;
import org.json.JSONObject;
import xsna.i5s;
import xsna.n6j;
import xsna.xe9;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class W8 {
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
    private final DecimalFormat b = new DecimalFormat("#.#####");

    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    public W8(LevelPlayAdInfo levelPlayAdInfo) {
        this.a = levelPlayAdInfo;
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
        String format = this.b.format(o());
        String n2 = n();
        String h2 = h();
        String g2 = g();
        StringBuilder a3 = xe9.a("auctionId: '", e2, "', mediationAdUnitName: '", l2, "', mediationAdUnitId: '");
        n6j.b(a3, k2, "', adFormat: '", b, "', country: '");
        n6j.b(a3, f2, "', ab: '", a2, "', segmentName: '");
        n6j.b(a3, p2, "', placement: '", m2, "', adNetwork: '");
        n6j.b(a3, c2, "', instanceName: '", j2, "', instanceId: '");
        n6j.b(a3, i2, "', revenue: ", format, ", precision: '");
        n6j.b(a3, n2, "', encryptedCPM: '", h2, "', creativeId: '");
        return i5s.a(a3, g2, "'");
    }
}
