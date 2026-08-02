package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsFriendStatusStatusDto.kt */
/* loaded from: classes5.dex */
public final class FriendsFriendStatusStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsFriendStatusStatusDto[] $VALUES;

    @pmi0("2")
    public static final FriendsFriendStatusStatusDto INCOMING_REQUEST;

    @pmi0("3")
    public static final FriendsFriendStatusStatusDto IS_FRIEND;

    @pmi0("0")
    public static final FriendsFriendStatusStatusDto NOT_A_FRIEND;

    @pmi0("1")
    public static final FriendsFriendStatusStatusDto OUTCOMING_REQUEST;
    private final int value;

    static {
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = new FriendsFriendStatusStatusDto("NOT_A_FRIEND", 0, 0);
        NOT_A_FRIEND = friendsFriendStatusStatusDto;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto2 = new FriendsFriendStatusStatusDto("OUTCOMING_REQUEST", 1, 1);
        OUTCOMING_REQUEST = friendsFriendStatusStatusDto2;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto3 = new FriendsFriendStatusStatusDto("INCOMING_REQUEST", 2, 2);
        INCOMING_REQUEST = friendsFriendStatusStatusDto3;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto4 = new FriendsFriendStatusStatusDto("IS_FRIEND", 3, 3);
        IS_FRIEND = friendsFriendStatusStatusDto4;
        FriendsFriendStatusStatusDto[] friendsFriendStatusStatusDtoArr = {friendsFriendStatusStatusDto, friendsFriendStatusStatusDto2, friendsFriendStatusStatusDto3, friendsFriendStatusStatusDto4};
        $VALUES = friendsFriendStatusStatusDtoArr;
        $ENTRIES = new asp(friendsFriendStatusStatusDtoArr);
    }

    private FriendsFriendStatusStatusDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static FriendsFriendStatusStatusDto valueOf(String str) {
        return (FriendsFriendStatusStatusDto) Enum.valueOf(FriendsFriendStatusStatusDto.class, str);
    }

    public static FriendsFriendStatusStatusDto[] values() {
        return (FriendsFriendStatusStatusDto[]) $VALUES.clone();
    }
}
