package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemAnimatedBlockAnimationDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemAnimatedBlockAnimationDto {

    @pmi0("height")
    private final Float height;

    @pmi0("play_count")
    private final Integer playCount;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final Float width;

    public NewsfeedItemAnimatedBlockAnimationDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemAnimatedBlockAnimationDto)) {
            return false;
        }
        NewsfeedItemAnimatedBlockAnimationDto newsfeedItemAnimatedBlockAnimationDto = (NewsfeedItemAnimatedBlockAnimationDto) obj;
        return epx.f(this.url, newsfeedItemAnimatedBlockAnimationDto.url) && epx.f(this.width, newsfeedItemAnimatedBlockAnimationDto.width) && epx.f(this.height, newsfeedItemAnimatedBlockAnimationDto.height) && epx.f(this.playCount, newsfeedItemAnimatedBlockAnimationDto.playCount);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.width;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.height;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.playCount;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemAnimatedBlockAnimationDto(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", playCount=" + this.playCount + ")";
    }

    public NewsfeedItemAnimatedBlockAnimationDto(String str, Float f, Float f2, Integer num) {
        this.url = str;
        this.width = f;
        this.height = f2;
        this.playCount = num;
    }

    public /* synthetic */ NewsfeedItemAnimatedBlockAnimationDto(String str, Float f, Float f2, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : f2, (i & 8) != 0 ? null : num);
    }
}
