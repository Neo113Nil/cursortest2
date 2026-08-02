package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderOverlayImageDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderOverlayImageDto {

    @pmi0("action")
    private final NewsfeedNewsfeedItemHeaderActionDto action;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderOverlayImageDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderOverlayImageDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto = (NewsfeedNewsfeedItemHeaderOverlayImageDto) obj;
        return epx.f(this.image, newsfeedNewsfeedItemHeaderOverlayImageDto.image) && epx.f(this.action, newsfeedNewsfeedItemHeaderOverlayImageDto.action);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode = (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto = this.action;
        return hashCode + (newsfeedNewsfeedItemHeaderActionDto != null ? newsfeedNewsfeedItemHeaderActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderOverlayImageDto(image=" + this.image + ", action=" + this.action + ")";
    }

    public NewsfeedNewsfeedItemHeaderOverlayImageDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto) {
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.action = newsfeedNewsfeedItemHeaderActionDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderOverlayImageDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderActionDto newsfeedNewsfeedItemHeaderActionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderActionDto);
    }
}
