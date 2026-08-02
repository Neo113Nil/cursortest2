package net.time4j.format;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import li.AbstractC5470d;

/* loaded from: classes5.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f58106a;

    /* renamed from: b, reason: collision with root package name */
    public static final p f58107b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f58108c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f58109d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f58110e;

    /* renamed from: f, reason: collision with root package name */
    public static final Map f58111f;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$NumberType;

        static {
            int[] iArr = new int[k.values().length];
            $SwitchMap$net$time4j$format$NumberType = iArr;
            try {
                iArr[k.CARDINALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$NumberType[k.ORDINALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements o {
        public b() {
        }

        @Override // net.time4j.format.o
        public p a(Locale locale, k kVar) {
            boolean equals = locale.getLanguage().equals("en");
            int i10 = a.$SwitchMap$net$time4j$format$NumberType[kVar.ordinal()];
            if (i10 == 1) {
                return equals ? p.f58106a : p.f58107b;
            }
            if (i10 == 2) {
                return equals ? p.f58108c : p.f58109d;
            }
            throw new UnsupportedOperationException(kVar.name());
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static class c extends p {

        /* renamed from: g, reason: collision with root package name */
        public final k f58112g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f58113h;

        public /* synthetic */ c(k kVar, boolean z10, a aVar) {
            this(kVar, z10);
        }

        public c(k kVar, boolean z10) {
            this.f58112g = kVar;
            this.f58113h = z10;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final o f58114a;

        static {
            Iterator it = AbstractC5470d.c().g(o.class).iterator();
            a aVar = null;
            o oVar = it.hasNext() ? (o) it.next() : null;
            if (oVar == null) {
                oVar = new b(aVar);
            }
            f58114a = oVar;
        }
    }

    static {
        k kVar = k.CARDINALS;
        boolean z10 = true;
        a aVar = null;
        f58106a = new c(kVar, z10, aVar);
        boolean z11 = false;
        f58107b = new c(kVar, z11, aVar);
        k kVar2 = k.ORDINALS;
        f58108c = new c(kVar2, z10, aVar);
        f58109d = new c(kVar2, z11, aVar);
        f58110e = new ConcurrentHashMap();
        f58111f = new ConcurrentHashMap();
    }

    public static Map e(k kVar) {
        int i10 = a.$SwitchMap$net$time4j$format$NumberType[kVar.ordinal()];
        if (i10 == 1) {
            return f58110e;
        }
        if (i10 == 2) {
            return f58111f;
        }
        throw new UnsupportedOperationException(kVar.name());
    }

    public static p f(Locale locale, k kVar) {
        Map e10 = e(kVar);
        if (!e10.isEmpty()) {
            r2 = locale.getCountry().equals("") ? null : (p) e10.get(g(locale));
            if (r2 == null) {
                r2 = (p) e10.get(locale.getLanguage());
            }
        }
        return r2 == null ? d.f58114a.a(locale, kVar) : r2;
    }

    public static String g(Locale locale) {
        return locale.getLanguage() + '_' + locale.getCountry();
    }
}
