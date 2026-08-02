package com.vk.sdk.api.video.dto;

import com.ironsource.D1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.epx;
import xsna.h5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: VideoVideoFilesDto.kt */
/* loaded from: classes5.dex */
public final class VideoVideoFilesDto {

    @pmi0(D1.e)
    private final String external;

    @pmi0("flv_320")
    private final String flv320;

    @pmi0("mp4_1080")
    private final String mp41080;

    @pmi0("mp4_144")
    private final String mp4144;

    @pmi0("mp4_1440")
    private final String mp41440;

    @pmi0("mp4_2160")
    private final String mp42160;

    @pmi0("mp4_240")
    private final String mp4240;

    @pmi0("mp4_360")
    private final String mp4360;

    @pmi0("mp4_480")
    private final String mp4480;

    @pmi0("mp4_720")
    private final String mp4720;

    public VideoVideoFilesDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoFilesDto)) {
            return false;
        }
        VideoVideoFilesDto videoVideoFilesDto = (VideoVideoFilesDto) obj;
        return epx.f(this.external, videoVideoFilesDto.external) && epx.f(this.mp4144, videoVideoFilesDto.mp4144) && epx.f(this.mp4240, videoVideoFilesDto.mp4240) && epx.f(this.mp4360, videoVideoFilesDto.mp4360) && epx.f(this.mp4480, videoVideoFilesDto.mp4480) && epx.f(this.mp4720, videoVideoFilesDto.mp4720) && epx.f(this.mp41080, videoVideoFilesDto.mp41080) && epx.f(this.mp41440, videoVideoFilesDto.mp41440) && epx.f(this.mp42160, videoVideoFilesDto.mp42160) && epx.f(this.flv320, videoVideoFilesDto.flv320);
    }

    public final int hashCode() {
        String str = this.external;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mp4144;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mp4240;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mp4360;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mp4480;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mp4720;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.mp41080;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.mp41440;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mp42160;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.flv320;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        String str = this.external;
        String str2 = this.mp4144;
        String str3 = this.mp4240;
        String str4 = this.mp4360;
        String str5 = this.mp4480;
        String str6 = this.mp4720;
        String str7 = this.mp41080;
        String str8 = this.mp41440;
        String str9 = this.mp42160;
        String str10 = this.flv320;
        StringBuilder a = xe9.a("VideoVideoFilesDto(external=", str, ", mp4144=", str2, ", mp4240=");
        n6j.b(a, str3, ", mp4360=", str4, ", mp4480=");
        n6j.b(a, str5, ", mp4720=", str6, ", mp41080=");
        n6j.b(a, str7, ", mp41440=", str8, ", mp42160=");
        return h5s.d(a, str9, ", flv320=", str10, ")");
    }

    public VideoVideoFilesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.external = str;
        this.mp4144 = str2;
        this.mp4240 = str3;
        this.mp4360 = str4;
        this.mp4480 = str5;
        this.mp4720 = str6;
        this.mp41080 = str7;
        this.mp41440 = str8;
        this.mp42160 = str9;
        this.flv320 = str10;
    }

    public /* synthetic */ VideoVideoFilesDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
