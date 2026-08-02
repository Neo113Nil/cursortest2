package com.vk.sdk.api.friends.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FriendsRecDescriptionIconDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecDescriptionIconDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FriendsRecDescriptionIconDto[] $VALUES;

    @pmi0("education")
    public static final FriendsRecDescriptionIconDto EDUCATION;
    private final String value;

    static {
        FriendsRecDescriptionIconDto friendsRecDescriptionIconDto = new FriendsRecDescriptionIconDto("EDUCATION", 0, "education");
        EDUCATION = friendsRecDescriptionIconDto;
        FriendsRecDescriptionIconDto[] friendsRecDescriptionIconDtoArr = {friendsRecDescriptionIconDto};
        $VALUES = friendsRecDescriptionIconDtoArr;
        $ENTRIES = new asp(friendsRecDescriptionIconDtoArr);
    }

    private FriendsRecDescriptionIconDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static FriendsRecDescriptionIconDto valueOf(String str) {
        return (FriendsRecDescriptionIconDto) Enum.valueOf(FriendsRecDescriptionIconDto.class, str);
    }

    public static FriendsRecDescriptionIconDto[] values() {
        return (FriendsRecDescriptionIconDto[]) $VALUES.clone();
    }
}
