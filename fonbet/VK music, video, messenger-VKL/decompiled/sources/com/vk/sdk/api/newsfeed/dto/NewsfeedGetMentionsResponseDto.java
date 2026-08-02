package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.wall.dto.WallWallpostFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: NewsfeedGetMentionsResponseDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedGetMentionsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallpostFullDto> items;

    public NewsfeedGetMentionsResponseDto(int i, List<WallWallpostFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedGetMentionsResponseDto)) {
            return false;
        }
        NewsfeedGetMentionsResponseDto newsfeedGetMentionsResponseDto = (NewsfeedGetMentionsResponseDto) obj;
        return this.count == newsfeedGetMentionsResponseDto.count && epx.f(this.items, newsfeedGetMentionsResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "NewsfeedGetMentionsResponseDto(count=", ", items=", ")", this.items);
    }
}
