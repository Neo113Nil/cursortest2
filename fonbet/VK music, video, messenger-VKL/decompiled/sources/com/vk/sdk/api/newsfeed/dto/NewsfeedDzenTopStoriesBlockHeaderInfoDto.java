package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;

/* compiled from: NewsfeedDzenTopStoriesBlockHeaderInfoDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedDzenTopStoriesBlockHeaderInfoDto {

    @pmi0("popup")
    private final NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto popup;

    public NewsfeedDzenTopStoriesBlockHeaderInfoDto(NewsfeedDzenTopStoriesBlockHeaderInfoPopupDto newsfeedDzenTopStoriesBlockHeaderInfoPopupDto) {
        this.popup = newsfeedDzenTopStoriesBlockHeaderInfoPopupDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedDzenTopStoriesBlockHeaderInfoDto) && epx.f(this.popup, ((NewsfeedDzenTopStoriesBlockHeaderInfoDto) obj).popup);
    }

    public final int hashCode() {
        return this.popup.hashCode();
    }

    public final String toString() {
        return "NewsfeedDzenTopStoriesBlockHeaderInfoDto(popup=" + this.popup + ")";
    }
}
