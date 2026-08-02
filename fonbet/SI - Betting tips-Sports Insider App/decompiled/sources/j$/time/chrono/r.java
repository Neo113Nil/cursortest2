package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class r extends a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final r f17346c = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.k
    public final l t(int i5) {
        if (i5 == 0) {
            return s.BCE;
        }
        if (i5 == 1) {
            return s.CE;
        }
        throw new j$.time.b("Invalid era: " + i5);
    }

    @Override // j$.time.chrono.k
    public final String getId() {
        return "ISO";
    }

    @Override // j$.time.chrono.k
    public final String l() {
        return "iso8601";
    }

    @Override // j$.time.chrono.k
    public final b I(int i5, int i10, int i11) {
        return j$.time.g.Z(i5, i10, i11);
    }

    @Override // j$.time.chrono.k
    public final b m(int i5, int i10) {
        return j$.time.g.b0(i5, i10);
    }

    @Override // j$.time.chrono.k
    public final b h(long j) {
        return j$.time.g.a0(j);
    }

    @Override // j$.time.chrono.k
    public final b A(TemporalAccessor temporalAccessor) {
        return j$.time.g.R(temporalAccessor);
    }

    private r() {
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final ChronoLocalDateTime F(TemporalAccessor temporalAccessor) {
        return LocalDateTime.Q(temporalAccessor);
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime L(Instant instant, ZoneId zoneId) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    @Override // j$.time.chrono.a
    public final b j() {
        j$.time.a Y = j$.com.android.tools.r8.a.Y();
        Objects.requireNonNull(Y, "clock");
        return j$.time.g.R(j$.time.g.Y(Y));
    }

    @Override // j$.time.chrono.k
    public final boolean O(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.k
    public final int u(l lVar, int i5) {
        if (lVar instanceof s) {
            return lVar == s.CE ? i5 : 1 - i5;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.k
    public final List s() {
        return j$.com.android.tools.r8.a.O(s.values());
    }

    @Override // j$.time.chrono.a, j$.time.chrono.k
    public final b K(Map map, j$.time.format.e0 e0Var) {
        return (j$.time.g) super.K(map, e0Var);
    }

    @Override // j$.time.chrono.a
    public final void x(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l6 = (Long) map.remove(aVar);
        if (l6 != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.C(l6.longValue());
            }
            a.i(map, j$.time.temporal.a.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.R(l6.longValue(), r4)) + 1);
            a.i(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.S(l6.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.a
    public final b C(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l6 = (Long) map.remove(aVar);
        if (l6 != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.C(l6.longValue());
            }
            Long l10 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (l10 != null) {
                if (l10.longValue() == 1) {
                    a.i(map, j$.time.temporal.a.YEAR, l6.longValue());
                    return null;
                }
                if (l10.longValue() == 0) {
                    a.i(map, j$.time.temporal.a.YEAR, j$.com.android.tools.r8.a.U(1L, l6.longValue()));
                    return null;
                }
                throw new j$.time.b("Invalid value for era: " + l10);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            Long l11 = (Long) map.get(aVar2);
            if (e0Var != j$.time.format.e0.STRICT) {
                a.i(map, aVar2, (l11 == null || l11.longValue() > 0) ? l6.longValue() : j$.com.android.tools.r8.a.U(1L, l6.longValue()));
                return null;
            }
            if (l11 != null) {
                long longValue = l11.longValue();
                long longValue2 = l6.longValue();
                if (longValue <= 0) {
                    longValue2 = j$.com.android.tools.r8.a.U(1L, longValue2);
                }
                a.i(map, aVar2, longValue2);
                return null;
            }
            map.put(aVar, l6);
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        aVar3.C(((Long) map.get(aVar3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.a
    public final b z(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a7 = aVar.f17512b.a(((Long) map.remove(aVar)).longValue(), aVar);
        boolean z5 = true;
        if (e0Var == j$.time.format.e0.LENIENT) {
            return j$.time.g.Z(a7, 1, 1).e0(j$.com.android.tools.r8.a.U(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L)).d0(j$.com.android.tools.r8.a.U(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L));
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a10 = aVar2.f17512b.a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a11 = aVar3.f17512b.a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e0Var == j$.time.format.e0.SMART) {
            if (a10 == 4 || a10 == 6 || a10 == 9 || a10 == 11) {
                a11 = Math.min(a11, 30);
            } else if (a10 == 2) {
                j$.time.l lVar = j$.time.l.FEBRUARY;
                long j = a7;
                int i5 = j$.time.t.f17505b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z5 = false;
                }
                a11 = Math.min(a11, lVar.Q(z5));
            }
        }
        return j$.time.g.Z(a7, a10, a11);
    }

    @Override // j$.time.chrono.k
    public final j$.time.temporal.s q(j$.time.temporal.a aVar) {
        return aVar.f17512b;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new d0((byte) 1, this);
    }
}
