package com.vk.sdk.api.messages.dto;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.sdk.api.groups.dto.GroupsGroupFullDto;
import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.sq;
import xsna.vq;
import xsna.zcl;

/* compiled from: MessagesGetLongPollHistoryResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetLongPollHistoryResponseDto {

    @pmi0("chats")
    private final List<MessagesChatDto> chats;

    @pmi0("conversations")
    private final List<MessagesConversationDto> conversations;

    @pmi0("credentials")
    private final MessagesLongpollParamsDto credentials;

    @pmi0("from_pts")
    private final Integer fromPts;

    @pmi0("groups")
    private final List<GroupsGroupFullDto> groups;

    @pmi0("history")
    private final List<List<String>> history;

    @pmi0("messages")
    private final MessagesLongpollMessagesDto messages;

    @pmi0("more")
    private final Boolean more;

    @pmi0("new_pts")
    private final Integer newPts;

    @pmi0("profiles")
    private final List<UsersUserFullDto> profiles;

    public MessagesGetLongPollHistoryResponseDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetLongPollHistoryResponseDto)) {
            return false;
        }
        MessagesGetLongPollHistoryResponseDto messagesGetLongPollHistoryResponseDto = (MessagesGetLongPollHistoryResponseDto) obj;
        return epx.f(this.history, messagesGetLongPollHistoryResponseDto.history) && epx.f(this.messages, messagesGetLongPollHistoryResponseDto.messages) && epx.f(this.credentials, messagesGetLongPollHistoryResponseDto.credentials) && epx.f(this.profiles, messagesGetLongPollHistoryResponseDto.profiles) && epx.f(this.groups, messagesGetLongPollHistoryResponseDto.groups) && epx.f(this.chats, messagesGetLongPollHistoryResponseDto.chats) && epx.f(this.newPts, messagesGetLongPollHistoryResponseDto.newPts) && epx.f(this.fromPts, messagesGetLongPollHistoryResponseDto.fromPts) && epx.f(this.more, messagesGetLongPollHistoryResponseDto.more) && epx.f(this.conversations, messagesGetLongPollHistoryResponseDto.conversations);
    }

    public final int hashCode() {
        List<List<String>> list = this.history;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        MessagesLongpollMessagesDto messagesLongpollMessagesDto = this.messages;
        int hashCode2 = (hashCode + (messagesLongpollMessagesDto == null ? 0 : messagesLongpollMessagesDto.hashCode())) * 31;
        MessagesLongpollParamsDto messagesLongpollParamsDto = this.credentials;
        int hashCode3 = (hashCode2 + (messagesLongpollParamsDto == null ? 0 : messagesLongpollParamsDto.hashCode())) * 31;
        List<UsersUserFullDto> list2 = this.profiles;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GroupsGroupFullDto> list3 = this.groups;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<MessagesChatDto> list4 = this.chats;
        int hashCode6 = (hashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.newPts;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fromPts;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.more;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MessagesConversationDto> list5 = this.conversations;
        return hashCode9 + (list5 != null ? list5.hashCode() : 0);
    }

    public final String toString() {
        List<List<String>> list = this.history;
        MessagesLongpollMessagesDto messagesLongpollMessagesDto = this.messages;
        MessagesLongpollParamsDto messagesLongpollParamsDto = this.credentials;
        List<UsersUserFullDto> list2 = this.profiles;
        List<GroupsGroupFullDto> list3 = this.groups;
        List<MessagesChatDto> list4 = this.chats;
        Integer num = this.newPts;
        Integer num2 = this.fromPts;
        Boolean bool = this.more;
        List<MessagesConversationDto> list5 = this.conversations;
        StringBuilder sb = new StringBuilder("MessagesGetLongPollHistoryResponseDto(history=");
        sb.append(list);
        sb.append(", messages=");
        sb.append(messagesLongpollMessagesDto);
        sb.append(", credentials=");
        sb.append(messagesLongpollParamsDto);
        sb.append(", profiles=");
        sb.append(list2);
        sb.append(", groups=");
        vq.d(sb, list3, ", chats=", list4, ", newPts=");
        sq.b(sb, num, ", fromPts=", num2, ", more=");
        sb.append(bool);
        sb.append(", conversations=");
        sb.append(list5);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesGetLongPollHistoryResponseDto(List<? extends List<String>> list, MessagesLongpollMessagesDto messagesLongpollMessagesDto, MessagesLongpollParamsDto messagesLongpollParamsDto, List<UsersUserFullDto> list2, List<GroupsGroupFullDto> list3, List<MessagesChatDto> list4, Integer num, Integer num2, Boolean bool, List<MessagesConversationDto> list5) {
        this.history = list;
        this.messages = messagesLongpollMessagesDto;
        this.credentials = messagesLongpollParamsDto;
        this.profiles = list2;
        this.groups = list3;
        this.chats = list4;
        this.newPts = num;
        this.fromPts = num2;
        this.more = bool;
        this.conversations = list5;
    }

    public /* synthetic */ MessagesGetLongPollHistoryResponseDto(List list, MessagesLongpollMessagesDto messagesLongpollMessagesDto, MessagesLongpollParamsDto messagesLongpollParamsDto, List list2, List list3, List list4, Integer num, Integer num2, Boolean bool, List list5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : messagesLongpollMessagesDto, (i & 4) != 0 ? null : messagesLongpollParamsDto, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : list4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : list5);
    }
}
