package com.vk.sdk.api.account.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.ss9;

/* compiled from: AccountUserSettingsInterestDto.kt */
/* loaded from: classes5.dex */
public final class AccountUserSettingsInterestDto {

    @pmi0("title")
    private final String title;

    @pmi0("value")
    private final String value;

    public AccountUserSettingsInterestDto(String str, String str2) {
        this.title = str;
        this.value = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettingsInterestDto)) {
            return false;
        }
        AccountUserSettingsInterestDto accountUserSettingsInterestDto = (AccountUserSettingsInterestDto) obj;
        return epx.f(this.title, accountUserSettingsInterestDto.title) && epx.f(this.value, accountUserSettingsInterestDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("AccountUserSettingsInterestDto(title=", this.title, ", value=", this.value, ")");
    }
}
