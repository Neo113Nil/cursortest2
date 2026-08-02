package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthTrustedHashIndexedDto.kt */
/* loaded from: classes14.dex */
public final class AuthTrustedHashIndexedDto implements Parcelable {
    public static final Parcelable.Creator<AuthTrustedHashIndexedDto> CREATOR = new a();

    @pmi0("index")
    private final int index;

    @pmi0("trusted_hash")
    private final String trustedHash;

    /* compiled from: AuthTrustedHashIndexedDto.kt */
    public static final class a implements Parcelable.Creator<AuthTrustedHashIndexedDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthTrustedHashIndexedDto createFromParcel(Parcel parcel) {
            return new AuthTrustedHashIndexedDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthTrustedHashIndexedDto[] newArray(int i) {
            return new AuthTrustedHashIndexedDto[i];
        }
    }

    public AuthTrustedHashIndexedDto(int i, String str) {
        this.index = i;
        this.trustedHash = str;
    }

    public final int d() {
        return this.index;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.trustedHash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthTrustedHashIndexedDto)) {
            return false;
        }
        AuthTrustedHashIndexedDto authTrustedHashIndexedDto = (AuthTrustedHashIndexedDto) obj;
        return this.index == authTrustedHashIndexedDto.index && epx.f(this.trustedHash, authTrustedHashIndexedDto.trustedHash);
    }

    public final int hashCode() {
        return this.trustedHash.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthTrustedHashIndexedDto(index=");
        sb.append(this.index);
        sb.append(", trustedHash=");
        return ho8.a(sb, this.trustedHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.trustedHash);
    }
}
