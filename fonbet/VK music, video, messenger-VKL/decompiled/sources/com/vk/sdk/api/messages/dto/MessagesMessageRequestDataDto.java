package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesMessageRequestDataDto.kt */
/* loaded from: classes5.dex */
public final class MessagesMessageRequestDataDto {

    @pmi0("inviter_id")
    private final UserId inviterId;

    @pmi0("request_date")
    private final Integer requestDate;

    @pmi0("status")
    private final String status;

    public MessagesMessageRequestDataDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageRequestDataDto)) {
            return false;
        }
        MessagesMessageRequestDataDto messagesMessageRequestDataDto = (MessagesMessageRequestDataDto) obj;
        return epx.f(this.status, messagesMessageRequestDataDto.status) && epx.f(this.inviterId, messagesMessageRequestDataDto.inviterId) && epx.f(this.requestDate, messagesMessageRequestDataDto.requestDate);
    }

    public final int hashCode() {
        String str = this.status;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserId userId = this.inviterId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        Integer num = this.requestDate;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.status;
        UserId userId = this.inviterId;
        Integer num = this.requestDate;
        StringBuilder sb = new StringBuilder("MessagesMessageRequestDataDto(status=");
        sb.append(str);
        sb.append(", inviterId=");
        sb.append(userId);
        sb.append(", requestDate=");
        return oq.b(sb, num, ")");
    }

    public MessagesMessageRequestDataDto(String str, UserId userId, Integer num) {
        this.status = str;
        this.inviterId = userId;
        this.requestDate = num;
    }

    public /* synthetic */ MessagesMessageRequestDataDto(String str, UserId userId, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : num);
    }
}
