package com.vk.dto.discover.carousel.products;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.Price;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.products.ProductCarousel;
import com.vk.dto.photo.Photo;
import xsna.bh10;
import xsna.bpn0;
import xsna.cqm0;
import xsna.epx;
import xsna.gmq;
import xsna.qoy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ProductCarouselItem.kt */
/* loaded from: classes18.dex */
public final class ProductCarouselItem extends BaseProductCarouselItem implements gmq {
    public static final Serializer.c<ProductCarouselItem> CREATOR = new a();
    public final int c;
    public final String d;
    public boolean e;
    public final Price f;
    public final Photo g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final UserId l;
    public final String m;
    public final boolean n;
    public final String o;
    public final ProductCarousel.Type p;
    public final String q;
    public final Image r;
    public Integer s;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProductCarouselItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProductCarouselItem a(Serializer serializer) {
            int i;
            ProductCarousel.Type type;
            String H = serializer.H();
            bpn0 bpn0Var = cqm0.a;
            try {
                i = Integer.parseInt(H);
            } catch (Throwable unused) {
                i = 0;
            }
            String H2 = serializer.H();
            com.vk.core.serialize.a.b(H2, "title");
            boolean m = serializer.m();
            Serializer.StreamParcelable G = serializer.G(Price.class.getClassLoader());
            com.vk.core.serialize.a.b(G, "price");
            Price price = (Price) G;
            Photo photo = (Photo) serializer.G(Photo.class.getClassLoader());
            String H3 = serializer.H();
            String H4 = serializer.H();
            String H5 = serializer.H();
            String H6 = serializer.H();
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            if (userId == null) {
                userId = UserId.d;
            }
            UserId userId2 = userId;
            String H7 = serializer.H();
            boolean m2 = serializer.m();
            String H8 = serializer.H();
            Integer v = serializer.v();
            ProductCarousel.Type.a aVar = ProductCarousel.Type.Companion;
            String H9 = serializer.H();
            aVar.getClass();
            ProductCarousel.Type[] values = ProductCarousel.Type.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    type = null;
                    break;
                }
                type = values[i2];
                int i3 = i2;
                if (epx.f(type.getId(), H9)) {
                    break;
                }
                i2 = i3 + 1;
            }
            return new ProductCarouselItem(i, H2, m, price, photo, H3, H4, H5, H6, userId2, H7, m2, H8, type, serializer.H(), (Image) serializer.A(Image.class.getClassLoader()), v);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductCarouselItem[i];
        }
    }

    public /* synthetic */ ProductCarouselItem(int i, String str, boolean z, Price price, Photo photo, String str2, String str3, String str4, String str5, UserId userId, String str6, boolean z2, String str7, ProductCarousel.Type type, String str8, Image image, Integer num, int i2, zcl zclVar) {
        this(i, str, z, price, photo, str2, str3, str4, str5, userId, str6, z2, str7, type, str8, image, (i2 & 65536) != 0 ? null : num);
    }

    @Override // com.vk.dto.discover.carousel.products.BaseProductCarouselItem, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(String.valueOf(this.c));
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.i0(this.f);
        serializer.i0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.e0(this.l);
        serializer.j0(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.j0(this.o);
        serializer.V(this.s);
        ProductCarousel.Type type = this.p;
        serializer.j0(type != null ? type.getId() : null);
        serializer.j0(this.q);
        serializer.e0(this.r);
    }

    @Override // xsna.gmq
    public final boolean X() {
        return this.e;
    }

    @Override // com.vk.dto.discover.carousel.products.BaseProductCarouselItem
    public final Integer d() {
        return this.s;
    }

    @Override // com.vk.dto.discover.carousel.products.BaseProductCarouselItem
    public final void e(Integer num) {
        this.s = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCarouselItem)) {
            return false;
        }
        ProductCarouselItem productCarouselItem = (ProductCarouselItem) obj;
        return this.c == productCarouselItem.c && epx.f(this.d, productCarouselItem.d) && this.e == productCarouselItem.e && epx.f(this.f, productCarouselItem.f) && epx.f(this.g, productCarouselItem.g) && epx.f(this.h, productCarouselItem.h) && epx.f(this.i, productCarouselItem.i) && epx.f(this.j, productCarouselItem.j) && epx.f(this.k, productCarouselItem.k) && epx.f(this.l, productCarouselItem.l) && epx.f(this.m, productCarouselItem.m) && this.n == productCarouselItem.n && epx.f(this.o, productCarouselItem.o) && this.p == productCarouselItem.p && epx.f(this.q, productCarouselItem.q) && epx.f(this.r, productCarouselItem.r) && epx.f(this.s, productCarouselItem.s);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + qoy.b(urd0.a(Integer.hashCode(this.c) * 31, 31, this.d), 31, this.e)) * 31;
        Photo photo = this.g;
        int hashCode2 = (hashCode + (photo == null ? 0 : photo.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int a2 = bh10.a((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.l.b);
        String str5 = this.m;
        int b = qoy.b((a2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.n);
        String str6 = this.o;
        int hashCode6 = (b + (str6 == null ? 0 : str6.hashCode())) * 31;
        ProductCarousel.Type type = this.p;
        int hashCode7 = (hashCode6 + (type == null ? 0 : type.hashCode())) * 31;
        String str7 = this.q;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Image image = this.r;
        int hashCode9 = (hashCode8 + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.s;
        return hashCode9 + (num != null ? num.hashCode() : 0);
    }

    @Override // xsna.gmq
    public final void s0(boolean z) {
        this.e = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCarouselItem(id=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", isFave=");
        sb.append(this.e);
        sb.append(", price=");
        sb.append(this.f);
        sb.append(", photo=");
        sb.append(this.g);
        sb.append(", actionUrl=");
        sb.append(this.h);
        sb.append(", actionText=");
        sb.append(this.i);
        sb.append(", detailsUrl=");
        sb.append(this.j);
        sb.append(", url=");
        sb.append(this.k);
        sb.append(", ownerId=");
        sb.append(this.l);
        sb.append(", discountText=");
        sb.append(this.m);
        sb.append(", oneLineTitle=");
        sb.append(this.n);
        sb.append(", trackCode=");
        sb.append(this.o);
        sb.append(", carouselType=");
        sb.append(this.p);
        sb.append(", communityName=");
        sb.append(this.q);
        sb.append(", communityPhoto=");
        sb.append(this.r);
        sb.append(", position=");
        return uqi.b(sb, this.s, ')');
    }

    public ProductCarouselItem(int i, String str, boolean z, Price price, Photo photo, String str2, String str3, String str4, String str5, UserId userId, String str6, boolean z2, String str7, ProductCarousel.Type type, String str8, Image image, Integer num) {
        super(null, 1, null);
        this.c = i;
        this.d = str;
        this.e = z;
        this.f = price;
        this.g = photo;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = userId;
        this.m = str6;
        this.n = z2;
        this.o = str7;
        this.p = type;
        this.q = str8;
        this.r = image;
        this.s = num;
    }
}
