package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecBlockFooterIconDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecBlockFooterIconDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecBlockFooterIconDto[] $VALUES;

    @pmi0("chevron")
    public static final FriendsRecBlockFooterIconDto CHEVRON;
    private final String value;

    static {
        FriendsRecBlockFooterIconDto friendsRecBlockFooterIconDto = new FriendsRecBlockFooterIconDto("CHEVRON", 0, "chevron");
        CHEVRON = friendsRecBlockFooterIconDto;
        FriendsRecBlockFooterIconDto[] friendsRecBlockFooterIconDtoArr = {friendsRecBlockFooterIconDto};
        $VALUES = friendsRecBlockFooterIconDtoArr;
        $ENTRIES = new asp(friendsRecBlockFooterIconDtoArr);
    }

    private FriendsRecBlockFooterIconDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecBlockFooterIconDto valueOf(String str) {
        return (FriendsRecBlockFooterIconDto) Enum.valueOf(FriendsRecBlockFooterIconDto.class, str);
    }

    public static FriendsRecBlockFooterIconDto[] values() {
        return (FriendsRecBlockFooterIconDto[]) $VALUES.clone();
    }
}
