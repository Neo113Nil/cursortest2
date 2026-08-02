package com.vk.api.generated.store.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StoreStockItemMerchantRestrictionsDto.kt */
/* loaded from: classes15.dex */
public final class StoreStockItemMerchantRestrictionsDto implements Parcelable {
    public static final Parcelable.Creator<StoreStockItemMerchantRestrictionsDto> CREATOR = new a();

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final List<String> currency;

    @pmi0("max_price")
    private final List<StorePriceDto> maxPrice;

    @pmi0("text")
    private final String text;

    /* compiled from: StoreStockItemMerchantRestrictionsDto.kt */
    public static final class a implements Parcelable.Creator<StoreStockItemMerchantRestrictionsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoreStockItemMerchantRestrictionsDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StorePriceDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StoreStockItemMerchantRestrictionsDto(createStringArrayList, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoreStockItemMerchantRestrictionsDto[] newArray(int i) {
            return new StoreStockItemMerchantRestrictionsDto[i];
        }
    }

    public StoreStockItemMerchantRestrictionsDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreStockItemMerchantRestrictionsDto)) {
            return false;
        }
        StoreStockItemMerchantRestrictionsDto storeStockItemMerchantRestrictionsDto = (StoreStockItemMerchantRestrictionsDto) obj;
        return epx.f(this.currency, storeStockItemMerchantRestrictionsDto.currency) && epx.f(this.maxPrice, storeStockItemMerchantRestrictionsDto.maxPrice) && epx.f(this.text, storeStockItemMerchantRestrictionsDto.text);
    }

    public final int hashCode() {
        List<String> list = this.currency;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<StorePriceDto> list2 = this.maxPrice;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.text;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoreStockItemMerchantRestrictionsDto(currency=");
        sb.append(this.currency);
        sb.append(", maxPrice=");
        sb.append(this.maxPrice);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.currency);
        List<StorePriceDto> list = this.maxPrice;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((StorePriceDto) f.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.text);
    }

    public StoreStockItemMerchantRestrictionsDto(List<String> list, List<StorePriceDto> list2, String str) {
        this.currency = list;
        this.maxPrice = list2;
        this.text = str;
    }

    public /* synthetic */ StoreStockItemMerchantRestrictionsDto(List list, List list2, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str);
    }
}
