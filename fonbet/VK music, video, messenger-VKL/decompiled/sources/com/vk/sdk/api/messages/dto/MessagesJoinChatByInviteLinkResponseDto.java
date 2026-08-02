package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesJoinChatByInviteLinkResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesJoinChatByInviteLinkResponseDto {

    @pmi0("chat_id")
    private final Integer chatId;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesJoinChatByInviteLinkResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesJoinChatByInviteLinkResponseDto) && epx.f(this.chatId, ((MessagesJoinChatByInviteLinkResponseDto) obj).chatId);
    }

    public final int hashCode() {
        Integer num = this.chatId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "MessagesJoinChatByInviteLinkResponseDto(chatId=" + this.chatId + ")";
    }

    public MessagesJoinChatByInviteLinkResponseDto(Integer num) {
        this.chatId = num;
    }

    public /* synthetic */ MessagesJoinChatByInviteLinkResponseDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
