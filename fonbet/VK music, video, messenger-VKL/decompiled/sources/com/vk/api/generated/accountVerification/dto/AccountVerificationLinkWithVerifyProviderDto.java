package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationLinkWithVerifyProviderDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationLinkWithVerifyProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationLinkWithVerifyProviderDto[] $VALUES;

    @pmi0("alfa_id")
    public static final AccountVerificationLinkWithVerifyProviderDto ALFA_ID;
    public static final Parcelable.Creator<AccountVerificationLinkWithVerifyProviderDto> CREATOR;

    @pmi0("sber_id")
    public static final AccountVerificationLinkWithVerifyProviderDto SBER_ID;

    @pmi0("tinkoff_id")
    public static final AccountVerificationLinkWithVerifyProviderDto TINKOFF_ID;

    @pmi0("vk_pay")
    public static final AccountVerificationLinkWithVerifyProviderDto VK_PAY;

    @pmi0("vtb_id")
    public static final AccountVerificationLinkWithVerifyProviderDto VTB_ID;
    private final String value;

    /* compiled from: AccountVerificationLinkWithVerifyProviderDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationLinkWithVerifyProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationLinkWithVerifyProviderDto createFromParcel(Parcel parcel) {
            return AccountVerificationLinkWithVerifyProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationLinkWithVerifyProviderDto[] newArray(int i) {
            return new AccountVerificationLinkWithVerifyProviderDto[i];
        }
    }

    static {
        AccountVerificationLinkWithVerifyProviderDto accountVerificationLinkWithVerifyProviderDto = new AccountVerificationLinkWithVerifyProviderDto("ALFA_ID", 0, "alfa_id");
        ALFA_ID = accountVerificationLinkWithVerifyProviderDto;
        AccountVerificationLinkWithVerifyProviderDto accountVerificationLinkWithVerifyProviderDto2 = new AccountVerificationLinkWithVerifyProviderDto("SBER_ID", 1, "sber_id");
        SBER_ID = accountVerificationLinkWithVerifyProviderDto2;
        AccountVerificationLinkWithVerifyProviderDto accountVerificationLinkWithVerifyProviderDto3 = new AccountVerificationLinkWithVerifyProviderDto("TINKOFF_ID", 2, "tinkoff_id");
        TINKOFF_ID = accountVerificationLinkWithVerifyProviderDto3;
        AccountVerificationLinkWithVerifyProviderDto accountVerificationLinkWithVerifyProviderDto4 = new AccountVerificationLinkWithVerifyProviderDto("VK_PAY", 3, "vk_pay");
        VK_PAY = accountVerificationLinkWithVerifyProviderDto4;
        AccountVerificationLinkWithVerifyProviderDto accountVerificationLinkWithVerifyProviderDto5 = new AccountVerificationLinkWithVerifyProviderDto("VTB_ID", 4, "vtb_id");
        VTB_ID = accountVerificationLinkWithVerifyProviderDto5;
        AccountVerificationLinkWithVerifyProviderDto[] accountVerificationLinkWithVerifyProviderDtoArr = {accountVerificationLinkWithVerifyProviderDto, accountVerificationLinkWithVerifyProviderDto2, accountVerificationLinkWithVerifyProviderDto3, accountVerificationLinkWithVerifyProviderDto4, accountVerificationLinkWithVerifyProviderDto5};
        $VALUES = accountVerificationLinkWithVerifyProviderDtoArr;
        $ENTRIES = new asp(accountVerificationLinkWithVerifyProviderDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationLinkWithVerifyProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationLinkWithVerifyProviderDto valueOf(String str) {
        return (AccountVerificationLinkWithVerifyProviderDto) Enum.valueOf(AccountVerificationLinkWithVerifyProviderDto.class, str);
    }

    public static AccountVerificationLinkWithVerifyProviderDto[] values() {
        return (AccountVerificationLinkWithVerifyProviderDto[]) $VALUES.clone();
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
