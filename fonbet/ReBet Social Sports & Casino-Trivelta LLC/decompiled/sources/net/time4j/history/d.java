package net.time4j.history;

import com.facebook.hermes.intl.Constants;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.EnumC5706f;
import net.time4j.F;
import net.time4j.format.t;
import oi.EnumC5900A;
import oi.InterfaceC5907c;
import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public final class d implements Serializable {

    /* renamed from: p, reason: collision with root package name */
    public static final InterfaceC5907c f58160p = net.time4j.format.a.e("YEAR_DEFINITION", p.class);

    /* renamed from: q, reason: collision with root package name */
    public static final d f58161q;

    /* renamed from: r, reason: collision with root package name */
    public static final d f58162r;

    /* renamed from: s, reason: collision with root package name */
    public static final d f58163s;
    private static final long serialVersionUID = 4100690610730913643L;

    /* renamed from: t, reason: collision with root package name */
    public static final long f58164t;

    /* renamed from: u, reason: collision with root package name */
    public static final d f58165u;

    /* renamed from: v, reason: collision with root package name */
    public static final d f58166v;

    /* renamed from: w, reason: collision with root package name */
    public static final Map f58167w;

    /* renamed from: a, reason: collision with root package name */
    public final transient net.time4j.history.internal.b f58168a;

    /* renamed from: b, reason: collision with root package name */
    public final transient List f58169b;

    /* renamed from: c, reason: collision with root package name */
    public final transient net.time4j.history.a f58170c;

    /* renamed from: d, reason: collision with root package name */
    public final transient o f58171d;

    /* renamed from: e, reason: collision with root package name */
    public final transient g f58172e;

    /* renamed from: f, reason: collision with root package name */
    public final transient oi.p f58173f;

    /* renamed from: g, reason: collision with root package name */
    public final transient oi.p f58174g;

    /* renamed from: h, reason: collision with root package name */
    public final transient t f58175h;

    /* renamed from: i, reason: collision with root package name */
    public final transient oi.p f58176i;

    /* renamed from: j, reason: collision with root package name */
    public final transient oi.p f58177j;

    /* renamed from: k, reason: collision with root package name */
    public final transient t f58178k;

    /* renamed from: l, reason: collision with root package name */
    public final transient t f58179l;

    /* renamed from: m, reason: collision with root package name */
    public final transient t f58180m;

    /* renamed from: n, reason: collision with root package name */
    public final transient oi.p f58181n;

    /* renamed from: o, reason: collision with root package name */
    public final transient Set f58182o;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$history$HistoricEra;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$history$YearDefinition;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$history$internal$HistoricVariant;

        static {
            int[] iArr = new int[p.values().length];
            $SwitchMap$net$time4j$history$YearDefinition = iArr;
            try {
                iArr[p.DUAL_DATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$history$YearDefinition[p.AFTER_NEW_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$history$YearDefinition[p.BEFORE_NEW_YEAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[j.values().length];
            $SwitchMap$net$time4j$history$HistoricEra = iArr2;
            try {
                iArr2[j.HISPANIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$history$HistoricEra[j.BYZANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$history$HistoricEra[j.AB_URBE_CONDITA.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[net.time4j.history.internal.b.values().length];
            $SwitchMap$net$time4j$history$internal$HistoricVariant = iArr3;
            try {
                iArr3[net.time4j.history.internal.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.SINGLE_CUTOVER_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        net.time4j.history.internal.b bVar = net.time4j.history.internal.b.PROLEPTIC_GREGORIAN;
        c cVar = c.f58157a;
        f58161q = new d(bVar, Collections.singletonList(new f(Long.MIN_VALUE, cVar, cVar)));
        net.time4j.history.internal.b bVar2 = net.time4j.history.internal.b.PROLEPTIC_JULIAN;
        c cVar2 = c.f58158b;
        d dVar = new d(bVar2, Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2)));
        f58162r = dVar;
        net.time4j.history.internal.b bVar3 = net.time4j.history.internal.b.PROLEPTIC_BYZANTINE;
        List singletonList = Collections.singletonList(new f(Long.MIN_VALUE, cVar2, cVar2));
        n nVar = n.f58226c;
        f58163s = new d(bVar3, singletonList, null, new o(nVar, Integer.MAX_VALUE), g.c((F) F.l0().I()));
        long longValue = ((Long) F.B0(1582, 10, 15).j(EnumC5900A.MODIFIED_JULIAN_DATE)).longValue();
        f58164t = longValue;
        f58165u = E(longValue);
        ArrayList arrayList = new ArrayList();
        c cVar3 = c.f58159c;
        arrayList.add(new f(-57959L, cVar2, cVar3));
        arrayList.add(new f(-53575L, cVar3, cVar2));
        arrayList.add(new f(-38611L, cVar2, cVar));
        d dVar2 = new d(net.time4j.history.internal.b.SWEDEN, Collections.unmodifiableList(arrayList));
        f58166v = dVar2;
        HashMap hashMap = new HashMap();
        j jVar = j.AD;
        F d10 = dVar.d(h.g(jVar, 988, 3, 1));
        F d11 = dVar.d(h.g(jVar, 1382, 12, 24));
        F d12 = dVar.d(h.g(jVar, 1421, 12, 24));
        F d13 = dVar.d(h.g(jVar, 1699, 12, 31));
        d D10 = D();
        n nVar2 = n.f58224a;
        o d14 = nVar2.d(1383);
        n nVar3 = n.f58227d;
        hashMap.put("ES", D10.J(d14.b(nVar3.d(1556))).I(g.f(d11)));
        hashMap.put("PT", D().J(nVar2.d(1422).b(nVar3.d(1556))).I(g.f(d12)));
        hashMap.put("FR", F(F.B0(1582, 12, 20)).J(n.f58228e.d(1567)));
        hashMap.put("DE", D().J(nVar3.d(1544)));
        hashMap.put("DE-BAYERN", F(F.B0(1583, 10, 16)).J(nVar3.d(1544)));
        hashMap.put("DE-PREUSSEN", F(F.B0(1610, 9, 2)).J(nVar3.d(1559)));
        hashMap.put("DE-PROTESTANT", F(F.B0(1700, 3, 1)).J(nVar3.d(1559)));
        hashMap.put("NL", F(F.B0(1583, 1, 1)));
        hashMap.put("AT", F(F.B0(1584, 1, 17)));
        hashMap.put("CH", F(F.B0(1584, 1, 22)));
        hashMap.put("HU", F(F.B0(1587, 11, 1)));
        d F10 = F(F.B0(1700, 3, 1));
        n nVar4 = n.f58230g;
        hashMap.put("DK", F10.J(nVar4.d(1623)));
        hashMap.put("NO", F(F.B0(1700, 3, 1)).J(nVar4.d(1623)));
        hashMap.put("IT", D().J(nVar3.d(1583)));
        hashMap.put("IT-FLORENCE", D().J(nVar4.d(1749)));
        hashMap.put("IT-PISA", D().J(n.f58231h.d(1749)));
        d D11 = D();
        n nVar5 = n.f58225b;
        hashMap.put("IT-VENICE", D11.J(nVar5.d(1798)));
        hashMap.put("GB", F(F.B0(1752, 9, 14)).J(nVar3.d(1087).b(nVar2.d(1155)).b(nVar4.d(1752))));
        hashMap.put("GB-SCT", F(F.B0(1752, 9, 14)).J(nVar3.d(1087).b(nVar2.d(1155)).b(nVar4.d(1600))));
        hashMap.put("RU", F(F.B0(1918, 2, 14)).J(nVar2.d(988).b(nVar5.d(1493)).b(nVar.d(1700))).I(g.b(d10, d13)));
        hashMap.put("SE", dVar2);
        f58167w = Collections.unmodifiableMap(hashMap);
    }

    public d(net.time4j.history.internal.b bVar, List list) {
        this(bVar, list, null, null, g.f58189d);
    }

    public static d C(Locale locale) {
        d dVar;
        String country = locale.getCountry();
        if (locale.getVariant().isEmpty()) {
            dVar = null;
        } else {
            country = country + "-" + locale.getVariant();
            dVar = (d) f58167w.get(country);
        }
        if (dVar == null) {
            dVar = (d) f58167w.get(country);
        }
        return dVar == null ? D() : dVar;
    }

    public static d D() {
        return f58165u;
    }

    public static d E(long j10) {
        return new d(j10 == f58164t ? net.time4j.history.internal.b.INTRODUCTION_ON_1582_10_15 : net.time4j.history.internal.b.SINGLE_CUTOVER_DATE, Collections.singletonList(new f(j10, c.f58158b, c.f58157a)));
    }

    public static d F(F f10) {
        if (f10.equals(F.l0().I())) {
            return f58162r;
        }
        if (f10.equals(F.l0().J())) {
            return f58161q;
        }
        long longValue = ((Long) f10.j(EnumC5900A.MODIFIED_JULIAN_DATE)).longValue();
        c(longValue);
        return longValue == f58164t ? f58165u : E(longValue);
    }

    public static d G() {
        return f58166v;
    }

    public static void c(long j10) {
        if (j10 < f58164t) {
            throw new IllegalArgumentException("Gregorian calendar did not exist before 1582-10-15");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d j(String str) {
        d G10;
        int i10;
        String[] split;
        String[] split2;
        String[] split3;
        if (!str.startsWith("historic-")) {
            throw new IllegalArgumentException("Variant does not start with \"historic-\": " + str);
        }
        String[] split4 = str.substring(9).split(":");
        if (split4.length == 0) {
            throw new IllegalArgumentException("Invalid variant description.");
        }
        net.time4j.history.internal.b valueOf = net.time4j.history.internal.b.valueOf(split4[0]);
        switch (a.$SwitchMap$net$time4j$history$internal$HistoricVariant[valueOf.ordinal()]) {
            case 1:
                return f58161q;
            case 2:
                return f58162r;
            case 3:
                return f58163s;
            case 4:
                G10 = G();
                i10 = 1;
                split = split4[i10].split("=");
                if (split[0].equals("ancient-julian-leap-years")) {
                    String str2 = split[1];
                    String substring = str2.substring(1, str2.length() - 1);
                    if (!substring.isEmpty()) {
                        String[] split5 = substring.split(",");
                        int[] iArr = new int[split5.length];
                        for (int i11 = 0; i11 < split5.length; i11++) {
                            iArr[i11] = 1 - Integer.parseInt(split5[i11]);
                        }
                        G10 = G10.H(net.time4j.history.a.f(iArr));
                    }
                }
                split2 = split4[i10 + 1].split("=");
                if (split2[0].equals("new-year-strategy")) {
                    String str3 = split2[1];
                    o oVar = null;
                    for (String str4 : str3.substring(1, str3.length() - 1).split(",")) {
                        String[] split6 = str4.split("->");
                        n valueOf2 = n.valueOf(split6[0]);
                        int parseInt = split6.length == 2 ? Integer.parseInt(split6[1]) : Integer.MAX_VALUE;
                        if (oVar != null) {
                            oVar = oVar.b(valueOf2.d(parseInt));
                        } else if (valueOf2 != n.f58224a || parseInt != 567) {
                            oVar = valueOf2.d(parseInt);
                        }
                    }
                    G10 = G10.J(oVar);
                }
                split3 = split4[i10 + 2].split("=");
                if (split3[0].equals("era-preference")) {
                    String str5 = split3[1];
                    String substring2 = str5.substring(1, str5.length() - 1);
                    if (!substring2.equals(Constants.COLLATION_DEFAULT)) {
                        String[] split7 = substring2.split(",");
                        try {
                            j valueOf3 = j.valueOf(split7[0].substring(5));
                            F i12 = net.time4j.format.expert.l.i(split7[1].substring(7));
                            F i13 = net.time4j.format.expert.l.i(split7[2].substring(5));
                            int i14 = a.$SwitchMap$net$time4j$history$HistoricEra[valueOf3.ordinal()];
                            if (i14 == 1) {
                                return G10.I(g.e(i12, i13));
                            }
                            if (i14 == 2) {
                                return G10.I(g.b(i12, i13));
                            }
                            if (i14 == 3) {
                                return G10.I(g.a(i12, i13));
                            }
                            throw new IllegalArgumentException("BC/AD not allowed as era preference: " + str);
                        } catch (ParseException unused) {
                            throw new IllegalArgumentException("Invalid date syntax: " + str);
                        }
                    }
                }
                return G10;
            case 5:
                if (!r(split4, str).equals(F.B0(1582, 10, 15))) {
                    throw new IllegalArgumentException("Inconsistent cutover date: " + str);
                }
                G10 = D();
                i10 = 2;
                split = split4[i10].split("=");
                if (split[0].equals("ancient-julian-leap-years")) {
                }
                split2 = split4[i10 + 1].split("=");
                if (split2[0].equals("new-year-strategy")) {
                }
                split3 = split4[i10 + 2].split("=");
                if (split3[0].equals("era-preference")) {
                }
                return G10;
            case 6:
                G10 = F(r(split4, str));
                i10 = 2;
                split = split4[i10].split("=");
                if (split[0].equals("ancient-julian-leap-years")) {
                }
                split2 = split4[i10 + 1].split("=");
                if (split2[0].equals("new-year-strategy")) {
                }
                split3 = split4[i10 + 2].split("=");
                if (split3[0].equals("era-preference")) {
                }
                return G10;
            default:
                throw new UnsupportedOperationException(valueOf.name());
        }
    }

    public static F r(String[] strArr, String str) {
        String[] split = strArr[1].split("=");
        if (split.length != 2) {
            throw new IllegalArgumentException("Invalid syntax in variant description: " + str);
        }
        if (split[0].equals("cutover")) {
            try {
                return (F) net.time4j.format.expert.l.f57990m.D(split[1]);
            } catch (ParseException unused) {
            }
        }
        throw new IllegalArgumentException("Invalid cutover definition: " + str);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 3);
    }

    public static boolean z(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final boolean A(h hVar) {
        int a10 = hVar.c().a(hVar.e());
        return this == f58163s ? a10 < -5508 || (a10 == -5508 && hVar.d() < 9) || a10 > 999979465 : this == f58162r ? Math.abs(a10) > 999979465 : this == f58161q ? Math.abs(a10) > 999999999 : a10 < -44 || a10 > 9999;
    }

    public t B() {
        return this.f58178k;
    }

    public d H(net.time4j.history.a aVar) {
        if (aVar != null) {
            return !y() ? this : new d(this.f58168a, this.f58169b, aVar, this.f58171d, this.f58172e);
        }
        throw new NullPointerException("Missing ancient julian leap years.");
    }

    public d I(g gVar) {
        return (gVar.equals(this.f58172e) || !y()) ? this : new d(this.f58168a, this.f58169b, this.f58170c, this.f58171d, gVar);
    }

    public d J(o oVar) {
        if (oVar.equals(o.f58233d)) {
            if (this.f58171d != null) {
                return new d(this.f58168a, this.f58169b, this.f58170c, null, this.f58172e);
            }
        } else if (y()) {
            return new d(this.f58168a, this.f58169b, this.f58170c, oVar, this.f58172e);
        }
        return this;
    }

    public t K() {
        return this.f58175h;
    }

    public oi.p L(p pVar) {
        int i10 = a.$SwitchMap$net$time4j$history$YearDefinition[pVar.ordinal()];
        if (i10 == 1) {
            return this.f58175h;
        }
        if (i10 == 2) {
            return this.f58176i;
        }
        if (i10 == 3) {
            return this.f58177j;
        }
        throw new UnsupportedOperationException(pVar.name());
    }

    public h a(h hVar) {
        b k10 = k(hVar);
        if (k10 == null) {
            return hVar;
        }
        int b10 = k10.b(hVar);
        return b10 < hVar.b() ? h.g(hVar.c(), hVar.e(), hVar.d(), b10) : hVar;
    }

    public oi.p b() {
        return this.f58181n;
    }

    public F d(h hVar) {
        if (A(hVar)) {
            throw new IllegalArgumentException("Out of supported range: " + hVar);
        }
        b k10 = k(hVar);
        if (k10 != null) {
            return F.G0(k10.a(hVar), EnumC5900A.MODIFIED_JULIAN_DATE);
        }
        throw new IllegalArgumentException("Invalid historic date: " + hVar);
    }

    public h e(F f10) {
        h hVar;
        long longValue = ((Long) f10.j(EnumC5900A.MODIFIED_JULIAN_DATE)).longValue();
        int size = this.f58169b.size() - 1;
        while (true) {
            if (size < 0) {
                hVar = null;
                break;
            }
            f fVar = (f) this.f58169b.get(size);
            if (longValue >= fVar.f58185a) {
                hVar = fVar.f58186b.c(longValue);
                break;
            }
            size--;
        }
        if (hVar == null) {
            hVar = t().c(longValue);
        }
        j d10 = this.f58172e.d(hVar, f10);
        if (d10 != hVar.c()) {
            hVar = h.g(d10, d10.b(hVar.c(), hVar.e()), hVar.d(), hVar.b());
        }
        if (!A(hVar)) {
            return hVar;
        }
        throw new IllegalArgumentException("Out of supported range: " + hVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f58168a == dVar.f58168a && z(this.f58170c, dVar.f58170c) && z(this.f58171d, dVar.f58171d) && this.f58172e.equals(dVar.f58172e)) {
                return this.f58168a != net.time4j.history.internal.b.SINGLE_CUTOVER_DATE || ((f) this.f58169b.get(0)).f58185a == ((f) dVar.f58169b.get(0)).f58185a;
            }
        }
        return false;
    }

    public oi.p f() {
        return this.f58173f;
    }

    public oi.p g() {
        return this.f58179l;
    }

    public oi.p h() {
        return this.f58180m;
    }

    public int hashCode() {
        net.time4j.history.internal.b bVar = this.f58168a;
        if (bVar != net.time4j.history.internal.b.SINGLE_CUTOVER_DATE) {
            return bVar.hashCode();
        }
        long j10 = ((f) this.f58169b.get(0)).f58185a;
        return (int) (j10 ^ (j10 << 32));
    }

    public oi.p i() {
        return this.f58174g;
    }

    public boolean isValid(h hVar) {
        b k10;
        return (hVar == null || A(hVar) || (k10 = k(hVar)) == null || !k10.isValid(hVar)) ? false : true;
    }

    public b k(h hVar) {
        for (int size = this.f58169b.size() - 1; size >= 0; size--) {
            f fVar = (f) this.f58169b.get(size);
            if (hVar.compareTo(fVar.f58187c) >= 0) {
                return fVar.f58186b;
            }
            if (hVar.compareTo(fVar.f58188d) > 0) {
                return null;
            }
        }
        return t();
    }

    public net.time4j.history.a l() {
        net.time4j.history.a aVar = this.f58170c;
        if (aVar != null) {
            return aVar;
        }
        throw new UnsupportedOperationException("No historic julian leap years were defined.");
    }

    public h m(j jVar, int i10) {
        h d10 = v().d(jVar, i10);
        if (isValid(d10)) {
            j d11 = this.f58172e.d(d10, d(d10));
            return d11 != jVar ? h.g(d11, d11.b(d10.c(), d10.e()), d10.d(), d10.b()) : d10;
        }
        throw new IllegalArgumentException("Cannot determine valid New Year: " + jVar + "-" + i10);
    }

    public Set n() {
        return this.f58182o;
    }

    public g o() {
        return this.f58172e;
    }

    public List p() {
        return this.f58169b;
    }

    public F q() {
        long j10 = ((f) this.f58169b.get(r0.size() - 1)).f58185a;
        if (j10 != Long.MIN_VALUE) {
            return F.G0(j10, EnumC5900A.MODIFIED_JULIAN_DATE);
        }
        throw new UnsupportedOperationException("Proleptic history without any gregorian reform date.");
    }

    public net.time4j.history.internal.b s() {
        return this.f58168a;
    }

    public final b t() {
        net.time4j.history.a aVar = this.f58170c;
        return aVar != null ? aVar.d() : c.f58158b;
    }

    public String toString() {
        return "ChronoHistory[" + w() + "]";
    }

    public int u(j jVar, int i10) {
        h d10;
        h hVar;
        try {
            o oVar = this.f58171d;
            int i11 = 1;
            if (oVar == null) {
                d10 = h.g(jVar, i10, 1, 1);
                hVar = h.g(jVar, i10, 12, 31);
            } else {
                d10 = oVar.d(jVar, i10);
                if (jVar == j.BC) {
                    hVar = i10 == 1 ? this.f58171d.d(j.AD, 1) : this.f58171d.d(jVar, i10 - 1);
                } else {
                    h d11 = this.f58171d.d(jVar, i10 + 1);
                    if (jVar == j.BYZANTINE) {
                        hVar = this.f58171d.d(j.AD, jVar.a(i10));
                        if (hVar.compareTo(d10) > 0) {
                        }
                    }
                    hVar = d11;
                }
                i11 = 0;
            }
            return (int) (EnumC5706f.f57798h.c(d(d10), d(hVar)) + i11);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public o v() {
        o oVar = this.f58171d;
        return oVar == null ? o.f58233d : oVar;
    }

    public String w() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("historic-");
        sb2.append(this.f58168a.name());
        int i10 = a.$SwitchMap$net$time4j$history$internal$HistoricVariant[this.f58168a.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            sb2.append(":no-cutover");
        } else {
            if (i10 == 5 || i10 == 6) {
                sb2.append(":cutover=");
                sb2.append(q());
            }
            sb2.append(":ancient-julian-leap-years=");
            net.time4j.history.a aVar = this.f58170c;
            if (aVar != null) {
                int[] e10 = aVar.e();
                sb2.append('[');
                sb2.append(e10[0]);
                for (int i11 = 1; i11 < e10.length; i11++) {
                    sb2.append(',');
                    sb2.append(e10[i11]);
                }
                sb2.append(']');
            } else {
                sb2.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            }
            sb2.append(":new-year-strategy=");
            sb2.append(v());
            sb2.append(":era-preference=");
            sb2.append(o());
        }
        return sb2.toString();
    }

    public boolean x() {
        return this.f58170c != null;
    }

    public boolean y() {
        List list = this.f58169b;
        return ((f) list.get(list.size() - 1)).f58185a > Long.MIN_VALUE;
    }

    public d(net.time4j.history.internal.b bVar, List list, net.time4j.history.a aVar, o oVar, g gVar) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("At least one cutover event must be present in chronological history.");
        }
        if (bVar == null) {
            throw new NullPointerException("Missing historic variant.");
        }
        if (gVar == null) {
            throw new NullPointerException("Missing era preference.");
        }
        this.f58168a = bVar;
        this.f58169b = list;
        this.f58170c = aVar;
        this.f58171d = oVar;
        this.f58172e = gVar;
        i iVar = new i(this);
        this.f58173f = iVar;
        k kVar = new k(this);
        this.f58174g = kVar;
        l lVar = new l('y', 1, 999999999, this, 2);
        this.f58175h = lVar;
        l lVar2 = new l((char) 0, 1, 999999999, this, 6);
        this.f58176i = lVar2;
        l lVar3 = new l((char) 0, 1, 999999999, this, 7);
        this.f58177j = lVar3;
        l lVar4 = new l('M', 1, 12, this, 3);
        this.f58178k = lVar4;
        l lVar5 = new l('d', 1, 31, this, 4);
        this.f58179l = lVar5;
        l lVar6 = new l('D', 1, 365, this, 5);
        this.f58180m = lVar6;
        l lVar7 = new l((char) 0, 1, 10000000, this, 8);
        this.f58181n = lVar7;
        HashSet hashSet = new HashSet();
        hashSet.add(iVar);
        hashSet.add(kVar);
        hashSet.add(lVar);
        hashSet.add(lVar2);
        hashSet.add(lVar3);
        hashSet.add(lVar4);
        hashSet.add(lVar5);
        hashSet.add(lVar6);
        hashSet.add(lVar7);
        this.f58182o = Collections.unmodifiableSet(hashSet);
    }
}
