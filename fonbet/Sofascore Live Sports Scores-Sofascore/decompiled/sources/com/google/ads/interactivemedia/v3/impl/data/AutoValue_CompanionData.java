package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.impl.data.AdViewData;
import defpackage.yhk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class AutoValue_CompanionData extends CompanionData {
    private final String clickThroughUrl;
    private final double companionScaleTolerance;
    private final String size;
    private final String src;
    private final AdViewData.Type type;

    public AutoValue_CompanionData(String str, String str2, String str3, AdViewData.Type type, double d) {
        if (str == null) {
            yhk.s("Null size");
            throw null;
        }
        this.size = str;
        if (str2 == null) {
            yhk.s("Null src");
            throw null;
        }
        this.src = str2;
        if (str3 == null) {
            yhk.s("Null clickThroughUrl");
            throw null;
        }
        this.clickThroughUrl = str3;
        if (type == null) {
            yhk.s("Null type");
            throw null;
        }
        this.type = type;
        this.companionScaleTolerance = d;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String clickThroughUrl() {
        return this.clickThroughUrl;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public double companionScaleTolerance() {
        return this.companionScaleTolerance;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompanionData) {
            CompanionData companionData = (CompanionData) obj;
            if (this.size.equals(companionData.size()) && this.src.equals(companionData.src()) && this.clickThroughUrl.equals(companionData.clickThroughUrl()) && this.type.equals(companionData.type()) && Double.doubleToLongBits(this.companionScaleTolerance) == Double.doubleToLongBits(companionData.companionScaleTolerance())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.src.hashCode()) * 1000003) ^ this.clickThroughUrl.hashCode()) * 1000003) ^ this.type.hashCode();
        return ((int) ((Double.doubleToLongBits(this.companionScaleTolerance) >>> 32) ^ Double.doubleToLongBits(this.companionScaleTolerance))) ^ (hashCode * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String size() {
        return this.size;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public String src() {
        return this.src;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CompanionData
    public AdViewData.Type type() {
        return this.type;
    }
}
