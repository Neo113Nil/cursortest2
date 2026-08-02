package com.vk.attachpicker.impl.fragment.video;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import xsna.epx;
import xsna.zcl;

/* compiled from: VideoData.kt */
/* loaded from: classes15.dex */
public final class VideoData implements Serializer.StreamParcelable {
    public static final Serializer.c<VideoData> CREATOR = new a();
    public final VideoFile b;
    public final VideoAlbum c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VideoData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VideoData a(Serializer serializer) {
            return new VideoData((VideoFile) serializer.A(VideoFile.class.getClassLoader()), (VideoAlbum) serializer.A(VideoAlbum.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        VideoData videoData = obj instanceof VideoData ? (VideoData) obj : null;
        if (videoData != null && epx.f(videoData.c, this.c)) {
            VideoFile videoFile = videoData.b;
            String r1 = videoFile != null ? videoFile.r1() : null;
            VideoFile videoFile2 = this.b;
            if (epx.f(r1, videoFile2 != null ? videoFile2.r1() : null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        VideoFile videoFile = this.b;
        int hashCode = (videoFile != null ? videoFile.hashCode() : 0) * 31;
        VideoAlbum videoAlbum = this.c;
        return hashCode + (videoAlbum != null ? videoAlbum.hashCode() : 0);
    }

    public final String toString() {
        return "VideoData(videoFile=" + this.b + ", album=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public VideoData(VideoFile videoFile, VideoAlbum videoAlbum) {
        this.b = videoFile;
        this.c = videoAlbum;
    }

    public /* synthetic */ VideoData(VideoFile videoFile, VideoAlbum videoAlbum, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : videoFile, (i & 2) != 0 ? null : videoAlbum);
    }
}
