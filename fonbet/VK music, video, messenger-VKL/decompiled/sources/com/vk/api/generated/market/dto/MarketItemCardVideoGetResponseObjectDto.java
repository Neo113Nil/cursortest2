package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MarketItemCardVideoGetResponseObjectDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemCardVideoGetResponseObjectDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemCardVideoGetResponseObjectDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("items")
    private final List<VideoVideoFullDto> items;

    @pmi0("max_attached_short_videos")
    private final Integer maxAttachedShortVideos;

    /* compiled from: MarketItemCardVideoGetResponseObjectDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemCardVideoGetResponseObjectDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemCardVideoGetResponseObjectDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MarketItemCardVideoGetResponseObjectDto.class, parcel, arrayList, i, 1);
            }
            return new MarketItemCardVideoGetResponseObjectDto(readInt, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemCardVideoGetResponseObjectDto[] newArray(int i) {
            return new MarketItemCardVideoGetResponseObjectDto[i];
        }
    }

    public MarketItemCardVideoGetResponseObjectDto(int i, List<VideoVideoFullDto> list, Integer num) {
        this.count = i;
        this.items = list;
        this.maxAttachedShortVideos = num;
    }

    public final List<VideoVideoFullDto> d() {
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
        if (!(obj instanceof MarketItemCardVideoGetResponseObjectDto)) {
            return false;
        }
        MarketItemCardVideoGetResponseObjectDto marketItemCardVideoGetResponseObjectDto = (MarketItemCardVideoGetResponseObjectDto) obj;
        return this.count == marketItemCardVideoGetResponseObjectDto.count && epx.f(this.items, marketItemCardVideoGetResponseObjectDto.items) && epx.f(this.maxAttachedShortVideos, marketItemCardVideoGetResponseObjectDto.maxAttachedShortVideos);
    }

    public final int hashCode() {
        int a2 = fw3.a(Integer.hashCode(this.count) * 31, 31, this.items);
        Integer num = this.maxAttachedShortVideos;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemCardVideoGetResponseObjectDto(count=");
        sb.append(this.count);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", maxAttachedShortVideos=");
        return uqi.b(sb, this.maxAttachedShortVideos, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Integer num = this.maxAttachedShortVideos;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MarketItemCardVideoGetResponseObjectDto(int i, List list, Integer num, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : num);
    }
}
