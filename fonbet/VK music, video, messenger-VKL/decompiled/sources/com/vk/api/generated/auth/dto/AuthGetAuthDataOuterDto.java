package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetAuthDataOuterDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAuthDataOuterDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAuthDataOuterDto> CREATOR = new a();

    @pmi0(CandidateTypeHintConfig.TYPE_HOST)
    private final String host;

    @pmi0("scheme")
    private final String scheme;

    /* compiled from: AuthGetAuthDataOuterDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAuthDataOuterDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataOuterDto createFromParcel(Parcel parcel) {
            return new AuthGetAuthDataOuterDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAuthDataOuterDto[] newArray(int i) {
            return new AuthGetAuthDataOuterDto[i];
        }
    }

    public AuthGetAuthDataOuterDto(String str, String str2) {
        this.scheme = str;
        this.host = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAuthDataOuterDto)) {
            return false;
        }
        AuthGetAuthDataOuterDto authGetAuthDataOuterDto = (AuthGetAuthDataOuterDto) obj;
        return epx.f(this.scheme, authGetAuthDataOuterDto.scheme) && epx.f(this.host, authGetAuthDataOuterDto.host);
    }

    public final int hashCode() {
        return this.host.hashCode() + (this.scheme.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAuthDataOuterDto(scheme=");
        sb.append(this.scheme);
        sb.append(", host=");
        return ho8.a(sb, this.host, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.scheme);
        parcel.writeString(this.host);
    }
}
