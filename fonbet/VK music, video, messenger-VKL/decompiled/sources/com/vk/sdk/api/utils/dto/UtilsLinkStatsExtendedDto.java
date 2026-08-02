package com.vk.sdk.api.utils.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: UtilsLinkStatsExtendedDto.kt */
/* loaded from: classes5.dex */
public final class UtilsLinkStatsExtendedDto {

    @pmi0("key")
    private final String key;

    @pmi0("stats")
    private final List<UtilsStatsExtendedDto> stats;

    /* JADX WARN: Multi-variable type inference failed */
    public UtilsLinkStatsExtendedDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilsLinkStatsExtendedDto)) {
            return false;
        }
        UtilsLinkStatsExtendedDto utilsLinkStatsExtendedDto = (UtilsLinkStatsExtendedDto) obj;
        return epx.f(this.key, utilsLinkStatsExtendedDto.key) && epx.f(this.stats, utilsLinkStatsExtendedDto.stats);
    }

    public final int hashCode() {
        String str = this.key;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<UtilsStatsExtendedDto> list = this.stats;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "UtilsLinkStatsExtendedDto(key=" + this.key + ", stats=" + this.stats + ")";
    }

    public UtilsLinkStatsExtendedDto(String str, List<UtilsStatsExtendedDto> list) {
        this.key = str;
        this.stats = list;
    }

    public /* synthetic */ UtilsLinkStatsExtendedDto(String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
