package net.time4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import li.AbstractC5470d;
import li.InterfaceC5471e;

/* loaded from: classes5.dex */
public final class J {
    private static final InterfaceC5729w[] STD_UNITS;
    private static final InterfaceC5729w[] TSP_UNITS;

    /* renamed from: k, reason: collision with root package name */
    public static final net.time4j.format.i f57626k;

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentMap f57627l;

    /* renamed from: m, reason: collision with root package name */
    public static final Set f57628m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f57629n;

    /* renamed from: a, reason: collision with root package name */
    public final net.time4j.format.p f57630a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f57631b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5471e f57632c;

    /* renamed from: d, reason: collision with root package name */
    public final char f57633d;

    /* renamed from: e, reason: collision with root package name */
    public final String f57634e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC5729w f57635f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f57636g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f57637h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57638i;

    /* renamed from: j, reason: collision with root package name */
    public final String f57639j;

    static {
        net.time4j.format.i iVar = null;
        int i10 = 0;
        for (net.time4j.format.i iVar2 : AbstractC5470d.c().g(net.time4j.format.i.class)) {
            int length = iVar2.getAvailableLocales().length;
            if (length >= i10) {
                iVar = iVar2;
                i10 = length;
            }
        }
        if (iVar == null) {
            iVar = net.time4j.format.i.f58080a;
        }
        f57626k = iVar;
        f57627l = new ConcurrentHashMap();
        EnumC5706f enumC5706f = EnumC5706f.f57794d;
        EnumC5706f enumC5706f2 = EnumC5706f.f57796f;
        EnumC5706f enumC5706f3 = EnumC5706f.f57798h;
        EnumC5714g enumC5714g = EnumC5714g.f58143a;
        EnumC5714g enumC5714g2 = EnumC5714g.f58144b;
        EnumC5714g enumC5714g3 = EnumC5714g.f58145c;
        InterfaceC5729w[] interfaceC5729wArr = {enumC5706f, enumC5706f2, EnumC5706f.f57797g, enumC5706f3, enumC5714g, enumC5714g2, enumC5714g3};
        STD_UNITS = interfaceC5729wArr;
        TSP_UNITS = new InterfaceC5729w[]{enumC5706f, enumC5706f2, enumC5706f3, enumC5714g, enumC5714g2, enumC5714g3};
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, interfaceC5729wArr);
        hashSet.add(EnumC5714g.f58148f);
        f57628m = Collections.unmodifiableSet(hashSet);
        f57629n = 63072000L;
    }

    public J(Locale locale, InterfaceC5471e interfaceC5471e, char c10, String str, InterfaceC5729w interfaceC5729w, boolean z10, boolean z11, String str2, String str3) {
        if (interfaceC5729w == null) {
            throw new NullPointerException("Missing zero time unit.");
        }
        if (interfaceC5471e == null) {
            throw new NullPointerException("Missing reference clock.");
        }
        this.f57630a = net.time4j.format.p.f(locale, net.time4j.format.k.CARDINALS);
        this.f57631b = locale;
        this.f57632c = interfaceC5471e;
        this.f57633d = c10;
        this.f57635f = interfaceC5729w;
        this.f57634e = str;
        this.f57636g = z10;
        this.f57637h = z11;
        this.f57638i = str2;
        this.f57639j = str3;
    }

    public static J b(Locale locale) {
        ConcurrentMap concurrentMap = f57627l;
        J j10 = (J) concurrentMap.get(locale);
        if (j10 != null) {
            return j10;
        }
        P p10 = P.f57651e;
        net.time4j.format.i iVar = f57626k;
        J j11 = new J(locale, p10, iVar.e(locale), iVar.d(locale), EnumC5714g.f58145c, false, false, null, null);
        J j12 = (J) concurrentMap.putIfAbsent(locale, j11);
        return j12 != null ? j12 : j11;
    }

    public Locale a() {
        return this.f57631b;
    }

    public String c() {
        return T.h(a()).b();
    }
}
