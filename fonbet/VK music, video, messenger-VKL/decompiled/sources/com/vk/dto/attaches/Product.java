package com.vk.dto.attaches;

import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Merchant;
import java.util.Locale;
import xsna.epx;
import xsna.shy;
import xsna.urd0;

/* compiled from: Product.kt */
/* loaded from: classes18.dex */
public final class Product extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Product> CREATOR = new a();
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final Merchant g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Product> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Product a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            int u2 = serializer.u();
            int u3 = serializer.u();
            int u4 = serializer.u();
            Merchant.a aVar = Merchant.Companion;
            String H2 = serializer.H();
            aVar.getClass();
            String lowerCase = H2 != null ? H2.toLowerCase(Locale.ROOT) : null;
            Merchant merchant = Merchant.ALIEXPRESS;
            if (!epx.f(lowerCase, merchant.h().toLowerCase(Locale.ROOT))) {
                merchant = Merchant.NONE;
            }
            return new Product(u, H, u2, u3, u4, merchant);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Product[i];
        }
    }

    public Product(int i, String str, int i2, int i3, int i4, Merchant merchant) {
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = merchant;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.j0(this.g.h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Product)) {
            return false;
        }
        Product product = (Product) obj;
        return this.b == product.b && epx.f(this.c, product.c) && this.d == product.d && this.e == product.e && this.f == product.f && this.g == product.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + shy.a(this.f, shy.a(this.e, shy.a(this.d, urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31), 31), 31);
    }

    public final String toString() {
        return "Product(price=" + this.b + ", currencyCode=" + this.c + ", oldPrice=" + this.d + ", ordersCount=" + this.e + ", discount=" + this.f + ", merchant=" + this.g + ')';
    }
}
