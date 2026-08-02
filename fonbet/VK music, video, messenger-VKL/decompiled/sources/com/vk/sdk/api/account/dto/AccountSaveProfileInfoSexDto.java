package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSaveProfileInfoSexDto.kt */
/* loaded from: classes5.dex */
public final class AccountSaveProfileInfoSexDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSaveProfileInfoSexDto[] $VALUES;

    @pmi0("1")
    public static final AccountSaveProfileInfoSexDto FEMALE;

    @pmi0("2")
    public static final AccountSaveProfileInfoSexDto MALE;

    @pmi0("0")
    public static final AccountSaveProfileInfoSexDto UNDEFINED;
    private final int value;

    static {
        AccountSaveProfileInfoSexDto accountSaveProfileInfoSexDto = new AccountSaveProfileInfoSexDto("UNDEFINED", 0, 0);
        UNDEFINED = accountSaveProfileInfoSexDto;
        AccountSaveProfileInfoSexDto accountSaveProfileInfoSexDto2 = new AccountSaveProfileInfoSexDto("FEMALE", 1, 1);
        FEMALE = accountSaveProfileInfoSexDto2;
        AccountSaveProfileInfoSexDto accountSaveProfileInfoSexDto3 = new AccountSaveProfileInfoSexDto("MALE", 2, 2);
        MALE = accountSaveProfileInfoSexDto3;
        AccountSaveProfileInfoSexDto[] accountSaveProfileInfoSexDtoArr = {accountSaveProfileInfoSexDto, accountSaveProfileInfoSexDto2, accountSaveProfileInfoSexDto3};
        $VALUES = accountSaveProfileInfoSexDtoArr;
        $ENTRIES = new asp(accountSaveProfileInfoSexDtoArr);
    }

    private AccountSaveProfileInfoSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountSaveProfileInfoSexDto valueOf(String str) {
        return (AccountSaveProfileInfoSexDto) Enum.valueOf(AccountSaveProfileInfoSexDto.class, str);
    }

    public static AccountSaveProfileInfoSexDto[] values() {
        return (AccountSaveProfileInfoSexDto[]) $VALUES.clone();
    }
}
