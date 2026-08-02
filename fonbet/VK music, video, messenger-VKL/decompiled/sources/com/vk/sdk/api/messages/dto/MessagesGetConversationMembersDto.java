package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.vp;
import xsna.zcl;

/* compiled from: MessagesGetConversationMembersDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetConversationMembersDto {

    @pmi0("chat_restrictions")
    private final MessagesChatRestrictionsDto chatRestrictions;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesConversationMemberDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesGetConversationMembersDto(List<MessagesConversationMemberDto> list, int i, MessagesChatRestrictionsDto messagesChatRestrictionsDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.count = i;
        this.chatRestrictions = messagesChatRestrictionsDto;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationMembersDto)) {
            return false;
        }
        MessagesGetConversationMembersDto messagesGetConversationMembersDto = (MessagesGetConversationMembersDto) obj;
        return epx.f(this.items, messagesGetConversationMembersDto.items) && this.count == messagesGetConversationMembersDto.count && epx.f(this.chatRestrictions, messagesGetConversationMembersDto.chatRestrictions) && epx.f(this.profiles, messagesGetConversationMembersDto.profiles) && epx.f(this.groups, messagesGetConversationMembersDto.groups);
    }

    public final int hashCode() {
        int a = shy.a(this.count, this.items.hashCode() * 31, 31);
        MessagesChatRestrictionsDto messagesChatRestrictionsDto = this.chatRestrictions;
        int hashCode = (a + (messagesChatRestrictionsDto == null ? 0 : messagesChatRestrictionsDto.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List<MessagesConversationMemberDto> list = this.items;
        int i = this.count;
        MessagesChatRestrictionsDto messagesChatRestrictionsDto = this.chatRestrictions;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder sb = new StringBuilder("MessagesGetConversationMembersDto(items=");
        sb.append(list);
        sb.append(", count=");
        sb.append(i);
        sb.append(", chatRestrictions=");
        sb.append(messagesChatRestrictionsDto);
        sb.append(", profiles=");
        sb.append(list2);
        sb.append(", groups=");
        return vp.b(")", sb, list3);
    }

    public /* synthetic */ MessagesGetConversationMembersDto(List list, int i, MessagesChatRestrictionsDto messagesChatRestrictionsDto, List list2, List list3, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : messagesChatRestrictionsDto, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3);
    }
}
