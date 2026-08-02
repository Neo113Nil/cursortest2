package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationGetUserInfoPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationGetUserInfoPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationGetUserInfoPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AccountVerificationGetUserInfoPlatformDto> CREATOR;

    @pmi0("mobile")
    public static final AccountVerificationGetUserInfoPlatformDto MOBILE;

    @pmi0("web")
    public static final AccountVerificationGetUserInfoPlatformDto WEB;
    private final String value;

    /* compiled from: AccountVerificationGetUserInfoPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationGetUserInfoPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetUserInfoPlatformDto createFromParcel(Parcel parcel) {
            return AccountVerificationGetUserInfoPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetUserInfoPlatformDto[] newArray(int i) {
            return new AccountVerificationGetUserInfoPlatformDto[i];
        }
    }

    static {
        AccountVerificationGetUserInfoPlatformDto accountVerificationGetUserInfoPlatformDto = new AccountVerificationGetUserInfoPlatformDto("MOBILE", 0, "mobile");
        MOBILE = accountVerificationGetUserInfoPlatformDto;
        AccountVerificationGetUserInfoPlatformDto accountVerificationGetUserInfoPlatformDto2 = new AccountVerificationGetUserInfoPlatformDto("WEB", 1, "web");
        WEB = accountVerificationGetUserInfoPlatformDto2;
        AccountVerificationGetUserInfoPlatformDto[] accountVerificationGetUserInfoPlatformDtoArr = {accountVerificationGetUserInfoPlatformDto, accountVerificationGetUserInfoPlatformDto2};
        $VALUES = accountVerificationGetUserInfoPlatformDtoArr;
        $ENTRIES = new asp(accountVerificationGetUserInfoPlatformDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationGetUserInfoPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationGetUserInfoPlatformDto valueOf(String str) {
        return (AccountVerificationGetUserInfoPlatformDto) Enum.valueOf(AccountVerificationGetUserInfoPlatformDto.class, str);
    }

    public static AccountVerificationGetUserInfoPlatformDto[] values() {
        return (AccountVerificationGetUserInfoPlatformDto[]) $VALUES.clone();
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
