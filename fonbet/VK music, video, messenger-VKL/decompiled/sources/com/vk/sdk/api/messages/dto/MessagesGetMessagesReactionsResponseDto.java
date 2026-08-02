package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: MessagesGetMessagesReactionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetMessagesReactionsResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesReactionCountersResponseItemDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesGetMessagesReactionsResponseDto(List<MessagesReactionCountersResponseItemDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetMessagesReactionsResponseDto)) {
            return false;
        }
        MessagesGetMessagesReactionsResponseDto messagesGetMessagesReactionsResponseDto = (MessagesGetMessagesReactionsResponseDto) obj;
        return epx.f(this.items, messagesGetMessagesReactionsResponseDto.items) && epx.f(this.profiles, messagesGetMessagesReactionsResponseDto.profiles) && epx.f(this.groups, messagesGetMessagesReactionsResponseDto.groups);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        List<MessagesReactionCountersResponseItemDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder sb = new StringBuilder("MessagesGetMessagesReactionsResponseDto(items=");
        sb.append(list);
        sb.append(", profiles=");
        sb.append(list2);
        sb.append(", groups=");
        return vp.b(")", sb, list3);
    }

    public /* synthetic */ MessagesGetMessagesReactionsResponseDto(List list, List list2, List list3, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
