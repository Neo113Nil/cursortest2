package com.vk.sdk.api.stats.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StatsPeriodDto.kt */
/* loaded from: classes5.dex */
public final class StatsPeriodDto {

    @pmi0("activity")
    private final StatsActivityDto activity;

    @pmi0("period_from")
    private final Integer periodFrom;

    @pmi0("period_to")
    private final Integer periodTo;

    @pmi0("reach")
    private final StatsReachOneOfDto reach;

    @pmi0("visitors")
    private final StatsVisitorsOneOfDto visitors;

    public StatsPeriodDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsPeriodDto)) {
            return false;
        }
        StatsPeriodDto statsPeriodDto = (StatsPeriodDto) obj;
        return epx.f(this.activity, statsPeriodDto.activity) && epx.f(this.periodFrom, statsPeriodDto.periodFrom) && epx.f(this.periodTo, statsPeriodDto.periodTo) && epx.f(this.reach, statsPeriodDto.reach) && epx.f(this.visitors, statsPeriodDto.visitors);
    }

    public final int hashCode() {
        StatsActivityDto statsActivityDto = this.activity;
        int hashCode = (statsActivityDto == null ? 0 : statsActivityDto.hashCode()) * 31;
        Integer num = this.periodFrom;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.periodTo;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        StatsReachOneOfDto statsReachOneOfDto = this.reach;
        int hashCode4 = (hashCode3 + (statsReachOneOfDto == null ? 0 : statsReachOneOfDto.hashCode())) * 31;
        StatsVisitorsOneOfDto statsVisitorsOneOfDto = this.visitors;
        return hashCode4 + (statsVisitorsOneOfDto != null ? statsVisitorsOneOfDto.hashCode() : 0);
    }

    public final String toString() {
        return "StatsPeriodDto(activity=" + this.activity + ", periodFrom=" + this.periodFrom + ", periodTo=" + this.periodTo + ", reach=" + this.reach + ", visitors=" + this.visitors + ")";
    }

    public StatsPeriodDto(StatsActivityDto statsActivityDto, Integer num, Integer num2, StatsReachOneOfDto statsReachOneOfDto, StatsVisitorsOneOfDto statsVisitorsOneOfDto) {
        this.activity = statsActivityDto;
        this.periodFrom = num;
        this.periodTo = num2;
        this.reach = statsReachOneOfDto;
        this.visitors = statsVisitorsOneOfDto;
    }

    public /* synthetic */ StatsPeriodDto(StatsActivityDto statsActivityDto, Integer num, Integer num2, StatsReachOneOfDto statsReachOneOfDto, StatsVisitorsOneOfDto statsVisitorsOneOfDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : statsActivityDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : statsReachOneOfDto, (i & 16) != 0 ? null : statsVisitorsOneOfDto);
    }
}
