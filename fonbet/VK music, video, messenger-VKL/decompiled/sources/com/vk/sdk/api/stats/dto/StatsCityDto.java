package com.vk.sdk.api.stats.dto;

import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StatsCityDto.kt */
/* loaded from: classes5.dex */
public final class StatsCityDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final Integer value;

    public StatsCityDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCityDto)) {
            return false;
        }
        StatsCityDto statsCityDto = (StatsCityDto) obj;
        return epx.f(this.count, statsCityDto.count) && epx.f(this.name, statsCityDto.name) && epx.f(this.value, statsCityDto.value);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.value;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.count;
        String str = this.name;
        Integer num2 = this.value;
        StringBuilder sb = new StringBuilder("StatsCityDto(count=");
        sb.append(num);
        sb.append(", name=");
        sb.append(str);
        sb.append(", value=");
        return oq.b(sb, num2, ")");
    }

    public StatsCityDto(Integer num, String str, Integer num2) {
        this.count = num;
        this.name = str;
        this.value = num2;
    }

    public /* synthetic */ StatsCityDto(Integer num, String str, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2);
    }
}
