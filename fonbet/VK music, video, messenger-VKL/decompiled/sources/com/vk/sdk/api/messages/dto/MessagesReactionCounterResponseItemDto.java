package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.vp;

/* compiled from: MessagesReactionCounterResponseItemDto.kt */
/* loaded from: classes5.dex */
public final class MessagesReactionCounterResponseItemDto {

    @pmi0("count")
    private final int count;

    @pmi0("reaction_id")
    private final int reactionId;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    public MessagesReactionCounterResponseItemDto(int i, int i2, List<UserId> list) {
        this.reactionId = i;
        this.count = i2;
        this.userIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionCounterResponseItemDto)) {
            return false;
        }
        MessagesReactionCounterResponseItemDto messagesReactionCounterResponseItemDto = (MessagesReactionCounterResponseItemDto) obj;
        return this.reactionId == messagesReactionCounterResponseItemDto.reactionId && this.count == messagesReactionCounterResponseItemDto.count && epx.f(this.userIds, messagesReactionCounterResponseItemDto.userIds);
    }

    public final int hashCode() {
        return this.userIds.hashCode() + shy.a(this.count, Integer.hashCode(this.reactionId) * 31, 31);
    }

    public final String toString() {
        int i = this.reactionId;
        int i2 = this.count;
        return vp.b(")", odj.a(i, i2, "MessagesReactionCounterResponseItemDto(reactionId=", ", count=", ", userIds="), this.userIds);
    }
}
