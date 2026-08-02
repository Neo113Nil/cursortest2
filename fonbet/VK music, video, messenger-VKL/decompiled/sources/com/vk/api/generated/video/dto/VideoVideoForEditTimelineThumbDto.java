package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoVideoForEditTimelineThumbDto.kt */
/* loaded from: classes15.dex */
public final class VideoVideoForEditTimelineThumbDto implements Parcelable {
    public static final Parcelable.Creator<VideoVideoForEditTimelineThumbDto> CREATOR = new a();

    @pmi0("thumb_full_id")
    private final String thumbFullId;

    @pmi0("url")
    private final String url;

    /* compiled from: VideoVideoForEditTimelineThumbDto.kt */
    public static final class a implements Parcelable.Creator<VideoVideoForEditTimelineThumbDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoVideoForEditTimelineThumbDto createFromParcel(Parcel parcel) {
            return new VideoVideoForEditTimelineThumbDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoVideoForEditTimelineThumbDto[] newArray(int i) {
            return new VideoVideoForEditTimelineThumbDto[i];
        }
    }

    public VideoVideoForEditTimelineThumbDto(String str, String str2) {
        this.thumbFullId = str;
        this.url = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoVideoForEditTimelineThumbDto)) {
            return false;
        }
        VideoVideoForEditTimelineThumbDto videoVideoForEditTimelineThumbDto = (VideoVideoForEditTimelineThumbDto) obj;
        return epx.f(this.thumbFullId, videoVideoForEditTimelineThumbDto.thumbFullId) && epx.f(this.url, videoVideoForEditTimelineThumbDto.url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.thumbFullId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoVideoForEditTimelineThumbDto(thumbFullId=");
        sb.append(this.thumbFullId);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.thumbFullId);
        parcel.writeString(this.url);
    }
}
