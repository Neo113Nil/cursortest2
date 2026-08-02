package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderButtonDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderButtonDto {

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("background_color")
    private final NewsfeedNewsfeedItemColorDto backgroundColor;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    public NewsfeedNewsfeedItemHeaderButtonDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto) {
        this.text = newsfeedNewsfeedItemHeaderTextDto;
        this.action = newsfeedNewsfeedItemHeaderActionDto;
        this.backgroundColor = newsfeedNewsfeedItemColorDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderButtonDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderButtonDto newsfeedNewsfeedItemHeaderButtonDto = (NewsfeedNewsfeedItemHeaderButtonDto) obj;
        return epx.f(this.text, newsfeedNewsfeedItemHeaderButtonDto.text) && epx.f(this.action, newsfeedNewsfeedItemHeaderButtonDto.action) && epx.f(this.backgroundColor, newsfeedNewsfeedItemHeaderButtonDto.backgroundColor);
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + (this.text.hashCode() * 31)) * 31;
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = this.backgroundColor;
        return hashCode + (newsfeedNewsfeedItemColorDto == null ? 0 : newsfeedNewsfeedItemColorDto.hashCode());
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderButtonDto(text=" + this.text + ", action=" + this.action + ", backgroundColor=" + this.backgroundColor + ")";
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderButtonDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto, int i, zcl zclVar) {
        this(newsfeedNewsfeedItemHeaderTextDto, newsfeedNewsfeedItemHeaderActionDto, (i & 4) != 0 ? null : newsfeedNewsfeedItemColorDto);
    }
}
