package com.vk.dto.attachments;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import defpackage.q0;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: Product.kt */
/* loaded from: classes18.dex */
public final class ProductCategory implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<ProductCategory> CREATOR;
    public final int b;
    public final String c;
    public final boolean d;

    /* compiled from: Product.kt */
    public static final class a {
        public static ProductCategory a(JSONObject jSONObject) throws JSONException {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt("id");
            String optString = jSONObject.optString("name");
            ProductCategory a = a(jSONObject.optJSONObject("parent"));
            boolean z = true;
            if (optInt != 12 && (a == null || !a.d)) {
                z = false;
            }
            return new ProductCategory(optInt, optString, z);
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<ProductCategory> {
        @Override // xsna.aay
        public final ProductCategory a(JSONObject jSONObject) {
            Serializer.c<ProductCategory> cVar = ProductCategory.CREATOR;
            return a.a(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<ProductCategory> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProductCategory a(Serializer serializer) {
            return new ProductCategory(serializer.u(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductCategory[i];
        }
    }

    static {
        new b();
        CREATOR = new c();
    }

    public ProductCategory(int i, String str, boolean z) {
        this.b = i;
        this.c = str;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.c(Integer.valueOf(this.b), "id");
        w9yVar.e(this.c, "name");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCategory)) {
            return false;
        }
        ProductCategory productCategory = (ProductCategory) obj;
        return this.b == productCategory.b && epx.f(this.c, productCategory.c) && this.d == productCategory.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCategory(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", isPriceListService=");
        return q0.a(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
