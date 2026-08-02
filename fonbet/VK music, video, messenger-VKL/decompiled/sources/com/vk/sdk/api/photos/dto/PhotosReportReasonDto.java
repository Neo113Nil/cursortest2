package com.vk.sdk.api.photos.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosReportReasonDto.kt */
/* loaded from: classes5.dex */
public final class PhotosReportReasonDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosReportReasonDto[] $VALUES;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final PhotosReportReasonDto ADULT_MATERIAL;

    @pmi0("1")
    public static final PhotosReportReasonDto CHILD_PORNOGRAPHY;

    @pmi0("4")
    public static final PhotosReportReasonDto DRUG_PROPAGANDA;

    @pmi0("2")
    public static final PhotosReportReasonDto EXTREMISM;

    @pmi0("6")
    public static final PhotosReportReasonDto INSULT_ABUSE;

    @pmi0("0")
    public static final PhotosReportReasonDto SPAM;

    @pmi0("8")
    public static final PhotosReportReasonDto SUICIDE_CALLS;

    @pmi0("3")
    public static final PhotosReportReasonDto VIOLENCE;
    private final int value;

    static {
        PhotosReportReasonDto photosReportReasonDto = new PhotosReportReasonDto("SPAM", 0, 0);
        SPAM = photosReportReasonDto;
        PhotosReportReasonDto photosReportReasonDto2 = new PhotosReportReasonDto("CHILD_PORNOGRAPHY", 1, 1);
        CHILD_PORNOGRAPHY = photosReportReasonDto2;
        PhotosReportReasonDto photosReportReasonDto3 = new PhotosReportReasonDto("EXTREMISM", 2, 2);
        EXTREMISM = photosReportReasonDto3;
        PhotosReportReasonDto photosReportReasonDto4 = new PhotosReportReasonDto("VIOLENCE", 3, 3);
        VIOLENCE = photosReportReasonDto4;
        PhotosReportReasonDto photosReportReasonDto5 = new PhotosReportReasonDto("DRUG_PROPAGANDA", 4, 4);
        DRUG_PROPAGANDA = photosReportReasonDto5;
        PhotosReportReasonDto photosReportReasonDto6 = new PhotosReportReasonDto("ADULT_MATERIAL", 5, 5);
        ADULT_MATERIAL = photosReportReasonDto6;
        PhotosReportReasonDto photosReportReasonDto7 = new PhotosReportReasonDto("INSULT_ABUSE", 6, 6);
        INSULT_ABUSE = photosReportReasonDto7;
        PhotosReportReasonDto photosReportReasonDto8 = new PhotosReportReasonDto("SUICIDE_CALLS", 7, 8);
        SUICIDE_CALLS = photosReportReasonDto8;
        PhotosReportReasonDto[] photosReportReasonDtoArr = {photosReportReasonDto, photosReportReasonDto2, photosReportReasonDto3, photosReportReasonDto4, photosReportReasonDto5, photosReportReasonDto6, photosReportReasonDto7, photosReportReasonDto8};
        $VALUES = photosReportReasonDtoArr;
        $ENTRIES = new asp(photosReportReasonDtoArr);
    }

    private PhotosReportReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PhotosReportReasonDto valueOf(String str) {
        return (PhotosReportReasonDto) Enum.valueOf(PhotosReportReasonDto.class, str);
    }

    public static PhotosReportReasonDto[] values() {
        return (PhotosReportReasonDto[]) $VALUES.clone();
    }
}
