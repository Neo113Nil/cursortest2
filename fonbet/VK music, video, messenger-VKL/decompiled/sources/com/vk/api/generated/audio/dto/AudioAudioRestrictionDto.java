package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioAudioRestrictionDto.kt */
/* loaded from: classes14.dex */
public final class AudioAudioRestrictionDto implements Parcelable {
    public static final Parcelable.Creator<AudioAudioRestrictionDto> CREATOR = new a();

    @pmi0("audio_id")
    private final String audioId;

    @pmi0("restriction")
    private final AudioRestrictionDto restriction;

    /* compiled from: AudioAudioRestrictionDto.kt */
    public static final class a implements Parcelable.Creator<AudioAudioRestrictionDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAudioRestrictionDto createFromParcel(Parcel parcel) {
            return new AudioAudioRestrictionDto(parcel.readString(), (AudioRestrictionDto) parcel.readParcelable(AudioAudioRestrictionDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAudioRestrictionDto[] newArray(int i) {
            return new AudioAudioRestrictionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioAudioRestrictionDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.audioId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AudioRestrictionDto e() {
        return this.restriction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioAudioRestrictionDto)) {
            return false;
        }
        AudioAudioRestrictionDto audioAudioRestrictionDto = (AudioAudioRestrictionDto) obj;
        return epx.f(this.audioId, audioAudioRestrictionDto.audioId) && this.restriction == audioAudioRestrictionDto.restriction;
    }

    public final int hashCode() {
        String str = this.audioId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AudioRestrictionDto audioRestrictionDto = this.restriction;
        return hashCode + (audioRestrictionDto != null ? audioRestrictionDto.hashCode() : 0);
    }

    public final String toString() {
        return "AudioAudioRestrictionDto(audioId=" + this.audioId + ", restriction=" + this.restriction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.audioId);
        parcel.writeParcelable(this.restriction, i);
    }

    public AudioAudioRestrictionDto(String str, AudioRestrictionDto audioRestrictionDto) {
        this.audioId = str;
        this.restriction = audioRestrictionDto;
    }

    public /* synthetic */ AudioAudioRestrictionDto(String str, AudioRestrictionDto audioRestrictionDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : audioRestrictionDto);
    }
}
