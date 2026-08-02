package com.vk.sdk.api.widgets.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: WidgetsGetPagesResponseDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsGetPagesResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("pages")
    private final List<WidgetsWidgetPageDto> pages;

    public WidgetsGetPagesResponseDto(int i, List<WidgetsWidgetPageDto> list) {
        this.count = i;
        this.pages = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsGetPagesResponseDto)) {
            return false;
        }
        WidgetsGetPagesResponseDto widgetsGetPagesResponseDto = (WidgetsGetPagesResponseDto) obj;
        return this.count == widgetsGetPagesResponseDto.count && epx.f(this.pages, widgetsGetPagesResponseDto.pages);
    }

    public final int hashCode() {
        return this.pages.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "WidgetsGetPagesResponseDto(count=", ", pages=", ")", this.pages);
    }
}
