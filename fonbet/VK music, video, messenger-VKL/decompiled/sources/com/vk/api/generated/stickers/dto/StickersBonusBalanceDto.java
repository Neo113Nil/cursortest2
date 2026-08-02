package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: StickersBonusBalanceDto.kt */
/* loaded from: classes15.dex */
public final class StickersBonusBalanceDto implements Parcelable {
    public static final Parcelable.Creator<StickersBonusBalanceDto> CREATOR = new a();

    @pmi0("next_expire_timestamp")
    private final Integer nextExpireTimestamp;

    @pmi0("next_expire_value")
    private final Integer nextExpireValue;

    @pmi0("rewards_max_price")
    private final Integer rewardsMaxPrice;

    @pmi0("rewards_min_price")
    private final Integer rewardsMinPrice;

    @pmi0("rewards_total_price")
    private final int rewardsTotalPrice;

    @pmi0("value")
    private final int value;

    /* compiled from: StickersBonusBalanceDto.kt */
    public static final class a implements Parcelable.Creator<StickersBonusBalanceDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersBonusBalanceDto createFromParcel(Parcel parcel) {
            return new StickersBonusBalanceDto(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersBonusBalanceDto[] newArray(int i) {
            return new StickersBonusBalanceDto[i];
        }
    }

    public StickersBonusBalanceDto(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4) {
        this.value = i;
        this.rewardsTotalPrice = i2;
        this.nextExpireTimestamp = num;
        this.nextExpireValue = num2;
        this.rewardsMinPrice = num3;
        this.rewardsMaxPrice = num4;
    }

    public final Integer d() {
        return this.nextExpireTimestamp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.nextExpireValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersBonusBalanceDto)) {
            return false;
        }
        StickersBonusBalanceDto stickersBonusBalanceDto = (StickersBonusBalanceDto) obj;
        return this.value == stickersBonusBalanceDto.value && this.rewardsTotalPrice == stickersBonusBalanceDto.rewardsTotalPrice && epx.f(this.nextExpireTimestamp, stickersBonusBalanceDto.nextExpireTimestamp) && epx.f(this.nextExpireValue, stickersBonusBalanceDto.nextExpireValue) && epx.f(this.rewardsMinPrice, stickersBonusBalanceDto.rewardsMinPrice) && epx.f(this.rewardsMaxPrice, stickersBonusBalanceDto.rewardsMaxPrice);
    }

    public final Integer f() {
        return this.rewardsMinPrice;
    }

    public final int g() {
        return this.rewardsTotalPrice;
    }

    public final int hashCode() {
        int a2 = shy.a(this.rewardsTotalPrice, Integer.hashCode(this.value) * 31, 31);
        Integer num = this.nextExpireTimestamp;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.nextExpireValue;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rewardsMinPrice;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.rewardsMaxPrice;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final int i() {
        return this.value;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersBonusBalanceDto(value=");
        sb.append(this.value);
        sb.append(", rewardsTotalPrice=");
        sb.append(this.rewardsTotalPrice);
        sb.append(", nextExpireTimestamp=");
        sb.append(this.nextExpireTimestamp);
        sb.append(", nextExpireValue=");
        sb.append(this.nextExpireValue);
        sb.append(", rewardsMinPrice=");
        sb.append(this.rewardsMinPrice);
        sb.append(", rewardsMaxPrice=");
        return uqi.b(sb, this.rewardsMaxPrice, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.value);
        parcel.writeInt(this.rewardsTotalPrice);
        Integer num = this.nextExpireTimestamp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.nextExpireValue;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.rewardsMinPrice;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.rewardsMaxPrice;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
    }

    public /* synthetic */ StickersBonusBalanceDto(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, int i3, zcl zclVar) {
        this(i, i2, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? null : num2, (i3 & 16) != 0 ? null : num3, (i3 & 32) != 0 ? null : num4);
    }
}
