package com.vk.sdk.api.video.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zr;

/* compiled from: VideoGetLongPollServerResponseDto.kt */
/* loaded from: classes5.dex */
public final class VideoGetLongPollServerResponseDto {

    @pmi0("url")
    private final String url;

    public VideoGetLongPollServerResponseDto(String str) {
        this.url = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetLongPollServerResponseDto) && epx.f(this.url, ((VideoGetLongPollServerResponseDto) obj).url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return zr.a("VideoGetLongPollServerResponseDto(url=", this.url, ")");
    }
}
