package com.vk.api.generated.video.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: VideoPrivacyDto.kt */
/* loaded from: classes15.dex */
public final class VideoPrivacyDto implements Parcelable {
    public static final Parcelable.Creator<VideoPrivacyDto> CREATOR = new a();

    @pmi0("alias")
    private final String alias;

    /* compiled from: VideoPrivacyDto.kt */
    public static final class a implements Parcelable.Creator<VideoPrivacyDto> {
        @Override // android.os.Parcelable.Creator
        public final VideoPrivacyDto createFromParcel(Parcel parcel) {
            return new VideoPrivacyDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VideoPrivacyDto[] newArray(int i) {
            return new VideoPrivacyDto[i];
        }
    }

    public VideoPrivacyDto(String str) {
        this.alias = str;
    }

    public final String d() {
        return this.alias;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoPrivacyDto) && epx.f(this.alias, ((VideoPrivacyDto) obj).alias);
    }

    public final int hashCode() {
        return this.alias.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("VideoPrivacyDto(alias="), this.alias, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.alias);
    }
}
