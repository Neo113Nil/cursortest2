package io.sentry;

import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h3 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f67954a;

    /* renamed from: b, reason: collision with root package name */
    private Date f67955b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f67956c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67957d;

    /* renamed from: e, reason: collision with root package name */
    private final String f67958e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f67959f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private b f67960g;

    /* renamed from: h, reason: collision with root package name */
    private Long f67961h;

    /* renamed from: i, reason: collision with root package name */
    private Double f67962i;

    /* renamed from: j, reason: collision with root package name */
    private final String f67963j;

    /* renamed from: k, reason: collision with root package name */
    private String f67964k;

    /* renamed from: l, reason: collision with root package name */
    private final String f67965l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final String f67966m;

    /* renamed from: n, reason: collision with root package name */
    private String f67967n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67968o = new io.sentry.util.a();

    /* renamed from: p, reason: collision with root package name */
    private ConcurrentHashMap f67969p;

    public static final class a implements InterfaceC7174n0<h3> {
        private static IllegalStateException b(String str, ILogger iLogger) {
            String b11 = B0.A0.b("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(b11);
            iLogger.a(I2.ERROR, b11, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final h3 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            char c11;
            char c12;
            interfaceC7131c1.beginObject();
            Integer num = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVar = null;
            Date date = null;
            Date date2 = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Long l11 = null;
            Double d11 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -1992012396:
                        if (nextName.equals("duration")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1897185151:
                        if (nextName.equals("started")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1294635157:
                        if (nextName.equals("errors")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -892481550:
                        if (nextName.equals("status")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 99455:
                        if (nextName.equals("did")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 113759:
                        if (nextName.equals("seq")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 113870:
                        if (nextName.equals("sid")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3237136:
                        if (nextName.equals("init")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 55126294:
                        if (nextName.equals("timestamp")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 93152418:
                        if (nextName.equals("attrs")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 213717026:
                        if (nextName.equals("abnormal_mechanism")) {
                            c11 = '\n';
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        d11 = interfaceC7131c1.g1();
                        break;
                    case 1:
                        date = interfaceC7131c1.M(iLogger);
                        break;
                    case 2:
                        num = interfaceC7131c1.A1();
                        break;
                    case 3:
                        String c13 = io.sentry.util.w.c(interfaceC7131c1.k0());
                        if (c13 == null) {
                            break;
                        } else {
                            bVar = b.valueOf(c13);
                            break;
                        }
                    case 4:
                        str = interfaceC7131c1.k0();
                        break;
                    case 5:
                        l11 = interfaceC7131c1.D1();
                        break;
                    case 6:
                        String k02 = interfaceC7131c1.k0();
                        if (k02 != null && (k02.length() == 36 || k02.length() == 32)) {
                            str2 = k02;
                            break;
                        } else {
                            iLogger.c(I2.ERROR, "%s sid is not valid.", k02);
                            break;
                        }
                    case 7:
                        bool = interfaceC7131c1.P();
                        break;
                    case '\b':
                        date2 = interfaceC7131c1.M(iLogger);
                        break;
                    case '\t':
                        interfaceC7131c1.beginObject();
                        while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String nextName2 = interfaceC7131c1.nextName();
                            nextName2.getClass();
                            switch (nextName2.hashCode()) {
                                case -85904877:
                                    if (nextName2.equals("environment")) {
                                        c12 = 0;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 1090594823:
                                    if (nextName2.equals("release")) {
                                        c12 = 1;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 1480014044:
                                    if (nextName2.equals("ip_address")) {
                                        c12 = 2;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 1917799825:
                                    if (nextName2.equals("user_agent")) {
                                        c12 = 3;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                default:
                                    c12 = 65535;
                                    break;
                            }
                            switch (c12) {
                                case 0:
                                    str5 = interfaceC7131c1.k0();
                                    break;
                                case 1:
                                    str6 = interfaceC7131c1.k0();
                                    break;
                                case 2:
                                    str3 = interfaceC7131c1.k0();
                                    break;
                                case 3:
                                    str4 = interfaceC7131c1.k0();
                                    break;
                                default:
                                    interfaceC7131c1.skipValue();
                                    break;
                            }
                        }
                        interfaceC7131c1.endObject();
                        break;
                    case '\n':
                        str7 = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            if (bVar == null) {
                throw b("status", iLogger);
            }
            if (date == null) {
                throw b("started", iLogger);
            }
            if (num == null) {
                throw b("errors", iLogger);
            }
            if (str6 == null) {
                throw b("release", iLogger);
            }
            ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            h3 h3Var = new h3(bVar, date, date2, num.intValue(), str, str2, bool, l11, d11, str3, str4, str5, str6, str7);
            h3Var.l(concurrentHashMap2);
            interfaceC7131c1.endObject();
            return h3Var;
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public h3(@NotNull b bVar, @NotNull Date date, Date date2, int i11, String str, String str2, Boolean bool, Long l11, Double d11, String str3, String str4, String str5, @NotNull String str6, String str7) {
        this.f67960g = bVar;
        this.f67954a = date;
        this.f67955b = date2;
        this.f67956c = new AtomicInteger(i11);
        this.f67957d = str;
        this.f67958e = str2;
        this.f67959f = bool;
        this.f67961h = l11;
        this.f67962i = d11;
        this.f67963j = str3;
        this.f67964k = str4;
        this.f67965l = str5;
        this.f67966m = str6;
        this.f67967n = str7;
    }

    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final h3 clone() {
        return new h3(this.f67960g, this.f67954a, this.f67955b, this.f67956c.get(), this.f67957d, this.f67958e, this.f67959f, this.f67961h, this.f67962i, this.f67963j, this.f67964k, this.f67965l, this.f67966m, this.f67967n);
    }

    public final void b(Date date) {
        InterfaceC7097a0 a11 = this.f67968o.a();
        try {
            this.f67959f = null;
            if (this.f67960g == b.Ok) {
                this.f67960g = b.Exited;
            }
            if (date != null) {
                this.f67955b = date;
            } else {
                this.f67955b = C7165l.b();
            }
            if (this.f67955b != null) {
                this.f67962i = Double.valueOf(Math.abs(r6.getTime() - this.f67954a.getTime()) / 1000.0d);
                long time = this.f67955b.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f67961h = Long.valueOf(time);
            }
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final int c() {
        return this.f67956c.get();
    }

    public final String d() {
        return this.f67967n;
    }

    public final Boolean e() {
        return this.f67959f;
    }

    @NotNull
    public final String f() {
        return this.f67966m;
    }

    public final String g() {
        return this.f67958e;
    }

    public final Date h() {
        Date date = this.f67954a;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    @NotNull
    public final b i() {
        return this.f67960g;
    }

    public final boolean j() {
        return this.f67960g != b.Ok;
    }

    public final void k() {
        this.f67959f = Boolean.TRUE;
    }

    public final void l(Map<String, Object> map) {
        this.f67969p = (ConcurrentHashMap) map;
    }

    public final boolean m(b bVar, String str, boolean z11, String str2) {
        boolean z12;
        InterfaceC7097a0 a11 = this.f67968o.a();
        boolean z13 = true;
        if (bVar != null) {
            try {
                this.f67960g = bVar;
                z12 = true;
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            z12 = false;
        }
        if (str != null) {
            this.f67964k = str;
            z12 = true;
        }
        if (z11) {
            this.f67956c.addAndGet(1);
            z12 = true;
        }
        if (str2 != null) {
            this.f67967n = str2;
        } else {
            z13 = z12;
        }
        if (z13) {
            this.f67959f = null;
            Date b11 = C7165l.b();
            this.f67955b = b11;
            if (b11 != null) {
                long time = b11.getTime();
                if (time < 0) {
                    time = Math.abs(time);
                }
                this.f67961h = Long.valueOf(time);
            }
        }
        a11.close();
        return z13;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        String str = this.f67958e;
        if (str != null) {
            c7212v0.g("sid");
            c7212v0.p(str);
        }
        String str2 = this.f67957d;
        if (str2 != null) {
            c7212v0.g("did");
            c7212v0.p(str2);
        }
        if (this.f67959f != null) {
            c7212v0.g("init");
            c7212v0.n(this.f67959f);
        }
        c7212v0.g("started");
        c7212v0.m(iLogger, this.f67954a);
        c7212v0.g("status");
        c7212v0.m(iLogger, this.f67960g.name().toLowerCase(Locale.ROOT));
        if (this.f67961h != null) {
            c7212v0.g("seq");
            c7212v0.o(this.f67961h);
        }
        c7212v0.g("errors");
        c7212v0.l(this.f67956c.intValue());
        if (this.f67962i != null) {
            c7212v0.g("duration");
            c7212v0.o(this.f67962i);
        }
        if (this.f67955b != null) {
            c7212v0.g("timestamp");
            c7212v0.m(iLogger, this.f67955b);
        }
        if (this.f67967n != null) {
            c7212v0.g("abnormal_mechanism");
            c7212v0.m(iLogger, this.f67967n);
        }
        c7212v0.g("attrs");
        c7212v0.b();
        c7212v0.g("release");
        c7212v0.m(iLogger, this.f67966m);
        String str3 = this.f67965l;
        if (str3 != null) {
            c7212v0.g("environment");
            c7212v0.m(iLogger, str3);
        }
        String str4 = this.f67963j;
        if (str4 != null) {
            c7212v0.g("ip_address");
            c7212v0.m(iLogger, str4);
        }
        if (this.f67964k != null) {
            c7212v0.g("user_agent");
            c7212v0.m(iLogger, this.f67964k);
        }
        c7212v0.d();
        ConcurrentHashMap concurrentHashMap = this.f67969p;
        if (concurrentHashMap != null) {
            for (String str5 : concurrentHashMap.keySet()) {
                C7137e.b(this.f67969p, str5, c7212v0, str5, iLogger);
            }
        }
        c7212v0.d();
    }
}
