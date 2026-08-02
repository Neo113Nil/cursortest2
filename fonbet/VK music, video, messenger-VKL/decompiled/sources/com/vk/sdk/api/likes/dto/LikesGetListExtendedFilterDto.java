package com.vk.sdk.api.likes.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesGetListExtendedFilterDto.kt */
/* loaded from: classes5.dex */
public final class LikesGetListExtendedFilterDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesGetListExtendedFilterDto[] $VALUES;

    @pmi0("copies")
    public static final LikesGetListExtendedFilterDto COPIES;

    @pmi0("likes")
    public static final LikesGetListExtendedFilterDto LIKES;
    private final String value;

    static {
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto = new LikesGetListExtendedFilterDto("LIKES", 0, "likes");
        LIKES = likesGetListExtendedFilterDto;
        LikesGetListExtendedFilterDto likesGetListExtendedFilterDto2 = new LikesGetListExtendedFilterDto("COPIES", 1, "copies");
        COPIES = likesGetListExtendedFilterDto2;
        LikesGetListExtendedFilterDto[] likesGetListExtendedFilterDtoArr = {likesGetListExtendedFilterDto, likesGetListExtendedFilterDto2};
        $VALUES = likesGetListExtendedFilterDtoArr;
        $ENTRIES = new asp(likesGetListExtendedFilterDtoArr);
    }

    private LikesGetListExtendedFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static LikesGetListExtendedFilterDto valueOf(String str) {
        return (LikesGetListExtendedFilterDto) Enum.valueOf(LikesGetListExtendedFilterDto.class, str);
    }

    public static LikesGetListExtendedFilterDto[] values() {
        return (LikesGetListExtendedFilterDto[]) $VALUES.clone();
    }
}
