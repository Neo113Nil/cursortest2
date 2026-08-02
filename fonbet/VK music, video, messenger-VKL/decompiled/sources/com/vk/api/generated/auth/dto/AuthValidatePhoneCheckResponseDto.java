package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import com.ironsource.X3;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthValidatePhoneCheckResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneCheckResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidatePhoneCheckResponseDto> CREATOR = new a();

    @pmi0(X3.a.t)
    private final Integer mode;

    @pmi0("phone")
    private final String phone;

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("status")
    private final int status;

    /* compiled from: AuthValidatePhoneCheckResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneCheckResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCheckResponseDto createFromParcel(Parcel parcel) {
            return new AuthValidatePhoneCheckResponseDto(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCheckResponseDto[] newArray(int i) {
            return new AuthValidatePhoneCheckResponseDto[i];
        }
    }

    public AuthValidatePhoneCheckResponseDto(int i, String str, String str2, Integer num) {
        this.status = i;
        this.sid = str;
        this.phone = str2;
        this.mode = num;
    }

    public final String d() {
        return this.phone;
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
        if (!(obj instanceof AuthValidatePhoneCheckResponseDto)) {
            return false;
        }
        AuthValidatePhoneCheckResponseDto authValidatePhoneCheckResponseDto = (AuthValidatePhoneCheckResponseDto) obj;
        return this.status == authValidatePhoneCheckResponseDto.status && epx.f(this.sid, authValidatePhoneCheckResponseDto.sid) && epx.f(this.phone, authValidatePhoneCheckResponseDto.phone) && epx.f(this.mode, authValidatePhoneCheckResponseDto.mode);
    }

    public final int f() {
        return this.status;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.status) * 31;
        String str = this.sid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.mode;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidatePhoneCheckResponseDto(status=");
        sb.append(this.status);
        sb.append(", sid=");
        sb.append(this.sid);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", mode=");
        return uqi.b(sb, this.mode, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status);
        parcel.writeString(this.sid);
        parcel.writeString(this.phone);
        Integer num = this.mode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AuthValidatePhoneCheckResponseDto(int i, String str, String str2, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num);
    }
}
