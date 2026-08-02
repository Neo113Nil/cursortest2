package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import d9.e;
import io.appmetrica.analytics.impl.lo;
import java.math.BigDecimal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ECommerceAmount {

    /* renamed from: a, reason: collision with root package name */
    private final BigDecimal f11766a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11767b;

    public ECommerceAmount(long j, @NonNull String str) {
        this(lo.a(j), str);
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.f11766a;
    }

    @NonNull
    public String getUnit() {
        return this.f11767b;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceAmount{amount=");
        sb2.append(this.f11766a);
        sb2.append(", unit='");
        return e.l(sb2, this.f11767b, "'}");
    }

    public ECommerceAmount(double d10, @NonNull String str) {
        this(new BigDecimal(lo.a(d10)), str);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String str) {
        this.f11766a = bigDecimal;
        this.f11767b = str;
    }
}
