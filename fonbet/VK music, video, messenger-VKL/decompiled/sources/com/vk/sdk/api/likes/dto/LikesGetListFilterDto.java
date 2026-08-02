package com.vk.sdk.api.likes.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesGetListFilterDto.kt */
/* loaded from: classes5.dex */
public final class LikesGetListFilterDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesGetListFilterDto[] $VALUES;

    @pmi0("copies")
    public static final LikesGetListFilterDto COPIES;

    @pmi0("likes")
    public static final LikesGetListFilterDto LIKES;
    private final String value;

    static {
        LikesGetListFilterDto likesGetListFilterDto = new LikesGetListFilterDto("LIKES", 0, "likes");
        LIKES = likesGetListFilterDto;
        LikesGetListFilterDto likesGetListFilterDto2 = new LikesGetListFilterDto("COPIES", 1, "copies");
        COPIES = likesGetListFilterDto2;
        LikesGetListFilterDto[] likesGetListFilterDtoArr = {likesGetListFilterDto, likesGetListFilterDto2};
        $VALUES = likesGetListFilterDtoArr;
        $ENTRIES = new asp(likesGetListFilterDtoArr);
    }

    private LikesGetListFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static LikesGetListFilterDto valueOf(String str) {
        return (LikesGetListFilterDto) Enum.valueOf(LikesGetListFilterDto.class, str);
    }

    public static LikesGetListFilterDto[] values() {
        return (LikesGetListFilterDto[]) $VALUES.clone();
    }
}
