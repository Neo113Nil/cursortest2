package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesActionOneOfDto.kt */
/* loaded from: classes5.dex */
public final class MessagesActionOneOfDto {

    @pmi0("conversation_message_id")
    private final Integer conversationMessageId;

    @pmi0("email")
    private final String email;

    @pmi0("member_id")
    private final UserId memberId;

    @pmi0("message")
    private final String message;

    @pmi0("photo")
    private final MessagesMessageActionPhotoDto photo;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final MessagesMessageActionStatusDto type;

    public MessagesActionOneOfDto(MessagesMessageActionStatusDto messagesMessageActionStatusDto, Integer num, String str, UserId userId, String str2, MessagesMessageActionPhotoDto messagesMessageActionPhotoDto, String str3) {
        this.type = messagesMessageActionStatusDto;
        this.conversationMessageId = num;
        this.email = str;
        this.memberId = userId;
        this.message = str2;
        this.photo = messagesMessageActionPhotoDto;
        this.text = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesActionOneOfDto)) {
            return false;
        }
        MessagesActionOneOfDto messagesActionOneOfDto = (MessagesActionOneOfDto) obj;
        return this.type == messagesActionOneOfDto.type && epx.f(this.conversationMessageId, messagesActionOneOfDto.conversationMessageId) && epx.f(this.email, messagesActionOneOfDto.email) && epx.f(this.memberId, messagesActionOneOfDto.memberId) && epx.f(this.message, messagesActionOneOfDto.message) && epx.f(this.photo, messagesActionOneOfDto.photo) && epx.f(this.text, messagesActionOneOfDto.text);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Integer num = this.conversationMessageId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.email;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        UserId userId = this.memberId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str2 = this.message;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessagesMessageActionPhotoDto messagesMessageActionPhotoDto = this.photo;
        int hashCode6 = (hashCode5 + (messagesMessageActionPhotoDto == null ? 0 : messagesMessageActionPhotoDto.hashCode())) * 31;
        String str3 = this.text;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        MessagesMessageActionStatusDto messagesMessageActionStatusDto = this.type;
        Integer num = this.conversationMessageId;
        String str = this.email;
        UserId userId = this.memberId;
        String str2 = this.message;
        MessagesMessageActionPhotoDto messagesMessageActionPhotoDto = this.photo;
        String str3 = this.text;
        StringBuilder sb = new StringBuilder("MessagesActionOneOfDto(type=");
        sb.append(messagesMessageActionStatusDto);
        sb.append(", conversationMessageId=");
        sb.append(num);
        sb.append(", email=");
        sb.append(str);
        sb.append(", memberId=");
        sb.append(userId);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", photo=");
        sb.append(messagesMessageActionPhotoDto);
        sb.append(", text=");
        return i5s.a(sb, str3, ")");
    }

    public /* synthetic */ MessagesActionOneOfDto(MessagesMessageActionStatusDto messagesMessageActionStatusDto, Integer num, String str, UserId userId, String str2, MessagesMessageActionPhotoDto messagesMessageActionPhotoDto, String str3, int i, zcl zclVar) {
        this(messagesMessageActionStatusDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : userId, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : messagesMessageActionPhotoDto, (i & 64) != 0 ? null : str3);
    }
}
