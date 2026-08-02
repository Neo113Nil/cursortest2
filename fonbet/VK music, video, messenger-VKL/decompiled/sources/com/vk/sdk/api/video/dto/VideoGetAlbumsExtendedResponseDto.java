package com.vk.sdk.api.video.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.pn;

/* compiled from: VideoGetAlbumsExtendedResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoGetAlbumsExtendedResponseDto {

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<VideoVideoAlbumFullDto> items;

    public VideoGetAlbumsExtendedResponseDto(int i, List<VideoVideoAlbumFullDto> list) {
        this.count = i;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoGetAlbumsExtendedResponseDto)) {
            return false;
        }
        VideoGetAlbumsExtendedResponseDto videoGetAlbumsExtendedResponseDto = (VideoGetAlbumsExtendedResponseDto) obj;
        return this.count == videoGetAlbumsExtendedResponseDto.count && epx.f(this.items, videoGetAlbumsExtendedResponseDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (Integer.hashCode(this.count) * 31);
    }

    public final String toString() {
        return pn.c(this.count, "VideoGetAlbumsExtendedResponseDto(count=", ", items=", ")", this.items);
    }
}
