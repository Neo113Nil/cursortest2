package com.vk.sdk.api.classifieds.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaCarouselFriendsItemDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaCarouselFriendsItemDto {

    @pmi0("id")
    private final long id;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    public ClassifiedsYoulaCarouselFriendsItemDto(long j, List<BaseImageDto> list) {
        this.id = j;
        this.photo = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaCarouselFriendsItemDto)) {
            return false;
        }
        ClassifiedsYoulaCarouselFriendsItemDto classifiedsYoulaCarouselFriendsItemDto = (ClassifiedsYoulaCarouselFriendsItemDto) obj;
        return this.id == classifiedsYoulaCarouselFriendsItemDto.id && epx.f(this.photo, classifiedsYoulaCarouselFriendsItemDto.photo);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<BaseImageDto> list = this.photo;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "ClassifiedsYoulaCarouselFriendsItemDto(id=" + this.id + ", photo=" + this.photo + ")";
    }

    public /* synthetic */ ClassifiedsYoulaCarouselFriendsItemDto(long j, List list, int i, zcl zclVar) {
        this(j, (i & 2) != 0 ? null : list);
    }
}
