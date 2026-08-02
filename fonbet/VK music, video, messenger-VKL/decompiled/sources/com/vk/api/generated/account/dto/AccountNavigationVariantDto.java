package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.zcl;

/* compiled from: AccountNavigationVariantDto.kt */
/* loaded from: classes14.dex */
public final class AccountNavigationVariantDto implements Parcelable {
    public static final Parcelable.Creator<AccountNavigationVariantDto> CREATOR = new a();

    @pmi0("hint")
    private final AccountNavigationVariantHintDto hint;

    @pmi0("is_enabled")
    private final boolean isEnabled;

    @pmi0("settings_labels")
    private final AccountNavigationVariantSettingsLabelsDto settingsLabels;

    @pmi0("state")
    private final AccountNavigationStateDto state;

    /* compiled from: AccountNavigationVariantDto.kt */
    public static final class a implements Parcelable.Creator<AccountNavigationVariantDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantDto createFromParcel(Parcel parcel) {
            return new AccountNavigationVariantDto(AccountNavigationStateDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, AccountNavigationVariantSettingsLabelsDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AccountNavigationVariantHintDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantDto[] newArray(int i) {
            return new AccountNavigationVariantDto[i];
        }
    }

    public AccountNavigationVariantDto(AccountNavigationStateDto accountNavigationStateDto, boolean z, AccountNavigationVariantSettingsLabelsDto accountNavigationVariantSettingsLabelsDto, AccountNavigationVariantHintDto accountNavigationVariantHintDto) {
        this.state = accountNavigationStateDto;
        this.isEnabled = z;
        this.settingsLabels = accountNavigationVariantSettingsLabelsDto;
        this.hint = accountNavigationVariantHintDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNavigationVariantDto)) {
            return false;
        }
        AccountNavigationVariantDto accountNavigationVariantDto = (AccountNavigationVariantDto) obj;
        return epx.f(this.state, accountNavigationVariantDto.state) && this.isEnabled == accountNavigationVariantDto.isEnabled && epx.f(this.settingsLabels, accountNavigationVariantDto.settingsLabels) && epx.f(this.hint, accountNavigationVariantDto.hint);
    }

    public final int hashCode() {
        int hashCode = (this.settingsLabels.hashCode() + qoy.b(this.state.hashCode() * 31, 31, this.isEnabled)) * 31;
        AccountNavigationVariantHintDto accountNavigationVariantHintDto = this.hint;
        return hashCode + (accountNavigationVariantHintDto == null ? 0 : accountNavigationVariantHintDto.hashCode());
    }

    public final String toString() {
        return "AccountNavigationVariantDto(state=" + this.state + ", isEnabled=" + this.isEnabled + ", settingsLabels=" + this.settingsLabels + ", hint=" + this.hint + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.state.writeToParcel(parcel, i);
        parcel.writeInt(this.isEnabled ? 1 : 0);
        this.settingsLabels.writeToParcel(parcel, i);
        AccountNavigationVariantHintDto accountNavigationVariantHintDto = this.hint;
        if (accountNavigationVariantHintDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountNavigationVariantHintDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AccountNavigationVariantDto(AccountNavigationStateDto accountNavigationStateDto, boolean z, AccountNavigationVariantSettingsLabelsDto accountNavigationVariantSettingsLabelsDto, AccountNavigationVariantHintDto accountNavigationVariantHintDto, int i, zcl zclVar) {
        this(accountNavigationStateDto, z, accountNavigationVariantSettingsLabelsDto, (i & 8) != 0 ? null : accountNavigationVariantHintDto);
    }
}
