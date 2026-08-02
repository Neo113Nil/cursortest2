package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationPeerDto.kt */
/* loaded from: classes5.dex */
public final class MessagesConversationPeerDto {

    @pmi0("id")
    private final UserId id;

    @pmi0("local_id")
    private final Integer localId;

    @pmi0("type")
    private final MessagesConversationPeerTypeDto type;

    public MessagesConversationPeerDto(UserId userId, MessagesConversationPeerTypeDto messagesConversationPeerTypeDto, Integer num) {
        this.id = userId;
        this.type = messagesConversationPeerTypeDto;
        this.localId = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationPeerDto)) {
            return false;
        }
        MessagesConversationPeerDto messagesConversationPeerDto = (MessagesConversationPeerDto) obj;
        return epx.f(this.id, messagesConversationPeerDto.id) && this.type == messagesConversationPeerDto.type && epx.f(this.localId, messagesConversationPeerDto.localId);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (Long.hashCode(this.id.b) * 31)) * 31;
        Integer num = this.localId;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        UserId userId = this.id;
        MessagesConversationPeerTypeDto messagesConversationPeerTypeDto = this.type;
        Integer num = this.localId;
        StringBuilder sb = new StringBuilder("MessagesConversationPeerDto(id=");
        sb.append(userId);
        sb.append(", type=");
        sb.append(messagesConversationPeerTypeDto);
        sb.append(", localId=");
        return oq.b(sb, num, ")");
    }

    public /* synthetic */ MessagesConversationPeerDto(UserId userId, MessagesConversationPeerTypeDto messagesConversationPeerTypeDto, Integer num, int i, zcl zclVar) {
        this(userId, messagesConversationPeerTypeDto, (i & 4) != 0 ? null : num);
    }
}
