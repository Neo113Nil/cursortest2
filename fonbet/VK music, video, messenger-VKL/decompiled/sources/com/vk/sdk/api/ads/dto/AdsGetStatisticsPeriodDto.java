package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetStatisticsPeriodDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetStatisticsPeriodDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetStatisticsPeriodDto[] $VALUES;

    @pmi0("day")
    public static final AdsGetStatisticsPeriodDto DAY;

    @pmi0("month")
    public static final AdsGetStatisticsPeriodDto MONTH;

    @pmi0("overall")
    public static final AdsGetStatisticsPeriodDto OVERALL;

    @pmi0("week")
    public static final AdsGetStatisticsPeriodDto WEEK;

    @pmi0("year")
    public static final AdsGetStatisticsPeriodDto YEAR;
    private final String value;

    static {
        AdsGetStatisticsPeriodDto adsGetStatisticsPeriodDto = new AdsGetStatisticsPeriodDto("DAY", 0, "day");
        DAY = adsGetStatisticsPeriodDto;
        AdsGetStatisticsPeriodDto adsGetStatisticsPeriodDto2 = new AdsGetStatisticsPeriodDto("MONTH", 1, "month");
        MONTH = adsGetStatisticsPeriodDto2;
        AdsGetStatisticsPeriodDto adsGetStatisticsPeriodDto3 = new AdsGetStatisticsPeriodDto("OVERALL", 2, "overall");
        OVERALL = adsGetStatisticsPeriodDto3;
        AdsGetStatisticsPeriodDto adsGetStatisticsPeriodDto4 = new AdsGetStatisticsPeriodDto("WEEK", 3, "week");
        WEEK = adsGetStatisticsPeriodDto4;
        AdsGetStatisticsPeriodDto adsGetStatisticsPeriodDto5 = new AdsGetStatisticsPeriodDto("YEAR", 4, "year");
        YEAR = adsGetStatisticsPeriodDto5;
        AdsGetStatisticsPeriodDto[] adsGetStatisticsPeriodDtoArr = {adsGetStatisticsPeriodDto, adsGetStatisticsPeriodDto2, adsGetStatisticsPeriodDto3, adsGetStatisticsPeriodDto4, adsGetStatisticsPeriodDto5};
        $VALUES = adsGetStatisticsPeriodDtoArr;
        $ENTRIES = new asp(adsGetStatisticsPeriodDtoArr);
    }

    private AdsGetStatisticsPeriodDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetStatisticsPeriodDto valueOf(String str) {
        return (AdsGetStatisticsPeriodDto) Enum.valueOf(AdsGetStatisticsPeriodDto.class, str);
    }

    public static AdsGetStatisticsPeriodDto[] values() {
        return (AdsGetStatisticsPeriodDto[]) $VALUES.clone();
    }
}
