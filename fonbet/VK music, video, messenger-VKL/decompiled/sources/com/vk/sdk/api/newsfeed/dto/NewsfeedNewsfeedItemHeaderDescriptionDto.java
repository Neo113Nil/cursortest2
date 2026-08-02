package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderDescriptionDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderDescriptionDto {

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("icon")
    private final NewsfeedNewsfeedItemHeaderImageDto icon;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    public NewsfeedNewsfeedItemHeaderDescriptionDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderDescriptionDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = (NewsfeedNewsfeedItemHeaderDescriptionDto) obj;
        return epx.f(this.text, newsfeedNewsfeedItemHeaderDescriptionDto.text) && epx.f(this.icon, newsfeedNewsfeedItemHeaderDescriptionDto.icon) && epx.f(this.action, newsfeedNewsfeedItemHeaderDescriptionDto.action);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        int hashCode = (newsfeedNewsfeedItemHeaderTextDto == null ? 0 : newsfeedNewsfeedItemHeaderTextDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.icon;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        return hashCode2 + (newsfeedNewsfeedItemHeaderActionDto != null ? newsfeedNewsfeedItemHeaderActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderDescriptionDto(text=" + this.text + ", icon=" + this.icon + ", action=" + this.action + ")";
    }

    public NewsfeedNewsfeedItemHeaderDescriptionDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto) {
        this.text = newsfeedNewsfeedItemHeaderTextDto;
        this.icon = newsfeedNewsfeedItemHeaderImageDto;
        this.action = newsfeedNewsfeedItemHeaderActionDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderDescriptionDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 4) != 0 ? null : newsfeedNewsfeedItemHeaderActionDto);
    }
}
