package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import com.vk.movika.sdk.base.model.history.b;
import com.vk.sdk.api.base.dto.BaseGeoDto;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.rq;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesForeignMessageDto.kt */
/* loaded from: classes5.dex */
public final class MessagesForeignMessageDto {

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
    private final Integer id;

    @pmi0("payload")
    private final String payload;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("reply_message")
    private final MessagesForeignMessageDto replyMessage;

    @pmi0("text")
    private final String text;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("was_listened")
    private final Boolean wasListened;

    public MessagesForeignMessageDto(int i, UserId userId, String str, List<MessagesMessageAttachmentDto> list, Integer num, List<MessagesForeignMessageDto> list2, BaseGeoDto baseGeoDto, Integer num2, UserId userId2, MessagesForeignMessageDto messagesForeignMessageDto, Integer num3, Boolean bool, String str2) {
        this.date = i;
        this.fromId = userId;
        this.text = str;
        this.attachments = list;
        this.conversationMessageId = num;
        this.fwdMessages = list2;
        this.geo = baseGeoDto;
        this.id = num2;
        this.peerId = userId2;
        this.replyMessage = messagesForeignMessageDto;
        this.updateTime = num3;
        this.wasListened = bool;
        this.payload = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesForeignMessageDto)) {
            return false;
        }
        MessagesForeignMessageDto messagesForeignMessageDto = (MessagesForeignMessageDto) obj;
        return this.date == messagesForeignMessageDto.date && epx.f(this.fromId, messagesForeignMessageDto.fromId) && epx.f(this.text, messagesForeignMessageDto.text) && epx.f(this.attachments, messagesForeignMessageDto.attachments) && epx.f(this.conversationMessageId, messagesForeignMessageDto.conversationMessageId) && epx.f(this.fwdMessages, messagesForeignMessageDto.fwdMessages) && epx.f(this.geo, messagesForeignMessageDto.geo) && epx.f(this.id, messagesForeignMessageDto.id) && epx.f(this.peerId, messagesForeignMessageDto.peerId) && epx.f(this.replyMessage, messagesForeignMessageDto.replyMessage) && epx.f(this.updateTime, messagesForeignMessageDto.updateTime) && epx.f(this.wasListened, messagesForeignMessageDto.wasListened) && epx.f(this.payload, messagesForeignMessageDto.payload);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Integer.hashCode(this.date) * 31, 31, this.fromId.b), 31, this.text);
        List<MessagesMessageAttachmentDto> list = this.attachments;
        int hashCode = (a + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.conversationMessageId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode4 = (hashCode3 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.peerId;
        int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        int hashCode7 = (hashCode6 + (messagesForeignMessageDto == null ? 0 : messagesForeignMessageDto.hashCode())) * 31;
        Integer num3 = this.updateTime;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.wasListened;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.payload;
        return hashCode9 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        int i = this.date;
        UserId userId = this.fromId;
        String str = this.text;
        List<MessagesMessageAttachmentDto> list = this.attachments;
        Integer num = this.conversationMessageId;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        BaseGeoDto baseGeoDto = this.geo;
        Integer num2 = this.id;
        UserId userId2 = this.peerId;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        Integer num3 = this.updateTime;
        Boolean bool = this.wasListened;
        String str2 = this.payload;
        StringBuilder sb = new StringBuilder("MessagesForeignMessageDto(date=");
        sb.append(i);
        sb.append(", fromId=");
        sb.append(userId);
        sb.append(", text=");
        b.c(str, ", attachments=", ", conversationMessageId=", sb, list);
        sb.append(num);
        sb.append(", fwdMessages=");
        sb.append(list2);
        sb.append(", geo=");
        sb.append(baseGeoDto);
        sb.append(", id=");
        sb.append(num2);
        sb.append(", peerId=");
        sb.append(userId2);
        sb.append(", replyMessage=");
        sb.append(messagesForeignMessageDto);
        sb.append(", updateTime=");
        rq.h(sb, num3, ", wasListened=", bool, ", payload=");
        return i5s.a(sb, str2, ")");
    }

    public /* synthetic */ MessagesForeignMessageDto(int i, UserId userId, String str, List list, Integer num, List list2, BaseGeoDto baseGeoDto, Integer num2, UserId userId2, MessagesForeignMessageDto messagesForeignMessageDto, Integer num3, Boolean bool, String str2, int i2, zcl zclVar) {
        this(i, userId, str, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : list2, (i2 & 64) != 0 ? null : baseGeoDto, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : userId2, (i2 & 512) != 0 ? null : messagesForeignMessageDto, (i2 & 1024) != 0 ? null : num3, (i2 & 2048) != 0 ? null : bool, (i2 & 4096) != 0 ? null : str2);
    }
}
