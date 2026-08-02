package com.vk.api.generated.masks.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: MasksGetModelResponseDto.kt */
/* loaded from: classes15.dex */
public final class MasksGetModelResponseDto implements Parcelable {
    public static final Parcelable.Creator<MasksGetModelResponseDto> CREATOR = new a();

    @pmi0("model_url")
    private final String modelUrl;

    @pmi0("model_version")
    private final int modelVersion;

    /* compiled from: MasksGetModelResponseDto.kt */
    public static final class a implements Parcelable.Creator<MasksGetModelResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MasksGetModelResponseDto createFromParcel(Parcel parcel) {
            return new MasksGetModelResponseDto(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MasksGetModelResponseDto[] newArray(int i) {
            return new MasksGetModelResponseDto[i];
        }
    }

    public MasksGetModelResponseDto(String str, int i) {
        this.modelUrl = str;
        this.modelVersion = i;
    }

    public final String d() {
        return this.modelUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.modelVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasksGetModelResponseDto)) {
            return false;
        }
        MasksGetModelResponseDto masksGetModelResponseDto = (MasksGetModelResponseDto) obj;
        return epx.f(this.modelUrl, masksGetModelResponseDto.modelUrl) && this.modelVersion == masksGetModelResponseDto.modelVersion;
    }

    public final int hashCode() {
        return Integer.hashCode(this.modelVersion) + (this.modelUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasksGetModelResponseDto(modelUrl=");
        sb.append(this.modelUrl);
        sb.append(", modelVersion=");
        return vu5.b(sb, this.modelVersion, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.modelUrl);
        parcel.writeInt(this.modelVersion);
    }
}
