package net.time4j.i18n;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.format.j;

/* loaded from: classes5.dex */
public final class f implements net.time4j.format.i {
    private static final Locale[] EMPTY_ARRAY = new Locale[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Set f58263b;

    /* renamed from: c, reason: collision with root package name */
    public static final f f58264c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f58265d;

    static {
        String[] split = e.h("i18n/numbers/symbol", Locale.ROOT).f("locales").split(" ");
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, split);
        f58263b = Collections.unmodifiableSet(hashSet);
        f58264c = new f();
        HashMap hashMap = new HashMap();
        for (j jVar : j.values()) {
            hashMap.put(jVar.i(), jVar);
        }
        f58265d = Collections.unmodifiableMap(hashMap);
    }

    public static e f(Locale locale) {
        if (f58263b.contains(d.a(locale))) {
            return e.h("i18n/numbers/symbol", locale);
        }
        return null;
    }

    public static char g(Locale locale, String str, char c10) {
        e f10 = f(locale);
        return (f10 == null || !f10.b(str)) ? c10 : f10.f(str).charAt(0);
    }

    public static String h(Locale locale, String str, String str2) {
        e f10 = f(locale);
        return (f10 == null || !f10.b(str)) ? str2 : f10.f(str);
    }

    @Override // net.time4j.format.i
    public char a(Locale locale) {
        return g(locale, "separator", net.time4j.format.i.f58080a.a(locale));
    }

    @Override // net.time4j.format.i
    public String b(Locale locale) {
        return h(locale, "plus", net.time4j.format.i.f58080a.b(locale));
    }

    @Override // net.time4j.format.i
    public j c(Locale locale) {
        String h10 = h(locale, "numsys", j.f58081a.i());
        j jVar = (j) f58265d.get(h10);
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Unrecognized number system: " + h10 + " (locale=" + locale + ')');
    }

    @Override // net.time4j.format.i
    public String d(Locale locale) {
        return h(locale, "minus", net.time4j.format.i.f58080a.d(locale));
    }

    @Override // net.time4j.format.i
    public char e(Locale locale) {
        return g(locale, "zero", net.time4j.format.i.f58080a.e(locale));
    }

    @Override // net.time4j.format.i
    public Locale[] getAvailableLocales() {
        return EMPTY_ARRAY;
    }

    public String toString() {
        return "SymbolProviderSPI";
    }
}
