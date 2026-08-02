package com.vk.dto.video;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import java.util.List;
import xsna.epx;
import xsna.shy;
import xsna.vu5;

/* compiled from: VideoListWithTotalCount.kt */
/* loaded from: classes18.dex */
public final class VideoListWithTotalCount extends Serializer.StreamParcelableAdapter {
    public final List<VideoFile> b;
    public final int c;
    public final int d;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoListWithTotalCount(List<? extends VideoFile> list, int i, int i2) {
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoListWithTotalCount)) {
            return false;
        }
        VideoListWithTotalCount videoListWithTotalCount = (VideoListWithTotalCount) obj;
        return epx.f(this.b, videoListWithTotalCount.b) && this.c == videoListWithTotalCount.c && this.d == videoListWithTotalCount.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoListWithTotalCount(videos=");
        sb.append(this.b);
        sb.append(", totalCount=");
        sb.append(this.c);
        sb.append(", offsetFrom=");
        return vu5.b(sb, this.d, ')');
    }
}
