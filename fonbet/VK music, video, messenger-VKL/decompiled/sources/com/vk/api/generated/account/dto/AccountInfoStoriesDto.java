package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoStoriesDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoStoriesDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoStoriesDto> CREATOR = new a();

    @pmi0("update_settings")
    private final AccountInfoExpDecayUpdateSettingsDto updateSettings;

    /* compiled from: AccountInfoStoriesDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoStoriesDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoStoriesDto createFromParcel(Parcel parcel) {
            return new AccountInfoStoriesDto(parcel.readInt() == 0 ? null : AccountInfoExpDecayUpdateSettingsDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoStoriesDto[] newArray(int i) {
            return new AccountInfoStoriesDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoStoriesDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountInfoStoriesDto) && epx.f(this.updateSettings, ((AccountInfoStoriesDto) obj).updateSettings);
    }

    public final int hashCode() {
        AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto = this.updateSettings;
        if (accountInfoExpDecayUpdateSettingsDto == null) {
            return 0;
        }
        return accountInfoExpDecayUpdateSettingsDto.hashCode();
    }

    public final String toString() {
        return "AccountInfoStoriesDto(updateSettings=" + this.updateSettings + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto = this.updateSettings;
        if (accountInfoExpDecayUpdateSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoExpDecayUpdateSettingsDto.writeToParcel(parcel, i);
        }
    }

    public AccountInfoStoriesDto(AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto) {
        this.updateSettings = accountInfoExpDecayUpdateSettingsDto;
    }

    public /* synthetic */ AccountInfoStoriesDto(AccountInfoExpDecayUpdateSettingsDto accountInfoExpDecayUpdateSettingsDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountInfoExpDecayUpdateSettingsDto);
    }
}
