package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountVerificationGetUserInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationGetUserInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountVerificationGetUserInfoResponseDto> CREATOR = new a();

    @pmi0("cua_hash")
    private final String cuaHash;

    @pmi0("user_type")
    private final UserTypeDto userType;

    @pmi0("verification_user")
    private final AccountVerificationVerificationUserInfoDto verificationUser;

    @pmi0("vk_pay_verify_hash")
    private final String vkPayVerifyHash;

    @pmi0("vk_user_diff")
    private final AccountVerificationVerificationUserInfoDto vkUserDiff;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountVerificationGetUserInfoResponseDto.kt */
    public static final class UserTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserTypeDto[] $VALUES;
        public static final Parcelable.Creator<UserTypeDto> CREATOR;

        @pmi0("edu")
        public static final UserTypeDto EDU;

        @pmi0("master")
        public static final UserTypeDto MASTER;
        private final String value;

        /* compiled from: AccountVerificationGetUserInfoResponseDto.kt */
        public static final class a implements Parcelable.Creator<UserTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final UserTypeDto createFromParcel(Parcel parcel) {
                return UserTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final UserTypeDto[] newArray(int i) {
                return new UserTypeDto[i];
            }
        }

        static {
            UserTypeDto userTypeDto = new UserTypeDto("EDU", 0, "edu");
            EDU = userTypeDto;
            UserTypeDto userTypeDto2 = new UserTypeDto("MASTER", 1, "master");
            MASTER = userTypeDto2;
            UserTypeDto[] userTypeDtoArr = {userTypeDto, userTypeDto2};
            $VALUES = userTypeDtoArr;
            $ENTRIES = new asp(userTypeDtoArr);
            CREATOR = new a();
        }

        private UserTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static UserTypeDto valueOf(String str) {
            return (UserTypeDto) Enum.valueOf(UserTypeDto.class, str);
        }

        public static UserTypeDto[] values() {
            return (UserTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: AccountVerificationGetUserInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationGetUserInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetUserInfoResponseDto createFromParcel(Parcel parcel) {
            Parcelable.Creator<AccountVerificationVerificationUserInfoDto> creator = AccountVerificationVerificationUserInfoDto.CREATOR;
            return new AccountVerificationGetUserInfoResponseDto(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? UserTypeDto.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetUserInfoResponseDto[] newArray(int i) {
            return new AccountVerificationGetUserInfoResponseDto[i];
        }
    }

    public AccountVerificationGetUserInfoResponseDto(AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto, AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto2, UserTypeDto userTypeDto, String str, String str2) {
        this.verificationUser = accountVerificationVerificationUserInfoDto;
        this.vkUserDiff = accountVerificationVerificationUserInfoDto2;
        this.userType = userTypeDto;
        this.vkPayVerifyHash = str;
        this.cuaHash = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountVerificationGetUserInfoResponseDto)) {
            return false;
        }
        AccountVerificationGetUserInfoResponseDto accountVerificationGetUserInfoResponseDto = (AccountVerificationGetUserInfoResponseDto) obj;
        return epx.f(this.verificationUser, accountVerificationGetUserInfoResponseDto.verificationUser) && epx.f(this.vkUserDiff, accountVerificationGetUserInfoResponseDto.vkUserDiff) && this.userType == accountVerificationGetUserInfoResponseDto.userType && epx.f(this.vkPayVerifyHash, accountVerificationGetUserInfoResponseDto.vkPayVerifyHash) && epx.f(this.cuaHash, accountVerificationGetUserInfoResponseDto.cuaHash);
    }

    public final int hashCode() {
        int hashCode = this.verificationUser.hashCode() * 31;
        AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto = this.vkUserDiff;
        int hashCode2 = (hashCode + (accountVerificationVerificationUserInfoDto == null ? 0 : accountVerificationVerificationUserInfoDto.hashCode())) * 31;
        UserTypeDto userTypeDto = this.userType;
        int hashCode3 = (hashCode2 + (userTypeDto == null ? 0 : userTypeDto.hashCode())) * 31;
        String str = this.vkPayVerifyHash;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cuaHash;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountVerificationGetUserInfoResponseDto(verificationUser=");
        sb.append(this.verificationUser);
        sb.append(", vkUserDiff=");
        sb.append(this.vkUserDiff);
        sb.append(", userType=");
        sb.append(this.userType);
        sb.append(", vkPayVerifyHash=");
        sb.append(this.vkPayVerifyHash);
        sb.append(", cuaHash=");
        return ho8.a(sb, this.cuaHash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.verificationUser.writeToParcel(parcel, i);
        AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto = this.vkUserDiff;
        if (accountVerificationVerificationUserInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountVerificationVerificationUserInfoDto.writeToParcel(parcel, i);
        }
        UserTypeDto userTypeDto = this.userType;
        if (userTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            userTypeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.vkPayVerifyHash);
        parcel.writeString(this.cuaHash);
    }

    public /* synthetic */ AccountVerificationGetUserInfoResponseDto(AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto, AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto2, UserTypeDto userTypeDto, String str, String str2, int i, zcl zclVar) {
        this(accountVerificationVerificationUserInfoDto, (i & 2) != 0 ? null : accountVerificationVerificationUserInfoDto2, (i & 4) != 0 ? null : userTypeDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }
}
