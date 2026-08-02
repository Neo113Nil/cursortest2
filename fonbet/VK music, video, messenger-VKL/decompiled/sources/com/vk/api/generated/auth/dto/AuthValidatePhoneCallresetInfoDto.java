package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AuthValidatePhoneCallresetInfoDto.kt */
/* loaded from: classes14.dex */
public final class AuthValidatePhoneCallresetInfoDto implements Parcelable {
    public static final Parcelable.Creator<AuthValidatePhoneCallresetInfoDto> CREATOR = new a();

    @pmi0("code_length")
    private final Integer codeLength;

    @pmi0("phone_template")
    private final String phoneTemplate;

    @pmi0("waiting_time_ms")
    private final Integer waitingTimeMs;

    /* compiled from: AuthValidatePhoneCallresetInfoDto.kt */
    public static final class a implements Parcelable.Creator<AuthValidatePhoneCallresetInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCallresetInfoDto createFromParcel(Parcel parcel) {
            return new AuthValidatePhoneCallresetInfoDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthValidatePhoneCallresetInfoDto[] newArray(int i) {
            return new AuthValidatePhoneCallresetInfoDto[i];
        }
    }

    public AuthValidatePhoneCallresetInfoDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthValidatePhoneCallresetInfoDto)) {
            return false;
        }
        AuthValidatePhoneCallresetInfoDto authValidatePhoneCallresetInfoDto = (AuthValidatePhoneCallresetInfoDto) obj;
        return epx.f(this.codeLength, authValidatePhoneCallresetInfoDto.codeLength) && epx.f(this.phoneTemplate, authValidatePhoneCallresetInfoDto.phoneTemplate) && epx.f(this.waitingTimeMs, authValidatePhoneCallresetInfoDto.waitingTimeMs);
    }

    public final int hashCode() {
        Integer num = this.codeLength;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.phoneTemplate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.waitingTimeMs;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthValidatePhoneCallresetInfoDto(codeLength=");
        sb.append(this.codeLength);
        sb.append(", phoneTemplate=");
        sb.append(this.phoneTemplate);
        sb.append(", waitingTimeMs=");
        return uqi.b(sb, this.waitingTimeMs, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.codeLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.phoneTemplate);
        Integer num2 = this.waitingTimeMs;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
    }

    public AuthValidatePhoneCallresetInfoDto(Integer num, String str, Integer num2) {
        this.codeLength = num;
        this.phoneTemplate = str;
        this.waitingTimeMs = num2;
    }

    public /* synthetic */ AuthValidatePhoneCallresetInfoDto(Integer num, String str, Integer num2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2);
    }
}
