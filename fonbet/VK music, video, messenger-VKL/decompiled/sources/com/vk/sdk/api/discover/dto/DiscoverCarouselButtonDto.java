package com.vk.sdk.api.discover.dto;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DiscoverCarouselButtonDto.kt */
/* loaded from: classes5.dex */
public final class DiscoverCarouselButtonDto {

    @pmi0("action")
    private final DiscoverCarouselButtonActionDto action;

    @pmi0(TtmlNode.TAG_STYLE)
    private final DiscoverCarouselButtonTypeDto style;

    @pmi0("title")
    private final String title;

    public DiscoverCarouselButtonDto(DiscoverCarouselButtonActionDto discoverCarouselButtonActionDto, String str, DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto) {
        this.action = discoverCarouselButtonActionDto;
        this.title = str;
        this.style = discoverCarouselButtonTypeDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverCarouselButtonDto)) {
            return false;
        }
        DiscoverCarouselButtonDto discoverCarouselButtonDto = (DiscoverCarouselButtonDto) obj;
        return epx.f(this.action, discoverCarouselButtonDto.action) && epx.f(this.title, discoverCarouselButtonDto.title) && this.style == discoverCarouselButtonDto.style;
    }

    public final int hashCode() {
        int a = urd0.a(this.action.hashCode() * 31, 31, this.title);
        DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto = this.style;
        return a + (discoverCarouselButtonTypeDto == null ? 0 : discoverCarouselButtonTypeDto.hashCode());
    }

    public final String toString() {
        return "DiscoverCarouselButtonDto(action=" + this.action + ", title=" + this.title + ", style=" + this.style + ")";
    }

    public /* synthetic */ DiscoverCarouselButtonDto(DiscoverCarouselButtonActionDto discoverCarouselButtonActionDto, String str, DiscoverCarouselButtonTypeDto discoverCarouselButtonTypeDto, int i, zcl zclVar) {
        this(discoverCarouselButtonActionDto, str, (i & 4) != 0 ? null : discoverCarouselButtonTypeDto);
    }
}
