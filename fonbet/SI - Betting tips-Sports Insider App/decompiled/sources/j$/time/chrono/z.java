package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final z f17361c = new z();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.k
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.k
    public final l t(int i5) {
        if (i5 == 0) {
            return c0.BEFORE_ROC;
        }
        if (i5 == 1) {
            return c0.ROC;
        }
        throw new j$.time.b("Invalid era: " + i5);
    }

    @Override // j$.time.chrono.k
    public final String l() {
        return "roc";
    }

    @Override // j$.time.chrono.k
    public final b I(int i5, int i10, int i11) {
        return new b0(j$.time.g.Z(i5 + 1911, i10, i11));
    }

    @Override // j$.time.chrono.k
    public final b m(int i5, int i10) {
        return new b0(j$.time.g.b0(i5 + 1911, i10));
    }

    @Override // j$.time.chrono.k
    public final b h(long j) {
        return new b0(j$.time.g.a0(j));
    }

    @Override // j$.time.chrono.a
    public final b j() {
        return new b0(j$.time.g.R(j$.time.g.Y(j$.com.android.tools.r8.a.Y())));
    }

    @Override // j$.time.chrono.k
    public final b A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof b0) {
            return (b0) temporalAccessor;
        }
        return new b0(j$.time.g.R(temporalAccessor));
    }

    @Override // j$.time.chrono.k
    public final boolean O(long j) {
        return r.f17346c.O(j + 1911);
    }

    @Override // j$.time.chrono.k
    public final int u(l lVar, int i5) {
        if (lVar instanceof c0) {
            return lVar == c0.ROC ? i5 : 1 - i5;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // j$.time.chrono.k
    public final List s() {
        return j$.com.android.tools.r8.a.O(c0.values());
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s q(j$.time.temporal.a aVar) {
        int i5 = y.f17360a[aVar.ordinal()];
        if (i5 == 1) {
            j$.time.temporal.s sVar = j$.time.temporal.a.PROLEPTIC_MONTH.f17512b;
            return j$.time.temporal.s.f(sVar.f17537a - 22932, sVar.f17540d - 22932);
        }
        if (i5 == 2) {
            j$.time.temporal.s sVar2 = j$.time.temporal.a.YEAR.f17512b;
            return j$.time.temporal.s.g(1L, sVar2.f17540d - 1911, (-sVar2.f17537a) + 1912);
        }
        if (i5 != 3) {
            return aVar.f17512b;
        }
        j$.time.temporal.s sVar3 = j$.time.temporal.a.YEAR.f17512b;
        return j$.time.temporal.s.f(sVar3.f17537a - 1911, sVar3.f17540d - 1911);
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final b K(Map map, j$.time.format.e0 e0Var) {
        return (b0) super.K(map, e0Var);
    }

    private z() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return j.Q(this, instant, zoneId);
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
