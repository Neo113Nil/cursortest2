package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesLongpollMessagesDto.kt */
/* loaded from: classes5.dex */
public final class MessagesLongpollMessagesDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<MessagesMessageDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesLongpollMessagesDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesLongpollMessagesDto)) {
            return false;
        }
        MessagesLongpollMessagesDto messagesLongpollMessagesDto = (MessagesLongpollMessagesDto) obj;
        return epx.f(this.count, messagesLongpollMessagesDto.count) && epx.f(this.items, messagesLongpollMessagesDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<MessagesMessageDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesLongpollMessagesDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public MessagesLongpollMessagesDto(Integer num, List<MessagesMessageDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ MessagesLongpollMessagesDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
