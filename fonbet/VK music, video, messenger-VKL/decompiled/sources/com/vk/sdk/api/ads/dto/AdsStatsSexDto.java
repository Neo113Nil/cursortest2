package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsStatsSexDto.kt */
/* loaded from: classes5.dex */
public final class AdsStatsSexDto {

    @pmi0("clicks_rate")
    private final Float clicksRate;

    @pmi0("impressions_rate")
    private final Float impressionsRate;

    @pmi0("value")
    private final AdsStatsSexValueDto value;

    public AdsStatsSexDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsSexDto)) {
            return false;
        }
        AdsStatsSexDto adsStatsSexDto = (AdsStatsSexDto) obj;
        return this.value == adsStatsSexDto.value && epx.f(this.clicksRate, adsStatsSexDto.clicksRate) && epx.f(this.impressionsRate, adsStatsSexDto.impressionsRate);
    }

    public final int hashCode() {
        AdsStatsSexValueDto adsStatsSexValueDto = this.value;
        int hashCode = (adsStatsSexValueDto == null ? 0 : adsStatsSexValueDto.hashCode()) * 31;
        Float f = this.clicksRate;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.impressionsRate;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        return "AdsStatsSexDto(value=" + this.value + ", clicksRate=" + this.clicksRate + ", impressionsRate=" + this.impressionsRate + ")";
    }

    public AdsStatsSexDto(AdsStatsSexValueDto adsStatsSexValueDto, Float f, Float f2) {
        this.value = adsStatsSexValueDto;
        this.clicksRate = f;
        this.impressionsRate = f2;
    }

    public /* synthetic */ AdsStatsSexDto(AdsStatsSexValueDto adsStatsSexValueDto, Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : adsStatsSexValueDto, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2);
    }
}
