package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoCacheDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoCacheDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoCacheDto> CREATOR = new a();

    @pmi0("discover")
    private final AccountInfoCacheDiscoverDto discover;

    @pmi0("newsfeed")
    private final AccountInfoCacheNewsfeedDto newsfeed;

    /* compiled from: AccountInfoCacheDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoCacheDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheDto createFromParcel(Parcel parcel) {
            return new AccountInfoCacheDto(parcel.readInt() == 0 ? null : AccountInfoCacheDiscoverDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountInfoCacheNewsfeedDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheDto[] newArray(int i) {
            return new AccountInfoCacheDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoCacheDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoCacheDto)) {
            return false;
        }
        AccountInfoCacheDto accountInfoCacheDto = (AccountInfoCacheDto) obj;
        return epx.f(this.discover, accountInfoCacheDto.discover) && epx.f(this.newsfeed, accountInfoCacheDto.newsfeed);
    }

    public final int hashCode() {
        AccountInfoCacheDiscoverDto accountInfoCacheDiscoverDto = this.discover;
        int hashCode = (accountInfoCacheDiscoverDto == null ? 0 : accountInfoCacheDiscoverDto.hashCode()) * 31;
        AccountInfoCacheNewsfeedDto accountInfoCacheNewsfeedDto = this.newsfeed;
        return hashCode + (accountInfoCacheNewsfeedDto != null ? accountInfoCacheNewsfeedDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountInfoCacheDto(discover=" + this.discover + ", newsfeed=" + this.newsfeed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountInfoCacheDiscoverDto accountInfoCacheDiscoverDto = this.discover;
        if (accountInfoCacheDiscoverDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoCacheDiscoverDto.writeToParcel(parcel, i);
        }
        AccountInfoCacheNewsfeedDto accountInfoCacheNewsfeedDto = this.newsfeed;
        if (accountInfoCacheNewsfeedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoCacheNewsfeedDto.writeToParcel(parcel, i);
        }
    }

    public AccountInfoCacheDto(AccountInfoCacheDiscoverDto accountInfoCacheDiscoverDto, AccountInfoCacheNewsfeedDto accountInfoCacheNewsfeedDto) {
        this.discover = accountInfoCacheDiscoverDto;
        this.newsfeed = accountInfoCacheNewsfeedDto;
    }

    public /* synthetic */ AccountInfoCacheDto(AccountInfoCacheDiscoverDto accountInfoCacheDiscoverDto, AccountInfoCacheNewsfeedDto accountInfoCacheNewsfeedDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountInfoCacheDiscoverDto, (i & 2) != 0 ? null : accountInfoCacheNewsfeedDto);
    }
}
