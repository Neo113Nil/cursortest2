package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import xsna.eok;
import xsna.pmi0;

/* compiled from: MessagesLastActivityDto.kt */
/* loaded from: classes5.dex */
public final class MessagesLastActivityDto {

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final BaseBoolIntDto online;

    @pmi0("time")
    private final int time;

    public MessagesLastActivityDto(BaseBoolIntDto baseBoolIntDto, int i) {
        this.online = baseBoolIntDto;
        this.time = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesLastActivityDto)) {
            return false;
        }
        MessagesLastActivityDto messagesLastActivityDto = (MessagesLastActivityDto) obj;
        return this.online == messagesLastActivityDto.online && this.time == messagesLastActivityDto.time;
    }

    public final int hashCode() {
        return Integer.hashCode(this.time) + (this.online.hashCode() * 31);
    }

    public final String toString() {
        return "MessagesLastActivityDto(online=" + this.online + ", time=" + this.time + ")";
    }
}
