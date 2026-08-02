package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioAudioIdDto.kt */
/* loaded from: classes14.dex */
public final class AudioAudioIdDto implements Parcelable {
    public static final Parcelable.Creator<AudioAudioIdDto> CREATOR = new a();

    @pmi0("audio_id")
    private final int audioId;

    @pmi0("track_code")
    private final String trackCode;

    /* compiled from: AudioAudioIdDto.kt */
    public static final class a implements Parcelable.Creator<AudioAudioIdDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioAudioIdDto createFromParcel(Parcel parcel) {
            return new AudioAudioIdDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioAudioIdDto[] newArray(int i) {
            return new AudioAudioIdDto[i];
        }
    }

    public AudioAudioIdDto(int i, String str) {
        this.audioId = i;
        this.trackCode = str;
    }

    public final int d() {
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
        if (!(obj instanceof AudioAudioIdDto)) {
            return false;
        }
        AudioAudioIdDto audioAudioIdDto = (AudioAudioIdDto) obj;
        return this.audioId == audioAudioIdDto.audioId && epx.f(this.trackCode, audioAudioIdDto.trackCode);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.audioId) * 31;
        String str = this.trackCode;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioAudioIdDto(audioId=");
        sb.append(this.audioId);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.audioId);
        parcel.writeString(this.trackCode);
    }

    public /* synthetic */ AudioAudioIdDto(int i, String str, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str);
    }
}
