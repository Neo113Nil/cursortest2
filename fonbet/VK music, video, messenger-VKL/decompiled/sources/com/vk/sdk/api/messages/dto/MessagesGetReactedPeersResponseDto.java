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

/* compiled from: MessagesGetReactedPeersResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetReactedPeersResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("counters")
    private final List<MessagesReactionCounterResponseItemDto> counters;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    @pmi0("reactions")
    private final List<MessagesReactionResponseItemDto> reactions;

    public MessagesGetReactedPeersResponseDto(int i, List<MessagesReactionResponseItemDto> list, List<MessagesReactionCounterResponseItemDto> list2, List<UsersUserFullDto> list3, List<GroupsGroupFullDto> list4) {
        this.count = i;
        this.reactions = list;
        this.counters = list2;
        this.profiles = list3;
        this.groups = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetReactedPeersResponseDto)) {
            return false;
        }
        MessagesGetReactedPeersResponseDto messagesGetReactedPeersResponseDto = (MessagesGetReactedPeersResponseDto) obj;
        return this.count == messagesGetReactedPeersResponseDto.count && epx.f(this.reactions, messagesGetReactedPeersResponseDto.reactions) && epx.f(this.counters, messagesGetReactedPeersResponseDto.counters) && epx.f(this.profiles, messagesGetReactedPeersResponseDto.profiles) && epx.f(this.groups, messagesGetReactedPeersResponseDto.groups);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a(Integer.hashCode(this.count) * 31, 31, this.reactions), 31, this.counters);
        List<UsersUserFullDto> list = this.profiles;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<MessagesReactionResponseItemDto> list = this.reactions;
        List<MessagesReactionCounterResponseItemDto> list2 = this.counters;
        List<UsersUserFullDto> list3 = this.profiles;
        List<GroupsGroupFullDto> list4 = this.groups;
        StringBuilder c = zn.c(i, "MessagesGetReactedPeersResponseDto(count=", ", reactions=", ", counters=", list);
        vq.d(c, list2, ", profiles=", list3, ", groups=");
        return vp.b(")", c, list4);
    }

    public /* synthetic */ MessagesGetReactedPeersResponseDto(int i, List list, List list2, List list3, List list4, int i2, zcl zclVar) {
        this(i, list, list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : list4);
    }
}
