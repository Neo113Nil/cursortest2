package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final u f17349c = new u();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.k
    public final String getId() {
        return "Japanese";
    }

    @Override // j$.time.chrono.k
    public final String l() {
        return "japanese";
    }

    @Override // j$.time.chrono.k
    public final b I(int i5, int i10, int i11) {
        return new w(j$.time.g.Z(i5, i10, i11));
    }

    @Override // j$.time.chrono.k
    public final b m(int i5, int i10) {
        return new w(j$.time.g.b0(i5, i10));
    }

    @Override // j$.time.chrono.k
    public final b h(long j) {
        return new w(j$.time.g.a0(j));
    }

    @Override // j$.time.chrono.a
    public final b j() {
        return new w(j$.time.g.R(j$.time.g.Y(j$.com.android.tools.r8.a.Y())));
    }

    @Override // j$.time.chrono.k
    public final b A(TemporalAccessor temporalAccessor) {
        if (temporalAccessor instanceof w) {
            return (w) temporalAccessor;
        }
        return new w(j$.time.g.R(temporalAccessor));
    }

    @Override // j$.time.chrono.k
    public final List s() {
        x[] xVarArr = x.f17356e;
        return j$.com.android.tools.r8.a.O((x[]) Arrays.copyOf(xVarArr, xVarArr.length));
    }

    @Override // j$.time.chrono.k
    public final boolean O(long j) {
        return r.f17346c.O(j);
    }

    private u() {
    }

    @Override // j$.time.chrono.k
    public final int u(l lVar, int i5) {
        if (!(lVar instanceof x)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i10 = ((x) lVar).f17358b.f17472a;
        int i11 = (i10 + i5) - 1;
        if (i5 != 1 && (i11 < -999999999 || i11 > 999999999 || i11 < i10 || lVar != x.h(j$.time.g.Z(i11, 1, 1)))) {
            throw new j$.time.b("Invalid yearOfEra value");
        }
        return i11;
    }

    @Override // j$.time.chrono.k
    public final l t(int i5) {
        return x.m(i5);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s q(j$.time.temporal.a aVar) {
        switch (t.f17348a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new j$.time.temporal.r("Unsupported field: " + aVar);
            case 5:
                x[] xVarArr = x.f17356e;
                int i5 = xVarArr[xVarArr.length - 1].f17358b.f17472a;
                int i10 = 1000000000 - xVarArr[xVarArr.length - 1].f17358b.f17472a;
                int i11 = xVarArr[0].f17358b.f17472a;
                int i12 = 1;
                while (true) {
                    x[] xVarArr2 = x.f17356e;
                    if (i12 >= xVarArr2.length) {
                        return j$.time.temporal.s.g(1L, i10, 999999999 - i5);
                    }
                    x xVar = xVarArr2[i12];
                    i10 = Math.min(i10, (xVar.f17358b.f17472a - i11) + 1);
                    i11 = xVar.f17358b.f17472a;
                    i12++;
                }
            case 6:
                x xVar2 = x.f17355d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.f17512b.f17539c;
                long j6 = j;
                for (x xVar3 : x.f17356e) {
                    long min = Math.min(j6, (xVar3.f17358b.M() - xVar3.f17358b.U()) + 1);
                    j6 = xVar3.l() != null ? Math.min(min, xVar3.l().f17358b.U() - 1) : min;
                }
                return j$.time.temporal.s.g(1L, j6, j$.time.temporal.a.DAY_OF_YEAR.f17512b.f17540d);
            case 7:
                return j$.time.temporal.s.f(w.f17351d.f17472a, 999999999L);
            case 8:
                long j10 = x.f17355d.f17357a;
                x[] xVarArr3 = x.f17356e;
                return j$.time.temporal.s.f(j10, xVarArr3[xVarArr3.length - 1].f17357a);
            default:
                return aVar.f17512b;
        }
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final b K(Map map, j$.time.format.e0 e0Var) {
        return (w) super.K(map, e0Var);
    }

    @Override // j$.time.chrono.a
    public final b C(Map map, j$.time.format.e0 e0Var) {
        j$.time.g b02;
        w W;
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        Long l6 = (Long) map.get(aVar);
        x m6 = l6 != null ? x.m(q(aVar).a(l6.longValue(), aVar)) : null;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) map.get(aVar2);
        int a7 = l10 != null ? q(aVar2).a(l10.longValue(), aVar2) : 0;
        if (m6 == null && l10 != null && !map.containsKey(j$.time.temporal.a.YEAR) && e0Var != j$.time.format.e0.STRICT) {
            x[] xVarArr = x.f17356e;
            m6 = ((x[]) Arrays.copyOf(xVarArr, xVarArr.length))[((x[]) Arrays.copyOf(xVarArr, xVarArr.length)).length - 1];
        }
        if (l10 != null && m6 != null) {
            j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
            if (map.containsKey(aVar3)) {
                j$.time.temporal.a aVar4 = j$.time.temporal.a.DAY_OF_MONTH;
                if (map.containsKey(aVar4)) {
                    map.remove(aVar);
                    map.remove(aVar2);
                    if (e0Var == j$.time.format.e0.LENIENT) {
                        return new w(j$.time.g.Z((m6.f17358b.f17472a + a7) - 1, 1, 1)).T(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar3)).longValue(), 1L), ChronoUnit.MONTHS).T(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar4)).longValue(), 1L), ChronoUnit.DAYS);
                    }
                    int a10 = q(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a11 = q(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    if (e0Var != j$.time.format.e0.SMART) {
                        j$.time.g gVar = w.f17351d;
                        Objects.requireNonNull(m6, "era");
                        j$.time.g Z = j$.time.g.Z((m6.f17358b.f17472a + a7) - 1, a10, a11);
                        if (Z.V(m6.f17358b) || m6 != x.h(Z)) {
                            throw new j$.time.b("year, month, and day not valid for Era");
                        }
                        return new w(m6, a7, Z);
                    }
                    if (a7 < 1) {
                        throw new j$.time.b("Invalid YearOfEra: " + a7);
                    }
                    int i5 = (m6.f17358b.f17472a + a7) - 1;
                    try {
                        W = new w(j$.time.g.Z(i5, a10, a11));
                    } catch (j$.time.b unused) {
                        W = new w(j$.time.g.Z(i5, a10, 1)).W(new j$.time.x(2));
                    }
                    if (W.f17353b == m6 || j$.time.temporal.q.a(W, j$.time.temporal.a.YEAR_OF_ERA) <= 1 || a7 <= 1) {
                        return W;
                    }
                    throw new j$.time.b("Invalid YearOfEra for Era: " + m6 + " " + a7);
                }
            }
            j$.time.temporal.a aVar5 = j$.time.temporal.a.DAY_OF_YEAR;
            if (map.containsKey(aVar5)) {
                map.remove(aVar);
                map.remove(aVar2);
                if (e0Var == j$.time.format.e0.LENIENT) {
                    return new w(j$.time.g.b0((m6.f17358b.f17472a + a7) - 1, 1)).T(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar5)).longValue(), 1L), ChronoUnit.DAYS);
                }
                int a12 = q(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5);
                j$.time.g gVar2 = w.f17351d;
                Objects.requireNonNull(m6, "era");
                if (a7 == 1) {
                    j$.time.g gVar3 = m6.f17358b;
                    b02 = j$.time.g.b0(gVar3.f17472a, (gVar3.U() + a12) - 1);
                } else {
                    b02 = j$.time.g.b0((m6.f17358b.f17472a + a7) - 1, a12);
                }
                if (b02.V(m6.f17358b) || m6 != x.h(b02)) {
                    throw new j$.time.b("Invalid parameters");
                }
                return new w(m6, a7, b02);
            }
        }
        return null;
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return j.Q(this, instant, zoneId);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
