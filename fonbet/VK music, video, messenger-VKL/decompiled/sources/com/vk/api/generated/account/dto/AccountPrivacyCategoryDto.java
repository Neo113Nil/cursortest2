package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AccountPrivacyCategoryDto.kt */
/* loaded from: classes14.dex */
public final class AccountPrivacyCategoryDto implements Parcelable {
    public static final Parcelable.Creator<AccountPrivacyCategoryDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    @pmi0("value")
    private final String value;

    /* compiled from: AccountPrivacyCategoryDto.kt */
    public static final class a implements Parcelable.Creator<AccountPrivacyCategoryDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountPrivacyCategoryDto createFromParcel(Parcel parcel) {
            return new AccountPrivacyCategoryDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountPrivacyCategoryDto[] newArray(int i) {
            return new AccountPrivacyCategoryDto[i];
        }
    }

    public AccountPrivacyCategoryDto(String str, String str2) {
        this.value = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountPrivacyCategoryDto)) {
            return false;
        }
        AccountPrivacyCategoryDto accountPrivacyCategoryDto = (AccountPrivacyCategoryDto) obj;
        return epx.f(this.value, accountPrivacyCategoryDto.value) && epx.f(this.title, accountPrivacyCategoryDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.value.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountPrivacyCategoryDto(value=");
        sb.append(this.value);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.value);
        parcel.writeString(this.title);
    }
}
