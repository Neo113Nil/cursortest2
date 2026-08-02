package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AccountSubscriptionsItemsInfoDto.kt */
/* loaded from: classes14.dex */
public final class AccountSubscriptionsItemsInfoDto implements Parcelable {
    public static final Parcelable.Creator<AccountSubscriptionsItemsInfoDto> CREATOR = new a();

    @pmi0("expires_date")
    private final Integer expiresDate;

    @pmi0("id")
    private final int id;

    /* compiled from: AccountSubscriptionsItemsInfoDto.kt */
    public static final class a implements Parcelable.Creator<AccountSubscriptionsItemsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountSubscriptionsItemsInfoDto createFromParcel(Parcel parcel) {
            return new AccountSubscriptionsItemsInfoDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AccountSubscriptionsItemsInfoDto[] newArray(int i) {
            return new AccountSubscriptionsItemsInfoDto[i];
        }
    }

    public AccountSubscriptionsItemsInfoDto(int i, Integer num) {
        this.id = i;
        this.expiresDate = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSubscriptionsItemsInfoDto)) {
            return false;
        }
        AccountSubscriptionsItemsInfoDto accountSubscriptionsItemsInfoDto = (AccountSubscriptionsItemsInfoDto) obj;
        return this.id == accountSubscriptionsItemsInfoDto.id && epx.f(this.expiresDate, accountSubscriptionsItemsInfoDto.expiresDate);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.expiresDate;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSubscriptionsItemsInfoDto(id=");
        sb.append(this.id);
        sb.append(", expiresDate=");
        return uqi.b(sb, this.expiresDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        Integer num = this.expiresDate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AccountSubscriptionsItemsInfoDto(int i, Integer num, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num);
    }
}
