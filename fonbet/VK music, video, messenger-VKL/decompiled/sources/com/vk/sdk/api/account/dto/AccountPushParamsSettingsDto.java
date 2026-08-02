package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountPushParamsSettingsDto.kt */
/* loaded from: classes5.dex */
public final class AccountPushParamsSettingsDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountPushParamsSettingsDto[] $VALUES;

    @pmi0("fr_of_fr")
    public static final AccountPushParamsSettingsDto FR_OF_FR;

    @pmi0("off")
    public static final AccountPushParamsSettingsDto OFF;

    @pmi0("on")
    public static final AccountPushParamsSettingsDto ON;
    private final String value;

    static {
        AccountPushParamsSettingsDto accountPushParamsSettingsDto = new AccountPushParamsSettingsDto("ON", 0, "on");
        ON = accountPushParamsSettingsDto;
        AccountPushParamsSettingsDto accountPushParamsSettingsDto2 = new AccountPushParamsSettingsDto("OFF", 1, "off");
        OFF = accountPushParamsSettingsDto2;
        AccountPushParamsSettingsDto accountPushParamsSettingsDto3 = new AccountPushParamsSettingsDto("FR_OF_FR", 2, "fr_of_fr");
        FR_OF_FR = accountPushParamsSettingsDto3;
        AccountPushParamsSettingsDto[] accountPushParamsSettingsDtoArr = {accountPushParamsSettingsDto, accountPushParamsSettingsDto2, accountPushParamsSettingsDto3};
        $VALUES = accountPushParamsSettingsDtoArr;
        $ENTRIES = new asp(accountPushParamsSettingsDtoArr);
    }

    private AccountPushParamsSettingsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountPushParamsSettingsDto valueOf(String str) {
        return (AccountPushParamsSettingsDto) Enum.valueOf(AccountPushParamsSettingsDto.class, str);
    }

    public static AccountPushParamsSettingsDto[] values() {
        return (AccountPushParamsSettingsDto[]) $VALUES.clone();
    }
}
