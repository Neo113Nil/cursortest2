package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: AccountInfoMarketAdult18plusDto.kt */
/* loaded from: classes14.dex */
public final class AccountInfoMarketAdult18plusDto implements Parcelable {
    public static final Parcelable.Creator<AccountInfoMarketAdult18plusDto> CREATOR = new a();

    @pmi0("is_adult_by_profile")
    private final boolean isAdultByProfile;

    @pmi0("is_adult_confirm")
    private final boolean isAdultConfirm;

    /* compiled from: AccountInfoMarketAdult18plusDto.kt */
    public static final class a implements Parcelable.Creator<AccountInfoMarketAdult18plusDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountInfoMarketAdult18plusDto createFromParcel(Parcel parcel) {
            return new AccountInfoMarketAdult18plusDto(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountInfoMarketAdult18plusDto[] newArray(int i) {
            return new AccountInfoMarketAdult18plusDto[i];
        }
    }

    public AccountInfoMarketAdult18plusDto(boolean z, boolean z2) {
        this.isAdultByProfile = z;
        this.isAdultConfirm = z2;
    }

    public final boolean d() {
        return this.isAdultByProfile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.isAdultConfirm;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountInfoMarketAdult18plusDto)) {
            return false;
        }
        AccountInfoMarketAdult18plusDto accountInfoMarketAdult18plusDto = (AccountInfoMarketAdult18plusDto) obj;
        return this.isAdultByProfile == accountInfoMarketAdult18plusDto.isAdultByProfile && this.isAdultConfirm == accountInfoMarketAdult18plusDto.isAdultConfirm;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAdultConfirm) + (Boolean.hashCode(this.isAdultByProfile) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountInfoMarketAdult18plusDto(isAdultByProfile=");
        sb.append(this.isAdultByProfile);
        sb.append(", isAdultConfirm=");
        return q0.a(sb, this.isAdultConfirm, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isAdultByProfile ? 1 : 0);
        parcel.writeInt(this.isAdultConfirm ? 1 : 0);
    }
}
