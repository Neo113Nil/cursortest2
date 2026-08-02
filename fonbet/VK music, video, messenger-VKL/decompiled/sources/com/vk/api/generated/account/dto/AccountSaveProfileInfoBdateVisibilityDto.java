package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSaveProfileInfoBdateVisibilityDto.kt */
/* loaded from: classes14.dex */
public final class AccountSaveProfileInfoBdateVisibilityDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSaveProfileInfoBdateVisibilityDto[] $VALUES;
    public static final Parcelable.Creator<AccountSaveProfileInfoBdateVisibilityDto> CREATOR;

    @pmi0("0")
    public static final AccountSaveProfileInfoBdateVisibilityDto HIDE;

    @pmi0("2")
    public static final AccountSaveProfileInfoBdateVisibilityDto HIDE_YEAR;

    @pmi0("1")
    public static final AccountSaveProfileInfoBdateVisibilityDto SHOW;
    private final int value;

    /* compiled from: AccountSaveProfileInfoBdateVisibilityDto.kt */
    public static final class a implements Parcelable.Creator<AccountSaveProfileInfoBdateVisibilityDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoBdateVisibilityDto createFromParcel(Parcel parcel) {
            return AccountSaveProfileInfoBdateVisibilityDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoBdateVisibilityDto[] newArray(int i) {
            return new AccountSaveProfileInfoBdateVisibilityDto[i];
        }
    }

    static {
        AccountSaveProfileInfoBdateVisibilityDto accountSaveProfileInfoBdateVisibilityDto = new AccountSaveProfileInfoBdateVisibilityDto("HIDE", 0, 0);
        HIDE = accountSaveProfileInfoBdateVisibilityDto;
        AccountSaveProfileInfoBdateVisibilityDto accountSaveProfileInfoBdateVisibilityDto2 = new AccountSaveProfileInfoBdateVisibilityDto("SHOW", 1, 1);
        SHOW = accountSaveProfileInfoBdateVisibilityDto2;
        AccountSaveProfileInfoBdateVisibilityDto accountSaveProfileInfoBdateVisibilityDto3 = new AccountSaveProfileInfoBdateVisibilityDto("HIDE_YEAR", 2, 2);
        HIDE_YEAR = accountSaveProfileInfoBdateVisibilityDto3;
        AccountSaveProfileInfoBdateVisibilityDto[] accountSaveProfileInfoBdateVisibilityDtoArr = {accountSaveProfileInfoBdateVisibilityDto, accountSaveProfileInfoBdateVisibilityDto2, accountSaveProfileInfoBdateVisibilityDto3};
        $VALUES = accountSaveProfileInfoBdateVisibilityDtoArr;
        $ENTRIES = new asp(accountSaveProfileInfoBdateVisibilityDtoArr);
        CREATOR = new a();
    }

    private AccountSaveProfileInfoBdateVisibilityDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountSaveProfileInfoBdateVisibilityDto valueOf(String str) {
        return (AccountSaveProfileInfoBdateVisibilityDto) Enum.valueOf(AccountSaveProfileInfoBdateVisibilityDto.class, str);
    }

    public static AccountSaveProfileInfoBdateVisibilityDto[] values() {
        return (AccountSaveProfileInfoBdateVisibilityDto[]) $VALUES.clone();
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
