package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MessagesGetConversationByIdDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetConversationByIdDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MessagesConversationDto> items;

    public MessagesGetConversationByIdDto(int i, List<MessagesConversationDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationByIdDto)) {
            return false;
        }
        MessagesGetConversationByIdDto messagesGetConversationByIdDto = (MessagesGetConversationByIdDto) obj;
        return this.count == messagesGetConversationByIdDto.count && epx.f(this.items, messagesGetConversationByIdDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MessagesGetConversationByIdDto(count=", ", items=", ")", this.items);
    }
}
