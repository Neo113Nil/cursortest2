package com.vk.dto.discover.carousel.products;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.photo.Photo;
import xsna.epx;
import xsna.ho8;

/* compiled from: ProductCarouselPromoItem.kt */
/* loaded from: classes18.dex */
public final class ProductCarouselPromoItem extends BaseProductCarouselItem {
    public static final Serializer.c<ProductCarouselPromoItem> CREATOR = new a();
    public final Image c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public Integer h;
    public final String i;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ProductCarouselPromoItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ProductCarouselPromoItem a(Serializer serializer) {
            Image image = (Image) serializer.G(Photo.class.getClassLoader());
            String H = serializer.H();
            com.vk.core.serialize.a.b(H, "title");
            String H2 = serializer.H();
            com.vk.core.serialize.a.b(H2, "subtitle");
            String H3 = serializer.H();
            com.vk.core.serialize.a.b(H3, "buttonTitle");
            return new ProductCarouselPromoItem(image, H, H2, H3, serializer.H(), serializer.v(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductCarouselPromoItem[i];
        }
    }

    public ProductCarouselPromoItem(Image image, String str, String str2, String str3, String str4, Integer num, String str5) {
        super(null, 1, null);
        this.c = image;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = num;
        this.i = str5;
    }

    @Override // com.vk.dto.discover.carousel.products.BaseProductCarouselItem, com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.V(this.h);
        serializer.j0(this.i);
    }

    @Override // com.vk.dto.discover.carousel.products.BaseProductCarouselItem
    public final Integer d() {
        return this.h;
    }

    @Override // com.vk.dto.discover.carousel.products.BaseProductCarouselItem
    public final void e(Integer num) {
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCarouselPromoItem)) {
            return false;
        }
        ProductCarouselPromoItem productCarouselPromoItem = (ProductCarouselPromoItem) obj;
        return epx.f(this.c, productCarouselPromoItem.c) && epx.f(this.d, productCarouselPromoItem.d) && epx.f(this.e, productCarouselPromoItem.e) && epx.f(this.f, productCarouselPromoItem.f) && epx.f(this.g, productCarouselPromoItem.g) && epx.f(this.h, productCarouselPromoItem.h) && epx.f(this.i, productCarouselPromoItem.i);
    }

    public final int hashCode() {
        Image image = this.c;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.h;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.i;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductCarouselPromoItem(icon=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", buttonTitle=");
        sb.append(this.f);
        sb.append(", actionUrl=");
        sb.append(this.g);
        sb.append(", position=");
        sb.append(this.h);
        sb.append(", trackCode=");
        return ho8.a(sb, this.i, ')');
    }
}
