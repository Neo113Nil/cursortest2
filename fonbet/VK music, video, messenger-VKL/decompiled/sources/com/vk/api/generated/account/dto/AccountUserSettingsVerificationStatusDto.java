package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountUserSettingsVerificationStatusDto.kt */
/* loaded from: classes14.dex */
public final class AccountUserSettingsVerificationStatusDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountUserSettingsVerificationStatusDto[] $VALUES;
    public static final Parcelable.Creator<AccountUserSettingsVerificationStatusDto> CREATOR;

    @pmi0("unverified")
    public static final AccountUserSettingsVerificationStatusDto UNVERIFIED;

    @pmi0("verified")
    public static final AccountUserSettingsVerificationStatusDto VERIFIED;

    @pmi0("verified_change_data")
    public static final AccountUserSettingsVerificationStatusDto VERIFIED_CHANGE_DATA;
    private final String value;

    /* compiled from: AccountUserSettingsVerificationStatusDto.kt */
    public static final class a implements Parcelable.Creator<AccountUserSettingsVerificationStatusDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsVerificationStatusDto createFromParcel(Parcel parcel) {
            return AccountUserSettingsVerificationStatusDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsVerificationStatusDto[] newArray(int i) {
            return new AccountUserSettingsVerificationStatusDto[i];
        }
    }

    static {
        AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto = new AccountUserSettingsVerificationStatusDto("VERIFIED", 0, "verified");
        VERIFIED = accountUserSettingsVerificationStatusDto;
        AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto2 = new AccountUserSettingsVerificationStatusDto("VERIFIED_CHANGE_DATA", 1, "verified_change_data");
        VERIFIED_CHANGE_DATA = accountUserSettingsVerificationStatusDto2;
        AccountUserSettingsVerificationStatusDto accountUserSettingsVerificationStatusDto3 = new AccountUserSettingsVerificationStatusDto("UNVERIFIED", 2, "unverified");
        UNVERIFIED = accountUserSettingsVerificationStatusDto3;
        AccountUserSettingsVerificationStatusDto[] accountUserSettingsVerificationStatusDtoArr = {accountUserSettingsVerificationStatusDto, accountUserSettingsVerificationStatusDto2, accountUserSettingsVerificationStatusDto3};
        $VALUES = accountUserSettingsVerificationStatusDtoArr;
        $ENTRIES = new asp(accountUserSettingsVerificationStatusDtoArr);
        CREATOR = new a();
    }

    private AccountUserSettingsVerificationStatusDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountUserSettingsVerificationStatusDto valueOf(String str) {
        return (AccountUserSettingsVerificationStatusDto) Enum.valueOf(AccountUserSettingsVerificationStatusDto.class, str);
    }

    public static AccountUserSettingsVerificationStatusDto[] values() {
        return (AccountUserSettingsVerificationStatusDto[]) $VALUES.clone();
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
