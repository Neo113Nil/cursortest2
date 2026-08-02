package com.vk.sdk.api.stats.dto;

import xsna.epx;
import xsna.jq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StatsCountryDto.kt */
/* loaded from: classes5.dex */
public final class StatsCountryDto {

    @pmi0("code")
    private final String code;

    @pmi0("count")
    private final Integer count;

    @pmi0("name")
    private final String name;

    @pmi0("value")
    private final Integer value;

    public StatsCountryDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsCountryDto)) {
            return false;
        }
        StatsCountryDto statsCountryDto = (StatsCountryDto) obj;
        return epx.f(this.code, statsCountryDto.code) && epx.f(this.count, statsCountryDto.count) && epx.f(this.name, statsCountryDto.name) && epx.f(this.value, statsCountryDto.value);
    }

    public final int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.value;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.code;
        Integer num = this.count;
        String str2 = this.name;
        Integer num2 = this.value;
        StringBuilder d = jq.d(num, "StatsCountryDto(code=", str, ", count=", ", name=");
        d.append(str2);
        d.append(", value=");
        d.append(num2);
        d.append(")");
        return d.toString();
    }

    public StatsCountryDto(String str, Integer num, String str2, Integer num2) {
        this.code = str;
        this.count = num;
        this.name = str2;
        this.value = num2;
    }

    public /* synthetic */ StatsCountryDto(String str, Integer num, String str2, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2);
    }
}
