package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: AccountInfoAdsEasyPromoteMenuItemDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoAdsEasyPromoteMenuItemDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoAdsEasyPromoteMenuItemDto> CREATOR = new a();

    @pmi0("item_text")
    private final String itemText;

    @pmi0("item_url")
    private final String itemUrl;

    @pmi0("show_badge")
    private final boolean showBadge;

    /* compiled from: AccountInfoAdsEasyPromoteMenuItemDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoAdsEasyPromoteMenuItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoAdsEasyPromoteMenuItemDto createFromParcel(Parcel parcel) {
            return new AccountInfoAdsEasyPromoteMenuItemDto(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoAdsEasyPromoteMenuItemDto[] newArray(int i) {
            return new AccountInfoAdsEasyPromoteMenuItemDto[i];
        }
    }

    public AccountInfoAdsEasyPromoteMenuItemDto(String str, String str2, boolean z) {
        this.itemUrl = str;
        this.itemText = str2;
        this.showBadge = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoAdsEasyPromoteMenuItemDto)) {
            return false;
        }
        AccountInfoAdsEasyPromoteMenuItemDto accountInfoAdsEasyPromoteMenuItemDto = (AccountInfoAdsEasyPromoteMenuItemDto) obj;
        return epx.f(this.itemUrl, accountInfoAdsEasyPromoteMenuItemDto.itemUrl) && epx.f(this.itemText, accountInfoAdsEasyPromoteMenuItemDto.itemText) && this.showBadge == accountInfoAdsEasyPromoteMenuItemDto.showBadge;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showBadge) + urd0.a(this.itemUrl.hashCode() * 31, 31, this.itemText);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoAdsEasyPromoteMenuItemDto(itemUrl=");
        sb.append(this.itemUrl);
        sb.append(", itemText=");
        sb.append(this.itemText);
        sb.append(", showBadge=");
        return q0.a(sb, this.showBadge, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.itemUrl);
        parcel.writeString(this.itemText);
        parcel.writeInt(this.showBadge ? 1 : 0);
    }
}
