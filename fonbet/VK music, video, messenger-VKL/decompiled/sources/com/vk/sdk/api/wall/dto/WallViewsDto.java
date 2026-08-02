package com.vk.sdk.api.wall.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallViewsDto.kt */
/* loaded from: classes5.dex */
public final class WallViewsDto {

    @pmi0("count")
    private final Integer count;

    /* JADX WARN: Multi-variable type inference failed */
    public WallViewsDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WallViewsDto) && epx.f(this.count, ((WallViewsDto) obj).count);
    }

    public final int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "WallViewsDto(count=" + this.count + ")";
    }

    public WallViewsDto(Integer num) {
        this.count = num;
    }

    public /* synthetic */ WallViewsDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
