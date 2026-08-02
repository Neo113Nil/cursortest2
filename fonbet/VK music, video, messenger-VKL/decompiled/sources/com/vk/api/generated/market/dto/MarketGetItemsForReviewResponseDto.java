package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: MarketGetItemsForReviewResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetItemsForReviewResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetItemsForReviewResponseDto> CREATOR = new a();

    @pmi0("config")
    private final MarketItemsForReviewConfigDto config;

    @pmi0("count")
    private final int count;

    @pmi0("has_next")
    private final boolean hasNext;

    @pmi0("items")
    private final List<MarketItemForReviewDto> items;

    @pmi0(SignalingProtocol.KEY_OFFSET)
    private final int offset;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketGetItemsForReviewResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetItemsForReviewResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsForReviewResponseDto createFromParcel(Parcel parcel) {
            int i;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (i != readInt3) {
                i = en.a(MarketItemForReviewDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MarketGetItemsForReviewResponseDto(readInt, readInt2, z, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : MarketItemsForReviewConfigDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetItemsForReviewResponseDto[] newArray(int i) {
            return new MarketGetItemsForReviewResponseDto[i];
        }
    }

    public MarketGetItemsForReviewResponseDto(int i, int i2, boolean z, List<MarketItemForReviewDto> list, String str, MarketItemsForReviewConfigDto marketItemsForReviewConfigDto) {
        this.offset = i;
        this.count = i2;
        this.hasNext = z;
        this.items = list;
        this.title = str;
        this.config = marketItemsForReviewConfigDto;
    }

    public final MarketItemsForReviewConfigDto d() {
        return this.config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MarketItemForReviewDto> e() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketGetItemsForReviewResponseDto)) {
            return false;
        }
        MarketGetItemsForReviewResponseDto marketGetItemsForReviewResponseDto = (MarketGetItemsForReviewResponseDto) obj;
        return this.offset == marketGetItemsForReviewResponseDto.offset && this.count == marketGetItemsForReviewResponseDto.count && this.hasNext == marketGetItemsForReviewResponseDto.hasNext && epx.f(this.items, marketGetItemsForReviewResponseDto.items) && epx.f(this.title, marketGetItemsForReviewResponseDto.title) && epx.f(this.config, marketGetItemsForReviewResponseDto.config);
    }

    public final int hashCode() {
        int a2 = fw3.a(qoy.b(shy.a(this.count, Integer.hashCode(this.offset) * 31, 31), 31, this.hasNext), 31, this.items);
        String str = this.title;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        MarketItemsForReviewConfigDto marketItemsForReviewConfigDto = this.config;
        return hashCode + (marketItemsForReviewConfigDto != null ? marketItemsForReviewConfigDto.hashCode() : 0);
    }

    public final String toString() {
        return "MarketGetItemsForReviewResponseDto(offset=" + this.offset + ", count=" + this.count + ", hasNext=" + this.hasNext + ", items=" + this.items + ", title=" + this.title + ", config=" + this.config + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.offset);
        parcel.writeInt(this.count);
        parcel.writeInt(this.hasNext ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((MarketItemForReviewDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        MarketItemsForReviewConfigDto marketItemsForReviewConfigDto = this.config;
        if (marketItemsForReviewConfigDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            marketItemsForReviewConfigDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MarketGetItemsForReviewResponseDto(int i, int i2, boolean z, List list, String str, MarketItemsForReviewConfigDto marketItemsForReviewConfigDto, int i3, zcl zclVar) {
        this(i, i2, z, list, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? null : marketItemsForReviewConfigDto);
    }
}
