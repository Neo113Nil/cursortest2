package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.base.dto.BaseLinkChatDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesChatSuggestionDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatSuggestionDto {

    @pmi0("chat")
    private final BaseLinkChatDto chat;

    @pmi0("track_code")
    private final String trackCode;

    public MessagesChatSuggestionDto(BaseLinkChatDto baseLinkChatDto, String str) {
        this.chat = baseLinkChatDto;
        this.trackCode = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSuggestionDto)) {
            return false;
        }
        MessagesChatSuggestionDto messagesChatSuggestionDto = (MessagesChatSuggestionDto) obj;
        return epx.f(this.chat, messagesChatSuggestionDto.chat) && epx.f(this.trackCode, messagesChatSuggestionDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = this.chat.hashCode() * 31;
        String str = this.trackCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MessagesChatSuggestionDto(chat=" + this.chat + ", trackCode=" + this.trackCode + ")";
    }

    public /* synthetic */ MessagesChatSuggestionDto(BaseLinkChatDto baseLinkChatDto, String str, int i, zcl zclVar) {
        this(baseLinkChatDto, (i & 2) != 0 ? null : str);
    }
}
