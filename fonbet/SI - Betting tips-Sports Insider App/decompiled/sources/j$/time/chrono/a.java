package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f17304a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f17305b = new ConcurrentHashMap();

    public abstract /* synthetic */ b j();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((k) obj).getId());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static k k(k kVar, String str) {
        String l6;
        k kVar2 = (k) f17304a.putIfAbsent(str, kVar);
        if (kVar2 == null && (l6 = kVar.l()) != null) {
            f17305b.putIfAbsent(l6, kVar);
        }
        return kVar2;
    }

    @Override // j$.time.chrono.k
    public b K(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            return h(((Long) map.remove(aVar)).longValue());
        }
        x(map, e0Var);
        b C = C(map, e0Var);
        if (C != null) {
            return C;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!map.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (map.containsKey(aVar3)) {
            if (map.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return z(map, e0Var);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(aVar5)) {
                    int a7 = q(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e0Var == j$.time.format.e0.LENIENT) {
                        long U = j$.com.android.tools.r8.a.U(((Long) map.remove(aVar3)).longValue(), 1L);
                        return I(a7, 1, 1).d(U, (TemporalUnit) ChronoUnit.MONTHS).d(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int a10 = q(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    int a11 = q(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4);
                    b d10 = I(a7, a10, 1).d((q(aVar5).a(((Long) map.remove(aVar5)).longValue(), aVar5) - 1) + ((a11 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (e0Var != j$.time.format.e0.STRICT || d10.i(aVar3) == a10) {
                        return d10;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (map.containsKey(aVar6)) {
                    int a12 = q(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
                    if (e0Var == j$.time.format.e0.LENIENT) {
                        return n(I(a12, 1, 1), j$.com.android.tools.r8.a.U(((Long) map.remove(aVar3)).longValue(), 1L), j$.com.android.tools.r8.a.U(((Long) map.remove(aVar4)).longValue(), 1L), j$.com.android.tools.r8.a.U(((Long) map.remove(aVar6)).longValue(), 1L));
                    }
                    int a13 = q(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
                    b w10 = I(a12, a13, 1).d((q(aVar4).a(((Long) map.remove(aVar4)).longValue(), aVar4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).w(new j$.time.temporal.n(j$.time.d.P(q(aVar6).a(((Long) map.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (e0Var != j$.time.format.e0.STRICT || w10.i(aVar3) == a13) {
                        return w10;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (map.containsKey(aVar7)) {
            int a14 = q(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (e0Var != j$.time.format.e0.LENIENT) {
                return m(a14, q(aVar7).a(((Long) map.remove(aVar7)).longValue(), aVar7));
            }
            return m(a14, 1).d(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar9)) {
            int a15 = q(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
            if (e0Var == j$.time.format.e0.LENIENT) {
                return m(a15, 1).d(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).d(j$.com.android.tools.r8.a.U(((Long) map.remove(aVar9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int a16 = q(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8);
            b d11 = m(a15, 1).d((q(aVar9).a(((Long) map.remove(aVar9)).longValue(), aVar9) - 1) + ((a16 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (e0Var != j$.time.format.e0.STRICT || d11.i(aVar2) == a15) {
                return d11;
            }
            throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!map.containsKey(aVar10)) {
            return null;
        }
        int a17 = q(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        if (e0Var == j$.time.format.e0.LENIENT) {
            return n(m(a17, 1), 0L, j$.com.android.tools.r8.a.U(((Long) map.remove(aVar8)).longValue(), 1L), j$.com.android.tools.r8.a.U(((Long) map.remove(aVar10)).longValue(), 1L));
        }
        b w11 = m(a17, 1).d((q(aVar8).a(((Long) map.remove(aVar8)).longValue(), aVar8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).w(new j$.time.temporal.n(j$.time.d.P(q(aVar10).a(((Long) map.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (e0Var != j$.time.format.e0.STRICT || w11.i(aVar2) == a17) {
            return w11;
        }
        throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDateTime F(TemporalAccessor temporalAccessor) {
        try {
            return A(temporalAccessor).E(j$.time.j.R(temporalAccessor));
        } catch (j$.time.b e7) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + temporalAccessor.getClass(), e7);
        }
    }

    public void x(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l6 = (Long) map.remove(aVar);
        if (l6 != null) {
            if (e0Var != j$.time.format.e0.LENIENT) {
                aVar.C(l6.longValue());
            }
            b c2 = j().c(1L, (j$.time.temporal.p) j$.time.temporal.a.DAY_OF_MONTH).c(l6.longValue(), (j$.time.temporal.p) aVar);
            i(map, j$.time.temporal.a.MONTH_OF_YEAR, c2.i(r0));
            i(map, j$.time.temporal.a.YEAR, c2.i(r0));
        }
    }

    public b C(Map map, j$.time.format.e0 e0Var) {
        int M;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l6 = (Long) map.remove(aVar);
        if (l6 != null) {
            Long l10 = (Long) map.remove(j$.time.temporal.a.ERA);
            if (e0Var != j$.time.format.e0.LENIENT) {
                M = q(aVar).a(l6.longValue(), aVar);
            } else {
                M = j$.com.android.tools.r8.a.M(l6.longValue());
            }
            if (l10 != null) {
                i(map, j$.time.temporal.a.YEAR, u(t(q(r2).a(l10.longValue(), r2)), M));
                return null;
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
            if (map.containsKey(aVar2)) {
                i(map, aVar2, u(m(q(aVar2).a(((Long) map.get(aVar2)).longValue(), aVar2), 1).G(), M));
                return null;
            }
            if (e0Var == j$.time.format.e0.STRICT) {
                map.put(aVar, l6);
                return null;
            }
            if (s().isEmpty()) {
                i(map, aVar2, M);
                return null;
            }
            i(map, aVar2, u((l) r9.get(r9.size() - 1), M));
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.ERA;
        if (!map.containsKey(aVar3)) {
            return null;
        }
        q(aVar3).b(((Long) map.get(aVar3)).longValue(), aVar3);
        return null;
    }

    public b z(Map map, j$.time.format.e0 e0Var) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a7 = q(aVar).a(((Long) map.remove(aVar)).longValue(), aVar);
        if (e0Var == j$.time.format.e0.LENIENT) {
            long U = j$.com.android.tools.r8.a.U(((Long) map.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1L);
            return I(a7, 1, 1).d(U, (TemporalUnit) ChronoUnit.MONTHS).d(j$.com.android.tools.r8.a.U(((Long) map.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a10 = q(aVar2).a(((Long) map.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a11 = q(aVar3).a(((Long) map.remove(aVar3)).longValue(), aVar3);
        if (e0Var != j$.time.format.e0.SMART) {
            return I(a7, a10, a11);
        }
        try {
            return I(a7, a10, a11);
        } catch (j$.time.b unused) {
            return I(a7, a10, 1).w(new j$.time.x(2));
        }
    }

    public static b n(b bVar, long j, long j6, long j10) {
        long j11;
        b d10 = bVar.d(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        b d11 = d10.d(j6, (TemporalUnit) chronoUnit);
        if (j10 > 7) {
            long j12 = j10 - 1;
            d11 = d11.d(j12 / 7, (TemporalUnit) chronoUnit);
            j11 = j12 % 7;
        } else {
            if (j10 < 1) {
                d11 = d11.d(j$.com.android.tools.r8.a.U(j10, 7L) / 7, (TemporalUnit) chronoUnit);
                j11 = (j10 + 6) % 7;
            }
            return d11.w(new j$.time.temporal.n(j$.time.d.P((int) j10).getValue(), 0));
        }
        j10 = j11 + 1;
        return d11.w(new j$.time.temporal.n(j$.time.d.P((int) j10).getValue(), 0));
    }

    public static void i(Map map, j$.time.temporal.a aVar, long j) {
        Long l6 = (Long) map.get(aVar);
        if (l6 != null && l6.longValue() != j) {
            throw new j$.time.b("Conflict found: " + aVar + " " + l6 + " differs from " + aVar + " " + j);
        }
        map.put(aVar, Long.valueOf(j));
    }

    @Override // j$.time.chrono.k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && getId().compareTo(((a) obj).getId()) == 0;
    }

    @Override // j$.time.chrono.k
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // j$.time.chrono.k
    public final String toString() {
        return getId();
    }
}
