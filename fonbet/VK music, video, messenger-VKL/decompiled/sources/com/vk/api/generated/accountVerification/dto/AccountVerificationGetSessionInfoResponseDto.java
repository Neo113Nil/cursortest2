package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.O6;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: AccountVerificationGetSessionInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationGetSessionInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountVerificationGetSessionInfoResponseDto> CREATOR = new a();

    @pmi0(O6.e1)
    private final String sid;

    @pmi0("user_type")
    private final UserTypeDto userType;

    @pmi0("verification_user")
    private final AccountVerificationVerificationUserInfoDto verificationUser;

    @pmi0("vk_user_diff")
    private final AccountVerificationVerificationUserInfoDto vkUserDiff;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AccountVerificationGetSessionInfoResponseDto.kt */
    public static final class UserTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ UserTypeDto[] $VALUES;
        public static final Parcelable.Creator<UserTypeDto> CREATOR;

        @pmi0("edu")
        public static final UserTypeDto EDU;

        @pmi0("master")
        public static final UserTypeDto MASTER;
        private final String value;

        /* compiled from: AccountVerificationGetSessionInfoResponseDto.kt */
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

    /* compiled from: AccountVerificationGetSessionInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationGetSessionInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetSessionInfoResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Parcelable.Creator<AccountVerificationVerificationUserInfoDto> creator = AccountVerificationVerificationUserInfoDto.CREATOR;
            return new AccountVerificationGetSessionInfoResponseDto(readString, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? UserTypeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetSessionInfoResponseDto[] newArray(int i) {
            return new AccountVerificationGetSessionInfoResponseDto[i];
        }
    }

    public AccountVerificationGetSessionInfoResponseDto(String str, AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto, AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto2, UserTypeDto userTypeDto) {
        this.sid = str;
        this.verificationUser = accountVerificationVerificationUserInfoDto;
        this.vkUserDiff = accountVerificationVerificationUserInfoDto2;
        this.userType = userTypeDto;
    }

    public final String d() {
        return this.sid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AccountVerificationVerificationUserInfoDto e() {
        return this.verificationUser;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountVerificationGetSessionInfoResponseDto)) {
            return false;
        }
        AccountVerificationGetSessionInfoResponseDto accountVerificationGetSessionInfoResponseDto = (AccountVerificationGetSessionInfoResponseDto) obj;
        return epx.f(this.sid, accountVerificationGetSessionInfoResponseDto.sid) && epx.f(this.verificationUser, accountVerificationGetSessionInfoResponseDto.verificationUser) && epx.f(this.vkUserDiff, accountVerificationGetSessionInfoResponseDto.vkUserDiff) && this.userType == accountVerificationGetSessionInfoResponseDto.userType;
    }

    public final AccountVerificationVerificationUserInfoDto f() {
        return this.vkUserDiff;
    }

    public final int hashCode() {
        int hashCode = (this.verificationUser.hashCode() + (this.sid.hashCode() * 31)) * 31;
        AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto = this.vkUserDiff;
        int hashCode2 = (hashCode + (accountVerificationVerificationUserInfoDto == null ? 0 : accountVerificationVerificationUserInfoDto.hashCode())) * 31;
        UserTypeDto userTypeDto = this.userType;
        return hashCode2 + (userTypeDto != null ? userTypeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountVerificationGetSessionInfoResponseDto(sid=" + this.sid + ", verificationUser=" + this.verificationUser + ", vkUserDiff=" + this.vkUserDiff + ", userType=" + this.userType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sid);
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
    }

    public /* synthetic */ AccountVerificationGetSessionInfoResponseDto(String str, AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto, AccountVerificationVerificationUserInfoDto accountVerificationVerificationUserInfoDto2, UserTypeDto userTypeDto, int i, zcl zclVar) {
        this(str, accountVerificationVerificationUserInfoDto, (i & 4) != 0 ? null : accountVerificationVerificationUserInfoDto2, (i & 8) != 0 ? null : userTypeDto);
    }
}
