package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSecurityRecommendationIndicatorDto.kt */
/* loaded from: classes14.dex */
public final class AccountSecurityRecommendationIndicatorDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AccountSecurityRecommendationIndicatorDto[] $VALUES;
    public static final Parcelable.Creator<AccountSecurityRecommendationIndicatorDto> CREATOR;

    @pmi0("1")
    public static final AccountSecurityRecommendationIndicatorDto HAVE_ISSUES;

    @pmi0("10")
    public static final AccountSecurityRecommendationIndicatorDto HAVE_RECOMMENDATIONS;
    private final int value;

    /* compiled from: AccountSecurityRecommendationIndicatorDto.kt */
    public static final class a implements Parcelable.Creator<AccountSecurityRecommendationIndicatorDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSecurityRecommendationIndicatorDto createFromParcel(Parcel parcel) {
            return AccountSecurityRecommendationIndicatorDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSecurityRecommendationIndicatorDto[] newArray(int i) {
            return new AccountSecurityRecommendationIndicatorDto[i];
        }
    }

    static {
        AccountSecurityRecommendationIndicatorDto accountSecurityRecommendationIndicatorDto = new AccountSecurityRecommendationIndicatorDto("HAVE_ISSUES", 0, 1);
        HAVE_ISSUES = accountSecurityRecommendationIndicatorDto;
        AccountSecurityRecommendationIndicatorDto accountSecurityRecommendationIndicatorDto2 = new AccountSecurityRecommendationIndicatorDto("HAVE_RECOMMENDATIONS", 1, 10);
        HAVE_RECOMMENDATIONS = accountSecurityRecommendationIndicatorDto2;
        AccountSecurityRecommendationIndicatorDto[] accountSecurityRecommendationIndicatorDtoArr = {accountSecurityRecommendationIndicatorDto, accountSecurityRecommendationIndicatorDto2};
        $VALUES = accountSecurityRecommendationIndicatorDtoArr;
        $ENTRIES = new asp(accountSecurityRecommendationIndicatorDtoArr);
        CREATOR = new a();
    }

    private AccountSecurityRecommendationIndicatorDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static AccountSecurityRecommendationIndicatorDto valueOf(String str) {
        return (AccountSecurityRecommendationIndicatorDto) Enum.valueOf(AccountSecurityRecommendationIndicatorDto.class, str);
    }

    public static AccountSecurityRecommendationIndicatorDto[] values() {
        return (AccountSecurityRecommendationIndicatorDto[]) $VALUES.clone();
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
