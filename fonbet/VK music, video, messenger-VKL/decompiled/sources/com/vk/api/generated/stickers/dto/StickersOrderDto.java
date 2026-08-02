package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.store.dto.StoreAdditionalViewPriceDto;
import com.vk.api.generated.store.dto.StoreStockItemDto;
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

/* compiled from: StickersOrderDto.kt */
/* loaded from: classes15.dex */
public final class StickersOrderDto implements Parcelable {
    public static final Parcelable.Creator<StickersOrderDto> CREATOR = new a();

    @pmi0("additional_view_price_buy")
    private final StoreAdditionalViewPriceDto additionalViewPriceBuy;

    @pmi0("error")
    private final String error;

    @pmi0("id")
    private final String id;

    @pmi0("items")
    private final List<StickersOrderItemDto> items;

    @pmi0("price")
    private final StickersOrderPriceDto price;

    @pmi0("products")
    private final List<StoreStockItemDto> products;

    @pmi0("recipients")
    private final List<StickersOrderRecipientDto> recipients;

    /* compiled from: StickersOrderDto.kt */
    public static final class a implements Parcelable.Creator<StickersOrderDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersOrderDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int readInt = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(StickersOrderItemDto.CREATOR, parcel, arrayList3, i2, 1);
            }
            StickersOrderPriceDto createFromParcel = parcel.readInt() == 0 ? null : StickersOrderPriceDto.CREATOR.createFromParcel(parcel);
            StoreAdditionalViewPriceDto createFromParcel2 = parcel.readInt() == 0 ? null : StoreAdditionalViewPriceDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i3 = 0;
                while (i3 != readInt2) {
                    i3 = en.a(StickersOrderRecipientDto.CREATOR, parcel, arrayList, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                while (i != readInt3) {
                    i = en.a(StoreStockItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new StickersOrderDto(arrayList3, createFromParcel, createFromParcel2, readString, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersOrderDto[] newArray(int i) {
            return new StickersOrderDto[i];
        }
    }

    public StickersOrderDto(List<StickersOrderItemDto> list, StickersOrderPriceDto stickersOrderPriceDto, StoreAdditionalViewPriceDto storeAdditionalViewPriceDto, String str, List<StickersOrderRecipientDto> list2, List<StoreStockItemDto> list3, String str2) {
        this.items = list;
        this.price = stickersOrderPriceDto;
        this.additionalViewPriceBuy = storeAdditionalViewPriceDto;
        this.error = str;
        this.recipients = list2;
        this.products = list3;
        this.id = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersOrderDto)) {
            return false;
        }
        StickersOrderDto stickersOrderDto = (StickersOrderDto) obj;
        return epx.f(this.items, stickersOrderDto.items) && epx.f(this.price, stickersOrderDto.price) && epx.f(this.additionalViewPriceBuy, stickersOrderDto.additionalViewPriceBuy) && epx.f(this.error, stickersOrderDto.error) && epx.f(this.recipients, stickersOrderDto.recipients) && epx.f(this.products, stickersOrderDto.products) && epx.f(this.id, stickersOrderDto.id);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        StickersOrderPriceDto stickersOrderPriceDto = this.price;
        int hashCode2 = (hashCode + (stickersOrderPriceDto == null ? 0 : stickersOrderPriceDto.hashCode())) * 31;
        StoreAdditionalViewPriceDto storeAdditionalViewPriceDto = this.additionalViewPriceBuy;
        int hashCode3 = (hashCode2 + (storeAdditionalViewPriceDto == null ? 0 : storeAdditionalViewPriceDto.hashCode())) * 31;
        String str = this.error;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<StickersOrderRecipientDto> list = this.recipients;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<StoreStockItemDto> list2 = this.products;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.id;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersOrderDto(items=");
        sb.append(this.items);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", additionalViewPriceBuy=");
        sb.append(this.additionalViewPriceBuy);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", recipients=");
        sb.append(this.recipients);
        sb.append(", products=");
        sb.append(this.products);
        sb.append(", id=");
        return ho8.a(sb, this.id, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((StickersOrderItemDto) a2.next()).writeToParcel(parcel, i);
        }
        StickersOrderPriceDto stickersOrderPriceDto = this.price;
        if (stickersOrderPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersOrderPriceDto.writeToParcel(parcel, i);
        }
        StoreAdditionalViewPriceDto storeAdditionalViewPriceDto = this.additionalViewPriceBuy;
        if (storeAdditionalViewPriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            storeAdditionalViewPriceDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.error);
        List<StickersOrderRecipientDto> list = this.recipients;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StickersOrderRecipientDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<StoreStockItemDto> list2 = this.products;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((StoreStockItemDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.id);
    }

    public /* synthetic */ StickersOrderDto(List list, StickersOrderPriceDto stickersOrderPriceDto, StoreAdditionalViewPriceDto storeAdditionalViewPriceDto, String str, List list2, List list3, String str2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : stickersOrderPriceDto, (i & 4) != 0 ? null : storeAdditionalViewPriceDto, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : str2);
    }
}
