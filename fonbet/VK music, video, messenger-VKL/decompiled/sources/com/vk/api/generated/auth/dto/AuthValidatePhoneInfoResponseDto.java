package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthValidatePhoneInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidatePhoneInfoResponseDto> CREATOR = new a();

    @pmi0("callreset")
    private final AuthValidatePhoneCallresetInfoDto callreset;

    /* compiled from: AuthValidatePhoneInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneInfoResponseDto createFromParcel(Parcel parcel) {
            return new AuthValidatePhoneInfoResponseDto(parcel.readInt() == 0 ? null : AuthValidatePhoneCallresetInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneInfoResponseDto[] newArray(int i) {
            return new AuthValidatePhoneInfoResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthValidatePhoneInfoResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthValidatePhoneInfoResponseDto) && epx.f(this.callreset, ((AuthValidatePhoneInfoResponseDto) obj).callreset);
    }

    public final int hashCode() {
        AuthValidatePhoneCallresetInfoDto authValidatePhoneCallresetInfoDto = this.callreset;
        if (authValidatePhoneCallresetInfoDto == null) {
            return 0;
        }
        return authValidatePhoneCallresetInfoDto.hashCode();
    }

    public final String toString() {
        return "AuthValidatePhoneInfoResponseDto(callreset=" + this.callreset + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AuthValidatePhoneCallresetInfoDto authValidatePhoneCallresetInfoDto = this.callreset;
        if (authValidatePhoneCallresetInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authValidatePhoneCallresetInfoDto.writeToParcel(parcel, i);
        }
    }

    public AuthValidatePhoneInfoResponseDto(AuthValidatePhoneCallresetInfoDto authValidatePhoneCallresetInfoDto) {
        this.callreset = authValidatePhoneCallresetInfoDto;
    }

    public /* synthetic */ AuthValidatePhoneInfoResponseDto(AuthValidatePhoneCallresetInfoDto authValidatePhoneCallresetInfoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : authValidatePhoneCallresetInfoDto);
    }
}
