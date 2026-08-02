package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AccountUserSettingsInterestDto.kt */
/* loaded from: classes14.dex */
public final class AccountUserSettingsInterestDto implements Parcelable {
    public static final Parcelable.Creator<AccountUserSettingsInterestDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("value")
    private final String value;

    /* compiled from: AccountUserSettingsInterestDto.kt */
    public static final class a implements Parcelable.Creator<AccountUserSettingsInterestDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsInterestDto createFromParcel(Parcel parcel) {
            return new AccountUserSettingsInterestDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountUserSettingsInterestDto[] newArray(int i) {
            return new AccountUserSettingsInterestDto[i];
        }
    }

    public AccountUserSettingsInterestDto(String str, String str2) {
        this.title = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountUserSettingsInterestDto)) {
            return false;
        }
        AccountUserSettingsInterestDto accountUserSettingsInterestDto = (AccountUserSettingsInterestDto) obj;
        return epx.f(this.title, accountUserSettingsInterestDto.title) && epx.f(this.value, accountUserSettingsInterestDto.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountUserSettingsInterestDto(title=");
        sb.append(this.title);
        sb.append(", value=");
        return ho8.a(sb, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.value);
    }
}
