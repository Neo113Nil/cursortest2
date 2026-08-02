package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: AccountContactInfoPhoneDto.kt */
/* loaded from: classes14.dex */
public final class AccountContactInfoPhoneDto implements Parcelable {
    public static final Parcelable.Creator<AccountContactInfoPhoneDto> CREATOR = new a();

    @pmi0("privacy")
    private final AccountPrivacySettingDto privacy;

    @pmi0("value")
    private final String value;

    /* compiled from: AccountContactInfoPhoneDto.kt */
    public static final class a implements Parcelable.Creator<AccountContactInfoPhoneDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountContactInfoPhoneDto createFromParcel(Parcel parcel) {
            return new AccountContactInfoPhoneDto(parcel.readString(), AccountPrivacySettingDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountContactInfoPhoneDto[] newArray(int i) {
            return new AccountContactInfoPhoneDto[i];
        }
    }

    public AccountContactInfoPhoneDto(String str, AccountPrivacySettingDto accountPrivacySettingDto) {
        this.value = str;
        this.privacy = accountPrivacySettingDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountContactInfoPhoneDto)) {
            return false;
        }
        AccountContactInfoPhoneDto accountContactInfoPhoneDto = (AccountContactInfoPhoneDto) obj;
        return epx.f(this.value, accountContactInfoPhoneDto.value) && epx.f(this.privacy, accountContactInfoPhoneDto.privacy);
    }

    public final int hashCode() {
        return this.privacy.hashCode() + (this.value.hashCode() * 31);
    }

    public final String toString() {
        return "AccountContactInfoPhoneDto(value=" + this.value + ", privacy=" + this.privacy + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        this.privacy.writeToParcel(parcel, i);
    }
}
