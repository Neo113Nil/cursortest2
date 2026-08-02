package com.vk.ecomm.product_list.model;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: ProductListParams.kt */
/* loaded from: classes18.dex */
public final class ProductListItem implements Parcelable {
    public static final Parcelable.Creator<ProductListItem> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final String d;

    /* compiled from: ProductListParams.kt */
    public static final class a implements Parcelable.Creator<ProductListItem> {
        @Override // android.os.Parcelable.Creator
        public final ProductListItem createFromParcel(Parcel parcel) {
            return new ProductListItem(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductListItem[] newArray(int i) {
            return new ProductListItem[i];
        }
    }

    public ProductListItem(String str, boolean z, String str2) {
        this.b = str;
        this.c = z;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListItem)) {
            return false;
        }
        ProductListItem productListItem = (ProductListItem) obj;
        return epx.f(this.b, productListItem.b) && this.c == productListItem.c && epx.f(this.d, productListItem.d);
    }

    public final int hashCode() {
        int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListItem(fullId=");
        sb.append(this.b);
        sb.append(", isService=");
        sb.append(this.c);
        sb.append(", adsLabel=");
        return ho8.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
    }
}
