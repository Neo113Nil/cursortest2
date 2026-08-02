package com.vk.sdk.api.stats.dto;

import com.vk.movika.sdk.base.model.n;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.zcl;

/* compiled from: StatsReachOneOfDto.kt */
/* loaded from: classes5.dex */
public final class StatsReachOneOfDto {

    @pmi0("age")
    private final List<StatsSexAgeDto> age;

    @pmi0("cities")
    private final List<StatsCityDto> cities;

    @pmi0("countries")
    private final List<StatsCountryDto> countries;

    @pmi0("mobile_reach")
    private final Integer mobileReach;

    @pmi0("reach")
    private final Integer reach;

    @pmi0("reach_subscribers")
    private final Integer reachSubscribers;

    @pmi0("sex")
    private final List<StatsSexAgeDto> sex;

    @pmi0("sex_age")
    private final List<StatsSexAgeDto> sexAge;

    public StatsReachOneOfDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsReachOneOfDto)) {
            return false;
        }
        StatsReachOneOfDto statsReachOneOfDto = (StatsReachOneOfDto) obj;
        return epx.f(this.age, statsReachOneOfDto.age) && epx.f(this.cities, statsReachOneOfDto.cities) && epx.f(this.countries, statsReachOneOfDto.countries) && epx.f(this.mobileReach, statsReachOneOfDto.mobileReach) && epx.f(this.reach, statsReachOneOfDto.reach) && epx.f(this.reachSubscribers, statsReachOneOfDto.reachSubscribers) && epx.f(this.sex, statsReachOneOfDto.sex) && epx.f(this.sexAge, statsReachOneOfDto.sexAge);
    }

    public final int hashCode() {
        List<StatsSexAgeDto> list = this.age;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StatsCityDto> list2 = this.cities;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<StatsCountryDto> list3 = this.countries;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num = this.mobileReach;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reach;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reachSubscribers;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<StatsSexAgeDto> list4 = this.sex;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<StatsSexAgeDto> list5 = this.sexAge;
        return hashCode7 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        List<StatsSexAgeDto> list = this.age;
        List<StatsCityDto> list2 = this.cities;
        List<StatsCountryDto> list3 = this.countries;
        Integer num = this.mobileReach;
        Integer num2 = this.reach;
        Integer num3 = this.reachSubscribers;
        List<StatsSexAgeDto> list4 = this.sex;
        List<StatsSexAgeDto> list5 = this.sexAge;
        StringBuilder sb = new StringBuilder("StatsReachOneOfDto(age=");
        sb.append(list);
        sb.append(", cities=");
        sb.append(list2);
        sb.append(", countries=");
        sb.append(list3);
        sb.append(", mobileReach=");
        sb.append(num);
        sb.append(", reach=");
        sq.b(sb, num2, ", reachSubscribers=", num3, ", sex=");
        return n.b(sb, list4, ", sexAge=", list5, ")");
    }

    public StatsReachOneOfDto(List<StatsSexAgeDto> list, List<StatsCityDto> list2, List<StatsCountryDto> list3, Integer num, Integer num2, Integer num3, List<StatsSexAgeDto> list4, List<StatsSexAgeDto> list5) {
        this.age = list;
        this.cities = list2;
        this.countries = list3;
        this.mobileReach = num;
        this.reach = num2;
        this.reachSubscribers = num3;
        this.sex = list4;
        this.sexAge = list5;
    }

    public /* synthetic */ StatsReachOneOfDto(List list, List list2, List list3, Integer num, Integer num2, Integer num3, List list4, List list5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : list5);
    }
}
