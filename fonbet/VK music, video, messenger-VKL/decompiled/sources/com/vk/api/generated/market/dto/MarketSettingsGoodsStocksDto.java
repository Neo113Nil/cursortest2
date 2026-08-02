package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: MarketSettingsGoodsStocksDto.kt */
/* loaded from: classes15.dex */
public final class MarketSettingsGoodsStocksDto implements Parcelable {
    public static final Parcelable.Creator<MarketSettingsGoodsStocksDto> CREATOR = new a();

    @pmi0("enabled")
    private final boolean enabled;

    /* compiled from: MarketSettingsGoodsStocksDto.kt */
    public static final class a implements Parcelable.Creator<MarketSettingsGoodsStocksDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsStocksDto createFromParcel(Parcel parcel) {
            return new MarketSettingsGoodsStocksDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketSettingsGoodsStocksDto[] newArray(int i) {
            return new MarketSettingsGoodsStocksDto[i];
        }
    }

    public MarketSettingsGoodsStocksDto(boolean z) {
        this.enabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketSettingsGoodsStocksDto) && this.enabled == ((MarketSettingsGoodsStocksDto) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return q0.a(new StringBuilder("MarketSettingsGoodsStocksDto(enabled="), this.enabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.enabled ? 1 : 0);
    }
}
