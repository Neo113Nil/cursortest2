package j$.time.format;

import com.sports.insider.data.repository.room.news.NewsTable;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.io.IOException;
import java.text.ParsePosition;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_DATE_TIME;
    public static final DateTimeFormatter ISO_INSTANT;
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter ISO_LOCAL_DATE_TIME;

    /* renamed from: a, reason: collision with root package name */
    public final d f17368a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f17369b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f17370c;

    /* renamed from: d, reason: collision with root package name */
    public final e0 f17371d;

    /* renamed from: e, reason: collision with root package name */
    public final j$.time.chrono.k f17372e;

    /* JADX WARN: Removed duplicated region for block: B:150:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static DateTimeFormatter ofPattern(String str) {
        boolean z5;
        int i5;
        int i10;
        u uVar = new u();
        Objects.requireNonNull(str, "pattern");
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                int i12 = i11 + 1;
                while (i12 < str.length() && str.charAt(i12) == charAt) {
                    i12++;
                }
                int i13 = i12 - i11;
                if (charAt == 'p') {
                    if (i12 >= str.length() || (((charAt = str.charAt(i12)) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                        i5 = i12;
                        i10 = i13;
                        i13 = 0;
                    } else {
                        i5 = i12 + 1;
                        while (i5 < str.length() && str.charAt(i5) == charAt) {
                            i5++;
                        }
                        i10 = i5 - i12;
                    }
                    if (i13 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i13 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i13);
                    }
                    u uVar2 = uVar.f17451a;
                    uVar2.f17455e = i13;
                    uVar2.f17456f = ' ';
                    uVar2.f17457g = -1;
                    i13 = i10;
                    i12 = i5;
                }
                j$.time.temporal.p pVar = (j$.time.temporal.p) ((HashMap) u.f17450i).get(Character.valueOf(charAt));
                if (pVar != null) {
                    if (charAt != 'A') {
                        if (charAt != 'Q') {
                            if (charAt == 'S') {
                                uVar.b(j$.time.temporal.a.NANO_OF_SECOND, i13, i13, false);
                            } else if (charAt != 'a') {
                                if (charAt != 'k') {
                                    if (charAt != 'q') {
                                        if (charAt != 's') {
                                            if (charAt == 'u' || charAt == 'y') {
                                                if (i13 == 2) {
                                                    j$.time.g gVar = o.f17431h;
                                                    Objects.requireNonNull(pVar, "field");
                                                    Objects.requireNonNull(gVar, "baseDate");
                                                    o oVar = new o(pVar, 2, 2, gVar, 0);
                                                    if (gVar == null) {
                                                        long j = 0;
                                                        if (!pVar.n().e(j)) {
                                                            throw new IllegalArgumentException("The base value must be within the range of the field");
                                                        }
                                                        if (j + i.f17406f[2] > 2147483647L) {
                                                            throw new j$.time.b("Unable to add printer-parser as the range exceeds the capacity of an int");
                                                        }
                                                    }
                                                    uVar.j(oVar);
                                                } else if (i13 < 4) {
                                                    uVar.m(pVar, i13, 19, f0.NORMAL);
                                                } else {
                                                    uVar.m(pVar, i13, 19, f0.EXCEEDS_PAD);
                                                }
                                            } else if (charAt == 'g') {
                                                uVar.m(pVar, i13, 19, f0.NORMAL);
                                            } else if (charAt != 'h' && charAt != 'm') {
                                                if (charAt != 'n') {
                                                    switch (charAt) {
                                                        case 'D':
                                                            if (i13 == 1) {
                                                                uVar.k(pVar);
                                                                break;
                                                            } else {
                                                                if (i13 != 2 && i13 != 3) {
                                                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                }
                                                                uVar.m(pVar, i13, 3, f0.NOT_NEGATIVE);
                                                                break;
                                                            }
                                                        case 'E':
                                                            break;
                                                        case 'F':
                                                            if (i13 != 1) {
                                                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                            }
                                                            uVar.k(pVar);
                                                            break;
                                                        case 'G':
                                                            if (i13 != 1 && i13 != 2 && i13 != 3) {
                                                                if (i13 == 4) {
                                                                    uVar.i(pVar, g0.FULL);
                                                                    break;
                                                                } else {
                                                                    if (i13 != 5) {
                                                                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                                                    }
                                                                    uVar.i(pVar, g0.NARROW);
                                                                    break;
                                                                }
                                                            } else {
                                                                uVar.i(pVar, g0.SHORT);
                                                                break;
                                                            }
                                                        case 'H':
                                                            break;
                                                        default:
                                                            switch (charAt) {
                                                                case 'K':
                                                                    break;
                                                                case 'L':
                                                                    break;
                                                                case 'M':
                                                                    break;
                                                                case 'N':
                                                                    break;
                                                                default:
                                                                    switch (charAt) {
                                                                        case 'c':
                                                                            if (i13 == 1) {
                                                                                int i14 = i13;
                                                                                uVar.j(new r(charAt, i14, i14, i14, 0));
                                                                                break;
                                                                            } else if (i13 == 2) {
                                                                                throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                            }
                                                                            break;
                                                                        case AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_LOWER_BOUND /* 100 */:
                                                                            break;
                                                                        case 'e':
                                                                            break;
                                                                        default:
                                                                            if (i13 != 1) {
                                                                                uVar.l(pVar, i13);
                                                                                break;
                                                                            } else {
                                                                                uVar.k(pVar);
                                                                                break;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z5 = true;
                                    if (i13 != 1 || i13 == 2) {
                                        if (charAt != 'e') {
                                            int i15 = i13;
                                            uVar.j(new r(charAt, i15, i15, i15, 0));
                                        } else if (charAt == 'E') {
                                            uVar.i(pVar, g0.SHORT);
                                        } else if (i13 == 1) {
                                            uVar.k(pVar);
                                        } else {
                                            uVar.l(pVar, 2);
                                        }
                                    } else if (i13 == 3) {
                                        uVar.i(pVar, z5 ? g0.SHORT_STANDALONE : g0.SHORT);
                                    } else if (i13 == 4) {
                                        uVar.i(pVar, z5 ? g0.FULL_STANDALONE : g0.FULL);
                                    } else {
                                        if (i13 != 5) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                        }
                                        uVar.i(pVar, z5 ? g0.NARROW_STANDALONE : g0.NARROW);
                                    }
                                }
                                if (i13 == 1) {
                                    uVar.k(pVar);
                                } else {
                                    if (i13 != 2) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                    }
                                    uVar.l(pVar, i13);
                                }
                            } else {
                                if (i13 != 1) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                                }
                                uVar.i(pVar, g0.SHORT);
                            }
                        }
                        z5 = false;
                        if (i13 != 1) {
                        }
                        if (charAt != 'e') {
                        }
                    }
                    uVar.m(pVar, i13, 19, f0.NOT_NEGATIVE);
                } else if (charAt == 'z') {
                    if (i13 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                    }
                    if (i13 == 4) {
                        uVar.c(new t(g0.FULL, false));
                    } else {
                        uVar.c(new t(g0.SHORT, false));
                    }
                } else if (charAt == 'V') {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + charAt);
                    }
                    uVar.c(new s(j$.time.temporal.q.f17530a, "ZoneId()"));
                } else if (charAt != 'v') {
                    String str2 = "+0000";
                    if (charAt == 'Z') {
                        if (i13 < 4) {
                            uVar.g("+HHMM", "+0000");
                        } else if (i13 == 4) {
                            uVar.f(g0.FULL);
                        } else {
                            if (i13 != 5) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            uVar.g("+HH:MM:ss", "Z");
                        }
                    } else if (charAt == 'O') {
                        if (i13 == 1) {
                            uVar.f(g0.SHORT);
                        } else {
                            if (i13 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + charAt);
                            }
                            uVar.f(g0.FULL);
                        }
                    } else if (charAt == 'X') {
                        if (i13 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        uVar.g(j.f17412d[i13 + (i13 == 1 ? 0 : 1)], "Z");
                    } else if (charAt == 'x') {
                        if (i13 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        if (i13 == 1) {
                            str2 = "+00";
                        } else if (i13 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        uVar.g(j.f17412d[i13 + (i13 == 1 ? 0 : 1)], str2);
                    } else if (charAt != 'W') {
                        int i16 = i13;
                        if (charAt == 'w') {
                            if (i16 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                            }
                            uVar.j(new r(charAt, i16, i16, 2, 0));
                        } else {
                            if (charAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + charAt);
                            }
                            if (i16 == 2) {
                                uVar.j(new r(charAt, i16, i16, 2, 0));
                            } else {
                                uVar.j(new r(charAt, i16, i16, 19, 0));
                            }
                        }
                    } else {
                        if (i13 > 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + charAt);
                        }
                        int i17 = i13;
                        uVar.j(new r(charAt, i17, i17, i17, 0));
                    }
                } else if (i13 == 1) {
                    uVar.c(new t(g0.SHORT, true));
                } else {
                    if (i13 != 4) {
                        throw new IllegalArgumentException("Wrong number of  pattern letters: " + charAt);
                    }
                    uVar.c(new t(g0.FULL, true));
                }
                i11 = i12 - 1;
            } else if (charAt == '\'') {
                int i18 = i11 + 1;
                int i19 = i18;
                while (i19 < str.length()) {
                    if (str.charAt(i19) == '\'') {
                        int i20 = i19 + 1;
                        if (i20 < str.length() && str.charAt(i20) == '\'') {
                            i19 = i20;
                        }
                        if (i19 < str.length()) {
                            throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                        }
                        String substring = str.substring(i18, i19);
                        if (substring.isEmpty()) {
                            uVar.d('\'');
                        } else {
                            uVar.e(substring.replace("''", "'"));
                        }
                        i11 = i19;
                    }
                    i19++;
                }
                if (i19 < str.length()) {
                }
            } else if (charAt == '[') {
                uVar.o();
            } else if (charAt == ']') {
                if (uVar.f17451a.f17452b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                uVar.n();
            } else {
                if (charAt == '{' || charAt == '}' || charAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + charAt + "'");
                }
                uVar.d(charAt);
            }
            i11++;
        }
        return uVar.q(Locale.getDefault(), e0.SMART, null);
    }

    static {
        u uVar = new u();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        f0 f0Var = f0.EXCEEDS_PAD;
        uVar.m(aVar, 4, 10, f0Var);
        uVar.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        uVar.l(aVar2, 2);
        uVar.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        uVar.l(aVar3, 2);
        e0 e0Var = e0.STRICT;
        j$.time.chrono.r rVar = j$.time.chrono.r.f17346c;
        DateTimeFormatter p10 = uVar.p(e0Var, rVar);
        ISO_LOCAL_DATE = p10;
        u uVar2 = new u();
        p pVar = p.INSENSITIVE;
        uVar2.c(pVar);
        uVar2.a(p10);
        j jVar = j.f17413e;
        uVar2.c(jVar);
        uVar2.p(e0Var, rVar);
        u uVar3 = new u();
        uVar3.c(pVar);
        uVar3.a(p10);
        uVar3.o();
        uVar3.c(jVar);
        uVar3.p(e0Var, rVar);
        u uVar4 = new u();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        uVar4.l(aVar4, 2);
        uVar4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar4.l(aVar5, 2);
        uVar4.o();
        uVar4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar4.l(aVar6, 2);
        uVar4.o();
        uVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter p11 = uVar4.p(e0Var, null);
        u uVar5 = new u();
        uVar5.c(pVar);
        uVar5.a(p11);
        uVar5.c(jVar);
        uVar5.p(e0Var, null);
        u uVar6 = new u();
        uVar6.c(pVar);
        uVar6.a(p11);
        uVar6.o();
        uVar6.c(jVar);
        uVar6.p(e0Var, null);
        u uVar7 = new u();
        uVar7.c(pVar);
        uVar7.a(p10);
        uVar7.d('T');
        uVar7.a(p11);
        DateTimeFormatter p12 = uVar7.p(e0Var, rVar);
        ISO_LOCAL_DATE_TIME = p12;
        u uVar8 = new u();
        uVar8.c(pVar);
        uVar8.a(p12);
        p pVar2 = p.LENIENT;
        uVar8.c(pVar2);
        uVar8.c(jVar);
        p pVar3 = p.STRICT;
        uVar8.c(pVar3);
        DateTimeFormatter p13 = uVar8.p(e0Var, rVar);
        u uVar9 = new u();
        uVar9.a(p13);
        uVar9.o();
        uVar9.d('[');
        p pVar4 = p.SENSITIVE;
        uVar9.c(pVar4);
        j$.time.x xVar = u.f17449h;
        uVar9.c(new s(xVar, "ZoneRegionId()"));
        uVar9.d(']');
        uVar9.p(e0Var, rVar);
        u uVar10 = new u();
        uVar10.a(p12);
        uVar10.o();
        uVar10.c(jVar);
        uVar10.o();
        uVar10.d('[');
        uVar10.c(pVar4);
        uVar10.c(new s(xVar, "ZoneRegionId()"));
        uVar10.d(']');
        ISO_DATE_TIME = uVar10.p(e0Var, rVar);
        u uVar11 = new u();
        uVar11.c(pVar);
        uVar11.m(aVar, 4, 10, f0Var);
        uVar11.d('-');
        uVar11.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        uVar11.o();
        uVar11.c(jVar);
        uVar11.p(e0Var, rVar);
        u uVar12 = new u();
        uVar12.c(pVar);
        uVar12.m(j$.time.temporal.i.f17521c, 4, 10, f0Var);
        uVar12.e("-W");
        uVar12.l(j$.time.temporal.i.f17520b, 2);
        uVar12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        uVar12.l(aVar7, 1);
        uVar12.o();
        uVar12.c(jVar);
        uVar12.p(e0Var, rVar);
        u uVar13 = new u();
        uVar13.c(pVar);
        uVar13.c(new g());
        ISO_INSTANT = uVar13.p(e0Var, null);
        u uVar14 = new u();
        uVar14.c(pVar);
        uVar14.l(aVar, 4);
        uVar14.l(aVar2, 2);
        uVar14.l(aVar3, 2);
        uVar14.o();
        uVar14.c(pVar2);
        uVar14.g("+HHMMss", "Z");
        uVar14.c(pVar3);
        uVar14.p(e0Var, rVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        u uVar15 = new u();
        uVar15.c(pVar);
        uVar15.c(pVar2);
        uVar15.o();
        uVar15.h(aVar7, hashMap);
        uVar15.e(", ");
        uVar15.n();
        uVar15.m(aVar3, 1, 2, f0.NOT_NEGATIVE);
        uVar15.d(' ');
        uVar15.h(aVar2, hashMap2);
        uVar15.d(' ');
        uVar15.l(aVar, 4);
        uVar15.d(' ');
        uVar15.l(aVar4, 2);
        uVar15.d(':');
        uVar15.l(aVar5, 2);
        uVar15.o();
        uVar15.d(':');
        uVar15.l(aVar6, 2);
        uVar15.n();
        uVar15.d(' ');
        uVar15.g("+HHMM", "GMT");
        uVar15.p(e0.SMART, rVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, e0 e0Var, j$.time.chrono.k kVar) {
        c0 c0Var = c0.f17381a;
        this.f17368a = (d) Objects.requireNonNull(dVar, "printerParser");
        this.f17369b = (Locale) Objects.requireNonNull(locale, CommonUrlParts.LOCALE);
        this.f17370c = (c0) Objects.requireNonNull(c0Var, "decimalStyle");
        this.f17371d = (e0) Objects.requireNonNull(e0Var, "resolverStyle");
        this.f17372e = kVar;
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb2 = new StringBuilder(32);
        d dVar = this.f17368a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb2, "appendable");
        try {
            dVar.i(new y(temporalAccessor, this), sb2);
            return sb2.toString();
        } catch (IOException e7) {
            throw new j$.time.b(e7.getMessage(), e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x032a, code lost:
    
        if (((java.util.HashMap) r9.f17384a).containsKey(j$.time.temporal.a.SECOND_OF_MINUTE) != false) goto L132;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d0 a(CharSequence charSequence) {
        String charSequence2;
        long j;
        j$.time.chrono.b bVar;
        j$.time.j jVar;
        Long l6;
        j$.time.q qVar;
        j$.time.q qVar2;
        int i5 = 0;
        ParsePosition parsePosition = new ParsePosition(0);
        Objects.requireNonNull(charSequence, NewsTable.TEXT_COLUMN);
        Objects.requireNonNull(parsePosition, "position");
        v vVar = new v(this);
        int j6 = this.f17368a.j(vVar, charSequence, parsePosition.getIndex());
        ZoneId zoneId = null;
        if (j6 < 0) {
            parsePosition.setErrorIndex(~j6);
            vVar = null;
        } else {
            parsePosition.setIndex(j6);
        }
        if (vVar != null) {
            DateTimeFormatter dateTimeFormatter = vVar.f17458a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                d0 c2 = vVar.c();
                j$.time.chrono.k kVar = vVar.c().f17386c;
                if (kVar == null && (kVar = dateTimeFormatter.f17372e) == null) {
                    kVar = j$.time.chrono.r.f17346c;
                }
                c2.f17386c = kVar;
                ZoneId zoneId2 = c2.f17385b;
                if (zoneId2 != null) {
                    zoneId = zoneId2;
                } else {
                    dateTimeFormatter.getClass();
                }
                c2.f17385b = zoneId;
                c2.f17388e = this.f17371d;
                c2.l();
                c2.t(c2.f17386c.K(c2.f17384a, c2.f17388e));
                c2.q();
                if (((HashMap) c2.f17384a).size() > 0) {
                    loop0: while (i5 < 50) {
                        Iterator it = ((HashMap) c2.f17384a).entrySet().iterator();
                        while (it.hasNext()) {
                            j$.time.temporal.p pVar = (j$.time.temporal.p) ((Map.Entry) it.next()).getKey();
                            TemporalAccessor k6 = pVar.k(c2.f17384a, c2, c2.f17388e);
                            if (k6 != null) {
                                if (k6 instanceof ChronoZonedDateTime) {
                                    ChronoZonedDateTime chronoZonedDateTime = (ChronoZonedDateTime) k6;
                                    ZoneId zoneId3 = c2.f17385b;
                                    if (zoneId3 == null) {
                                        c2.f17385b = chronoZonedDateTime.B();
                                    } else if (!zoneId3.equals(chronoZonedDateTime.B())) {
                                        throw new j$.time.b("ChronoZonedDateTime must use the effective parsed zone: " + c2.f17385b);
                                    }
                                    k6 = chronoZonedDateTime.o();
                                }
                                if (k6 instanceof ChronoLocalDateTime) {
                                    ChronoLocalDateTime chronoLocalDateTime = (ChronoLocalDateTime) k6;
                                    c2.s(chronoLocalDateTime.b(), j$.time.q.f17497d);
                                    c2.t(chronoLocalDateTime.f());
                                } else if (k6 instanceof j$.time.chrono.b) {
                                    c2.t((j$.time.chrono.b) k6);
                                } else if (k6 instanceof j$.time.j) {
                                    c2.s((j$.time.j) k6, j$.time.q.f17497d);
                                } else {
                                    throw new j$.time.b("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                }
                            } else if (!((HashMap) c2.f17384a).containsKey(pVar)) {
                                break;
                            }
                            i5++;
                        }
                    }
                    if (i5 == 50) {
                        throw new j$.time.b("One of the parsed fields has an incorrectly implemented resolve method");
                    }
                    if (i5 > 0) {
                        c2.l();
                        c2.t(c2.f17386c.K(c2.f17384a, c2.f17388e));
                        c2.q();
                    }
                }
                if (c2.f17390g == null) {
                    Map map = c2.f17384a;
                    j$.time.temporal.a aVar = j$.time.temporal.a.MILLI_OF_SECOND;
                    if (((HashMap) map).containsKey(aVar)) {
                        long longValue = ((Long) ((HashMap) c2.f17384a).remove(aVar)).longValue();
                        Map map2 = c2.f17384a;
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map2).containsKey(aVar2)) {
                            long longValue2 = (((Long) ((HashMap) c2.f17384a).get(aVar2)).longValue() % 1000) + (longValue * 1000);
                            c2.u(aVar, aVar2, Long.valueOf(longValue2));
                            ((HashMap) c2.f17384a).remove(aVar2);
                            ((HashMap) c2.f17384a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue2 * 1000));
                        } else {
                            ((HashMap) c2.f17384a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(longValue * 1000000));
                        }
                    } else {
                        Map map3 = c2.f17384a;
                        j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (((HashMap) map3).containsKey(aVar3)) {
                            ((HashMap) c2.f17384a).put(j$.time.temporal.a.NANO_OF_SECOND, Long.valueOf(((Long) ((HashMap) c2.f17384a).remove(aVar3)).longValue() * 1000));
                        }
                    }
                    Map map4 = c2.f17384a;
                    j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
                    Long l10 = (Long) ((HashMap) map4).get(aVar4);
                    if (l10 != null) {
                        Map map5 = c2.f17384a;
                        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
                        Long l11 = (Long) ((HashMap) map5).get(aVar5);
                        Map map6 = c2.f17384a;
                        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
                        Long l12 = (Long) ((HashMap) map6).get(aVar6);
                        Map map7 = c2.f17384a;
                        j$.time.temporal.a aVar7 = j$.time.temporal.a.NANO_OF_SECOND;
                        Long l13 = (Long) ((HashMap) map7).get(aVar7);
                        if ((l11 != null || (l12 == null && l13 == null)) && (l11 == null || l12 != null || l13 == null)) {
                            long longValue3 = l11 != null ? l11.longValue() : 0L;
                            long longValue4 = l12 != null ? l12.longValue() : 0L;
                            long longValue5 = l13 != null ? l13.longValue() : 0L;
                            long j10 = longValue4;
                            j = 1000000;
                            c2.n(l10.longValue(), longValue3, j10, longValue5);
                            ((HashMap) c2.f17384a).remove(aVar4);
                            ((HashMap) c2.f17384a).remove(aVar5);
                            ((HashMap) c2.f17384a).remove(aVar6);
                            ((HashMap) c2.f17384a).remove(aVar7);
                            if (c2.f17388e != e0.LENIENT && ((HashMap) c2.f17384a).size() > 0) {
                                for (Map.Entry entry : ((HashMap) c2.f17384a).entrySet()) {
                                    j$.time.temporal.p pVar2 = (j$.time.temporal.p) entry.getKey();
                                    if (pVar2 instanceof j$.time.temporal.a) {
                                        j$.time.temporal.a aVar8 = (j$.time.temporal.a) pVar2;
                                        if (aVar8.P()) {
                                            aVar8.C(((Long) entry.getValue()).longValue());
                                        }
                                    }
                                }
                            }
                            bVar = c2.f17389f;
                            if (bVar != null) {
                                c2.h(bVar);
                            }
                            jVar = c2.f17390g;
                            if (jVar != null) {
                                c2.h(jVar);
                                if (c2.f17389f != null && ((HashMap) c2.f17384a).size() > 0) {
                                    c2.h(c2.f17389f.E(c2.f17390g));
                                }
                            }
                            if (c2.f17389f != null && c2.f17390g != null) {
                                qVar = c2.f17391h;
                                qVar.getClass();
                                qVar2 = j$.time.q.f17497d;
                                if (qVar != qVar2) {
                                    c2.f17389f = c2.f17389f.J(c2.f17391h);
                                    c2.f17391h = qVar2;
                                }
                            }
                            if (c2.f17390g == null) {
                                if (!((HashMap) c2.f17384a).containsKey(j$.time.temporal.a.INSTANT_SECONDS)) {
                                    if (!((HashMap) c2.f17384a).containsKey(j$.time.temporal.a.SECOND_OF_DAY)) {
                                    }
                                }
                                Map map8 = c2.f17384a;
                                j$.time.temporal.a aVar9 = j$.time.temporal.a.NANO_OF_SECOND;
                                if (((HashMap) map8).containsKey(aVar9)) {
                                    long longValue6 = ((Long) ((HashMap) c2.f17384a).get(aVar9)).longValue();
                                    ((HashMap) c2.f17384a).put(j$.time.temporal.a.MICRO_OF_SECOND, Long.valueOf(longValue6 / 1000));
                                    ((HashMap) c2.f17384a).put(j$.time.temporal.a.MILLI_OF_SECOND, Long.valueOf(longValue6 / j));
                                } else {
                                    ((HashMap) c2.f17384a).put(aVar9, 0L);
                                    ((HashMap) c2.f17384a).put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                                    ((HashMap) c2.f17384a).put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                                }
                            }
                            if (c2.f17389f != null && c2.f17390g != null) {
                                l6 = (Long) ((HashMap) c2.f17384a).get(j$.time.temporal.a.OFFSET_SECONDS);
                                if (l6 == null) {
                                    ((HashMap) c2.f17384a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c2.f17389f.E(c2.f17390g).y(ZoneOffset.X(l6.intValue())).toEpochSecond()));
                                    return c2;
                                }
                                if (c2.f17385b != null) {
                                    ((HashMap) c2.f17384a).put(j$.time.temporal.a.INSTANT_SECONDS, Long.valueOf(c2.f17389f.E(c2.f17390g).y(c2.f17385b).toEpochSecond()));
                                }
                            }
                            return c2;
                        }
                        j = 1000000;
                        bVar = c2.f17389f;
                        if (bVar != null) {
                        }
                        jVar = c2.f17390g;
                        if (jVar != null) {
                        }
                        if (c2.f17389f != null) {
                            qVar = c2.f17391h;
                            qVar.getClass();
                            qVar2 = j$.time.q.f17497d;
                            if (qVar != qVar2) {
                            }
                        }
                        if (c2.f17390g == null) {
                        }
                        if (c2.f17389f != null) {
                            l6 = (Long) ((HashMap) c2.f17384a).get(j$.time.temporal.a.OFFSET_SECONDS);
                            if (l6 == null) {
                            }
                        }
                        return c2;
                    }
                }
                j = 1000000;
                if (c2.f17388e != e0.LENIENT) {
                    while (r1.hasNext()) {
                    }
                }
                bVar = c2.f17389f;
                if (bVar != null) {
                }
                jVar = c2.f17390g;
                if (jVar != null) {
                }
                if (c2.f17389f != null) {
                }
                if (c2.f17390g == null) {
                }
                if (c2.f17389f != null) {
                }
                return c2;
            }
        }
        if (charSequence.length() > 64) {
            charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            charSequence2 = charSequence.toString();
        }
        if (parsePosition.getErrorIndex() >= 0) {
            String str = "Text '" + charSequence2 + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new w(str, charSequence);
        }
        String str2 = "Text '" + charSequence2 + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new w(str2, charSequence);
    }

    public final String toString() {
        String dVar = this.f17368a.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
