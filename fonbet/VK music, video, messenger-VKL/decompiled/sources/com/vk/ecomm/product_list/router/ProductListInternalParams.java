package com.vk.ecomm.product_list.router;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.v11;

/* compiled from: ProductListInternalParams.kt */
/* loaded from: classes18.dex */
public final class ProductListInternalParams implements Parcelable {
    public static final Parcelable.Creator<ProductListInternalParams> CREATOR = new a();
    public final List<String> b;
    public final Map<String, String> c;
    public final ProductListContentType d;
    public final CommonMarketStat$TypeRefSource e;
    public final CommonMarketStat$TypeMarketContextContent.Type f;
    public final Integer g;
    public final Long h;
    public final String i;

    /* compiled from: ProductListInternalParams.kt */
    public static final class a implements Parcelable.Creator<ProductListInternalParams> {
        @Override // android.os.Parcelable.Creator
        public final ProductListInternalParams createFromParcel(Parcel parcel) {
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new ProductListInternalParams(createStringArrayList, linkedHashMap, ProductListContentType.valueOf(parcel.readString()), CommonMarketStat$TypeRefSource.valueOf(parcel.readString()), CommonMarketStat$TypeMarketContextContent.Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductListInternalParams[] newArray(int i) {
            return new ProductListInternalParams[i];
        }
    }

    public ProductListInternalParams(List<String> list, Map<String, String> map, ProductListContentType productListContentType, CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, CommonMarketStat$TypeMarketContextContent.Type type, Integer num, Long l, String str) {
        this.b = list;
        this.c = map;
        this.d = productListContentType;
        this.e = commonMarketStat$TypeRefSource;
        this.f = type;
        this.g = num;
        this.h = l;
        this.i = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListInternalParams)) {
            return false;
        }
        ProductListInternalParams productListInternalParams = (ProductListInternalParams) obj;
        return epx.f(this.b, productListInternalParams.b) && epx.f(this.c, productListInternalParams.c) && this.d == productListInternalParams.d && this.e == productListInternalParams.e && this.f == productListInternalParams.f && epx.f(this.g, productListInternalParams.g) && epx.f(this.h, productListInternalParams.h) && epx.f(this.i, productListInternalParams.i);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + v11.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31)) * 31;
        Integer num = this.g;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.h;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.i;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListInternalParams(productIds=");
        sb.append(this.b);
        sb.append(", adsLabels=");
        sb.append(this.c);
        sb.append(", contentType=");
        sb.append(this.d);
        sb.append(", refSource=");
        sb.append(this.e);
        sb.append(", contextContentType=");
        sb.append(this.f);
        sb.append(", contextContentId=");
        sb.append(this.g);
        sb.append(", contextContentOwnerId=");
        sb.append(this.h);
        sb.append(", trackCode=");
        return ho8.a(sb, this.i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.b);
        Map<String, String> map = this.c;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        parcel.writeString(this.d.name());
        parcel.writeString(this.e.name());
        parcel.writeString(this.f.name());
        Integer num = this.g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Long l = this.h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeString(this.i);
    }
}
