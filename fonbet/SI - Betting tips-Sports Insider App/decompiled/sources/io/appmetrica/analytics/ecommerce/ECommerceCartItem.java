package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.lo;
import java.math.BigDecimal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ECommerceCartItem {

    /* renamed from: a, reason: collision with root package name */
    private final ECommerceProduct f11768a;

    /* renamed from: b, reason: collision with root package name */
    private final BigDecimal f11769b;

    /* renamed from: c, reason: collision with root package name */
    private final ECommercePrice f11770c;

    /* renamed from: d, reason: collision with root package name */
    private ECommerceReferrer f11771d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long j) {
        this(eCommerceProduct, eCommercePrice, lo.a(j));
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.f11768a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.f11769b;
    }

    public ECommerceReferrer getReferrer() {
        return this.f11771d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.f11770c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(ECommerceReferrer eCommerceReferrer) {
        this.f11771d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        return "ECommerceCartItem{product=" + this.f11768a + ", quantity=" + this.f11769b + ", revenue=" + this.f11770c + ", referrer=" + this.f11771d + '}';
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d10) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(lo.a(d10)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.f11768a = eCommerceProduct;
        this.f11769b = bigDecimal;
        this.f11770c = eCommercePrice;
    }
}
