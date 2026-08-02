package com.vk.sdk.api.messages.dto;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import ru.ok.android.sdk.SharedKt;
import xsna.bh10;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.rq;
import xsna.shy;
import xsna.sq;
import xsna.zcl;

/* compiled from: MessagesHistoryAttachmentDto.kt */
/* loaded from: classes5.dex */
public final class MessagesHistoryAttachmentDto {

    @pmi0(SharedKt.PARAM_ATTACHMENT)
    private final MessagesHistoryMessageAttachmentDto attachment;

    @pmi0("cmid")
    private final Integer cmid;

    @pmi0("date")
    private final int date;

    @pmi0("forward_level")
    private final Integer forwardLevel;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("message_expire_ttl")
    private final Integer messageExpireTtl;

    @pmi0("message_id")
    private final int messageId;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("was_listened")
    private final Boolean wasListened;

    public MessagesHistoryAttachmentDto(MessagesHistoryMessageAttachmentDto messagesHistoryMessageAttachmentDto, int i, int i2, UserId userId, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4) {
        this.attachment = messagesHistoryMessageAttachmentDto;
        this.date = i;
        this.messageId = i2;
        this.fromId = userId;
        this.messageExpireTtl = num;
        this.cmid = num2;
        this.forwardLevel = num3;
        this.wasListened = bool;
        this.position = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesHistoryAttachmentDto)) {
            return false;
        }
        MessagesHistoryAttachmentDto messagesHistoryAttachmentDto = (MessagesHistoryAttachmentDto) obj;
        return epx.f(this.attachment, messagesHistoryAttachmentDto.attachment) && this.date == messagesHistoryAttachmentDto.date && this.messageId == messagesHistoryAttachmentDto.messageId && epx.f(this.fromId, messagesHistoryAttachmentDto.fromId) && epx.f(this.messageExpireTtl, messagesHistoryAttachmentDto.messageExpireTtl) && epx.f(this.cmid, messagesHistoryAttachmentDto.cmid) && epx.f(this.forwardLevel, messagesHistoryAttachmentDto.forwardLevel) && epx.f(this.wasListened, messagesHistoryAttachmentDto.wasListened) && epx.f(this.position, messagesHistoryAttachmentDto.position);
    }

    public final int hashCode() {
        int a = bh10.a(shy.a(this.messageId, shy.a(this.date, this.attachment.hashCode() * 31, 31), 31), 31, this.fromId.b);
        Integer num = this.messageExpireTtl;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cmid;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.forwardLevel;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.wasListened;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num4 = this.position;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        MessagesHistoryMessageAttachmentDto messagesHistoryMessageAttachmentDto = this.attachment;
        int i = this.date;
        int i2 = this.messageId;
        UserId userId = this.fromId;
        Integer num = this.messageExpireTtl;
        Integer num2 = this.cmid;
        Integer num3 = this.forwardLevel;
        Boolean bool = this.wasListened;
        Integer num4 = this.position;
        StringBuilder sb = new StringBuilder("MessagesHistoryAttachmentDto(attachment=");
        sb.append(messagesHistoryMessageAttachmentDto);
        sb.append(", date=");
        sb.append(i);
        sb.append(", messageId=");
        sb.append(i2);
        sb.append(", fromId=");
        sb.append(userId);
        sb.append(", messageExpireTtl=");
        sq.b(sb, num, ", cmid=", num2, ", forwardLevel=");
        rq.h(sb, num3, ", wasListened=", bool, ", position=");
        return oq.b(sb, num4, ")");
    }

    public /* synthetic */ MessagesHistoryAttachmentDto(MessagesHistoryMessageAttachmentDto messagesHistoryMessageAttachmentDto, int i, int i2, UserId userId, Integer num, Integer num2, Integer num3, Boolean bool, Integer num4, int i3, zcl zclVar) {
        this(messagesHistoryMessageAttachmentDto, i, i2, userId, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? null : num3, (i3 & 128) != 0 ? null : bool, (i3 & 256) != 0 ? null : num4);
    }
}
