package com.vk.sdk.api.stories.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: StoriesGetBannedResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoriesGetBannedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    public StoriesGetBannedResponseDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetBannedResponseDto)) {
            return false;
        }
        StoriesGetBannedResponseDto storiesGetBannedResponseDto = (StoriesGetBannedResponseDto) obj;
        return this.count == storiesGetBannedResponseDto.count && epx.f(this.items, storiesGetBannedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "StoriesGetBannedResponseDto(count=", ", items=", ")", this.items);
    }
}
