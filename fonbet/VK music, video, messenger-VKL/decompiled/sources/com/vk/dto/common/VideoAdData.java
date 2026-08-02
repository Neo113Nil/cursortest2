package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;
import xsna.urd0;

/* compiled from: VideoAdData.kt */
/* loaded from: classes18.dex */
public final class VideoAdData extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoAdData> CREATOR = new a();
    public final VideoFile b;
    public final String c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoAdData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoAdData a(Serializer serializer) {
            return new VideoAdData((VideoFile) serializer.A(VideoFile.class.getClassLoader()), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoAdData[i];
        }
    }

    public VideoAdData(VideoFile videoFile, String str, boolean z) {
        this.b = videoFile;
        this.c = str;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoAdData)) {
            return false;
        }
        VideoAdData videoAdData = (VideoAdData) obj;
        return epx.f(this.b, videoAdData.b) && epx.f(this.c, videoAdData.c) && this.d == videoAdData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAdData(videoFile=");
        sb.append(this.b);
        sb.append(", videoAdSize=");
        sb.append(this.c);
        sb.append(", playOnStart=");
        return q0.a(sb, this.d, ')');
    }
}
