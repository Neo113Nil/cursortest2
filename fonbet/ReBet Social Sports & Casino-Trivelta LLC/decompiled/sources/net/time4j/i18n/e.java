package net.time4j.i18n;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5470d;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f58254e = new ConcurrentHashMap(32);

    /* renamed from: f, reason: collision with root package name */
    public static final ReferenceQueue f58255f = new ReferenceQueue();

    /* renamed from: a, reason: collision with root package name */
    public final e f58256a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f58257b;

    /* renamed from: c, reason: collision with root package name */
    public final String f58258c;

    /* renamed from: d, reason: collision with root package name */
    public final Locale f58259d;

    public static class a extends SoftReference {

        /* renamed from: a, reason: collision with root package name */
        public b f58260a;

        public a(e eVar, b bVar) {
            super(eVar, e.f58255f);
            this.f58260a = bVar;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f58261a;

        /* renamed from: b, reason: collision with root package name */
        public final Locale f58262b;

        public b(String str, Locale locale) {
            this.f58261a = str;
            this.f58262b = locale;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f58261a.equals(bVar.f58261a) && this.f58262b.equals(bVar.f58262b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f58261a.hashCode() << 3) ^ this.f58262b.hashCode();
        }

        public String toString() {
            return this.f58261a + "/" + this.f58262b;
        }
    }

    public e(g gVar, String str, Locale locale) {
        int i10;
        this.f58256a = null;
        this.f58258c = str;
        this.f58259d = locale;
        HashMap hashMap = new HashMap();
        while (true) {
            String k10 = gVar.k();
            if (k10 == null) {
                this.f58257b = Collections.unmodifiableMap(hashMap);
                return;
            }
            String trim = k10.trim();
            if (!trim.isEmpty() && trim.charAt(0) != '#') {
                int length = trim.length();
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        if (trim.charAt(i11) == '=' && (i10 = i11 + 1) < length) {
                            hashMap.put(trim.substring(0, i11), trim.substring(i10));
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static List c(Locale locale) {
        String a10 = d.a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        LinkedList linkedList = new LinkedList();
        if (!variant.isEmpty()) {
            linkedList.add(new Locale(a10, country, variant));
        }
        if (!country.isEmpty()) {
            linkedList.add(new Locale(a10, country, ""));
        }
        if (!a10.isEmpty()) {
            linkedList.add(new Locale(a10, "", ""));
            if (a10.equals("nn")) {
                linkedList.add(new Locale("nb", "", ""));
            }
        }
        linkedList.add(Locale.ROOT);
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e h(String str, Locale locale) {
        e eVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Base name must not be empty.");
        }
        if (locale == null) {
            throw new NullPointerException("Missing locale.");
        }
        b bVar = new b(str, locale);
        a aVar = (a) f58254e.get(bVar);
        if (aVar != null && (eVar = (e) aVar.get()) != null) {
            return eVar;
        }
        while (true) {
            Reference poll = f58255f.poll();
            if (poll == null) {
                break;
            }
            f58254e.remove(((a) poll).f58260a);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c(locale).iterator();
        while (it.hasNext()) {
            try {
                e i10 = i(str, (Locale) it.next());
                if (i10 != null) {
                    arrayList.add(i10);
                }
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        if (arrayList.isEmpty()) {
            throw new MissingResourceException("Cannot find resource bundle for: " + j(str, locale), e.class.getName(), "");
        }
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            int i11 = size - 1;
            arrayList.set(i11, ((e) arrayList.get(i11)).k((e) arrayList.get(size)));
        }
        e eVar2 = (e) arrayList.get(0);
        f58254e.putIfAbsent(bVar, new a(eVar2, bVar));
        return eVar2;
    }

    public static e i(String str, Locale locale) {
        int indexOf = str.indexOf(47);
        String substring = str.substring(0, indexOf);
        String j10 = j(str.substring(indexOf + 1), locale);
        InputStream e10 = AbstractC5470d.c().e(AbstractC5470d.c().f(substring, e.class, j10), true);
        g gVar = null;
        if (e10 == null) {
            try {
                e10 = AbstractC5470d.c().d(e.class, j10, true);
            } catch (IOException unused) {
                return null;
            }
        }
        if (e10 == null) {
            return null;
        }
        try {
            g gVar2 = new g(e10);
            try {
                e eVar = new e(gVar2, str, locale);
                gVar2.close();
                return eVar;
            } catch (Throwable th2) {
                th = th2;
                gVar = gVar2;
                if (gVar != null) {
                    gVar.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String j(String str, Locale locale) {
        String a10 = d.a(locale);
        String country = locale.getCountry();
        String variant = locale.getVariant();
        StringBuilder sb2 = new StringBuilder(str.length() + 20);
        sb2.append(str.replace('.', '/'));
        if (!a10.isEmpty()) {
            sb2.append('_');
            sb2.append(a10);
            if (!variant.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
                sb2.append('_');
                sb2.append(variant);
            } else if (!country.isEmpty()) {
                sb2.append('_');
                sb2.append(country);
            }
        }
        sb2.append(".properties");
        return sb2.toString();
    }

    public boolean b(String str) {
        if (str == null) {
            throw new NullPointerException("Missing resource key.");
        }
        e eVar = this;
        while (((String) eVar.f58257b.get(str)) == null) {
            eVar = eVar.f58256a;
            if (eVar == null) {
                return false;
            }
        }
        return true;
    }

    public Set d() {
        return this.f58257b.keySet();
    }

    public Locale e() {
        return this.f58259d;
    }

    public String f(String str) {
        if (str == null) {
            throw new NullPointerException("Missing resource key.");
        }
        e eVar = this;
        do {
            String str2 = (String) eVar.f58257b.get(str);
            if (str2 != null) {
                return str2;
            }
            eVar = eVar.f58256a;
        } while (eVar != null);
        throw new MissingResourceException("Cannot find property resource for: " + j(this.f58258c, this.f58259d) + "=>" + str, e.class.getName(), str);
    }

    public Set g() {
        HashSet hashSet = new HashSet(this.f58257b.keySet());
        e eVar = this;
        while (true) {
            eVar = eVar.f58256a;
            if (eVar == null) {
                return Collections.unmodifiableSet(hashSet);
            }
            hashSet.addAll(eVar.f58257b.keySet());
        }
    }

    public final e k(e eVar) {
        return eVar == null ? this : new e(this, eVar);
    }

    public e(e eVar, e eVar2) {
        this.f58256a = eVar2;
        this.f58258c = eVar.f58258c;
        this.f58259d = eVar.f58259d;
        this.f58257b = eVar.f58257b;
    }
}
