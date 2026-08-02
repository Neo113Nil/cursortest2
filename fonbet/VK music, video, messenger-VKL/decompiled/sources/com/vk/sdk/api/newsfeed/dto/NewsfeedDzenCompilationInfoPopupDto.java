package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: NewsfeedDzenCompilationInfoPopupDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedDzenCompilationInfoPopupDto {

    @pmi0("button")
    private final NewsfeedDzenTextDto button;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("text")
    private final String text;

    public NewsfeedDzenCompilationInfoPopupDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, String str, NewsfeedDzenTextDto newsfeedDzenTextDto) {
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.text = str;
        this.button = newsfeedDzenTextDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenCompilationInfoPopupDto)) {
            return false;
        }
        NewsfeedDzenCompilationInfoPopupDto newsfeedDzenCompilationInfoPopupDto = (NewsfeedDzenCompilationInfoPopupDto) obj;
        return epx.f(this.image, newsfeedDzenCompilationInfoPopupDto.image) && epx.f(this.text, newsfeedDzenCompilationInfoPopupDto.text) && epx.f(this.button, newsfeedDzenCompilationInfoPopupDto.button);
    }

    public final int hashCode() {
        return this.button.hashCode() + urd0.a(this.image.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        return "NewsfeedDzenCompilationInfoPopupDto(image=" + this.image + ", text=" + this.text + ", button=" + this.button + ")";
    }
}
