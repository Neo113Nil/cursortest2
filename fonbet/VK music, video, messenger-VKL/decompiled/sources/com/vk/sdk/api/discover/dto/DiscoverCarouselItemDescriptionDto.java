package com.vk.sdk.api.discover.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DiscoverCarouselItemDescriptionDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselItemDescriptionDto {

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final DiscoverCarouselItemDescriptionTypeDto type;

    /* JADX WARN: Multi-variable type inference failed */
    public DiscoverCarouselItemDescriptionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselItemDescriptionDto)) {
            return false;
        }
        DiscoverCarouselItemDescriptionDto discoverCarouselItemDescriptionDto = (DiscoverCarouselItemDescriptionDto) obj;
        return epx.f(this.text, discoverCarouselItemDescriptionDto.text) && this.type == discoverCarouselItemDescriptionDto.type;
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto = this.type;
        return hashCode + (discoverCarouselItemDescriptionTypeDto != null ? discoverCarouselItemDescriptionTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "DiscoverCarouselItemDescriptionDto(text=" + this.text + ", type=" + this.type + ")";
    }

    public DiscoverCarouselItemDescriptionDto(String str, DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto) {
        this.text = str;
        this.type = discoverCarouselItemDescriptionTypeDto;
    }

    public /* synthetic */ DiscoverCarouselItemDescriptionDto(String str, DiscoverCarouselItemDescriptionTypeDto discoverCarouselItemDescriptionTypeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : discoverCarouselItemDescriptionTypeDto);
    }
}
