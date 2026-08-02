package com.vk.sdk.api.video.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: VideoSearchResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoSearchResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    public VideoSearchResponseDto(int i, List<VideoVideoFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSearchResponseDto)) {
            return false;
        }
        VideoSearchResponseDto videoSearchResponseDto = (VideoSearchResponseDto) obj;
        return this.count == videoSearchResponseDto.count && epx.f(this.items, videoSearchResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "VideoSearchResponseDto(count=", ", items=", ")", this.items);
    }
}
