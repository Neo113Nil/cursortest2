package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreStockItemDiscountsDto.kt */
/* loaded from: classes15.dex */
public final class StoreStockItemDiscountsDto implements Parcelable {
    public static final Parcelable.Creator<StoreStockItemDiscountsDto> CREATOR = new a();

    @pmi0("items")
    private final List<StoreStockItemDiscountDto> items;

    @pmi0("next_from")
    private final String nextFrom;

    /* compiled from: StoreStockItemDiscountsDto.kt */
    public static final class a implements Parcelable.Creator<StoreStockItemDiscountsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStockItemDiscountsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(StoreStockItemDiscountDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new StoreStockItemDiscountsDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStockItemDiscountsDto[] newArray(int i) {
            return new StoreStockItemDiscountsDto[i];
        }
    }

    public StoreStockItemDiscountsDto(List<StoreStockItemDiscountDto> list, String str) {
        this.items = list;
        this.nextFrom = str;
    }

    public final List<StoreStockItemDiscountDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.nextFrom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStockItemDiscountsDto)) {
            return false;
        }
        StoreStockItemDiscountsDto storeStockItemDiscountsDto = (StoreStockItemDiscountsDto) obj;
        return epx.f(this.items, storeStockItemDiscountsDto.items) && epx.f(this.nextFrom, storeStockItemDiscountsDto.nextFrom);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        String str = this.nextFrom;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreStockItemDiscountsDto(items=");
        sb.append(this.items);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.nextFrom, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StoreStockItemDiscountDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.nextFrom);
    }

    public /* synthetic */ StoreStockItemDiscountsDto(List list, String str, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
