package org.joda.time.format;

import org.joda.time.MutablePeriod;
import org.joda.time.PeriodType;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final p f79351a;

    /* renamed from: b, reason: collision with root package name */
    private final o f79352b;

    /* renamed from: c, reason: collision with root package name */
    private final PeriodType f79353c;

    public m(p pVar, o oVar) {
        this.f79351a = pVar;
        this.f79352b = oVar;
        this.f79353c = null;
    }

    public final o a() {
        return this.f79352b;
    }

    public final p b() {
        return this.f79351a;
    }

    public final int c(org.joda.time.e eVar, String str) {
        o oVar = this.f79352b;
        if (oVar != null) {
            return oVar.c(eVar, str, 0);
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    public final void d(String str) {
        o oVar = this.f79352b;
        if (oVar == null) {
            throw new UnsupportedOperationException("Parsing not supported");
        }
        int c11 = oVar.c(new MutablePeriod(this.f79353c), str, 0);
        if (c11 < 0) {
            c11 = ~c11;
        } else if (c11 >= str.length()) {
            return;
        }
        throw new IllegalArgumentException(h.e(c11, str));
    }

    public final String e(org.joda.time.k kVar) {
        p pVar = this.f79351a;
        if (pVar == null) {
            throw new UnsupportedOperationException("Printing not supported");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Period must not be null");
        }
        StringBuffer stringBuffer = new StringBuffer(pVar.a(kVar));
        pVar.b(stringBuffer, kVar);
        return stringBuffer.toString();
    }

    public final m f(PeriodType periodType) {
        if (periodType == this.f79353c) {
            return this;
        }
        return new m(this.f79351a, this.f79352b, periodType);
    }

    m(p pVar, o oVar, PeriodType periodType) {
        this.f79351a = pVar;
        this.f79352b = oVar;
        this.f79353c = periodType;
    }
}
