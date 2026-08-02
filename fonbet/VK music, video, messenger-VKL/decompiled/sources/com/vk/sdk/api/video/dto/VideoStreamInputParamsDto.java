package com.vk.sdk.api.video.dto;

import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: VideoStreamInputParamsDto.kt */
/* loaded from: classes5.dex */
public final class VideoStreamInputParamsDto {

    @pmi0("key")
    private final String key;

    @pmi0("okmp_url")
    private final String okmpUrl;

    @pmi0("url")
    private final String url;

    @pmi0("webrtc_url")
    private final String webrtcUrl;

    public VideoStreamInputParamsDto() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoStreamInputParamsDto)) {
            return false;
        }
        VideoStreamInputParamsDto videoStreamInputParamsDto = (VideoStreamInputParamsDto) obj;
        return epx.f(this.url, videoStreamInputParamsDto.url) && epx.f(this.key, videoStreamInputParamsDto.key) && epx.f(this.okmpUrl, videoStreamInputParamsDto.okmpUrl) && epx.f(this.webrtcUrl, videoStreamInputParamsDto.webrtcUrl);
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.okmpUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.webrtcUrl;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.url;
        String str2 = this.key;
        return h5s.d(xe9.a("VideoStreamInputParamsDto(url=", str, ", key=", str2, ", okmpUrl="), this.okmpUrl, ", webrtcUrl=", this.webrtcUrl, ")");
    }

    public VideoStreamInputParamsDto(String str, String str2, String str3, String str4) {
        this.url = str;
        this.key = str2;
        this.okmpUrl = str3;
        this.webrtcUrl = str4;
    }

    public /* synthetic */ VideoStreamInputParamsDto(String str, String str2, String str3, String str4, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
