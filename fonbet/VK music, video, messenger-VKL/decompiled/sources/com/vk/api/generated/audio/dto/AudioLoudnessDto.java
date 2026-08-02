package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.xq;

/* compiled from: AudioLoudnessDto.kt */
/* loaded from: classes14.dex */
public final class AudioLoudnessDto implements Parcelable {
    public static final Parcelable.Creator<AudioLoudnessDto> CREATOR = new a();

    @pmi0("lufs")
    private final float lufs;

    @pmi0("peak")
    private final float peak;

    /* compiled from: AudioLoudnessDto.kt */
    public static final class a implements Parcelable.Creator<AudioLoudnessDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioLoudnessDto createFromParcel(Parcel parcel) {
            return new AudioLoudnessDto(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioLoudnessDto[] newArray(int i) {
            return new AudioLoudnessDto[i];
        }
    }

    public AudioLoudnessDto(float f, float f2) {
        this.lufs = f;
        this.peak = f2;
    }

    public final float d() {
        return this.lufs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float e() {
        return this.peak;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioLoudnessDto)) {
            return false;
        }
        AudioLoudnessDto audioLoudnessDto = (AudioLoudnessDto) obj;
        return Float.compare(this.lufs, audioLoudnessDto.lufs) == 0 && Float.compare(this.peak, audioLoudnessDto.peak) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.peak) + (Float.hashCode(this.lufs) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioLoudnessDto(lufs=");
        sb.append(this.lufs);
        sb.append(", peak=");
        return xq.c(')', this.peak, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.lufs);
        parcel.writeFloat(this.peak);
    }
}
