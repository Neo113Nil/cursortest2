package com.vk.sdk.api.podcast.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoSizesDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.wq;
import xsna.zcl;

/* compiled from: PodcastCoverDto.kt */
/* loaded from: classes5.dex */
public final class PodcastCoverDto {

    @pmi0("sizes")
    private final List<PhotosPhotoSizesDto> sizes;

    /* JADX WARN: Multi-variable type inference failed */
    public PodcastCoverDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PodcastCoverDto) && epx.f(this.sizes, ((PodcastCoverDto) obj).sizes);
    }

    public final int hashCode() {
        List<PhotosPhotoSizesDto> list = this.sizes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return wq.c("PodcastCoverDto(sizes=", ")", this.sizes);
    }

    public PodcastCoverDto(List<PhotosPhotoSizesDto> list) {
        this.sizes = list;
    }

    public /* synthetic */ PodcastCoverDto(List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list);
    }
}
