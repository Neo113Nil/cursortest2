package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.math.BigDecimal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271k3 {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f14088a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f14089b;

    /* renamed from: c, reason: collision with root package name */
    public final C0657zf f14090c;

    /* renamed from: d, reason: collision with root package name */
    public final C0608xg f14091d;

    public C0271k3(ECommerceCartItem eCommerceCartItem) {
        this(new Hf(eCommerceCartItem.getProduct()), eCommerceCartItem.getQuantity(), new C0657zf(eCommerceCartItem.getRevenue()), eCommerceCartItem.getReferrer() == null ? null : new C0608xg(eCommerceCartItem.getReferrer()));
    }

    public final String toString() {
        return "CartItemWrapper{product=" + this.f14088a + ", quantity=" + this.f14089b + ", revenue=" + this.f14090c + ", referrer=" + this.f14091d + '}';
    }

    public C0271k3(Hf hf2, BigDecimal bigDecimal, C0657zf c0657zf, C0608xg c0608xg) {
        this.f14088a = hf2;
        this.f14089b = bigDecimal;
        this.f14090c = c0657zf;
        this.f14091d = c0608xg;
    }
}
