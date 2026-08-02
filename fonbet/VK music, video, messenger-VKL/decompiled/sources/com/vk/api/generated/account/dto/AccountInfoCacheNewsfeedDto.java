package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoCacheNewsfeedDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoCacheNewsfeedDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoCacheNewsfeedDto> CREATOR = new a();

    @pmi0("fetch_items_limit")
    private final Integer fetchItemsLimit;

    @pmi0("smart_feed_merge")
    private final AccountInfoCacheNewsfeedSmartFeedMergeDto smartFeedMerge;

    @pmi0("ttl")
    private final Integer ttl;

    /* compiled from: AccountInfoCacheNewsfeedDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoCacheNewsfeedDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheNewsfeedDto createFromParcel(Parcel parcel) {
            return new AccountInfoCacheNewsfeedDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? AccountInfoCacheNewsfeedSmartFeedMergeDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheNewsfeedDto[] newArray(int i) {
            return new AccountInfoCacheNewsfeedDto[i];
        }
    }

    public AccountInfoCacheNewsfeedDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoCacheNewsfeedDto)) {
            return false;
        }
        AccountInfoCacheNewsfeedDto accountInfoCacheNewsfeedDto = (AccountInfoCacheNewsfeedDto) obj;
        return epx.f(this.fetchItemsLimit, accountInfoCacheNewsfeedDto.fetchItemsLimit) && epx.f(this.ttl, accountInfoCacheNewsfeedDto.ttl) && epx.f(this.smartFeedMerge, accountInfoCacheNewsfeedDto.smartFeedMerge);
    }

    public final int hashCode() {
        Integer num = this.fetchItemsLimit;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.ttl;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        AccountInfoCacheNewsfeedSmartFeedMergeDto accountInfoCacheNewsfeedSmartFeedMergeDto = this.smartFeedMerge;
        return hashCode2 + (accountInfoCacheNewsfeedSmartFeedMergeDto != null ? accountInfoCacheNewsfeedSmartFeedMergeDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountInfoCacheNewsfeedDto(fetchItemsLimit=" + this.fetchItemsLimit + ", ttl=" + this.ttl + ", smartFeedMerge=" + this.smartFeedMerge + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.fetchItemsLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.ttl;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        AccountInfoCacheNewsfeedSmartFeedMergeDto accountInfoCacheNewsfeedSmartFeedMergeDto = this.smartFeedMerge;
        if (accountInfoCacheNewsfeedSmartFeedMergeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoCacheNewsfeedSmartFeedMergeDto.writeToParcel(parcel, i);
        }
    }

    public AccountInfoCacheNewsfeedDto(Integer num, Integer num2, AccountInfoCacheNewsfeedSmartFeedMergeDto accountInfoCacheNewsfeedSmartFeedMergeDto) {
        this.fetchItemsLimit = num;
        this.ttl = num2;
        this.smartFeedMerge = accountInfoCacheNewsfeedSmartFeedMergeDto;
    }

    public /* synthetic */ AccountInfoCacheNewsfeedDto(Integer num, Integer num2, AccountInfoCacheNewsfeedSmartFeedMergeDto accountInfoCacheNewsfeedSmartFeedMergeDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : accountInfoCacheNewsfeedSmartFeedMergeDto);
    }
}
