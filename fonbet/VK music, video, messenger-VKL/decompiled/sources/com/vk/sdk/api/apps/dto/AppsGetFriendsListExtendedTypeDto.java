package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetFriendsListExtendedTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetFriendsListExtendedTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetFriendsListExtendedTypeDto[] $VALUES;

    @pmi0("invite")
    public static final AppsGetFriendsListExtendedTypeDto INVITE;

    @pmi0("request")
    public static final AppsGetFriendsListExtendedTypeDto REQUEST;
    private final String value;

    static {
        AppsGetFriendsListExtendedTypeDto appsGetFriendsListExtendedTypeDto = new AppsGetFriendsListExtendedTypeDto("INVITE", 0, "invite");
        INVITE = appsGetFriendsListExtendedTypeDto;
        AppsGetFriendsListExtendedTypeDto appsGetFriendsListExtendedTypeDto2 = new AppsGetFriendsListExtendedTypeDto("REQUEST", 1, "request");
        REQUEST = appsGetFriendsListExtendedTypeDto2;
        AppsGetFriendsListExtendedTypeDto[] appsGetFriendsListExtendedTypeDtoArr = {appsGetFriendsListExtendedTypeDto, appsGetFriendsListExtendedTypeDto2};
        $VALUES = appsGetFriendsListExtendedTypeDtoArr;
        $ENTRIES = new asp(appsGetFriendsListExtendedTypeDtoArr);
    }

    private AppsGetFriendsListExtendedTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetFriendsListExtendedTypeDto valueOf(String str) {
        return (AppsGetFriendsListExtendedTypeDto) Enum.valueOf(AppsGetFriendsListExtendedTypeDto.class, str);
    }

    public static AppsGetFriendsListExtendedTypeDto[] values() {
        return (AppsGetFriendsListExtendedTypeDto[]) $VALUES.clone();
    }
}
