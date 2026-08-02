package com.vk.sdk.api.utils.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsStatsCityDto.kt */
/* loaded from: classes5.dex */
public final class UtilsStatsCityDto {

    @pmi0("city_id")
    private final Integer cityId;

    @pmi0("views")
    private final Integer views;

    /* JADX WARN: Multi-variable type inference failed */
    public UtilsStatsCityDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsCityDto)) {
            return false;
        }
        UtilsStatsCityDto utilsStatsCityDto = (UtilsStatsCityDto) obj;
        return epx.f(this.cityId, utilsStatsCityDto.cityId) && epx.f(this.views, utilsStatsCityDto.views);
    }

    public final int hashCode() {
        Integer num = this.cityId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.views;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsStatsCityDto(cityId=" + this.cityId + ", views=" + this.views + ")";
    }

    public UtilsStatsCityDto(Integer num, Integer num2) {
        this.cityId = num;
        this.views = num2;
    }

    public /* synthetic */ UtilsStatsCityDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
