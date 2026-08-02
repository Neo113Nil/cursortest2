package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsAddResponseDto.kt */
/* loaded from: classes5.dex */
public final class FriendsAddResponseDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsAddResponseDto[] $VALUES;

    @pmi0("2")
    public static final FriendsAddResponseDto APPROVED;

    @pmi0("4")
    public static final FriendsAddResponseDto RESEND;

    @pmi0("1")
    public static final FriendsAddResponseDto SEND;
    private final int value;

    static {
        FriendsAddResponseDto friendsAddResponseDto = new FriendsAddResponseDto("SEND", 0, 1);
        SEND = friendsAddResponseDto;
        FriendsAddResponseDto friendsAddResponseDto2 = new FriendsAddResponseDto("APPROVED", 1, 2);
        APPROVED = friendsAddResponseDto2;
        FriendsAddResponseDto friendsAddResponseDto3 = new FriendsAddResponseDto("RESEND", 2, 4);
        RESEND = friendsAddResponseDto3;
        FriendsAddResponseDto[] friendsAddResponseDtoArr = {friendsAddResponseDto, friendsAddResponseDto2, friendsAddResponseDto3};
        $VALUES = friendsAddResponseDtoArr;
        $ENTRIES = new asp(friendsAddResponseDtoArr);
    }

    private FriendsAddResponseDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static FriendsAddResponseDto valueOf(String str) {
        return (FriendsAddResponseDto) Enum.valueOf(FriendsAddResponseDto.class, str);
    }

    public static FriendsAddResponseDto[] values() {
        return (FriendsAddResponseDto[]) $VALUES.clone();
    }
}
