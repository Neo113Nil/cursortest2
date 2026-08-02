package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AccountNavigationVariantSettingsLabelsDto.kt */
/* loaded from: classes14.dex */
public final class AccountNavigationVariantSettingsLabelsDto implements Parcelable {
    public static final Parcelable.Creator<AccountNavigationVariantSettingsLabelsDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("section_title")
    private final String sectionTitle;

    @pmi0("switcher_title")
    private final String switcherTitle;

    /* compiled from: AccountNavigationVariantSettingsLabelsDto.kt */
    public static final class a implements Parcelable.Creator<AccountNavigationVariantSettingsLabelsDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantSettingsLabelsDto createFromParcel(Parcel parcel) {
            return new AccountNavigationVariantSettingsLabelsDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AccountNavigationVariantSettingsLabelsDto[] newArray(int i) {
            return new AccountNavigationVariantSettingsLabelsDto[i];
        }
    }

    public AccountNavigationVariantSettingsLabelsDto(String str, String str2, String str3) {
        this.sectionTitle = str;
        this.switcherTitle = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountNavigationVariantSettingsLabelsDto)) {
            return false;
        }
        AccountNavigationVariantSettingsLabelsDto accountNavigationVariantSettingsLabelsDto = (AccountNavigationVariantSettingsLabelsDto) obj;
        return epx.f(this.sectionTitle, accountNavigationVariantSettingsLabelsDto.sectionTitle) && epx.f(this.switcherTitle, accountNavigationVariantSettingsLabelsDto.switcherTitle) && epx.f(this.description, accountNavigationVariantSettingsLabelsDto.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + urd0.a(this.sectionTitle.hashCode() * 31, 31, this.switcherTitle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountNavigationVariantSettingsLabelsDto(sectionTitle=");
        sb.append(this.sectionTitle);
        sb.append(", switcherTitle=");
        sb.append(this.switcherTitle);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sectionTitle);
        parcel.writeString(this.switcherTitle);
        parcel.writeString(this.description);
    }
}
