package com.vk.sdk.api.utils.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsLinkStatsDto.kt */
/* loaded from: classes5.dex */
public final class UtilsLinkStatsDto {

    @pmi0("key")
    private final String key;

    @pmi0("stats")
    private final List<UtilsStatsDto> stats;

    /* JADX WARN: Multi-variable type inference failed */
    public UtilsLinkStatsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsLinkStatsDto)) {
            return false;
        }
        UtilsLinkStatsDto utilsLinkStatsDto = (UtilsLinkStatsDto) obj;
        return epx.f(this.key, utilsLinkStatsDto.key) && epx.f(this.stats, utilsLinkStatsDto.stats);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UtilsStatsDto> list = this.stats;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsLinkStatsDto(key=" + this.key + ", stats=" + this.stats + ")";
    }

    public UtilsLinkStatsDto(String str, List<UtilsStatsDto> list) {
        this.key = str;
        this.stats = list;
    }

    public /* synthetic */ UtilsLinkStatsDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
