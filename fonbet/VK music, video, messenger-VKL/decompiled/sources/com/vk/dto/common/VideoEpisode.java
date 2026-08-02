package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: VideoEpisode.kt */
/* loaded from: classes18.dex */
public final class VideoEpisode extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoEpisode> CREATOR = new a();
    public final int b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoEpisode> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoEpisode a(Serializer serializer) {
            return new VideoEpisode(serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoEpisode[i];
        }
    }

    public VideoEpisode(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public final int C() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoEpisode)) {
            return false;
        }
        VideoEpisode videoEpisode = (VideoEpisode) obj;
        return this.b == videoEpisode.b && epx.f(this.c, videoEpisode.c);
    }

    public final String getText() {
        return this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEpisode(time=");
        sb.append(this.b);
        sb.append(", text=");
        return ho8.a(sb, this.c, ')');
    }
}
