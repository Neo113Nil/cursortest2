package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountPushParamsSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AccountPushParamsSettingsDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountPushParamsSettingsDto[] $VALUES;
    public static final Parcelable.Creator<AccountPushParamsSettingsDto> CREATOR;

    @pmi0("fr_of_fr")
    public static final AccountPushParamsSettingsDto FR_OF_FR;

    @pmi0("no_sound")
    public static final AccountPushParamsSettingsDto NO_SOUND;

    @pmi0("off")
    public static final AccountPushParamsSettingsDto OFF;

    @pmi0("on")
    public static final AccountPushParamsSettingsDto ON;
    private final String value;

    /* compiled from: AccountPushParamsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AccountPushParamsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPushParamsSettingsDto createFromParcel(Parcel parcel) {
            return AccountPushParamsSettingsDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPushParamsSettingsDto[] newArray(int i) {
            return new AccountPushParamsSettingsDto[i];
        }
    }

    static {
        AccountPushParamsSettingsDto accountPushParamsSettingsDto = new AccountPushParamsSettingsDto("ON", 0, "on");
        ON = accountPushParamsSettingsDto;
        AccountPushParamsSettingsDto accountPushParamsSettingsDto2 = new AccountPushParamsSettingsDto("OFF", 1, "off");
        OFF = accountPushParamsSettingsDto2;
        AccountPushParamsSettingsDto accountPushParamsSettingsDto3 = new AccountPushParamsSettingsDto("FR_OF_FR", 2, "fr_of_fr");
        FR_OF_FR = accountPushParamsSettingsDto3;
        AccountPushParamsSettingsDto accountPushParamsSettingsDto4 = new AccountPushParamsSettingsDto("NO_SOUND", 3, "no_sound");
        NO_SOUND = accountPushParamsSettingsDto4;
        AccountPushParamsSettingsDto[] accountPushParamsSettingsDtoArr = {accountPushParamsSettingsDto, accountPushParamsSettingsDto2, accountPushParamsSettingsDto3, accountPushParamsSettingsDto4};
        $VALUES = accountPushParamsSettingsDtoArr;
        $ENTRIES = new asp(accountPushParamsSettingsDtoArr);
        CREATOR = new a();
    }

    private AccountPushParamsSettingsDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AccountPushParamsSettingsDto valueOf(String str) {
        return (AccountPushParamsSettingsDto) Enum.valueOf(AccountPushParamsSettingsDto.class, str);
    }

    public static AccountPushParamsSettingsDto[] values() {
        return (AccountPushParamsSettingsDto[]) $VALUES.clone();
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
