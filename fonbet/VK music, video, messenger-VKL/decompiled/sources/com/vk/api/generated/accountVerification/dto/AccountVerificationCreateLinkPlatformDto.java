package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationCreateLinkPlatformDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationCreateLinkPlatformDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationCreateLinkPlatformDto[] $VALUES;
    public static final Parcelable.Creator<AccountVerificationCreateLinkPlatformDto> CREATOR;

    @pmi0("mobile")
    public static final AccountVerificationCreateLinkPlatformDto MOBILE;

    @pmi0("web")
    public static final AccountVerificationCreateLinkPlatformDto WEB;
    private final String value;

    /* compiled from: AccountVerificationCreateLinkPlatformDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationCreateLinkPlatformDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationCreateLinkPlatformDto createFromParcel(Parcel parcel) {
            return AccountVerificationCreateLinkPlatformDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationCreateLinkPlatformDto[] newArray(int i) {
            return new AccountVerificationCreateLinkPlatformDto[i];
        }
    }

    static {
        AccountVerificationCreateLinkPlatformDto accountVerificationCreateLinkPlatformDto = new AccountVerificationCreateLinkPlatformDto("MOBILE", 0, "mobile");
        MOBILE = accountVerificationCreateLinkPlatformDto;
        AccountVerificationCreateLinkPlatformDto accountVerificationCreateLinkPlatformDto2 = new AccountVerificationCreateLinkPlatformDto("WEB", 1, "web");
        WEB = accountVerificationCreateLinkPlatformDto2;
        AccountVerificationCreateLinkPlatformDto[] accountVerificationCreateLinkPlatformDtoArr = {accountVerificationCreateLinkPlatformDto, accountVerificationCreateLinkPlatformDto2};
        $VALUES = accountVerificationCreateLinkPlatformDtoArr;
        $ENTRIES = new asp(accountVerificationCreateLinkPlatformDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationCreateLinkPlatformDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationCreateLinkPlatformDto valueOf(String str) {
        return (AccountVerificationCreateLinkPlatformDto) Enum.valueOf(AccountVerificationCreateLinkPlatformDto.class, str);
    }

    public static AccountVerificationCreateLinkPlatformDto[] values() {
        return (AccountVerificationCreateLinkPlatformDto[]) $VALUES.clone();
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
