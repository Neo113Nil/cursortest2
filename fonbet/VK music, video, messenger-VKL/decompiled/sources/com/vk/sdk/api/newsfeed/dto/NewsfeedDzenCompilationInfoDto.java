package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;

/* compiled from: NewsfeedDzenCompilationInfoDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedDzenCompilationInfoDto {

    @pmi0("popup")
    private final NewsfeedDzenCompilationInfoPopupDto popup;

    public NewsfeedDzenCompilationInfoDto(NewsfeedDzenCompilationInfoPopupDto newsfeedDzenCompilationInfoPopupDto) {
        this.popup = newsfeedDzenCompilationInfoPopupDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedDzenCompilationInfoDto) && epx.f(this.popup, ((NewsfeedDzenCompilationInfoDto) obj).popup);
    }

    public final int hashCode() {
        return this.popup.hashCode();
    }

    public final String toString() {
        return "NewsfeedDzenCompilationInfoDto(popup=" + this.popup + ")";
    }
}
