package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationGetUserInfoProviderDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationGetUserInfoProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationGetUserInfoProviderDto[] $VALUES;

    @pmi0("alfa_id")
    public static final AccountVerificationGetUserInfoProviderDto ALFA_ID;
    public static final Parcelable.Creator<AccountVerificationGetUserInfoProviderDto> CREATOR;

    @pmi0("sber_id")
    public static final AccountVerificationGetUserInfoProviderDto SBER_ID;

    @pmi0("tinkoff_id")
    public static final AccountVerificationGetUserInfoProviderDto TINKOFF_ID;

    @pmi0("vk_pay")
    public static final AccountVerificationGetUserInfoProviderDto VK_PAY;

    @pmi0("vtb_id")
    public static final AccountVerificationGetUserInfoProviderDto VTB_ID;
    private final String value;

    /* compiled from: AccountVerificationGetUserInfoProviderDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationGetUserInfoProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetUserInfoProviderDto createFromParcel(Parcel parcel) {
            return AccountVerificationGetUserInfoProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationGetUserInfoProviderDto[] newArray(int i) {
            return new AccountVerificationGetUserInfoProviderDto[i];
        }
    }

    static {
        AccountVerificationGetUserInfoProviderDto accountVerificationGetUserInfoProviderDto = new AccountVerificationGetUserInfoProviderDto("ALFA_ID", 0, "alfa_id");
        ALFA_ID = accountVerificationGetUserInfoProviderDto;
        AccountVerificationGetUserInfoProviderDto accountVerificationGetUserInfoProviderDto2 = new AccountVerificationGetUserInfoProviderDto("SBER_ID", 1, "sber_id");
        SBER_ID = accountVerificationGetUserInfoProviderDto2;
        AccountVerificationGetUserInfoProviderDto accountVerificationGetUserInfoProviderDto3 = new AccountVerificationGetUserInfoProviderDto("TINKOFF_ID", 2, "tinkoff_id");
        TINKOFF_ID = accountVerificationGetUserInfoProviderDto3;
        AccountVerificationGetUserInfoProviderDto accountVerificationGetUserInfoProviderDto4 = new AccountVerificationGetUserInfoProviderDto("VK_PAY", 3, "vk_pay");
        VK_PAY = accountVerificationGetUserInfoProviderDto4;
        AccountVerificationGetUserInfoProviderDto accountVerificationGetUserInfoProviderDto5 = new AccountVerificationGetUserInfoProviderDto("VTB_ID", 4, "vtb_id");
        VTB_ID = accountVerificationGetUserInfoProviderDto5;
        AccountVerificationGetUserInfoProviderDto[] accountVerificationGetUserInfoProviderDtoArr = {accountVerificationGetUserInfoProviderDto, accountVerificationGetUserInfoProviderDto2, accountVerificationGetUserInfoProviderDto3, accountVerificationGetUserInfoProviderDto4, accountVerificationGetUserInfoProviderDto5};
        $VALUES = accountVerificationGetUserInfoProviderDtoArr;
        $ENTRIES = new asp(accountVerificationGetUserInfoProviderDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationGetUserInfoProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationGetUserInfoProviderDto valueOf(String str) {
        return (AccountVerificationGetUserInfoProviderDto) Enum.valueOf(AccountVerificationGetUserInfoProviderDto.class, str);
    }

    public static AccountVerificationGetUserInfoProviderDto[] values() {
        return (AccountVerificationGetUserInfoProviderDto[]) $VALUES.clone();
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
