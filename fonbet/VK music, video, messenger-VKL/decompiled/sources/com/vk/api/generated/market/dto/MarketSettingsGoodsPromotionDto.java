package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: MarketSettingsGoodsPromotionDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsGoodsPromotionDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsGoodsPromotionDto> CREATOR = new a();

    @pmi0("can_promote")
    private final boolean canPromote;

    /* compiled from: MarketSettingsGoodsPromotionDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsGoodsPromotionDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsPromotionDto createFromParcel(Parcel parcel) {
            return new MarketSettingsGoodsPromotionDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsPromotionDto[] newArray(int i) {
            return new MarketSettingsGoodsPromotionDto[i];
        }
    }

    public MarketSettingsGoodsPromotionDto(boolean z) {
        this.canPromote = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketSettingsGoodsPromotionDto) && this.canPromote == ((MarketSettingsGoodsPromotionDto) obj).canPromote;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canPromote);
    }

    public final String toString() {
        return q0.a(new StringBuilder("MarketSettingsGoodsPromotionDto(canPromote="), this.canPromote, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.canPromote ? 1 : 0);
    }
}
