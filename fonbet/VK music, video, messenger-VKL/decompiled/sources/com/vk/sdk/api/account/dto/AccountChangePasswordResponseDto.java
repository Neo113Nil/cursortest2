package com.vk.sdk.api.account.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;
import xsna.zcl;

/* compiled from: AccountChangePasswordResponseDto.kt */
/* loaded from: classes5.dex */
public final class AccountChangePasswordResponseDto {

    @pmi0("secret")
    private final String secret;

    @pmi0("token")
    private final String token;

    public AccountChangePasswordResponseDto(String str, String str2) {
        this.token = str;
        this.secret = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountChangePasswordResponseDto)) {
            return false;
        }
        AccountChangePasswordResponseDto accountChangePasswordResponseDto = (AccountChangePasswordResponseDto) obj;
        return epx.f(this.token, accountChangePasswordResponseDto.token) && epx.f(this.secret, accountChangePasswordResponseDto.secret);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        String str = this.secret;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ss9.a("AccountChangePasswordResponseDto(token=", this.token, ", secret=", this.secret, ")");
    }

    public /* synthetic */ AccountChangePasswordResponseDto(String str, String str2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
