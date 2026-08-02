package j$.time;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.time.format.e0;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class n implements TemporalAccessor, j$.time.temporal.m, Comparable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f17490c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* renamed from: a, reason: collision with root package name */
    public final int f17491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17492b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        n nVar = (n) obj;
        int i5 = this.f17491a - nVar.f17491a;
        return i5 == 0 ? this.f17492b - nVar.f17492b : i5;
    }

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        uVar.e("--");
        uVar.l(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        uVar.d('-');
        uVar.l(j$.time.temporal.a.DAY_OF_MONTH, 2);
        uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    public n(int i5, int i10) {
        this.f17491a = i5;
        this.f17492b = i10;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.MONTH_OF_YEAR || pVar == j$.time.temporal.a.DAY_OF_MONTH : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return pVar.n();
        }
        if (pVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return j$.time.temporal.q.d(this, pVar);
        }
        l S = l.S(this.f17491a);
        S.getClass();
        int i5 = k.f17486a[S.ordinal()];
        return j$.time.temporal.s.g(1L, i5 != 1 ? (i5 == 2 || i5 == 3 || i5 == 4 || i5 == 5) ? 30 : 31 : 28, l.S(this.f17491a).R());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        return k(pVar).a(C(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        int i5;
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.x(this);
        }
        int i10 = m.f17489a[((j$.time.temporal.a) pVar).ordinal()];
        if (i10 == 1) {
            i5 = this.f17492b;
        } else {
            if (i10 != 2) {
                throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
            }
            i5 = this.f17491a;
        }
        return i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        if (xVar == j$.time.temporal.q.f17531b) {
            return j$.time.chrono.r.f17346c;
        }
        return j$.time.temporal.q.c(this, xVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.L(lVar).equals(j$.time.chrono.r.f17346c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.l c2 = lVar.c(this.f17491a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return c2.c(Math.min(c2.k(aVar).f17540d, this.f17492b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f17491a == nVar.f17491a && this.f17492b == nVar.f17492b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f17491a << 6) + this.f17492b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f17491a < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
        sb2.append(this.f17491a);
        sb2.append(this.f17492b < 10 ? "-0" : "-");
        sb2.append(this.f17492b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
