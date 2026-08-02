package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountInfoSideMenuCustomItemIconDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoSideMenuCustomItemIconDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountInfoSideMenuCustomItemIconDto[] $VALUES;

    @pmi0("advertising")
    public static final AccountInfoSideMenuCustomItemIconDto ADVERTISING;
    public static final Parcelable.Creator<AccountInfoSideMenuCustomItemIconDto> CREATOR;
    private final String value;

    /* compiled from: AccountInfoSideMenuCustomItemIconDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoSideMenuCustomItemIconDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoSideMenuCustomItemIconDto createFromParcel(Parcel parcel) {
            return AccountInfoSideMenuCustomItemIconDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoSideMenuCustomItemIconDto[] newArray(int i) {
            return new AccountInfoSideMenuCustomItemIconDto[i];
        }
    }

    static {
        AccountInfoSideMenuCustomItemIconDto accountInfoSideMenuCustomItemIconDto = new AccountInfoSideMenuCustomItemIconDto("ADVERTISING", 0, "advertising");
        ADVERTISING = accountInfoSideMenuCustomItemIconDto;
        AccountInfoSideMenuCustomItemIconDto[] accountInfoSideMenuCustomItemIconDtoArr = {accountInfoSideMenuCustomItemIconDto};
        $VALUES = accountInfoSideMenuCustomItemIconDtoArr;
        $ENTRIES = new asp(accountInfoSideMenuCustomItemIconDtoArr);
        CREATOR = new a();
    }

    private AccountInfoSideMenuCustomItemIconDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountInfoSideMenuCustomItemIconDto valueOf(String str) {
        return (AccountInfoSideMenuCustomItemIconDto) Enum.valueOf(AccountInfoSideMenuCustomItemIconDto.class, str);
    }

    public static AccountInfoSideMenuCustomItemIconDto[] values() {
        return (AccountInfoSideMenuCustomItemIconDto[]) $VALUES.clone();
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
