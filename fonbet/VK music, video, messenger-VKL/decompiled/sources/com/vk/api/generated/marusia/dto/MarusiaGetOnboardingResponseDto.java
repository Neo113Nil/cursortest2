package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: MarusiaGetOnboardingResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetOnboardingResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetOnboardingResponseDto> CREATOR = new a();

    @pmi0("is_sent")
    private final boolean isSent;

    /* compiled from: MarusiaGetOnboardingResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetOnboardingResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetOnboardingResponseDto createFromParcel(Parcel parcel) {
            return new MarusiaGetOnboardingResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetOnboardingResponseDto[] newArray(int i) {
            return new MarusiaGetOnboardingResponseDto[i];
        }
    }

    public MarusiaGetOnboardingResponseDto(boolean z) {
        this.isSent = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarusiaGetOnboardingResponseDto) && this.isSent == ((MarusiaGetOnboardingResponseDto) obj).isSent;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSent);
    }

    public final String toString() {
        return q0.a(new StringBuilder("MarusiaGetOnboardingResponseDto(isSent="), this.isSent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isSent ? 1 : 0);
    }
}
