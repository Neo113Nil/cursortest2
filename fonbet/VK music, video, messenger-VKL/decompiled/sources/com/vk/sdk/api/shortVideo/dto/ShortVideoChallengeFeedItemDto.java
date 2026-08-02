package com.vk.sdk.api.shortVideo.dto;

import com.vk.sdk.api.video.dto.VideoVideoFullDto;
import xsna.epx;
import xsna.jax0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.xe9;

/* compiled from: ShortVideoChallengeFeedItemDto.kt */
/* loaded from: classes5.dex */
public final class ShortVideoChallengeFeedItemDto {

    @pmi0("action_title")
    private final String actionTitle;

    @pmi0("title")
    private final String title;

    @pmi0("total_count")
    private final int totalCount;

    @pmi0("url")
    private final String url;

    @pmi0("video")
    private final VideoVideoFullDto video;

    public ShortVideoChallengeFeedItemDto(String str, String str2, int i, String str3, VideoVideoFullDto videoVideoFullDto) {
        this.title = str;
        this.actionTitle = str2;
        this.totalCount = i;
        this.url = str3;
        this.video = videoVideoFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoChallengeFeedItemDto)) {
            return false;
        }
        ShortVideoChallengeFeedItemDto shortVideoChallengeFeedItemDto = (ShortVideoChallengeFeedItemDto) obj;
        return epx.f(this.title, shortVideoChallengeFeedItemDto.title) && epx.f(this.actionTitle, shortVideoChallengeFeedItemDto.actionTitle) && this.totalCount == shortVideoChallengeFeedItemDto.totalCount && epx.f(this.url, shortVideoChallengeFeedItemDto.url) && epx.f(this.video, shortVideoChallengeFeedItemDto.video);
    }

    public final int hashCode() {
        return this.video.hashCode() + urd0.a(shy.a(this.totalCount, urd0.a(this.title.hashCode() * 31, 31, this.actionTitle), 31), 31, this.url);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.actionTitle;
        int i = this.totalCount;
        String str3 = this.url;
        VideoVideoFullDto videoVideoFullDto = this.video;
        StringBuilder a = xe9.a("ShortVideoChallengeFeedItemDto(title=", str, ", actionTitle=", str2, ", totalCount=");
        jax0.a(i, ", url=", str3, ", video=", a);
        a.append(videoVideoFullDto);
        a.append(")");
        return a.toString();
    }
}
