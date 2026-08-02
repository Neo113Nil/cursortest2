package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.bf3;
import defpackage.mz1;
import java.text.DecimalFormat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class V8 {

    @NotNull
    public static final a c = new a(null);

    @NotNull
    public static final String d = "auctionId";

    @NotNull
    public static final String e = "adUnit";

    @NotNull
    public static final String f = "adFormat";

    @NotNull
    public static final String g = "mediationAdUnitName";

    @NotNull
    public static final String h = "mediationAdUnitId";

    @NotNull
    public static final String i = "country";

    @NotNull
    public static final String j = "ab";

    @NotNull
    public static final String k = "segmentName";

    @NotNull
    public static final String l = "placement";

    @NotNull
    public static final String m = "adNetwork";

    @NotNull
    public static final String n = "instanceName";

    @NotNull
    public static final String o = "instanceId";

    @NotNull
    public static final String p = "revenue";

    @NotNull
    public static final String q = "precision";

    @NotNull
    public static final String r = "encryptedCPM";

    @NotNull
    public static final String s = "creativeId";

    @NotNull
    private final LevelPlayAdInfo a;

    @NotNull
    private final DecimalFormat b;

    public V8(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a = levelPlayAdInfo;
        this.b = new DecimalFormat("#.#####");
    }

    @NotNull
    public final String a() {
        return this.a.getAb();
    }

    @NotNull
    public final String b() {
        return this.a.getAdFormat();
    }

    @NotNull
    public final String c() {
        return this.a.getAdNetwork();
    }

    @NotNull
    public final JSONObject d() {
        return this.a.impressionData$mediationsdk_release();
    }

    @NotNull
    public final String e() {
        return this.a.getAuctionId();
    }

    @NotNull
    public final String f() {
        return this.a.getCountry();
    }

    @NotNull
    public final String g() {
        return this.a.getCreativeId();
    }

    @NotNull
    public final String h() {
        return this.a.getEncryptedCPM();
    }

    @NotNull
    public final String i() {
        return this.a.getInstanceId();
    }

    @NotNull
    public final String j() {
        return this.a.getInstanceName();
    }

    @NotNull
    public final String k() {
        return this.a.getAdUnitId();
    }

    @NotNull
    public final String l() {
        return this.a.getAdUnitName();
    }

    @NotNull
    public final String m() {
        return this.a.getPlacementName();
    }

    @NotNull
    public final String n() {
        return this.a.getImpressionPrecision$mediationsdk_release();
    }

    public final double o() {
        return this.a.getImpressionRevenue$mediationsdk_release();
    }

    @NotNull
    public final String p() {
        return this.a.getSegmentName();
    }

    @NotNull
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
        StringBuilder s2 = mz1.s("auctionId: '", e2, "', mediationAdUnitName: '", l2, "', mediationAdUnitId: '");
        bf3.v(s2, k2, "', adFormat: '", b, "', country: '");
        bf3.v(s2, f2, "', ab: '", a2, "', segmentName: '");
        bf3.v(s2, p2, "', placement: '", m2, "', adNetwork: '");
        bf3.v(s2, c2, "', instanceName: '", j2, "', instanceId: '");
        bf3.v(s2, i2, "', revenue: ", format, ", precision: '");
        bf3.v(s2, n2, "', encryptedCPM: '", h2, "', creativeId: '");
        return mz1.o(s2, g2, "'");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
