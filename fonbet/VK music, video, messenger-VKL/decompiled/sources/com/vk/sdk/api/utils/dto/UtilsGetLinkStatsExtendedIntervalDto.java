package com.vk.sdk.api.utils.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UtilsGetLinkStatsExtendedIntervalDto.kt */
/* loaded from: classes5.dex */
public final class UtilsGetLinkStatsExtendedIntervalDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UtilsGetLinkStatsExtendedIntervalDto[] $VALUES;

    @pmi0("day")
    public static final UtilsGetLinkStatsExtendedIntervalDto DAY;

    @pmi0("forever")
    public static final UtilsGetLinkStatsExtendedIntervalDto FOREVER;

    @pmi0("hour")
    public static final UtilsGetLinkStatsExtendedIntervalDto HOUR;

    @pmi0("month")
    public static final UtilsGetLinkStatsExtendedIntervalDto MONTH;

    @pmi0("week")
    public static final UtilsGetLinkStatsExtendedIntervalDto WEEK;
    private final String value;

    static {
        UtilsGetLinkStatsExtendedIntervalDto utilsGetLinkStatsExtendedIntervalDto = new UtilsGetLinkStatsExtendedIntervalDto("DAY", 0, "day");
        DAY = utilsGetLinkStatsExtendedIntervalDto;
        UtilsGetLinkStatsExtendedIntervalDto utilsGetLinkStatsExtendedIntervalDto2 = new UtilsGetLinkStatsExtendedIntervalDto("FOREVER", 1, "forever");
        FOREVER = utilsGetLinkStatsExtendedIntervalDto2;
        UtilsGetLinkStatsExtendedIntervalDto utilsGetLinkStatsExtendedIntervalDto3 = new UtilsGetLinkStatsExtendedIntervalDto("HOUR", 2, "hour");
        HOUR = utilsGetLinkStatsExtendedIntervalDto3;
        UtilsGetLinkStatsExtendedIntervalDto utilsGetLinkStatsExtendedIntervalDto4 = new UtilsGetLinkStatsExtendedIntervalDto("MONTH", 3, "month");
        MONTH = utilsGetLinkStatsExtendedIntervalDto4;
        UtilsGetLinkStatsExtendedIntervalDto utilsGetLinkStatsExtendedIntervalDto5 = new UtilsGetLinkStatsExtendedIntervalDto("WEEK", 4, "week");
        WEEK = utilsGetLinkStatsExtendedIntervalDto5;
        UtilsGetLinkStatsExtendedIntervalDto[] utilsGetLinkStatsExtendedIntervalDtoArr = {utilsGetLinkStatsExtendedIntervalDto, utilsGetLinkStatsExtendedIntervalDto2, utilsGetLinkStatsExtendedIntervalDto3, utilsGetLinkStatsExtendedIntervalDto4, utilsGetLinkStatsExtendedIntervalDto5};
        $VALUES = utilsGetLinkStatsExtendedIntervalDtoArr;
        $ENTRIES = new asp(utilsGetLinkStatsExtendedIntervalDtoArr);
    }

    private UtilsGetLinkStatsExtendedIntervalDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UtilsGetLinkStatsExtendedIntervalDto valueOf(String str) {
        return (UtilsGetLinkStatsExtendedIntervalDto) Enum.valueOf(UtilsGetLinkStatsExtendedIntervalDto.class, str);
    }

    public static UtilsGetLinkStatsExtendedIntervalDto[] values() {
        return (UtilsGetLinkStatsExtendedIntervalDto[]) $VALUES.clone();
    }
}
