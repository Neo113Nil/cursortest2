package com.vk.sdk.api.messages.dto;

import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;

/* compiled from: MessagesGetChatPreviewResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetChatPreviewResponseDto {

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("preview")
    private final MessagesChatPreviewDto preview;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesGetChatPreviewResponseDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetChatPreviewResponseDto)) {
            return false;
        }
        MessagesGetChatPreviewResponseDto messagesGetChatPreviewResponseDto = (MessagesGetChatPreviewResponseDto) obj;
        return epx.f(this.preview, messagesGetChatPreviewResponseDto.preview) && epx.f(this.profiles, messagesGetChatPreviewResponseDto.profiles) && epx.f(this.groups, messagesGetChatPreviewResponseDto.groups);
    }

    public final int hashCode() {
        MessagesChatPreviewDto messagesChatPreviewDto = this.preview;
        int hashCode = (messagesChatPreviewDto == null ? 0 : messagesChatPreviewDto.hashCode()) * 31;
        List<UsersUserFullDto> list = this.profiles;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<GroupsGroupFullDto> list2 = this.groups;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        MessagesChatPreviewDto messagesChatPreviewDto = this.preview;
        List<UsersUserFullDto> list = this.profiles;
        List<GroupsGroupFullDto> list2 = this.groups;
        StringBuilder sb = new StringBuilder("MessagesGetChatPreviewResponseDto(preview=");
        sb.append(messagesChatPreviewDto);
        sb.append(", profiles=");
        sb.append(list);
        sb.append(", groups=");
        return vp.b(")", sb, list2);
    }

    public MessagesGetChatPreviewResponseDto(MessagesChatPreviewDto messagesChatPreviewDto, List<UsersUserFullDto> list, List<GroupsGroupFullDto> list2) {
        this.preview = messagesChatPreviewDto;
        this.profiles = list;
        this.groups = list2;
    }

    public /* synthetic */ MessagesGetChatPreviewResponseDto(MessagesChatPreviewDto messagesChatPreviewDto, List list, List list2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesChatPreviewDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
