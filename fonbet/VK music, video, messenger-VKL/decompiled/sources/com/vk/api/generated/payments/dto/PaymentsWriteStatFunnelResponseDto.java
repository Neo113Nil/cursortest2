package com.vk.api.generated.payments.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: PaymentsWriteStatFunnelResponseDto.kt */
/* loaded from: classes15.dex */
public final class PaymentsWriteStatFunnelResponseDto implements Parcelable {
    public static final Parcelable.Creator<PaymentsWriteStatFunnelResponseDto> CREATOR = new a();

    @pmi0("status")
    private final boolean status;

    /* compiled from: PaymentsWriteStatFunnelResponseDto.kt */
    public static final class a implements Parcelable.Creator<PaymentsWriteStatFunnelResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PaymentsWriteStatFunnelResponseDto createFromParcel(Parcel parcel) {
            return new PaymentsWriteStatFunnelResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentsWriteStatFunnelResponseDto[] newArray(int i) {
            return new PaymentsWriteStatFunnelResponseDto[i];
        }
    }

    public PaymentsWriteStatFunnelResponseDto(boolean z) {
        this.status = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentsWriteStatFunnelResponseDto) && this.status == ((PaymentsWriteStatFunnelResponseDto) obj).status;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.status);
    }

    public final String toString() {
        return q0.a(new StringBuilder("PaymentsWriteStatFunnelResponseDto(status="), this.status, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status ? 1 : 0);
    }
}
