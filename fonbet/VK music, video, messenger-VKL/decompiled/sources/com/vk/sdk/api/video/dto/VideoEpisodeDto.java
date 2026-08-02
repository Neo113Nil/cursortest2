package com.vk.sdk.api.video.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoEpisodeDto.kt */
/* loaded from: classes5.dex */
public final class VideoEpisodeDto {

    @pmi0("text")
    private final String text;

    @pmi0("time")
    private final Integer time;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoEpisodeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEpisodeDto)) {
            return false;
        }
        VideoEpisodeDto videoEpisodeDto = (VideoEpisodeDto) obj;
        return epx.f(this.time, videoEpisodeDto.time) && epx.f(this.text, videoEpisodeDto.text);
    }

    public final int hashCode() {
        Integer num = this.time;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VideoEpisodeDto(time=" + this.time + ", text=" + this.text + ")";
    }

    public VideoEpisodeDto(Integer num, String str) {
        this.time = num;
        this.text = str;
    }

    public /* synthetic */ VideoEpisodeDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
