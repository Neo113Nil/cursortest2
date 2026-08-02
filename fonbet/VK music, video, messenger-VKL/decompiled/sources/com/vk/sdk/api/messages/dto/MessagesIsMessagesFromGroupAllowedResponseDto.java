package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesIsMessagesFromGroupAllowedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesIsMessagesFromGroupAllowedResponseDto {

    @pmi0("is_allowed")
    private final BaseBoolIntDto isAllowed;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesIsMessagesFromGroupAllowedResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesIsMessagesFromGroupAllowedResponseDto) && this.isAllowed == ((MessagesIsMessagesFromGroupAllowedResponseDto) obj).isAllowed;
    }

    public final int hashCode() {
        BaseBoolIntDto baseBoolIntDto = this.isAllowed;
        if (baseBoolIntDto == null) {
            return 0;
        }
        return baseBoolIntDto.hashCode();
    }

    public final String toString() {
        return "MessagesIsMessagesFromGroupAllowedResponseDto(isAllowed=" + this.isAllowed + ")";
    }

    public MessagesIsMessagesFromGroupAllowedResponseDto(BaseBoolIntDto baseBoolIntDto) {
        this.isAllowed = baseBoolIntDto;
    }

    public /* synthetic */ MessagesIsMessagesFromGroupAllowedResponseDto(BaseBoolIntDto baseBoolIntDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseBoolIntDto);
    }
}
