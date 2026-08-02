package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;

/* compiled from: VideoUrlInfo.kt */
/* loaded from: classes18.dex */
public final class VideoUrlInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoUrlInfo> CREATOR = new a();
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoUrlInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoUrlInfo a(Serializer serializer) {
            String str;
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
                str = H;
            } else {
                str = "";
            }
            boolean m = serializer.m();
            String str2 = str;
            boolean m2 = serializer.m();
            boolean m3 = serializer.m();
            String str3 = str2;
            boolean m4 = serializer.m();
            String H2 = serializer.H();
            if (H2 != null) {
                str3 = H2;
            }
            return new VideoUrlInfo(u, H, m, m2, m3, m4, str3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoUrlInfo[i];
        }
    }

    public VideoUrlInfo(int i, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.b = i;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
    }

    public final int Ab() {
        return this.b;
    }

    public final boolean Bb() {
        return this.d;
    }

    public final boolean Cb() {
        return this.g;
    }

    public final boolean Db() {
        return this.e;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.j0(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUrlInfo)) {
            return false;
        }
        VideoUrlInfo videoUrlInfo = (VideoUrlInfo) obj;
        return this.b == videoUrlInfo.b && epx.f(this.c, videoUrlInfo.c) && this.d == videoUrlInfo.d && this.e == videoUrlInfo.e && this.f == videoUrlInfo.f && this.g == videoUrlInfo.g && epx.f(this.h, videoUrlInfo.h);
    }

    public final String getUrl() {
        return this.c;
    }

    public final int hashCode() {
        return this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final boolean isExternal() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoUrlInfo(quality=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", isOndemand=");
        sb.append(this.d);
        sb.append(", isWebm=");
        sb.append(this.e);
        sb.append(", isExternal=");
        sb.append(this.f);
        sb.append(", isPlayback=");
        sb.append(this.g);
        sb.append(", contentType=");
        return ho8.a(sb, this.h, ')');
    }

    public final String zb() {
        return this.h;
    }
}
