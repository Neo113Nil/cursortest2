package j$.time.format;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        Long a7 = yVar.a(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = yVar.f17467a;
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long valueOf = temporalAccessor.e(aVar) ? Long.valueOf(temporalAccessor.C(aVar)) : null;
        int i5 = 0;
        if (a7 == null) {
            return false;
        }
        long longValue = a7.longValue();
        int a10 = aVar.f17512b.a(valueOf != null ? valueOf.longValue() : 0L, aVar);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long S = j$.com.android.tools.r8.a.S(j, 315569520000L) + 1;
            LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(j$.com.android.tools.r8.a.R(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (S > 0) {
                sb2.append('+');
                sb2.append(S);
            }
            sb2.append(ofEpochSecond);
            if (ofEpochSecond.f17288b.f17484c == 0) {
                sb2.append(":00");
            }
        } else {
            long j6 = longValue + 62167219200L;
            long j10 = j6 / 315569520000L;
            long j11 = j6 % 315569520000L;
            LocalDateTime ofEpochSecond2 = LocalDateTime.ofEpochSecond(j11 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb2.length();
            sb2.append(ofEpochSecond2);
            if (ofEpochSecond2.f17288b.f17484c == 0) {
                sb2.append(":00");
            }
            if (j10 < 0) {
                if (ofEpochSecond2.f17287a.f17472a == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j10 - 1));
                } else if (j11 == 0) {
                    sb2.insert(length, j10);
                } else {
                    sb2.insert(length + 1, Math.abs(j10));
                }
            }
        }
        if (a10 > 0) {
            sb2.append('.');
            int i10 = 100000000;
            while (true) {
                if (a10 <= 0 && i5 % 3 == 0 && i5 >= -2) {
                    break;
                }
                int i11 = a10 / i10;
                sb2.append((char) (i11 + 48));
                a10 -= i11 * i10;
                i10 /= 10;
                i5++;
            }
        }
        sb2.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        u uVar = new u();
        uVar.a(DateTimeFormatter.ISO_LOCAL_DATE);
        uVar.d('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        uVar.l(aVar, 2);
        uVar.d(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar.l(aVar2, 2);
        uVar.d(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar.l(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i10 = 1;
        uVar.b(aVar4, 0, 9, true);
        uVar.d('Z');
        d dVar = uVar.q(Locale.getDefault(), e0.SMART, null).f17368a;
        if (dVar.f17383b) {
            dVar = new d(dVar.f17382a, false);
        }
        v vVar2 = new v(vVar.f17458a);
        vVar2.f17459b = vVar.f17459b;
        vVar2.f17460c = vVar.f17460c;
        int j = dVar.j(vVar2, charSequence, i5);
        if (j < 0) {
            return j;
        }
        long longValue = vVar2.d(j$.time.temporal.a.YEAR).longValue();
        int intValue = vVar2.d(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int intValue2 = vVar2.d(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int intValue3 = vVar2.d(aVar).intValue();
        int intValue4 = vVar2.d(aVar2).intValue();
        Long d10 = vVar2.d(aVar3);
        Long d11 = vVar2.d(aVar4);
        int intValue5 = d10 != null ? d10.intValue() : 0;
        int intValue6 = d11 != null ? d11.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            intValue3 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            vVar.c().f17387d = true;
            i10 = 0;
            intValue5 = 59;
        } else {
            i10 = 0;
        }
        int i11 = ((int) longValue) % AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
        try {
            LocalDateTime localDateTime = LocalDateTime.f17285c;
            LocalDateTime plusDays = new LocalDateTime(j$.time.g.Z(i11, intValue, intValue2), j$.time.j.T(intValue3, intValue4, intValue5, 0)).plusDays(i10);
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            plusDays.getClass();
            return vVar.f(aVar4, intValue6, i5, vVar.f(j$.time.temporal.a.INSTANT_SECONDS, j$.com.android.tools.r8.a.w(plusDays, zoneOffset) + j$.com.android.tools.r8.a.T(longValue / 10000, 315569520000L), i5, j));
        } catch (RuntimeException unused) {
            return ~i5;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
