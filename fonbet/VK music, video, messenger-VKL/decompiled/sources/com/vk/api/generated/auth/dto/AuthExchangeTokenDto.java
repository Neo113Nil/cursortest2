package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AuthExchangeTokenDto.kt */
/* loaded from: classes14.dex */
public final class AuthExchangeTokenDto implements Parcelable {
    public static final Parcelable.Creator<AuthExchangeTokenDto> CREATOR = new a();

    @pmi0("tier")
    private final int tier;

    @pmi0("token")
    private final String token;

    /* compiled from: AuthExchangeTokenDto.kt */
    public static final class a implements Parcelable.Creator<AuthExchangeTokenDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthExchangeTokenDto createFromParcel(Parcel parcel) {
            return new AuthExchangeTokenDto(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthExchangeTokenDto[] newArray(int i) {
            return new AuthExchangeTokenDto[i];
        }
    }

    public AuthExchangeTokenDto(int i, String str) {
        this.tier = i;
        this.token = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthExchangeTokenDto)) {
            return false;
        }
        AuthExchangeTokenDto authExchangeTokenDto = (AuthExchangeTokenDto) obj;
        return this.tier == authExchangeTokenDto.tier && epx.f(this.token, authExchangeTokenDto.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + (Integer.hashCode(this.tier) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthExchangeTokenDto(tier=");
        sb.append(this.tier);
        sb.append(", token=");
        return ho8.a(sb, this.token, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.tier);
        parcel.writeString(this.token);
    }
}
