package com.vk.api.generated.serverEffects.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: ServerEffectsCutVideoResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServerEffectsCutVideoResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServerEffectsCutVideoResponseDto> CREATOR = new a();

    @pmi0("generated_ov_id")
    private final long generatedOvId;

    /* compiled from: ServerEffectsCutVideoResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServerEffectsCutVideoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServerEffectsCutVideoResponseDto createFromParcel(Parcel parcel) {
            return new ServerEffectsCutVideoResponseDto(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final ServerEffectsCutVideoResponseDto[] newArray(int i) {
            return new ServerEffectsCutVideoResponseDto[i];
        }
    }

    public ServerEffectsCutVideoResponseDto(long j) {
        this.generatedOvId = j;
    }

    public final long d() {
        return this.generatedOvId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ServerEffectsCutVideoResponseDto) && this.generatedOvId == ((ServerEffectsCutVideoResponseDto) obj).generatedOvId;
    }

    public final int hashCode() {
        return Long.hashCode(this.generatedOvId);
    }

    public final String toString() {
        return vu5.a(')', this.generatedOvId, new StringBuilder("ServerEffectsCutVideoResponseDto(generatedOvId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.generatedOvId);
    }
}
