package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketGetServicesExtendedResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetServicesExtendedResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetServicesExtendedResponseDto> CREATOR = new a();

    @pmi0("is_skip_items_count")
    private final boolean isSkipItemsCount;

    @pmi0("items")
    private final List<MarketMarketItemFullDto> items;

    @pmi0("sections")
    private final List<MarketMarketServicesSectionDto> sections;

    @pmi0("sections_count")
    private final Integer sectionsCount;

    /* compiled from: MarketGetServicesExtendedResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetServicesExtendedResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetServicesExtendedResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i = 0;
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = en.a(MarketMarketItemFullDto.CREATOR, parcel, arrayList, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(MarketMarketServicesSectionDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new MarketGetServicesExtendedResponseDto(z, arrayList, arrayList2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetServicesExtendedResponseDto[] newArray(int i) {
            return new MarketGetServicesExtendedResponseDto[i];
        }
    }

    public MarketGetServicesExtendedResponseDto(boolean z, List<MarketMarketItemFullDto> list, List<MarketMarketServicesSectionDto> list2, Integer num) {
        this.isSkipItemsCount = z;
        this.items = list;
        this.sections = list2;
        this.sectionsCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetServicesExtendedResponseDto)) {
            return false;
        }
        MarketGetServicesExtendedResponseDto marketGetServicesExtendedResponseDto = (MarketGetServicesExtendedResponseDto) obj;
        return this.isSkipItemsCount == marketGetServicesExtendedResponseDto.isSkipItemsCount && epx.f(this.items, marketGetServicesExtendedResponseDto.items) && epx.f(this.sections, marketGetServicesExtendedResponseDto.sections) && epx.f(this.sectionsCount, marketGetServicesExtendedResponseDto.sectionsCount);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.isSkipItemsCount) * 31;
        List<MarketMarketItemFullDto> list = this.items;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<MarketMarketServicesSectionDto> list2 = this.sections;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.sectionsCount;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetServicesExtendedResponseDto(isSkipItemsCount=");
        sb.append(this.isSkipItemsCount);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", sections=");
        sb.append(this.sections);
        sb.append(", sectionsCount=");
        return uqi.b(sb, this.sectionsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isSkipItemsCount ? 1 : 0);
        List<MarketMarketItemFullDto> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MarketMarketItemFullDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MarketMarketServicesSectionDto> list2 = this.sections;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MarketMarketServicesSectionDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        Integer num = this.sectionsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarketGetServicesExtendedResponseDto(boolean z, List list, List list2, Integer num, int i, zcl zclVar) {
        this(z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : num);
    }
}
