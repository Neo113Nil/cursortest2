package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioSubscribeUrlResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioSubscribeUrlResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioSubscribeUrlResponseDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: AudioSubscribeUrlResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioSubscribeUrlResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioSubscribeUrlResponseDto createFromParcel(Parcel parcel) {
            return new AudioSubscribeUrlResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioSubscribeUrlResponseDto[] newArray(int i) {
            return new AudioSubscribeUrlResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioSubscribeUrlResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioSubscribeUrlResponseDto) && epx.f(this.url, ((AudioSubscribeUrlResponseDto) obj).url);
    }

    public final int hashCode() {
        String str = this.url;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AudioSubscribeUrlResponseDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }

    public AudioSubscribeUrlResponseDto(String str) {
        this.url = str;
    }

    public /* synthetic */ AudioSubscribeUrlResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
