package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesDeleteChatPhotoResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesDeleteChatPhotoResponseDto {

    @pmi0("chat")
    private final MessagesChatDto chat;

    @pmi0("message_id")
    private final Integer messageId;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesDeleteChatPhotoResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesDeleteChatPhotoResponseDto)) {
            return false;
        }
        MessagesDeleteChatPhotoResponseDto messagesDeleteChatPhotoResponseDto = (MessagesDeleteChatPhotoResponseDto) obj;
        return epx.f(this.messageId, messagesDeleteChatPhotoResponseDto.messageId) && epx.f(this.chat, messagesDeleteChatPhotoResponseDto.chat);
    }

    public final int hashCode() {
        Integer num = this.messageId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        MessagesChatDto messagesChatDto = this.chat;
        return hashCode + (messagesChatDto != null ? messagesChatDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesDeleteChatPhotoResponseDto(messageId=" + this.messageId + ", chat=" + this.chat + ")";
    }

    public MessagesDeleteChatPhotoResponseDto(Integer num, MessagesChatDto messagesChatDto) {
        this.messageId = num;
        this.chat = messagesChatDto;
    }

    public /* synthetic */ MessagesDeleteChatPhotoResponseDto(Integer num, MessagesChatDto messagesChatDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : messagesChatDto);
    }
}
