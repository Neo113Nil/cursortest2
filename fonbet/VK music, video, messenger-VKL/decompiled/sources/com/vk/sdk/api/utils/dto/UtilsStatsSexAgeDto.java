package com.vk.sdk.api.utils.dto;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import xsna.epx;
import xsna.jq;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsStatsSexAgeDto.kt */
/* loaded from: classes5.dex */
public final class UtilsStatsSexAgeDto {

    @pmi0("age_range")
    private final String ageRange;

    @pmi0(IronSourceConstants.a.c)
    private final Integer female;

    @pmi0(IronSourceConstants.a.b)
    private final Integer male;

    public UtilsStatsSexAgeDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsSexAgeDto)) {
            return false;
        }
        UtilsStatsSexAgeDto utilsStatsSexAgeDto = (UtilsStatsSexAgeDto) obj;
        return epx.f(this.ageRange, utilsStatsSexAgeDto.ageRange) && epx.f(this.female, utilsStatsSexAgeDto.female) && epx.f(this.male, utilsStatsSexAgeDto.male);
    }

    public final int hashCode() {
        String str = this.ageRange;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.female;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.male;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.ageRange;
        Integer num = this.female;
        return oq.b(jq.d(num, "UtilsStatsSexAgeDto(ageRange=", str, ", female=", ", male="), this.male, ")");
    }

    public UtilsStatsSexAgeDto(String str, Integer num, Integer num2) {
        this.ageRange = str;
        this.female = num;
        this.male = num2;
    }

    public /* synthetic */ UtilsStatsSexAgeDto(String str, Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
