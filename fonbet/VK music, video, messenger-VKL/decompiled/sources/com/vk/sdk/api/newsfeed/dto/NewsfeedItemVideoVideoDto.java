package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemVideoVideoDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemVideoVideoDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemVideoVideoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemVideoVideoDto)) {
            return false;
        }
        NewsfeedItemVideoVideoDto newsfeedItemVideoVideoDto = (NewsfeedItemVideoVideoDto) obj;
        return epx.f(this.count, newsfeedItemVideoVideoDto.count) && epx.f(this.items, newsfeedItemVideoVideoDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<VideoVideoFullDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemVideoVideoDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public NewsfeedItemVideoVideoDto(Integer num, List<VideoVideoFullDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemVideoVideoDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
