package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: VideoTvSplashLoopPartDto.kt */
/* loaded from: classes15.dex */
public final class VideoTvSplashLoopPartDto implements Parcelable {
    public static final Parcelable.Creator<VideoTvSplashLoopPartDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("source")
    private final String source;

    /* compiled from: VideoTvSplashLoopPartDto.kt */
    public static final class a implements Parcelable.Creator<VideoTvSplashLoopPartDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopPartDto createFromParcel(Parcel parcel) {
            return new VideoTvSplashLoopPartDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoTvSplashLoopPartDto[] newArray(int i) {
            return new VideoTvSplashLoopPartDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoTvSplashLoopPartDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTvSplashLoopPartDto)) {
            return false;
        }
        VideoTvSplashLoopPartDto videoTvSplashLoopPartDto = (VideoTvSplashLoopPartDto) obj;
        return epx.f(this.id, videoTvSplashLoopPartDto.id) && epx.f(this.source, videoTvSplashLoopPartDto.source);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTvSplashLoopPartDto(id=");
        sb.append(this.id);
        sb.append(", source=");
        return ho8.a(sb, this.source, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.source);
    }

    public VideoTvSplashLoopPartDto(String str, String str2) {
        this.id = str;
        this.source = str2;
    }

    public /* synthetic */ VideoTvSplashLoopPartDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
