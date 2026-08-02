package com.vk.sdk.api.apps.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: AppsGetFriendsListResponseDto.kt */
/* loaded from: classes5.dex */
public final class AppsGetFriendsListResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    public AppsGetFriendsListResponseDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetFriendsListResponseDto)) {
            return false;
        }
        AppsGetFriendsListResponseDto appsGetFriendsListResponseDto = (AppsGetFriendsListResponseDto) obj;
        return this.count == appsGetFriendsListResponseDto.count && epx.f(this.items, appsGetFriendsListResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "AppsGetFriendsListResponseDto(count=", ", items=", ")", this.items);
    }
}
