package net.time4j.format.expert;

import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.InterfaceC5472f;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class n implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final net.time4j.tz.p f58009i = net.time4j.tz.p.p(64800);

    /* renamed from: j, reason: collision with root package name */
    public static final ConcurrentMap f58010j = new ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public static final ConcurrentMap f58011k = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f58012a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58014c;

    /* renamed from: d, reason: collision with root package name */
    public final Locale f58015d;

    /* renamed from: e, reason: collision with root package name */
    public final String f58016e;

    /* renamed from: f, reason: collision with root package name */
    public final String f58017f;

    /* renamed from: g, reason: collision with root package name */
    public final char f58018g;

    /* renamed from: h, reason: collision with root package name */
    public final net.time4j.format.g f58019h;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f58020a;

        /* renamed from: b, reason: collision with root package name */
        public final String f58021b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58022c;

        /* renamed from: d, reason: collision with root package name */
        public final int f58023d;

        public a(String str, String str2, int i10, int i11) {
            this.f58020a = str;
            this.f58021b = str2;
            this.f58022c = i10;
            this.f58023d = i11;
        }
    }

    public n(boolean z10) {
        this(z10, true, false, Locale.ROOT, "+", "-", '0', net.time4j.format.g.SMART);
    }

    private static boolean g(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    public static String h(Locale locale) {
        ConcurrentMap concurrentMap = f58010j;
        String str = (String) concurrentMap.get(locale);
        if (str == null) {
            str = net.time4j.tz.p.f58410k.m(locale);
            String str2 = (String) concurrentMap.putIfAbsent(locale, str);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    public static net.time4j.tz.p i(oi.o oVar, InterfaceC5908d interfaceC5908d) {
        InterfaceC5907c interfaceC5907c = net.time4j.format.a.f57805d;
        if (interfaceC5908d.c(interfaceC5907c)) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) interfaceC5908d.a(interfaceC5907c);
            if (kVar instanceof net.time4j.tz.p) {
                return (net.time4j.tz.p) kVar;
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + oVar);
    }

    public static a j(Locale locale) {
        a aVar = (a) f58011k.get(locale);
        if (aVar != null) {
            return aVar;
        }
        String m10 = f58009i.m(locale);
        int length = m10.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (m10.charAt(i10) == 177) {
                int indexOf = m10.indexOf("hh", i10) + 2;
                int indexOf2 = m10.indexOf("mm", indexOf);
                a aVar2 = new a(m10, m10.substring(indexOf, indexOf2), i10, indexOf2 + 2);
                a aVar3 = (a) f58011k.putIfAbsent(locale, aVar2);
                return aVar3 != null ? aVar3 : aVar2;
            }
        }
        return aVar;
    }

    public static int k(CharSequence charSequence, int i10, char c10) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < 2) {
            int i13 = i10 + i11;
            if (i13 >= charSequence.length()) {
                return i11 == 0 ? NotificationManagerCompat.IMPORTANCE_UNSPECIFIED : ~i12;
            }
            int charAt = charSequence.charAt(i13) - c10;
            if (charAt < 0 || charAt > 9) {
                return i11 == 0 ? NotificationManagerCompat.IMPORTANCE_UNSPECIFIED : ~i12;
            }
            i12 = (i12 * 10) + charAt;
            i11++;
        }
        return i12;
    }

    public static int l(CharSequence charSequence, int i10, char c10) {
        int charAt;
        int i11 = 0;
        for (int i12 = 0; i12 < 2; i12++) {
            int i13 = i10 + i12;
            if (i13 >= charSequence.length() || (charAt = charSequence.charAt(i13) - c10) < 0 || charAt > 9) {
                return NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
            }
            i11 = (i11 * 10) + charAt;
        }
        return i11;
    }

    public static int m(CharSequence charSequence, int i10, int i11, Locale locale, boolean z10) {
        String[] strArr = {"GMT", h(locale), "UTC", "UT"};
        for (int i12 = 0; i12 < 4; i12++) {
            String str = strArr[i12];
            int length = str.length();
            if (i10 - i11 >= length) {
                String charSequence2 = charSequence.subSequence(i11, i11 + length).toString();
                if ((z10 && charSequence2.equalsIgnoreCase(str)) || (!z10 && charSequence2.equals(str))) {
                    return length;
                }
            }
        }
        return 0;
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        net.time4j.tz.p B10;
        int i10;
        net.time4j.tz.p pVar;
        int length;
        int length2 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        net.time4j.tz.k r10 = oVar.d() ? oVar.r() : null;
        if (r10 == null) {
            B10 = i(oVar, interfaceC5908d);
        } else if (r10 instanceof net.time4j.tz.p) {
            B10 = (net.time4j.tz.p) r10;
        } else {
            if (!(oVar instanceof InterfaceC5472f)) {
                throw new IllegalArgumentException("Cannot extract timezone offset from: " + oVar);
            }
            B10 = net.time4j.tz.l.N(r10).B((InterfaceC5472f) oVar);
        }
        Locale locale = z10 ? this.f58015d : (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
        char c10 = '0';
        char charValue = z10 ? this.f58018g : ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, '0')).charValue();
        String str = z10 ? this.f58016e : (String) interfaceC5908d.b(C5708b.f57891g, "+");
        String str2 = z10 ? this.f58017f : (String) interfaceC5908d.b(C5708b.f57892h, "-");
        boolean booleanValue = z10 ? this.f58014c : ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57815n, Boolean.FALSE)).booleanValue();
        int j10 = B10.j();
        int i11 = B10.i();
        if (!booleanValue && j10 == 0 && i11 == 0) {
            String h10 = h(locale);
            appendable.append(h10);
            i10 = h10.length();
        } else {
            a j11 = j(locale);
            int length3 = j11.f58020a.length();
            int i12 = 0;
            int i13 = 0;
            while (i13 < length3) {
                char c11 = c10;
                char charAt = j11.f58020a.charAt(i13);
                if (j11.f58022c > i13 || j11.f58023d <= i13) {
                    pVar = B10;
                    if (!booleanValue) {
                        appendable.append(charAt);
                        i12++;
                    }
                } else {
                    if (B10.l() == net.time4j.tz.f.BEHIND_UTC) {
                        appendable.append(str2);
                        length = str2.length();
                    } else {
                        appendable.append(str);
                        length = str.length();
                    }
                    i12 += length;
                    int f10 = B10.f();
                    int g10 = B10.g();
                    int h11 = B10.h();
                    if (f10 < 10 && !this.f58012a) {
                        appendable.append(charValue);
                        i12++;
                    }
                    String valueOf = String.valueOf(f10);
                    pVar = B10;
                    for (int i14 = 0; i14 < valueOf.length(); i14++) {
                        appendable.append((char) ((valueOf.charAt(i14) - '0') + charValue));
                        i12++;
                    }
                    if (g10 != 0 || h11 != 0 || !this.f58012a) {
                        appendable.append(j11.f58021b);
                        i12 += j11.f58021b.length();
                        if (g10 < 10) {
                            appendable.append(charValue);
                            i12++;
                        }
                        String valueOf2 = String.valueOf(g10);
                        for (int i15 = 0; i15 < valueOf2.length(); i15++) {
                            appendable.append((char) ((valueOf2.charAt(i15) - '0') + charValue));
                            i12++;
                        }
                        if (h11 != 0) {
                            appendable.append(j11.f58021b);
                            i12 += j11.f58021b.length();
                            if (h11 < 10) {
                                appendable.append(charValue);
                                i12++;
                            }
                            String valueOf3 = String.valueOf(h11);
                            for (int i16 = 0; i16 < valueOf3.length(); i16++) {
                                appendable.append((char) ((valueOf3.charAt(i16) - '0') + charValue));
                                i12++;
                            }
                        }
                    }
                    i13 = j11.f58023d - 1;
                }
                i13++;
                c10 = c11;
                B10 = pVar;
            }
            i10 = i12;
        }
        if (length2 != -1 && i10 > 0 && set != null) {
            set.add(new C5713g(B.TIMEZONE_ID, length2, length2 + i10));
        }
        return i10;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return B.TIMEZONE_OFFSET;
    }

    @Override // net.time4j.format.expert.h
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        String str;
        String str2;
        net.time4j.tz.f fVar;
        int i10;
        net.time4j.format.g gVar;
        int i11;
        int i12;
        net.time4j.tz.p o10;
        int n10;
        n nVar = this;
        InterfaceC5908d interfaceC5908d2 = interfaceC5908d;
        int length = charSequence.length();
        int f10 = sVar.f();
        if (f10 >= length) {
            sVar.k(f10, "Missing localized time zone offset.");
            return;
        }
        Locale locale = z10 ? nVar.f58015d : (Locale) interfaceC5908d2.b(net.time4j.format.a.f57804c, Locale.ROOT);
        boolean q10 = net.time4j.format.b.q(locale);
        boolean booleanValue = z10 ? nVar.f58014c : ((Boolean) interfaceC5908d2.b(net.time4j.format.a.f57815n, Boolean.FALSE)).booleanValue();
        boolean booleanValue2 = z10 ? nVar.f58013b : ((Boolean) interfaceC5908d2.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue();
        char charValue = z10 ? nVar.f58018g : ((Character) interfaceC5908d2.b(net.time4j.format.a.f57814m, '0')).charValue();
        String str3 = z10 ? nVar.f58016e : (String) interfaceC5908d2.b(C5708b.f57891g, "+");
        String str4 = z10 ? nVar.f58017f : (String) interfaceC5908d2.b(C5708b.f57892h, "-");
        a j10 = j(locale);
        int length2 = j10.f58020a.length();
        boolean z11 = booleanValue;
        net.time4j.tz.p pVar = null;
        int i13 = f10;
        int i14 = 0;
        while (i14 < length2) {
            int i15 = length2;
            char charAt = j10.f58020a.charAt(i14);
            if (j10.f58022c > i14 || j10.f58023d <= i14) {
                str = str3;
                str2 = str4;
                if (z11) {
                    continue;
                } else {
                    char charAt2 = i13 < length ? charSequence.charAt(i13) : (char) 0;
                    if ((booleanValue2 || charAt != charAt2) && !(booleanValue2 && g(charAt, charAt2))) {
                        int m10 = m(charSequence, length, f10, locale, booleanValue2);
                        if (m10 <= 0) {
                            sVar.k(f10, "Literal mismatched in localized time zone offset.");
                            return;
                        } else {
                            tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.f58410k);
                            sVar.l(f10 + m10);
                            return;
                        }
                    }
                    i13++;
                }
            } else {
                int n11 = m.n(charSequence, i13, str3, booleanValue2, q10);
                if (n11 == -1) {
                    n11 = m.n(charSequence, i13, str4, booleanValue2, q10);
                    if (n11 == -1) {
                        int m11 = z11 ? 0 : m(charSequence, length, f10, locale, booleanValue2);
                        if (m11 <= 0) {
                            sVar.k(f10, "Missing sign in localized time zone offset.");
                            return;
                        } else {
                            tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.f58410k);
                            sVar.l(f10 + m11);
                            return;
                        }
                    }
                    fVar = net.time4j.tz.f.BEHIND_UTC;
                } else {
                    fVar = net.time4j.tz.f.AHEAD_OF_UTC;
                }
                net.time4j.tz.f fVar2 = fVar;
                int i16 = i13 + n11;
                int k10 = k(charSequence, i16, charValue);
                str = str3;
                if (k10 == -1000) {
                    sVar.k(i16, "Missing hour part in localized time zone offset.");
                    return;
                }
                if (k10 < 0) {
                    k10 = ~k10;
                    i10 = i16 + 1;
                } else {
                    i10 = i16 + 2;
                }
                if (i10 >= length) {
                    if (!nVar.f58012a) {
                        sVar.k(i10, "Missing minute part in localized time zone offset.");
                        return;
                    } else {
                        tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar2, k10));
                        sVar.l(i10);
                        return;
                    }
                }
                if (z10) {
                    gVar = nVar.f58019h;
                    str2 = str4;
                } else {
                    str2 = str4;
                    gVar = (net.time4j.format.g) interfaceC5908d2.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
                }
                int n12 = m.n(charSequence, i10, j10.f58021b, booleanValue2, q10);
                if (n12 != -1) {
                    i10 += n12;
                } else if (nVar.f58012a) {
                    tVar.C(B.TIMEZONE_OFFSET, net.time4j.tz.p.n(fVar2, k10));
                    sVar.l(i10);
                    return;
                } else if (gVar.c()) {
                    sVar.k(i10, "Mismatch of localized time zone offset separator.");
                    return;
                }
                int l10 = l(charSequence, i10, charValue);
                if (l10 == -1000) {
                    sVar.k(i10, "Minute part in localized time zone offset does not match expected pattern mm.");
                    return;
                }
                i13 = i10 + 2;
                if (i13 >= length || (n10 = m.n(charSequence, i13, j10.f58021b, booleanValue2, q10)) == -1) {
                    i11 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    i12 = 0;
                } else {
                    int i17 = i13 + n10;
                    i12 = l(charSequence, i17, charValue);
                    i11 = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
                    i13 = i12 == -1000 ? i17 - n10 : i17 + 2;
                }
                if (i12 == 0 || i12 == i11) {
                    o10 = net.time4j.tz.p.o(fVar2, k10, l10);
                } else {
                    int i18 = (k10 * 3600) + (l10 * 60) + i12;
                    if (fVar2 == net.time4j.tz.f.BEHIND_UTC) {
                        i18 = -i18;
                    }
                    o10 = net.time4j.tz.p.p(i18);
                }
                i14 = j10.f58023d - 1;
                pVar = o10;
            }
            i14++;
            nVar = this;
            interfaceC5908d2 = interfaceC5908d;
            length2 = i15;
            str3 = str;
            str4 = str2;
        }
        if (pVar == null) {
            sVar.k(i13, "Unable to determine localized time zone offset.");
        } else {
            tVar.C(B.TIMEZONE_OFFSET, pVar);
            sVar.l(i13);
        }
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return new n(this.f58012a, ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57810i, Boolean.TRUE)).booleanValue(), ((Boolean) interfaceC5908d.b(net.time4j.format.a.f57815n, Boolean.FALSE)).booleanValue(), (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT), (String) interfaceC5908d.b(C5708b.f57891g, "+"), (String) interfaceC5908d.b(C5708b.f57892h, "-"), ((Character) interfaceC5908d.b(net.time4j.format.a.f57814m, '0')).charValue(), (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART));
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f58012a == ((n) obj).f58012a;
    }

    public int hashCode() {
        return this.f58012a ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(n.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f58012a);
        sb2.append(']');
        return sb2.toString();
    }

    public n(boolean z10, boolean z11, boolean z12, Locale locale, String str, String str2, char c10, net.time4j.format.g gVar) {
        this.f58012a = z10;
        this.f58013b = z11;
        this.f58014c = z12;
        this.f58015d = locale;
        this.f58016e = str;
        this.f58017f = str2;
        this.f58018g = c10;
        this.f58019h = gVar;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this;
    }
}
