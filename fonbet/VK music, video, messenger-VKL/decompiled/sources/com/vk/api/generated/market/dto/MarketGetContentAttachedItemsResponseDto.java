package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarketGetContentAttachedItemsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetContentAttachedItemsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetContentAttachedItemsResponseDto> CREATOR = new a();

    @pmi0("content_items")
    private final List<MarketMarketItemFullDto> contentItems;

    @pmi0("market_link")
    private final String marketLink;

    @pmi0("market_other_items")
    private final List<MarketMarketItemFullDto> marketOtherItems;

    /* compiled from: MarketGetContentAttachedItemsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetContentAttachedItemsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetContentAttachedItemsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new MarketGetContentAttachedItemsResponseDto(arrayList2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetContentAttachedItemsResponseDto[] newArray(int i) {
            return new MarketGetContentAttachedItemsResponseDto[i];
        }
    }

    public MarketGetContentAttachedItemsResponseDto(List<MarketMarketItemFullDto> list, List<MarketMarketItemFullDto> list2, String str) {
        this.contentItems = list;
        this.marketOtherItems = list2;
        this.marketLink = str;
    }

    public final List<MarketMarketItemFullDto> d() {
        return this.contentItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.marketLink;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetContentAttachedItemsResponseDto)) {
            return false;
        }
        MarketGetContentAttachedItemsResponseDto marketGetContentAttachedItemsResponseDto = (MarketGetContentAttachedItemsResponseDto) obj;
        return epx.f(this.contentItems, marketGetContentAttachedItemsResponseDto.contentItems) && epx.f(this.marketOtherItems, marketGetContentAttachedItemsResponseDto.marketOtherItems) && epx.f(this.marketLink, marketGetContentAttachedItemsResponseDto.marketLink);
    }

    public final List<MarketMarketItemFullDto> f() {
        return this.marketOtherItems;
    }

    public final int hashCode() {
        int hashCode = this.contentItems.hashCode() * 31;
        List<MarketMarketItemFullDto> list = this.marketOtherItems;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.marketLink;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetContentAttachedItemsResponseDto(contentItems=");
        sb.append(this.contentItems);
        sb.append(", marketOtherItems=");
        sb.append(this.marketOtherItems);
        sb.append(", marketLink=");
        return ho8.a(sb, this.marketLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.contentItems);
        while (a2.hasNext()) {
            ((MarketMarketItemFullDto) a2.next()).writeToParcel(parcel, i);
        }
        List<MarketMarketItemFullDto> list = this.marketOtherItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketMarketItemFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.marketLink);
    }

    public /* synthetic */ MarketGetContentAttachedItemsResponseDto(List list, List list2, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }
}
