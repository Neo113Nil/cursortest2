package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.combo.dto.ComboSubscriptionsNavigationInfoDto;
import com.vk.api.generated.vkpay.dto.VkpayPaymentsNavigationInfoDto;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AccountGetProfileNavigationInfoResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetProfileNavigationInfoResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetProfileNavigationInfoResponseDto> CREATOR = new a();

    @pmi0("account_navigation_info")
    private final AccountNavigationInfoDto accountNavigationInfo;

    @pmi0("combo_subscriptions_navigation_info")
    private final ComboSubscriptionsNavigationInfoDto comboSubscriptionsNavigationInfo;

    @pmi0("security_navigation_info")
    private final AccountSecurityNavigationInfoDto securityNavigationInfo;

    @pmi0("vkpay_payments_navigation_info")
    private final VkpayPaymentsNavigationInfoDto vkpayPaymentsNavigationInfo;

    /* compiled from: AccountGetProfileNavigationInfoResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetProfileNavigationInfoResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetProfileNavigationInfoResponseDto createFromParcel(Parcel parcel) {
            return new AccountGetProfileNavigationInfoResponseDto(AccountNavigationInfoDto.CREATOR.createFromParcel(parcel), VkpayPaymentsNavigationInfoDto.CREATOR.createFromParcel(parcel), ComboSubscriptionsNavigationInfoDto.CREATOR.createFromParcel(parcel), AccountSecurityNavigationInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetProfileNavigationInfoResponseDto[] newArray(int i) {
            return new AccountGetProfileNavigationInfoResponseDto[i];
        }
    }

    public AccountGetProfileNavigationInfoResponseDto(AccountNavigationInfoDto accountNavigationInfoDto, VkpayPaymentsNavigationInfoDto vkpayPaymentsNavigationInfoDto, ComboSubscriptionsNavigationInfoDto comboSubscriptionsNavigationInfoDto, AccountSecurityNavigationInfoDto accountSecurityNavigationInfoDto) {
        this.accountNavigationInfo = accountNavigationInfoDto;
        this.vkpayPaymentsNavigationInfo = vkpayPaymentsNavigationInfoDto;
        this.comboSubscriptionsNavigationInfo = comboSubscriptionsNavigationInfoDto;
        this.securityNavigationInfo = accountSecurityNavigationInfoDto;
    }

    public final AccountNavigationInfoDto d() {
        return this.accountNavigationInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ComboSubscriptionsNavigationInfoDto e() {
        return this.comboSubscriptionsNavigationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetProfileNavigationInfoResponseDto)) {
            return false;
        }
        AccountGetProfileNavigationInfoResponseDto accountGetProfileNavigationInfoResponseDto = (AccountGetProfileNavigationInfoResponseDto) obj;
        return epx.f(this.accountNavigationInfo, accountGetProfileNavigationInfoResponseDto.accountNavigationInfo) && epx.f(this.vkpayPaymentsNavigationInfo, accountGetProfileNavigationInfoResponseDto.vkpayPaymentsNavigationInfo) && epx.f(this.comboSubscriptionsNavigationInfo, accountGetProfileNavigationInfoResponseDto.comboSubscriptionsNavigationInfo) && epx.f(this.securityNavigationInfo, accountGetProfileNavigationInfoResponseDto.securityNavigationInfo);
    }

    public final AccountSecurityNavigationInfoDto f() {
        return this.securityNavigationInfo;
    }

    public final VkpayPaymentsNavigationInfoDto g() {
        return this.vkpayPaymentsNavigationInfo;
    }

    public final int hashCode() {
        return this.securityNavigationInfo.hashCode() + ((this.comboSubscriptionsNavigationInfo.hashCode() + ((this.vkpayPaymentsNavigationInfo.hashCode() + (this.accountNavigationInfo.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AccountGetProfileNavigationInfoResponseDto(accountNavigationInfo=" + this.accountNavigationInfo + ", vkpayPaymentsNavigationInfo=" + this.vkpayPaymentsNavigationInfo + ", comboSubscriptionsNavigationInfo=" + this.comboSubscriptionsNavigationInfo + ", securityNavigationInfo=" + this.securityNavigationInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.accountNavigationInfo.writeToParcel(parcel, i);
        this.vkpayPaymentsNavigationInfo.writeToParcel(parcel, i);
        this.comboSubscriptionsNavigationInfo.writeToParcel(parcel, i);
        this.securityNavigationInfo.writeToParcel(parcel, i);
    }
}
