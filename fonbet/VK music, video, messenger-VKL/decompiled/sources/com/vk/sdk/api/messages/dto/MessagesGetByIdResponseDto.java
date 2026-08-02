package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MessagesGetByIdResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetByIdResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MessagesMessageDto> items;

    public MessagesGetByIdResponseDto(int i, List<MessagesMessageDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetByIdResponseDto)) {
            return false;
        }
        MessagesGetByIdResponseDto messagesGetByIdResponseDto = (MessagesGetByIdResponseDto) obj;
        return this.count == messagesGetByIdResponseDto.count && epx.f(this.items, messagesGetByIdResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MessagesGetByIdResponseDto(count=", ", items=", ")", this.items);
    }
}
