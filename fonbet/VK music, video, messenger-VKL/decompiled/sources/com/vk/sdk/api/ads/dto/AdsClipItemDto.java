package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsClipItemDto.kt */
/* loaded from: classes5.dex */
public final class AdsClipItemDto {

    @pmi0("link")
    private final AdsClipItemLinkDto link;

    @pmi0("preview_url")
    private final String previewUrl;

    @pmi0("video_id")
    private final Integer videoId;

    public AdsClipItemDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsClipItemDto)) {
            return false;
        }
        AdsClipItemDto adsClipItemDto = (AdsClipItemDto) obj;
        return epx.f(this.videoId, adsClipItemDto.videoId) && epx.f(this.previewUrl, adsClipItemDto.previewUrl) && epx.f(this.link, adsClipItemDto.link);
    }

    public final int hashCode() {
        Integer num = this.videoId;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.previewUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AdsClipItemLinkDto adsClipItemLinkDto = this.link;
        return hashCode2 + (adsClipItemLinkDto != null ? adsClipItemLinkDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsClipItemDto(videoId=" + this.videoId + ", previewUrl=" + this.previewUrl + ", link=" + this.link + ")";
    }

    public AdsClipItemDto(Integer num, String str, AdsClipItemLinkDto adsClipItemLinkDto) {
        this.videoId = num;
        this.previewUrl = str;
        this.link = adsClipItemLinkDto;
    }

    public /* synthetic */ AdsClipItemDto(Integer num, String str, AdsClipItemLinkDto adsClipItemLinkDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : adsClipItemLinkDto);
    }
}
