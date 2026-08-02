package com.vk.api.generated.ecosystem.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: EcosystemGetValidationStatusResponseDto.kt */
/* loaded from: classes14.dex */
public final class EcosystemGetValidationStatusResponseDto implements Parcelable {
    public static final Parcelable.Creator<EcosystemGetValidationStatusResponseDto> CREATOR = new a();

    @pmi0("payload")
    private final EcosystemValidationInfoSmsinboxDto payload;

    /* compiled from: EcosystemGetValidationStatusResponseDto.kt */
    public static final class a implements Parcelable.Creator<EcosystemGetValidationStatusResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final EcosystemGetValidationStatusResponseDto createFromParcel(Parcel parcel) {
            return new EcosystemGetValidationStatusResponseDto(EcosystemValidationInfoSmsinboxDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final EcosystemGetValidationStatusResponseDto[] newArray(int i) {
            return new EcosystemGetValidationStatusResponseDto[i];
        }
    }

    public EcosystemGetValidationStatusResponseDto(EcosystemValidationInfoSmsinboxDto ecosystemValidationInfoSmsinboxDto) {
        this.payload = ecosystemValidationInfoSmsinboxDto;
    }

    public final EcosystemValidationInfoSmsinboxDto d() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EcosystemGetValidationStatusResponseDto) && epx.f(this.payload, ((EcosystemGetValidationStatusResponseDto) obj).payload);
    }

    public final int hashCode() {
        return this.payload.hashCode();
    }

    public final String toString() {
        return "EcosystemGetValidationStatusResponseDto(payload=" + this.payload + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.payload.writeToParcel(parcel, i);
    }
}
