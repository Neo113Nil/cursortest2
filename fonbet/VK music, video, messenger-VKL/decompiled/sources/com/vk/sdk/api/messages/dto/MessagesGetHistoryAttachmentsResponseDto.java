package com.vk.sdk.api.messages.dto;

import com.vk.movika.sdk.base.model.n;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetHistoryAttachmentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetHistoryAttachmentsResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("items")
    private final List<MessagesHistoryAttachmentDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesGetHistoryAttachmentsResponseDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetHistoryAttachmentsResponseDto)) {
            return false;
        }
        MessagesGetHistoryAttachmentsResponseDto messagesGetHistoryAttachmentsResponseDto = (MessagesGetHistoryAttachmentsResponseDto) obj;
        return epx.f(this.items, messagesGetHistoryAttachmentsResponseDto.items) && epx.f(this.nextFrom, messagesGetHistoryAttachmentsResponseDto.nextFrom) && epx.f(this.profiles, messagesGetHistoryAttachmentsResponseDto.profiles) && epx.f(this.groups, messagesGetHistoryAttachmentsResponseDto.groups);
    }

    public final int hashCode() {
        List<MessagesHistoryAttachmentDto> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextFrom;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        List<MessagesHistoryAttachmentDto> list = this.items;
        String str = this.nextFrom;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        StringBuilder sb = new StringBuilder("MessagesGetHistoryAttachmentsResponseDto(items=");
        sb.append(list);
        sb.append(", nextFrom=");
        sb.append(str);
        sb.append(", profiles=");
        return n.b(sb, list2, ", groups=", list3, ")");
    }

    public MessagesGetHistoryAttachmentsResponseDto(List<MessagesHistoryAttachmentDto> list, String str, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3) {
        this.items = list;
        this.nextFrom = str;
        this.profiles = list2;
        this.groups = list3;
    }

    public /* synthetic */ MessagesGetHistoryAttachmentsResponseDto(List list, String str, List list2, List list3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }
}
