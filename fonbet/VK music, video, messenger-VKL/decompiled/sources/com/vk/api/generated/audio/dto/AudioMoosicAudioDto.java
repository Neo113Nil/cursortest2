package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AudioMoosicAudioDto.kt */
/* loaded from: classes14.dex */
public final class AudioMoosicAudioDto implements Parcelable {
    public static final Parcelable.Creator<AudioMoosicAudioDto> CREATOR = new a();

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("moosic_id")
    private final String moosicId;

    /* compiled from: AudioMoosicAudioDto.kt */
    public static final class a implements Parcelable.Creator<AudioMoosicAudioDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioMoosicAudioDto createFromParcel(Parcel parcel) {
            return new AudioMoosicAudioDto(parcel.readString(), (AudioAudioDto) parcel.readParcelable(AudioMoosicAudioDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioMoosicAudioDto[] newArray(int i) {
            return new AudioMoosicAudioDto[i];
        }
    }

    public AudioMoosicAudioDto(String str, AudioAudioDto audioAudioDto) {
        this.moosicId = str;
        this.audio = audioAudioDto;
    }

    public final AudioAudioDto d() {
        return this.audio;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.moosicId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioMoosicAudioDto)) {
            return false;
        }
        AudioMoosicAudioDto audioMoosicAudioDto = (AudioMoosicAudioDto) obj;
        return epx.f(this.moosicId, audioMoosicAudioDto.moosicId) && epx.f(this.audio, audioMoosicAudioDto.audio);
    }

    public final int hashCode() {
        return this.audio.hashCode() + (this.moosicId.hashCode() * 31);
    }

    public final String toString() {
        return "AudioMoosicAudioDto(moosicId=" + this.moosicId + ", audio=" + this.audio + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.moosicId);
        parcel.writeParcelable(this.audio, i);
    }
}
