package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountMarkActualizeEmailActionDto.kt */
/* loaded from: classes14.dex */
public final class AccountMarkActualizeEmailActionDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountMarkActualizeEmailActionDto[] $VALUES;

    @pmi0("1")
    public static final AccountMarkActualizeEmailActionDto CLOSE;

    @pmi0("2")
    public static final AccountMarkActualizeEmailActionDto CLOSE_MENU;

    @pmi0("0")
    public static final AccountMarkActualizeEmailActionDto CONFIRM;
    public static final Parcelable.Creator<AccountMarkActualizeEmailActionDto> CREATOR;
    private final int value;

    /* compiled from: AccountMarkActualizeEmailActionDto.kt */
    public static final class a implements Parcelable.Creator<AccountMarkActualizeEmailActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountMarkActualizeEmailActionDto createFromParcel(Parcel parcel) {
            return AccountMarkActualizeEmailActionDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountMarkActualizeEmailActionDto[] newArray(int i) {
            return new AccountMarkActualizeEmailActionDto[i];
        }
    }

    static {
        AccountMarkActualizeEmailActionDto accountMarkActualizeEmailActionDto = new AccountMarkActualizeEmailActionDto("CONFIRM", 0, 0);
        CONFIRM = accountMarkActualizeEmailActionDto;
        AccountMarkActualizeEmailActionDto accountMarkActualizeEmailActionDto2 = new AccountMarkActualizeEmailActionDto("CLOSE", 1, 1);
        CLOSE = accountMarkActualizeEmailActionDto2;
        AccountMarkActualizeEmailActionDto accountMarkActualizeEmailActionDto3 = new AccountMarkActualizeEmailActionDto("CLOSE_MENU", 2, 2);
        CLOSE_MENU = accountMarkActualizeEmailActionDto3;
        AccountMarkActualizeEmailActionDto[] accountMarkActualizeEmailActionDtoArr = {accountMarkActualizeEmailActionDto, accountMarkActualizeEmailActionDto2, accountMarkActualizeEmailActionDto3};
        $VALUES = accountMarkActualizeEmailActionDtoArr;
        $ENTRIES = new asp(accountMarkActualizeEmailActionDtoArr);
        CREATOR = new a();
    }

    private AccountMarkActualizeEmailActionDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountMarkActualizeEmailActionDto valueOf(String str) {
        return (AccountMarkActualizeEmailActionDto) Enum.valueOf(AccountMarkActualizeEmailActionDto.class, str);
    }

    public static AccountMarkActualizeEmailActionDto[] values() {
        return (AccountMarkActualizeEmailActionDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
