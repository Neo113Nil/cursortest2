package j$.time.format;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d0 implements TemporalAccessor {

    /* renamed from: b, reason: collision with root package name */
    public ZoneId f17385b;

    /* renamed from: c, reason: collision with root package name */
    public j$.time.chrono.k f17386c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17387d;

    /* renamed from: e, reason: collision with root package name */
    public e0 f17388e;

    /* renamed from: f, reason: collision with root package name */
    public j$.time.chrono.b f17389f;

    /* renamed from: g, reason: collision with root package name */
    public j$.time.j f17390g;

    /* renamed from: a, reason: collision with root package name */
    public final Map f17384a = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public j$.time.q f17391h = j$.time.q.f17497d;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.a(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.s k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        if (((HashMap) this.f17384a).containsKey(pVar)) {
            return true;
        }
        j$.time.chrono.b bVar = this.f17389f;
        if (bVar != null && bVar.e(pVar)) {
            return true;
        }
        j$.time.j jVar = this.f17390g;
        if (jVar == null || !jVar.e(pVar)) {
            return (pVar == null || (pVar instanceof j$.time.temporal.a) || !pVar.i(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        Long l6 = (Long) ((HashMap) this.f17384a).get(pVar);
        if (l6 != null) {
            return l6.longValue();
        }
        j$.time.chrono.b bVar = this.f17389f;
        if (bVar != null && bVar.e(pVar)) {
            return this.f17389f.C(pVar);
        }
        j$.time.j jVar = this.f17390g;
        if (jVar != null && jVar.e(pVar)) {
            return this.f17390g.C(pVar);
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", pVar));
        }
        return pVar.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(j$.time.x xVar) {
        if (xVar == j$.time.temporal.q.f17530a) {
            return this.f17385b;
        }
        if (xVar == j$.time.temporal.q.f17531b) {
            return this.f17386c;
        }
        if (xVar == j$.time.temporal.q.f17535f) {
            j$.time.chrono.b bVar = this.f17389f;
            if (bVar != null) {
                return j$.time.g.R(bVar);
            }
            return null;
        }
        if (xVar == j$.time.temporal.q.f17536g) {
            return this.f17390g;
        }
        if (xVar == j$.time.temporal.q.f17533d) {
            Long l6 = (Long) ((HashMap) this.f17384a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l6 != null) {
                return ZoneOffset.X(l6.intValue());
            }
            ZoneId zoneId = this.f17385b;
            return zoneId instanceof ZoneOffset ? zoneId : xVar.g(this);
        }
        if (xVar == j$.time.temporal.q.f17534e) {
            return xVar.g(this);
        }
        if (xVar == j$.time.temporal.q.f17532c) {
            return null;
        }
        return xVar.g(this);
    }

    public final void u(j$.time.temporal.p pVar, j$.time.temporal.a aVar, Long l6) {
        Long l10 = (Long) ((HashMap) this.f17384a).put(aVar, l6);
        if (l10 == null || l10.longValue() == l6.longValue()) {
            return;
        }
        throw new j$.time.b("Conflict found: " + aVar + " " + l10 + " differs from " + aVar + " " + l6 + " while resolving  " + pVar);
    }

    public final void l() {
        if (((HashMap) this.f17384a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
            ZoneId zoneId = this.f17385b;
            if (zoneId != null) {
                m(zoneId);
                return;
            }
            Long l6 = (Long) ((HashMap) this.f17384a).get(j$.time.temporal.a.OFFSET_SECONDS);
            if (l6 != null) {
                m(ZoneOffset.X(l6.intValue()));
            }
        }
    }

    public final void m(ZoneId zoneId) {
        Map map = this.f17384a;
        j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
        t(this.f17386c.L(Instant.ofEpochSecond(((Long) ((HashMap) map).remove(aVar)).longValue()), zoneId).f());
        u(aVar, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(r5.b().c0()));
    }

    public final void t(j$.time.chrono.b bVar) {
        j$.time.chrono.b bVar2 = this.f17389f;
        if (bVar2 != null) {
            if (bVar == null || bVar2.equals(bVar)) {
                return;
            }
            throw new j$.time.b("Conflict found: Fields resolved to two different dates: " + this.f17389f + " " + bVar);
        }
        if (bVar != null) {
            if (!this.f17386c.equals(bVar.a())) {
                throw new j$.time.b("ChronoLocalDate must use the effective parsed chronology: " + this.f17386c);
            }
            this.f17389f = bVar;
        }
    }

    public final void q() {
        Map map = this.f17384a;
        j$.time.temporal.a aVar = j$.time.temporal.a.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(aVar)) {
            long longValue = ((Long) ((HashMap) this.f17384a).remove(aVar)).longValue();
            e0 e0Var = this.f17388e;
            if (e0Var == e0.STRICT || (e0Var == e0.SMART && longValue != 0)) {
                aVar.C(longValue);
            }
            j$.time.temporal.a aVar2 = j$.time.temporal.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            u(aVar, aVar2, Long.valueOf(longValue));
        }
        Map map2 = this.f17384a;
        j$.time.temporal.a aVar3 = j$.time.temporal.a.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(aVar3)) {
            long longValue2 = ((Long) ((HashMap) this.f17384a).remove(aVar3)).longValue();
            e0 e0Var2 = this.f17388e;
            if (e0Var2 == e0.STRICT || (e0Var2 == e0.SMART && longValue2 != 0)) {
                aVar3.C(longValue2);
            }
            u(aVar3, j$.time.temporal.a.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        Map map3 = this.f17384a;
        j$.time.temporal.a aVar4 = j$.time.temporal.a.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(aVar4)) {
            Map map4 = this.f17384a;
            j$.time.temporal.a aVar5 = j$.time.temporal.a.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(aVar5)) {
                long longValue3 = ((Long) ((HashMap) this.f17384a).remove(aVar4)).longValue();
                long longValue4 = ((Long) ((HashMap) this.f17384a).remove(aVar5)).longValue();
                if (this.f17388e == e0.LENIENT) {
                    u(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(longValue3, 12), longValue4)));
                } else {
                    aVar4.C(longValue3);
                    aVar5.C(longValue3);
                    u(aVar4, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        Map map5 = this.f17384a;
        j$.time.temporal.a aVar6 = j$.time.temporal.a.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(aVar6)) {
            long longValue5 = ((Long) ((HashMap) this.f17384a).remove(aVar6)).longValue();
            if (this.f17388e != e0.LENIENT) {
                aVar6.C(longValue5);
            }
            u(aVar6, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            u(aVar6, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            u(aVar6, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            u(aVar6, j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        Map map6 = this.f17384a;
        j$.time.temporal.a aVar7 = j$.time.temporal.a.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(aVar7)) {
            long longValue6 = ((Long) ((HashMap) this.f17384a).remove(aVar7)).longValue();
            if (this.f17388e != e0.LENIENT) {
                aVar7.C(longValue6);
            }
            u(aVar7, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            u(aVar7, j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        Map map7 = this.f17384a;
        j$.time.temporal.a aVar8 = j$.time.temporal.a.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(aVar8)) {
            long longValue7 = ((Long) ((HashMap) this.f17384a).remove(aVar8)).longValue();
            if (this.f17388e != e0.LENIENT) {
                aVar8.C(longValue7);
            }
            u(aVar8, j$.time.temporal.a.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            u(aVar8, j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        Map map8 = this.f17384a;
        j$.time.temporal.a aVar9 = j$.time.temporal.a.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(aVar9)) {
            long longValue8 = ((Long) ((HashMap) this.f17384a).remove(aVar9)).longValue();
            if (this.f17388e != e0.LENIENT) {
                aVar9.C(longValue8);
            }
            u(aVar9, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            u(aVar9, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            u(aVar9, j$.time.temporal.a.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        Map map9 = this.f17384a;
        j$.time.temporal.a aVar10 = j$.time.temporal.a.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(aVar10)) {
            long longValue9 = ((Long) ((HashMap) this.f17384a).remove(aVar10)).longValue();
            if (this.f17388e != e0.LENIENT) {
                aVar10.C(longValue9);
            }
            u(aVar10, j$.time.temporal.a.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            u(aVar10, j$.time.temporal.a.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        Map map10 = this.f17384a;
        j$.time.temporal.a aVar11 = j$.time.temporal.a.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(aVar11)) {
            long longValue10 = ((Long) ((HashMap) this.f17384a).get(aVar11)).longValue();
            e0 e0Var3 = this.f17388e;
            e0 e0Var4 = e0.LENIENT;
            if (e0Var3 != e0Var4) {
                aVar11.C(longValue10);
            }
            Map map11 = this.f17384a;
            j$.time.temporal.a aVar12 = j$.time.temporal.a.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(aVar12)) {
                long longValue11 = ((Long) ((HashMap) this.f17384a).remove(aVar12)).longValue();
                if (this.f17388e != e0Var4) {
                    aVar12.C(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                u(aVar12, aVar11, Long.valueOf(longValue10));
            }
            Map map12 = this.f17384a;
            j$.time.temporal.a aVar13 = j$.time.temporal.a.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(aVar13)) {
                long longValue12 = ((Long) ((HashMap) this.f17384a).remove(aVar13)).longValue();
                if (this.f17388e != e0Var4) {
                    aVar13.C(longValue12);
                }
                u(aVar13, aVar11, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        Map map13 = this.f17384a;
        j$.time.temporal.a aVar14 = j$.time.temporal.a.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(aVar14)) {
            Map map14 = this.f17384a;
            j$.time.temporal.a aVar15 = j$.time.temporal.a.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(aVar15)) {
                Map map15 = this.f17384a;
                j$.time.temporal.a aVar16 = j$.time.temporal.a.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(aVar16) && ((HashMap) this.f17384a).containsKey(aVar11)) {
                    n(((Long) ((HashMap) this.f17384a).remove(aVar14)).longValue(), ((Long) ((HashMap) this.f17384a).remove(aVar15)).longValue(), ((Long) ((HashMap) this.f17384a).remove(aVar16)).longValue(), ((Long) ((HashMap) this.f17384a).remove(aVar11)).longValue());
                }
            }
        }
    }

    public final void n(long j, long j6, long j10, long j11) {
        if (this.f17388e == e0.LENIENT) {
            long N = j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.N(j$.com.android.tools.r8.a.T(j, 3600000000000L), j$.com.android.tools.r8.a.T(j6, 60000000000L)), j$.com.android.tools.r8.a.T(j10, 1000000000L)), j11);
            s(j$.time.j.U(j$.com.android.tools.r8.a.R(N, 86400000000000L)), j$.time.q.a(0, 0, (int) j$.com.android.tools.r8.a.S(N, 86400000000000L)));
            return;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.MINUTE_OF_HOUR;
        int a7 = aVar.f17512b.a(j6, aVar);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_SECOND;
        int a10 = aVar2.f17512b.a(j11, aVar2);
        if (this.f17388e == e0.SMART && j == 24 && a7 == 0 && j10 == 0 && a10 == 0) {
            s(j$.time.j.f17480g, j$.time.q.a(0, 0, 1));
            return;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.HOUR_OF_DAY;
        int a11 = aVar3.f17512b.a(j, aVar3);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.SECOND_OF_MINUTE;
        s(j$.time.j.T(a11, a7, aVar4.f17512b.a(j10, aVar4), a10), j$.time.q.f17497d);
    }

    public final void s(j$.time.j jVar, j$.time.q qVar) {
        j$.time.j jVar2 = this.f17390g;
        if (jVar2 != null) {
            if (!jVar2.equals(jVar)) {
                throw new j$.time.b("Conflict found: Fields resolved to different times: " + this.f17390g + " " + jVar);
            }
            j$.time.q qVar2 = this.f17391h;
            qVar2.getClass();
            j$.time.q qVar3 = j$.time.q.f17497d;
            if (qVar2 != qVar3 && qVar != qVar3 && !this.f17391h.equals(qVar)) {
                throw new j$.time.b("Conflict found: Fields resolved to different excess periods: " + this.f17391h + " " + qVar);
            }
            this.f17391h = qVar;
            return;
        }
        this.f17390g = jVar;
        this.f17391h = qVar;
    }

    public final void h(TemporalAccessor temporalAccessor) {
        Iterator it = ((HashMap) this.f17384a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            j$.time.temporal.p pVar = (j$.time.temporal.p) entry.getKey();
            if (temporalAccessor.e(pVar)) {
                try {
                    long C = temporalAccessor.C(pVar);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (C != longValue) {
                        throw new j$.time.b("Conflict found: Field " + pVar + " " + C + " differs from " + pVar + " " + longValue + " derived from " + temporalAccessor);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(this.f17384a);
        sb2.append(',');
        sb2.append(this.f17386c);
        if (this.f17385b != null) {
            sb2.append(',');
            sb2.append(this.f17385b);
        }
        if (this.f17389f != null || this.f17390g != null) {
            sb2.append(" resolved to ");
            j$.time.chrono.b bVar = this.f17389f;
            if (bVar != null) {
                sb2.append(bVar);
                if (this.f17390g != null) {
                    sb2.append('T');
                    sb2.append(this.f17390g);
                }
            } else {
                sb2.append(this.f17390g);
            }
        }
        return sb2.toString();
    }
}
