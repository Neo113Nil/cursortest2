package com.vk.sdk.api.messages.dto;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationWithMessageDto.kt */
/* loaded from: classes5.dex */
public final class MessagesConversationWithMessageDto {

    @pmi0(SignalingProtocol.KEY_CONVERSATION)
    private final MessagesConversationDto conversation;

    @pmi0("last_message")
    private final MessagesMessageDto lastMessage;

    public MessagesConversationWithMessageDto(MessagesConversationDto messagesConversationDto, MessagesMessageDto messagesMessageDto) {
        this.conversation = messagesConversationDto;
        this.lastMessage = messagesMessageDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationWithMessageDto)) {
            return false;
        }
        MessagesConversationWithMessageDto messagesConversationWithMessageDto = (MessagesConversationWithMessageDto) obj;
        return epx.f(this.conversation, messagesConversationWithMessageDto.conversation) && epx.f(this.lastMessage, messagesConversationWithMessageDto.lastMessage);
    }

    public final int hashCode() {
        int hashCode = this.conversation.hashCode() * 31;
        MessagesMessageDto messagesMessageDto = this.lastMessage;
        return hashCode + (messagesMessageDto == null ? 0 : messagesMessageDto.hashCode());
    }

    public final String toString() {
        return "MessagesConversationWithMessageDto(conversation=" + this.conversation + ", lastMessage=" + this.lastMessage + ")";
    }

    public /* synthetic */ MessagesConversationWithMessageDto(MessagesConversationDto messagesConversationDto, MessagesMessageDto messagesMessageDto, int i, zcl zclVar) {
        this(messagesConversationDto, (i & 2) != 0 ? null : messagesMessageDto);
    }
}
