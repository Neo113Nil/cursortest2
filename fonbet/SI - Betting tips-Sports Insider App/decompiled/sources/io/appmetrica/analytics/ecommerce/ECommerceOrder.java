package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ECommerceOrder {

    /* renamed from: a, reason: collision with root package name */
    private final String f11772a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11773b;

    /* renamed from: c, reason: collision with root package name */
    private Map f11774c;

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f11772a = str;
        this.f11773b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f11773b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f11772a;
    }

    public Map<String, String> getPayload() {
        return this.f11774c;
    }

    public ECommerceOrder setPayload(Map<String, String> map) {
        this.f11774c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f11772a + "', cartItems=" + this.f11773b + ", payload=" + this.f11774c + '}';
    }
}
