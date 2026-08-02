package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: CallsCheckParticipantNameResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsCheckParticipantNameResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsCheckParticipantNameResponseDto> CREATOR = new a();

    @pmi0("is_valid")
    private final boolean isValid;

    /* compiled from: CallsCheckParticipantNameResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsCheckParticipantNameResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsCheckParticipantNameResponseDto createFromParcel(Parcel parcel) {
            return new CallsCheckParticipantNameResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CallsCheckParticipantNameResponseDto[] newArray(int i) {
            return new CallsCheckParticipantNameResponseDto[i];
        }
    }

    public CallsCheckParticipantNameResponseDto(boolean z) {
        this.isValid = z;
    }

    public final boolean d() {
        return this.isValid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallsCheckParticipantNameResponseDto) && this.isValid == ((CallsCheckParticipantNameResponseDto) obj).isValid;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isValid);
    }

    public final String toString() {
        return q0.a(new StringBuilder("CallsCheckParticipantNameResponseDto(isValid="), this.isValid, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isValid ? 1 : 0);
    }
}
