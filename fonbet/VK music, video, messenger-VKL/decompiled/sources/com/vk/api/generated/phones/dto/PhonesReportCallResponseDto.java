package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: PhonesReportCallResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhonesReportCallResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhonesReportCallResponseDto> CREATOR = new a();

    @pmi0("is_reported")
    private final boolean isReported;

    /* compiled from: PhonesReportCallResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhonesReportCallResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesReportCallResponseDto createFromParcel(Parcel parcel) {
            return new PhonesReportCallResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesReportCallResponseDto[] newArray(int i) {
            return new PhonesReportCallResponseDto[i];
        }
    }

    public PhonesReportCallResponseDto(boolean z) {
        this.isReported = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhonesReportCallResponseDto) && this.isReported == ((PhonesReportCallResponseDto) obj).isReported;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isReported);
    }

    public final String toString() {
        return q0.a(new StringBuilder("PhonesReportCallResponseDto(isReported="), this.isReported, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isReported ? 1 : 0);
    }
}
