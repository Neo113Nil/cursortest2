package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ECommercePrice {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f11775a;

    /* renamed from: b, reason: collision with root package name */
    private List f11776b;

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f11775a = eCommerceAmount;
    }

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f11775a;
    }

    public List<ECommerceAmount> getInternalComponents() {
        return this.f11776b;
    }

    public ECommercePrice setInternalComponents(List<ECommerceAmount> list) {
        this.f11776b = list;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommercePrice{fiat=");
        sb2.append(this.f11775a);
        sb2.append(", internalComponents=");
        return c1.p(sb2, this.f11776b, '}');
    }
}
