package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoGetExternalStatsTokenResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetExternalStatsTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetExternalStatsTokenResponseDto> CREATOR = new a();

    @pmi0("token")
    private final String token;

    /* compiled from: VideoGetExternalStatsTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetExternalStatsTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetExternalStatsTokenResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetExternalStatsTokenResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetExternalStatsTokenResponseDto[] newArray(int i) {
            return new VideoGetExternalStatsTokenResponseDto[i];
        }
    }

    public VideoGetExternalStatsTokenResponseDto(String str) {
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
        return (obj instanceof VideoGetExternalStatsTokenResponseDto) && epx.f(this.token, ((VideoGetExternalStatsTokenResponseDto) obj).token);
    }

    public final int hashCode() {
        return this.token.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoGetExternalStatsTokenResponseDto(token="), this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
    }
}
