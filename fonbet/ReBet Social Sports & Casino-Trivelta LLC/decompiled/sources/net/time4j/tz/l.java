package net.time4j.tz;

import android.util.TimeUtils;
import java.io.Serializable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5470d;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import li.InterfaceC5473g;

/* loaded from: classes5.dex */
public abstract class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f58345a = System.getProperty("line.separator");

    /* renamed from: b, reason: collision with root package name */
    public static final String f58346b = System.getProperty("net.time4j.tz.repository.version");

    /* renamed from: c, reason: collision with root package name */
    public static final Comparator f58347c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final o f58348d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f58349e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f58350f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f58351g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile e f58352h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile l f58353i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile boolean f58354j;

    /* renamed from: k, reason: collision with root package name */
    public static int f58355k;

    /* renamed from: l, reason: collision with root package name */
    public static final Map f58356l;

    /* renamed from: m, reason: collision with root package name */
    public static final Map f58357m;

    /* renamed from: n, reason: collision with root package name */
    public static final r f58358n;

    /* renamed from: o, reason: collision with root package name */
    public static final r f58359o;

    /* renamed from: p, reason: collision with root package name */
    public static final ConcurrentMap f58360p;

    /* renamed from: q, reason: collision with root package name */
    public static final ReferenceQueue f58361q;

    /* renamed from: r, reason: collision with root package name */
    public static final LinkedList f58362r;

    /* renamed from: s, reason: collision with root package name */
    public static final ConcurrentMap f58363s;

    /* renamed from: t, reason: collision with root package name */
    public static final s f58364t;

    /* renamed from: u, reason: collision with root package name */
    public static final l f58365u;

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(k kVar, k kVar2) {
            return kVar.a().compareTo(kVar2.a());
        }
    }

    public static class b {
        public static void a() {
            synchronized (l.class) {
                do {
                } while (l.f58361q.poll() != null);
                l.f58362r.clear();
            }
            e unused = l.f58352h = new e();
            l.f58360p.clear();
            if (l.f58351g) {
                l unused2 = l.f58353i = l.v();
            }
        }
    }

    public static class c extends SoftReference {

        /* renamed from: a, reason: collision with root package name */
        public final String f58366a;

        public c(l lVar, ReferenceQueue referenceQueue) {
            super(lVar, referenceQueue);
            this.f58366a = lVar.z().a();
        }
    }

    public static class d implements r, s {
        public d() {
        }

        @Override // net.time4j.tz.r
        public s a() {
            return this;
        }

        @Override // net.time4j.tz.s
        public Set b(Locale locale, boolean z10) {
            return Collections.EMPTY_SET;
        }

        @Override // net.time4j.tz.r
        public Map c() {
            return Collections.EMPTY_MAP;
        }

        @Override // net.time4j.tz.s
        public String d(boolean z10, Locale locale) {
            return z10 ? "GMT" : "GMT±hh:mm";
        }

        @Override // net.time4j.tz.r
        public String e() {
            return "";
        }

        @Override // net.time4j.tz.s
        public String f(String str, net.time4j.tz.d dVar, Locale locale) {
            if (locale == null) {
                throw new NullPointerException("Missing locale.");
            }
            if (str.isEmpty()) {
                return "";
            }
            TimeZone R10 = h.R(str);
            return R10.getID().equals(str) ? R10.getDisplayName(dVar.b(), !dVar.a() ? 1 : 0, locale) : "";
        }

        @Override // net.time4j.tz.r
        public Set g() {
            HashSet hashSet = new HashSet();
            hashSet.addAll(Arrays.asList(TimeZone.getAvailableIDs()));
            return hashSet;
        }

        @Override // net.time4j.tz.r
        public String getName() {
            return "java.util.TimeZone";
        }

        @Override // net.time4j.tz.r
        public String getVersion() {
            return TimeUtils.getTimeZoneDatabaseVersion();
        }

        @Override // net.time4j.tz.r
        public String h() {
            return "";
        }

        @Override // net.time4j.tz.r
        public m i(String str) {
            return null;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final List f58367a;

        /* renamed from: b, reason: collision with root package name */
        public final List f58368b;

        public e() {
            ArrayList arrayList = new ArrayList(1024);
            ArrayList arrayList2 = new ArrayList(1024);
            arrayList.add(p.f58410k);
            Iterator it = l.f58363s.entrySet().iterator();
            while (it.hasNext()) {
                r rVar = (r) ((Map.Entry) it.next()).getValue();
                if (rVar != l.f58358n || l.f58359o == l.f58358n) {
                    Iterator it2 = rVar.g().iterator();
                    while (it2.hasNext()) {
                        k P10 = l.P((String) it2.next());
                        if (!arrayList.contains(P10)) {
                            arrayList.add(P10);
                        }
                    }
                    arrayList2.addAll(arrayList);
                    Iterator it3 = rVar.c().keySet().iterator();
                    while (it3.hasNext()) {
                        k P11 = l.P((String) it3.next());
                        if (!arrayList2.contains(P11)) {
                            arrayList2.add(P11);
                        }
                    }
                }
            }
            Collections.sort(arrayList, l.f58347c);
            Collections.sort(arrayList2, l.f58347c);
            this.f58367a = Collections.unmodifiableList(arrayList);
            this.f58368b = Collections.unmodifiableList(arrayList2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.time4j.tz.l$a] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.time4j.tz.l] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.time4j.tz.j] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.time4j.tz.l] */
    /* JADX WARN: Type inference failed for: r0v25 */
    static {
        List list;
        String property;
        net.time4j.tz.b bVar = net.time4j.tz.b.PUSH_FORWARD;
        g gVar = g.LATER_OFFSET;
        f58348d = bVar.a(gVar);
        f58349e = net.time4j.tz.b.ABORT.a(gVar);
        boolean equalsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f58350f = equalsIgnoreCase;
        f58351g = equalsIgnoreCase || Boolean.getBoolean("net.time4j.allow.system.tz.override");
        ?? r02 = 0;
        r02 = 0;
        f58352h = null;
        f58353i = null;
        f58354j = true;
        f58355k = 11;
        f58360p = new ConcurrentHashMap();
        f58363s = new ConcurrentHashMap();
        f58361q = new ReferenceQueue();
        f58362r = new LinkedList();
        try {
            list = L(l.class.getClassLoader(), "AFRICA", "AMERICA", "AMERICA$ARGENTINA", "AMERICA$INDIANA", "AMERICA$KENTUCKY", "AMERICA$NORTH_DAKOTA", "ANTARCTICA", "ASIA", "ATLANTIC", "AUSTRALIA", "EUROPE", "INDIAN", "PACIFIC");
        } catch (ClassNotFoundException unused) {
            list = Collections.EMPTY_LIST;
        }
        HashMap hashMap = new HashMap();
        p pVar = p.f58410k;
        hashMap.put("Z", pVar);
        hashMap.put("UT", pVar);
        hashMap.put("UTC", pVar);
        hashMap.put("GMT", pVar);
        hashMap.put("UTC0", pVar);
        hashMap.put("GMT0", pVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (k kVar : (k[]) ((Class) it.next()).getEnumConstants()) {
                hashMap.put(kVar.a(), kVar);
            }
        }
        f58356l = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        s(hashMap2);
        f58357m = Collections.unmodifiableMap(hashMap2);
        r rVar = null;
        for (r rVar2 : AbstractC5470d.c().g(r.class)) {
            String name = rVar2.getName();
            if (name.equals("TZDB")) {
                rVar = r(rVar2, rVar);
            } else if (!name.isEmpty() && !name.equals("DEFAULT")) {
                f58363s.put(name, rVar2);
            }
        }
        r4 = null;
        for (s sVar : AbstractC5470d.c().g(s.class)) {
        }
        d dVar = new d(r02);
        f58358n = dVar;
        if (sVar == null) {
            sVar = dVar.a();
        }
        f58364t = sVar;
        ConcurrentMap concurrentMap = f58363s;
        concurrentMap.put("java.util.TimeZone", dVar);
        if (rVar == null) {
            f58359o = dVar;
        } else {
            concurrentMap.put("TZDB", rVar);
            f58359o = rVar;
        }
        try {
            property = System.getProperty("user.timezone");
        } catch (SecurityException unused2) {
        }
        if (!"Z".equals(property) && !"UTC".equals(property)) {
            if (property != null) {
                r02 = F(P(property), property, false);
            }
            if (r02 != 0) {
                f58365u = v();
            } else {
                f58365u = r02;
            }
            if (f58351g) {
                f58353i = f58365u;
            }
            f58352h = new e();
        }
        r02 = p.f58410k.k();
        if (r02 != 0) {
        }
        if (f58351g) {
        }
        f58352h = new e();
    }

    public static Set C(Locale locale, boolean z10, String str) {
        r D10 = D(str);
        if (D10 == null) {
            return Collections.EMPTY_SET;
        }
        s a10 = D10.a();
        if (a10 == null) {
            a10 = f58364t;
        }
        HashSet hashSet = new HashSet();
        Iterator it = a10.b(locale, z10).iterator();
        while (it.hasNext()) {
            hashSet.add(P((String) it.next()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static r D(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing zone model provider.");
        }
        return str.equals("DEFAULT") ? f58359o : (r) f58363s.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l F(k kVar, String str, boolean z10) {
        l lVar;
        String str2;
        ConcurrentMap concurrentMap = f58360p;
        c cVar = (c) concurrentMap.get(str);
        if (cVar != null) {
            lVar = (l) cVar.get();
            if (lVar == null) {
                concurrentMap.remove(cVar.f58366a);
            }
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar;
        }
        String str3 = "";
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                str2 = str;
                break;
            }
            if (str.charAt(i10) == '~') {
                str3 = str.substring(0, i10);
                str2 = str.substring(i10 + 1);
                break;
            }
            i10++;
        }
        if (str2.isEmpty()) {
            if (z10) {
                throw new IllegalArgumentException("Timezone key is empty.");
            }
            return null;
        }
        r rVar = f58359o;
        boolean z11 = str3.isEmpty() || str3.equals("DEFAULT");
        if (!z11 && (rVar = (r) f58363s.get(str3)) == null) {
            if (!z10) {
                return null;
            }
            throw new IllegalArgumentException((str3.equals("TZDB") ? "TZDB provider not available: " : "Timezone model provider not registered: ") + str);
        }
        if (kVar == null) {
            if (z11) {
                kVar = P(str2);
                if (kVar instanceof p) {
                    return ((p) kVar).k();
                }
            } else {
                kVar = new net.time4j.tz.e(str);
            }
        }
        if (rVar == f58358n) {
            h hVar = new h(kVar, str2);
            if (!hVar.T() || str2.equals("GMT") || str2.startsWith("UT") || str2.equals("Z")) {
                lVar = hVar;
            }
        } else {
            m i11 = rVar.i(str2);
            lVar = i11 == null ? H(rVar, kVar, str2) : new net.time4j.tz.c(kVar, i11);
        }
        if (lVar == null) {
            if (!z10) {
                return null;
            }
            if (TimeZone.getDefault().getID().equals(str)) {
                return new h(new net.time4j.tz.e(str));
            }
            throw new IllegalArgumentException("Unknown timezone: " + str);
        }
        if (f58354j) {
            c cVar2 = (c) f58360p.putIfAbsent(str, new c(lVar, f58361q));
            if (cVar2 == null) {
                synchronized (l.class) {
                    try {
                        f58362r.addFirst(lVar);
                        while (true) {
                            LinkedList linkedList = f58362r;
                            if (linkedList.size() >= f58355k) {
                                linkedList.removeLast();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return lVar;
            }
            l lVar2 = (l) cVar2.get();
            if (lVar2 != null) {
                return lVar2;
            }
        }
        return lVar;
    }

    public static l G(k kVar, boolean z10) {
        return kVar instanceof p ? ((p) kVar).k() : F(kVar, kVar.a(), z10);
    }

    public static l H(r rVar, k kVar, String str) {
        Map c10 = rVar.c();
        String str2 = str;
        m mVar = null;
        while (mVar == null) {
            str2 = (String) c10.get(str2);
            if (str2 == null) {
                break;
            }
            mVar = rVar.i(str2);
        }
        if (mVar != null) {
            return new net.time4j.tz.c(kVar, mVar);
        }
        String h10 = rVar.h();
        if (h10.isEmpty()) {
            return null;
        }
        if (h10.equals(rVar.getName())) {
            throw new IllegalArgumentException("Circular zone model provider fallback: " + rVar.getName());
        }
        return new net.time4j.tz.a(kVar, M(h10 + "~" + str));
    }

    public static List L(ClassLoader classLoader, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Class<?> cls = Class.forName("net.time4j.tz.olson." + str, true, classLoader);
            if (k.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static l M(String str) {
        return F(null, str, true);
    }

    public static l N(k kVar) {
        return G(kVar, true);
    }

    public static l O() {
        return (!f58351g || f58353i == null) ? f58365u : f58353i;
    }

    public static k P(String str) {
        k kVar = (k) f58356l.get(str);
        if (kVar != null) {
            return kVar;
        }
        if (str.startsWith("GMT")) {
            str = "UTC" + str.substring(3);
        }
        p s10 = p.s(str, false);
        return s10 == null ? new net.time4j.tz.e(str) : s10;
    }

    public static r r(r rVar, r rVar2) {
        String version = rVar.getVersion();
        if (!version.isEmpty()) {
            String str = f58346b;
            if (version.equals(str) || (str == null && (rVar2 == null || version.compareTo(rVar2.getVersion()) > 0 || (version.compareTo(rVar2.getVersion()) == 0 && !rVar.e().contains("{java.home}"))))) {
                return rVar;
            }
        }
        return rVar2;
    }

    public static void s(Map map) {
        p pVar = p.f58410k;
        map.put("Etc/GMT", pVar);
        map.put("Etc/Greenwich", pVar);
        map.put("Etc/Universal", pVar);
        map.put("Etc/Zulu", pVar);
        map.put("Etc/GMT+0", pVar);
        map.put("Etc/GMT-0", pVar);
        map.put("Etc/GMT0", pVar);
        map.put("Etc/UTC", pVar);
        map.put("Etc/UCT", pVar);
        map.put("Etc/GMT-14", p.p(50400));
        map.put("Etc/GMT-13", p.p(46800));
        map.put("Etc/GMT-12", p.p(43200));
        map.put("Etc/GMT-11", p.p(39600));
        map.put("Etc/GMT-10", p.p(36000));
        map.put("Etc/GMT-9", p.p(32400));
        map.put("Etc/GMT-8", p.p(28800));
        map.put("Etc/GMT-7", p.p(25200));
        map.put("Etc/GMT-6", p.p(21600));
        map.put("Etc/GMT-5", p.p(18000));
        map.put("Etc/GMT-4", p.p(14400));
        map.put("Etc/GMT-3", p.p(10800));
        map.put("Etc/GMT-2", p.p(7200));
        map.put("Etc/GMT-1", p.p(3600));
        map.put("Etc/GMT+1", p.p(-3600));
        map.put("Etc/GMT+2", p.p(-7200));
        map.put("Etc/GMT+3", p.p(-10800));
        map.put("Etc/GMT+4", p.p(-14400));
        map.put("Etc/GMT+5", p.p(-18000));
        map.put("Etc/GMT+6", p.p(-21600));
        map.put("Etc/GMT+7", p.p(-25200));
        map.put("Etc/GMT+8", p.p(-28800));
        map.put("Etc/GMT+9", p.p(-32400));
        map.put("Etc/GMT+10", p.p(-36000));
        map.put("Etc/GMT+11", p.p(-39600));
        map.put("Etc/GMT+12", p.p(-43200));
    }

    public static List t() {
        return f58352h.f58367a;
    }

    public static List u(String str) {
        if (str.equals("INCLUDE_ALIAS")) {
            return f58352h.f58368b;
        }
        r D10 = D(str);
        if (D10 == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = D10.g().iterator();
        while (it.hasNext()) {
            arrayList.add(P((String) it.next()));
        }
        Collections.sort(arrayList, f58347c);
        return Collections.unmodifiableList(arrayList);
    }

    public static l v() {
        String id2 = TimeZone.getDefault().getID();
        l F10 = F(null, id2, false);
        return F10 == null ? new h(new net.time4j.tz.e(id2)) : F10;
    }

    public static String x(k kVar, net.time4j.tz.d dVar, Locale locale) {
        String str;
        String a10 = kVar.a();
        int indexOf = a10.indexOf(126);
        r rVar = f58359o;
        if (indexOf >= 0) {
            String substring = a10.substring(0, indexOf);
            if (substring.equals("DEFAULT") || (rVar = (r) f58363s.get(substring)) != null) {
                str = a10.substring(indexOf + 1);
            }
            return a10;
        }
        str = a10;
        s a11 = rVar.a();
        if (a11 == null) {
            a11 = f58364t;
        }
        String f10 = a11.f(str, dVar, locale);
        if (f10.isEmpty()) {
            s sVar = f58364t;
            if (a11 != sVar) {
                f10 = sVar.f(str, dVar, locale);
            }
            if (f10.isEmpty()) {
                return a10;
            }
        }
        return f10;
    }

    public abstract p A(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g);

    public abstract p B(InterfaceC5472f interfaceC5472f);

    public abstract o E();

    public abstract boolean I(InterfaceC5472f interfaceC5472f);

    public abstract boolean J();

    public abstract boolean K(InterfaceC5467a interfaceC5467a, InterfaceC5473g interfaceC5473g);

    public abstract l Q(o oVar);

    public String w(net.time4j.tz.d dVar, Locale locale) {
        return x(z(), dVar, locale);
    }

    public abstract m y();

    public abstract k z();
}
