package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoPageSizeDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoPageSizeDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoPageSizeDto> CREATOR = new a();

    @pmi0("newsfeed")
    private final AccountInfoPageSizeNewsfeedDto newsfeed;

    /* compiled from: AccountInfoPageSizeDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoPageSizeDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoPageSizeDto createFromParcel(Parcel parcel) {
            return new AccountInfoPageSizeDto(parcel.readInt() == 0 ? null : AccountInfoPageSizeNewsfeedDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoPageSizeDto[] newArray(int i) {
            return new AccountInfoPageSizeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoPageSizeDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountInfoPageSizeDto) && epx.f(this.newsfeed, ((AccountInfoPageSizeDto) obj).newsfeed);
    }

    public final int hashCode() {
        AccountInfoPageSizeNewsfeedDto accountInfoPageSizeNewsfeedDto = this.newsfeed;
        if (accountInfoPageSizeNewsfeedDto == null) {
            return 0;
        }
        return accountInfoPageSizeNewsfeedDto.hashCode();
    }

    public final String toString() {
        return "AccountInfoPageSizeDto(newsfeed=" + this.newsfeed + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountInfoPageSizeNewsfeedDto accountInfoPageSizeNewsfeedDto = this.newsfeed;
        if (accountInfoPageSizeNewsfeedDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoPageSizeNewsfeedDto.writeToParcel(parcel, i);
        }
    }

    public AccountInfoPageSizeDto(AccountInfoPageSizeNewsfeedDto accountInfoPageSizeNewsfeedDto) {
        this.newsfeed = accountInfoPageSizeNewsfeedDto;
    }

    public /* synthetic */ AccountInfoPageSizeDto(AccountInfoPageSizeNewsfeedDto accountInfoPageSizeNewsfeedDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountInfoPageSizeNewsfeedDto);
    }
}
