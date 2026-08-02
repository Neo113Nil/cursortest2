package io.appmetrica.analytics.ecommerce;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    private String f11787a;

    /* renamed from: b, reason: collision with root package name */
    private List f11788b;

    /* renamed from: c, reason: collision with root package name */
    private String f11789c;

    /* renamed from: d, reason: collision with root package name */
    private Map f11790d;

    public List<String> getCategoriesPath() {
        return this.f11788b;
    }

    public String getName() {
        return this.f11787a;
    }

    public Map<String, String> getPayload() {
        return this.f11790d;
    }

    public String getSearchQuery() {
        return this.f11789c;
    }

    public ECommerceScreen setCategoriesPath(List<String> list) {
        this.f11788b = list;
        return this;
    }

    public ECommerceScreen setName(String str) {
        this.f11787a = str;
        return this;
    }

    public ECommerceScreen setPayload(Map<String, String> map) {
        this.f11790d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(String str) {
        this.f11789c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f11787a + "', categoriesPath=" + this.f11788b + ", searchQuery='" + this.f11789c + "', payload=" + this.f11790d + '}';
    }
}
