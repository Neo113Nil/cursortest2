package com.vk.sdk.api.users.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.oq;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: UsersGetFollowersFieldsResponseDto.kt */
/* loaded from: classes5.dex */
public final class UsersGetFollowersFieldsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("items")
    private final List<UsersUserFullDto> items;

    public UsersGetFollowersFieldsResponseDto(int i, List<UsersUserFullDto> list, Integer num) {
        this.count = i;
        this.items = list;
        this.friendsCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsersGetFollowersFieldsResponseDto)) {
            return false;
        }
        UsersGetFollowersFieldsResponseDto usersGetFollowersFieldsResponseDto = (UsersGetFollowersFieldsResponseDto) obj;
        return this.count == usersGetFollowersFieldsResponseDto.count && epx.f(this.items, usersGetFollowersFieldsResponseDto.items) && epx.f(this.friendsCount, usersGetFollowersFieldsResponseDto.friendsCount);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.friendsCount;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.count;
        List<UsersUserFullDto> list = this.items;
        return oq.b(zn.c(i, "UsersGetFollowersFieldsResponseDto(count=", ", items=", ", friendsCount=", list), this.friendsCount, ")");
    }

    public /* synthetic */ UsersGetFollowersFieldsResponseDto(int i, List list, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num);
    }
}
