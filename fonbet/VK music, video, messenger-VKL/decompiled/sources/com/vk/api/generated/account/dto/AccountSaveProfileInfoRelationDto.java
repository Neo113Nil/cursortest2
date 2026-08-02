package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.Gc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSaveProfileInfoRelationDto.kt */
/* loaded from: classes14.dex */
public final class AccountSaveProfileInfoRelationDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSaveProfileInfoRelationDto[] $VALUES;

    @pmi0("6")
    public static final AccountSaveProfileInfoRelationDto ACTIVELY_SEARCHING;

    @pmi0(CampaignEx.CLICKMODE_ON)
    public static final AccountSaveProfileInfoRelationDto COMPLICATED;
    public static final Parcelable.Creator<AccountSaveProfileInfoRelationDto> CREATOR;

    @pmi0("3")
    public static final AccountSaveProfileInfoRelationDto ENGAGED;

    @pmi0("8")
    public static final AccountSaveProfileInfoRelationDto IN_A_CIVIL_UNION;

    @pmi0(Gc.e)
    public static final AccountSaveProfileInfoRelationDto IN_LOVE;

    @pmi0("4")
    public static final AccountSaveProfileInfoRelationDto MARRIED;

    @pmi0("0")
    public static final AccountSaveProfileInfoRelationDto NOT_SPECIFIED;

    @pmi0("2")
    public static final AccountSaveProfileInfoRelationDto RELATIONSHIP;

    @pmi0("1")
    public static final AccountSaveProfileInfoRelationDto SINGLE;
    private final int value;

    /* compiled from: AccountSaveProfileInfoRelationDto.kt */
    public static final class a implements Parcelable.Creator<AccountSaveProfileInfoRelationDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoRelationDto createFromParcel(Parcel parcel) {
            return AccountSaveProfileInfoRelationDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSaveProfileInfoRelationDto[] newArray(int i) {
            return new AccountSaveProfileInfoRelationDto[i];
        }
    }

    static {
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto = new AccountSaveProfileInfoRelationDto("NOT_SPECIFIED", 0, 0);
        NOT_SPECIFIED = accountSaveProfileInfoRelationDto;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto2 = new AccountSaveProfileInfoRelationDto("SINGLE", 1, 1);
        SINGLE = accountSaveProfileInfoRelationDto2;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto3 = new AccountSaveProfileInfoRelationDto("RELATIONSHIP", 2, 2);
        RELATIONSHIP = accountSaveProfileInfoRelationDto3;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto4 = new AccountSaveProfileInfoRelationDto("ENGAGED", 3, 3);
        ENGAGED = accountSaveProfileInfoRelationDto4;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto5 = new AccountSaveProfileInfoRelationDto("MARRIED", 4, 4);
        MARRIED = accountSaveProfileInfoRelationDto5;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto6 = new AccountSaveProfileInfoRelationDto("COMPLICATED", 5, 5);
        COMPLICATED = accountSaveProfileInfoRelationDto6;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto7 = new AccountSaveProfileInfoRelationDto("ACTIVELY_SEARCHING", 6, 6);
        ACTIVELY_SEARCHING = accountSaveProfileInfoRelationDto7;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto8 = new AccountSaveProfileInfoRelationDto("IN_LOVE", 7, 7);
        IN_LOVE = accountSaveProfileInfoRelationDto8;
        AccountSaveProfileInfoRelationDto accountSaveProfileInfoRelationDto9 = new AccountSaveProfileInfoRelationDto("IN_A_CIVIL_UNION", 8, 8);
        IN_A_CIVIL_UNION = accountSaveProfileInfoRelationDto9;
        AccountSaveProfileInfoRelationDto[] accountSaveProfileInfoRelationDtoArr = {accountSaveProfileInfoRelationDto, accountSaveProfileInfoRelationDto2, accountSaveProfileInfoRelationDto3, accountSaveProfileInfoRelationDto4, accountSaveProfileInfoRelationDto5, accountSaveProfileInfoRelationDto6, accountSaveProfileInfoRelationDto7, accountSaveProfileInfoRelationDto8, accountSaveProfileInfoRelationDto9};
        $VALUES = accountSaveProfileInfoRelationDtoArr;
        $ENTRIES = new asp(accountSaveProfileInfoRelationDtoArr);
        CREATOR = new a();
    }

    private AccountSaveProfileInfoRelationDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountSaveProfileInfoRelationDto valueOf(String str) {
        return (AccountSaveProfileInfoRelationDto) Enum.valueOf(AccountSaveProfileInfoRelationDto.class, str);
    }

    public static AccountSaveProfileInfoRelationDto[] values() {
        return (AccountSaveProfileInfoRelationDto[]) $VALUES.clone();
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
