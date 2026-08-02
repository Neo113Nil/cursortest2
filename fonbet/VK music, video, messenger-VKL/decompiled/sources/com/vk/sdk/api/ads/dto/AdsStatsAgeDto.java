package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsStatsAgeDto.kt */
/* loaded from: classes5.dex */
public final class AdsStatsAgeDto {

    @pmi0("clicks_rate")
    private final Float clicksRate;

    @pmi0("impressions_rate")
    private final Float impressionsRate;

    @pmi0("value")
    private final String value;

    public AdsStatsAgeDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsAgeDto)) {
            return false;
        }
        AdsStatsAgeDto adsStatsAgeDto = (AdsStatsAgeDto) obj;
        return epx.f(this.value, adsStatsAgeDto.value) && epx.f(this.clicksRate, adsStatsAgeDto.clicksRate) && epx.f(this.impressionsRate, adsStatsAgeDto.impressionsRate);
    }

    public final int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.clicksRate;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.impressionsRate;
        return hashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        return "AdsStatsAgeDto(value=" + this.value + ", clicksRate=" + this.clicksRate + ", impressionsRate=" + this.impressionsRate + ")";
    }

    public AdsStatsAgeDto(String str, Float f, Float f2) {
        this.value = str;
        this.clicksRate = f;
        this.impressionsRate = f2;
    }

    public /* synthetic */ AdsStatsAgeDto(String str, Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2);
    }
}
