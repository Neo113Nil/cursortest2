package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataAppVkAuthAppDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataAppVkAuthAppDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataAppVkAuthAppDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    /* compiled from: AuthGetAuthDataAppVkAuthAppDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataAppVkAuthAppDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppVkAuthAppDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataAppVkAuthAppDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataAppVkAuthAppDto[] newArray(int i) {
            return new AuthGetAuthDataAppVkAuthAppDto[i];
        }
    }

    public AuthGetAuthDataAppVkAuthAppDto(boolean z) {
        this.enabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthGetAuthDataAppVkAuthAppDto) && this.enabled == ((AuthGetAuthDataAppVkAuthAppDto) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AuthGetAuthDataAppVkAuthAppDto(enabled="), this.enabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
    }
}
