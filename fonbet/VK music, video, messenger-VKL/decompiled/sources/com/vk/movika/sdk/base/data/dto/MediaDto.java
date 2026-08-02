package com.vk.movika.sdk.base.data.dto;

import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.epx;
import xsna.imi0;
import xsna.sp;
import xsna.wq;
import xsna.yk3;

@imi0
/* loaded from: classes3.dex */
public final class MediaDto {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] b = {new yk3(VideoDto$$serializer.INSTANCE)};
    public final List<VideoDto> a;

    public static final class Companion {
        public final KSerializer<MediaDto> serializer() {
            return MediaDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaDto(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            sp.x(i, 1, MediaDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediaDto) && epx.f(this.a, ((MediaDto) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wq.c("MediaDto(videos=", ")", this.a);
    }
}
