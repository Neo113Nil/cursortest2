package com.vk.sdk.api.account.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountSaveProfileInfoResponseDto.kt */
/* loaded from: classes5.dex */
public final class AccountSaveProfileInfoResponseDto {

    @pmi0("changed")
    private final BaseBoolIntDto changed;

    @pmi0("name_request")
    private final AccountNameRequestDto nameRequest;

    public AccountSaveProfileInfoResponseDto(BaseBoolIntDto baseBoolIntDto, AccountNameRequestDto accountNameRequestDto) {
        this.changed = baseBoolIntDto;
        this.nameRequest = accountNameRequestDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSaveProfileInfoResponseDto)) {
            return false;
        }
        AccountSaveProfileInfoResponseDto accountSaveProfileInfoResponseDto = (AccountSaveProfileInfoResponseDto) obj;
        return this.changed == accountSaveProfileInfoResponseDto.changed && epx.f(this.nameRequest, accountSaveProfileInfoResponseDto.nameRequest);
    }

    public final int hashCode() {
        int hashCode = this.changed.hashCode() * 31;
        AccountNameRequestDto accountNameRequestDto = this.nameRequest;
        return hashCode + (accountNameRequestDto == null ? 0 : accountNameRequestDto.hashCode());
    }

    public final String toString() {
        return "AccountSaveProfileInfoResponseDto(changed=" + this.changed + ", nameRequest=" + this.nameRequest + ")";
    }

    public /* synthetic */ AccountSaveProfileInfoResponseDto(BaseBoolIntDto baseBoolIntDto, AccountNameRequestDto accountNameRequestDto, int i, zcl zclVar) {
        this(baseBoolIntDto, (i & 2) != 0 ? null : accountNameRequestDto);
    }
}
