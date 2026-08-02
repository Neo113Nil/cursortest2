package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.cgn;
import xsna.epx;
import xsna.l4;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.tq;
import xsna.zcl;

/* compiled from: MessagesConversationDto.kt */
/* loaded from: classes5.dex */
public final class MessagesConversationDto {

    @pmi0("can_receive_money")
    private final Boolean canReceiveMoney;

    @pmi0("can_send_money")
    private final Boolean canSendMoney;

    @pmi0("can_write")
    private final MessagesConversationCanWriteDto canWrite;

    @pmi0("chat_settings")
    private final MessagesChatSettingsDto chatSettings;

    @pmi0("current_keyboard")
    private final MessagesKeyboardDto currentKeyboard;

    @pmi0("expire_messages")
    private final List<Integer> expireMessages;

    @pmi0("important")
    private final Boolean important;

    @pmi0("in_read")
    private final int inRead;

    @pmi0("is_archived")
    private final Boolean isArchived;

    @pmi0("is_marked_unread")
    private final Boolean isMarkedUnread;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("last_conversation_message_id")
    private final Integer lastConversationMessageId;

    @pmi0("last_message_id")
    private final int lastMessageId;

    @pmi0("mentions")
    private final List<Integer> mentions;

    @pmi0("message_request_data")
    private final MessagesMessageRequestDataDto messageRequestData;

    @pmi0("out_read")
    private final int outRead;

    @pmi0("out_read_by")
    private final MessagesOutReadByDto outReadBy;

    @pmi0("peer")
    private final MessagesConversationPeerDto peer;

    @pmi0("push_settings")
    private final MessagesPushSettingsDto pushSettings;

    @pmi0("sort_id")
    private final MessagesConversationSortIdDto sortId;

    @pmi0("spam_expiration")
    private final Integer spamExpiration;

    @pmi0("special_service_type")
    private final String specialServiceType;

    @pmi0("unanswered")
    private final Boolean unanswered;

    @pmi0("unread_count")
    private final Integer unreadCount;

    public MessagesConversationDto(MessagesConversationPeerDto messagesConversationPeerDto, int i, int i2, int i3, MessagesConversationSortIdDto messagesConversationSortIdDto, Integer num, Integer num2, Boolean bool, MessagesOutReadByDto messagesOutReadByDto, Boolean bool2, Boolean bool3, String str, MessagesMessageRequestDataDto messagesMessageRequestDataDto, List<Integer> list, List<Integer> list2, MessagesKeyboardDto messagesKeyboardDto, MessagesPushSettingsDto messagesPushSettingsDto, MessagesConversationCanWriteDto messagesConversationCanWriteDto, Boolean bool4, Boolean bool5, MessagesChatSettingsDto messagesChatSettingsDto, Integer num3, Boolean bool6, Boolean bool7) {
        this.peer = messagesConversationPeerDto;
        this.lastMessageId = i;
        this.inRead = i2;
        this.outRead = i3;
        this.sortId = messagesConversationSortIdDto;
        this.lastConversationMessageId = num;
        this.unreadCount = num2;
        this.isMarkedUnread = bool;
        this.outReadBy = messagesOutReadByDto;
        this.important = bool2;
        this.unanswered = bool3;
        this.specialServiceType = str;
        this.messageRequestData = messagesMessageRequestDataDto;
        this.mentions = list;
        this.expireMessages = list2;
        this.currentKeyboard = messagesKeyboardDto;
        this.pushSettings = messagesPushSettingsDto;
        this.canWrite = messagesConversationCanWriteDto;
        this.canSendMoney = bool4;
        this.canReceiveMoney = bool5;
        this.chatSettings = messagesChatSettingsDto;
        this.spamExpiration = num3;
        this.isNew = bool6;
        this.isArchived = bool7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationDto)) {
            return false;
        }
        MessagesConversationDto messagesConversationDto = (MessagesConversationDto) obj;
        return epx.f(this.peer, messagesConversationDto.peer) && this.lastMessageId == messagesConversationDto.lastMessageId && this.inRead == messagesConversationDto.inRead && this.outRead == messagesConversationDto.outRead && epx.f(this.sortId, messagesConversationDto.sortId) && epx.f(this.lastConversationMessageId, messagesConversationDto.lastConversationMessageId) && epx.f(this.unreadCount, messagesConversationDto.unreadCount) && epx.f(this.isMarkedUnread, messagesConversationDto.isMarkedUnread) && epx.f(this.outReadBy, messagesConversationDto.outReadBy) && epx.f(this.important, messagesConversationDto.important) && epx.f(this.unanswered, messagesConversationDto.unanswered) && epx.f(this.specialServiceType, messagesConversationDto.specialServiceType) && epx.f(this.messageRequestData, messagesConversationDto.messageRequestData) && epx.f(this.mentions, messagesConversationDto.mentions) && epx.f(this.expireMessages, messagesConversationDto.expireMessages) && epx.f(this.currentKeyboard, messagesConversationDto.currentKeyboard) && epx.f(this.pushSettings, messagesConversationDto.pushSettings) && epx.f(this.canWrite, messagesConversationDto.canWrite) && epx.f(this.canSendMoney, messagesConversationDto.canSendMoney) && epx.f(this.canReceiveMoney, messagesConversationDto.canReceiveMoney) && epx.f(this.chatSettings, messagesConversationDto.chatSettings) && epx.f(this.spamExpiration, messagesConversationDto.spamExpiration) && epx.f(this.isNew, messagesConversationDto.isNew) && epx.f(this.isArchived, messagesConversationDto.isArchived);
    }

    public final int hashCode() {
        int a = shy.a(this.outRead, shy.a(this.inRead, shy.a(this.lastMessageId, this.peer.hashCode() * 31, 31), 31), 31);
        MessagesConversationSortIdDto messagesConversationSortIdDto = this.sortId;
        int hashCode = (a + (messagesConversationSortIdDto == null ? 0 : messagesConversationSortIdDto.hashCode())) * 31;
        Integer num = this.lastConversationMessageId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.unreadCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.isMarkedUnread;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        MessagesOutReadByDto messagesOutReadByDto = this.outReadBy;
        int hashCode5 = (hashCode4 + (messagesOutReadByDto == null ? 0 : messagesOutReadByDto.hashCode())) * 31;
        Boolean bool2 = this.important;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.unanswered;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.specialServiceType;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        MessagesMessageRequestDataDto messagesMessageRequestDataDto = this.messageRequestData;
        int hashCode9 = (hashCode8 + (messagesMessageRequestDataDto == null ? 0 : messagesMessageRequestDataDto.hashCode())) * 31;
        List<Integer> list = this.mentions;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.expireMessages;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        MessagesKeyboardDto messagesKeyboardDto = this.currentKeyboard;
        int hashCode12 = (hashCode11 + (messagesKeyboardDto == null ? 0 : messagesKeyboardDto.hashCode())) * 31;
        MessagesPushSettingsDto messagesPushSettingsDto = this.pushSettings;
        int hashCode13 = (hashCode12 + (messagesPushSettingsDto == null ? 0 : messagesPushSettingsDto.hashCode())) * 31;
        MessagesConversationCanWriteDto messagesConversationCanWriteDto = this.canWrite;
        int hashCode14 = (hashCode13 + (messagesConversationCanWriteDto == null ? 0 : messagesConversationCanWriteDto.hashCode())) * 31;
        Boolean bool4 = this.canSendMoney;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.canReceiveMoney;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        MessagesChatSettingsDto messagesChatSettingsDto = this.chatSettings;
        int hashCode17 = (hashCode16 + (messagesChatSettingsDto == null ? 0 : messagesChatSettingsDto.hashCode())) * 31;
        Integer num3 = this.spamExpiration;
        int hashCode18 = (hashCode17 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool6 = this.isNew;
        int hashCode19 = (hashCode18 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.isArchived;
        return hashCode19 + (bool7 != null ? bool7.hashCode() : 0);
    }

    public final String toString() {
        MessagesConversationPeerDto messagesConversationPeerDto = this.peer;
        int i = this.lastMessageId;
        int i2 = this.inRead;
        int i3 = this.outRead;
        MessagesConversationSortIdDto messagesConversationSortIdDto = this.sortId;
        Integer num = this.lastConversationMessageId;
        Integer num2 = this.unreadCount;
        Boolean bool = this.isMarkedUnread;
        MessagesOutReadByDto messagesOutReadByDto = this.outReadBy;
        Boolean bool2 = this.important;
        Boolean bool3 = this.unanswered;
        String str = this.specialServiceType;
        MessagesMessageRequestDataDto messagesMessageRequestDataDto = this.messageRequestData;
        List<Integer> list = this.mentions;
        List<Integer> list2 = this.expireMessages;
        MessagesKeyboardDto messagesKeyboardDto = this.currentKeyboard;
        MessagesPushSettingsDto messagesPushSettingsDto = this.pushSettings;
        MessagesConversationCanWriteDto messagesConversationCanWriteDto = this.canWrite;
        Boolean bool4 = this.canSendMoney;
        Boolean bool5 = this.canReceiveMoney;
        MessagesChatSettingsDto messagesChatSettingsDto = this.chatSettings;
        Integer num3 = this.spamExpiration;
        Boolean bool6 = this.isNew;
        Boolean bool7 = this.isArchived;
        StringBuilder sb = new StringBuilder("MessagesConversationDto(peer=");
        sb.append(messagesConversationPeerDto);
        sb.append(", lastMessageId=");
        sb.append(i);
        sb.append(", inRead=");
        cgn.a(i2, i3, ", outRead=", ", sortId=", sb);
        sb.append(messagesConversationSortIdDto);
        sb.append(", lastConversationMessageId=");
        sb.append(num);
        sb.append(", unreadCount=");
        rq.h(sb, num2, ", isMarkedUnread=", bool, ", outReadBy=");
        sb.append(messagesOutReadByDto);
        sb.append(", important=");
        sb.append(bool2);
        sb.append(", unanswered=");
        l4.i(bool3, ", specialServiceType=", str, ", messageRequestData=", sb);
        sb.append(messagesMessageRequestDataDto);
        sb.append(", mentions=");
        sb.append(list);
        sb.append(", expireMessages=");
        sb.append(list2);
        sb.append(", currentKeyboard=");
        sb.append(messagesKeyboardDto);
        sb.append(", pushSettings=");
        sb.append(messagesPushSettingsDto);
        sb.append(", canWrite=");
        sb.append(messagesConversationCanWriteDto);
        sb.append(", canSendMoney=");
        tq.i(sb, bool4, ", canReceiveMoney=", bool5, ", chatSettings=");
        sb.append(messagesChatSettingsDto);
        sb.append(", spamExpiration=");
        sb.append(num3);
        sb.append(", isNew=");
        sb.append(bool6);
        sb.append(", isArchived=");
        sb.append(bool7);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MessagesConversationDto(MessagesConversationPeerDto messagesConversationPeerDto, int i, int i2, int i3, MessagesConversationSortIdDto messagesConversationSortIdDto, Integer num, Integer num2, Boolean bool, MessagesOutReadByDto messagesOutReadByDto, Boolean bool2, Boolean bool3, String str, MessagesMessageRequestDataDto messagesMessageRequestDataDto, List list, List list2, MessagesKeyboardDto messagesKeyboardDto, MessagesPushSettingsDto messagesPushSettingsDto, MessagesConversationCanWriteDto messagesConversationCanWriteDto, Boolean bool4, Boolean bool5, MessagesChatSettingsDto messagesChatSettingsDto, Integer num3, Boolean bool6, Boolean bool7, int i4, zcl zclVar) {
        this(messagesConversationPeerDto, i, i2, i3, (i4 & 16) != 0 ? null : messagesConversationSortIdDto, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : num2, (i4 & 128) != 0 ? null : bool, (i4 & 256) != 0 ? null : messagesOutReadByDto, (i4 & 512) != 0 ? null : bool2, (i4 & 1024) != 0 ? null : bool3, (i4 & 2048) != 0 ? null : str, (i4 & 4096) != 0 ? null : messagesMessageRequestDataDto, (i4 & 8192) != 0 ? null : list, (i4 & 16384) != 0 ? null : list2, (32768 & i4) != 0 ? null : messagesKeyboardDto, (65536 & i4) != 0 ? null : messagesPushSettingsDto, (131072 & i4) != 0 ? null : messagesConversationCanWriteDto, (262144 & i4) != 0 ? null : bool4, (524288 & i4) != 0 ? null : bool5, (1048576 & i4) != 0 ? null : messagesChatSettingsDto, (2097152 & i4) != 0 ? null : num3, (4194304 & i4) != 0 ? null : bool6, (i4 & 8388608) != 0 ? null : bool7);
    }
}
