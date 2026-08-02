package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    private final String f11777a;

    /* renamed from: b, reason: collision with root package name */
    private String f11778b;

    /* renamed from: c, reason: collision with root package name */
    private List f11779c;

    /* renamed from: d, reason: collision with root package name */
    private Map f11780d;

    /* renamed from: e, reason: collision with root package name */
    private ECommercePrice f11781e;

    /* renamed from: f, reason: collision with root package name */
    private ECommercePrice f11782f;

    /* renamed from: g, reason: collision with root package name */
    private List f11783g;

    public ECommerceProduct(@NonNull String str) {
        this.f11777a = str;
    }

    public ECommercePrice getActualPrice() {
        return this.f11781e;
    }

    public List<String> getCategoriesPath() {
        return this.f11779c;
    }

    public String getName() {
        return this.f11778b;
    }

    public ECommercePrice getOriginalPrice() {
        return this.f11782f;
    }

    public Map<String, String> getPayload() {
        return this.f11780d;
    }

    public List<String> getPromocodes() {
        return this.f11783g;
    }

    @NonNull
    public String getSku() {
        return this.f11777a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(ECommercePrice eCommercePrice) {
        this.f11781e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(List<String> list) {
        this.f11779c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(String str) {
        this.f11778b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(ECommercePrice eCommercePrice) {
        this.f11782f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(Map<String, String> map) {
        this.f11780d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(List<String> list) {
        this.f11783g = list;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceProduct{sku='");
        sb2.append(this.f11777a);
        sb2.append("', name='");
        sb2.append(this.f11778b);
        sb2.append("', categoriesPath=");
        sb2.append(this.f11779c);
        sb2.append(", payload=");
        sb2.append(this.f11780d);
        sb2.append(", actualPrice=");
        sb2.append(this.f11781e);
        sb2.append(", originalPrice=");
        sb2.append(this.f11782f);
        sb2.append(", promocodes=");
        return c1.p(sb2, this.f11783g, '}');
    }
}
