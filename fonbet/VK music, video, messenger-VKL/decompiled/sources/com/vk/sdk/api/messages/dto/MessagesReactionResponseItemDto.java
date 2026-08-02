package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MessagesReactionResponseItemDto.kt */
/* loaded from: classes5.dex */
public final class MessagesReactionResponseItemDto {

    @pmi0("reaction_id")
    private final int reactionId;

    @pmi0("user_id")
    private final UserId userId;

    public MessagesReactionResponseItemDto(UserId userId, int i) {
        this.userId = userId;
        this.reactionId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionResponseItemDto)) {
            return false;
        }
        MessagesReactionResponseItemDto messagesReactionResponseItemDto = (MessagesReactionResponseItemDto) obj;
        return epx.f(this.userId, messagesReactionResponseItemDto.userId) && this.reactionId == messagesReactionResponseItemDto.reactionId;
    }

    public final int hashCode() {
        return Integer.hashCode(this.reactionId) + (Long.hashCode(this.userId.b) * 31);
    }

    public final String toString() {
        return "MessagesReactionResponseItemDto(userId=" + this.userId + ", reactionId=" + this.reactionId + ")";
    }
}
