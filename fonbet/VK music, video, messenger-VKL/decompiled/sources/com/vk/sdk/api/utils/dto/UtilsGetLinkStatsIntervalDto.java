package com.vk.sdk.api.utils.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsGetLinkStatsIntervalDto.kt */
/* loaded from: classes5.dex */
public final class UtilsGetLinkStatsIntervalDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsGetLinkStatsIntervalDto[] $VALUES;

    @pmi0("day")
    public static final UtilsGetLinkStatsIntervalDto DAY;

    @pmi0("forever")
    public static final UtilsGetLinkStatsIntervalDto FOREVER;

    @pmi0("hour")
    public static final UtilsGetLinkStatsIntervalDto HOUR;

    @pmi0("month")
    public static final UtilsGetLinkStatsIntervalDto MONTH;

    @pmi0("week")
    public static final UtilsGetLinkStatsIntervalDto WEEK;
    private final String value;

    static {
        UtilsGetLinkStatsIntervalDto utilsGetLinkStatsIntervalDto = new UtilsGetLinkStatsIntervalDto("DAY", 0, "day");
        DAY = utilsGetLinkStatsIntervalDto;
        UtilsGetLinkStatsIntervalDto utilsGetLinkStatsIntervalDto2 = new UtilsGetLinkStatsIntervalDto("FOREVER", 1, "forever");
        FOREVER = utilsGetLinkStatsIntervalDto2;
        UtilsGetLinkStatsIntervalDto utilsGetLinkStatsIntervalDto3 = new UtilsGetLinkStatsIntervalDto("HOUR", 2, "hour");
        HOUR = utilsGetLinkStatsIntervalDto3;
        UtilsGetLinkStatsIntervalDto utilsGetLinkStatsIntervalDto4 = new UtilsGetLinkStatsIntervalDto("MONTH", 3, "month");
        MONTH = utilsGetLinkStatsIntervalDto4;
        UtilsGetLinkStatsIntervalDto utilsGetLinkStatsIntervalDto5 = new UtilsGetLinkStatsIntervalDto("WEEK", 4, "week");
        WEEK = utilsGetLinkStatsIntervalDto5;
        UtilsGetLinkStatsIntervalDto[] utilsGetLinkStatsIntervalDtoArr = {utilsGetLinkStatsIntervalDto, utilsGetLinkStatsIntervalDto2, utilsGetLinkStatsIntervalDto3, utilsGetLinkStatsIntervalDto4, utilsGetLinkStatsIntervalDto5};
        $VALUES = utilsGetLinkStatsIntervalDtoArr;
        $ENTRIES = new asp(utilsGetLinkStatsIntervalDtoArr);
    }

    private UtilsGetLinkStatsIntervalDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsGetLinkStatsIntervalDto valueOf(String str) {
        return (UtilsGetLinkStatsIntervalDto) Enum.valueOf(UtilsGetLinkStatsIntervalDto.class, str);
    }

    public static UtilsGetLinkStatsIntervalDto[] values() {
        return (UtilsGetLinkStatsIntervalDto[]) $VALUES.clone();
    }
}
