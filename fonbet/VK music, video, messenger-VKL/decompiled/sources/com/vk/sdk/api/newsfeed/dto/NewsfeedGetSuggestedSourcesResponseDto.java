package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.users.dto.UsersSubscriptionsItemDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: NewsfeedGetSuggestedSourcesResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedGetSuggestedSourcesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UsersSubscriptionsItemDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedGetSuggestedSourcesResponseDto(int i, List<? extends UsersSubscriptionsItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetSuggestedSourcesResponseDto)) {
            return false;
        }
        NewsfeedGetSuggestedSourcesResponseDto newsfeedGetSuggestedSourcesResponseDto = (NewsfeedGetSuggestedSourcesResponseDto) obj;
        return this.count == newsfeedGetSuggestedSourcesResponseDto.count && epx.f(this.items, newsfeedGetSuggestedSourcesResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "NewsfeedGetSuggestedSourcesResponseDto(count=", ", items=", ")", this.items);
    }
}
