package com.vk.sdk.api.stats.dto;

import xsna.epx;
import xsna.jq;
import xsna.oq;
import xsna.pmi0;
import xsna.sq;
import xsna.zcl;

/* compiled from: StatsSexAgeDto.kt */
/* loaded from: classes5.dex */
public final class StatsSexAgeDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("count_subscribers")
    private final Integer countSubscribers;

    @pmi0("reach")
    private final Integer reach;

    @pmi0("reach_subscribers")
    private final Integer reachSubscribers;

    @pmi0("value")
    private final String value;

    public StatsSexAgeDto(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.value = str;
        this.count = num;
        this.reach = num2;
        this.reachSubscribers = num3;
        this.countSubscribers = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsSexAgeDto)) {
            return false;
        }
        StatsSexAgeDto statsSexAgeDto = (StatsSexAgeDto) obj;
        return epx.f(this.value, statsSexAgeDto.value) && epx.f(this.count, statsSexAgeDto.count) && epx.f(this.reach, statsSexAgeDto.reach) && epx.f(this.reachSubscribers, statsSexAgeDto.reachSubscribers) && epx.f(this.countSubscribers, statsSexAgeDto.countSubscribers);
    }

    public final int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reach;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.reachSubscribers;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.countSubscribers;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.value;
        Integer num = this.count;
        Integer num2 = this.reach;
        Integer num3 = this.reachSubscribers;
        Integer num4 = this.countSubscribers;
        StringBuilder d = jq.d(num, "StatsSexAgeDto(value=", str, ", count=", ", reach=");
        sq.b(d, num2, ", reachSubscribers=", num3, ", countSubscribers=");
        return oq.b(d, num4, ")");
    }

    public /* synthetic */ StatsSexAgeDto(String str, Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4);
    }
}
