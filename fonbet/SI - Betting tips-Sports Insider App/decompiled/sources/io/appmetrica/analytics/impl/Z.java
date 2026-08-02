package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceAmount;
import java.math.BigDecimal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f13250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13251b;

    public Z(ECommerceAmount eCommerceAmount) {
        this(eCommerceAmount.getAmount(), eCommerceAmount.getUnit());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AmountWrapper{amount=");
        sb2.append(this.f13250a);
        sb2.append(", unit='");
        return d9.e.l(sb2, this.f13251b, "'}");
    }

    public Z(BigDecimal bigDecimal, String str) {
        this.f13250a = bigDecimal;
        this.f13251b = str;
    }
}
