package com.vk.sdk.api.messages.dto;

import xsna.pmi0;
import xsna.sl9;

/* compiled from: MessagesConversationSortIdDto.kt */
/* loaded from: classes5.dex */
public final class MessagesConversationSortIdDto {

    @pmi0("major_id")
    private final int majorId;

    @pmi0("minor_id")
    private final int minorId;

    public MessagesConversationSortIdDto(int i, int i2) {
        this.majorId = i;
        this.minorId = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationSortIdDto)) {
            return false;
        }
        MessagesConversationSortIdDto messagesConversationSortIdDto = (MessagesConversationSortIdDto) obj;
        return this.majorId == messagesConversationSortIdDto.majorId && this.minorId == messagesConversationSortIdDto.minorId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minorId) + (Integer.hashCode(this.majorId) * 31);
    }

    public final String toString() {
        return sl9.c(this.majorId, this.minorId, "MessagesConversationSortIdDto(majorId=", ", minorId=", ")");
    }
}
