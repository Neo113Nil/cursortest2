package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSecurityLevelDto.kt */
/* loaded from: classes14.dex */
public final class AccountSecurityLevelDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSecurityLevelDto[] $VALUES;
    public static final Parcelable.Creator<AccountSecurityLevelDto> CREATOR;

    @pmi0("20")
    public static final AccountSecurityLevelDto GOOD;

    @pmi0("1")
    public static final AccountSecurityLevelDto HAVE_ISSUES;

    @pmi0("10")
    public static final AccountSecurityLevelDto HAVE_RECOMMENDATIONS;

    @pmi0("0")
    public static final AccountSecurityLevelDto NOTHING_TO_SAY;
    private final int value;

    /* compiled from: AccountSecurityLevelDto.kt */
    public static final class a implements Parcelable.Creator<AccountSecurityLevelDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSecurityLevelDto createFromParcel(Parcel parcel) {
            return AccountSecurityLevelDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSecurityLevelDto[] newArray(int i) {
            return new AccountSecurityLevelDto[i];
        }
    }

    static {
        AccountSecurityLevelDto accountSecurityLevelDto = new AccountSecurityLevelDto("NOTHING_TO_SAY", 0, 0);
        NOTHING_TO_SAY = accountSecurityLevelDto;
        AccountSecurityLevelDto accountSecurityLevelDto2 = new AccountSecurityLevelDto("HAVE_ISSUES", 1, 1);
        HAVE_ISSUES = accountSecurityLevelDto2;
        AccountSecurityLevelDto accountSecurityLevelDto3 = new AccountSecurityLevelDto("HAVE_RECOMMENDATIONS", 2, 10);
        HAVE_RECOMMENDATIONS = accountSecurityLevelDto3;
        AccountSecurityLevelDto accountSecurityLevelDto4 = new AccountSecurityLevelDto("GOOD", 3, 20);
        GOOD = accountSecurityLevelDto4;
        AccountSecurityLevelDto[] accountSecurityLevelDtoArr = {accountSecurityLevelDto, accountSecurityLevelDto2, accountSecurityLevelDto3, accountSecurityLevelDto4};
        $VALUES = accountSecurityLevelDtoArr;
        $ENTRIES = new asp(accountSecurityLevelDtoArr);
        CREATOR = new a();
    }

    private AccountSecurityLevelDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountSecurityLevelDto valueOf(String str) {
        return (AccountSecurityLevelDto) Enum.valueOf(AccountSecurityLevelDto.class, str);
    }

    public static AccountSecurityLevelDto[] values() {
        return (AccountSecurityLevelDto[]) $VALUES.clone();
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
