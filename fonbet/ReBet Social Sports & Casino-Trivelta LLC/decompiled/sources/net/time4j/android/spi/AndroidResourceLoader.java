package net.time4j.android.spi;

import android.content.Context;
import android.text.format.DateFormat;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import ki.InterfaceC5261b;
import li.AbstractC5470d;
import net.time4j.format.o;
import net.time4j.format.u;
import net.time4j.format.x;
import net.time4j.format.y;
import net.time4j.tz.r;
import net.time4j.tz.s;
import ni.C5739b;
import pi.InterfaceC6083c;
import qi.InterfaceC6182c;
import qi.InterfaceC6184e;
import ri.C6303a;
import ri.C6304b;

/* loaded from: classes5.dex */
public class AndroidResourceLoader extends AbstractC5470d {

    /* renamed from: f, reason: collision with root package name */
    public static final Map f57708f;

    /* renamed from: g, reason: collision with root package name */
    public static final Set f57709g;

    /* renamed from: d, reason: collision with root package name */
    public Context f57710d = null;

    /* renamed from: e, reason: collision with root package name */
    public List f57711e = Collections.EMPTY_LIST;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$DisplayMode;

        static {
            int[] iArr = new int[net.time4j.format.e.values().length];
            $SwitchMap$net$time4j$format$DisplayMode = iArr;
            try {
                iArr[net.time4j.format.e.FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$DisplayMode[net.time4j.format.e.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$format$DisplayMode[net.time4j.format.e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b implements InterfaceC6083c {
        public b() {
        }

        @Override // net.time4j.format.f
        public String a(net.time4j.format.e eVar, Locale locale) {
            return i(eVar, locale, false);
        }

        public final InterfaceC6083c b() {
            return c.f57713a;
        }

        public final String c(String str) {
            StringBuilder sb2 = new StringBuilder();
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                if (charAt == '\'') {
                    sb2.append(charAt);
                    while (true) {
                        i10++;
                        if (i10 >= length) {
                            break;
                        }
                        char charAt2 = str.charAt(i10);
                        if (charAt2 == '\'') {
                            sb2.append(charAt2);
                            int i11 = i10 + 1;
                            if (i11 < length && str.charAt(i11) == '\'') {
                                i10 = i11;
                            }
                        }
                        sb2.append(charAt2);
                    }
                } else if (charAt == 'h') {
                    sb2.append('H');
                } else if (charAt != 'a') {
                    sb2.append(charAt);
                }
                i10++;
            }
            return sb2.toString();
        }

        @Override // net.time4j.format.f
        public String e(net.time4j.format.e eVar, Locale locale) {
            return b().e(eVar, locale);
        }

        @Override // pi.InterfaceC6083c
        public String i(net.time4j.format.e eVar, Locale locale, boolean z10) {
            String i10 = b().i(eVar, locale, z10);
            if (Locale.getDefault().equals(locale)) {
                net.time4j.format.e eVar2 = net.time4j.format.e.SHORT;
                boolean z11 = (eVar != eVar2 ? b().a(eVar2, locale) : i10).indexOf(97) == -1;
                boolean is24HourFormat = DateFormat.is24HourFormat(AndroidResourceLoader.this.f57710d);
                if (is24HourFormat != z11) {
                    if (is24HourFormat) {
                        return c(i10).replace("  ", " ").trim();
                    }
                    String str = locale.getLanguage().equals("en") ? com.google.crypto.tink.integration.android.b.f37029b : "B";
                    int i11 = a.$SwitchMap$net$time4j$format$DisplayMode[eVar.ordinal()];
                    if (i11 == 1) {
                        return "h:mm:ss " + str + " zzzz";
                    }
                    if (i11 == 2) {
                        return "h:mm:ss " + str + " z";
                    }
                    if (i11 != 3) {
                        return "h:mm " + str;
                    }
                    return "h:mm:ss " + str;
                }
            }
            return i10;
        }

        @Override // net.time4j.format.f
        public String k(net.time4j.format.e eVar, net.time4j.format.e eVar2, Locale locale) {
            return b().k(eVar, eVar2, locale);
        }

        public /* synthetic */ b(AndroidResourceLoader androidResourceLoader, a aVar) {
            this();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final net.time4j.i18n.c f57713a;

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f57714b;

        /* renamed from: c, reason: collision with root package name */
        public static final Iterable f57715c;

        /* renamed from: d, reason: collision with root package name */
        public static final Iterable f57716d;

        static {
            net.time4j.i18n.c cVar = new net.time4j.i18n.c();
            f57713a = cVar;
            f57714b = Collections.singleton(net.time4j.i18n.f.f58264c);
            f57715c = Collections.singletonList(new net.time4j.i18n.i());
            f57716d = Collections.unmodifiableList(Arrays.asList(cVar, new C5739b()));
        }
    }

    public static final class d implements Iterable {
        public d() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return l.f57718b.iterator();
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e implements Iterable {
        public e() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return m.f57721c.iterator();
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    public static final class f implements Iterable {
        public f() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return c.f57714b.iterator();
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public static final class g implements Iterable {
        public g() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return l.f57717a.iterator();
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static final class h implements Iterable {
        public h() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return c.f57716d.iterator();
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    public static final class i implements Iterable {
        public i() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return c.f57715c.iterator();
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    public static final class j implements Iterable {
        public j() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return m.f57720b.iterator();
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public static final class k implements Iterable {
        public k() {
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return m.f57719a.iterator();
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterable f57717a = Collections.singleton(new net.time4j.i18n.a());

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f57718b = Arrays.asList(new net.time4j.i18n.b(), new ni.c());
    }

    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterable f57719a;

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f57720b;

        /* renamed from: c, reason: collision with root package name */
        public static final Iterable f57721c;

        static {
            InterfaceC6182c interfaceC6182c;
            Set singleton = Collections.singleton(new C6303a());
            f57719a = singleton;
            f57720b = Collections.singleton(new C6304b());
            Iterator it = singleton.iterator();
            while (true) {
                if (!it.hasNext()) {
                    interfaceC6182c = null;
                    break;
                }
                r rVar = (r) it.next();
                if (rVar instanceof InterfaceC6182c) {
                    interfaceC6182c = (InterfaceC6182c) InterfaceC6182c.class.cast(rVar);
                    break;
                }
            }
            if (interfaceC6182c == null) {
                f57721c = Collections.EMPTY_LIST;
            } else {
                f57721c = Collections.singleton(interfaceC6182c);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        a aVar = null;
        hashMap.put(u.class, new h(aVar));
        hashMap.put(r.class, new k(aVar));
        hashMap.put(s.class, new j(aVar));
        hashMap.put(InterfaceC6182c.class, new e(aVar));
        hashMap.put(oi.s.class, new d(aVar));
        hashMap.put(net.time4j.format.i.class, new f(aVar));
        hashMap.put(o.class, new g(aVar));
        hashMap.put(x.class, Collections.singleton(new net.time4j.i18n.h()));
        hashMap.put(y.class, new i(aVar));
        hashMap.put(InterfaceC6184e.class, Collections.singleton(new net.time4j.android.spi.a()));
        f57708f = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add("i18n");
        hashSet.add("calendar");
        hashSet.add("olson");
        hashSet.add("tzdata");
        f57709g = Collections.unmodifiableSet(hashSet);
    }

    public static Object i(Object obj) {
        return obj;
    }

    @Override // li.AbstractC5470d
    public InputStream e(URI uri, boolean z10) {
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isAbsolute()) {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setUseCaches(false);
                return openConnection.getInputStream();
            }
            Context context = this.f57710d;
            if (context != null) {
                return context.getAssets().open(uri.toString());
            }
            throw new IllegalStateException("'ApplicationStarter.initialize(context)' must be called first at app start.");
        } catch (IOException | RuntimeException unused) {
            return null;
        }
    }

    @Override // li.AbstractC5470d
    public URI f(String str, Class cls, String str2) {
        try {
            if (!f57709g.contains(str)) {
                URL resource = cls.getClassLoader().getResource(str2);
                if (resource != null) {
                    return resource.toURI();
                }
                return null;
            }
            return new URI("net/time4j/" + str + '/' + str2);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    @Override // li.AbstractC5470d
    public Iterable g(Class cls) {
        Object obj = (Iterable) f57708f.get(cls);
        if (obj == null) {
            if (cls != net.time4j.format.f.class) {
                return ServiceLoader.load(cls, cls.getClassLoader());
            }
            obj = this.f57711e;
        }
        return (Iterable) i(obj);
    }

    public void j(Context context, InterfaceC5261b interfaceC5261b) {
        if (context == null) {
            throw new NullPointerException("Missing Android-context.");
        }
        this.f57710d = context;
        this.f57711e = Collections.singletonList(new b(this, null));
    }
}
