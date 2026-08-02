package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthGetAnonymTokenResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetAnonymTokenResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetAnonymTokenResponseDto> CREATOR = new a();

    @pmi0("expired_at")
    private final Integer expiredAt;

    @pmi0("token")
    private final String token;

    /* compiled from: AuthGetAnonymTokenResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetAnonymTokenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetAnonymTokenResponseDto createFromParcel(Parcel parcel) {
            return new AuthGetAnonymTokenResponseDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetAnonymTokenResponseDto[] newArray(int i) {
            return new AuthGetAnonymTokenResponseDto[i];
        }
    }

    public AuthGetAnonymTokenResponseDto(String str, Integer num) {
        this.token = str;
        this.expiredAt = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetAnonymTokenResponseDto)) {
            return false;
        }
        AuthGetAnonymTokenResponseDto authGetAnonymTokenResponseDto = (AuthGetAnonymTokenResponseDto) obj;
        return epx.f(this.token, authGetAnonymTokenResponseDto.token) && epx.f(this.expiredAt, authGetAnonymTokenResponseDto.expiredAt);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        Integer num = this.expiredAt;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetAnonymTokenResponseDto(token=");
        sb.append(this.token);
        sb.append(", expiredAt=");
        return uqi.b(sb, this.expiredAt, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.token);
        Integer num = this.expiredAt;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AuthGetAnonymTokenResponseDto(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
