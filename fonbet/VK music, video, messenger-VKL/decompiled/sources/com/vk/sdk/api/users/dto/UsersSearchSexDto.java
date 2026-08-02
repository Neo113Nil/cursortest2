package com.vk.sdk.api.users.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersSearchSexDto.kt */
/* loaded from: classes5.dex */
public final class UsersSearchSexDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersSearchSexDto[] $VALUES;

    @pmi0("0")
    public static final UsersSearchSexDto ANY;

    @pmi0("1")
    public static final UsersSearchSexDto FEMALE;

    @pmi0("2")
    public static final UsersSearchSexDto MALE;
    private final int value;

    static {
        UsersSearchSexDto usersSearchSexDto = new UsersSearchSexDto("ANY", 0, 0);
        ANY = usersSearchSexDto;
        UsersSearchSexDto usersSearchSexDto2 = new UsersSearchSexDto("FEMALE", 1, 1);
        FEMALE = usersSearchSexDto2;
        UsersSearchSexDto usersSearchSexDto3 = new UsersSearchSexDto("MALE", 2, 2);
        MALE = usersSearchSexDto3;
        UsersSearchSexDto[] usersSearchSexDtoArr = {usersSearchSexDto, usersSearchSexDto2, usersSearchSexDto3};
        $VALUES = usersSearchSexDtoArr;
        $ENTRIES = new asp(usersSearchSexDtoArr);
    }

    private UsersSearchSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static UsersSearchSexDto valueOf(String str) {
        return (UsersSearchSexDto) Enum.valueOf(UsersSearchSexDto.class, str);
    }

    public static UsersSearchSexDto[] values() {
        return (UsersSearchSexDto[]) $VALUES.clone();
    }
}
