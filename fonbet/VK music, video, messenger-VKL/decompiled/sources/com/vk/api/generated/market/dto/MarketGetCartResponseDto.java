package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.wp;
import xsna.zcl;

/* compiled from: MarketGetCartResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCartResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCartResponseDto> CREATOR = new a();

    @pmi0("banner")
    private final MarketItemBannerDto banner;

    @pmi0("contains_deleted_items")
    private final BaseBoolIntDto containsDeletedItems;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemDto> items;

    /* compiled from: MarketGetCartResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCartResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCartResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(MarketGetCartResponseDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketGetCartResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MarketGetCartResponseDto(readInt, baseBoolIntDto, arrayList, parcel.readInt() == 0 ? null : MarketItemBannerDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCartResponseDto[] newArray(int i) {
            return new MarketGetCartResponseDto[i];
        }
    }

    public MarketGetCartResponseDto(int i, BaseBoolIntDto baseBoolIntDto, List<MarketMarketItemDto> list, MarketItemBannerDto marketItemBannerDto) {
        this.count = i;
        this.containsDeletedItems = baseBoolIntDto;
        this.items = list;
        this.banner = marketItemBannerDto;
    }

    public final List<MarketMarketItemDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetCartResponseDto)) {
            return false;
        }
        MarketGetCartResponseDto marketGetCartResponseDto = (MarketGetCartResponseDto) obj;
        return this.count == marketGetCartResponseDto.count && this.containsDeletedItems == marketGetCartResponseDto.containsDeletedItems && epx.f(this.items, marketGetCartResponseDto.items) && epx.f(this.banner, marketGetCartResponseDto.banner);
    }

    public final int hashCode() {
        int a2 = fw3.a(wp.b(this.containsDeletedItems, Integer.hashCode(this.count) * 31, 31), 31, this.items);
        MarketItemBannerDto marketItemBannerDto = this.banner;
        return a2 + (marketItemBannerDto == null ? 0 : marketItemBannerDto.hashCode());
    }

    public final String toString() {
        return "MarketGetCartResponseDto(count=" + this.count + ", containsDeletedItems=" + this.containsDeletedItems + ", items=" + this.items + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeParcelable(this.containsDeletedItems, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        MarketItemBannerDto marketItemBannerDto = this.banner;
        if (marketItemBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemBannerDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketGetCartResponseDto(int i, BaseBoolIntDto baseBoolIntDto, List list, MarketItemBannerDto marketItemBannerDto, int i2, zcl zclVar) {
        this(i, baseBoolIntDto, list, (i2 & 8) != 0 ? null : marketItemBannerDto);
    }
}
