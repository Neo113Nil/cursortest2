package com.vk.sdk.api.messages.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetImportantMessagesExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetImportantMessagesExtendedResponseDto {

    @pmi0("conversations")
    private final List<MessagesConversationDto> conversations;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("messages")
    private final MessagesMessagesArrayDto messages;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesGetImportantMessagesExtendedResponseDto(MessagesMessagesArrayDto messagesMessagesArrayDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2, List<MessagesConversationDto> list3) {
        this.messages = messagesMessagesArrayDto;
        this.profiles = list;
        this.groups = list2;
        this.conversations = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetImportantMessagesExtendedResponseDto)) {
            return false;
        }
        MessagesGetImportantMessagesExtendedResponseDto messagesGetImportantMessagesExtendedResponseDto = (MessagesGetImportantMessagesExtendedResponseDto) obj;
        return epx.f(this.messages, messagesGetImportantMessagesExtendedResponseDto.messages) && epx.f(this.profiles, messagesGetImportantMessagesExtendedResponseDto.profiles) && epx.f(this.groups, messagesGetImportantMessagesExtendedResponseDto.groups) && epx.f(this.conversations, messagesGetImportantMessagesExtendedResponseDto.conversations);
    }

    public final int hashCode() {
        int hashCode = this.messages.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesConversationDto> list3 = this.conversations;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        MessagesMessagesArrayDto messagesMessagesArrayDto = this.messages;
        List<UsersUserFullDto> list = this.profiles;
        List<GroupsGroupFullDto> list2 = this.groups;
        List<MessagesConversationDto> list3 = this.conversations;
        StringBuilder sb = new StringBuilder("MessagesGetImportantMessagesExtendedResponseDto(messages=");
        sb.append(messagesMessagesArrayDto);
        sb.append(", profiles=");
        sb.append(list);
        sb.append(", groups=");
        return n.b(sb, list2, ", conversations=", list3, ")");
    }

    public /* synthetic */ MessagesGetImportantMessagesExtendedResponseDto(MessagesMessagesArrayDto messagesMessagesArrayDto, List list, List list2, List list3, int i, zcl zclVar) {
        this(messagesMessagesArrayDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
