package com.vk.sdk.api.likes.dto;

import com.vk.dto.common.id.UserId;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: LikesGetListResponseDto.kt */
/* loaded from: classes5.dex */
public final class LikesGetListResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<UserId> items;

    public LikesGetListResponseDto(int i, List<UserId> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikesGetListResponseDto)) {
            return false;
        }
        LikesGetListResponseDto likesGetListResponseDto = (LikesGetListResponseDto) obj;
        return this.count == likesGetListResponseDto.count && epx.f(this.items, likesGetListResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "LikesGetListResponseDto(count=", ", items=", ")", this.items);
    }
}
