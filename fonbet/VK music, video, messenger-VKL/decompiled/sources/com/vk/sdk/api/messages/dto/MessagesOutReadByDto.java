package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesOutReadByDto.kt */
/* loaded from: classes5.dex */
public final class MessagesOutReadByDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("member_ids")
    private final List<UserId> memberIds;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesOutReadByDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesOutReadByDto)) {
            return false;
        }
        MessagesOutReadByDto messagesOutReadByDto = (MessagesOutReadByDto) obj;
        return epx.f(this.count, messagesOutReadByDto.count) && epx.f(this.memberIds, messagesOutReadByDto.memberIds);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UserId> list = this.memberIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesOutReadByDto(count=" + this.count + ", memberIds=" + this.memberIds + ")";
    }

    public MessagesOutReadByDto(Integer num, List<UserId> list) {
        this.count = num;
        this.memberIds = list;
    }

    public /* synthetic */ MessagesOutReadByDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
