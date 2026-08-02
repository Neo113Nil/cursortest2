package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedInfoBlockPopupDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedInfoBlockPopupDto {

    @pmi0("button")
    private final NewsfeedInfoBlockButtonDto button;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("text")
    private final String text;

    public NewsfeedInfoBlockPopupDto(String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto) {
        this.text = str;
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.button = newsfeedInfoBlockButtonDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedInfoBlockPopupDto)) {
            return false;
        }
        NewsfeedInfoBlockPopupDto newsfeedInfoBlockPopupDto = (NewsfeedInfoBlockPopupDto) obj;
        return epx.f(this.text, newsfeedInfoBlockPopupDto.text) && epx.f(this.image, newsfeedInfoBlockPopupDto.image) && epx.f(this.button, newsfeedInfoBlockPopupDto.button);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
        NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto = this.button;
        return hashCode2 + (newsfeedInfoBlockButtonDto != null ? newsfeedInfoBlockButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedInfoBlockPopupDto(text=" + this.text + ", image=" + this.image + ", button=" + this.button + ")";
    }

    public /* synthetic */ NewsfeedInfoBlockPopupDto(String str, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedInfoBlockButtonDto newsfeedInfoBlockButtonDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 4) != 0 ? null : newsfeedInfoBlockButtonDto);
    }
}
