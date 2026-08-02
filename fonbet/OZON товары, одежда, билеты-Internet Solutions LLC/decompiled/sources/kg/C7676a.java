package kg;

import ig.C7073b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import jg.l;
import kg.b;
import mg.EnumC8145a;

/* renamed from: kg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7676a {

    /* renamed from: f, reason: collision with root package name */
    public static final C7676a f71524f;

    /* renamed from: a, reason: collision with root package name */
    private final b.d f71525a;

    /* renamed from: b, reason: collision with root package name */
    private final Locale f71526b;

    /* renamed from: c, reason: collision with root package name */
    private final g f71527c;

    /* renamed from: d, reason: collision with root package name */
    private final h f71528d;

    /* renamed from: e, reason: collision with root package name */
    private final l f71529e;

    static {
        b bVar = new b();
        EnumC8145a enumC8145a = EnumC8145a.YEAR;
        i iVar = i.EXCEEDS_PAD;
        bVar.p(enumC8145a, 4, 10, iVar);
        bVar.e('-');
        EnumC8145a enumC8145a2 = EnumC8145a.MONTH_OF_YEAR;
        bVar.o(enumC8145a2, 2);
        bVar.e('-');
        EnumC8145a enumC8145a3 = EnumC8145a.DAY_OF_MONTH;
        bVar.o(enumC8145a3, 2);
        h hVar = h.STRICT;
        C7676a x11 = bVar.x(hVar);
        l lVar = l.f70047c;
        C7676a g10 = x11.g(lVar);
        b bVar2 = new b();
        bVar2.t();
        bVar2.a(g10);
        bVar2.i();
        bVar2.x(hVar).g(lVar);
        b bVar3 = new b();
        bVar3.t();
        bVar3.a(g10);
        bVar3.s();
        bVar3.i();
        bVar3.x(hVar).g(lVar);
        b bVar4 = new b();
        EnumC8145a enumC8145a4 = EnumC8145a.HOUR_OF_DAY;
        bVar4.o(enumC8145a4, 2);
        bVar4.e(':');
        EnumC8145a enumC8145a5 = EnumC8145a.MINUTE_OF_HOUR;
        bVar4.o(enumC8145a5, 2);
        bVar4.s();
        bVar4.e(':');
        EnumC8145a enumC8145a6 = EnumC8145a.SECOND_OF_MINUTE;
        bVar4.o(enumC8145a6, 2);
        bVar4.s();
        bVar4.b(EnumC8145a.NANO_OF_SECOND, 0, 9, true);
        C7676a x12 = bVar4.x(hVar);
        b bVar5 = new b();
        bVar5.t();
        bVar5.a(x12);
        bVar5.i();
        bVar5.x(hVar);
        b bVar6 = new b();
        bVar6.t();
        bVar6.a(x12);
        bVar6.s();
        bVar6.i();
        bVar6.x(hVar);
        b bVar7 = new b();
        bVar7.t();
        bVar7.a(g10);
        bVar7.e('T');
        bVar7.a(x12);
        C7676a g11 = bVar7.x(hVar).g(lVar);
        b bVar8 = new b();
        bVar8.t();
        bVar8.a(g11);
        bVar8.i();
        C7676a g12 = bVar8.x(hVar).g(lVar);
        b bVar9 = new b();
        bVar9.a(g12);
        bVar9.s();
        bVar9.e('[');
        bVar9.u();
        bVar9.q();
        bVar9.e(']');
        bVar9.x(hVar).g(lVar);
        b bVar10 = new b();
        bVar10.a(g11);
        bVar10.s();
        bVar10.i();
        bVar10.s();
        bVar10.e('[');
        bVar10.u();
        bVar10.q();
        bVar10.e(']');
        bVar10.x(hVar).g(lVar);
        b bVar11 = new b();
        bVar11.t();
        bVar11.p(enumC8145a, 4, 10, iVar);
        bVar11.e('-');
        bVar11.o(EnumC8145a.DAY_OF_YEAR, 3);
        bVar11.s();
        bVar11.i();
        bVar11.x(hVar).g(lVar);
        b bVar12 = new b();
        bVar12.t();
        bVar12.p(mg.c.f74847c, 4, 10, iVar);
        bVar12.f("-W");
        bVar12.o(mg.c.f74846b, 2);
        bVar12.e('-');
        EnumC8145a enumC8145a7 = EnumC8145a.DAY_OF_WEEK;
        bVar12.o(enumC8145a7, 1);
        bVar12.s();
        bVar12.i();
        bVar12.x(hVar).g(lVar);
        b bVar13 = new b();
        bVar13.t();
        bVar13.c();
        f71524f = bVar13.x(hVar);
        b bVar14 = new b();
        bVar14.t();
        bVar14.o(enumC8145a, 4);
        bVar14.o(enumC8145a2, 2);
        bVar14.o(enumC8145a3, 2);
        bVar14.s();
        bVar14.h("+HHMMss", "Z");
        bVar14.x(hVar).g(lVar);
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
        b bVar15 = new b();
        bVar15.t();
        bVar15.v();
        bVar15.s();
        bVar15.k(enumC8145a7, hashMap);
        bVar15.f(", ");
        bVar15.r();
        bVar15.p(enumC8145a3, 1, 2, i.NOT_NEGATIVE);
        bVar15.e(' ');
        bVar15.k(enumC8145a2, hashMap2);
        bVar15.e(' ');
        bVar15.o(enumC8145a, 4);
        bVar15.e(' ');
        bVar15.o(enumC8145a4, 2);
        bVar15.e(':');
        bVar15.o(enumC8145a5, 2);
        bVar15.s();
        bVar15.e(':');
        bVar15.o(enumC8145a6, 2);
        bVar15.r();
        bVar15.e(' ');
        bVar15.h("+HHMM", "GMT");
        bVar15.x(h.SMART).g(lVar);
    }

    C7676a(b.d dVar, Locale locale, g gVar, h hVar, l lVar) {
        lg.c.e(dVar, "printerParser");
        this.f71525a = dVar;
        lg.c.e(locale, "locale");
        this.f71526b = locale;
        lg.c.e(gVar, "decimalStyle");
        this.f71527c = gVar;
        lg.c.e(hVar, "resolverStyle");
        this.f71528d = hVar;
        this.f71529e = lVar;
    }

    public static C7676a e(String str) {
        b bVar = new b();
        bVar.j(str);
        return bVar.w();
    }

    public final String a(Lf.a aVar) {
        StringBuilder sb2 = new StringBuilder(32);
        try {
            this.f71525a.a(new e(aVar, this), sb2);
            return sb2.toString();
        } catch (IOException e11) {
            throw new C7073b(e11.getMessage(), e11);
        }
    }

    public final jg.g b() {
        return this.f71529e;
    }

    public final g c() {
        return this.f71527c;
    }

    public final Locale d() {
        return this.f71526b;
    }

    final b.d f() {
        return this.f71525a.b();
    }

    public final C7676a g(l lVar) {
        l lVar2 = this.f71529e;
        boolean z11 = false;
        if (lVar2 == null) {
            if (lVar == null) {
                z11 = true;
            }
        } else if (lVar != null) {
            z11 = lVar2.equals(lVar);
        }
        if (z11) {
            return this;
        }
        return new C7676a(this.f71525a, this.f71526b, this.f71527c, this.f71528d, lVar);
    }

    public final C7676a h(h hVar) {
        lg.c.e(hVar, "resolverStyle");
        h hVar2 = this.f71528d;
        if (hVar2 == null ? false : hVar2.equals(hVar)) {
            return this;
        }
        return new C7676a(this.f71525a, this.f71526b, this.f71527c, hVar, this.f71529e);
    }

    public final String toString() {
        String dVar = this.f71525a.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
