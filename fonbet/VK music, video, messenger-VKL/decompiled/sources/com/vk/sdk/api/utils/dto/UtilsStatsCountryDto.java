package com.vk.sdk.api.utils.dto;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsStatsCountryDto.kt */
/* loaded from: classes5.dex */
public final class UtilsStatsCountryDto {

    @pmi0(AnalyticsBaseParamsConstantsKt.COUNTRY_ID)
    private final Integer countryId;

    @pmi0("views")
    private final Integer views;

    /* JADX WARN: Multi-variable type inference failed */
    public UtilsStatsCountryDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsCountryDto)) {
            return false;
        }
        UtilsStatsCountryDto utilsStatsCountryDto = (UtilsStatsCountryDto) obj;
        return epx.f(this.countryId, utilsStatsCountryDto.countryId) && epx.f(this.views, utilsStatsCountryDto.views);
    }

    public final int hashCode() {
        Integer num = this.countryId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.views;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsStatsCountryDto(countryId=" + this.countryId + ", views=" + this.views + ")";
    }

    public UtilsStatsCountryDto(Integer num, Integer num2) {
        this.countryId = num;
        this.views = num2;
    }

    public /* synthetic */ UtilsStatsCountryDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
