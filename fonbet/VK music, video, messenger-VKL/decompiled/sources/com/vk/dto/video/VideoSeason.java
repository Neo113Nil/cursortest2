package com.vk.dto.video;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.shy;
import xsna.urd0;

/* compiled from: VideoSeason.kt */
/* loaded from: classes18.dex */
public final class VideoSeason extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoSeason> CREATOR = new a();
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoSeason> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoSeason a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new VideoSeason(u, H, serializer.u(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoSeason[i];
        }
    }

    public VideoSeason(int i, String str, int i2, boolean z) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = z;
    }

    public static VideoSeason zb(VideoSeason videoSeason, boolean z) {
        return new VideoSeason(videoSeason.b, videoSeason.c, videoSeason.d, z);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSeason)) {
            return false;
        }
        VideoSeason videoSeason = (VideoSeason) obj;
        return this.b == videoSeason.b && epx.f(this.c, videoSeason.c) && this.d == videoSeason.d && this.e == videoSeason.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSeason(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", isActive=");
        return q0.a(sb, this.e, ')');
    }
}
