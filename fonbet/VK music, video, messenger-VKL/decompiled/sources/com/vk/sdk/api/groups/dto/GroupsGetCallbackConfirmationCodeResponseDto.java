package com.vk.sdk.api.groups.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: GroupsGetCallbackConfirmationCodeResponseDto.kt */
/* loaded from: classes5.dex */
public final class GroupsGetCallbackConfirmationCodeResponseDto {

    @pmi0("code")
    private final String code;

    public GroupsGetCallbackConfirmationCodeResponseDto(String str) {
        this.code = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupsGetCallbackConfirmationCodeResponseDto) && epx.f(this.code, ((GroupsGetCallbackConfirmationCodeResponseDto) obj).code);
    }

    public final int hashCode() {
        return this.code.hashCode();
    }

    public final String toString() {
        return zr.a("GroupsGetCallbackConfirmationCodeResponseDto(code=", this.code, ")");
    }
}
