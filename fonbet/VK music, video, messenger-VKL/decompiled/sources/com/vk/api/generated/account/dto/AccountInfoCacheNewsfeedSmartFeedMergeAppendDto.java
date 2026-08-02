package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AccountInfoCacheNewsfeedSmartFeedMergeAppendDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoCacheNewsfeedSmartFeedMergeAppendDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoCacheNewsfeedSmartFeedMergeAppendDto> CREATOR = new a();

    @pmi0("enable_button")
    private final boolean enableButton;

    /* compiled from: AccountInfoCacheNewsfeedSmartFeedMergeAppendDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoCacheNewsfeedSmartFeedMergeAppendDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheNewsfeedSmartFeedMergeAppendDto createFromParcel(Parcel parcel) {
            return new AccountInfoCacheNewsfeedSmartFeedMergeAppendDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheNewsfeedSmartFeedMergeAppendDto[] newArray(int i) {
            return new AccountInfoCacheNewsfeedSmartFeedMergeAppendDto[i];
        }
    }

    public AccountInfoCacheNewsfeedSmartFeedMergeAppendDto(boolean z) {
        this.enableButton = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountInfoCacheNewsfeedSmartFeedMergeAppendDto) && this.enableButton == ((AccountInfoCacheNewsfeedSmartFeedMergeAppendDto) obj).enableButton;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enableButton);
    }

    public final String toString() {
        return q0.a(new StringBuilder("AccountInfoCacheNewsfeedSmartFeedMergeAppendDto(enableButton="), this.enableButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enableButton ? 1 : 0);
    }
}
