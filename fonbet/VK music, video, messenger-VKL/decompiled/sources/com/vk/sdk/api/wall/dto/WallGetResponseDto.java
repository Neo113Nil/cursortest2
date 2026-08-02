package com.vk.sdk.api.wall.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: WallGetResponseDto.kt */
/* loaded from: classes5.dex */
public final class WallGetResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<WallWallItemDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public WallGetResponseDto(int i, List<? extends WallWallItemDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallGetResponseDto)) {
            return false;
        }
        WallGetResponseDto wallGetResponseDto = (WallGetResponseDto) obj;
        return this.count == wallGetResponseDto.count && epx.f(this.items, wallGetResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "WallGetResponseDto(count=", ", items=", ")", this.items);
    }
}
