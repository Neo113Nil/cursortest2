package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: MessagesGetConversationsResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetConversationsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesConversationWithMessageDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("unread_count")
    private final Integer unreadCount;

    public MessagesGetConversationsResponseDto(int i, List<MessagesConversationWithMessageDto> list, Integer num, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.count = i;
        this.items = list;
        this.unreadCount = num;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetConversationsResponseDto)) {
            return false;
        }
        MessagesGetConversationsResponseDto messagesGetConversationsResponseDto = (MessagesGetConversationsResponseDto) obj;
        return this.count == messagesGetConversationsResponseDto.count && epx.f(this.items, messagesGetConversationsResponseDto.items) && epx.f(this.unreadCount, messagesGetConversationsResponseDto.unreadCount) && epx.f(this.profiles, messagesGetConversationsResponseDto.profiles) && epx.f(this.groups, messagesGetConversationsResponseDto.groups);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.unreadCount;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<MessagesConversationWithMessageDto> list = this.items;
        Integer num = this.unreadCount;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder c = zn.c(i, "MessagesGetConversationsResponseDto(count=", ", items=", ", unreadCount=", list);
        c.append(num);
        c.append(", profiles=");
        c.append(list2);
        c.append(", groups=");
        return vp.b(")", c, list3);
    }

    public /* synthetic */ MessagesGetConversationsResponseDto(int i, List list, Integer num, List list2, List list3, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : list3);
    }
}
