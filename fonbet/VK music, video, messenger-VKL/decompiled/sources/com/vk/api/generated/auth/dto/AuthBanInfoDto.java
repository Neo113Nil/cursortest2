package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.sdk.SharedKt;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AuthBanInfoDto.kt */
/* loaded from: classes14.dex */
public final class AuthBanInfoDto implements Parcelable {
    public static final Parcelable.Creator<AuthBanInfoDto> CREATOR = new a();

    @pmi0(SharedKt.PARAM_ACCESS_TOKEN)
    private final String accessToken;

    @pmi0("member_name")
    private final String memberName;

    @pmi0("message")
    private final String message;

    /* compiled from: AuthBanInfoDto.kt */
    public static final class a implements Parcelable.Creator<AuthBanInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthBanInfoDto createFromParcel(Parcel parcel) {
            return new AuthBanInfoDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthBanInfoDto[] newArray(int i) {
            return new AuthBanInfoDto[i];
        }
    }

    public AuthBanInfoDto(String str, String str2, String str3) {
        this.memberName = str;
        this.message = str2;
        this.accessToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthBanInfoDto)) {
            return false;
        }
        AuthBanInfoDto authBanInfoDto = (AuthBanInfoDto) obj;
        return epx.f(this.memberName, authBanInfoDto.memberName) && epx.f(this.message, authBanInfoDto.message) && epx.f(this.accessToken, authBanInfoDto.accessToken);
    }

    public final int hashCode() {
        return this.accessToken.hashCode() + urd0.a(this.memberName.hashCode() * 31, 31, this.message);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthBanInfoDto(memberName=");
        sb.append(this.memberName);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", accessToken=");
        return ho8.a(sb, this.accessToken, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.memberName);
        parcel.writeString(this.message);
        parcel.writeString(this.accessToken);
    }
}
