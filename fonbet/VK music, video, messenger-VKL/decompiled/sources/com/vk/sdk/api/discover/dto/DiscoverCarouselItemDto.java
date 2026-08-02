package com.vk.sdk.api.discover.dto;

import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DiscoverCarouselItemDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselItemDto {

    @pmi0("button")
    private final DiscoverCarouselButtonDto button;

    @pmi0("description")
    private final DiscoverCarouselItemDescriptionDto description;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("title")
    private final String title;

    public DiscoverCarouselItemDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, DiscoverCarouselItemDescriptionDto discoverCarouselItemDescriptionDto, String str, List<BaseImageDto> list) {
        this.button = discoverCarouselButtonDto;
        this.description = discoverCarouselItemDescriptionDto;
        this.title = str;
        this.images = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselItemDto)) {
            return false;
        }
        DiscoverCarouselItemDto discoverCarouselItemDto = (DiscoverCarouselItemDto) obj;
        return epx.f(this.button, discoverCarouselItemDto.button) && epx.f(this.description, discoverCarouselItemDto.description) && epx.f(this.title, discoverCarouselItemDto.title) && epx.f(this.images, discoverCarouselItemDto.images);
    }

    public final int hashCode() {
        int a = urd0.a((this.description.hashCode() + (this.button.hashCode() * 31)) * 31, 31, this.title);
        List<BaseImageDto> list = this.images;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DiscoverCarouselItemDto(button=" + this.button + ", description=" + this.description + ", title=" + this.title + ", images=" + this.images + ")";
    }

    public /* synthetic */ DiscoverCarouselItemDto(DiscoverCarouselButtonDto discoverCarouselButtonDto, DiscoverCarouselItemDescriptionDto discoverCarouselItemDescriptionDto, String str, List list, int i, zcl zclVar) {
        this(discoverCarouselButtonDto, discoverCarouselItemDescriptionDto, str, (i & 8) != 0 ? null : list);
    }
}
