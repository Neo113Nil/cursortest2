package com.vk.sdk.api.likes.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikesGetListFriendsOnlyDto.kt */
/* loaded from: classes5.dex */
public final class LikesGetListFriendsOnlyDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikesGetListFriendsOnlyDto[] $VALUES;

    @pmi0("0")
    public static final LikesGetListFriendsOnlyDto TYPE_0;

    @pmi0("1")
    public static final LikesGetListFriendsOnlyDto TYPE_1;

    @pmi0("2")
    public static final LikesGetListFriendsOnlyDto TYPE_2;

    @pmi0("3")
    public static final LikesGetListFriendsOnlyDto TYPE_3;
    private final int value;

    static {
        LikesGetListFriendsOnlyDto likesGetListFriendsOnlyDto = new LikesGetListFriendsOnlyDto("TYPE_0", 0, 0);
        TYPE_0 = likesGetListFriendsOnlyDto;
        LikesGetListFriendsOnlyDto likesGetListFriendsOnlyDto2 = new LikesGetListFriendsOnlyDto("TYPE_1", 1, 1);
        TYPE_1 = likesGetListFriendsOnlyDto2;
        LikesGetListFriendsOnlyDto likesGetListFriendsOnlyDto3 = new LikesGetListFriendsOnlyDto("TYPE_2", 2, 2);
        TYPE_2 = likesGetListFriendsOnlyDto3;
        LikesGetListFriendsOnlyDto likesGetListFriendsOnlyDto4 = new LikesGetListFriendsOnlyDto("TYPE_3", 3, 3);
        TYPE_3 = likesGetListFriendsOnlyDto4;
        LikesGetListFriendsOnlyDto[] likesGetListFriendsOnlyDtoArr = {likesGetListFriendsOnlyDto, likesGetListFriendsOnlyDto2, likesGetListFriendsOnlyDto3, likesGetListFriendsOnlyDto4};
        $VALUES = likesGetListFriendsOnlyDtoArr;
        $ENTRIES = new asp(likesGetListFriendsOnlyDtoArr);
    }

    private LikesGetListFriendsOnlyDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static LikesGetListFriendsOnlyDto valueOf(String str) {
        return (LikesGetListFriendsOnlyDto) Enum.valueOf(LikesGetListFriendsOnlyDto.class, str);
    }

    public static LikesGetListFriendsOnlyDto[] values() {
        return (LikesGetListFriendsOnlyDto[]) $VALUES.clone();
    }
}
