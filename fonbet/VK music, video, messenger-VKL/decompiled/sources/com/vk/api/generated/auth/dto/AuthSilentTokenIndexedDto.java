package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AuthSilentTokenIndexedDto.kt */
/* loaded from: classes14.dex */
public final class AuthSilentTokenIndexedDto implements Parcelable {
    public static final Parcelable.Creator<AuthSilentTokenIndexedDto> CREATOR = new a();

    @pmi0("index")
    private final int index;

    @pmi0("token")
    private final AuthSilentTokenDto token;

    /* compiled from: AuthSilentTokenIndexedDto.kt */
    public static final class a implements Parcelable.Creator<AuthSilentTokenIndexedDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenIndexedDto createFromParcel(Parcel parcel) {
            return new AuthSilentTokenIndexedDto(parcel.readInt(), AuthSilentTokenDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthSilentTokenIndexedDto[] newArray(int i) {
            return new AuthSilentTokenIndexedDto[i];
        }
    }

    public AuthSilentTokenIndexedDto(int i, AuthSilentTokenDto authSilentTokenDto) {
        this.index = i;
        this.token = authSilentTokenDto;
    }

    public final int d() {
        return this.index;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AuthSilentTokenDto e() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthSilentTokenIndexedDto)) {
            return false;
        }
        AuthSilentTokenIndexedDto authSilentTokenIndexedDto = (AuthSilentTokenIndexedDto) obj;
        return this.index == authSilentTokenIndexedDto.index && epx.f(this.token, authSilentTokenIndexedDto.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public final String toString() {
        return "AuthSilentTokenIndexedDto(index=" + this.index + ", token=" + this.token + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        this.token.writeToParcel(parcel, i);
    }
}
