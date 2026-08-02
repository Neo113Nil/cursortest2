package net.time4j.format.expert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.InterfaceC5472f;
import net.time4j.format.expert.G;
import oi.EnumC5901B;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class D implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentMap f57863g = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentMap f57864h = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57865a;

    /* renamed from: b, reason: collision with root package name */
    public final h f57866b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f57867c;

    /* renamed from: d, reason: collision with root package name */
    public final net.time4j.format.g f57868d;

    /* renamed from: e, reason: collision with root package name */
    public final Locale f57869e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57870f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final G f57871a;

        /* renamed from: b, reason: collision with root package name */
        public final G f57872b;

        public a(G g10, G g11) {
            this.f57871a = g10;
            this.f57872b = g11;
        }

        public void a(CharSequence charSequence, int i10, List list, List list2, int[] iArr) {
            String f10 = this.f57871a.f(charSequence, i10);
            int length = f10.length();
            iArr[0] = i10 + length;
            String f11 = this.f57872b.f(charSequence, i10);
            int length2 = f11.length();
            iArr[1] = i10 + length2;
            if (length2 > length) {
                list2.addAll(this.f57872b.b(f11));
                return;
            }
            if (length2 < length) {
                list.addAll(this.f57871a.b(f10));
            } else if (length > 0) {
                list.addAll(this.f57871a.b(f10));
                list2.addAll(this.f57872b.b(f11));
            }
        }
    }

    public D(boolean z10) {
        this.f57865a = z10;
        this.f57866b = new n(z10);
        this.f57867c = null;
        this.f57868d = net.time4j.format.g.SMART;
        this.f57869e = Locale.ROOT;
        this.f57870f = 0;
    }

    public static List h(List list) {
        if (list.size() > 1) {
            ArrayList arrayList = new ArrayList(list);
            int size = list.size();
            for (int i10 = 1; i10 < size; i10++) {
                net.time4j.tz.k kVar = (net.time4j.tz.k) list.get(i10);
                if (kVar.a().startsWith("WINDOWS~")) {
                    arrayList.remove(kVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    public static String l(List list) {
        StringBuilder sb2 = new StringBuilder(list.size() * 16);
        sb2.append('{');
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            net.time4j.tz.k kVar = (net.time4j.tz.k) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(kVar.a());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // net.time4j.format.expert.h
    public int a(oi.o oVar, Appendable appendable, InterfaceC5908d interfaceC5908d, Set set, boolean z10) {
        if (!oVar.d()) {
            throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
        }
        net.time4j.tz.k r10 = oVar.r();
        if (r10 instanceof net.time4j.tz.p) {
            return this.f57866b.a(oVar, appendable, interfaceC5908d, set, z10);
        }
        if (!(oVar instanceof InterfaceC5472f)) {
            throw new IllegalArgumentException("Cannot extract timezone name from: " + oVar);
        }
        net.time4j.tz.l N10 = net.time4j.tz.l.N(r10);
        String w10 = N10.w(j(N10.I((InterfaceC5472f) InterfaceC5472f.class.cast(oVar))), z10 ? this.f57869e : (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT));
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        appendable.append(w10);
        int length2 = w10.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new C5713g(B.TIMEZONE_ID, length, length + length2));
        }
        return length2;
    }

    @Override // net.time4j.format.expert.h
    public oi.p b() {
        return B.TIMEZONE_ID;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // net.time4j.format.expert.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(CharSequence charSequence, s sVar, InterfaceC5908d interfaceC5908d, t tVar, boolean z10) {
        a aVar;
        int size;
        List list;
        List<net.time4j.tz.k> list2;
        ?? r92;
        boolean z11;
        List list3;
        int f10 = sVar.f();
        int length = charSequence.length();
        int intValue = z10 ? this.f57870f : ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (f10 >= length) {
            sVar.k(f10, "Missing timezone name.");
            return;
        }
        Locale locale = z10 ? this.f57869e : (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT);
        net.time4j.format.g gVar = z10 ? this.f57868d : (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
        String i10 = i(charSequence, f10, length);
        if (i10.startsWith("GMT") || i10.startsWith("UT")) {
            this.f57866b.c(charSequence, sVar, interfaceC5908d, tVar, z10);
            return;
        }
        ConcurrentMap concurrentMap = this.f57865a ? f57863g : f57864h;
        a aVar2 = (a) concurrentMap.get(locale);
        if (aVar2 == null) {
            a aVar3 = new a(g(locale, false), g(locale, true));
            if (concurrentMap.size() >= 25 || (aVar2 = (a) concurrentMap.putIfAbsent(locale, aVar3)) == null) {
                aVar = aVar3;
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                int[] iArr = new int[2];
                aVar.a(charSequence.subSequence(0, length), f10, arrayList, arrayList2, iArr);
                size = arrayList.size() + arrayList2.size();
                if (size != 0) {
                    sVar.k(f10, "\"" + i10 + "\" does not match any known timezone name.");
                    return;
                }
                if (size > 1 && !gVar.c()) {
                    arrayList = h(arrayList);
                    arrayList2 = h(arrayList2);
                    size = arrayList.size() + arrayList2.size();
                }
                if (size <= 1 || gVar.a()) {
                    list = arrayList;
                    list2 = arrayList2;
                } else {
                    net.time4j.tz.k kVar = (net.time4j.tz.k) interfaceC5908d.b(net.time4j.format.a.f57805d, net.time4j.tz.p.f58410k);
                    if (kVar instanceof net.time4j.tz.p) {
                        list = arrayList;
                        list2 = arrayList2;
                        z11 = false;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                net.time4j.tz.k kVar2 = (net.time4j.tz.k) it.next();
                                if (kVar2.a().equals(kVar.a())) {
                                    list3 = Collections.singletonList(kVar2);
                                    list2 = Collections.EMPTY_LIST;
                                    z11 = true;
                                    break;
                                }
                            } else {
                                list3 = arrayList;
                                list2 = arrayList2;
                                z11 = false;
                                break;
                            }
                        }
                        if (!z11) {
                            for (net.time4j.tz.k kVar3 : list2) {
                                List list4 = list3;
                                if (kVar3.a().equals(kVar.a())) {
                                    list = Collections.EMPTY_LIST;
                                    list2 = Collections.singletonList(kVar3);
                                    z11 = true;
                                    break;
                                }
                                list3 = list4;
                            }
                        }
                        list = list3;
                    }
                    if (!z11) {
                        if (list.size() > 0) {
                            list = k(list, locale, gVar);
                        }
                        if (list2.size() > 0) {
                            list2 = k(list2, locale, gVar);
                        }
                    }
                }
                int size2 = list.size() + list2.size();
                if (size2 == 0) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((net.time4j.tz.k) it2.next()).a());
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(((net.time4j.tz.k) it3.next()).a());
                    }
                    sVar.k(f10, "Time zone name \"" + i10 + "\" not found among preferred timezones in locale " + locale + ", candidates=" + arrayList3);
                    return;
                }
                if (list.size() > 0) {
                    if ((size2 != 2 || list2.size() != 1 || !((net.time4j.tz.k) list.get(0)).a().equals(((net.time4j.tz.k) list2.get(0)).a())) && !list2.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(list);
                        arrayList4.addAll(list2);
                        list = arrayList4;
                    }
                    r92 = 0;
                } else {
                    list = list2;
                    r92 = 1;
                }
                if (list.size() != 1 && !gVar.a()) {
                    sVar.k(f10, "Time zone name is not unique: \"" + i10 + "\" in " + l(list));
                    return;
                }
                tVar.C(B.TIMEZONE_ID, list.get(0));
                tVar.C(EnumC5901B.DAYLIGHT_SAVING, Boolean.valueOf((boolean) r92));
                sVar.l(iArr[r92]);
                return;
            }
        }
        aVar = aVar2;
        List arrayList5 = new ArrayList();
        List arrayList22 = new ArrayList();
        int[] iArr2 = new int[2];
        aVar.a(charSequence.subSequence(0, length), f10, arrayList5, arrayList22, iArr2);
        size = arrayList5.size() + arrayList22.size();
        if (size != 0) {
        }
    }

    @Override // net.time4j.format.expert.h
    public h d(C5709c c5709c, InterfaceC5908d interfaceC5908d, int i10) {
        return new D(this.f57865a, this.f57866b, this.f57867c, (net.time4j.format.g) interfaceC5908d.b(net.time4j.format.a.f57807f, net.time4j.format.g.SMART), (Locale) interfaceC5908d.b(net.time4j.format.a.f57804c, Locale.ROOT), ((Integer) interfaceC5908d.b(net.time4j.format.a.f57820s, 0)).intValue());
    }

    @Override // net.time4j.format.expert.h
    public boolean e() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            D d10 = (D) obj;
            if (this.f57865a == d10.f57865a) {
                Set set = this.f57867c;
                Set set2 = d10.f57867c;
                if (set != null ? set.equals(set2) : set2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final G g(Locale locale, boolean z10) {
        net.time4j.tz.d j10 = j(z10);
        G.b bVar = null;
        for (net.time4j.tz.k kVar : net.time4j.tz.l.t()) {
            String x10 = net.time4j.tz.l.x(kVar, j10, locale);
            if (!x10.equals(kVar.a())) {
                bVar = G.d(bVar, x10, kVar);
            }
        }
        return new G(bVar);
    }

    public int hashCode() {
        Set set = this.f57867c;
        return (set == null ? 0 : set.hashCode()) + (this.f57865a ? 1 : 0);
    }

    public final String i(CharSequence charSequence, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = charSequence.charAt(i12);
            if (!Character.isLetter(charAt) && (this.f57865a || i12 <= i10 || Character.isDigit(charAt))) {
                break;
            }
            sb2.append(charAt);
        }
        return sb2.toString().trim();
    }

    public final net.time4j.tz.d j(boolean z10) {
        return z10 ? this.f57865a ? net.time4j.tz.d.SHORT_DAYLIGHT_TIME : net.time4j.tz.d.LONG_DAYLIGHT_TIME : this.f57865a ? net.time4j.tz.d.SHORT_STANDARD_TIME : net.time4j.tz.d.LONG_STANDARD_TIME;
    }

    public final List k(List list, Locale locale, net.time4j.format.g gVar) {
        boolean z10;
        HashMap hashMap = new HashMap();
        hashMap.put("DEFAULT", new ArrayList());
        Iterator it = list.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            String a10 = ((net.time4j.tz.k) it.next()).a();
            Set set = this.f57867c;
            int indexOf = a10.indexOf(126);
            String substring = indexOf >= 0 ? a10.substring(0, indexOf) : "DEFAULT";
            if (set == null) {
                set = net.time4j.tz.l.C(locale, gVar.b(), substring);
            }
            Iterator it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    net.time4j.tz.k kVar = (net.time4j.tz.k) it2.next();
                    if (kVar.a().equals(a10)) {
                        List list2 = (List) hashMap.get(substring);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            hashMap.put(substring, list2);
                        }
                        list2.add(kVar);
                    }
                }
            }
        }
        List list3 = (List) hashMap.get("DEFAULT");
        if (!list3.isEmpty()) {
            return list3;
        }
        hashMap.remove("DEFAULT");
        Iterator it3 = hashMap.keySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            List list4 = (List) hashMap.get((String) it3.next());
            if (!list4.isEmpty()) {
                z10 = true;
                list = list4;
                break;
            }
        }
        return !z10 ? Collections.EMPTY_LIST : list;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(D.class.getName());
        sb2.append("[abbreviated=");
        sb2.append(this.f57865a);
        sb2.append(", preferredZones=");
        sb2.append(this.f57867c);
        sb2.append(']');
        return sb2.toString();
    }

    public D(boolean z10, h hVar, Set set, net.time4j.format.g gVar, Locale locale, int i10) {
        this.f57865a = z10;
        this.f57866b = hVar;
        this.f57867c = set;
        this.f57868d = gVar;
        this.f57869e = locale;
        this.f57870f = i10;
    }

    @Override // net.time4j.format.expert.h
    public h f(oi.p pVar) {
        return this;
    }
}
