package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesKeyboardDto.kt */
/* loaded from: classes5.dex */
public final class MessagesKeyboardDto {

    @pmi0("author_id")
    private final UserId authorId;

    @pmi0("buttons")
    private final List<List<MessagesKeyboardButtonDto>> buttons;

    @pmi0("inline")
    private final Boolean inline;

    @pmi0("one_time")
    private final boolean oneTime;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesKeyboardDto(boolean z, List<? extends List<MessagesKeyboardButtonDto>> list, UserId userId, Boolean bool) {
        this.oneTime = z;
        this.buttons = list;
        this.authorId = userId;
        this.inline = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboardDto)) {
            return false;
        }
        MessagesKeyboardDto messagesKeyboardDto = (MessagesKeyboardDto) obj;
        return this.oneTime == messagesKeyboardDto.oneTime && epx.f(this.buttons, messagesKeyboardDto.buttons) && epx.f(this.authorId, messagesKeyboardDto.authorId) && epx.f(this.inline, messagesKeyboardDto.inline);
    }

    public final int hashCode() {
        int a = fw3.a(Boolean.hashCode(this.oneTime) * 31, 31, this.buttons);
        UserId userId = this.authorId;
        int hashCode = (a + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool = this.inline;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesKeyboardDto(oneTime=" + this.oneTime + ", buttons=" + this.buttons + ", authorId=" + this.authorId + ", inline=" + this.inline + ")";
    }

    public /* synthetic */ MessagesKeyboardDto(boolean z, List list, UserId userId, Boolean bool, int i, zcl zclVar) {
        this(z, list, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : bool);
    }
}
