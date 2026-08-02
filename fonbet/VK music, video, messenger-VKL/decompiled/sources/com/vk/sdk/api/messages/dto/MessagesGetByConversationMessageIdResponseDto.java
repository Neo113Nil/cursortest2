package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MessagesGetByConversationMessageIdResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetByConversationMessageIdResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MessagesMessageDto> items;

    public MessagesGetByConversationMessageIdResponseDto(int i, List<MessagesMessageDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetByConversationMessageIdResponseDto)) {
            return false;
        }
        MessagesGetByConversationMessageIdResponseDto messagesGetByConversationMessageIdResponseDto = (MessagesGetByConversationMessageIdResponseDto) obj;
        return this.count == messagesGetByConversationMessageIdResponseDto.count && epx.f(this.items, messagesGetByConversationMessageIdResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MessagesGetByConversationMessageIdResponseDto(count=", ", items=", ")", this.items);
    }
}
