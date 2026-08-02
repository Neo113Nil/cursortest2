package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationGetSessionInfoPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationGetSessionInfoPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationGetSessionInfoPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AccountVerificationGetSessionInfoPlatformDto> CREATOR;

    @pmi0("mobile")
    public static final AccountVerificationGetSessionInfoPlatformDto MOBILE;

    @pmi0("mobile_app2app")
    public static final AccountVerificationGetSessionInfoPlatformDto MOBILE_APP2APP;

    @pmi0("web")
    public static final AccountVerificationGetSessionInfoPlatformDto WEB;
    private final String value;

    /* compiled from: AccountVerificationGetSessionInfoPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationGetSessionInfoPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetSessionInfoPlatformDto createFromParcel(Parcel parcel) {
            return AccountVerificationGetSessionInfoPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetSessionInfoPlatformDto[] newArray(int i) {
            return new AccountVerificationGetSessionInfoPlatformDto[i];
        }
    }

    static {
        AccountVerificationGetSessionInfoPlatformDto accountVerificationGetSessionInfoPlatformDto = new AccountVerificationGetSessionInfoPlatformDto("MOBILE", 0, "mobile");
        MOBILE = accountVerificationGetSessionInfoPlatformDto;
        AccountVerificationGetSessionInfoPlatformDto accountVerificationGetSessionInfoPlatformDto2 = new AccountVerificationGetSessionInfoPlatformDto("MOBILE_APP2APP", 1, "mobile_app2app");
        MOBILE_APP2APP = accountVerificationGetSessionInfoPlatformDto2;
        AccountVerificationGetSessionInfoPlatformDto accountVerificationGetSessionInfoPlatformDto3 = new AccountVerificationGetSessionInfoPlatformDto("WEB", 2, "web");
        WEB = accountVerificationGetSessionInfoPlatformDto3;
        AccountVerificationGetSessionInfoPlatformDto[] accountVerificationGetSessionInfoPlatformDtoArr = {accountVerificationGetSessionInfoPlatformDto, accountVerificationGetSessionInfoPlatformDto2, accountVerificationGetSessionInfoPlatformDto3};
        $VALUES = accountVerificationGetSessionInfoPlatformDtoArr;
        $ENTRIES = new asp(accountVerificationGetSessionInfoPlatformDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationGetSessionInfoPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationGetSessionInfoPlatformDto valueOf(String str) {
        return (AccountVerificationGetSessionInfoPlatformDto) Enum.valueOf(AccountVerificationGetSessionInfoPlatformDto.class, str);
    }

    public static AccountVerificationGetSessionInfoPlatformDto[] values() {
        return (AccountVerificationGetSessionInfoPlatformDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
