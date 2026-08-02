package com.vk.sdk.api.podcast.dto;

import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: PodcastExternalDataDto.kt */
/* loaded from: classes5.dex */
public final class PodcastExternalDataDto {

    @pmi0("cover")
    private final PodcastCoverDto cover;

    @pmi0("owner_name")
    private final String ownerName;

    @pmi0("owner_url")
    private final String ownerUrl;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    public PodcastExternalDataDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PodcastExternalDataDto)) {
            return false;
        }
        PodcastExternalDataDto podcastExternalDataDto = (PodcastExternalDataDto) obj;
        return epx.f(this.url, podcastExternalDataDto.url) && epx.f(this.ownerUrl, podcastExternalDataDto.ownerUrl) && epx.f(this.title, podcastExternalDataDto.title) && epx.f(this.ownerName, podcastExternalDataDto.ownerName) && epx.f(this.cover, podcastExternalDataDto.cover);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ownerUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ownerName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PodcastCoverDto podcastCoverDto = this.cover;
        return hashCode4 + (podcastCoverDto != null ? podcastCoverDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.ownerUrl;
        String str3 = this.title;
        String str4 = this.ownerName;
        PodcastCoverDto podcastCoverDto = this.cover;
        StringBuilder a = xe9.a("PodcastExternalDataDto(url=", str, ", ownerUrl=", str2, ", title=");
        n6j.b(a, str3, ", ownerName=", str4, ", cover=");
        a.append(podcastCoverDto);
        a.append(")");
        return a.toString();
    }

    public PodcastExternalDataDto(String str, String str2, String str3, String str4, PodcastCoverDto podcastCoverDto) {
        this.url = str;
        this.ownerUrl = str2;
        this.title = str3;
        this.ownerName = str4;
        this.cover = podcastCoverDto;
    }

    public /* synthetic */ PodcastExternalDataDto(String str, String str2, String str3, String str4, PodcastCoverDto podcastCoverDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : podcastCoverDto);
    }
}
