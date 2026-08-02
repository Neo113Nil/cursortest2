package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioHintDto.kt */
/* loaded from: classes14.dex */
public final class AudioHintDto implements Parcelable {
    public static final Parcelable.Creator<AudioHintDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    /* compiled from: AudioHintDto.kt */
    public static final class a implements Parcelable.Creator<AudioHintDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioHintDto createFromParcel(Parcel parcel) {
            return new AudioHintDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioHintDto[] newArray(int i) {
            return new AudioHintDto[i];
        }
    }

    public AudioHintDto(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioHintDto) && epx.f(this.name, ((AudioHintDto) obj).name);
    }

    public final int hashCode() {
        return this.name.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AudioHintDto(name="), this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
    }
}
