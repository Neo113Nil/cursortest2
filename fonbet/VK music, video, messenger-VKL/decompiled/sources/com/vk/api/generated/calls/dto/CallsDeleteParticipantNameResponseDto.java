package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CallsDeleteParticipantNameResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsDeleteParticipantNameResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsDeleteParticipantNameResponseDto> CREATOR = new a();

    @pmi0("secret")
    private final String secret;

    /* compiled from: CallsDeleteParticipantNameResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsDeleteParticipantNameResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsDeleteParticipantNameResponseDto createFromParcel(Parcel parcel) {
            return new CallsDeleteParticipantNameResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsDeleteParticipantNameResponseDto[] newArray(int i) {
            return new CallsDeleteParticipantNameResponseDto[i];
        }
    }

    public CallsDeleteParticipantNameResponseDto(String str) {
        this.secret = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CallsDeleteParticipantNameResponseDto) && epx.f(this.secret, ((CallsDeleteParticipantNameResponseDto) obj).secret);
    }

    public final int hashCode() {
        return this.secret.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CallsDeleteParticipantNameResponseDto(secret="), this.secret, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.secret);
    }
}
