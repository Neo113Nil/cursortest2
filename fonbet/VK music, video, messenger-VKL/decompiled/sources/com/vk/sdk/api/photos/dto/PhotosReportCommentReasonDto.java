package com.vk.sdk.api.photos.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosReportCommentReasonDto.kt */
/* loaded from: classes5.dex */
public final class PhotosReportCommentReasonDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosReportCommentReasonDto[] $VALUES;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final PhotosReportCommentReasonDto ADULT_MATERIAL;

    @pmi0("1")
    public static final PhotosReportCommentReasonDto CHILD_PORNOGRAPHY;

    @pmi0("4")
    public static final PhotosReportCommentReasonDto DRUG_PROPAGANDA;

    @pmi0("2")
    public static final PhotosReportCommentReasonDto EXTREMISM;

    @pmi0("6")
    public static final PhotosReportCommentReasonDto INSULT_ABUSE;

    @pmi0("0")
    public static final PhotosReportCommentReasonDto SPAM;

    @pmi0("3")
    public static final PhotosReportCommentReasonDto VIOLENCE;
    private final int value;

    static {
        PhotosReportCommentReasonDto photosReportCommentReasonDto = new PhotosReportCommentReasonDto("SPAM", 0, 0);
        SPAM = photosReportCommentReasonDto;
        PhotosReportCommentReasonDto photosReportCommentReasonDto2 = new PhotosReportCommentReasonDto("CHILD_PORNOGRAPHY", 1, 1);
        CHILD_PORNOGRAPHY = photosReportCommentReasonDto2;
        PhotosReportCommentReasonDto photosReportCommentReasonDto3 = new PhotosReportCommentReasonDto("EXTREMISM", 2, 2);
        EXTREMISM = photosReportCommentReasonDto3;
        PhotosReportCommentReasonDto photosReportCommentReasonDto4 = new PhotosReportCommentReasonDto("VIOLENCE", 3, 3);
        VIOLENCE = photosReportCommentReasonDto4;
        PhotosReportCommentReasonDto photosReportCommentReasonDto5 = new PhotosReportCommentReasonDto("DRUG_PROPAGANDA", 4, 4);
        DRUG_PROPAGANDA = photosReportCommentReasonDto5;
        PhotosReportCommentReasonDto photosReportCommentReasonDto6 = new PhotosReportCommentReasonDto("ADULT_MATERIAL", 5, 5);
        ADULT_MATERIAL = photosReportCommentReasonDto6;
        PhotosReportCommentReasonDto photosReportCommentReasonDto7 = new PhotosReportCommentReasonDto("INSULT_ABUSE", 6, 6);
        INSULT_ABUSE = photosReportCommentReasonDto7;
        PhotosReportCommentReasonDto[] photosReportCommentReasonDtoArr = {photosReportCommentReasonDto, photosReportCommentReasonDto2, photosReportCommentReasonDto3, photosReportCommentReasonDto4, photosReportCommentReasonDto5, photosReportCommentReasonDto6, photosReportCommentReasonDto7};
        $VALUES = photosReportCommentReasonDtoArr;
        $ENTRIES = new asp(photosReportCommentReasonDtoArr);
    }

    private PhotosReportCommentReasonDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static PhotosReportCommentReasonDto valueOf(String str) {
        return (PhotosReportCommentReasonDto) Enum.valueOf(PhotosReportCommentReasonDto.class, str);
    }

    public static PhotosReportCommentReasonDto[] values() {
        return (PhotosReportCommentReasonDto[]) $VALUES.clone();
    }
}
