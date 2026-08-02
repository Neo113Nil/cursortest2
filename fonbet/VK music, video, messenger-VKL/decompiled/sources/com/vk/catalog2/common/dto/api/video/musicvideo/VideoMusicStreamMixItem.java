package com.vk.catalog2.common.dto.api.video.musicvideo;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: VideoMusicStreamMixItem.kt */
/* loaded from: classes16.dex */
public final class VideoMusicStreamMixItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VideoMusicStreamMixItem> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<VideoFile> g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoMusicStreamMixItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoMusicStreamMixItem a(Serializer serializer) {
            return new VideoMusicStreamMixItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoMusicStreamMixItem[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMusicStreamMixItem(String str, String str2, String str3, String str4, String str5, List<? extends VideoFile> list) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.f0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoMusicStreamMixItem)) {
            return false;
        }
        VideoMusicStreamMixItem videoMusicStreamMixItem = (VideoMusicStreamMixItem) obj;
        return epx.f(this.b, videoMusicStreamMixItem.b) && epx.f(this.c, videoMusicStreamMixItem.c) && epx.f(this.d, videoMusicStreamMixItem.d) && epx.f(this.e, videoMusicStreamMixItem.e) && epx.f(this.f, videoMusicStreamMixItem.f) && epx.f(this.g, videoMusicStreamMixItem.g);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<VideoFile> list = this.g;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoMusicStreamMixItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", backgroundImageUrl=");
        sb.append(this.e);
        sb.append(", recomPayload=");
        sb.append(this.f);
        sb.append(", videos=");
        return ms9.a(')', sb, this.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoMusicStreamMixItem(Serializer serializer) {
        this(r3, r4, r5, r6, r0 == null ? "" : r0, serializer.B(VideoFile.class.getClassLoader()));
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
        String str4 = H4 == null ? "" : H4;
        String H5 = serializer.H();
    }
}
