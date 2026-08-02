package com.ironsource.adqualitysdk.sdk;

import com.ironsource.adqualitysdk.sdk.i.AbstractC0523;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes4.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject f36;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f37;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final double f38;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ISAdQualityAdType f39;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ISAdQualityMediationNetwork f40;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static class Builder {

        /* renamed from: ﻐ, reason: contains not printable characters */
        public JSONObject f41;

        /* renamed from: ﻛ, reason: contains not printable characters */
        public String f42;

        /* renamed from: ｋ, reason: contains not printable characters */
        public double f43;

        /* renamed from: ﾒ, reason: contains not printable characters */
        public ISAdQualityMediationNetwork f45 = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ﾇ, reason: contains not printable characters */
        public ISAdQualityAdType f44 = ISAdQualityAdType.UNKNOWN;

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f45, this.f44, this.f43, this.f42, this.f41);
        }

        @Deprecated
        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f44 = iSAdQualityAdType;
            return this;
        }

        @Deprecated
        public Builder setCustomData(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f41 = AbstractC0523.m346(jSONObject, false);
            }
            return this;
        }

        @Deprecated
        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f45 = iSAdQualityMediationNetwork;
            return this;
        }

        @Deprecated
        public Builder setPlacement(String str) {
            this.f42 = str;
            return this;
        }

        @Deprecated
        public Builder setRevenue(double d) {
            this.f43 = d;
            return this;
        }
    }

    public ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, JSONObject jSONObject) {
        this.f40 = iSAdQualityMediationNetwork;
        this.f39 = iSAdQualityAdType;
        this.f38 = d;
        this.f37 = str;
        this.f36 = jSONObject;
    }

    @Deprecated
    public ISAdQualityAdType getAdType() {
        return this.f39;
    }

    @Deprecated
    public JSONObject getCustomData() {
        return this.f36;
    }

    @Deprecated
    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f40;
    }

    @Deprecated
    public String getPlacement() {
        return this.f37;
    }

    @Deprecated
    public double getRevenue() {
        return this.f38;
    }
}
