package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: MessagesReactionCountersResponseItemDto.kt */
/* loaded from: classes5.dex */
public final class MessagesReactionCountersResponseItemDto {

    @pmi0("cmid")
    private final int cmid;

    @pmi0("counters")
    private final List<MessagesReactionCounterResponseItemDto> counters;

    public MessagesReactionCountersResponseItemDto(int i, List<MessagesReactionCounterResponseItemDto> list) {
        this.cmid = i;
        this.counters = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionCountersResponseItemDto)) {
            return false;
        }
        MessagesReactionCountersResponseItemDto messagesReactionCountersResponseItemDto = (MessagesReactionCountersResponseItemDto) obj;
        return this.cmid == messagesReactionCountersResponseItemDto.cmid && epx.f(this.counters, messagesReactionCountersResponseItemDto.counters);
    }

    public final int hashCode() {
        return this.counters.hashCode() + (Integer.hashCode(this.cmid) * 31);
    }

    public final String toString() {
        return pn.c(this.cmid, "MessagesReactionCountersResponseItemDto(cmid=", ", counters=", ")", this.counters);
    }
}
