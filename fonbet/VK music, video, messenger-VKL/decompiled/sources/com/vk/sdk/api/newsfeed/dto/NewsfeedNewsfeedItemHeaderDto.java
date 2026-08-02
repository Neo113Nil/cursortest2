package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.kr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedNewsfeedItemHeaderDto {

    @pmi0("badge")
    private final NewsfeedNewsfeedItemHeaderBadgeDto badge;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final NewsfeedNewsfeedItemHeaderDescriptionDto description;

    @pmi0("overlay_image")
    private final NewsfeedNewsfeedItemHeaderOverlayImageDto overlayImage;

    @pmi0("photo")
    private final NewsfeedNewsfeedItemHeaderImageDto photo;

    @pmi0("title")
    private final NewsfeedNewsfeedItemHeaderTitleDto title;

    @pmi0("warning")
    private final String warning;

    public NewsfeedNewsfeedItemHeaderDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderDto newsfeedNewsfeedItemHeaderDto = (NewsfeedNewsfeedItemHeaderDto) obj;
        return epx.f(this.photo, newsfeedNewsfeedItemHeaderDto.photo) && epx.f(this.title, newsfeedNewsfeedItemHeaderDto.title) && epx.f(this.badge, newsfeedNewsfeedItemHeaderDto.badge) && epx.f(this.description, newsfeedNewsfeedItemHeaderDto.description) && epx.f(this.warning, newsfeedNewsfeedItemHeaderDto.warning) && epx.f(this.date, newsfeedNewsfeedItemHeaderDto.date) && epx.f(this.overlayImage, newsfeedNewsfeedItemHeaderDto.overlayImage);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.photo;
        int hashCode = (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = this.title;
        int hashCode2 = (hashCode + (newsfeedNewsfeedItemHeaderTitleDto == null ? 0 : newsfeedNewsfeedItemHeaderTitleDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto = this.badge;
        int hashCode3 = (hashCode2 + (newsfeedNewsfeedItemHeaderBadgeDto == null ? 0 : newsfeedNewsfeedItemHeaderBadgeDto.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = this.description;
        int hashCode4 = (hashCode3 + (newsfeedNewsfeedItemHeaderDescriptionDto == null ? 0 : newsfeedNewsfeedItemHeaderDescriptionDto.hashCode())) * 31;
        String str = this.warning;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.date;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto = this.overlayImage;
        return hashCode6 + (newsfeedNewsfeedItemHeaderOverlayImageDto != null ? newsfeedNewsfeedItemHeaderOverlayImageDto.hashCode() : 0);
    }

    public final String toString() {
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.photo;
        NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto = this.title;
        NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto = this.badge;
        NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto = this.description;
        String str = this.warning;
        Integer num = this.date;
        NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto = this.overlayImage;
        StringBuilder sb = new StringBuilder("NewsfeedNewsfeedItemHeaderDto(photo=");
        sb.append(newsfeedNewsfeedItemHeaderImageDto);
        sb.append(", title=");
        sb.append(newsfeedNewsfeedItemHeaderTitleDto);
        sb.append(", badge=");
        sb.append(newsfeedNewsfeedItemHeaderBadgeDto);
        sb.append(", description=");
        sb.append(newsfeedNewsfeedItemHeaderDescriptionDto);
        sb.append(", warning=");
        kr.b(num, str, ", date=", ", overlayImage=", sb);
        sb.append(newsfeedNewsfeedItemHeaderOverlayImageDto);
        sb.append(")");
        return sb.toString();
    }

    public NewsfeedNewsfeedItemHeaderDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto, NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto, NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto, String str, Integer num, NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto) {
        this.photo = newsfeedNewsfeedItemHeaderImageDto;
        this.title = newsfeedNewsfeedItemHeaderTitleDto;
        this.badge = newsfeedNewsfeedItemHeaderBadgeDto;
        this.description = newsfeedNewsfeedItemHeaderDescriptionDto;
        this.warning = str;
        this.date = num;
        this.overlayImage = newsfeedNewsfeedItemHeaderOverlayImageDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, NewsfeedNewsfeedItemHeaderTitleDto newsfeedNewsfeedItemHeaderTitleDto, NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto, NewsfeedNewsfeedItemHeaderDescriptionDto newsfeedNewsfeedItemHeaderDescriptionDto, String str, Integer num, NewsfeedNewsfeedItemHeaderOverlayImageDto newsfeedNewsfeedItemHeaderOverlayImageDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderTitleDto, (i & 4) != 0 ? null : newsfeedNewsfeedItemHeaderBadgeDto, (i & 8) != 0 ? null : newsfeedNewsfeedItemHeaderDescriptionDto, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : newsfeedNewsfeedItemHeaderOverlayImageDto);
    }
}
