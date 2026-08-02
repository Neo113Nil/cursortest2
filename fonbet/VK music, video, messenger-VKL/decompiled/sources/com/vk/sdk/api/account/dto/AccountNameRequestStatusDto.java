package com.vk.sdk.api.account.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountNameRequestStatusDto.kt */
/* loaded from: classes5.dex */
public final class AccountNameRequestStatusDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountNameRequestStatusDto[] $VALUES;

    @pmi0("declined")
    public static final AccountNameRequestStatusDto DECLINED;

    @pmi0("declined_with_link")
    public static final AccountNameRequestStatusDto DECLINED_WITH_LINK;

    @pmi0("processing")
    public static final AccountNameRequestStatusDto PROCESSING;

    @pmi0("response")
    public static final AccountNameRequestStatusDto RESPONSE;

    @pmi0("response_with_link")
    public static final AccountNameRequestStatusDto RESPONSE_WITH_LINK;

    @pmi0("success")
    public static final AccountNameRequestStatusDto SUCCESS;

    @pmi0("was_accepted")
    public static final AccountNameRequestStatusDto WAS_ACCEPTED;

    @pmi0("was_declined")
    public static final AccountNameRequestStatusDto WAS_DECLINED;
    private final String value;

    static {
        AccountNameRequestStatusDto accountNameRequestStatusDto = new AccountNameRequestStatusDto("SUCCESS", 0, "success");
        SUCCESS = accountNameRequestStatusDto;
        AccountNameRequestStatusDto accountNameRequestStatusDto2 = new AccountNameRequestStatusDto("PROCESSING", 1, "processing");
        PROCESSING = accountNameRequestStatusDto2;
        AccountNameRequestStatusDto accountNameRequestStatusDto3 = new AccountNameRequestStatusDto("DECLINED", 2, "declined");
        DECLINED = accountNameRequestStatusDto3;
        AccountNameRequestStatusDto accountNameRequestStatusDto4 = new AccountNameRequestStatusDto("WAS_ACCEPTED", 3, "was_accepted");
        WAS_ACCEPTED = accountNameRequestStatusDto4;
        AccountNameRequestStatusDto accountNameRequestStatusDto5 = new AccountNameRequestStatusDto("WAS_DECLINED", 4, "was_declined");
        WAS_DECLINED = accountNameRequestStatusDto5;
        AccountNameRequestStatusDto accountNameRequestStatusDto6 = new AccountNameRequestStatusDto("DECLINED_WITH_LINK", 5, "declined_with_link");
        DECLINED_WITH_LINK = accountNameRequestStatusDto6;
        AccountNameRequestStatusDto accountNameRequestStatusDto7 = new AccountNameRequestStatusDto("RESPONSE", 6, "response");
        RESPONSE = accountNameRequestStatusDto7;
        AccountNameRequestStatusDto accountNameRequestStatusDto8 = new AccountNameRequestStatusDto("RESPONSE_WITH_LINK", 7, "response_with_link");
        RESPONSE_WITH_LINK = accountNameRequestStatusDto8;
        AccountNameRequestStatusDto[] accountNameRequestStatusDtoArr = {accountNameRequestStatusDto, accountNameRequestStatusDto2, accountNameRequestStatusDto3, accountNameRequestStatusDto4, accountNameRequestStatusDto5, accountNameRequestStatusDto6, accountNameRequestStatusDto7, accountNameRequestStatusDto8};
        $VALUES = accountNameRequestStatusDtoArr;
        $ENTRIES = new asp(accountNameRequestStatusDtoArr);
    }

    private AccountNameRequestStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountNameRequestStatusDto valueOf(String str) {
        return (AccountNameRequestStatusDto) Enum.valueOf(AccountNameRequestStatusDto.class, str);
    }

    public static AccountNameRequestStatusDto[] values() {
        return (AccountNameRequestStatusDto[]) $VALUES.clone();
    }
}
