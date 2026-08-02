package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthRefreshUserSessionDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshUserSessionDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshUserSessionDto> CREATOR = new a();

    @pmi0("target_key")
    private final String targetKey;

    @pmi0("token")
    private final String token;

    /* compiled from: AuthRefreshUserSessionDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshUserSessionDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshUserSessionDto createFromParcel(Parcel parcel) {
            return new AuthRefreshUserSessionDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshUserSessionDto[] newArray(int i) {
            return new AuthRefreshUserSessionDto[i];
        }
    }

    public AuthRefreshUserSessionDto(String str, String str2) {
        this.targetKey = str;
        this.token = str2;
    }

    public final String d() {
        return this.targetKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRefreshUserSessionDto)) {
            return false;
        }
        AuthRefreshUserSessionDto authRefreshUserSessionDto = (AuthRefreshUserSessionDto) obj;
        return epx.f(this.targetKey, authRefreshUserSessionDto.targetKey) && epx.f(this.token, authRefreshUserSessionDto.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (this.targetKey.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRefreshUserSessionDto(targetKey=");
        sb.append(this.targetKey);
        sb.append(", token=");
        return ho8.a(sb, this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.targetKey);
        parcel.writeString(this.token);
    }
}
