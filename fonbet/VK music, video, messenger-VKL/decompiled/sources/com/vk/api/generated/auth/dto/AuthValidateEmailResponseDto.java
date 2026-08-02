package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthValidateEmailResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidateEmailResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidateEmailResponseDto> CREATOR = new a();

    @pmi0("code_length")
    private final Integer codeLength;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("timeout")
    private final Integer timeout;

    /* compiled from: AuthValidateEmailResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidateEmailResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidateEmailResponseDto createFromParcel(Parcel parcel) {
            return new AuthValidateEmailResponseDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidateEmailResponseDto[] newArray(int i) {
            return new AuthValidateEmailResponseDto[i];
        }
    }

    public AuthValidateEmailResponseDto(String str, Integer num, Integer num2) {
        this.sid = str;
        this.codeLength = num;
        this.timeout = num2;
    }

    public final Integer d() {
        return this.codeLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.sid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidateEmailResponseDto)) {
            return false;
        }
        AuthValidateEmailResponseDto authValidateEmailResponseDto = (AuthValidateEmailResponseDto) obj;
        return epx.f(this.sid, authValidateEmailResponseDto.sid) && epx.f(this.codeLength, authValidateEmailResponseDto.codeLength) && epx.f(this.timeout, authValidateEmailResponseDto.timeout);
    }

    public final Integer f() {
        return this.timeout;
    }

    public final int hashCode() {
        int hashCode = this.sid.hashCode() * 31;
        Integer num = this.codeLength;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeout;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidateEmailResponseDto(sid=");
        sb.append(this.sid);
        sb.append(", codeLength=");
        sb.append(this.codeLength);
        sb.append(", timeout=");
        return uqi.b(sb, this.timeout, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        Integer num = this.codeLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.timeout;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public /* synthetic */ AuthValidateEmailResponseDto(String str, Integer num, Integer num2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }
}
