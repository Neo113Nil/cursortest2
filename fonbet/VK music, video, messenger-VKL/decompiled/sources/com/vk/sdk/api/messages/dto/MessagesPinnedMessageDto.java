package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseGeoDto;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesPinnedMessageDto.kt */
/* loaded from: classes5.dex */
public final class MessagesPinnedMessageDto {

    @pmi0("attachments")
    private final List<MessagesMessageAttachmentDto> attachments;

    @pmi0("conversation_message_id")
    private final Integer conversationMessageId;

    @pmi0("date")
    private final int date;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("fwd_messages")
    private final List<MessagesForeignMessageDto> fwdMessages;

    @pmi0("geo")
    private final BaseGeoDto geo;

    @pmi0("id")
    private final int id;

    @pmi0("keyboard")
    private final MessagesKeyboardDto keyboard;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("reply_message")
    private final MessagesForeignMessageDto replyMessage;

    @pmi0("text")
    private final String text;

    public MessagesPinnedMessageDto(int i, int i2, UserId userId, UserId userId2, String str, List<MessagesMessageAttachmentDto> list, Integer num, List<MessagesForeignMessageDto> list2, BaseGeoDto baseGeoDto, MessagesForeignMessageDto messagesForeignMessageDto, MessagesKeyboardDto messagesKeyboardDto) {
        this.id = i;
        this.date = i2;
        this.fromId = userId;
        this.peerId = userId2;
        this.text = str;
        this.attachments = list;
        this.conversationMessageId = num;
        this.fwdMessages = list2;
        this.geo = baseGeoDto;
        this.replyMessage = messagesForeignMessageDto;
        this.keyboard = messagesKeyboardDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesPinnedMessageDto)) {
            return false;
        }
        MessagesPinnedMessageDto messagesPinnedMessageDto = (MessagesPinnedMessageDto) obj;
        return this.id == messagesPinnedMessageDto.id && this.date == messagesPinnedMessageDto.date && epx.f(this.fromId, messagesPinnedMessageDto.fromId) && epx.f(this.peerId, messagesPinnedMessageDto.peerId) && epx.f(this.text, messagesPinnedMessageDto.text) && epx.f(this.attachments, messagesPinnedMessageDto.attachments) && epx.f(this.conversationMessageId, messagesPinnedMessageDto.conversationMessageId) && epx.f(this.fwdMessages, messagesPinnedMessageDto.fwdMessages) && epx.f(this.geo, messagesPinnedMessageDto.geo) && epx.f(this.replyMessage, messagesPinnedMessageDto.replyMessage) && epx.f(this.keyboard, messagesPinnedMessageDto.keyboard);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(bh10.a(shy.a(this.date, Integer.hashCode(this.id) * 31, 31), 31, this.fromId.b), 31, this.peerId.b), 31, this.text);
        List<MessagesMessageAttachmentDto> list = this.attachments;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.conversationMessageId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode4 = (hashCode3 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        int hashCode5 = (hashCode4 + (messagesForeignMessageDto == null ? 0 : messagesForeignMessageDto.hashCode())) * 31;
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        return hashCode5 + (messagesKeyboardDto != null ? messagesKeyboardDto.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        int i2 = this.date;
        UserId userId = this.fromId;
        UserId userId2 = this.peerId;
        String str = this.text;
        List<MessagesMessageAttachmentDto> list = this.attachments;
        Integer num = this.conversationMessageId;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        BaseGeoDto baseGeoDto = this.geo;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        StringBuilder a = odj.a(i, i2, "MessagesPinnedMessageDto(id=", ", date=", ", fromId=");
        a.append(userId);
        a.append(", peerId=");
        a.append(userId2);
        a.append(", text=");
        b.c(str, ", attachments=", ", conversationMessageId=", a, list);
        a.append(num);
        a.append(", fwdMessages=");
        a.append(list2);
        a.append(", geo=");
        a.append(baseGeoDto);
        a.append(", replyMessage=");
        a.append(messagesForeignMessageDto);
        a.append(", keyboard=");
        a.append(messagesKeyboardDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ MessagesPinnedMessageDto(int i, int i2, UserId userId, UserId userId2, String str, List list, Integer num, List list2, BaseGeoDto baseGeoDto, MessagesForeignMessageDto messagesForeignMessageDto, MessagesKeyboardDto messagesKeyboardDto, int i3, zcl zclVar) {
        this(i, i2, userId, userId2, str, (i3 & 32) != 0 ? null : list, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : list2, (i3 & 256) != 0 ? null : baseGeoDto, (i3 & 512) != 0 ? null : messagesForeignMessageDto, (i3 & 1024) != 0 ? null : messagesKeyboardDto);
    }
}
