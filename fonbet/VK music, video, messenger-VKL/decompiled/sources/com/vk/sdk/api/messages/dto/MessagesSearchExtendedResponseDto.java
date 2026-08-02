package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.vq;
import xsna.zcl;
import xsna.zn;

/* compiled from: MessagesSearchExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesSearchExtendedResponseDto {

    @pmi0("conversations")
    private final List<MessagesConversationDto> conversations;

    @pmi0("count")
    private final int count;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesMessageDto> items;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesSearchExtendedResponseDto(int i, List<MessagesMessageDto> list, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesConversationDto> list4) {
        this.count = i;
        this.items = list;
        this.profiles = list2;
        this.groups = list3;
        this.conversations = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSearchExtendedResponseDto)) {
            return false;
        }
        MessagesSearchExtendedResponseDto messagesSearchExtendedResponseDto = (MessagesSearchExtendedResponseDto) obj;
        return this.count == messagesSearchExtendedResponseDto.count && epx.f(this.items, messagesSearchExtendedResponseDto.items) && epx.f(this.profiles, messagesSearchExtendedResponseDto.profiles) && epx.f(this.groups, messagesSearchExtendedResponseDto.groups) && epx.f(this.conversations, messagesSearchExtendedResponseDto.conversations);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesConversationDto> list3 = this.conversations;
        return hashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<MessagesMessageDto> list = this.items;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        List<MessagesConversationDto> list4 = this.conversations;
        StringBuilder c = zn.c(i, "MessagesSearchExtendedResponseDto(count=", ", items=", ", profiles=", list);
        vq.d(c, list2, ", groups=", list3, ", conversations=");
        return vp.b(")", c, list4);
    }

    public /* synthetic */ MessagesSearchExtendedResponseDto(int i, List list, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4);
    }
}
