package com.vk.sdk.api.friends.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: FriendsRequestsMutualDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRequestsMutualDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("users")
    private final List<UserId> users;

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsRequestsMutualDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRequestsMutualDto)) {
            return false;
        }
        FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) obj;
        return epx.f(this.count, friendsRequestsMutualDto.count) && epx.f(this.users, friendsRequestsMutualDto.users);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<UserId> list = this.users;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "FriendsRequestsMutualDto(count=" + this.count + ", users=" + this.users + ")";
    }

    public FriendsRequestsMutualDto(Integer num, List<UserId> list) {
        this.count = num;
        this.users = list;
    }

    public /* synthetic */ FriendsRequestsMutualDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
