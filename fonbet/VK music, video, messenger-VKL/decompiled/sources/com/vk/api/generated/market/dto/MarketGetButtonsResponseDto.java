package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MarketGetButtonsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarketGetButtonsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarketGetButtonsResponseDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("enabled")
    private final Boolean enabled;

    @pmi0("items")
    private final List<MarketCustomButtonFullDto> items;

    /* compiled from: MarketGetButtonsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarketGetButtonsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketGetButtonsResponseDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MarketGetButtonsResponseDto.class, parcel, arrayList, i, 1);
            }
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarketGetButtonsResponseDto(arrayList, readInt2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketGetButtonsResponseDto[] newArray(int i) {
            return new MarketGetButtonsResponseDto[i];
        }
    }

    public MarketGetButtonsResponseDto(List<MarketCustomButtonFullDto> list, int i, Boolean bool) {
        this.items = list;
        this.count = i;
        this.enabled = bool;
    }

    public final List<MarketCustomButtonFullDto> d() {
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
        if (!(obj instanceof MarketGetButtonsResponseDto)) {
            return false;
        }
        MarketGetButtonsResponseDto marketGetButtonsResponseDto = (MarketGetButtonsResponseDto) obj;
        return epx.f(this.items, marketGetButtonsResponseDto.items) && this.count == marketGetButtonsResponseDto.count && epx.f(this.enabled, marketGetButtonsResponseDto.enabled);
    }

    public final int hashCode() {
        int a2 = shy.a(this.count, this.items.hashCode() * 31, 31);
        Boolean bool = this.enabled;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetButtonsResponseDto(items=");
        sb.append(this.items);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", enabled=");
        return tn.a(sb, this.enabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.count);
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MarketGetButtonsResponseDto(List list, int i, Boolean bool, int i2, zcl zclVar) {
        this(list, i, (i2 & 4) != 0 ? null : bool);
    }
}
