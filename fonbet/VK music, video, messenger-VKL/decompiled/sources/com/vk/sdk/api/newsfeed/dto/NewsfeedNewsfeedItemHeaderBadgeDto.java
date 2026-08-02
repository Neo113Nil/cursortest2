package com.vk.sdk.api.newsfeed.dto;

import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderBadgeDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderBadgeDto {

    @pmi0(L2.g)
    private final NewsfeedNewsfeedItemHeaderBackgroundDto background;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderBadgeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderBadgeDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto = (NewsfeedNewsfeedItemHeaderBadgeDto) obj;
        return epx.f(this.text, newsfeedNewsfeedItemHeaderBadgeDto.text) && epx.f(this.background, newsfeedNewsfeedItemHeaderBadgeDto.background);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        int hashCode = (newsfeedNewsfeedItemHeaderTextDto == null ? 0 : newsfeedNewsfeedItemHeaderTextDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderBackgroundDto newsfeedNewsfeedItemHeaderBackgroundDto = this.background;
        return hashCode + (newsfeedNewsfeedItemHeaderBackgroundDto != null ? newsfeedNewsfeedItemHeaderBackgroundDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderBadgeDto(text=" + this.text + ", background=" + this.background + ")";
    }

    public NewsfeedNewsfeedItemHeaderBadgeDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderBackgroundDto newsfeedNewsfeedItemHeaderBackgroundDto) {
        this.text = newsfeedNewsfeedItemHeaderTextDto;
        this.background = newsfeedNewsfeedItemHeaderBackgroundDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderBadgeDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderBackgroundDto newsfeedNewsfeedItemHeaderBackgroundDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderBackgroundDto);
    }
}
