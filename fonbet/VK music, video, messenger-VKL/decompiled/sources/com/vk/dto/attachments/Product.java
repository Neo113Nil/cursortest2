package com.vk.dto.attachments;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attachments.Merchant;
import com.vk.dto.attachments.ProductCategory;
import com.vk.dto.common.Price;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.s3q0;
import xsna.shy;
import xsna.w9y;

/* compiled from: Product.kt */
/* loaded from: classes18.dex */
public final class Product extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Product> CREATOR = new c();
    public final Price b;
    public final int c;
    public final Merchant d;
    public final ProductCategory e;
    public final String f;

    /* compiled from: Product.kt */
    public static final class a {
        public static Product a(JSONObject jSONObject) throws JSONException {
            Serializer.c<Price> cVar = Price.CREATOR;
            Price a = Price.a.a(jSONObject.getJSONObject("price"));
            int optInt = jSONObject.optInt("orders_count");
            Merchant.a aVar = Merchant.Companion;
            String optString = jSONObject.optString("merchant");
            aVar.getClass();
            Merchant a2 = Merchant.a.a(optString);
            Serializer.c<ProductCategory> cVar2 = ProductCategory.CREATOR;
            return new Product(a, optInt, a2, ProductCategory.a.a(jSONObject.optJSONObject("category")), jSONObject.optString("ads_label"));
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<Product> {
        @Override // xsna.aay
        public final Product a(JSONObject jSONObject) {
            return a.a(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Product> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Product a(Serializer serializer) {
            Price price = (Price) serializer.G(Price.class.getClassLoader());
            int u = serializer.u();
            Merchant.a aVar = Merchant.Companion;
            String H = serializer.H();
            aVar.getClass();
            return new Product(price, u, Merchant.a.a(H), (ProductCategory) serializer.G(ProductCategory.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Product[i];
        }
    }

    static {
        new b();
    }

    public Product(Price price, int i, Merchant merchant, ProductCategory productCategory, String str) {
        this.b = price;
        this.c = i;
        this.d = merchant;
        this.e = productCategory;
        this.f = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d.h());
        serializer.i0(this.e);
        serializer.j0(this.f);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g("price", this.b);
        w9yVar.c(Integer.valueOf(this.c), "orders_count");
        w9yVar.e(this.d.toString(), "merchant");
        w9yVar.g("category", this.e);
        w9yVar.e(this.f, "ads_label");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return epx.f(this.b, product.b) && this.c == product.c && this.d == product.d && epx.f(this.e, product.e) && epx.f(this.f, product.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + shy.a(this.c, this.b.hashCode() * 31, 31)) * 31;
        ProductCategory productCategory = this.e;
        int hashCode2 = (hashCode + (productCategory == null ? 0 : productCategory.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Product(price=");
        sb.append(this.b);
        sb.append(", ordersCount=");
        sb.append(this.c);
        sb.append(", merchant=");
        sb.append(this.d);
        sb.append(", category=");
        sb.append(this.e);
        sb.append(", adsLabel=");
        return ho8.a(sb, this.f, ')');
    }
}
