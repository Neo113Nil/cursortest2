package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.wp;
import xsna.zcl;

/* compiled from: MarketGetCartExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetCartExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetCartExtendedResponseDto> CREATOR = new a();

    @pmi0("banner")
    private final MarketItemBannerDto banner;

    @pmi0("contains_deleted_items")
    private final BaseBoolIntDto containsDeletedItems;

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    /* compiled from: MarketGetCartExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetCartExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetCartExtendedResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(MarketGetCartExtendedResponseDto.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetCartExtendedResponseDto(readInt, baseBoolIntDto, arrayList, parcel.readInt() == 0 ? null : MarketItemBannerDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetCartExtendedResponseDto[] newArray(int i) {
            return new MarketGetCartExtendedResponseDto[i];
        }
    }

    public MarketGetCartExtendedResponseDto(int i, BaseBoolIntDto baseBoolIntDto, List<MarketMarketItemFullDto> list, MarketItemBannerDto marketItemBannerDto) {
        this.count = i;
        this.containsDeletedItems = baseBoolIntDto;
        this.items = list;
        this.banner = marketItemBannerDto;
    }

    public final List<MarketMarketItemFullDto> d() {
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
        if (!(obj instanceof MarketGetCartExtendedResponseDto)) {
            return false;
        }
        MarketGetCartExtendedResponseDto marketGetCartExtendedResponseDto = (MarketGetCartExtendedResponseDto) obj;
        return this.count == marketGetCartExtendedResponseDto.count && this.containsDeletedItems == marketGetCartExtendedResponseDto.containsDeletedItems && epx.f(this.items, marketGetCartExtendedResponseDto.items) && epx.f(this.banner, marketGetCartExtendedResponseDto.banner);
    }

    public final int hashCode() {
        int a2 = fw3.a(wp.b(this.containsDeletedItems, Integer.hashCode(this.count) * 31, 31), 31, this.items);
        MarketItemBannerDto marketItemBannerDto = this.banner;
        return a2 + (marketItemBannerDto == null ? 0 : marketItemBannerDto.hashCode());
    }

    public final String toString() {
        return "MarketGetCartExtendedResponseDto(count=" + this.count + ", containsDeletedItems=" + this.containsDeletedItems + ", items=" + this.items + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        parcel.writeParcelable(this.containsDeletedItems, i);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketMarketItemFullDto) a2.next()).writeToParcel(parcel, i);
        }
        MarketItemBannerDto marketItemBannerDto = this.banner;
        if (marketItemBannerDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemBannerDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketGetCartExtendedResponseDto(int i, BaseBoolIntDto baseBoolIntDto, List list, MarketItemBannerDto marketItemBannerDto, int i2, zcl zclVar) {
        this(i, baseBoolIntDto, list, (i2 & 8) != 0 ? null : marketItemBannerDto);
    }
}
