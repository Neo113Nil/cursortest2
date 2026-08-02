package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountCountersFilterDto.kt */
/* loaded from: classes5.dex */
public final class AccountCountersFilterDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountCountersFilterDto[] $VALUES;

    @pmi0("menu_new_clips_badge")
    public static final AccountCountersFilterDto MENU_NEW_CLIPS_BADGE;
    private final String value;

    static {
        AccountCountersFilterDto accountCountersFilterDto = new AccountCountersFilterDto("MENU_NEW_CLIPS_BADGE", 0, "menu_new_clips_badge");
        MENU_NEW_CLIPS_BADGE = accountCountersFilterDto;
        AccountCountersFilterDto[] accountCountersFilterDtoArr = {accountCountersFilterDto};
        $VALUES = accountCountersFilterDtoArr;
        $ENTRIES = new asp(accountCountersFilterDtoArr);
    }

    private AccountCountersFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountCountersFilterDto valueOf(String str) {
        return (AccountCountersFilterDto) Enum.valueOf(AccountCountersFilterDto.class, str);
    }

    public static AccountCountersFilterDto[] values() {
        return (AccountCountersFilterDto[]) $VALUES.clone();
    }
}
