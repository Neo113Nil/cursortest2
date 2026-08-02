package com.vk.sdk.api.users.dto;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UsersUserTypeDto.kt */
/* loaded from: classes5.dex */
public final class UsersUserTypeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UsersUserTypeDto[] $VALUES;

    @pmi0("email")
    public static final UsersUserTypeDto EMAIL;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final UsersUserTypeDto PROFILE;
    private final String value;

    static {
        UsersUserTypeDto usersUserTypeDto = new UsersUserTypeDto("PROFILE", 0, CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        PROFILE = usersUserTypeDto;
        UsersUserTypeDto usersUserTypeDto2 = new UsersUserTypeDto(CommonConstant.RETKEY.EMAIL, 1, "email");
        EMAIL = usersUserTypeDto2;
        UsersUserTypeDto[] usersUserTypeDtoArr = {usersUserTypeDto, usersUserTypeDto2};
        $VALUES = usersUserTypeDtoArr;
        $ENTRIES = new asp(usersUserTypeDtoArr);
    }

    private UsersUserTypeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static UsersUserTypeDto valueOf(String str) {
        return (UsersUserTypeDto) Enum.valueOf(UsersUserTypeDto.class, str);
    }

    public static UsersUserTypeDto[] values() {
        return (UsersUserTypeDto[]) $VALUES.clone();
    }
}
