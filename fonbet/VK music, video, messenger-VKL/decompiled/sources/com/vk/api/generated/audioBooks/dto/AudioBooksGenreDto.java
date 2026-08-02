package com.vk.api.generated.audioBooks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioBooksGenreDto.kt */
/* loaded from: classes14.dex */
public final class AudioBooksGenreDto implements Parcelable {
    public static final Parcelable.Creator<AudioBooksGenreDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    /* compiled from: AudioBooksGenreDto.kt */
    public static final class a implements Parcelable.Creator<AudioBooksGenreDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioBooksGenreDto createFromParcel(Parcel parcel) {
            return new AudioBooksGenreDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioBooksGenreDto[] newArray(int i) {
            return new AudioBooksGenreDto[i];
        }
    }

    public AudioBooksGenreDto(int i, String str) {
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
        if (!(obj instanceof AudioBooksGenreDto)) {
            return false;
        }
        AudioBooksGenreDto audioBooksGenreDto = (AudioBooksGenreDto) obj;
        return this.id == audioBooksGenreDto.id && epx.f(this.name, audioBooksGenreDto.name);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioBooksGenreDto(id=");
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
