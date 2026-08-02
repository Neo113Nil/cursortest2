package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketMarketGetItemResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketMarketGetItemResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketMarketGetItemResponseObjectDto> CREATOR = new a();

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final MarketMarketItemFullDto item;

    /* compiled from: MarketMarketGetItemResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketMarketGetItemResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketMarketGetItemResponseObjectDto createFromParcel(Parcel parcel) {
            return new MarketMarketGetItemResponseObjectDto(parcel.readInt() == 0 ? null : MarketMarketItemFullDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketMarketGetItemResponseObjectDto[] newArray(int i) {
            return new MarketMarketGetItemResponseObjectDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarketMarketGetItemResponseObjectDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final MarketMarketItemFullDto d() {
        return this.item;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MarketMarketGetItemResponseObjectDto) && epx.f(this.item, ((MarketMarketGetItemResponseObjectDto) obj).item);
    }

    public final int hashCode() {
        MarketMarketItemFullDto marketMarketItemFullDto = this.item;
        if (marketMarketItemFullDto == null) {
            return 0;
        }
        return marketMarketItemFullDto.hashCode();
    }

    public final String toString() {
        return "MarketMarketGetItemResponseObjectDto(item=" + this.item + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MarketMarketItemFullDto marketMarketItemFullDto = this.item;
        if (marketMarketItemFullDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketMarketItemFullDto.writeToParcel(parcel, i);
        }
    }

    public MarketMarketGetItemResponseObjectDto(MarketMarketItemFullDto marketMarketItemFullDto) {
        this.item = marketMarketItemFullDto;
    }

    public /* synthetic */ MarketMarketGetItemResponseObjectDto(MarketMarketItemFullDto marketMarketItemFullDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : marketMarketItemFullDto);
    }
}
