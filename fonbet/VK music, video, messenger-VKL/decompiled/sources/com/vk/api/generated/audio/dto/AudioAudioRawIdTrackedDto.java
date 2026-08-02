package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioAudioRawIdTrackedDto.kt */
/* loaded from: classes14.dex */
public final class AudioAudioRawIdTrackedDto implements Parcelable {
    public static final Parcelable.Creator<AudioAudioRawIdTrackedDto> CREATOR = new a();

    @pmi0("audio_id")
    private final String audioId;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: AudioAudioRawIdTrackedDto.kt */
    public static final class a implements Parcelable.Creator<AudioAudioRawIdTrackedDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAudioRawIdTrackedDto createFromParcel(Parcel parcel) {
            return new AudioAudioRawIdTrackedDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAudioRawIdTrackedDto[] newArray(int i) {
            return new AudioAudioRawIdTrackedDto[i];
        }
    }

    public AudioAudioRawIdTrackedDto(String str, String str2) {
        this.audioId = str;
        this.trackCode = str2;
    }

    public final String d() {
        return this.audioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAudioRawIdTrackedDto)) {
            return false;
        }
        AudioAudioRawIdTrackedDto audioAudioRawIdTrackedDto = (AudioAudioRawIdTrackedDto) obj;
        return epx.f(this.audioId, audioAudioRawIdTrackedDto.audioId) && epx.f(this.trackCode, audioAudioRawIdTrackedDto.trackCode);
    }

    public final int hashCode() {
        return this.trackCode.hashCode() + (this.audioId.hashCode() * 31);
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAudioRawIdTrackedDto(audioId=");
        sb.append(this.audioId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioId);
        parcel.writeString(this.trackCode);
    }
}
