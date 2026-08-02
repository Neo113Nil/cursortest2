package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AuthGetAuthDataSettingsRedirectDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataSettingsRedirectDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataSettingsRedirectDto> CREATOR = new a();

    @pmi0("skip_payload")
    private final boolean skipPayload;

    @pmi0("state")
    private final String state;

    @pmi0("uri")
    private final String uri;

    /* compiled from: AuthGetAuthDataSettingsRedirectDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataSettingsRedirectDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsRedirectDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataSettingsRedirectDto(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataSettingsRedirectDto[] newArray(int i) {
            return new AuthGetAuthDataSettingsRedirectDto[i];
        }
    }

    public AuthGetAuthDataSettingsRedirectDto(String str, String str2, boolean z) {
        this.uri = str;
        this.state = str2;
        this.skipPayload = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataSettingsRedirectDto)) {
            return false;
        }
        AuthGetAuthDataSettingsRedirectDto authGetAuthDataSettingsRedirectDto = (AuthGetAuthDataSettingsRedirectDto) obj;
        return epx.f(this.uri, authGetAuthDataSettingsRedirectDto.uri) && epx.f(this.state, authGetAuthDataSettingsRedirectDto.state) && this.skipPayload == authGetAuthDataSettingsRedirectDto.skipPayload;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.skipPayload) + urd0.a(this.uri.hashCode() * 31, 31, this.state);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataSettingsRedirectDto(uri=");
        sb.append(this.uri);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", skipPayload=");
        return q0.a(sb, this.skipPayload, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uri);
        parcel.writeString(this.state);
        parcel.writeInt(this.skipPayload ? 1 : 0);
    }
}
