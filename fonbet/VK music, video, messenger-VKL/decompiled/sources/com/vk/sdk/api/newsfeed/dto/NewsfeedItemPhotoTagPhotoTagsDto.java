package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.photos.dto.PhotosPhotoDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemPhotoTagPhotoTagsDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemPhotoTagPhotoTagsDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemPhotoTagPhotoTagsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemPhotoTagPhotoTagsDto)) {
            return false;
        }
        NewsfeedItemPhotoTagPhotoTagsDto newsfeedItemPhotoTagPhotoTagsDto = (NewsfeedItemPhotoTagPhotoTagsDto) obj;
        return epx.f(this.count, newsfeedItemPhotoTagPhotoTagsDto.count) && epx.f(this.items, newsfeedItemPhotoTagPhotoTagsDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<PhotosPhotoDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemPhotoTagPhotoTagsDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public NewsfeedItemPhotoTagPhotoTagsDto(Integer num, List<PhotosPhotoDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemPhotoTagPhotoTagsDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
