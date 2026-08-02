package com.vk.sdk.api.widgets.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: WidgetsGetCommentsResponseDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsGetCommentsResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("posts")
    private final List<WidgetsWidgetCommentDto> posts;

    public WidgetsGetCommentsResponseDto(int i, List<WidgetsWidgetCommentDto> list) {
        this.count = i;
        this.posts = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsGetCommentsResponseDto)) {
            return false;
        }
        WidgetsGetCommentsResponseDto widgetsGetCommentsResponseDto = (WidgetsGetCommentsResponseDto) obj;
        return this.count == widgetsGetCommentsResponseDto.count && epx.f(this.posts, widgetsGetCommentsResponseDto.posts);
    }

    public final int hashCode() {
        return this.posts.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "WidgetsGetCommentsResponseDto(count=", ", posts=", ")", this.posts);
    }
}
