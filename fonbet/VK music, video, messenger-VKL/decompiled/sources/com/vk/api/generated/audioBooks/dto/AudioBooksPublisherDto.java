package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioBooksPublisherDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksPublisherDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksPublisherDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: AudioBooksPublisherDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksPublisherDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksPublisherDto createFromParcel(Parcel parcel) {
            return new AudioBooksPublisherDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksPublisherDto[] newArray(int i) {
            return new AudioBooksPublisherDto[i];
        }
    }

    public AudioBooksPublisherDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioBooksPublisherDto)) {
            return false;
        }
        AudioBooksPublisherDto audioBooksPublisherDto = (AudioBooksPublisherDto) obj;
        return this.id == audioBooksPublisherDto.id && epx.f(this.name, audioBooksPublisherDto.name);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksPublisherDto(id=");
        sb.append(this.id);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
    }
}
