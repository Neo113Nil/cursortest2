package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseCountryDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGlobalSearchFiltersDto.kt */
/* loaded from: classes15.dex */
public final class MarketGlobalSearchFiltersDto implements Parcelable {
    public static final Parcelable.Creator<MarketGlobalSearchFiltersDto> CREATOR = new a();

    @pmi0("city")
    private final BaseCityDto city;

    @pmi0("country")
    private final BaseCountryDto country;

    /* compiled from: MarketGlobalSearchFiltersDto.kt */
    public static final class a implements Parcelable.Creator<MarketGlobalSearchFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGlobalSearchFiltersDto createFromParcel(Parcel parcel) {
            return new MarketGlobalSearchFiltersDto((BaseCityDto) parcel.readParcelable(MarketGlobalSearchFiltersDto.class.getClassLoader()), (BaseCountryDto) parcel.readParcelable(MarketGlobalSearchFiltersDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGlobalSearchFiltersDto[] newArray(int i) {
            return new MarketGlobalSearchFiltersDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketGlobalSearchFiltersDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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
        return "MarketGlobalSearchFiltersDto(city=" + this.city + ", country=" + this.country + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.city, i);
        parcel.writeParcelable(this.country, i);
    }

    public MarketGlobalSearchFiltersDto(BaseCityDto baseCityDto, BaseCountryDto baseCountryDto) {
        this.city = baseCityDto;
        this.country = baseCountryDto;
    }

    public /* synthetic */ MarketGlobalSearchFiltersDto(BaseCityDto baseCityDto, BaseCountryDto baseCountryDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseCityDto, (i & 2) != 0 ? null : baseCountryDto);
    }
}
