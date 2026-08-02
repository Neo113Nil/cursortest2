package com.vk.sdk.api.podcasts.dto;

import com.vk.sdk.api.podcast.dto.PodcastExternalDataDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: PodcastsSearchPodcastResponseDto.kt */
/* loaded from: classes5.dex */
public final class PodcastsSearchPodcastResponseDto {

    @pmi0("podcasts")
    private final List<PodcastExternalDataDto> podcasts;

    @pmi0("results_total")
    private final int resultsTotal;

    public PodcastsSearchPodcastResponseDto(List<PodcastExternalDataDto> list, int i) {
        this.podcasts = list;
        this.resultsTotal = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastsSearchPodcastResponseDto)) {
            return false;
        }
        PodcastsSearchPodcastResponseDto podcastsSearchPodcastResponseDto = (PodcastsSearchPodcastResponseDto) obj;
        return epx.f(this.podcasts, podcastsSearchPodcastResponseDto.podcasts) && this.resultsTotal == podcastsSearchPodcastResponseDto.resultsTotal;
    }

    public final int hashCode() {
        return Integer.hashCode(this.resultsTotal) + (this.podcasts.hashCode() * 31);
    }

    public final String toString() {
        return "PodcastsSearchPodcastResponseDto(podcasts=" + this.podcasts + ", resultsTotal=" + this.resultsTotal + ")";
    }
}
