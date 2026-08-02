package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioConcertCityDto.kt */
/* loaded from: classes14.dex */
public final class AudioConcertCityDto implements Parcelable {
    public static final Parcelable.Creator<AudioConcertCityDto> CREATOR = new a();

    @pmi0("id")
    private final int id;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioConcertCityDto.kt */
    public static final class a implements Parcelable.Creator<AudioConcertCityDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioConcertCityDto createFromParcel(Parcel parcel) {
            return new AudioConcertCityDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioConcertCityDto[] newArray(int i) {
            return new AudioConcertCityDto[i];
        }
    }

    public AudioConcertCityDto(int i, String str) {
        this.id = i;
        this.title = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioConcertCityDto)) {
            return false;
        }
        AudioConcertCityDto audioConcertCityDto = (AudioConcertCityDto) obj;
        return this.id == audioConcertCityDto.id && epx.f(this.title, audioConcertCityDto.title);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioConcertCityDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
    }
}
