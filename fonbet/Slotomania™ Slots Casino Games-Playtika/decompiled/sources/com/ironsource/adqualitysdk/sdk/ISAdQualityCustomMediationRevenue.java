package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes6.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final ISAdQualityAdType f50;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ISAdQualityMediationNetwork f51;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final String f52;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final double f53;

    /* synthetic */ ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str, byte b) {
        this(iSAdQualityMediationNetwork, iSAdQualityAdType, d, str);
    }

    private ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d, String str) {
        this.f51 = iSAdQualityMediationNetwork;
        this.f50 = iSAdQualityAdType;
        this.f53 = d;
        this.f52 = str;
    }

    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f51;
    }

    public ISAdQualityAdType getAdType() {
        return this.f50;
    }

    public double getRevenue() {
        return this.f53;
    }

    public String getPlacement() {
        return this.f52;
    }

    public static class Builder {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private String f54;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private double f56;

        /* renamed from: ｋ, reason: contains not printable characters */
        private ISAdQualityMediationNetwork f55 = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private ISAdQualityAdType f57 = ISAdQualityAdType.UNKNOWN;

        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f55 = iSAdQualityMediationNetwork;
            return this;
        }

        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f57 = iSAdQualityAdType;
            return this;
        }

        public Builder setRevenue(double d) {
            this.f56 = d;
            return this;
        }

        public Builder setPlacement(String str) {
            this.f54 = str;
            return this;
        }

        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f55, this.f57, this.f56, this.f54, (byte) 0);
        }
    }
}
