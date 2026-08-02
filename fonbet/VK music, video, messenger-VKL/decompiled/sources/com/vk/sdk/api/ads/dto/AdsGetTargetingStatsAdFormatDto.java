package com.vk.sdk.api.ads.dto;

import com.ironsource.Gc;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetTargetingStatsAdFormatDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetTargetingStatsAdFormatDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetTargetingStatsAdFormatDto[] $VALUES;

    @pmi0("11")
    public static final AdsGetTargetingStatsAdFormatDto APP_BOARD;

    @pmi0("2")
    public static final AdsGetTargetingStatsAdFormatDto BIG_IMAGE;

    @pmi0(Gc.e)
    public static final AdsGetTargetingStatsAdFormatDto COMMUNITY_SQUARE_IMAGE;

    @pmi0("4")
    public static final AdsGetTargetingStatsAdFormatDto EXCLUSIVE_FORMAT;

    @pmi0("1")
    public static final AdsGetTargetingStatsAdFormatDto IMAGE_AND_TEXT;

    @pmi0("9")
    public static final AdsGetTargetingStatsAdFormatDto POST_IN_COMMUNITY;

    @pmi0("10")
    public static final AdsGetTargetingStatsAdFormatDto SPECIAL_APP_FORMAT;

    @pmi0("6")
    public static final AdsGetTargetingStatsAdFormatDto SPECIAL_COMMUNITY_FORMAT;
    private final int value;

    static {
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto = new AdsGetTargetingStatsAdFormatDto("IMAGE_AND_TEXT", 0, 1);
        IMAGE_AND_TEXT = adsGetTargetingStatsAdFormatDto;
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto2 = new AdsGetTargetingStatsAdFormatDto("BIG_IMAGE", 1, 2);
        BIG_IMAGE = adsGetTargetingStatsAdFormatDto2;
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto3 = new AdsGetTargetingStatsAdFormatDto("EXCLUSIVE_FORMAT", 2, 4);
        EXCLUSIVE_FORMAT = adsGetTargetingStatsAdFormatDto3;
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto4 = new AdsGetTargetingStatsAdFormatDto("COMMUNITY_SQUARE_IMAGE", 3, 7);
        COMMUNITY_SQUARE_IMAGE = adsGetTargetingStatsAdFormatDto4;
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto5 = new AdsGetTargetingStatsAdFormatDto("SPECIAL_APP_FORMAT", 4, 10);
        SPECIAL_APP_FORMAT = adsGetTargetingStatsAdFormatDto5;
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto6 = new AdsGetTargetingStatsAdFormatDto("SPECIAL_COMMUNITY_FORMAT", 5, 6);
        SPECIAL_COMMUNITY_FORMAT = adsGetTargetingStatsAdFormatDto6;
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto7 = new AdsGetTargetingStatsAdFormatDto("POST_IN_COMMUNITY", 6, 9);
        POST_IN_COMMUNITY = adsGetTargetingStatsAdFormatDto7;
        AdsGetTargetingStatsAdFormatDto adsGetTargetingStatsAdFormatDto8 = new AdsGetTargetingStatsAdFormatDto("APP_BOARD", 7, 11);
        APP_BOARD = adsGetTargetingStatsAdFormatDto8;
        AdsGetTargetingStatsAdFormatDto[] adsGetTargetingStatsAdFormatDtoArr = {adsGetTargetingStatsAdFormatDto, adsGetTargetingStatsAdFormatDto2, adsGetTargetingStatsAdFormatDto3, adsGetTargetingStatsAdFormatDto4, adsGetTargetingStatsAdFormatDto5, adsGetTargetingStatsAdFormatDto6, adsGetTargetingStatsAdFormatDto7, adsGetTargetingStatsAdFormatDto8};
        $VALUES = adsGetTargetingStatsAdFormatDtoArr;
        $ENTRIES = new asp(adsGetTargetingStatsAdFormatDtoArr);
    }

    private AdsGetTargetingStatsAdFormatDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AdsGetTargetingStatsAdFormatDto valueOf(String str) {
        return (AdsGetTargetingStatsAdFormatDto) Enum.valueOf(AdsGetTargetingStatsAdFormatDto.class, str);
    }

    public static AdsGetTargetingStatsAdFormatDto[] values() {
        return (AdsGetTargetingStatsAdFormatDto[]) $VALUES.clone();
    }
}
