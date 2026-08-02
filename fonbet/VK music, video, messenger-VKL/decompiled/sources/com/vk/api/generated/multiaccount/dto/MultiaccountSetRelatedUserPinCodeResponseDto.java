package com.vk.api.generated.multiaccount.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: MultiaccountSetRelatedUserPinCodeResponseDto.kt */
/* loaded from: classes15.dex */
public final class MultiaccountSetRelatedUserPinCodeResponseDto implements Parcelable {
    public static final Parcelable.Creator<MultiaccountSetRelatedUserPinCodeResponseDto> CREATOR = new a();

    @pmi0("success")
    private final boolean success;

    /* compiled from: MultiaccountSetRelatedUserPinCodeResponseDto.kt */
    public static final class a implements Parcelable.Creator<MultiaccountSetRelatedUserPinCodeResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MultiaccountSetRelatedUserPinCodeResponseDto createFromParcel(Parcel parcel) {
            return new MultiaccountSetRelatedUserPinCodeResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MultiaccountSetRelatedUserPinCodeResponseDto[] newArray(int i) {
            return new MultiaccountSetRelatedUserPinCodeResponseDto[i];
        }
    }

    public MultiaccountSetRelatedUserPinCodeResponseDto(boolean z) {
        this.success = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MultiaccountSetRelatedUserPinCodeResponseDto) && this.success == ((MultiaccountSetRelatedUserPinCodeResponseDto) obj).success;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.success);
    }

    public final String toString() {
        return q0.a(new StringBuilder("MultiaccountSetRelatedUserPinCodeResponseDto(success="), this.success, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.success ? 1 : 0);
    }
}
