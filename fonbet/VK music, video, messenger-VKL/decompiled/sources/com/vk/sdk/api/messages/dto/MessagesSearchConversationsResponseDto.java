package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MessagesSearchConversationsResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesSearchConversationsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MessagesConversationDto> items;

    public MessagesSearchConversationsResponseDto(int i, List<MessagesConversationDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSearchConversationsResponseDto)) {
            return false;
        }
        MessagesSearchConversationsResponseDto messagesSearchConversationsResponseDto = (MessagesSearchConversationsResponseDto) obj;
        return this.count == messagesSearchConversationsResponseDto.count && epx.f(this.items, messagesSearchConversationsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MessagesSearchConversationsResponseDto(count=", ", items=", ")", this.items);
    }
}
