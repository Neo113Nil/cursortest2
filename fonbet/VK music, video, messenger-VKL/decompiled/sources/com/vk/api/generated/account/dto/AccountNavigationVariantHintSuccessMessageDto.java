package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AccountNavigationVariantHintSuccessMessageDto.kt */
/* loaded from: classes14.dex */
public final class AccountNavigationVariantHintSuccessMessageDto implements Parcelable {
    public static final Parcelable.Creator<AccountNavigationVariantHintSuccessMessageDto> CREATOR = new a();

    @pmi0("settings_button")
    private final String settingsButton;

    @pmi0("text")
    private final String text;

    /* compiled from: AccountNavigationVariantHintSuccessMessageDto.kt */
    public static final class a implements Parcelable.Creator<AccountNavigationVariantHintSuccessMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantHintSuccessMessageDto createFromParcel(Parcel parcel) {
            return new AccountNavigationVariantHintSuccessMessageDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantHintSuccessMessageDto[] newArray(int i) {
            return new AccountNavigationVariantHintSuccessMessageDto[i];
        }
    }

    public AccountNavigationVariantHintSuccessMessageDto(String str, String str2) {
        this.text = str;
        this.settingsButton = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNavigationVariantHintSuccessMessageDto)) {
            return false;
        }
        AccountNavigationVariantHintSuccessMessageDto accountNavigationVariantHintSuccessMessageDto = (AccountNavigationVariantHintSuccessMessageDto) obj;
        return epx.f(this.text, accountNavigationVariantHintSuccessMessageDto.text) && epx.f(this.settingsButton, accountNavigationVariantHintSuccessMessageDto.settingsButton);
    }

    public final int hashCode() {
        return this.settingsButton.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountNavigationVariantHintSuccessMessageDto(text=");
        sb.append(this.text);
        sb.append(", settingsButton=");
        return ho8.a(sb, this.settingsButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.settingsButton);
    }
}
