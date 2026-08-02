package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoGetLongPollServerResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetLongPollServerResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetLongPollServerResponseDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: VideoGetLongPollServerResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetLongPollServerResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetLongPollServerResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetLongPollServerResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetLongPollServerResponseDto[] newArray(int i) {
            return new VideoGetLongPollServerResponseDto[i];
        }
    }

    public VideoGetLongPollServerResponseDto(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetLongPollServerResponseDto) && epx.f(this.url, ((VideoGetLongPollServerResponseDto) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoGetLongPollServerResponseDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }
}
