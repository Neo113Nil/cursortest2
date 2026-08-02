package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto {

    @pmi0("button")
    private final NewsfeedDzenTextDto button;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("text")
    private final String text;

    public NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, String str, NewsfeedDzenTextDto newsfeedDzenTextDto) {
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.text = str;
        this.button = newsfeedDzenTextDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto)) {
            return false;
        }
        NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto newsfeedDzenTopStoriesBlockHeaderInfoPopupDto = (NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto) obj;
        return epx.f(this.image, newsfeedDzenTopStoriesBlockHeaderInfoPopupDto.image) && epx.f(this.text, newsfeedDzenTopStoriesBlockHeaderInfoPopupDto.text) && epx.f(this.button, newsfeedDzenTopStoriesBlockHeaderInfoPopupDto.button);
    }

    public final int hashCode() {
        return this.button.hashCode() + urd0.a(this.image.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        return "NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto(image=" + this.image + ", text=" + this.text + ", button=" + this.button + ")";
    }
}
