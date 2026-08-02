package com.vk.sdk.api.utils.dto;

import java.util.List;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsStatsExtendedDto.kt */
/* loaded from: classes5.dex */
public final class UtilsStatsExtendedDto {

    @pmi0("cities")
    private final List<UtilsStatsCityDto> cities;

    @pmi0("countries")
    private final List<UtilsStatsCountryDto> countries;

    @pmi0("sex_age")
    private final List<UtilsStatsSexAgeDto> sexAge;

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("views")
    private final Integer views;

    public UtilsStatsExtendedDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsExtendedDto)) {
            return false;
        }
        UtilsStatsExtendedDto utilsStatsExtendedDto = (UtilsStatsExtendedDto) obj;
        return epx.f(this.cities, utilsStatsExtendedDto.cities) && epx.f(this.countries, utilsStatsExtendedDto.countries) && epx.f(this.sexAge, utilsStatsExtendedDto.sexAge) && epx.f(this.timestamp, utilsStatsExtendedDto.timestamp) && epx.f(this.views, utilsStatsExtendedDto.views);
    }

    public final int hashCode() {
        List<UtilsStatsCityDto> list = this.cities;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<UtilsStatsCountryDto> list2 = this.countries;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<UtilsStatsSexAgeDto> list3 = this.sexAge;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.timestamp;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.views;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        List<UtilsStatsCityDto> list = this.cities;
        List<UtilsStatsCountryDto> list2 = this.countries;
        List<UtilsStatsSexAgeDto> list3 = this.sexAge;
        Integer num = this.timestamp;
        Integer num2 = this.views;
        StringBuilder sb = new StringBuilder("UtilsStatsExtendedDto(cities=");
        sb.append(list);
        sb.append(", countries=");
        sb.append(list2);
        sb.append(", sexAge=");
        sb.append(list3);
        sb.append(", timestamp=");
        sb.append(num);
        sb.append(", views=");
        return oq.b(sb, num2, ")");
    }

    public UtilsStatsExtendedDto(List<UtilsStatsCityDto> list, List<UtilsStatsCountryDto> list2, List<UtilsStatsSexAgeDto> list3, Integer num, Integer num2) {
        this.cities = list;
        this.countries = list2;
        this.sexAge = list3;
        this.timestamp = num;
        this.views = num2;
    }

    public /* synthetic */ UtilsStatsExtendedDto(List list, List list2, List list3, Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }
}
