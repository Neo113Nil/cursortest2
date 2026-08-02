package com.vk.sdk.api.ads.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetStatisticsStatsFieldsDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetStatisticsStatsFieldsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetStatisticsStatsFieldsDto[] $VALUES;

    @pmi0("views_times")
    public static final AdsGetStatisticsStatsFieldsDto VIEWS_TIMES;
    private final String value;

    static {
        AdsGetStatisticsStatsFieldsDto adsGetStatisticsStatsFieldsDto = new AdsGetStatisticsStatsFieldsDto("VIEWS_TIMES", 0, "views_times");
        VIEWS_TIMES = adsGetStatisticsStatsFieldsDto;
        AdsGetStatisticsStatsFieldsDto[] adsGetStatisticsStatsFieldsDtoArr = {adsGetStatisticsStatsFieldsDto};
        $VALUES = adsGetStatisticsStatsFieldsDtoArr;
        $ENTRIES = new asp(adsGetStatisticsStatsFieldsDtoArr);
    }

    private AdsGetStatisticsStatsFieldsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AdsGetStatisticsStatsFieldsDto valueOf(String str) {
        return (AdsGetStatisticsStatsFieldsDto) Enum.valueOf(AdsGetStatisticsStatsFieldsDto.class, str);
    }

    public static AdsGetStatisticsStatsFieldsDto[] values() {
        return (AdsGetStatisticsStatsFieldsDto[]) $VALUES.clone();
    }
}
