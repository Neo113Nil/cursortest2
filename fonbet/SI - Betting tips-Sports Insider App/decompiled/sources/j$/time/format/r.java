package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class r extends i {

    /* renamed from: g, reason: collision with root package name */
    public final char f17438g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17439h;

    @Override // j$.time.format.i, j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        return f(vVar.f17458a.f17369b).j(vVar, charSequence, i5);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        return f(yVar.f17468b.f17369b).i(yVar, sb2);
    }

    public r(char c2, int i5, int i10, int i11, int i12) {
        super(null, i10, i11, f0.NOT_NEGATIVE, i12);
        this.f17438g = c2;
        this.f17439h = i5;
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.f17411e == -1) {
            return this;
        }
        return new r(this.f17438g, this.f17439h, this.f17408b, this.f17409c, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i5) {
        return new r(this.f17438g, this.f17439h, this.f17408b, this.f17409c, this.f17411e + i5);
    }

    public final i f(Locale locale) {
        j$.time.temporal.t tVar;
        ConcurrentHashMap concurrentHashMap = j$.time.temporal.u.f17550g;
        Objects.requireNonNull(locale, CommonUrlParts.LOCALE);
        j$.time.temporal.u a7 = j$.time.temporal.u.a(j$.time.d.f17362a[((((int) ((r7.getFirstDayOfWeek() - 1) % 7)) + 7) + j$.time.d.SUNDAY.ordinal()) % 7], Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry())).getMinimalDaysInFirstWeek());
        char c2 = this.f17438g;
        if (c2 == 'W') {
            tVar = a7.f17555d;
        } else {
            if (c2 == 'Y') {
                j$.time.temporal.t tVar2 = a7.f17557f;
                int i5 = this.f17439h;
                if (i5 == 2) {
                    return new o(tVar2, 2, 2, o.f17431h, this.f17411e);
                }
                return new i(tVar2, i5, 19, i5 < 4 ? f0.NORMAL : f0.EXCEEDS_PAD, this.f17411e);
            }
            if (c2 == 'c' || c2 == 'e') {
                tVar = a7.f17554c;
            } else {
                if (c2 != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                tVar = a7.f17556e;
            }
        }
        return new i(tVar, this.f17408b, this.f17409c, f0.NOT_NEGATIVE, this.f17411e);
    }

    @Override // j$.time.format.i
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        int i5 = this.f17439h;
        char c2 = this.f17438g;
        if (c2 != 'Y') {
            if (c2 == 'W') {
                sb2.append("WeekOfMonth");
            } else if (c2 == 'c' || c2 == 'e') {
                sb2.append("DayOfWeek");
            } else if (c2 == 'w') {
                sb2.append("WeekOfWeekBasedYear");
            }
            sb2.append(StringUtils.COMMA);
            sb2.append(i5);
        } else if (i5 == 1) {
            sb2.append("WeekBasedYear");
        } else if (i5 == 2) {
            sb2.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb2.append("WeekBasedYear,");
            sb2.append(i5);
            sb2.append(",19,");
            sb2.append(i5 < 4 ? f0.NORMAL : f0.EXCEEDS_PAD);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
