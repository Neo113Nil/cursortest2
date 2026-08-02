package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: CallsEditParticipantNameResponseDto.kt */
/* loaded from: classes14.dex */
public final class CallsEditParticipantNameResponseDto implements Parcelable {
    public static final Parcelable.Creator<CallsEditParticipantNameResponseDto> CREATOR = new a();

    @pmi0("secret")
    private final String secret;

    /* compiled from: CallsEditParticipantNameResponseDto.kt */
    public static final class a implements Parcelable.Creator<CallsEditParticipantNameResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final CallsEditParticipantNameResponseDto createFromParcel(Parcel parcel) {
            return new CallsEditParticipantNameResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallsEditParticipantNameResponseDto[] newArray(int i) {
            return new CallsEditParticipantNameResponseDto[i];
        }
    }

    public CallsEditParticipantNameResponseDto(String str) {
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
        return (obj instanceof CallsEditParticipantNameResponseDto) && epx.f(this.secret, ((CallsEditParticipantNameResponseDto) obj).secret);
    }

    public final int hashCode() {
        return this.secret.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("CallsEditParticipantNameResponseDto(secret="), this.secret, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.secret);
    }
}
