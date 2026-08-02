package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSaveProfileInfoBdateVisibilityDto.kt */
/* loaded from: classes5.dex */
public final class AccountSaveProfileInfoBdateVisibilityDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSaveProfileInfoBdateVisibilityDto[] $VALUES;

    @pmi0("0")
    public static final AccountSaveProfileInfoBdateVisibilityDto HIDE;

    @pmi0("2")
    public static final AccountSaveProfileInfoBdateVisibilityDto HIDE_YEAR;

    @pmi0("1")
    public static final AccountSaveProfileInfoBdateVisibilityDto SHOW;
    private final int value;

    static {
        AccountSaveProfileInfoBdateVisibilityDto accountSaveProfileInfoBdateVisibilityDto = new AccountSaveProfileInfoBdateVisibilityDto("HIDE", 0, 0);
        HIDE = accountSaveProfileInfoBdateVisibilityDto;
        AccountSaveProfileInfoBdateVisibilityDto accountSaveProfileInfoBdateVisibilityDto2 = new AccountSaveProfileInfoBdateVisibilityDto("SHOW", 1, 1);
        SHOW = accountSaveProfileInfoBdateVisibilityDto2;
        AccountSaveProfileInfoBdateVisibilityDto accountSaveProfileInfoBdateVisibilityDto3 = new AccountSaveProfileInfoBdateVisibilityDto("HIDE_YEAR", 2, 2);
        HIDE_YEAR = accountSaveProfileInfoBdateVisibilityDto3;
        AccountSaveProfileInfoBdateVisibilityDto[] accountSaveProfileInfoBdateVisibilityDtoArr = {accountSaveProfileInfoBdateVisibilityDto, accountSaveProfileInfoBdateVisibilityDto2, accountSaveProfileInfoBdateVisibilityDto3};
        $VALUES = accountSaveProfileInfoBdateVisibilityDtoArr;
        $ENTRIES = new asp(accountSaveProfileInfoBdateVisibilityDtoArr);
    }

    private AccountSaveProfileInfoBdateVisibilityDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountSaveProfileInfoBdateVisibilityDto valueOf(String str) {
        return (AccountSaveProfileInfoBdateVisibilityDto) Enum.valueOf(AccountSaveProfileInfoBdateVisibilityDto.class, str);
    }

    public static AccountSaveProfileInfoBdateVisibilityDto[] values() {
        return (AccountSaveProfileInfoBdateVisibilityDto[]) $VALUES.clone();
    }
}
