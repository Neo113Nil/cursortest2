package j$.time.format;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: h, reason: collision with root package name */
    public static final j$.time.x f17449h = new j$.time.x(1);

    /* renamed from: i, reason: collision with root package name */
    public static final Map f17450i;

    /* renamed from: a, reason: collision with root package name */
    public u f17451a;

    /* renamed from: b, reason: collision with root package name */
    public final u f17452b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17453c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17454d;

    /* renamed from: e, reason: collision with root package name */
    public int f17455e;

    /* renamed from: f, reason: collision with root package name */
    public char f17456f;

    /* renamed from: g, reason: collision with root package name */
    public int f17457g;

    static {
        HashMap hashMap = new HashMap();
        f17450i = hashMap;
        hashMap.put('G', j$.time.temporal.a.ERA);
        hashMap.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        hashMap.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.f17519a;
        hashMap.put('Q', gVar);
        hashMap.put('q', gVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        hashMap.put('M', aVar);
        hashMap.put('L', aVar);
        hashMap.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        hashMap.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        hashMap.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        hashMap.put('E', aVar2);
        hashMap.put('c', aVar2);
        hashMap.put('e', aVar2);
        hashMap.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        hashMap.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        hashMap.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        hashMap.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        hashMap.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        hashMap.put('S', aVar3);
        hashMap.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        hashMap.put('n', aVar3);
        hashMap.put('N', j$.time.temporal.a.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.f17527a);
    }

    public u() {
        this.f17451a = this;
        this.f17453c = new ArrayList();
        this.f17457g = -1;
        this.f17452b = null;
        this.f17454d = false;
    }

    public u(u uVar) {
        this.f17451a = this;
        this.f17453c = new ArrayList();
        this.f17457g = -1;
        this.f17452b = uVar;
        this.f17454d = true;
    }

    public final void k(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        j(new i(pVar, 1, 19, f0.NORMAL));
    }

    public final void l(j$.time.temporal.p pVar, int i5) {
        Objects.requireNonNull(pVar, "field");
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i5);
        }
        j(new i(pVar, i5, i5, f0.NOT_NEGATIVE));
    }

    public final void m(j$.time.temporal.p pVar, int i5, int i10, f0 f0Var) {
        if (i5 == i10 && f0Var == f0.NOT_NEGATIVE) {
            l(pVar, i10);
            return;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(f0Var, "signStyle");
        if (i5 < 1 || i5 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i5);
        }
        if (i10 < 1 || i10 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i10);
        }
        if (i10 < i5) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i10 + " < " + i5);
        }
        j(new i(pVar, i5, i10, f0Var));
    }

    public final void j(i iVar) {
        i d10;
        u uVar = this.f17451a;
        int i5 = uVar.f17457g;
        if (i5 < 0) {
            uVar.f17457g = c(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) uVar.f17453c).get(i5);
        int i10 = iVar.f17408b;
        int i11 = iVar.f17409c;
        if (i10 == i11 && iVar.f17410d == f0.NOT_NEGATIVE) {
            d10 = iVar2.e(i11);
            c(iVar.d());
            this.f17451a.f17457g = i5;
        } else {
            d10 = iVar2.d();
            this.f17451a.f17457g = c(iVar);
        }
        ((ArrayList) this.f17451a.f17453c).set(i5, d10);
    }

    public final void b(j$.time.temporal.a aVar, int i5, int i10, boolean z5) {
        if (i5 == i10 && !z5) {
            j(new f(aVar, i5, i10, z5));
        } else {
            c(new f(aVar, i5, i10, z5));
        }
    }

    public final void i(j$.time.temporal.p pVar, g0 g0Var) {
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(g0Var, "textStyle");
        c(new q(pVar, g0Var, b0.f17379c));
    }

    public final void h(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        g0 g0Var = g0.FULL;
        c(new q(aVar, g0Var, new a(new a0(Collections.singletonMap(g0Var, linkedHashMap)))));
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    public final void f(g0 g0Var) {
        Objects.requireNonNull(g0Var, "style");
        if (g0Var != g0.FULL && g0Var != g0.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(0, g0Var));
    }

    public final void d(char c2) {
        c(new c(c2));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(1, str));
        }
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.f17368a;
        if (dVar.f17383b) {
            dVar = new d(dVar.f17382a, false);
        }
        c(dVar);
    }

    public final void o() {
        u uVar = this.f17451a;
        uVar.f17457g = -1;
        this.f17451a = new u(uVar);
    }

    public final void n() {
        u uVar = this.f17451a;
        if (uVar.f17452b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) uVar.f17453c).size() > 0) {
            u uVar2 = this.f17451a;
            d dVar = new d(uVar2.f17453c, uVar2.f17454d);
            this.f17451a = this.f17451a.f17452b;
            c(dVar);
            return;
        }
        this.f17451a = this.f17451a.f17452b;
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        u uVar = this.f17451a;
        int i5 = uVar.f17455e;
        if (i5 > 0) {
            if (eVar != null) {
                eVar = new k(eVar, i5, uVar.f17456f);
            }
            uVar.f17455e = 0;
            uVar.f17456f = (char) 0;
        }
        ((ArrayList) uVar.f17453c).add(eVar);
        this.f17451a.f17457g = -1;
        return ((ArrayList) r5.f17453c).size() - 1;
    }

    public final DateTimeFormatter p(e0 e0Var, j$.time.chrono.k kVar) {
        return q(Locale.getDefault(), e0Var, kVar);
    }

    public final DateTimeFormatter q(Locale locale, e0 e0Var, j$.time.chrono.k kVar) {
        Objects.requireNonNull(locale, CommonUrlParts.LOCALE);
        while (this.f17451a.f17452b != null) {
            n();
        }
        d dVar = new d(this.f17453c, false);
        c0 c0Var = c0.f17381a;
        return new DateTimeFormatter(dVar, locale, e0Var, kVar);
    }
}
