package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketItemPromotionInfoDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemPromotionInfoDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemPromotionInfoDto> CREATOR = new a();

    @pmi0("is_available")
    private final Boolean isAvailable;

    /* compiled from: MarketItemPromotionInfoDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemPromotionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemPromotionInfoDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketItemPromotionInfoDto(valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemPromotionInfoDto[] newArray(int i) {
            return new MarketItemPromotionInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketItemPromotionInfoDto() {
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
        return (obj instanceof MarketItemPromotionInfoDto) && epx.f(this.isAvailable, ((MarketItemPromotionInfoDto) obj).isAvailable);
    }

    public final int hashCode() {
        Boolean bool = this.isAvailable;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return tn.a(new StringBuilder("MarketItemPromotionInfoDto(isAvailable="), this.isAvailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Boolean bool = this.isAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public MarketItemPromotionInfoDto(Boolean bool) {
        this.isAvailable = bool;
    }

    public /* synthetic */ MarketItemPromotionInfoDto(Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : bool);
    }
}
