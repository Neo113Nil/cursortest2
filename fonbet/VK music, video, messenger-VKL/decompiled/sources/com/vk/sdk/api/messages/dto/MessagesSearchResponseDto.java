package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MessagesSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MessagesMessageDto> items;

    public MessagesSearchResponseDto(int i, List<MessagesMessageDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSearchResponseDto)) {
            return false;
        }
        MessagesSearchResponseDto messagesSearchResponseDto = (MessagesSearchResponseDto) obj;
        return this.count == messagesSearchResponseDto.count && epx.f(this.items, messagesSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "MessagesSearchResponseDto(count=", ", items=", ")", this.items);
    }
}
