package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecBlockButtonActionTypeDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecBlockButtonActionTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecBlockButtonActionTypeDto[] $VALUES;

    @pmi0("add_friend")
    public static final FriendsRecBlockButtonActionTypeDto ADD_FRIEND;

    @pmi0("delete_friend")
    public static final FriendsRecBlockButtonActionTypeDto DELETE_FRIEND;
    private final String value;

    static {
        FriendsRecBlockButtonActionTypeDto friendsRecBlockButtonActionTypeDto = new FriendsRecBlockButtonActionTypeDto("ADD_FRIEND", 0, "add_friend");
        ADD_FRIEND = friendsRecBlockButtonActionTypeDto;
        FriendsRecBlockButtonActionTypeDto friendsRecBlockButtonActionTypeDto2 = new FriendsRecBlockButtonActionTypeDto("DELETE_FRIEND", 1, "delete_friend");
        DELETE_FRIEND = friendsRecBlockButtonActionTypeDto2;
        FriendsRecBlockButtonActionTypeDto[] friendsRecBlockButtonActionTypeDtoArr = {friendsRecBlockButtonActionTypeDto, friendsRecBlockButtonActionTypeDto2};
        $VALUES = friendsRecBlockButtonActionTypeDtoArr;
        $ENTRIES = new asp(friendsRecBlockButtonActionTypeDtoArr);
    }

    private FriendsRecBlockButtonActionTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecBlockButtonActionTypeDto valueOf(String str) {
        return (FriendsRecBlockButtonActionTypeDto) Enum.valueOf(FriendsRecBlockButtonActionTypeDto.class, str);
    }

    public static FriendsRecBlockButtonActionTypeDto[] values() {
        return (FriendsRecBlockButtonActionTypeDto[]) $VALUES.clone();
    }
}
