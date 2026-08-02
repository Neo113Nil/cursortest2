package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsGetRequestsSortDto.kt */
/* loaded from: classes5.dex */
public final class FriendsGetRequestsSortDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsGetRequestsSortDto[] $VALUES;

    @pmi0("0")
    public static final FriendsGetRequestsSortDto DATE;

    @pmi0("1")
    public static final FriendsGetRequestsSortDto MUTUAL;

    @pmi0("2")
    public static final FriendsGetRequestsSortDto ROTATE;
    private final int value;

    static {
        FriendsGetRequestsSortDto friendsGetRequestsSortDto = new FriendsGetRequestsSortDto("DATE", 0, 0);
        DATE = friendsGetRequestsSortDto;
        FriendsGetRequestsSortDto friendsGetRequestsSortDto2 = new FriendsGetRequestsSortDto("MUTUAL", 1, 1);
        MUTUAL = friendsGetRequestsSortDto2;
        FriendsGetRequestsSortDto friendsGetRequestsSortDto3 = new FriendsGetRequestsSortDto("ROTATE", 2, 2);
        ROTATE = friendsGetRequestsSortDto3;
        FriendsGetRequestsSortDto[] friendsGetRequestsSortDtoArr = {friendsGetRequestsSortDto, friendsGetRequestsSortDto2, friendsGetRequestsSortDto3};
        $VALUES = friendsGetRequestsSortDtoArr;
        $ENTRIES = new asp(friendsGetRequestsSortDtoArr);
    }

    private FriendsGetRequestsSortDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static FriendsGetRequestsSortDto valueOf(String str) {
        return (FriendsGetRequestsSortDto) Enum.valueOf(FriendsGetRequestsSortDto.class, str);
    }

    public static FriendsGetRequestsSortDto[] values() {
        return (FriendsGetRequestsSortDto[]) $VALUES.clone();
    }
}
