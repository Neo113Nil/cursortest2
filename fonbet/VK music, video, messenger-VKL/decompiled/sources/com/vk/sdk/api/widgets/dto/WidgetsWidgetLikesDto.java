package com.vk.sdk.api.widgets.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WidgetsWidgetLikesDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsWidgetLikesDto {

    @pmi0("count")
    private final Integer count;

    /* JADX WARN: Multi-variable type inference failed */
    public WidgetsWidgetLikesDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WidgetsWidgetLikesDto) && epx.f(this.count, ((WidgetsWidgetLikesDto) obj).count);
    }

    public final int hashCode() {
        Integer num = this.count;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "WidgetsWidgetLikesDto(count=" + this.count + ")";
    }

    public WidgetsWidgetLikesDto(Integer num) {
        this.count = num;
    }

    public /* synthetic */ WidgetsWidgetLikesDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
