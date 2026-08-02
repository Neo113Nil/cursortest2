package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.vu5;

/* compiled from: EcosystemCheckPhoneReuseResponseDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemCheckPhoneReuseResponseDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemCheckPhoneReuseResponseDto> CREATOR = new a();

    @pmi0("phonereuse_timeout_ms")
    private final int phonereuseTimeoutMs;

    /* compiled from: EcosystemCheckPhoneReuseResponseDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemCheckPhoneReuseResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemCheckPhoneReuseResponseDto createFromParcel(Parcel parcel) {
            return new EcosystemCheckPhoneReuseResponseDto(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemCheckPhoneReuseResponseDto[] newArray(int i) {
            return new EcosystemCheckPhoneReuseResponseDto[i];
        }
    }

    public EcosystemCheckPhoneReuseResponseDto(int i) {
        this.phonereuseTimeoutMs = i;
    }

    public final int d() {
        return this.phonereuseTimeoutMs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcosystemCheckPhoneReuseResponseDto) && this.phonereuseTimeoutMs == ((EcosystemCheckPhoneReuseResponseDto) obj).phonereuseTimeoutMs;
    }

    public final int hashCode() {
        return Integer.hashCode(this.phonereuseTimeoutMs);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("EcosystemCheckPhoneReuseResponseDto(phonereuseTimeoutMs="), this.phonereuseTimeoutMs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.phonereuseTimeoutMs);
    }
}
