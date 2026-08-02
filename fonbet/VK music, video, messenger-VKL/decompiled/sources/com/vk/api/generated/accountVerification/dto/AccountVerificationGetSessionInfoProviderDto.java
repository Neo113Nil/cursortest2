package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationGetSessionInfoProviderDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationGetSessionInfoProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationGetSessionInfoProviderDto[] $VALUES;

    @pmi0("alfa_id")
    public static final AccountVerificationGetSessionInfoProviderDto ALFA_ID;
    public static final Parcelable.Creator<AccountVerificationGetSessionInfoProviderDto> CREATOR;

    @pmi0("sber_id")
    public static final AccountVerificationGetSessionInfoProviderDto SBER_ID;

    @pmi0("tinkoff_id")
    public static final AccountVerificationGetSessionInfoProviderDto TINKOFF_ID;

    @pmi0("vtb_id")
    public static final AccountVerificationGetSessionInfoProviderDto VTB_ID;
    private final String value;

    /* compiled from: AccountVerificationGetSessionInfoProviderDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationGetSessionInfoProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetSessionInfoProviderDto createFromParcel(Parcel parcel) {
            return AccountVerificationGetSessionInfoProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetSessionInfoProviderDto[] newArray(int i) {
            return new AccountVerificationGetSessionInfoProviderDto[i];
        }
    }

    static {
        AccountVerificationGetSessionInfoProviderDto accountVerificationGetSessionInfoProviderDto = new AccountVerificationGetSessionInfoProviderDto("ALFA_ID", 0, "alfa_id");
        ALFA_ID = accountVerificationGetSessionInfoProviderDto;
        AccountVerificationGetSessionInfoProviderDto accountVerificationGetSessionInfoProviderDto2 = new AccountVerificationGetSessionInfoProviderDto("SBER_ID", 1, "sber_id");
        SBER_ID = accountVerificationGetSessionInfoProviderDto2;
        AccountVerificationGetSessionInfoProviderDto accountVerificationGetSessionInfoProviderDto3 = new AccountVerificationGetSessionInfoProviderDto("TINKOFF_ID", 2, "tinkoff_id");
        TINKOFF_ID = accountVerificationGetSessionInfoProviderDto3;
        AccountVerificationGetSessionInfoProviderDto accountVerificationGetSessionInfoProviderDto4 = new AccountVerificationGetSessionInfoProviderDto("VTB_ID", 3, "vtb_id");
        VTB_ID = accountVerificationGetSessionInfoProviderDto4;
        AccountVerificationGetSessionInfoProviderDto[] accountVerificationGetSessionInfoProviderDtoArr = {accountVerificationGetSessionInfoProviderDto, accountVerificationGetSessionInfoProviderDto2, accountVerificationGetSessionInfoProviderDto3, accountVerificationGetSessionInfoProviderDto4};
        $VALUES = accountVerificationGetSessionInfoProviderDtoArr;
        $ENTRIES = new asp(accountVerificationGetSessionInfoProviderDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationGetSessionInfoProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationGetSessionInfoProviderDto valueOf(String str) {
        return (AccountVerificationGetSessionInfoProviderDto) Enum.valueOf(AccountVerificationGetSessionInfoProviderDto.class, str);
    }

    public static AccountVerificationGetSessionInfoProviderDto[] values() {
        return (AccountVerificationGetSessionInfoProviderDto[]) $VALUES.clone();
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
