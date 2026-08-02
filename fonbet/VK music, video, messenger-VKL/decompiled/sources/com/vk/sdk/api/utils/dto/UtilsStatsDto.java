package com.vk.sdk.api.utils.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsStatsDto.kt */
/* loaded from: classes5.dex */
public final class UtilsStatsDto {

    @pmi0("timestamp")
    private final Integer timestamp;

    @pmi0("views")
    private final Integer views;

    /* JADX WARN: Multi-variable type inference failed */
    public UtilsStatsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsStatsDto)) {
            return false;
        }
        UtilsStatsDto utilsStatsDto = (UtilsStatsDto) obj;
        return epx.f(this.timestamp, utilsStatsDto.timestamp) && epx.f(this.views, utilsStatsDto.views);
    }

    public final int hashCode() {
        Integer num = this.timestamp;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.views;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsStatsDto(timestamp=" + this.timestamp + ", views=" + this.views + ")";
    }

    public UtilsStatsDto(Integer num, Integer num2) {
        this.timestamp = num;
        this.views = num2;
    }

    public /* synthetic */ UtilsStatsDto(Integer num, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
