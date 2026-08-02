package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C2556n4;
import com.ironsource.C2778zb;
import com.ironsource.V8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AdInfo {
    private final V8 impressionData;
    private final C2778zb loadArmData;

    public AdInfo(V8 v8, C2778zb c2778zb) {
        this.impressionData = v8;
        this.loadArmData = c2778zb;
    }

    public final String getAb() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.a() == null) ? "" : this.impressionData.a();
    }

    public final String getAdNetwork() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.c() == null) ? "" : this.impressionData.c();
    }

    public final String getAuctionId() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.e() == null) ? "" : this.impressionData.e();
    }

    public final String getCountry() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.f() == null) ? "" : this.impressionData.f();
    }

    public final String getEncryptedCPM() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.h() == null) ? "" : this.impressionData.h();
    }

    public final String getInstanceId() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.i() == null) ? "" : this.impressionData.i();
    }

    public final String getInstanceName() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.j() == null) ? "" : this.impressionData.j();
    }

    public final String getPrecision() {
        C2778zb c2778zb = this.loadArmData;
        if (c2778zb != null) {
            return c2778zb.c();
        }
        V8 v8 = this.impressionData;
        return (v8 == null || v8.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        C2778zb c2778zb = this.loadArmData;
        if (c2778zb != null) {
            return c2778zb.d();
        }
        V8 v8 = this.impressionData;
        if (v8 == null) {
            return 0.0d;
        }
        v8.o();
        return this.impressionData.o();
    }

    public final String getSegmentName() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.p() == null) ? "" : this.impressionData.p();
    }

    public String toString() {
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            jsonObjectInit.put("auctionId", getAuctionId());
            jsonObjectInit.put("country", getCountry());
            jsonObjectInit.put("ab", getAb());
            jsonObjectInit.put("segmentName", getSegmentName());
            jsonObjectInit.put("adNetwork", getAdNetwork());
            jsonObjectInit.put("instanceName", getInstanceName());
            jsonObjectInit.put("instanceId", getInstanceId());
            jsonObjectInit.put("revenue", getRevenue());
            jsonObjectInit.put("precision", getPrecision());
            jsonObjectInit.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        String jSONObject = jsonObjectInit.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "adInfoData.toString()");
        return jSONObject;
    }
}
