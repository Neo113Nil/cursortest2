package com.vk.api.generated.account.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: AccountGetBalanceResponseDto.kt */
/* loaded from: classes14.dex */
public final class AccountGetBalanceResponseDto implements Parcelable {
    public static final Parcelable.Creator<AccountGetBalanceResponseDto> CREATOR = new a();

    @pmi0("show_faq_banner")
    private final Boolean showFaqBanner;

    @pmi0("votes")
    private final int votes;

    @pmi0("votes_vklive")
    private final Integer votesVklive;

    /* compiled from: AccountGetBalanceResponseDto.kt */
    public static final class a implements Parcelable.Creator<AccountGetBalanceResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AccountGetBalanceResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AccountGetBalanceResponseDto(readInt, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final AccountGetBalanceResponseDto[] newArray(int i) {
            return new AccountGetBalanceResponseDto[i];
        }
    }

    public AccountGetBalanceResponseDto(int i, Integer num, Boolean bool) {
        this.votes = i;
        this.votesVklive = num;
        this.showFaqBanner = bool;
    }

    public final int d() {
        return this.votes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountGetBalanceResponseDto)) {
            return false;
        }
        AccountGetBalanceResponseDto accountGetBalanceResponseDto = (AccountGetBalanceResponseDto) obj;
        return this.votes == accountGetBalanceResponseDto.votes && epx.f(this.votesVklive, accountGetBalanceResponseDto.votesVklive) && epx.f(this.showFaqBanner, accountGetBalanceResponseDto.showFaqBanner);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.votes) * 31;
        Integer num = this.votesVklive;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.showFaqBanner;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountGetBalanceResponseDto(votes=");
        sb.append(this.votes);
        sb.append(", votesVklive=");
        sb.append(this.votesVklive);
        sb.append(", showFaqBanner=");
        return tn.a(sb, this.showFaqBanner, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.votes);
        Integer num = this.votesVklive;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.showFaqBanner;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ AccountGetBalanceResponseDto(int i, Integer num, Boolean bool, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : bool);
    }
}
