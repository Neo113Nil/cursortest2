package com.vk.ecomm.core.models.product;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: ProductPrice.kt */
/* loaded from: classes18.dex */
public final class ProductPrice implements Parcelable {
    public static final Parcelable.Creator<ProductPrice> CREATOR = new a();
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    /* compiled from: ProductPrice.kt */
    public static final class a implements Parcelable.Creator<ProductPrice> {
        @Override // android.os.Parcelable.Creator
        public final ProductPrice createFromParcel(Parcel parcel) {
            return new ProductPrice(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProductPrice[] newArray(int i) {
            return new ProductPrice[i];
        }
    }

    public ProductPrice(String str, int i, String str2, String str3) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) obj;
        return epx.f(this.b, productPrice.b) && this.c == productPrice.c && epx.f(this.d, productPrice.d) && epx.f(this.e, productPrice.e);
    }

    public final int hashCode() {
        int a2 = shy.a(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductPrice(current=");
        sb.append(this.b);
        sb.append(", discountRate=");
        sb.append(this.c);
        sb.append(", old=");
        sb.append(this.d);
        sb.append(", loyalty=");
        return ho8.a(sb, this.e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
