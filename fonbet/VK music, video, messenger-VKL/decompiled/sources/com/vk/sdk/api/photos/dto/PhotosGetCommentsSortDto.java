package com.vk.sdk.api.photos.dto;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhotosGetCommentsSortDto.kt */
/* loaded from: classes5.dex */
public final class PhotosGetCommentsSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PhotosGetCommentsSortDto[] $VALUES;

    @pmi0(CampaignEx.JSON_KEY_DESC)
    public static final PhotosGetCommentsSortDto NEW_FIRST;

    @pmi0("asc")
    public static final PhotosGetCommentsSortDto OLD_FIRST;
    private final String value;

    static {
        PhotosGetCommentsSortDto photosGetCommentsSortDto = new PhotosGetCommentsSortDto("OLD_FIRST", 0, "asc");
        OLD_FIRST = photosGetCommentsSortDto;
        PhotosGetCommentsSortDto photosGetCommentsSortDto2 = new PhotosGetCommentsSortDto("NEW_FIRST", 1, CampaignEx.JSON_KEY_DESC);
        NEW_FIRST = photosGetCommentsSortDto2;
        PhotosGetCommentsSortDto[] photosGetCommentsSortDtoArr = {photosGetCommentsSortDto, photosGetCommentsSortDto2};
        $VALUES = photosGetCommentsSortDtoArr;
        $ENTRIES = new asp(photosGetCommentsSortDtoArr);
    }

    private PhotosGetCommentsSortDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static PhotosGetCommentsSortDto valueOf(String str) {
        return (PhotosGetCommentsSortDto) Enum.valueOf(PhotosGetCommentsSortDto.class, str);
    }

    public static PhotosGetCommentsSortDto[] values() {
        return (PhotosGetCommentsSortDto[]) $VALUES.clone();
    }
}
