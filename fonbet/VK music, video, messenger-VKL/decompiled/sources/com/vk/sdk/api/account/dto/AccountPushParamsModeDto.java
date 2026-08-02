package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountPushParamsModeDto.kt */
/* loaded from: classes5.dex */
public final class AccountPushParamsModeDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountPushParamsModeDto[] $VALUES;

    @pmi0("no_sound")
    public static final AccountPushParamsModeDto NO_SOUND;

    @pmi0("no_text")
    public static final AccountPushParamsModeDto NO_TEXT;

    @pmi0("off")
    public static final AccountPushParamsModeDto OFF;

    @pmi0("on")
    public static final AccountPushParamsModeDto ON;
    private final String value;

    static {
        AccountPushParamsModeDto accountPushParamsModeDto = new AccountPushParamsModeDto("ON", 0, "on");
        ON = accountPushParamsModeDto;
        AccountPushParamsModeDto accountPushParamsModeDto2 = new AccountPushParamsModeDto("OFF", 1, "off");
        OFF = accountPushParamsModeDto2;
        AccountPushParamsModeDto accountPushParamsModeDto3 = new AccountPushParamsModeDto("NO_SOUND", 2, "no_sound");
        NO_SOUND = accountPushParamsModeDto3;
        AccountPushParamsModeDto accountPushParamsModeDto4 = new AccountPushParamsModeDto("NO_TEXT", 3, "no_text");
        NO_TEXT = accountPushParamsModeDto4;
        AccountPushParamsModeDto[] accountPushParamsModeDtoArr = {accountPushParamsModeDto, accountPushParamsModeDto2, accountPushParamsModeDto3, accountPushParamsModeDto4};
        $VALUES = accountPushParamsModeDtoArr;
        $ENTRIES = new asp(accountPushParamsModeDtoArr);
    }

    private AccountPushParamsModeDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountPushParamsModeDto valueOf(String str) {
        return (AccountPushParamsModeDto) Enum.valueOf(AccountPushParamsModeDto.class, str);
    }

    public static AccountPushParamsModeDto[] values() {
        return (AccountPushParamsModeDto[]) $VALUES.clone();
    }
}
