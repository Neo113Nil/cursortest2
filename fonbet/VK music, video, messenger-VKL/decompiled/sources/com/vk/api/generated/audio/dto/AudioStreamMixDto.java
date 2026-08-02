package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioStreamMixDto.kt */
/* loaded from: classes14.dex */
public final class AudioStreamMixDto implements Parcelable {
    public static final Parcelable.Creator<AudioStreamMixDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("title")
    private final String title;

    /* compiled from: AudioStreamMixDto.kt */
    public static final class a implements Parcelable.Creator<AudioStreamMixDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixDto createFromParcel(Parcel parcel) {
            return new AudioStreamMixDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioStreamMixDto[] newArray(int i) {
            return new AudioStreamMixDto[i];
        }
    }

    public AudioStreamMixDto(String str, String str2) {
        this.id = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioStreamMixDto)) {
            return false;
        }
        AudioStreamMixDto audioStreamMixDto = (AudioStreamMixDto) obj;
        return epx.f(this.id, audioStreamMixDto.id) && epx.f(this.title, audioStreamMixDto.title);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioStreamMixDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
    }
}
