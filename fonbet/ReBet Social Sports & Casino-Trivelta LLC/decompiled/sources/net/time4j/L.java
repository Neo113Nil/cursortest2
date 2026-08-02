package net.time4j;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class L implements oi.t {

    /* renamed from: a, reason: collision with root package name */
    public final oi.p f57640a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57641b;

    public L(oi.p pVar, boolean z10) {
        this.f57640a = pVar;
        this.f57641b = z10;
    }

    @Override // oi.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BigDecimal apply(oi.q qVar) {
        long longValue = ((Number) qVar.j(this.f57640a)).longValue();
        long longValue2 = ((Number) qVar.m(this.f57640a)).longValue();
        long longValue3 = ((Number) qVar.c(this.f57640a)).longValue();
        if (longValue > longValue3) {
            longValue = longValue3;
        }
        if (longValue == longValue2) {
            return BigDecimal.ZERO;
        }
        if (this.f57641b && (qVar instanceof G) && !((G) G.class.cast(qVar)).q0(this.f57640a)) {
            if (longValue == longValue3) {
                return BigDecimal.ONE;
            }
            longValue3--;
        }
        return com.google.android.gms.internal.measurement.a.a(new BigDecimal(longValue - longValue2).setScale(15).divide(new BigDecimal((longValue3 - longValue2) + 1), RoundingMode.HALF_UP));
    }
}
