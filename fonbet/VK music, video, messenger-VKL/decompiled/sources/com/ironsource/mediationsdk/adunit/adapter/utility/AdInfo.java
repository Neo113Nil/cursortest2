package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.Ab;
import com.ironsource.C4452n4;
import com.ironsource.W8;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes13.dex */
public final class AdInfo {
    private final W8 impressionData;
    private final Ab loadArmData;

    public AdInfo(W8 w8, Ab ab) {
        this.impressionData = w8;
        this.loadArmData = ab;
    }

    public final String getAb() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.a() == null) ? "" : this.impressionData.a();
    }

    public final String getAdNetwork() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.c() == null) ? "" : this.impressionData.c();
    }

    public final String getAuctionId() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.e() == null) ? "" : this.impressionData.e();
    }

    public final String getCountry() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.f() == null) ? "" : this.impressionData.f();
    }

    public final String getEncryptedCPM() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.h() == null) ? "" : this.impressionData.h();
    }

    public final String getInstanceId() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.i() == null) ? "" : this.impressionData.i();
    }

    public final String getInstanceName() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.j() == null) ? "" : this.impressionData.j();
    }

    public final String getPrecision() {
        Ab ab = this.loadArmData;
        if (ab != null) {
            return ab.c();
        }
        W8 w8 = this.impressionData;
        return (w8 == null || w8.n() == null) ? "" : this.impressionData.n();
    }

    public final double getRevenue() {
        Ab ab = this.loadArmData;
        if (ab != null) {
            return ab.d();
        }
        W8 w8 = this.impressionData;
        if (w8 == null) {
            return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        }
        w8.o();
        return this.impressionData.o();
    }

    public final String getSegmentName() {
        W8 w8 = this.impressionData;
        return (w8 == null || w8.p() == null) ? "" : this.impressionData.p();
    }

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
            C4452n4.d().a(e);
            IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        return jSONObject.toString();
    }
}
