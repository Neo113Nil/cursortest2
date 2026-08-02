package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSaveProfileInfoSexDto.kt */
/* loaded from: classes14.dex */
public final class AccountSaveProfileInfoSexDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSaveProfileInfoSexDto[] $VALUES;
    public static final Parcelable.Creator<AccountSaveProfileInfoSexDto> CREATOR;

    @pmi0("1")
    public static final AccountSaveProfileInfoSexDto FEMALE;

    @pmi0("2")
    public static final AccountSaveProfileInfoSexDto MALE;

    @pmi0("0")
    public static final AccountSaveProfileInfoSexDto UNDEFINED;
    private final int value;

    /* compiled from: AccountSaveProfileInfoSexDto.kt */
    public static final class a implements Parcelable.Creator<AccountSaveProfileInfoSexDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoSexDto createFromParcel(Parcel parcel) {
            return AccountSaveProfileInfoSexDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoSexDto[] newArray(int i) {
            return new AccountSaveProfileInfoSexDto[i];
        }
    }

    static {
        AccountSaveProfileInfoSexDto accountSaveProfileInfoSexDto = new AccountSaveProfileInfoSexDto("UNDEFINED", 0, 0);
        UNDEFINED = accountSaveProfileInfoSexDto;
        AccountSaveProfileInfoSexDto accountSaveProfileInfoSexDto2 = new AccountSaveProfileInfoSexDto("FEMALE", 1, 1);
        FEMALE = accountSaveProfileInfoSexDto2;
        AccountSaveProfileInfoSexDto accountSaveProfileInfoSexDto3 = new AccountSaveProfileInfoSexDto("MALE", 2, 2);
        MALE = accountSaveProfileInfoSexDto3;
        AccountSaveProfileInfoSexDto[] accountSaveProfileInfoSexDtoArr = {accountSaveProfileInfoSexDto, accountSaveProfileInfoSexDto2, accountSaveProfileInfoSexDto3};
        $VALUES = accountSaveProfileInfoSexDtoArr;
        $ENTRIES = new asp(accountSaveProfileInfoSexDtoArr);
        CREATOR = new a();
    }

    private AccountSaveProfileInfoSexDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountSaveProfileInfoSexDto valueOf(String str) {
        return (AccountSaveProfileInfoSexDto) Enum.valueOf(AccountSaveProfileInfoSexDto.class, str);
    }

    public static AccountSaveProfileInfoSexDto[] values() {
        return (AccountSaveProfileInfoSexDto[]) $VALUES.clone();
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
