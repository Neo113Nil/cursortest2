package net.time4j.format.expert;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5470d;
import net.time4j.format.a;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;
import oi.InterfaceC5918n;

/* renamed from: net.time4j.format.expert.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5708b implements InterfaceC5908d {

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC5907c f57891g = net.time4j.format.a.e("PLUS_SIGN", String.class);

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC5907c f57892h = net.time4j.format.a.e("MINUS_SIGN", String.class);

    /* renamed from: i, reason: collision with root package name */
    public static final net.time4j.format.i f57893i;

    /* renamed from: j, reason: collision with root package name */
    public static final char f57894j;

    /* renamed from: k, reason: collision with root package name */
    public static final ConcurrentMap f57895k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f57896l;

    /* renamed from: a, reason: collision with root package name */
    public final Map f57897a;

    /* renamed from: b, reason: collision with root package name */
    public final net.time4j.format.a f57898b;

    /* renamed from: c, reason: collision with root package name */
    public final Locale f57899c;

    /* renamed from: d, reason: collision with root package name */
    public final int f57900d;

    /* renamed from: e, reason: collision with root package name */
    public final int f57901e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC5918n f57902f;

    /* renamed from: net.time4j.format.expert.b$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final net.time4j.format.j f57903a;

        /* renamed from: b, reason: collision with root package name */
        public final char f57904b;

        /* renamed from: c, reason: collision with root package name */
        public final char f57905c;

        /* renamed from: d, reason: collision with root package name */
        public final String f57906d;

        /* renamed from: e, reason: collision with root package name */
        public final String f57907e;

        public a(net.time4j.format.j jVar, char c10, char c11, String str, String str2) {
            this.f57903a = jVar;
            this.f57904b = c10;
            this.f57905c = c11;
            this.f57906d = str;
            this.f57907e = str2;
        }
    }

    static {
        net.time4j.format.i iVar = null;
        int i10 = 0;
        for (net.time4j.format.i iVar2 : AbstractC5470d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.getAvailableLocales().length;
            if (length > i10) {
                iVar = iVar2;
                i10 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.i18n.f.f58264c;
        }
        f57893i = iVar;
        char c10 = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? '.' : ',';
        f57894j = c10;
        f57895k = new ConcurrentHashMap();
        f57896l = new a(net.time4j.format.j.f58081a, '0', c10, "+", "-");
    }

    public C5708b(net.time4j.format.a aVar, Locale locale) {
        this(aVar, locale, 0, 0, null);
    }

    public static C5708b d(oi.x xVar, net.time4j.format.a aVar, Locale locale) {
        a.b bVar = new a.b(xVar);
        bVar.d(net.time4j.format.a.f57807f, net.time4j.format.g.SMART);
        bVar.d(net.time4j.format.a.f57808g, net.time4j.format.v.WIDE);
        bVar.d(net.time4j.format.a.f57809h, net.time4j.format.m.FORMAT);
        bVar.b(net.time4j.format.a.f57817p, ' ');
        bVar.f(aVar);
        return new C5708b(bVar.a(), locale).n(locale);
    }

    public static boolean j(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static C5708b k(C5708b c5708b, C5708b c5708b2) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(c5708b2.f57897a);
        hashMap.putAll(c5708b.f57897a);
        return new C5708b(new a.b().f(c5708b2.f57898b).f(c5708b.f57898b).a(), Locale.ROOT, 0, 0, null, hashMap).n(c5708b.f57899c);
    }

    @Override // oi.InterfaceC5908d
    public Object a(InterfaceC5907c interfaceC5907c) {
        return this.f57897a.containsKey(interfaceC5907c.name()) ? interfaceC5907c.type().cast(this.f57897a.get(interfaceC5907c.name())) : this.f57898b.a(interfaceC5907c);
    }

    @Override // oi.InterfaceC5908d
    public Object b(InterfaceC5907c interfaceC5907c, Object obj) {
        return this.f57897a.containsKey(interfaceC5907c.name()) ? interfaceC5907c.type().cast(this.f57897a.get(interfaceC5907c.name())) : this.f57898b.b(interfaceC5907c, obj);
    }

    @Override // oi.InterfaceC5908d
    public boolean c(InterfaceC5907c interfaceC5907c) {
        if (this.f57897a.containsKey(interfaceC5907c.name())) {
            return true;
        }
        return this.f57898b.c(interfaceC5907c);
    }

    public net.time4j.format.a e() {
        return this.f57898b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5708b) {
            C5708b c5708b = (C5708b) obj;
            if (this.f57898b.equals(c5708b.f57898b) && this.f57899c.equals(c5708b.f57899c) && this.f57900d == c5708b.f57900d && this.f57901e == c5708b.f57901e && j(this.f57902f, c5708b.f57902f) && this.f57897a.equals(c5708b.f57897a)) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC5918n f() {
        return this.f57902f;
    }

    public int g() {
        return this.f57900d;
    }

    public Locale h() {
        return this.f57899c;
    }

    public int hashCode() {
        return (this.f57898b.hashCode() * 7) + (this.f57897a.hashCode() * 37);
    }

    public int i() {
        return this.f57901e;
    }

    public C5708b l(net.time4j.format.a aVar) {
        return new C5708b(aVar, this.f57899c, this.f57900d, this.f57901e, this.f57902f, this.f57897a);
    }

    public C5708b m(InterfaceC5907c interfaceC5907c, Object obj) {
        HashMap hashMap = new HashMap(this.f57897a);
        if (obj == null) {
            hashMap.remove(interfaceC5907c.name());
        } else {
            hashMap.put(interfaceC5907c.name(), obj);
        }
        return new C5708b(this.f57898b, this.f57899c, this.f57900d, this.f57901e, this.f57902f, hashMap);
    }

    public C5708b n(Locale locale) {
        String str;
        String str2;
        a.b bVar = new a.b();
        bVar.f(this.f57898b);
        String a10 = net.time4j.i18n.d.a(locale);
        String country = locale.getCountry();
        if (a10.isEmpty() && country.isEmpty()) {
            locale = Locale.ROOT;
            bVar.d(net.time4j.format.a.f57813l, net.time4j.format.j.f58081a);
            bVar.b(net.time4j.format.a.f57816o, f57894j);
            str = "+";
            str2 = "-";
        } else {
            if (!country.isEmpty()) {
                a10 = a10 + "_" + country;
            }
            a aVar = (a) f57895k.get(a10);
            if (aVar == null) {
                try {
                    net.time4j.format.i iVar = f57893i;
                    aVar = new a(iVar.c(locale), iVar.e(locale), iVar.a(locale), iVar.b(locale), iVar.d(locale));
                } catch (RuntimeException unused) {
                    aVar = f57896l;
                }
                a aVar2 = (a) f57895k.putIfAbsent(a10, aVar);
                if (aVar2 != null) {
                    aVar = aVar2;
                }
            }
            bVar.d(net.time4j.format.a.f57813l, aVar.f57903a);
            bVar.b(net.time4j.format.a.f57814m, aVar.f57904b);
            bVar.b(net.time4j.format.a.f57816o, aVar.f57905c);
            str = aVar.f57906d;
            str2 = aVar.f57907e;
        }
        Locale locale2 = locale;
        bVar.h(locale2);
        HashMap hashMap = new HashMap(this.f57897a);
        hashMap.put(f57891g.name(), str);
        hashMap.put(f57892h.name(), str2);
        return new C5708b(bVar.a(), locale2, this.f57900d, this.f57901e, this.f57902f, hashMap);
    }

    public String toString() {
        return C5708b.class.getName() + "[attributes=" + this.f57898b + ",locale=" + this.f57899c + ",level=" + this.f57900d + ",section=" + this.f57901e + ",print-condition=" + this.f57902f + ",other=" + this.f57897a + ']';
    }

    public C5708b(net.time4j.format.a aVar, Locale locale, int i10, int i11, InterfaceC5918n interfaceC5918n) {
        if (aVar == null) {
            throw new NullPointerException("Missing format attributes.");
        }
        this.f57898b = aVar;
        this.f57899c = locale == null ? Locale.ROOT : locale;
        this.f57900d = i10;
        this.f57901e = i11;
        this.f57902f = interfaceC5918n;
        this.f57897a = Collections.EMPTY_MAP;
    }

    public C5708b(net.time4j.format.a aVar, Locale locale, int i10, int i11, InterfaceC5918n interfaceC5918n, Map map) {
        if (aVar != null) {
            this.f57898b = aVar;
            this.f57899c = locale == null ? Locale.ROOT : locale;
            this.f57900d = i10;
            this.f57901e = i11;
            this.f57902f = interfaceC5918n;
            this.f57897a = Collections.unmodifiableMap(map);
            return;
        }
        throw new NullPointerException("Missing format attributes.");
    }
}
