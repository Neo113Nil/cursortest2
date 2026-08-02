package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetDemographicsPeriodDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetDemographicsPeriodDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetDemographicsPeriodDto[] $VALUES;

    @pmi0("day")
    public static final AdsGetDemographicsPeriodDto DAY;

    @pmi0("month")
    public static final AdsGetDemographicsPeriodDto MONTH;

    @pmi0("overall")
    public static final AdsGetDemographicsPeriodDto OVERALL;
    private final String value;

    static {
        AdsGetDemographicsPeriodDto adsGetDemographicsPeriodDto = new AdsGetDemographicsPeriodDto("DAY", 0, "day");
        DAY = adsGetDemographicsPeriodDto;
        AdsGetDemographicsPeriodDto adsGetDemographicsPeriodDto2 = new AdsGetDemographicsPeriodDto("MONTH", 1, "month");
        MONTH = adsGetDemographicsPeriodDto2;
        AdsGetDemographicsPeriodDto adsGetDemographicsPeriodDto3 = new AdsGetDemographicsPeriodDto("OVERALL", 2, "overall");
        OVERALL = adsGetDemographicsPeriodDto3;
        AdsGetDemographicsPeriodDto[] adsGetDemographicsPeriodDtoArr = {adsGetDemographicsPeriodDto, adsGetDemographicsPeriodDto2, adsGetDemographicsPeriodDto3};
        $VALUES = adsGetDemographicsPeriodDtoArr;
        $ENTRIES = new asp(adsGetDemographicsPeriodDtoArr);
    }

    private AdsGetDemographicsPeriodDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetDemographicsPeriodDto valueOf(String str) {
        return (AdsGetDemographicsPeriodDto) Enum.valueOf(AdsGetDemographicsPeriodDto.class, str);
    }

    public static AdsGetDemographicsPeriodDto[] values() {
        return (AdsGetDemographicsPeriodDto[]) $VALUES.clone();
    }
}
