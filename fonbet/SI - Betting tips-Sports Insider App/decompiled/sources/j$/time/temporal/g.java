package j$.time.temporal;

import j$.time.format.d0;
import j$.time.format.e0;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class g implements p {
    public static final g DAY_OF_QUARTER;
    public static final g QUARTER_OF_YEAR;
    public static final g WEEK_BASED_YEAR;
    public static final g WEEK_OF_WEEK_BASED_YEAR;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f17514a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f17515b;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ TemporalAccessor k(Map map, d0 d0Var, e0 e0Var) {
        return null;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f17515b.clone();
    }

    static {
        g gVar = new g() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.p
            public final s n() {
                return s.g(1L, 90L, 92L);
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.DAY_OF_YEAR) || !temporalAccessor.e(a.MONTH_OF_YEAR) || !temporalAccessor.e(a.YEAR)) {
                    return false;
                }
                g gVar2 = i.f17519a;
                return j$.com.android.tools.r8.a.L(temporalAccessor).equals(j$.time.chrono.r.f17346c);
            }

            @Override // j$.time.temporal.p
            public final s j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                long C = temporalAccessor.C(g.QUARTER_OF_YEAR);
                if (C == 1) {
                    return j$.time.chrono.r.f17346c.O(temporalAccessor.C(a.YEAR)) ? s.f(1L, 91L) : s.f(1L, 90L);
                }
                if (C == 2) {
                    return s.f(1L, 91L);
                }
                if (C == 3 || C == 4) {
                    return s.f(1L, 92L);
                }
                return n();
            }

            @Override // j$.time.temporal.p
            public final long x(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new r("Unsupported field: DayOfQuarter");
                }
                return temporalAccessor.i(a.DAY_OF_YEAR) - g.f17514a[((temporalAccessor.i(a.MONTH_OF_YEAR) - 1) / 3) + (j$.time.chrono.r.f17346c.O(temporalAccessor.C(a.YEAR)) ? 4 : 0)];
            }

            @Override // j$.time.temporal.p
            public final l z(l lVar, long j) {
                long x10 = x(lVar);
                n().b(j, this);
                a aVar = a.DAY_OF_YEAR;
                return lVar.c((j - x10) + lVar.C(aVar), aVar);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.p
            public final TemporalAccessor k(Map map, d0 d0Var, e0 e0Var) {
                j$.time.g gVar2;
                long j;
                a aVar = a.YEAR;
                Long l6 = (Long) map.get(aVar);
                p pVar = g.QUARTER_OF_YEAR;
                Long l10 = (Long) map.get(pVar);
                if (l6 == null || l10 == null) {
                    return null;
                }
                int a7 = aVar.f17512b.a(l6.longValue(), aVar);
                long longValue = ((Long) map.get(g.DAY_OF_QUARTER)).longValue();
                g gVar3 = i.f17519a;
                if (!j$.com.android.tools.r8.a.L(d0Var).equals(j$.time.chrono.r.f17346c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                if (e0Var == e0.LENIENT) {
                    gVar2 = j$.time.g.Z(a7, 1, 1).e0(j$.com.android.tools.r8.a.T(j$.com.android.tools.r8.a.U(l10.longValue(), 1L), 3));
                    j = j$.com.android.tools.r8.a.U(longValue, 1L);
                } else {
                    j$.time.g Z = j$.time.g.Z(a7, ((pVar.n().a(l10.longValue(), pVar) - 1) * 3) + 1, 1);
                    if (longValue < 1 || longValue > 90) {
                        if (e0Var == e0.STRICT) {
                            j(Z).b(longValue, this);
                        } else {
                            n().b(longValue, this);
                        }
                    }
                    gVar2 = Z;
                    j = longValue - 1;
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(pVar);
                return gVar2.d0(j);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = gVar;
        g gVar2 = new g() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.p
            public final s n() {
                return s.f(1L, 4L);
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.MONTH_OF_YEAR)) {
                    return false;
                }
                g gVar3 = i.f17519a;
                return j$.com.android.tools.r8.a.L(temporalAccessor).equals(j$.time.chrono.r.f17346c);
            }

            @Override // j$.time.temporal.p
            public final long x(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return (temporalAccessor.C(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.p
            public final s j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new r("Unsupported field: QuarterOfYear");
                }
                return n();
            }

            @Override // j$.time.temporal.p
            public final l z(l lVar, long j) {
                long x10 = x(lVar);
                n().b(j, this);
                a aVar = a.MONTH_OF_YEAR;
                return lVar.c(((j - x10) * 3) + lVar.C(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = gVar2;
        g gVar3 = new g() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.p
            public final s n() {
                return s.g(1L, 52L, 53L);
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar4 = i.f17519a;
                return j$.com.android.tools.r8.a.L(temporalAccessor).equals(j$.time.chrono.r.f17346c);
            }

            @Override // j$.time.temporal.p
            public final s j(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return g.R(j$.time.g.R(temporalAccessor));
                }
                throw new r("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final long x(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new r("Unsupported field: WeekOfWeekBasedYear");
                }
                return g.C(j$.time.g.R(temporalAccessor));
            }

            @Override // j$.time.temporal.p
            public final l z(l lVar, long j) {
                n().b(j, this);
                return lVar.d(j$.com.android.tools.r8.a.U(j, x(lVar)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.g, j$.time.temporal.p
            public final TemporalAccessor k(Map map, d0 d0Var, e0 e0Var) {
                j$.time.g c2;
                long j;
                long j6;
                p pVar = g.WEEK_BASED_YEAR;
                Long l6 = (Long) map.get(pVar);
                a aVar = a.DAY_OF_WEEK;
                Long l10 = (Long) map.get(aVar);
                if (l6 == null || l10 == null) {
                    return null;
                }
                int a7 = pVar.n().a(l6.longValue(), pVar);
                long longValue = ((Long) map.get(g.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                g gVar4 = i.f17519a;
                if (!j$.com.android.tools.r8.a.L(d0Var).equals(j$.time.chrono.r.f17346c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                j$.time.g Z = j$.time.g.Z(a7, 1, 4);
                if (e0Var == e0.LENIENT) {
                    long longValue2 = l10.longValue();
                    if (longValue2 > 7) {
                        long j10 = longValue2 - 1;
                        j = 1;
                        Z = Z.f0(j10 / 7);
                        j6 = j10 % 7;
                    } else {
                        j = 1;
                        if (longValue2 < 1) {
                            Z = Z.f0(j$.com.android.tools.r8.a.U(longValue2, 7L) / 7);
                            j6 = (longValue2 + 6) % 7;
                        }
                        c2 = Z.f0(j$.com.android.tools.r8.a.U(longValue, j)).c(longValue2, aVar);
                    }
                    longValue2 = j6 + j;
                    c2 = Z.f0(j$.com.android.tools.r8.a.U(longValue, j)).c(longValue2, aVar);
                } else {
                    int a10 = aVar.f17512b.a(l10.longValue(), aVar);
                    if (longValue < 1 || longValue > 52) {
                        if (e0Var == e0.STRICT) {
                            g.R(Z).b(longValue, this);
                        } else {
                            n().b(longValue, this);
                        }
                    }
                    c2 = Z.f0(longValue - 1).c(a10, aVar);
                }
                map.remove(this);
                map.remove(pVar);
                map.remove(aVar);
                return c2;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = gVar3;
        g gVar4 = new g() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.p
            public final s n() {
                return a.YEAR.f17512b;
            }

            @Override // j$.time.temporal.p
            public final boolean i(TemporalAccessor temporalAccessor) {
                if (!temporalAccessor.e(a.EPOCH_DAY)) {
                    return false;
                }
                g gVar5 = i.f17519a;
                return j$.com.android.tools.r8.a.L(temporalAccessor).equals(j$.time.chrono.r.f17346c);
            }

            @Override // j$.time.temporal.p
            public final long x(TemporalAccessor temporalAccessor) {
                if (i(temporalAccessor)) {
                    return g.P(j$.time.g.R(temporalAccessor));
                }
                throw new r("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.p
            public final s j(TemporalAccessor temporalAccessor) {
                if (!i(temporalAccessor)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                return n();
            }

            @Override // j$.time.temporal.p
            public final l z(l lVar, long j) {
                if (!i(lVar)) {
                    throw new r("Unsupported field: WeekBasedYear");
                }
                int a7 = a.YEAR.f17512b.a(j, g.WEEK_BASED_YEAR);
                j$.time.g R = j$.time.g.R(lVar);
                int i5 = R.i(a.DAY_OF_WEEK);
                int C = g.C(R);
                if (C == 53 && g.Q(a7) == 52) {
                    C = 52;
                }
                return lVar.w(j$.time.g.Z(a7, 1, 4).d0(((C - 1) * 7) + (i5 - r6.i(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = gVar4;
        f17515b = new g[]{gVar, gVar2, gVar3, gVar4};
        f17514a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static s R(j$.time.g gVar) {
        return s.f(1L, Q(P(gVar)));
    }

    public static int Q(int i5) {
        j$.time.g Z = j$.time.g.Z(i5, 1, 1);
        if (Z.T() != j$.time.d.THURSDAY) {
            return (Z.T() == j$.time.d.WEDNESDAY && Z.p()) ? 53 : 52;
        }
        return 53;
    }

    public static int C(j$.time.g gVar) {
        int ordinal = gVar.T().ordinal();
        int U = gVar.U() - 1;
        int i5 = (3 - ordinal) + U;
        int i10 = i5 - ((i5 / 7) * 7);
        int i11 = i10 - 3;
        if (i11 < -3) {
            i11 = i10 + 4;
        }
        if (U >= i11) {
            int i12 = ((U - i11) / 7) + 1;
            if (i12 != 53 || i11 == -3 || (i11 == -2 && gVar.p())) {
                return i12;
            }
            return 1;
        }
        if (gVar.U() != 180) {
            gVar = j$.time.g.b0(gVar.f17472a, 180);
        }
        return (int) R(gVar.g0(-1L)).f17540d;
    }

    public static int P(j$.time.g gVar) {
        int i5 = gVar.f17472a;
        int U = gVar.U();
        if (U <= 3) {
            return U - gVar.T().ordinal() < -2 ? i5 - 1 : i5;
        }
        if (U >= 363) {
            return ((U - 363) - (gVar.p() ? 1 : 0)) - gVar.T().ordinal() >= 0 ? i5 + 1 : i5;
        }
        return i5;
    }
}
