package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationLinkWithVerifyPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationLinkWithVerifyPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationLinkWithVerifyPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AccountVerificationLinkWithVerifyPlatformDto> CREATOR;

    @pmi0("mobile")
    public static final AccountVerificationLinkWithVerifyPlatformDto MOBILE;

    @pmi0("web")
    public static final AccountVerificationLinkWithVerifyPlatformDto WEB;
    private final String value;

    /* compiled from: AccountVerificationLinkWithVerifyPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationLinkWithVerifyPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationLinkWithVerifyPlatformDto createFromParcel(Parcel parcel) {
            return AccountVerificationLinkWithVerifyPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationLinkWithVerifyPlatformDto[] newArray(int i) {
            return new AccountVerificationLinkWithVerifyPlatformDto[i];
        }
    }

    static {
        AccountVerificationLinkWithVerifyPlatformDto accountVerificationLinkWithVerifyPlatformDto = new AccountVerificationLinkWithVerifyPlatformDto("MOBILE", 0, "mobile");
        MOBILE = accountVerificationLinkWithVerifyPlatformDto;
        AccountVerificationLinkWithVerifyPlatformDto accountVerificationLinkWithVerifyPlatformDto2 = new AccountVerificationLinkWithVerifyPlatformDto("WEB", 1, "web");
        WEB = accountVerificationLinkWithVerifyPlatformDto2;
        AccountVerificationLinkWithVerifyPlatformDto[] accountVerificationLinkWithVerifyPlatformDtoArr = {accountVerificationLinkWithVerifyPlatformDto, accountVerificationLinkWithVerifyPlatformDto2};
        $VALUES = accountVerificationLinkWithVerifyPlatformDtoArr;
        $ENTRIES = new asp(accountVerificationLinkWithVerifyPlatformDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationLinkWithVerifyPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationLinkWithVerifyPlatformDto valueOf(String str) {
        return (AccountVerificationLinkWithVerifyPlatformDto) Enum.valueOf(AccountVerificationLinkWithVerifyPlatformDto.class, str);
    }

    public static AccountVerificationLinkWithVerifyPlatformDto[] values() {
        return (AccountVerificationLinkWithVerifyPlatformDto[]) $VALUES.clone();
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
