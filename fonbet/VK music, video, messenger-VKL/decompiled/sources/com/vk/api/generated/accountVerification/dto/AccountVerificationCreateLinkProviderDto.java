package com.vk.api.generated.accountVerification.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountVerificationCreateLinkProviderDto.kt */
/* loaded from: classes14.dex */
public final class AccountVerificationCreateLinkProviderDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountVerificationCreateLinkProviderDto[] $VALUES;

    @pmi0("alfa_id")
    public static final AccountVerificationCreateLinkProviderDto ALFA_ID;
    public static final Parcelable.Creator<AccountVerificationCreateLinkProviderDto> CREATOR;

    @pmi0("sber_id")
    public static final AccountVerificationCreateLinkProviderDto SBER_ID;

    @pmi0("tinkoff_id")
    public static final AccountVerificationCreateLinkProviderDto TINKOFF_ID;

    @pmi0("vtb_id")
    public static final AccountVerificationCreateLinkProviderDto VTB_ID;
    private final String value;

    /* compiled from: AccountVerificationCreateLinkProviderDto.kt */
    public static final class a implements Parcelable.Creator<AccountVerificationCreateLinkProviderDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountVerificationCreateLinkProviderDto createFromParcel(Parcel parcel) {
            return AccountVerificationCreateLinkProviderDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountVerificationCreateLinkProviderDto[] newArray(int i) {
            return new AccountVerificationCreateLinkProviderDto[i];
        }
    }

    static {
        AccountVerificationCreateLinkProviderDto accountVerificationCreateLinkProviderDto = new AccountVerificationCreateLinkProviderDto("ALFA_ID", 0, "alfa_id");
        ALFA_ID = accountVerificationCreateLinkProviderDto;
        AccountVerificationCreateLinkProviderDto accountVerificationCreateLinkProviderDto2 = new AccountVerificationCreateLinkProviderDto("SBER_ID", 1, "sber_id");
        SBER_ID = accountVerificationCreateLinkProviderDto2;
        AccountVerificationCreateLinkProviderDto accountVerificationCreateLinkProviderDto3 = new AccountVerificationCreateLinkProviderDto("TINKOFF_ID", 2, "tinkoff_id");
        TINKOFF_ID = accountVerificationCreateLinkProviderDto3;
        AccountVerificationCreateLinkProviderDto accountVerificationCreateLinkProviderDto4 = new AccountVerificationCreateLinkProviderDto("VTB_ID", 3, "vtb_id");
        VTB_ID = accountVerificationCreateLinkProviderDto4;
        AccountVerificationCreateLinkProviderDto[] accountVerificationCreateLinkProviderDtoArr = {accountVerificationCreateLinkProviderDto, accountVerificationCreateLinkProviderDto2, accountVerificationCreateLinkProviderDto3, accountVerificationCreateLinkProviderDto4};
        $VALUES = accountVerificationCreateLinkProviderDtoArr;
        $ENTRIES = new asp(accountVerificationCreateLinkProviderDtoArr);
        CREATOR = new a();
    }

    private AccountVerificationCreateLinkProviderDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountVerificationCreateLinkProviderDto valueOf(String str) {
        return (AccountVerificationCreateLinkProviderDto) Enum.valueOf(AccountVerificationCreateLinkProviderDto.class, str);
    }

    public static AccountVerificationCreateLinkProviderDto[] values() {
        return (AccountVerificationCreateLinkProviderDto[]) $VALUES.clone();
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
