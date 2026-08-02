package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthGetUserInfoByPhoneResponseDto.kt */
/* loaded from: classes14.dex */
public final class AuthGetUserInfoByPhoneResponseDto implements Parcelable {
    public static final Parcelable.Creator<AuthGetUserInfoByPhoneResponseDto> CREATOR = new a();

    @pmi0("flow_type")
    private final String flowType;

    @pmi0("hidden_phone_number")
    private final String hiddenPhoneNumber;

    @pmi0("is_old_service_phone_number")
    private final Boolean isOldServicePhoneNumber;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    private final AuthUserByPhoneDto profile;

    @pmi0(O6.e1)
    private final String sid;

    /* compiled from: AuthGetUserInfoByPhoneResponseDto.kt */
    public static final class a implements Parcelable.Creator<AuthGetUserInfoByPhoneResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthGetUserInfoByPhoneResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            AuthUserByPhoneDto createFromParcel = parcel.readInt() == 0 ? null : AuthUserByPhoneDto.CREATOR.createFromParcel(parcel);
            Boolean bool = null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AuthGetUserInfoByPhoneResponseDto(readString, readString2, createFromParcel, readString3, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthGetUserInfoByPhoneResponseDto[] newArray(int i) {
            return new AuthGetUserInfoByPhoneResponseDto[i];
        }
    }

    public AuthGetUserInfoByPhoneResponseDto(String str, String str2, AuthUserByPhoneDto authUserByPhoneDto, String str3, Boolean bool) {
        this.sid = str;
        this.flowType = str2;
        this.profile = authUserByPhoneDto;
        this.hiddenPhoneNumber = str3;
        this.isOldServicePhoneNumber = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthGetUserInfoByPhoneResponseDto)) {
            return false;
        }
        AuthGetUserInfoByPhoneResponseDto authGetUserInfoByPhoneResponseDto = (AuthGetUserInfoByPhoneResponseDto) obj;
        return epx.f(this.sid, authGetUserInfoByPhoneResponseDto.sid) && epx.f(this.flowType, authGetUserInfoByPhoneResponseDto.flowType) && epx.f(this.profile, authGetUserInfoByPhoneResponseDto.profile) && epx.f(this.hiddenPhoneNumber, authGetUserInfoByPhoneResponseDto.hiddenPhoneNumber) && epx.f(this.isOldServicePhoneNumber, authGetUserInfoByPhoneResponseDto.isOldServicePhoneNumber);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.sid.hashCode() * 31, 31, this.flowType);
        AuthUserByPhoneDto authUserByPhoneDto = this.profile;
        int hashCode = (a2 + (authUserByPhoneDto == null ? 0 : authUserByPhoneDto.hashCode())) * 31;
        String str = this.hiddenPhoneNumber;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isOldServicePhoneNumber;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthGetUserInfoByPhoneResponseDto(sid=");
        sb.append(this.sid);
        sb.append(", flowType=");
        sb.append(this.flowType);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", hiddenPhoneNumber=");
        sb.append(this.hiddenPhoneNumber);
        sb.append(", isOldServicePhoneNumber=");
        return tn.a(sb, this.isOldServicePhoneNumber, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
        parcel.writeString(this.flowType);
        AuthUserByPhoneDto authUserByPhoneDto = this.profile;
        if (authUserByPhoneDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authUserByPhoneDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.hiddenPhoneNumber);
        Boolean bool = this.isOldServicePhoneNumber;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AuthGetUserInfoByPhoneResponseDto(String str, String str2, AuthUserByPhoneDto authUserByPhoneDto, String str3, Boolean bool, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : authUserByPhoneDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }
}
