package com.vk.sdk.api.discover.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: DiscoverCarouselButtonActionDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselButtonActionDto {

    @pmi0("context")
    private final DiscoverCarouselButtonContextDto context;

    @pmi0("target")
    private final DiscoverCarouselButtonActionTargetDto target;

    @pmi0("type")
    private final DiscoverCarouselButtonActionTypeDto type;

    @pmi0("url")
    private final String url;

    public DiscoverCarouselButtonActionDto(DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto, DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto, DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto, String str) {
        this.type = discoverCarouselButtonActionTypeDto;
        this.context = discoverCarouselButtonContextDto;
        this.target = discoverCarouselButtonActionTargetDto;
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonActionDto)) {
            return false;
        }
        DiscoverCarouselButtonActionDto discoverCarouselButtonActionDto = (DiscoverCarouselButtonActionDto) obj;
        return this.type == discoverCarouselButtonActionDto.type && epx.f(this.context, discoverCarouselButtonActionDto.context) && this.target == discoverCarouselButtonActionDto.target && epx.f(this.url, discoverCarouselButtonActionDto.url);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto = this.context;
        int hashCode2 = (hashCode + (discoverCarouselButtonContextDto == null ? 0 : discoverCarouselButtonContextDto.hashCode())) * 31;
        DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto = this.target;
        int hashCode3 = (hashCode2 + (discoverCarouselButtonActionTargetDto == null ? 0 : discoverCarouselButtonActionTargetDto.hashCode())) * 31;
        String str = this.url;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DiscoverCarouselButtonActionDto(type=" + this.type + ", context=" + this.context + ", target=" + this.target + ", url=" + this.url + ")";
    }

    public /* synthetic */ DiscoverCarouselButtonActionDto(DiscoverCarouselButtonActionTypeDto discoverCarouselButtonActionTypeDto, DiscoverCarouselButtonContextDto discoverCarouselButtonContextDto, DiscoverCarouselButtonActionTargetDto discoverCarouselButtonActionTargetDto, String str, int i, zcl zclVar) {
        this(discoverCarouselButtonActionTypeDto, (i & 2) != 0 ? null : discoverCarouselButtonContextDto, (i & 4) != 0 ? null : discoverCarouselButtonActionTargetDto, (i & 8) != 0 ? null : str);
    }
}
