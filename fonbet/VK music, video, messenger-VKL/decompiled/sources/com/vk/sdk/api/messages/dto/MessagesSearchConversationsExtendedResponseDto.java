package com.vk.sdk.api.messages.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: MessagesSearchConversationsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesSearchConversationsExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesConversationDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesSearchConversationsExtendedResponseDto(int i, List<MessagesConversationDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSearchConversationsExtendedResponseDto)) {
            return false;
        }
        MessagesSearchConversationsExtendedResponseDto messagesSearchConversationsExtendedResponseDto = (MessagesSearchConversationsExtendedResponseDto) obj;
        return this.count == messagesSearchConversationsExtendedResponseDto.count && epx.f(this.items, messagesSearchConversationsExtendedResponseDto.items) && epx.f(this.profiles, messagesSearchConversationsExtendedResponseDto.profiles) && epx.f(this.groups, messagesSearchConversationsExtendedResponseDto.groups);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<MessagesConversationDto> list = this.items;
        return n.b(zn.c(i, "MessagesSearchConversationsExtendedResponseDto(count=", ", items=", ", profiles=", list), this.profiles, ", groups=", this.groups, ")");
    }

    public /* synthetic */ MessagesSearchConversationsExtendedResponseDto(int i, List list, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3);
    }
}
