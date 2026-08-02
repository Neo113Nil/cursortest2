package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.base.dto.BaseUserIdDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemFriendFriendsDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemFriendFriendsDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<BaseUserIdDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemFriendFriendsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemFriendFriendsDto)) {
            return false;
        }
        NewsfeedItemFriendFriendsDto newsfeedItemFriendFriendsDto = (NewsfeedItemFriendFriendsDto) obj;
        return epx.f(this.count, newsfeedItemFriendFriendsDto.count) && epx.f(this.items, newsfeedItemFriendFriendsDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<BaseUserIdDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemFriendFriendsDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public NewsfeedItemFriendFriendsDto(Integer num, List<BaseUserIdDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemFriendFriendsDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
