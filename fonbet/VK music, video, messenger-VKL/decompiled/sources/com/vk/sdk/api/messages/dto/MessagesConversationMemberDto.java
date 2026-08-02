package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.pmi0;
import xsna.tq;
import xsna.zcl;

/* compiled from: MessagesConversationMemberDto.kt */
/* loaded from: classes5.dex */
public final class MessagesConversationMemberDto {

    @pmi0("can_kick")
    private final Boolean canKick;

    @pmi0("invited_by")
    private final UserId invitedBy;

    @pmi0("is_admin")
    private final Boolean isAdmin;

    @pmi0("is_message_request")
    private final Boolean isMessageRequest;

    @pmi0("is_owner")
    private final Boolean isOwner;

    @pmi0("join_date")
    private final Integer joinDate;

    @pmi0("member_id")
    private final UserId memberId;

    @pmi0("request_date")
    private final Integer requestDate;

    public MessagesConversationMemberDto(UserId userId, Boolean bool, UserId userId2, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2) {
        this.memberId = userId;
        this.canKick = bool;
        this.invitedBy = userId2;
        this.isAdmin = bool2;
        this.isOwner = bool3;
        this.isMessageRequest = bool4;
        this.joinDate = num;
        this.requestDate = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationMemberDto)) {
            return false;
        }
        MessagesConversationMemberDto messagesConversationMemberDto = (MessagesConversationMemberDto) obj;
        return epx.f(this.memberId, messagesConversationMemberDto.memberId) && epx.f(this.canKick, messagesConversationMemberDto.canKick) && epx.f(this.invitedBy, messagesConversationMemberDto.invitedBy) && epx.f(this.isAdmin, messagesConversationMemberDto.isAdmin) && epx.f(this.isOwner, messagesConversationMemberDto.isOwner) && epx.f(this.isMessageRequest, messagesConversationMemberDto.isMessageRequest) && epx.f(this.joinDate, messagesConversationMemberDto.joinDate) && epx.f(this.requestDate, messagesConversationMemberDto.requestDate);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.memberId.b) * 31;
        Boolean bool = this.canKick;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId = this.invitedBy;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Boolean bool2 = this.isAdmin;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isOwner;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isMessageRequest;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num = this.joinDate;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.requestDate;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.memberId;
        Boolean bool = this.canKick;
        UserId userId2 = this.invitedBy;
        Boolean bool2 = this.isAdmin;
        Boolean bool3 = this.isOwner;
        Boolean bool4 = this.isMessageRequest;
        Integer num = this.joinDate;
        Integer num2 = this.requestDate;
        StringBuilder sb = new StringBuilder("MessagesConversationMemberDto(memberId=");
        sb.append(userId);
        sb.append(", canKick=");
        sb.append(bool);
        sb.append(", invitedBy=");
        sb.append(userId2);
        sb.append(", isAdmin=");
        sb.append(bool2);
        sb.append(", isOwner=");
        tq.i(sb, bool3, ", isMessageRequest=", bool4, ", joinDate=");
        sb.append(num);
        sb.append(", requestDate=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MessagesConversationMemberDto(UserId userId, Boolean bool, UserId userId2, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, Integer num2, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : userId2, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : bool4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2);
    }
}
