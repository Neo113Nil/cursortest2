package com.vk.sdk.api.wall.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: WallSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallItemDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public WallSearchResponseDto(int i, List<? extends WallWallItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallSearchResponseDto)) {
            return false;
        }
        WallSearchResponseDto wallSearchResponseDto = (WallSearchResponseDto) obj;
        return this.count == wallSearchResponseDto.count && epx.f(this.items, wallSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "WallSearchResponseDto(count=", ", items=", ")", this.items);
    }
}
