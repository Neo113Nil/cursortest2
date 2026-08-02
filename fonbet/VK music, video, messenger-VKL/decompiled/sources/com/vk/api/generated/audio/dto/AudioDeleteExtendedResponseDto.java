package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AudioDeleteExtendedResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioDeleteExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioDeleteExtendedResponseDto> CREATOR = new a();

    @pmi0("audio_ids")
    private final List<String> audioIds;

    /* compiled from: AudioDeleteExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioDeleteExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioDeleteExtendedResponseDto createFromParcel(Parcel parcel) {
            return new AudioDeleteExtendedResponseDto(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioDeleteExtendedResponseDto[] newArray(int i) {
            return new AudioDeleteExtendedResponseDto[i];
        }
    }

    public AudioDeleteExtendedResponseDto(List<String> list) {
        this.audioIds = list;
    }

    public final List<String> d() {
        return this.audioIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioDeleteExtendedResponseDto) && epx.f(this.audioIds, ((AudioDeleteExtendedResponseDto) obj).audioIds);
    }

    public final int hashCode() {
        return this.audioIds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("AudioDeleteExtendedResponseDto(audioIds="), this.audioIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.audioIds);
    }
}
