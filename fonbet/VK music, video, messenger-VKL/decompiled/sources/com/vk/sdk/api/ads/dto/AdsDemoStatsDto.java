package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsDemoStatsDto.kt */
/* loaded from: classes5.dex */
public final class AdsDemoStatsDto {

    @pmi0("id")
    private final Integer id;

    @pmi0("stats")
    private final List<AdsDemostatsFormatDto> stats;

    @pmi0("type")
    private final AdsObjectTypeDto type;

    public AdsDemoStatsDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsDemoStatsDto)) {
            return false;
        }
        AdsDemoStatsDto adsDemoStatsDto = (AdsDemoStatsDto) obj;
        return epx.f(this.id, adsDemoStatsDto.id) && epx.f(this.stats, adsDemoStatsDto.stats) && this.type == adsDemoStatsDto.type;
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AdsDemostatsFormatDto> list = this.stats;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        AdsObjectTypeDto adsObjectTypeDto = this.type;
        return hashCode2 + (adsObjectTypeDto != null ? adsObjectTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsDemoStatsDto(id=" + this.id + ", stats=" + this.stats + ", type=" + this.type + ")";
    }

    public AdsDemoStatsDto(Integer num, List<AdsDemostatsFormatDto> list, AdsObjectTypeDto adsObjectTypeDto) {
        this.id = num;
        this.stats = list;
        this.type = adsObjectTypeDto;
    }

    public /* synthetic */ AdsDemoStatsDto(Integer num, List list, AdsObjectTypeDto adsObjectTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : adsObjectTypeDto);
    }
}
