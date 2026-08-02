package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoGetSportLiveBetsResponseDto.kt */
/* loaded from: classes15.dex */
public final class VideoGetSportLiveBetsResponseDto implements Parcelable {
    public static final Parcelable.Creator<VideoGetSportLiveBetsResponseDto> CREATOR = new a();

    @pmi0("html")
    private final String html;

    /* compiled from: VideoGetSportLiveBetsResponseDto.kt */
    public static final class a implements Parcelable.Creator<VideoGetSportLiveBetsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoGetSportLiveBetsResponseDto createFromParcel(Parcel parcel) {
            return new VideoGetSportLiveBetsResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoGetSportLiveBetsResponseDto[] newArray(int i) {
            return new VideoGetSportLiveBetsResponseDto[i];
        }
    }

    public VideoGetSportLiveBetsResponseDto(String str) {
        this.html = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoGetSportLiveBetsResponseDto) && epx.f(this.html, ((VideoGetSportLiveBetsResponseDto) obj).html);
    }

    public final int hashCode() {
        return this.html.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoGetSportLiveBetsResponseDto(html="), this.html, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.html);
    }
}
