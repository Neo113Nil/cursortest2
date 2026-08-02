package com.vk.sdk.api.polls.dto;

import com.vk.sdk.api.users.dto.UsersUserFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: PollsVotersFieldsUsersDto.kt */
/* loaded from: classes5.dex */
public final class PollsVotersFieldsUsersDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public PollsVotersFieldsUsersDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollsVotersFieldsUsersDto)) {
            return false;
        }
        PollsVotersFieldsUsersDto pollsVotersFieldsUsersDto = (PollsVotersFieldsUsersDto) obj;
        return epx.f(this.count, pollsVotersFieldsUsersDto.count) && epx.f(this.items, pollsVotersFieldsUsersDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UsersUserFullDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PollsVotersFieldsUsersDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public PollsVotersFieldsUsersDto(Integer num, List<UsersUserFullDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ PollsVotersFieldsUsersDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
