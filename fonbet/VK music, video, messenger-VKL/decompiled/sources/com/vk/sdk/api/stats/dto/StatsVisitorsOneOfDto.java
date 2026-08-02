package com.vk.sdk.api.stats.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vq;
import xsna.zcl;

/* compiled from: StatsVisitorsOneOfDto.kt */
/* loaded from: classes5.dex */
public final class StatsVisitorsOneOfDto {

    @pmi0("age")
    private final List<StatsSexAgeDto> age;

    @pmi0("cities")
    private final List<StatsCityDto> cities;

    @pmi0("countries")
    private final List<StatsCountryDto> countries;

    @pmi0("mobile_views")
    private final Integer mobileViews;

    @pmi0("sex")
    private final List<StatsSexAgeDto> sex;

    @pmi0("sex_age")
    private final List<StatsSexAgeDto> sexAge;

    @pmi0("views")
    private final Integer views;

    @pmi0("visitors")
    private final Integer visitors;

    public StatsVisitorsOneOfDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsVisitorsOneOfDto)) {
            return false;
        }
        StatsVisitorsOneOfDto statsVisitorsOneOfDto = (StatsVisitorsOneOfDto) obj;
        return epx.f(this.age, statsVisitorsOneOfDto.age) && epx.f(this.cities, statsVisitorsOneOfDto.cities) && epx.f(this.countries, statsVisitorsOneOfDto.countries) && epx.f(this.mobileViews, statsVisitorsOneOfDto.mobileViews) && epx.f(this.sex, statsVisitorsOneOfDto.sex) && epx.f(this.sexAge, statsVisitorsOneOfDto.sexAge) && epx.f(this.views, statsVisitorsOneOfDto.views) && epx.f(this.visitors, statsVisitorsOneOfDto.visitors);
    }

    public final int hashCode() {
        List<StatsSexAgeDto> list = this.age;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StatsCityDto> list2 = this.cities;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StatsCountryDto> list3 = this.countries;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.mobileViews;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<StatsSexAgeDto> list4 = this.sex;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<StatsSexAgeDto> list5 = this.sexAge;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Integer num2 = this.views;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.visitors;
        return hashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        List<StatsSexAgeDto> list = this.age;
        List<StatsCityDto> list2 = this.cities;
        List<StatsCountryDto> list3 = this.countries;
        Integer num = this.mobileViews;
        List<StatsSexAgeDto> list4 = this.sex;
        List<StatsSexAgeDto> list5 = this.sexAge;
        Integer num2 = this.views;
        Integer num3 = this.visitors;
        StringBuilder sb = new StringBuilder("StatsVisitorsOneOfDto(age=");
        sb.append(list);
        sb.append(", cities=");
        sb.append(list2);
        sb.append(", countries=");
        sb.append(list3);
        sb.append(", mobileViews=");
        sb.append(num);
        sb.append(", sex=");
        vq.d(sb, list4, ", sexAge=", list5, ", views=");
        sb.append(num2);
        sb.append(", visitors=");
        sb.append(num3);
        sb.append(")");
        return sb.toString();
    }

    public StatsVisitorsOneOfDto(List<StatsSexAgeDto> list, List<StatsCityDto> list2, List<StatsCountryDto> list3, Integer num, List<StatsSexAgeDto> list4, List<StatsSexAgeDto> list5, Integer num2, Integer num3) {
        this.age = list;
        this.cities = list2;
        this.countries = list3;
        this.mobileViews = num;
        this.sex = list4;
        this.sexAge = list5;
        this.views = num2;
        this.visitors = num3;
    }

    public /* synthetic */ StatsVisitorsOneOfDto(List list, List list2, List list3, Integer num, List list4, List list5, Integer num2, Integer num3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3);
    }
}
