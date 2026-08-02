package com.vk.sdk.api.ads.dto;

import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: AdsDemostatsFormatDto.kt */
/* loaded from: classes5.dex */
public final class AdsDemostatsFormatDto {

    @pmi0("age")
    private final List<AdsStatsAgeDto> age;

    @pmi0("cities")
    private final List<AdsStatsCitiesDto> cities;

    @pmi0("day")
    private final String day;

    @pmi0("day_from")
    private final String dayFrom;

    @pmi0("day_to")
    private final String dayTo;

    @pmi0("month")
    private final String month;

    @pmi0("overall")
    private final Integer overall;

    @pmi0("sex")
    private final List<AdsStatsSexDto> sex;

    @pmi0("sex_age")
    private final List<AdsStatsSexAgeDto> sexAge;

    public AdsDemostatsFormatDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsDemostatsFormatDto)) {
            return false;
        }
        AdsDemostatsFormatDto adsDemostatsFormatDto = (AdsDemostatsFormatDto) obj;
        return epx.f(this.age, adsDemostatsFormatDto.age) && epx.f(this.cities, adsDemostatsFormatDto.cities) && epx.f(this.day, adsDemostatsFormatDto.day) && epx.f(this.dayFrom, adsDemostatsFormatDto.dayFrom) && epx.f(this.dayTo, adsDemostatsFormatDto.dayTo) && epx.f(this.month, adsDemostatsFormatDto.month) && epx.f(this.overall, adsDemostatsFormatDto.overall) && epx.f(this.sex, adsDemostatsFormatDto.sex) && epx.f(this.sexAge, adsDemostatsFormatDto.sexAge);
    }

    public final int hashCode() {
        List<AdsStatsAgeDto> list = this.age;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<AdsStatsCitiesDto> list2 = this.cities;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.day;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dayFrom;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dayTo;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.month;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.overall;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<AdsStatsSexDto> list3 = this.sex;
        int hashCode8 = (hashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AdsStatsSexAgeDto> list4 = this.sexAge;
        return hashCode8 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        List<AdsStatsAgeDto> list = this.age;
        List<AdsStatsCitiesDto> list2 = this.cities;
        String str = this.day;
        String str2 = this.dayFrom;
        String str3 = this.dayTo;
        String str4 = this.month;
        Integer num = this.overall;
        List<AdsStatsSexDto> list3 = this.sex;
        List<AdsStatsSexAgeDto> list4 = this.sexAge;
        StringBuilder sb = new StringBuilder("AdsDemostatsFormatDto(age=");
        sb.append(list);
        sb.append(", cities=");
        sb.append(list2);
        sb.append(", day=");
        n6j.b(sb, str, ", dayFrom=", str2, ", dayTo=");
        n6j.b(sb, str3, ", month=", str4, ", overall=");
        sb.append(num);
        sb.append(", sex=");
        sb.append(list3);
        sb.append(", sexAge=");
        return vp.b(")", sb, list4);
    }

    public AdsDemostatsFormatDto(List<AdsStatsAgeDto> list, List<AdsStatsCitiesDto> list2, String str, String str2, String str3, String str4, Integer num, List<AdsStatsSexDto> list3, List<AdsStatsSexAgeDto> list4) {
        this.age = list;
        this.cities = list2;
        this.day = str;
        this.dayFrom = str2;
        this.dayTo = str3;
        this.month = str4;
        this.overall = num;
        this.sex = list3;
        this.sexAge = list4;
    }

    public /* synthetic */ AdsDemostatsFormatDto(List list, List list2, String str, String str2, String str3, String str4, Integer num, List list3, List list4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : list4);
    }
}
