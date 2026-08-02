package com.vk.sdk.api.friends.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.zcl;
import xsna.zn;

/* compiled from: FriendsGetRequestsResponseDto.kt */
/* loaded from: classes5.dex */
public final class FriendsGetRequestsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("count_unread")
    private final Integer countUnread;

    @pmi0("items")
    private final List<UserId> items;

    @pmi0("last_viewed")
    private final Integer lastViewed;

    public FriendsGetRequestsResponseDto(int i, List<UserId> list, Integer num, Integer num2) {
        this.count = i;
        this.items = list;
        this.countUnread = num;
        this.lastViewed = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsGetRequestsResponseDto)) {
            return false;
        }
        FriendsGetRequestsResponseDto friendsGetRequestsResponseDto = (FriendsGetRequestsResponseDto) obj;
        return this.count == friendsGetRequestsResponseDto.count && epx.f(this.items, friendsGetRequestsResponseDto.items) && epx.f(this.countUnread, friendsGetRequestsResponseDto.countUnread) && epx.f(this.lastViewed, friendsGetRequestsResponseDto.lastViewed);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.countUnread;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastViewed;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.count;
        List<UserId> list = this.items;
        Integer num = this.countUnread;
        Integer num2 = this.lastViewed;
        StringBuilder c = zn.c(i, "FriendsGetRequestsResponseDto(count=", ", items=", ", countUnread=", list);
        c.append(num);
        c.append(", lastViewed=");
        c.append(num2);
        c.append(")");
        return c.toString();
    }

    public /* synthetic */ FriendsGetRequestsResponseDto(int i, List list, Integer num, Integer num2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2);
    }
}
