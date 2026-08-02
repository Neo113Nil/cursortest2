package com.vk.sdk.api.apps.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppsGetFriendsListTypeDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetFriendsListTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AppsGetFriendsListTypeDto[] $VALUES;

    @pmi0("invite")
    public static final AppsGetFriendsListTypeDto INVITE;

    @pmi0("request")
    public static final AppsGetFriendsListTypeDto REQUEST;
    private final String value;

    static {
        AppsGetFriendsListTypeDto appsGetFriendsListTypeDto = new AppsGetFriendsListTypeDto("INVITE", 0, "invite");
        INVITE = appsGetFriendsListTypeDto;
        AppsGetFriendsListTypeDto appsGetFriendsListTypeDto2 = new AppsGetFriendsListTypeDto("REQUEST", 1, "request");
        REQUEST = appsGetFriendsListTypeDto2;
        AppsGetFriendsListTypeDto[] appsGetFriendsListTypeDtoArr = {appsGetFriendsListTypeDto, appsGetFriendsListTypeDto2};
        $VALUES = appsGetFriendsListTypeDtoArr;
        $ENTRIES = new asp(appsGetFriendsListTypeDtoArr);
    }

    private AppsGetFriendsListTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AppsGetFriendsListTypeDto valueOf(String str) {
        return (AppsGetFriendsListTypeDto) Enum.valueOf(AppsGetFriendsListTypeDto.class, str);
    }

    public static AppsGetFriendsListTypeDto[] values() {
        return (AppsGetFriendsListTypeDto[]) $VALUES.clone();
    }
}
