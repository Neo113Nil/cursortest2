package net.time4j.tz;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.time.DurationKt;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;

/* loaded from: classes5.dex */
public final class h extends l {
    private static final long serialVersionUID = -8432968264242113551L;

    /* renamed from: id, reason: collision with root package name */
    private final k f58340id;
    private final boolean strict;
    private final TimeZone tz;

    /* renamed from: v, reason: collision with root package name */
    public final transient p f58341v;

    public h() {
        this.f58340id = null;
        this.tz = null;
        this.strict = false;
        this.f58341v = null;
    }

    public static TimeZone R(String str) {
        if (str.equals("Z")) {
            return TimeZone.getTimeZone("GMT+00:00");
        }
        if (str.startsWith("UTC")) {
            return TimeZone.getTimeZone("GMT" + str.substring(3));
        }
        if (!str.startsWith("UT")) {
            return TimeZone.getTimeZone(str);
        }
        return TimeZone.getTimeZone("GMT" + str.substring(2));
    }

    public static p S(int i10) {
        return p.p(AbstractC5469c.a(i10, 1000));
    }

    private Object readResolve() {
        k kVar = this.f58340id;
        return kVar == null ? new h() : new h(kVar, this.tz, this.strict);
    }

    @Override // net.time4j.tz.l
    public p A(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        int i10;
        int i11;
        int i12;
        p pVar = this.f58341v;
        if (pVar != null) {
            return pVar;
        }
        int n10 = interfaceC5467a.n();
        int o10 = interfaceC5467a.o();
        int p10 = interfaceC5467a.p();
        if (interfaceC5473g.q() == 24) {
            long k10 = AbstractC5468b.k(AbstractC5469c.f(AbstractC5468b.j(interfaceC5467a), 1L));
            int h10 = AbstractC5468b.h(k10);
            int g10 = AbstractC5468b.g(k10);
            i10 = AbstractC5468b.f(k10);
            o10 = g10;
            n10 = h10;
        } else {
            i10 = p10;
        }
        if (n10 > 0) {
            i12 = n10;
            i11 = 1;
        } else {
            i11 = 0;
            i12 = 1 - n10;
        }
        int c10 = AbstractC5468b.c(n10, o10, i10) + 1;
        return S((this.f58340id == null ? TimeZone.getDefault() : this.tz).getOffset(i11, i12, o10 - 1, i10, c10 == 8 ? 1 : c10, interfaceC5473g.q() != 24 ? (((interfaceC5473g.q() * 3600) + (interfaceC5473g.l() * 60) + interfaceC5473g.i()) * 1000) + (interfaceC5473g.a() / DurationKt.NANOS_IN_MILLIS) : 0));
    }

    @Override // net.time4j.tz.l
    public p B(InterfaceC5472f interfaceC5472f) {
        TimeZone timeZone;
        if (this.f58340id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            p pVar = this.f58341v;
            if (pVar != null) {
                return pVar;
            }
            timeZone = this.tz;
        }
        return S(timeZone.getOffset(interfaceC5472f.k() * 1000));
    }

    @Override // net.time4j.tz.l
    public o E() {
        return this.strict ? l.f58349e : l.f58348d;
    }

    @Override // net.time4j.tz.l
    public boolean I(InterfaceC5472f interfaceC5472f) {
        if (this.f58341v != null) {
            return false;
        }
        return (this.f58340id == null ? TimeZone.getDefault() : this.tz).inDaylightTime(new Date(interfaceC5472f.k() * 1000));
    }

    @Override // net.time4j.tz.l
    public boolean J() {
        return this.f58341v != null;
    }

    @Override // net.time4j.tz.l
    public boolean K(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g) {
        if (this.f58341v != null) {
            return false;
        }
        int n10 = interfaceC5467a.n();
        int o10 = interfaceC5467a.o();
        int p10 = interfaceC5467a.p();
        int q10 = interfaceC5473g.q();
        int l10 = interfaceC5473g.l();
        int i10 = interfaceC5473g.i();
        int a10 = interfaceC5473g.a() / DurationKt.NANOS_IN_MILLIS;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.f58340id == null ? TimeZone.getDefault() : this.tz);
        gregorianCalendar.set(14, a10);
        gregorianCalendar.set(n10, o10 - 1, p10, q10, l10, i10);
        return (gregorianCalendar.get(1) == n10 && gregorianCalendar.get(2) + 1 == o10 && gregorianCalendar.get(5) == p10 && gregorianCalendar.get(11) == q10 && gregorianCalendar.get(12) == l10 && gregorianCalendar.get(13) == i10 && gregorianCalendar.get(14) == a10) ? false : true;
    }

    @Override // net.time4j.tz.l
    public l Q(o oVar) {
        if (this.f58340id == null || E() == oVar) {
            return this;
        }
        if (oVar == l.f58348d) {
            return new h(this.f58340id, this.tz, false);
        }
        if (oVar == l.f58349e) {
            return new h(this.f58340id, this.tz, true);
        }
        throw new UnsupportedOperationException(oVar.toString());
    }

    public boolean T() {
        return (this.f58340id == null ? TimeZone.getDefault() : this.tz).getID().equals("GMT");
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f58340id == null) {
                return hVar.f58340id == null;
            }
            if (this.tz.equals(hVar.tz) && this.strict == hVar.strict) {
                p pVar = this.f58341v;
                return pVar == null ? hVar.f58341v == null : pVar.equals(hVar.f58341v);
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f58340id == null) {
            return 0;
        }
        return this.tz.hashCode();
    }

    public String toString() {
        TimeZone timeZone = this.f58340id == null ? TimeZone.getDefault() : this.tz;
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append('[');
        sb2.append(h.class.getName());
        sb2.append(':');
        sb2.append(timeZone);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.tz.l
    public String w(d dVar, Locale locale) {
        return (this.f58340id == null ? TimeZone.getDefault() : this.tz).getDisplayName(dVar.b(), !dVar.a() ? 1 : 0, locale);
    }

    @Override // net.time4j.tz.l
    public m y() {
        p pVar = this.f58341v;
        if (pVar == null) {
            return null;
        }
        return pVar.k();
    }

    @Override // net.time4j.tz.l
    public k z() {
        k kVar = this.f58340id;
        return kVar == null ? new e(TimeZone.getDefault().getID()) : kVar;
    }

    public h(k kVar) {
        this(kVar, TimeZone.getDefault(), false);
    }

    public h(k kVar, String str) {
        this(kVar, R(str), false);
    }

    public h(k kVar, TimeZone timeZone, boolean z10) {
        this.f58340id = kVar;
        TimeZone timeZone2 = (TimeZone) timeZone.clone();
        this.tz = timeZone2;
        this.strict = z10;
        if (timeZone2.useDaylightTime()) {
            this.f58341v = null;
            return;
        }
        String id2 = timeZone2.getID();
        if (!id2.startsWith("GMT") && !id2.startsWith("Etc/") && !id2.equals("Greenwich") && !id2.equals("UCT") && !id2.equals("UTC") && !id2.equals("Universal") && !id2.equals("Zulu")) {
            this.f58341v = null;
        } else {
            this.f58341v = S(timeZone2.getOffset(System.currentTimeMillis()));
        }
    }
}
