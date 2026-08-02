package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoGetStatsTokenResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetStatsTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetStatsTokenResponseDto> CREATOR = new a();

    @pmi0("token")
    private final String token;

    /* compiled from: VideoGetStatsTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetStatsTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetStatsTokenResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetStatsTokenResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetStatsTokenResponseDto[] newArray(int i) {
            return new VideoGetStatsTokenResponseDto[i];
        }
    }

    public VideoGetStatsTokenResponseDto(String str) {
        this.token = str;
    }

    public final String d() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetStatsTokenResponseDto) && epx.f(this.token, ((VideoGetStatsTokenResponseDto) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoGetStatsTokenResponseDto(token="), this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
    }
}
