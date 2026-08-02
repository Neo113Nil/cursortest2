package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountPushParamsOnoffDto.kt */
/* loaded from: classes5.dex */
public final class AccountPushParamsOnoffDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountPushParamsOnoffDto[] $VALUES;

    @pmi0("off")
    public static final AccountPushParamsOnoffDto OFF;

    @pmi0("on")
    public static final AccountPushParamsOnoffDto ON;
    private final String value;

    static {
        AccountPushParamsOnoffDto accountPushParamsOnoffDto = new AccountPushParamsOnoffDto("ON", 0, "on");
        ON = accountPushParamsOnoffDto;
        AccountPushParamsOnoffDto accountPushParamsOnoffDto2 = new AccountPushParamsOnoffDto("OFF", 1, "off");
        OFF = accountPushParamsOnoffDto2;
        AccountPushParamsOnoffDto[] accountPushParamsOnoffDtoArr = {accountPushParamsOnoffDto, accountPushParamsOnoffDto2};
        $VALUES = accountPushParamsOnoffDtoArr;
        $ENTRIES = new asp(accountPushParamsOnoffDtoArr);
    }

    private AccountPushParamsOnoffDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountPushParamsOnoffDto valueOf(String str) {
        return (AccountPushParamsOnoffDto) Enum.valueOf(AccountPushParamsOnoffDto.class, str);
    }

    public static AccountPushParamsOnoffDto[] values() {
        return (AccountPushParamsOnoffDto[]) $VALUES.clone();
    }
}
