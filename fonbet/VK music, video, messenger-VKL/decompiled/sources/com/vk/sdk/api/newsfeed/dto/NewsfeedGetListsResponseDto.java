package com.vk.sdk.api.newsfeed.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: NewsfeedGetListsResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedGetListsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<NewsfeedListDto> items;

    public NewsfeedGetListsResponseDto(int i, List<NewsfeedListDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetListsResponseDto)) {
            return false;
        }
        NewsfeedGetListsResponseDto newsfeedGetListsResponseDto = (NewsfeedGetListsResponseDto) obj;
        return this.count == newsfeedGetListsResponseDto.count && epx.f(this.items, newsfeedGetListsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "NewsfeedGetListsResponseDto(count=", ", items=", ")", this.items);
    }
}
