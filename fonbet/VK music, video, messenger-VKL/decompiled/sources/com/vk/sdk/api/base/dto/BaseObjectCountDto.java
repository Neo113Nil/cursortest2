package com.vk.sdk.api.base.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseObjectCountDto.kt */
/* loaded from: classes5.dex */
public final class BaseObjectCountDto {

    @pmi0("count")
    private final Integer count;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseObjectCountDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseObjectCountDto) && epx.f(this.count, ((BaseObjectCountDto) obj).count);
    }

    public final int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "BaseObjectCountDto(count=" + this.count + ")";
    }

    public BaseObjectCountDto(Integer num) {
        this.count = num;
    }

    public /* synthetic */ BaseObjectCountDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
