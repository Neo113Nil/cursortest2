package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Hf {

    /* renamed from: a, reason: collision with root package name */
    public final String f12311a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12312b;

    /* renamed from: c, reason: collision with root package name */
    public final List f12313c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f12314d;

    /* renamed from: e, reason: collision with root package name */
    public final C0657zf f12315e;

    /* renamed from: f, reason: collision with root package name */
    public final C0657zf f12316f;

    /* renamed from: g, reason: collision with root package name */
    public final List f12317g;

    public Hf(ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath()), CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new C0657zf(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() != null ? new C0657zf(eCommerceProduct.getOriginalPrice()) : null, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProductWrapper{sku='");
        sb2.append(this.f12311a);
        sb2.append("', name='");
        sb2.append(this.f12312b);
        sb2.append("', categoriesPath=");
        sb2.append(this.f12313c);
        sb2.append(", payload=");
        sb2.append(this.f12314d);
        sb2.append(", actualPrice=");
        sb2.append(this.f12315e);
        sb2.append(", originalPrice=");
        sb2.append(this.f12316f);
        sb2.append(", promocodes=");
        return androidx.appcompat.widget.c1.p(sb2, this.f12317g, '}');
    }

    public Hf(String str, String str2, List list, Map map, C0657zf c0657zf, C0657zf c0657zf2, List list2) {
        this.f12311a = str;
        this.f12312b = str2;
        this.f12313c = list;
        this.f12314d = map;
        this.f12315e = c0657zf;
        this.f12316f = c0657zf2;
        this.f12317g = list2;
    }
}
