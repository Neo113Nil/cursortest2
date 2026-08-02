package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountSecurityNavigationInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountSecurityNavigationInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountSecurityNavigationInfoDto> CREATOR = new a();

    @pmi0("security_level")
    private final AccountSecurityLevelDto securityLevel;

    @pmi0("security_recommendation_indicator")
    private final AccountSecurityRecommendationIndicatorDto securityRecommendationIndicator;

    /* compiled from: AccountSecurityNavigationInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountSecurityNavigationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSecurityNavigationInfoDto createFromParcel(Parcel parcel) {
            return new AccountSecurityNavigationInfoDto(AccountSecurityLevelDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountSecurityRecommendationIndicatorDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSecurityNavigationInfoDto[] newArray(int i) {
            return new AccountSecurityNavigationInfoDto[i];
        }
    }

    public AccountSecurityNavigationInfoDto(AccountSecurityLevelDto accountSecurityLevelDto, AccountSecurityRecommendationIndicatorDto accountSecurityRecommendationIndicatorDto) {
        this.securityLevel = accountSecurityLevelDto;
        this.securityRecommendationIndicator = accountSecurityRecommendationIndicatorDto;
    }

    public final AccountSecurityLevelDto d() {
        return this.securityLevel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final AccountSecurityRecommendationIndicatorDto e() {
        return this.securityRecommendationIndicator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSecurityNavigationInfoDto)) {
            return false;
        }
        AccountSecurityNavigationInfoDto accountSecurityNavigationInfoDto = (AccountSecurityNavigationInfoDto) obj;
        return this.securityLevel == accountSecurityNavigationInfoDto.securityLevel && this.securityRecommendationIndicator == accountSecurityNavigationInfoDto.securityRecommendationIndicator;
    }

    public final int hashCode() {
        int hashCode = this.securityLevel.hashCode() * 31;
        AccountSecurityRecommendationIndicatorDto accountSecurityRecommendationIndicatorDto = this.securityRecommendationIndicator;
        return hashCode + (accountSecurityRecommendationIndicatorDto == null ? 0 : accountSecurityRecommendationIndicatorDto.hashCode());
    }

    public final String toString() {
        return "AccountSecurityNavigationInfoDto(securityLevel=" + this.securityLevel + ", securityRecommendationIndicator=" + this.securityRecommendationIndicator + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.securityLevel.writeToParcel(parcel, i);
        AccountSecurityRecommendationIndicatorDto accountSecurityRecommendationIndicatorDto = this.securityRecommendationIndicator;
        if (accountSecurityRecommendationIndicatorDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountSecurityRecommendationIndicatorDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AccountSecurityNavigationInfoDto(AccountSecurityLevelDto accountSecurityLevelDto, AccountSecurityRecommendationIndicatorDto accountSecurityRecommendationIndicatorDto, int i, zcl zclVar) {
        this(accountSecurityLevelDto, (i & 2) != 0 ? null : accountSecurityRecommendationIndicatorDto);
    }
}
