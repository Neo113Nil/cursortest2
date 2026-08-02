package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderTextDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderTextDto {

    @pmi0("color")
    private final NewsfeedNewsfeedItemColorDto color;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderTextDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderTextDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = (NewsfeedNewsfeedItemHeaderTextDto) obj;
        return epx.f(this.text, newsfeedNewsfeedItemHeaderTextDto.text) && epx.f(this.color, newsfeedNewsfeedItemHeaderTextDto.color);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.color;
        return hashCode + (newsfeedNewsfeedItemColorDto != null ? newsfeedNewsfeedItemColorDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderTextDto(text=" + this.text + ", color=" + this.color + ")";
    }

    public NewsfeedNewsfeedItemHeaderTextDto(String str, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        this.text = str;
        this.color = newsfeedNewsfeedItemColorDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderTextDto(String str, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : newsfeedNewsfeedItemColorDto);
    }
}
