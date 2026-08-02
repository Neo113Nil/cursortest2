package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsStatsDto.kt */
/* loaded from: classes5.dex */
public final class AdsStatsDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("stats")
    private final List<AdsStatsFormatDto> stats;

    @pmi0("type")
    private final AdsObjectTypeDto type;

    @pmi0("views_times")
    private final AdsStatsViewsTimesDto viewsTimes;

    public AdsStatsDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStatsDto)) {
            return false;
        }
        AdsStatsDto adsStatsDto = (AdsStatsDto) obj;
        return epx.f(this.id, adsStatsDto.id) && epx.f(this.stats, adsStatsDto.stats) && this.type == adsStatsDto.type && epx.f(this.viewsTimes, adsStatsDto.viewsTimes);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AdsStatsFormatDto> list = this.stats;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AdsObjectTypeDto adsObjectTypeDto = this.type;
        int hashCode3 = (hashCode2 + (adsObjectTypeDto == null ? 0 : adsObjectTypeDto.hashCode())) * 31;
        AdsStatsViewsTimesDto adsStatsViewsTimesDto = this.viewsTimes;
        return hashCode3 + (adsStatsViewsTimesDto != null ? adsStatsViewsTimesDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsStatsDto(id=" + this.id + ", stats=" + this.stats + ", type=" + this.type + ", viewsTimes=" + this.viewsTimes + ")";
    }

    public AdsStatsDto(Integer num, List<AdsStatsFormatDto> list, AdsObjectTypeDto adsObjectTypeDto, AdsStatsViewsTimesDto adsStatsViewsTimesDto) {
        this.id = num;
        this.stats = list;
        this.type = adsObjectTypeDto;
        this.viewsTimes = adsStatsViewsTimesDto;
    }

    public /* synthetic */ AdsStatsDto(Integer num, List list, AdsObjectTypeDto adsObjectTypeDto, AdsStatsViewsTimesDto adsStatsViewsTimesDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : adsObjectTypeDto, (i & 8) != 0 ? null : adsStatsViewsTimesDto);
    }
}
