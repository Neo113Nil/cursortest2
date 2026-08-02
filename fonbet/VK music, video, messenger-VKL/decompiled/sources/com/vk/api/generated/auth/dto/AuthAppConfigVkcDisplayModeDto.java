package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AuthAppConfigVkcDisplayModeDto.kt */
/* loaded from: classes14.dex */
public final class AuthAppConfigVkcDisplayModeDto implements Parcelable {
    public static final Parcelable.Creator<AuthAppConfigVkcDisplayModeDto> CREATOR = new a();

    @pmi0("single_con")
    private final boolean singleCon;

    /* compiled from: AuthAppConfigVkcDisplayModeDto.kt */
    public static final class a implements Parcelable.Creator<AuthAppConfigVkcDisplayModeDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcDisplayModeDto createFromParcel(Parcel parcel) {
            return new AuthAppConfigVkcDisplayModeDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthAppConfigVkcDisplayModeDto[] newArray(int i) {
            return new AuthAppConfigVkcDisplayModeDto[i];
        }
    }

    public AuthAppConfigVkcDisplayModeDto(boolean z) {
        this.singleCon = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthAppConfigVkcDisplayModeDto) && this.singleCon == ((AuthAppConfigVkcDisplayModeDto) obj).singleCon;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.singleCon);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AuthAppConfigVkcDisplayModeDto(singleCon="), this.singleCon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.singleCon ? 1 : 0);
    }
}
