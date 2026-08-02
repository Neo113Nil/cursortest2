package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountPushParamsOnoffDto.kt */
/* loaded from: classes14.dex */
public final class AccountPushParamsOnoffDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountPushParamsOnoffDto[] $VALUES;
    public static final Parcelable.Creator<AccountPushParamsOnoffDto> CREATOR;

    @pmi0("no_sound")
    public static final AccountPushParamsOnoffDto NO_SOUND;

    @pmi0("off")
    public static final AccountPushParamsOnoffDto OFF;

    @pmi0("on")
    public static final AccountPushParamsOnoffDto ON;
    private final String value;

    /* compiled from: AccountPushParamsOnoffDto.kt */
    public static final class a implements Parcelable.Creator<AccountPushParamsOnoffDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPushParamsOnoffDto createFromParcel(Parcel parcel) {
            return AccountPushParamsOnoffDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPushParamsOnoffDto[] newArray(int i) {
            return new AccountPushParamsOnoffDto[i];
        }
    }

    static {
        AccountPushParamsOnoffDto accountPushParamsOnoffDto = new AccountPushParamsOnoffDto("ON", 0, "on");
        ON = accountPushParamsOnoffDto;
        AccountPushParamsOnoffDto accountPushParamsOnoffDto2 = new AccountPushParamsOnoffDto("OFF", 1, "off");
        OFF = accountPushParamsOnoffDto2;
        AccountPushParamsOnoffDto accountPushParamsOnoffDto3 = new AccountPushParamsOnoffDto("NO_SOUND", 2, "no_sound");
        NO_SOUND = accountPushParamsOnoffDto3;
        AccountPushParamsOnoffDto[] accountPushParamsOnoffDtoArr = {accountPushParamsOnoffDto, accountPushParamsOnoffDto2, accountPushParamsOnoffDto3};
        $VALUES = accountPushParamsOnoffDtoArr;
        $ENTRIES = new asp(accountPushParamsOnoffDtoArr);
        CREATOR = new a();
    }

    private AccountPushParamsOnoffDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountPushParamsOnoffDto valueOf(String str) {
        return (AccountPushParamsOnoffDto) Enum.valueOf(AccountPushParamsOnoffDto.class, str);
    }

    public static AccountPushParamsOnoffDto[] values() {
        return (AccountPushParamsOnoffDto[]) $VALUES.clone();
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
