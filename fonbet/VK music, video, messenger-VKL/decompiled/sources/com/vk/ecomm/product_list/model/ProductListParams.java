package com.vk.ecomm.product_list.model;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ho8;
import xsna.nr;

/* compiled from: ProductListParams.kt */
/* loaded from: classes18.dex */
public final class ProductListParams implements Parcelable {
    public static final Parcelable.Creator<ProductListParams> CREATOR = new a();
    public final List<ProductListItem> b;
    public final ProductListRefSource c;
    public final Integer d;
    public final Long e;
    public final String f;

    /* compiled from: ProductListParams.kt */
    public static final class a implements Parcelable.Creator<ProductListParams> {
        @Override // android.os.Parcelable.Creator
        public final ProductListParams createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(ProductListItem.CREATOR, parcel, arrayList, i, 1);
            }
            return new ProductListParams(arrayList, ProductListRefSource.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductListParams[] newArray(int i) {
            return new ProductListParams[i];
        }
    }

    public ProductListParams(List<ProductListItem> list, ProductListRefSource productListRefSource, Integer num, Long l, String str) {
        this.b = list;
        this.c = productListRefSource;
        this.d = num;
        this.e = l;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListParams)) {
            return false;
        }
        ProductListParams productListParams = (ProductListParams) obj;
        return epx.f(this.b, productListParams.b) && this.c == productListParams.c && epx.f(this.d, productListParams.d) && epx.f(this.e, productListParams.e) && epx.f(this.f, productListParams.f);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.e;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListParams(productListItems=");
        sb.append(this.b);
        sb.append(", refSource=");
        sb.append(this.c);
        sb.append(", contextContentId=");
        sb.append(this.d);
        sb.append(", contextContentOwnerId=");
        sb.append(this.e);
        sb.append(", trackCode=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((ProductListItem) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.c.name());
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Long l = this.e;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeString(this.f);
    }
}
