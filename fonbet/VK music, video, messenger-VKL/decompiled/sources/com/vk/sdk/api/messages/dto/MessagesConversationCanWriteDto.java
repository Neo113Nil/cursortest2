package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationCanWriteDto.kt */
/* loaded from: classes5.dex */
public final class MessagesConversationCanWriteDto {

    @pmi0("allowed")
    private final boolean allowed;

    @pmi0("reason")
    private final Integer reason;

    public MessagesConversationCanWriteDto(boolean z, Integer num) {
        this.allowed = z;
        this.reason = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationCanWriteDto)) {
            return false;
        }
        MessagesConversationCanWriteDto messagesConversationCanWriteDto = (MessagesConversationCanWriteDto) obj;
        return this.allowed == messagesConversationCanWriteDto.allowed && epx.f(this.reason, messagesConversationCanWriteDto.reason);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.allowed) * 31;
        Integer num = this.reason;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "MessagesConversationCanWriteDto(allowed=" + this.allowed + ", reason=" + this.reason + ")";
    }

    public /* synthetic */ MessagesConversationCanWriteDto(boolean z, Integer num, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : num);
    }
}
