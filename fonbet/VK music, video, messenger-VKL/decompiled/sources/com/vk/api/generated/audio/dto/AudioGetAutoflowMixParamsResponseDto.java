package com.vk.api.generated.audio.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AudioGetAutoflowMixParamsResponseDto.kt */
/* loaded from: classes14.dex */
public final class AudioGetAutoflowMixParamsResponseDto implements Parcelable {
    public static final Parcelable.Creator<AudioGetAutoflowMixParamsResponseDto> CREATOR = new a();

    @pmi0("entity_id")
    private final String entityId;

    @pmi0("mix_id")
    private final String mixId;

    /* compiled from: AudioGetAutoflowMixParamsResponseDto.kt */
    public static final class a implements Parcelable.Creator<AudioGetAutoflowMixParamsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AudioGetAutoflowMixParamsResponseDto createFromParcel(Parcel parcel) {
            return new AudioGetAutoflowMixParamsResponseDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioGetAutoflowMixParamsResponseDto[] newArray(int i) {
            return new AudioGetAutoflowMixParamsResponseDto[i];
        }
    }

    public AudioGetAutoflowMixParamsResponseDto(String str, String str2) {
        this.mixId = str;
        this.entityId = str2;
    }

    public final String d() {
        return this.entityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.mixId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGetAutoflowMixParamsResponseDto)) {
            return false;
        }
        AudioGetAutoflowMixParamsResponseDto audioGetAutoflowMixParamsResponseDto = (AudioGetAutoflowMixParamsResponseDto) obj;
        return epx.f(this.mixId, audioGetAutoflowMixParamsResponseDto.mixId) && epx.f(this.entityId, audioGetAutoflowMixParamsResponseDto.entityId);
    }

    public final int hashCode() {
        return this.entityId.hashCode() + (this.mixId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioGetAutoflowMixParamsResponseDto(mixId=");
        sb.append(this.mixId);
        sb.append(", entityId=");
        return ho8.a(sb, this.entityId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mixId);
        parcel.writeString(this.entityId);
    }
}
