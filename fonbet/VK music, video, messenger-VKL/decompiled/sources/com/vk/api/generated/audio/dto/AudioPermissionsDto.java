package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AudioPermissionsDto.kt */
/* loaded from: classes14.dex */
public final class AudioPermissionsDto implements Parcelable {
    public static final Parcelable.Creator<AudioPermissionsDto> CREATOR = new a();

    @pmi0("audio_meta_info")
    private final boolean audioMetaInfo;

    /* compiled from: AudioPermissionsDto.kt */
    public static final class a implements Parcelable.Creator<AudioPermissionsDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioPermissionsDto createFromParcel(Parcel parcel) {
            return new AudioPermissionsDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AudioPermissionsDto[] newArray(int i) {
            return new AudioPermissionsDto[i];
        }
    }

    public AudioPermissionsDto(boolean z) {
        this.audioMetaInfo = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioPermissionsDto) && this.audioMetaInfo == ((AudioPermissionsDto) obj).audioMetaInfo;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.audioMetaInfo);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AudioPermissionsDto(audioMetaInfo="), this.audioMetaInfo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.audioMetaInfo ? 1 : 0);
    }
}
