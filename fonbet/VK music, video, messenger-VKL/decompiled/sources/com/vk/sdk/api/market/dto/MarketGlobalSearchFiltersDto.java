package com.vk.sdk.api.market.dto;

import com.vk.sdk.api.base.dto.BaseCityDto;
import com.vk.sdk.api.base.dto.BaseCountryDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGlobalSearchFiltersDto.kt */
/* loaded from: classes5.dex */
public final class MarketGlobalSearchFiltersDto {

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("country")
    private final BaseCountryDto country;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGlobalSearchFiltersDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGlobalSearchFiltersDto)) {
            return false;
        }
        MarketGlobalSearchFiltersDto marketGlobalSearchFiltersDto = (MarketGlobalSearchFiltersDto) obj;
        return epx.f(this.city, marketGlobalSearchFiltersDto.city) && epx.f(this.country, marketGlobalSearchFiltersDto.country);
    }

    public final int hashCode() {
        BaseCityDto baseCityDto = this.city;
        int hashCode = (baseCityDto == null ? 0 : baseCityDto.hashCode()) * 31;
        BaseCountryDto baseCountryDto = this.country;
        return hashCode + (baseCountryDto != null ? baseCountryDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketGlobalSearchFiltersDto(city=" + this.city + ", country=" + this.country + ")";
    }

    public MarketGlobalSearchFiltersDto(BaseCityDto baseCityDto, BaseCountryDto baseCountryDto) {
        this.city = baseCityDto;
        this.country = baseCountryDto;
    }

    public /* synthetic */ MarketGlobalSearchFiltersDto(BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseCityDto, (i & 2) != 0 ? null : baseCountryDto);
    }
}
