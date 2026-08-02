package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: AudioEventPhotosDto.kt */
/* loaded from: classes14.dex */
public final class AudioEventPhotosDto implements Parcelable {
    public static final Parcelable.Creator<AudioEventPhotosDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    @pmi0("with_padding")
    private final String withPadding;

    /* compiled from: AudioEventPhotosDto.kt */
    public static final class a implements Parcelable.Creator<AudioEventPhotosDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioEventPhotosDto createFromParcel(Parcel parcel) {
            return new AudioEventPhotosDto(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioEventPhotosDto[] newArray(int i) {
            return new AudioEventPhotosDto[i];
        }
    }

    public AudioEventPhotosDto(String str, int i, int i2, String str2) {
        this.url = str;
        this.width = i;
        this.height = i2;
        this.withPadding = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioEventPhotosDto)) {
            return false;
        }
        AudioEventPhotosDto audioEventPhotosDto = (AudioEventPhotosDto) obj;
        return epx.f(this.url, audioEventPhotosDto.url) && this.width == audioEventPhotosDto.width && this.height == audioEventPhotosDto.height && epx.f(this.withPadding, audioEventPhotosDto.withPadding);
    }

    public final int hashCode() {
        return this.withPadding.hashCode() + shy.a(this.height, shy.a(this.width, this.url.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEventPhotosDto(url=");
        sb.append(this.url);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", withPadding=");
        return ho8.a(sb, this.withPadding, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.withPadding);
    }
}
