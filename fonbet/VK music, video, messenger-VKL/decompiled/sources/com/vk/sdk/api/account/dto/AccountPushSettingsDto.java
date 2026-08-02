package com.vk.sdk.api.account.dto;

import com.ironsource.C4217a2;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountPushSettingsDto.kt */
/* loaded from: classes5.dex */
public final class AccountPushSettingsDto {

    @pmi0("conversations")
    private final AccountPushConversationsDto conversations;

    @pmi0(C4217a2.e)
    private final BaseBoolIntDto disabled;

    @pmi0("disabled_until")
    private final Integer disabledUntil;

    @pmi0("settings")
    private final AccountPushParamsDto settings;

    public AccountPushSettingsDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPushSettingsDto)) {
            return false;
        }
        AccountPushSettingsDto accountPushSettingsDto = (AccountPushSettingsDto) obj;
        return this.disabled == accountPushSettingsDto.disabled && epx.f(this.disabledUntil, accountPushSettingsDto.disabledUntil) && epx.f(this.settings, accountPushSettingsDto.settings) && epx.f(this.conversations, accountPushSettingsDto.conversations);
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.disabled;
        int hashCode = (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode()) * 31;
        Integer num = this.disabledUntil;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        AccountPushParamsDto accountPushParamsDto = this.settings;
        int hashCode3 = (hashCode2 + (accountPushParamsDto == null ? 0 : accountPushParamsDto.hashCode())) * 31;
        AccountPushConversationsDto accountPushConversationsDto = this.conversations;
        return hashCode3 + (accountPushConversationsDto != null ? accountPushConversationsDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountPushSettingsDto(disabled=" + this.disabled + ", disabledUntil=" + this.disabledUntil + ", settings=" + this.settings + ", conversations=" + this.conversations + ")";
    }

    public AccountPushSettingsDto(BaseBoolIntDto baseBoolIntDto, Integer num, AccountPushParamsDto accountPushParamsDto, AccountPushConversationsDto accountPushConversationsDto) {
        this.disabled = baseBoolIntDto;
        this.disabledUntil = num;
        this.settings = accountPushParamsDto;
        this.conversations = accountPushConversationsDto;
    }

    public /* synthetic */ AccountPushSettingsDto(BaseBoolIntDto baseBoolIntDto, Integer num, AccountPushParamsDto accountPushParamsDto, AccountPushConversationsDto accountPushConversationsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : accountPushParamsDto, (i & 8) != 0 ? null : accountPushConversationsDto);
    }
}
