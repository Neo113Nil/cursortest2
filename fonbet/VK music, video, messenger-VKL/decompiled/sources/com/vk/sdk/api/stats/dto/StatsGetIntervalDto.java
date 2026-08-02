package com.vk.sdk.api.stats.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StatsGetIntervalDto.kt */
/* loaded from: classes5.dex */
public final class StatsGetIntervalDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StatsGetIntervalDto[] $VALUES;

    @pmi0("all")
    public static final StatsGetIntervalDto ALL;

    @pmi0("day")
    public static final StatsGetIntervalDto DAY;

    @pmi0("month")
    public static final StatsGetIntervalDto MONTH;

    @pmi0("week")
    public static final StatsGetIntervalDto WEEK;

    @pmi0("year")
    public static final StatsGetIntervalDto YEAR;
    private final String value;

    static {
        StatsGetIntervalDto statsGetIntervalDto = new StatsGetIntervalDto("ALL", 0, "all");
        ALL = statsGetIntervalDto;
        StatsGetIntervalDto statsGetIntervalDto2 = new StatsGetIntervalDto("DAY", 1, "day");
        DAY = statsGetIntervalDto2;
        StatsGetIntervalDto statsGetIntervalDto3 = new StatsGetIntervalDto("MONTH", 2, "month");
        MONTH = statsGetIntervalDto3;
        StatsGetIntervalDto statsGetIntervalDto4 = new StatsGetIntervalDto("WEEK", 3, "week");
        WEEK = statsGetIntervalDto4;
        StatsGetIntervalDto statsGetIntervalDto5 = new StatsGetIntervalDto("YEAR", 4, "year");
        YEAR = statsGetIntervalDto5;
        StatsGetIntervalDto[] statsGetIntervalDtoArr = {statsGetIntervalDto, statsGetIntervalDto2, statsGetIntervalDto3, statsGetIntervalDto4, statsGetIntervalDto5};
        $VALUES = statsGetIntervalDtoArr;
        $ENTRIES = new asp(statsGetIntervalDtoArr);
    }

    private StatsGetIntervalDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static StatsGetIntervalDto valueOf(String str) {
        return (StatsGetIntervalDto) Enum.valueOf(StatsGetIntervalDto.class, str);
    }

    public static StatsGetIntervalDto[] values() {
        return (StatsGetIntervalDto[]) $VALUES.clone();
    }
}
