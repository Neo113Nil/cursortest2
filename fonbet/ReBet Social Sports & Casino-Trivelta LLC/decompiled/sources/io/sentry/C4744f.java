package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.EnumC4788n3;
import io.sentry.util.AbstractC4845c;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4744f implements G0, Comparable {

    /* renamed from: k, reason: collision with root package name */
    public static final Map f52039k = Collections.EMPTY_MAP;

    /* renamed from: a, reason: collision with root package name */
    public final Long f52040a;

    /* renamed from: b, reason: collision with root package name */
    public Date f52041b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f52042c;

    /* renamed from: d, reason: collision with root package name */
    public String f52043d;

    /* renamed from: e, reason: collision with root package name */
    public String f52044e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Map f52045f;

    /* renamed from: g, reason: collision with root package name */
    public String f52046g;

    /* renamed from: h, reason: collision with root package name */
    public String f52047h;

    /* renamed from: i, reason: collision with root package name */
    public EnumC4788n3 f52048i;

    /* renamed from: j, reason: collision with root package name */
    public Map f52049j;

    /* renamed from: io.sentry.f$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4744f a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            Date c10 = AbstractC4779m.c();
            String str = null;
            String str2 = null;
            Map map = null;
            String str3 = null;
            String str4 = null;
            EnumC4788n3 enumC4788n3 = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "origin":
                        str4 = interfaceC4809q1.a1();
                        break;
                    case "data":
                        Map b10 = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        if (b10 != null && !b10.isEmpty()) {
                            map = b10;
                            break;
                        }
                        break;
                    case "type":
                        str2 = interfaceC4809q1.a1();
                        break;
                    case "category":
                        str3 = interfaceC4809q1.a1();
                        break;
                    case "timestamp":
                        Date j02 = interfaceC4809q1.j0(iLogger);
                        if (j02 == null) {
                            break;
                        } else {
                            c10 = j02;
                            break;
                        }
                    case "level":
                        try {
                            enumC4788n3 = new EnumC4788n3.a().a(interfaceC4809q1, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.a(EnumC4788n3.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                    case "message":
                        str = interfaceC4809q1.a1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            C4744f c4744f = new C4744f(c10);
            c4744f.f52043d = str;
            c4744f.f52044e = str2;
            if (map != null) {
                c4744f.f52045f = map;
            }
            c4744f.f52046g = str3;
            c4744f.f52047h = str4;
            c4744f.f52048i = enumC4788n3;
            c4744f.B(concurrentHashMap);
            interfaceC4809q1.t();
            return c4744f;
        }
    }

    public C4744f(Date date) {
        this.f52045f = f52039k;
        this.f52042c = Long.valueOf(System.nanoTime());
        this.f52041b = date;
        this.f52040a = null;
    }

    public static C4744f C(String str, String str2, String str3, String str4, Map map) {
        C4744f c4744f = new C4744f();
        c4744f.A("user");
        c4744f.v("ui." + str);
        if (str2 != null) {
            c4744f.w("view.id", str2);
        }
        if (str3 != null) {
            c4744f.w("view.class", str3);
        }
        if (str4 != null) {
            c4744f.w("view.tag", str4);
        }
        for (Map.Entry entry : map.entrySet()) {
            c4744f.w((String) entry.getKey(), entry.getValue());
        }
        c4744f.x(EnumC4788n3.INFO);
        return c4744f;
    }

    public static boolean g(C4744f c4744f, C4744f c4744f2) {
        return c4744f.q().getTime() == c4744f2.q().getTime() && io.sentry.util.w.a(c4744f.f52043d, c4744f2.f52043d) && io.sentry.util.w.a(c4744f.f52044e, c4744f2.f52044e) && io.sentry.util.w.a(c4744f.f52046g, c4744f2.f52046g) && io.sentry.util.w.a(c4744f.f52047h, c4744f2.f52047h) && c4744f.f52048i == c4744f2.f52048i;
    }

    public static int h(C4744f c4744f) {
        return io.sentry.util.w.b(Long.valueOf(c4744f.q().getTime()), c4744f.f52043d, c4744f.f52044e, c4744f.f52046g, c4744f.f52047h, c4744f.f52048i);
    }

    public static boolean s(C4744f c4744f, C4744f c4744f2) {
        return g(c4744f, c4744f2) && io.sentry.util.w.a(c4744f.k("status_code"), c4744f2.k("status_code")) && io.sentry.util.w.a(c4744f.k(EventKeys.URL), c4744f2.k(EventKeys.URL)) && io.sentry.util.w.a(c4744f.k("method"), c4744f2.k("method")) && io.sentry.util.w.a(c4744f.k("http.fragment"), c4744f2.k("http.fragment")) && io.sentry.util.w.a(c4744f.k("http.query"), c4744f2.k("http.query"));
    }

    public static int t(C4744f c4744f) {
        return io.sentry.util.w.b(Long.valueOf(c4744f.q().getTime()), c4744f.f52043d, c4744f.f52044e, c4744f.f52046g, c4744f.f52047h, c4744f.f52048i, c4744f.k("status_code"), c4744f.k(EventKeys.URL), c4744f.k("method"), c4744f.k("http.fragment"), c4744f.k("http.query"));
    }

    public void A(String str) {
        this.f52044e = str;
    }

    public void B(Map map) {
        this.f52049j = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4744f.class != obj.getClass()) {
            return false;
        }
        C4744f c4744f = (C4744f) obj;
        return "http".equals(this.f52044e) ? s(this, c4744f) : g(this, c4744f);
    }

    public int hashCode() {
        return "http".equals(this.f52044e) ? t(this) : h(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(C4744f c4744f) {
        return this.f52042c.compareTo(c4744f.f52042c);
    }

    public String j() {
        return this.f52046g;
    }

    public Object k(String str) {
        if (str == null) {
            return null;
        }
        return this.f52045f.get(str);
    }

    public Map l() {
        return o();
    }

    public EnumC4788n3 m() {
        return this.f52048i;
    }

    public String n() {
        return this.f52043d;
    }

    public final Map o() {
        Map map;
        Map map2 = this.f52045f;
        Map map3 = f52039k;
        if (map2 != map3) {
            return map2;
        }
        synchronized (this) {
            try {
                map = this.f52045f;
                if (map == map3) {
                    map = new ConcurrentHashMap();
                    this.f52045f = map;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    public String p() {
        return this.f52047h;
    }

    public Date q() {
        Date date = this.f52041b;
        if (date != null) {
            return date;
        }
        Long l10 = this.f52040a;
        if (l10 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date d10 = AbstractC4779m.d(l10.longValue());
        this.f52041b = d10;
        return d10;
    }

    public String r() {
        return this.f52044e;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        InterfaceC4813r1 d10 = interfaceC4813r1.d(EventKeys.TIMESTAMP);
        Long l10 = this.f52040a;
        d10.e(l10 != null ? AbstractC4779m.h(l10.longValue()) : AbstractC4779m.g(q()));
        if (this.f52043d != null) {
            interfaceC4813r1.d("message").e(this.f52043d);
        }
        if (this.f52044e != null) {
            interfaceC4813r1.d("type").e(this.f52044e);
        }
        interfaceC4813r1.d(EventKeys.DATA).j(iLogger, this.f52045f);
        if (this.f52046g != null) {
            interfaceC4813r1.d("category").e(this.f52046g);
        }
        if (this.f52047h != null) {
            interfaceC4813r1.d("origin").e(this.f52047h);
        }
        if (this.f52048i != null) {
            interfaceC4813r1.d("level").j(iLogger, this.f52048i);
        }
        Map map = this.f52049j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52049j.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public void u(String str) {
        Map map;
        if (str == null || (map = this.f52045f) == f52039k) {
            return;
        }
        map.remove(str);
    }

    public void v(String str) {
        this.f52046g = str;
    }

    public void w(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            u(str);
        } else {
            o().put(str, obj);
        }
    }

    public void x(EnumC4788n3 enumC4788n3) {
        this.f52048i = enumC4788n3;
    }

    public void y(String str) {
        this.f52043d = str;
    }

    public void z(String str) {
        this.f52047h = str;
    }

    public C4744f(long j10) {
        this.f52045f = f52039k;
        this.f52042c = Long.valueOf(System.nanoTime());
        this.f52040a = Long.valueOf(j10);
        this.f52041b = null;
    }

    public C4744f(C4744f c4744f) {
        Map b10;
        this.f52045f = f52039k;
        this.f52042c = Long.valueOf(System.nanoTime());
        this.f52041b = c4744f.f52041b;
        this.f52040a = c4744f.f52040a;
        this.f52043d = c4744f.f52043d;
        this.f52044e = c4744f.f52044e;
        this.f52046g = c4744f.f52046g;
        this.f52047h = c4744f.f52047h;
        if (!c4744f.f52045f.isEmpty() && (b10 = AbstractC4845c.b(c4744f.f52045f)) != null) {
            this.f52045f = b10;
        }
        this.f52049j = AbstractC4845c.b(c4744f.f52049j);
        this.f52048i = c4744f.f52048i;
    }

    public C4744f() {
        this(System.currentTimeMillis());
    }
}
