package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AccountInfoPageSizeNewsfeedDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoPageSizeNewsfeedDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoPageSizeNewsfeedDto> CREATOR = new a();

    @pmi0("recent")
    private final AccountInfoPageSizeNewsfeedSectionDto recent;

    @pmi0("top")
    private final AccountInfoPageSizeNewsfeedSectionDto top;

    /* compiled from: AccountInfoPageSizeNewsfeedDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoPageSizeNewsfeedDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoPageSizeNewsfeedDto createFromParcel(Parcel parcel) {
            return new AccountInfoPageSizeNewsfeedDto(parcel.readInt() == 0 ? null : AccountInfoPageSizeNewsfeedSectionDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AccountInfoPageSizeNewsfeedSectionDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoPageSizeNewsfeedDto[] newArray(int i) {
            return new AccountInfoPageSizeNewsfeedDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountInfoPageSizeNewsfeedDto() {
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
        if (!(obj instanceof AccountInfoPageSizeNewsfeedDto)) {
            return false;
        }
        AccountInfoPageSizeNewsfeedDto accountInfoPageSizeNewsfeedDto = (AccountInfoPageSizeNewsfeedDto) obj;
        return epx.f(this.top, accountInfoPageSizeNewsfeedDto.top) && epx.f(this.recent, accountInfoPageSizeNewsfeedDto.recent);
    }

    public final int hashCode() {
        AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto = this.top;
        int hashCode = (accountInfoPageSizeNewsfeedSectionDto == null ? 0 : accountInfoPageSizeNewsfeedSectionDto.hashCode()) * 31;
        AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto2 = this.recent;
        return hashCode + (accountInfoPageSizeNewsfeedSectionDto2 != null ? accountInfoPageSizeNewsfeedSectionDto2.hashCode() : 0);
    }

    public final String toString() {
        return "AccountInfoPageSizeNewsfeedDto(top=" + this.top + ", recent=" + this.recent + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto = this.top;
        if (accountInfoPageSizeNewsfeedSectionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoPageSizeNewsfeedSectionDto.writeToParcel(parcel, i);
        }
        AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto2 = this.recent;
        if (accountInfoPageSizeNewsfeedSectionDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountInfoPageSizeNewsfeedSectionDto2.writeToParcel(parcel, i);
        }
    }

    public AccountInfoPageSizeNewsfeedDto(AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto, AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto2) {
        this.top = accountInfoPageSizeNewsfeedSectionDto;
        this.recent = accountInfoPageSizeNewsfeedSectionDto2;
    }

    public /* synthetic */ AccountInfoPageSizeNewsfeedDto(AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto, AccountInfoPageSizeNewsfeedSectionDto accountInfoPageSizeNewsfeedSectionDto2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : accountInfoPageSizeNewsfeedSectionDto, (i & 2) != 0 ? null : accountInfoPageSizeNewsfeedSectionDto2);
    }
}
