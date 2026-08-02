package com.vk.api.generated.auth.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.phone.dto.PhoneValidationInfoDto;
import com.vk.api.generated.profile.dto.ProfileExtensionInfoDto;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AuthRefreshTokenErrorDto.kt */
/* loaded from: classes14.dex */
public final class AuthRefreshTokenErrorDto implements Parcelable {
    public static final Parcelable.Creator<AuthRefreshTokenErrorDto> CREATOR = new a();

    @pmi0("ban_info")
    private final AuthBanInfoDto banInfo;

    @pmi0("code")
    private final int code;

    @pmi0("description")
    private final String description;

    @pmi0("index")
    private final int index;

    @pmi0("phone_validation_info")
    private final PhoneValidationInfoDto phoneValidationInfo;

    @pmi0("profile_extension_info")
    private final ProfileExtensionInfoDto profileExtensionInfo;

    /* compiled from: AuthRefreshTokenErrorDto.kt */
    public static final class a implements Parcelable.Creator<AuthRefreshTokenErrorDto> {
        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTokenErrorDto createFromParcel(Parcel parcel) {
            return new AuthRefreshTokenErrorDto(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : AuthBanInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfileExtensionInfoDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PhoneValidationInfoDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthRefreshTokenErrorDto[] newArray(int i) {
            return new AuthRefreshTokenErrorDto[i];
        }
    }

    public AuthRefreshTokenErrorDto(int i, int i2, String str, AuthBanInfoDto authBanInfoDto, ProfileExtensionInfoDto profileExtensionInfoDto, PhoneValidationInfoDto phoneValidationInfoDto) {
        this.index = i;
        this.code = i2;
        this.description = str;
        this.banInfo = authBanInfoDto;
        this.profileExtensionInfo = profileExtensionInfoDto;
        this.phoneValidationInfo = phoneValidationInfoDto;
    }

    public final int d() {
        return this.code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.index;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthRefreshTokenErrorDto)) {
            return false;
        }
        AuthRefreshTokenErrorDto authRefreshTokenErrorDto = (AuthRefreshTokenErrorDto) obj;
        return this.index == authRefreshTokenErrorDto.index && this.code == authRefreshTokenErrorDto.code && epx.f(this.description, authRefreshTokenErrorDto.description) && epx.f(this.banInfo, authRefreshTokenErrorDto.banInfo) && epx.f(this.profileExtensionInfo, authRefreshTokenErrorDto.profileExtensionInfo) && epx.f(this.phoneValidationInfo, authRefreshTokenErrorDto.phoneValidationInfo);
    }

    public final PhoneValidationInfoDto f() {
        return this.phoneValidationInfo;
    }

    public final ProfileExtensionInfoDto g() {
        return this.profileExtensionInfo;
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.code, Integer.hashCode(this.index) * 31, 31), 31, this.description);
        AuthBanInfoDto authBanInfoDto = this.banInfo;
        int hashCode = (a2 + (authBanInfoDto == null ? 0 : authBanInfoDto.hashCode())) * 31;
        ProfileExtensionInfoDto profileExtensionInfoDto = this.profileExtensionInfo;
        int hashCode2 = (hashCode + (profileExtensionInfoDto == null ? 0 : profileExtensionInfoDto.hashCode())) * 31;
        PhoneValidationInfoDto phoneValidationInfoDto = this.phoneValidationInfo;
        return hashCode2 + (phoneValidationInfoDto != null ? phoneValidationInfoDto.hashCode() : 0);
    }

    public final String toString() {
        return "AuthRefreshTokenErrorDto(index=" + this.index + ", code=" + this.code + ", description=" + this.description + ", banInfo=" + this.banInfo + ", profileExtensionInfo=" + this.profileExtensionInfo + ", phoneValidationInfo=" + this.phoneValidationInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeInt(this.code);
        parcel.writeString(this.description);
        AuthBanInfoDto authBanInfoDto = this.banInfo;
        if (authBanInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authBanInfoDto.writeToParcel(parcel, i);
        }
        ProfileExtensionInfoDto profileExtensionInfoDto = this.profileExtensionInfo;
        if (profileExtensionInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profileExtensionInfoDto.writeToParcel(parcel, i);
        }
        PhoneValidationInfoDto phoneValidationInfoDto = this.phoneValidationInfo;
        if (phoneValidationInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            phoneValidationInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AuthRefreshTokenErrorDto(int i, int i2, String str, AuthBanInfoDto authBanInfoDto, ProfileExtensionInfoDto profileExtensionInfoDto, PhoneValidationInfoDto phoneValidationInfoDto, int i3, zcl zclVar) {
        this(i, i2, str, (i3 & 8) != 0 ? null : authBanInfoDto, (i3 & 16) != 0 ? null : profileExtensionInfoDto, (i3 & 32) != 0 ? null : phoneValidationInfoDto);
    }
}
