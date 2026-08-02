package com.vk.sdk.api.ads.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsStoryItemStatsDto.kt */
/* loaded from: classes5.dex */
public final class AdsStoryItemStatsDto {

    @pmi0("follow")
    private final AdsStoryItemStatsFollowDto follow;

    @pmi0("url_view")
    private final AdsStoryItemStatsUrlViewDto urlView;

    /* JADX WARN: Multi-variable type inference failed */
    public AdsStoryItemStatsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStoryItemStatsDto)) {
            return false;
        }
        AdsStoryItemStatsDto adsStoryItemStatsDto = (AdsStoryItemStatsDto) obj;
        return epx.f(this.follow, adsStoryItemStatsDto.follow) && epx.f(this.urlView, adsStoryItemStatsDto.urlView);
    }

    public final int hashCode() {
        AdsStoryItemStatsFollowDto adsStoryItemStatsFollowDto = this.follow;
        int hashCode = (adsStoryItemStatsFollowDto == null ? 0 : adsStoryItemStatsFollowDto.hashCode()) * 31;
        AdsStoryItemStatsUrlViewDto adsStoryItemStatsUrlViewDto = this.urlView;
        return hashCode + (adsStoryItemStatsUrlViewDto != null ? adsStoryItemStatsUrlViewDto.hashCode() : 0);
    }

    public final String toString() {
        return "AdsStoryItemStatsDto(follow=" + this.follow + ", urlView=" + this.urlView + ")";
    }

    public AdsStoryItemStatsDto(AdsStoryItemStatsFollowDto adsStoryItemStatsFollowDto, AdsStoryItemStatsUrlViewDto adsStoryItemStatsUrlViewDto) {
        this.follow = adsStoryItemStatsFollowDto;
        this.urlView = adsStoryItemStatsUrlViewDto;
    }

    public /* synthetic */ AdsStoryItemStatsDto(AdsStoryItemStatsFollowDto adsStoryItemStatsFollowDto, AdsStoryItemStatsUrlViewDto adsStoryItemStatsUrlViewDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : adsStoryItemStatsFollowDto, (i & 2) != 0 ? null : adsStoryItemStatsUrlViewDto);
    }
}
