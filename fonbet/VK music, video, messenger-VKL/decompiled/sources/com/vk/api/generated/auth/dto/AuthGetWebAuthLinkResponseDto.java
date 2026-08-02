package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthGetWebAuthLinkResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetWebAuthLinkResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetWebAuthLinkResponseDto> CREATOR = new a();

    @pmi0("url")
    private final String url;

    /* compiled from: AuthGetWebAuthLinkResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetWebAuthLinkResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetWebAuthLinkResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetWebAuthLinkResponseDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetWebAuthLinkResponseDto[] newArray(int i) {
            return new AuthGetWebAuthLinkResponseDto[i];
        }
    }

    public AuthGetWebAuthLinkResponseDto(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthGetWebAuthLinkResponseDto) && epx.f(this.url, ((AuthGetWebAuthLinkResponseDto) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("AuthGetWebAuthLinkResponseDto(url="), this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
    }
}
