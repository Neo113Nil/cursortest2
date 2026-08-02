package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoCacheDiscoverDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoCacheDiscoverDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoCacheDiscoverDto> CREATOR = new a();

    @pmi0("preload")
    private final Integer preload;

    @pmi0("preload_not_seen")
    private final Integer preloadNotSeen;

    @pmi0("valid_from")
    private final AccountInfoCacheDiscoverValidFromDto validFrom;

    /* compiled from: AccountInfoCacheDiscoverDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoCacheDiscoverDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheDiscoverDto createFromParcel(Parcel parcel) {
            return new AccountInfoCacheDiscoverDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? AccountInfoCacheDiscoverValidFromDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoCacheDiscoverDto[] newArray(int i) {
            return new AccountInfoCacheDiscoverDto[i];
        }
    }

    public AccountInfoCacheDiscoverDto() {
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
        if (!(obj instanceof AccountInfoCacheDiscoverDto)) {
            return false;
        }
        AccountInfoCacheDiscoverDto accountInfoCacheDiscoverDto = (AccountInfoCacheDiscoverDto) obj;
        return epx.f(this.preload, accountInfoCacheDiscoverDto.preload) && epx.f(this.preloadNotSeen, accountInfoCacheDiscoverDto.preloadNotSeen) && epx.f(this.validFrom, accountInfoCacheDiscoverDto.validFrom);
    }

    public final int hashCode() {
        Integer num = this.preload;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.preloadNotSeen;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        AccountInfoCacheDiscoverValidFromDto accountInfoCacheDiscoverValidFromDto = this.validFrom;
        return hashCode2 + (accountInfoCacheDiscoverValidFromDto != null ? accountInfoCacheDiscoverValidFromDto.hashCode() : 0);
    }

    public final String toString() {
        return "AccountInfoCacheDiscoverDto(preload=" + this.preload + ", preloadNotSeen=" + this.preloadNotSeen + ", validFrom=" + this.validFrom + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.preload;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.preloadNotSeen;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        AccountInfoCacheDiscoverValidFromDto accountInfoCacheDiscoverValidFromDto = this.validFrom;
        if (accountInfoCacheDiscoverValidFromDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoCacheDiscoverValidFromDto.writeToParcel(parcel, i);
        }
    }

    public AccountInfoCacheDiscoverDto(Integer num, Integer num2, AccountInfoCacheDiscoverValidFromDto accountInfoCacheDiscoverValidFromDto) {
        this.preload = num;
        this.preloadNotSeen = num2;
        this.validFrom = accountInfoCacheDiscoverValidFromDto;
    }

    public /* synthetic */ AccountInfoCacheDiscoverDto(Integer num, Integer num2, AccountInfoCacheDiscoverValidFromDto accountInfoCacheDiscoverValidFromDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : accountInfoCacheDiscoverValidFromDto);
    }
}
