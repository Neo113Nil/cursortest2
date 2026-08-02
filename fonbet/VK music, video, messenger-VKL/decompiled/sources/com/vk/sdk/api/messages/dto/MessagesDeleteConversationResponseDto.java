package com.vk.sdk.api.messages.dto;

import xsna.pmi0;
import xsna.tgw;

/* compiled from: MessagesDeleteConversationResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesDeleteConversationResponseDto {

    @pmi0("last_deleted_id")
    private final int lastDeletedId;

    public MessagesDeleteConversationResponseDto(int i) {
        this.lastDeletedId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesDeleteConversationResponseDto) && this.lastDeletedId == ((MessagesDeleteConversationResponseDto) obj).lastDeletedId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lastDeletedId);
    }

    public final String toString() {
        return tgw.b(this.lastDeletedId, "MessagesDeleteConversationResponseDto(lastDeletedId=", ")");
    }
}
