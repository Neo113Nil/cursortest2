package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderBackgroundDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderBackgroundDto {

    @pmi0("color")
    private final NewsfeedNewsfeedItemColorDto color;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderBackgroundDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedNewsfeedItemHeaderBackgroundDto) && epx.f(this.color, ((NewsfeedNewsfeedItemHeaderBackgroundDto) obj).color);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        if (newsfeedNewsfeedItemColorDto == null) {
            return 0;
        }
        return newsfeedNewsfeedItemColorDto.hashCode();
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderBackgroundDto(color=" + this.color + ")";
    }

    public NewsfeedNewsfeedItemHeaderBackgroundDto(NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        this.color = newsfeedNewsfeedItemColorDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderBackgroundDto(NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemColorDto);
    }
}
