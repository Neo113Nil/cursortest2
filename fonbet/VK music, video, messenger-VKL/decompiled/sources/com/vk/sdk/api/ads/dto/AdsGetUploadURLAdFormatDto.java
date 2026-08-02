package com.vk.sdk.api.ads.dto;

import com.ironsource.Gc;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdsGetUploadURLAdFormatDto.kt */
/* loaded from: classes5.dex */
public final class AdsGetUploadURLAdFormatDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdsGetUploadURLAdFormatDto[] $VALUES;

    @pmi0("11")
    public static final AdsGetUploadURLAdFormatDto ADAPTIVE;

    @pmi0("2")
    public static final AdsGetUploadURLAdFormatDto BIG_IMAGE;

    @pmi0("4")
    public static final AdsGetUploadURLAdFormatDto COMMUNITY_SQUARE_IMAGE;

    @pmi0("10")
    public static final AdsGetUploadURLAdFormatDto EXCLUSIVE_FORMAT;

    @pmi0("1")
    public static final AdsGetUploadURLAdFormatDto IMAGE_AND_TEXT;

    @pmi0(Gc.e)
    public static final AdsGetUploadURLAdFormatDto SPECIAL_APP_FORMAT;
    private final int value;

    static {
        AdsGetUploadURLAdFormatDto adsGetUploadURLAdFormatDto = new AdsGetUploadURLAdFormatDto("IMAGE_AND_TEXT", 0, 1);
        IMAGE_AND_TEXT = adsGetUploadURLAdFormatDto;
        AdsGetUploadURLAdFormatDto adsGetUploadURLAdFormatDto2 = new AdsGetUploadURLAdFormatDto("BIG_IMAGE", 1, 2);
        BIG_IMAGE = adsGetUploadURLAdFormatDto2;
        AdsGetUploadURLAdFormatDto adsGetUploadURLAdFormatDto3 = new AdsGetUploadURLAdFormatDto("COMMUNITY_SQUARE_IMAGE", 2, 4);
        COMMUNITY_SQUARE_IMAGE = adsGetUploadURLAdFormatDto3;
        AdsGetUploadURLAdFormatDto adsGetUploadURLAdFormatDto4 = new AdsGetUploadURLAdFormatDto("SPECIAL_APP_FORMAT", 3, 7);
        SPECIAL_APP_FORMAT = adsGetUploadURLAdFormatDto4;
        AdsGetUploadURLAdFormatDto adsGetUploadURLAdFormatDto5 = new AdsGetUploadURLAdFormatDto("EXCLUSIVE_FORMAT", 4, 10);
        EXCLUSIVE_FORMAT = adsGetUploadURLAdFormatDto5;
        AdsGetUploadURLAdFormatDto adsGetUploadURLAdFormatDto6 = new AdsGetUploadURLAdFormatDto("ADAPTIVE", 5, 11);
        ADAPTIVE = adsGetUploadURLAdFormatDto6;
        AdsGetUploadURLAdFormatDto[] adsGetUploadURLAdFormatDtoArr = {adsGetUploadURLAdFormatDto, adsGetUploadURLAdFormatDto2, adsGetUploadURLAdFormatDto3, adsGetUploadURLAdFormatDto4, adsGetUploadURLAdFormatDto5, adsGetUploadURLAdFormatDto6};
        $VALUES = adsGetUploadURLAdFormatDtoArr;
        $ENTRIES = new asp(adsGetUploadURLAdFormatDtoArr);
    }

    private AdsGetUploadURLAdFormatDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AdsGetUploadURLAdFormatDto valueOf(String str) {
        return (AdsGetUploadURLAdFormatDto) Enum.valueOf(AdsGetUploadURLAdFormatDto.class, str);
    }

    public static AdsGetUploadURLAdFormatDto[] values() {
        return (AdsGetUploadURLAdFormatDto[]) $VALUES.clone();
    }
}
