package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4157k4;
import com.ironsource.C4415yb;
import com.ironsource.V8;
import com.ironsource.mediationsdk.logger.IronLog;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class AdInfo {

    @Nullable
    private final V8 impressionData;

    @Nullable
    private final C4415yb loadArmData;

    public AdInfo(@Nullable V8 v8, @Nullable C4415yb c4415yb) {
        this.impressionData = v8;
        this.loadArmData = c4415yb;
    }

    @NotNull
    public final String getAb() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.a() == null) ? "" : this.impressionData.a();
    }

    @NotNull
    public final String getAdNetwork() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.c() == null) ? "" : this.impressionData.c();
    }

    @NotNull
    public final String getAuctionId() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.e() == null) ? "" : this.impressionData.e();
    }

    @NotNull
    public final String getCountry() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.f() == null) ? "" : this.impressionData.f();
    }

    @NotNull
    public final String getEncryptedCPM() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.h() == null) ? "" : this.impressionData.h();
    }

    @NotNull
    public final String getInstanceId() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.i() == null) ? "" : this.impressionData.i();
    }

    @NotNull
    public final String getInstanceName() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.j() == null) ? "" : this.impressionData.j();
    }

    @NotNull
    public final String getPrecision() {
        C4415yb c4415yb = this.loadArmData;
        if (c4415yb != null) {
            return c4415yb.c();
        }
        V8 v8 = this.impressionData;
        return (v8 == null || v8.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        C4415yb c4415yb = this.loadArmData;
        if (c4415yb != null) {
            return c4415yb.d();
        }
        V8 v8 = this.impressionData;
        if (v8 == null) {
            return 0.0d;
        }
        v8.o();
        return this.impressionData.o();
    }

    @NotNull
    public final String getSegmentName() {
        V8 v8 = this.impressionData;
        return (v8 == null || v8.p() == null) ? "" : this.impressionData.p();
    }

    @NotNull
    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }
}
