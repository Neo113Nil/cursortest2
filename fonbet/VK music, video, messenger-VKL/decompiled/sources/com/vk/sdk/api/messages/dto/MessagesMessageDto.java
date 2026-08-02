package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseGeoDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.kr;
import xsna.n6j;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.tq;
import xsna.urd0;
import xsna.vp;
import xsna.zcl;

/* compiled from: MessagesMessageDto.kt */
/* loaded from: classes5.dex */
public final class MessagesMessageDto {

    @pmi0("action")
    private final MessagesActionOneOfDto action;

    @pmi0("admin_author_id")
    private final UserId adminAuthorId;

    @pmi0("attachments")
    private final List<MessagesMessageAttachmentDto> attachments;

    @pmi0("conversation_message_id")
    private final Integer conversationMessageId;

    @pmi0("date")
    private final int date;

    @pmi0("deleted")
    private final BaseBoolIntDto deleted;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("fwd_messages")
    private final List<MessagesForeignMessageDto> fwdMessages;

    @pmi0("geo")
    private final BaseGeoDto geo;

    @pmi0("id")
    private final int id;

    @pmi0("important")
    private final Boolean important;

    @pmi0("is_cropped")
    private final Boolean isCropped;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("is_silent")
    private final Boolean isSilent;

    @pmi0("keyboard")
    private final MessagesKeyboardDto keyboard;

    @pmi0("last_reaction_id")
    private final Integer lastReactionId;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("out")
    private final BaseBoolIntDto out;

    @pmi0("payload")
    private final String payload;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("pinned_at")
    private final Integer pinnedAt;

    @pmi0("random_id")
    private final Integer randomId;

    @pmi0("reaction_id")
    private final Integer reactionId;

    @pmi0("reactions")
    private final List<MessagesReactionCounterResponseItemDto> reactions;

    @pmi0("ref")
    private final String ref;

    @pmi0("ref_source")
    private final String refSource;

    @pmi0("reply_message")
    private final MessagesForeignMessageDto replyMessage;

    @pmi0("text")
    private final String text;

    @pmi0("update_time")
    private final Integer updateTime;

    @pmi0("was_listened")
    private final Boolean wasListened;

    public MessagesMessageDto(int i, UserId userId, int i2, BaseBoolIntDto baseBoolIntDto, UserId userId2, String str, MessagesActionOneOfDto messagesActionOneOfDto, UserId userId3, List<MessagesMessageAttachmentDto> list, Integer num, BaseBoolIntDto baseBoolIntDto2, List<MessagesForeignMessageDto> list2, BaseGeoDto baseGeoDto, Boolean bool, Boolean bool2, Boolean bool3, MessagesKeyboardDto messagesKeyboardDto, Integer num2, String str2, Integer num3, String str3, String str4, MessagesForeignMessageDto messagesForeignMessageDto, Integer num4, List<MessagesReactionCounterResponseItemDto> list3, Integer num5, Integer num6, Boolean bool4, Integer num7, Boolean bool5) {
        this.date = i;
        this.fromId = userId;
        this.id = i2;
        this.out = baseBoolIntDto;
        this.peerId = userId2;
        this.text = str;
        this.action = messagesActionOneOfDto;
        this.adminAuthorId = userId3;
        this.attachments = list;
        this.conversationMessageId = num;
        this.deleted = baseBoolIntDto2;
        this.fwdMessages = list2;
        this.geo = baseGeoDto;
        this.important = bool;
        this.isHidden = bool2;
        this.isCropped = bool3;
        this.keyboard = messagesKeyboardDto;
        this.membersCount = num2;
        this.payload = str2;
        this.randomId = num3;
        this.ref = str3;
        this.refSource = str4;
        this.replyMessage = messagesForeignMessageDto;
        this.reactionId = num4;
        this.reactions = list3;
        this.lastReactionId = num5;
        this.updateTime = num6;
        this.wasListened = bool4;
        this.pinnedAt = num7;
        this.isSilent = bool5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageDto)) {
            return false;
        }
        MessagesMessageDto messagesMessageDto = (MessagesMessageDto) obj;
        return this.date == messagesMessageDto.date && epx.f(this.fromId, messagesMessageDto.fromId) && this.id == messagesMessageDto.id && this.out == messagesMessageDto.out && epx.f(this.peerId, messagesMessageDto.peerId) && epx.f(this.text, messagesMessageDto.text) && epx.f(this.action, messagesMessageDto.action) && epx.f(this.adminAuthorId, messagesMessageDto.adminAuthorId) && epx.f(this.attachments, messagesMessageDto.attachments) && epx.f(this.conversationMessageId, messagesMessageDto.conversationMessageId) && this.deleted == messagesMessageDto.deleted && epx.f(this.fwdMessages, messagesMessageDto.fwdMessages) && epx.f(this.geo, messagesMessageDto.geo) && epx.f(this.important, messagesMessageDto.important) && epx.f(this.isHidden, messagesMessageDto.isHidden) && epx.f(this.isCropped, messagesMessageDto.isCropped) && epx.f(this.keyboard, messagesMessageDto.keyboard) && epx.f(this.membersCount, messagesMessageDto.membersCount) && epx.f(this.payload, messagesMessageDto.payload) && epx.f(this.randomId, messagesMessageDto.randomId) && epx.f(this.ref, messagesMessageDto.ref) && epx.f(this.refSource, messagesMessageDto.refSource) && epx.f(this.replyMessage, messagesMessageDto.replyMessage) && epx.f(this.reactionId, messagesMessageDto.reactionId) && epx.f(this.reactions, messagesMessageDto.reactions) && epx.f(this.lastReactionId, messagesMessageDto.lastReactionId) && epx.f(this.updateTime, messagesMessageDto.updateTime) && epx.f(this.wasListened, messagesMessageDto.wasListened) && epx.f(this.pinnedAt, messagesMessageDto.pinnedAt) && epx.f(this.isSilent, messagesMessageDto.isSilent);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(vp.a(this.out, shy.a(this.id, bh10.a(Integer.hashCode(this.date) * 31, 31, this.fromId.b), 31), 31), 31, this.peerId.b), 31, this.text);
        MessagesActionOneOfDto messagesActionOneOfDto = this.action;
        int hashCode = (a + (messagesActionOneOfDto == null ? 0 : messagesActionOneOfDto.hashCode())) * 31;
        UserId userId = this.adminAuthorId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        List<MessagesMessageAttachmentDto> list = this.attachments;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.conversationMessageId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.deleted;
        int hashCode5 = (hashCode4 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        BaseGeoDto baseGeoDto = this.geo;
        int hashCode7 = (hashCode6 + (baseGeoDto == null ? 0 : baseGeoDto.hashCode())) * 31;
        Boolean bool = this.important;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isHidden;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCropped;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        int hashCode11 = (hashCode10 + (messagesKeyboardDto == null ? 0 : messagesKeyboardDto.hashCode())) * 31;
        Integer num2 = this.membersCount;
        int hashCode12 = (hashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.payload;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.randomId;
        int hashCode14 = (hashCode13 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.ref;
        int hashCode15 = (hashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refSource;
        int hashCode16 = (hashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        int hashCode17 = (hashCode16 + (messagesForeignMessageDto == null ? 0 : messagesForeignMessageDto.hashCode())) * 31;
        Integer num4 = this.reactionId;
        int hashCode18 = (hashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<MessagesReactionCounterResponseItemDto> list3 = this.reactions;
        int hashCode19 = (hashCode18 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Integer num5 = this.lastReactionId;
        int hashCode20 = (hashCode19 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.updateTime;
        int hashCode21 = (hashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Boolean bool4 = this.wasListened;
        int hashCode22 = (hashCode21 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.pinnedAt;
        int hashCode23 = (hashCode22 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Boolean bool5 = this.isSilent;
        return hashCode23 + (bool5 != null ? bool5.hashCode() : 0);
    }

    public final String toString() {
        int i = this.date;
        UserId userId = this.fromId;
        int i2 = this.id;
        BaseBoolIntDto baseBoolIntDto = this.out;
        UserId userId2 = this.peerId;
        String str = this.text;
        MessagesActionOneOfDto messagesActionOneOfDto = this.action;
        UserId userId3 = this.adminAuthorId;
        List<MessagesMessageAttachmentDto> list = this.attachments;
        Integer num = this.conversationMessageId;
        BaseBoolIntDto baseBoolIntDto2 = this.deleted;
        List<MessagesForeignMessageDto> list2 = this.fwdMessages;
        BaseGeoDto baseGeoDto = this.geo;
        Boolean bool = this.important;
        Boolean bool2 = this.isHidden;
        Boolean bool3 = this.isCropped;
        MessagesKeyboardDto messagesKeyboardDto = this.keyboard;
        Integer num2 = this.membersCount;
        String str2 = this.payload;
        Integer num3 = this.randomId;
        String str3 = this.ref;
        String str4 = this.refSource;
        MessagesForeignMessageDto messagesForeignMessageDto = this.replyMessage;
        Integer num4 = this.reactionId;
        List<MessagesReactionCounterResponseItemDto> list3 = this.reactions;
        Integer num5 = this.lastReactionId;
        Integer num6 = this.updateTime;
        Boolean bool4 = this.wasListened;
        Integer num7 = this.pinnedAt;
        Boolean bool5 = this.isSilent;
        StringBuilder sb = new StringBuilder("MessagesMessageDto(date=");
        sb.append(i);
        sb.append(", fromId=");
        sb.append(userId);
        sb.append(", id=");
        sb.append(i2);
        sb.append(", out=");
        sb.append(baseBoolIntDto);
        sb.append(", peerId=");
        sb.append(userId2);
        sb.append(", text=");
        sb.append(str);
        sb.append(", action=");
        sb.append(messagesActionOneOfDto);
        sb.append(", adminAuthorId=");
        sb.append(userId3);
        sb.append(", attachments=");
        sb.append(list);
        sb.append(", conversationMessageId=");
        sb.append(num);
        sb.append(", deleted=");
        sb.append(baseBoolIntDto2);
        sb.append(", fwdMessages=");
        sb.append(list2);
        sb.append(", geo=");
        sb.append(baseGeoDto);
        sb.append(", important=");
        sb.append(bool);
        sb.append(", isHidden=");
        tq.i(sb, bool2, ", isCropped=", bool3, ", keyboard=");
        sb.append(messagesKeyboardDto);
        sb.append(", membersCount=");
        sb.append(num2);
        sb.append(", payload=");
        kr.b(num3, str2, ", randomId=", ", ref=", sb);
        n6j.b(sb, str3, ", refSource=", str4, ", replyMessage=");
        sb.append(messagesForeignMessageDto);
        sb.append(", reactionId=");
        sb.append(num4);
        sb.append(", reactions=");
        sb.append(list3);
        sb.append(", lastReactionId=");
        sb.append(num5);
        sb.append(", updateTime=");
        rq.h(sb, num6, ", wasListened=", bool4, ", pinnedAt=");
        sb.append(num7);
        sb.append(", isSilent=");
        sb.append(bool5);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MessagesMessageDto(int i, UserId userId, int i2, BaseBoolIntDto baseBoolIntDto, UserId userId2, String str, MessagesActionOneOfDto messagesActionOneOfDto, UserId userId3, List list, Integer num, BaseBoolIntDto baseBoolIntDto2, List list2, BaseGeoDto baseGeoDto, Boolean bool, Boolean bool2, Boolean bool3, MessagesKeyboardDto messagesKeyboardDto, Integer num2, String str2, Integer num3, String str3, String str4, MessagesForeignMessageDto messagesForeignMessageDto, Integer num4, List list3, Integer num5, Integer num6, Boolean bool4, Integer num7, Boolean bool5, int i3, zcl zclVar) {
        this(i, userId, i2, baseBoolIntDto, userId2, str, (i3 & 64) != 0 ? null : messagesActionOneOfDto, (i3 & 128) != 0 ? null : userId3, (i3 & 256) != 0 ? null : list, (i3 & 512) != 0 ? null : num, (i3 & 1024) != 0 ? null : baseBoolIntDto2, (i3 & 2048) != 0 ? null : list2, (i3 & 4096) != 0 ? null : baseGeoDto, (i3 & 8192) != 0 ? null : bool, (i3 & 16384) != 0 ? null : bool2, (32768 & i3) != 0 ? null : bool3, (65536 & i3) != 0 ? null : messagesKeyboardDto, (131072 & i3) != 0 ? null : num2, (262144 & i3) != 0 ? null : str2, (524288 & i3) != 0 ? null : num3, (1048576 & i3) != 0 ? null : str3, (2097152 & i3) != 0 ? null : str4, (4194304 & i3) != 0 ? null : messagesForeignMessageDto, (8388608 & i3) != 0 ? null : num4, (16777216 & i3) != 0 ? null : list3, (33554432 & i3) != 0 ? null : num5, (67108864 & i3) != 0 ? null : num6, (134217728 & i3) != 0 ? null : bool4, (268435456 & i3) != 0 ? null : num7, (i3 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : bool5);
    }
}
