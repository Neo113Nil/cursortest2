package com.vk.sdk.api.calls.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: CallsParticipantsDto.kt */
/* loaded from: classes5.dex */
public final class CallsParticipantsDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("list")
    private final List<Long> list;

    /* JADX WARN: Multi-variable type inference failed */
    public CallsParticipantsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallsParticipantsDto)) {
            return false;
        }
        CallsParticipantsDto callsParticipantsDto = (CallsParticipantsDto) obj;
        return epx.f(this.list, callsParticipantsDto.list) && epx.f(this.count, callsParticipantsDto.count);
    }

    public final int hashCode() {
        List<Long> list = this.list;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "CallsParticipantsDto(list=" + this.list + ", count=" + this.count + ")";
    }

    public CallsParticipantsDto(List<Long> list, Integer num) {
        this.list = list;
        this.count = num;
    }

    public /* synthetic */ CallsParticipantsDto(List list, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
