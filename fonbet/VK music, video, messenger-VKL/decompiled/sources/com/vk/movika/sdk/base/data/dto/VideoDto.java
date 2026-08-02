package com.vk.movika.sdk.base.data.dto;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;
import xsna.yk3;

@imi0
/* loaded from: classes3.dex */
public final class VideoDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] e = {null, null, null, new yk3(VideoVariantDto$$serializer.INSTANCE)};
    public final String a;
    public final Long b;
    public final String c;
    public final List<VideoVariantDto> d;

    public static final class Companion {
        public final KSerializer<VideoDto> serializer() {
            return VideoDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VideoDto(int i, String str, Long l, String str2, List list) {
        if (9 != (i & 9)) {
            sp.x(i, 9, VideoDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoDto)) {
            return false;
        }
        VideoDto videoDto = (VideoDto) obj;
        return epx.f(this.a, videoDto.a) && epx.f(this.b, videoDto.b) && epx.f(this.c, videoDto.c) && epx.f(this.d, videoDto.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "VideoDto(id=" + this.a + ", duration=" + this.b + ", shortlink=" + this.c + ", variants=" + this.d + ")";
    }
}
