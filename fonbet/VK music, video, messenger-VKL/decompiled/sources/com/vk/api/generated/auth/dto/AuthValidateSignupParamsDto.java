package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AuthValidateSignupParamsDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateSignupParamsDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateSignupParamsDto> CREATOR = new a();

    @pmi0("birth_date_max")
    private final String birthDateMax;

    @pmi0("password_min_length")
    private final Integer passwordMinLength;

    /* compiled from: AuthValidateSignupParamsDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateSignupParamsDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateSignupParamsDto createFromParcel(Parcel parcel) {
            return new AuthValidateSignupParamsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateSignupParamsDto[] newArray(int i) {
            return new AuthValidateSignupParamsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthValidateSignupParamsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Integer d() {
        return this.passwordMinLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidateSignupParamsDto)) {
            return false;
        }
        AuthValidateSignupParamsDto authValidateSignupParamsDto = (AuthValidateSignupParamsDto) obj;
        return epx.f(this.passwordMinLength, authValidateSignupParamsDto.passwordMinLength) && epx.f(this.birthDateMax, authValidateSignupParamsDto.birthDateMax);
    }

    public final int hashCode() {
        Integer num = this.passwordMinLength;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.birthDateMax;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidateSignupParamsDto(passwordMinLength=");
        sb.append(this.passwordMinLength);
        sb.append(", birthDateMax=");
        return ho8.a(sb, this.birthDateMax, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.passwordMinLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.birthDateMax);
    }

    public AuthValidateSignupParamsDto(Integer num, String str) {
        this.passwordMinLength = num;
        this.birthDateMax = str;
    }

    public /* synthetic */ AuthValidateSignupParamsDto(Integer num, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str);
    }
}
