package io.sentry;

import com.twilio.voice.EventKeys;
import io.sentry.util.C4843a;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class V3 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final Date f50532a;

    /* renamed from: b, reason: collision with root package name */
    public Date f50533b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f50534c;

    /* renamed from: d, reason: collision with root package name */
    public final String f50535d;

    /* renamed from: e, reason: collision with root package name */
    public final String f50536e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f50537f;

    /* renamed from: g, reason: collision with root package name */
    public b f50538g;

    /* renamed from: h, reason: collision with root package name */
    public Long f50539h;

    /* renamed from: i, reason: collision with root package name */
    public Double f50540i;

    /* renamed from: j, reason: collision with root package name */
    public final String f50541j;

    /* renamed from: k, reason: collision with root package name */
    public String f50542k;

    /* renamed from: l, reason: collision with root package name */
    public final String f50543l;

    /* renamed from: m, reason: collision with root package name */
    public final String f50544m;

    /* renamed from: n, reason: collision with root package name */
    public String f50545n;

    /* renamed from: o, reason: collision with root package name */
    public final C4843a f50546o;

    /* renamed from: p, reason: collision with root package name */
    public Map f50547p;

    public static final class a implements InterfaceC4859w0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC4788n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public V3 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            char c10;
            boolean z10;
            interfaceC4809q1.m();
            Integer num = null;
            ConcurrentHashMap concurrentHashMap = null;
            b bVar = null;
            Date date = null;
            Date date2 = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            Long l10 = null;
            Double d10 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                Integer num2 = num;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                b bVar2 = bVar;
                Date date3 = date;
                Date date4 = date2;
                if (interfaceC4809q1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (bVar2 == null) {
                        throw c("status", iLogger);
                    }
                    if (date3 == null) {
                        throw c("started", iLogger);
                    }
                    if (num2 == null) {
                        throw c("errors", iLogger);
                    }
                    if (str6 == null) {
                        throw c("release", iLogger);
                    }
                    V3 v32 = new V3(bVar2, date3, date4, num2.intValue(), str, str2, bool, l10, d10, str3, str4, str5, str6, str7);
                    v32.o(concurrentHashMap2);
                    interfaceC4809q1.t();
                    return v32;
                }
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02.hashCode()) {
                    case -1992012396:
                        if (f02.equals("duration")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1897185151:
                        if (f02.equals("started")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1294635157:
                        if (f02.equals("errors")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -892481550:
                        if (f02.equals("status")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 99455:
                        if (f02.equals("did")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 113759:
                        if (f02.equals("seq")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 113870:
                        if (f02.equals("sid")) {
                            c10 = 6;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 3237136:
                        if (f02.equals("init")) {
                            c10 = 7;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 55126294:
                        if (f02.equals(EventKeys.TIMESTAMP)) {
                            c10 = '\b';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 93152418:
                        if (f02.equals("attrs")) {
                            c10 = '\t';
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 213717026:
                        if (f02.equals("abnormal_mechanism")) {
                            c10 = '\n';
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                switch (c10) {
                    case 0:
                        d10 = interfaceC4809q1.e0();
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    case 1:
                        date = interfaceC4809q1.j0(iLogger);
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date2 = date4;
                        break;
                    case 2:
                        num = interfaceC4809q1.Q0();
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    case 3:
                        String c11 = io.sentry.util.D.c(interfaceC4809q1.a1());
                        if (c11 != null) {
                            bVar = b.valueOf(c11);
                            num = num2;
                            concurrentHashMap = concurrentHashMap2;
                            date = date3;
                            date2 = date4;
                            break;
                        }
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                    case 4:
                        str = interfaceC4809q1.a1();
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    case 5:
                        l10 = interfaceC4809q1.U0();
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    case 6:
                        String a12 = interfaceC4809q1.a1();
                        if (a12 == null || !(a12.length() == 36 || a12.length() == 32)) {
                            iLogger.c(EnumC4788n3.ERROR, "%s sid is not valid.", a12);
                        } else {
                            str2 = a12;
                        }
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    case 7:
                        bool = interfaceC4809q1.p0();
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    case '\b':
                        date2 = interfaceC4809q1.j0(iLogger);
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        break;
                    case '\t':
                        interfaceC4809q1.m();
                        while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String f03 = interfaceC4809q1.f0();
                            f03.getClass();
                            switch (f03.hashCode()) {
                                case -85904877:
                                    if (f03.equals("environment")) {
                                        z10 = false;
                                        break;
                                    }
                                    z10 = -1;
                                    break;
                                case 1090594823:
                                    if (f03.equals("release")) {
                                        z10 = true;
                                        break;
                                    }
                                    z10 = -1;
                                    break;
                                case 1480014044:
                                    if (f03.equals("ip_address")) {
                                        z10 = 2;
                                        break;
                                    }
                                    z10 = -1;
                                    break;
                                case 1917799825:
                                    if (f03.equals("user_agent")) {
                                        z10 = 3;
                                        break;
                                    }
                                    z10 = -1;
                                    break;
                                default:
                                    z10 = -1;
                                    break;
                            }
                            switch (z10) {
                                case false:
                                    str5 = interfaceC4809q1.a1();
                                    break;
                                case true:
                                    str6 = interfaceC4809q1.a1();
                                    break;
                                case true:
                                    str3 = interfaceC4809q1.a1();
                                    break;
                                case true:
                                    str4 = interfaceC4809q1.a1();
                                    break;
                                default:
                                    interfaceC4809q1.C();
                                    break;
                            }
                        }
                        interfaceC4809q1.t();
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    case '\n':
                        str7 = interfaceC4809q1.a1();
                        num = num2;
                        concurrentHashMap = concurrentHashMap2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                    default:
                        concurrentHashMap = concurrentHashMap2 == null ? new ConcurrentHashMap() : concurrentHashMap2;
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        num = num2;
                        bVar = bVar2;
                        date = date3;
                        date2 = date4;
                        break;
                }
            }
        }
    }

    public enum b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public V3(b bVar, Date date, Date date2, int i10, String str, String str2, Boolean bool, Long l10, Double d10, String str3, String str4, String str5, String str6, String str7) {
        this.f50546o = new C4843a();
        this.f50538g = bVar;
        this.f50532a = date;
        this.f50533b = date2;
        this.f50534c = new AtomicInteger(i10);
        this.f50535d = str;
        this.f50536e = str2;
        this.f50537f = bool;
        this.f50539h = l10;
        this.f50540i = d10;
        this.f50541j = str3;
        this.f50542k = str4;
        this.f50543l = str5;
        this.f50544m = str6;
        this.f50545n = str7;
    }

    public final double a(Date date) {
        return Math.abs(date.getTime() - this.f50532a.getTime()) / 1000.0d;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public V3 clone() {
        return new V3(this.f50538g, this.f50532a, this.f50533b, this.f50534c.get(), this.f50535d, this.f50536e, this.f50537f, this.f50539h, this.f50540i, this.f50541j, this.f50542k, this.f50543l, this.f50544m, this.f50545n);
    }

    public void c() {
        d(AbstractC4779m.c());
    }

    public void d(Date date) {
        InterfaceC4765j0 d10 = this.f50546o.d();
        try {
            this.f50537f = null;
            if (this.f50538g == b.Ok) {
                this.f50538g = b.Exited;
            }
            if (date != null) {
                this.f50533b = date;
            } else {
                this.f50533b = AbstractC4779m.c();
            }
            Date date2 = this.f50533b;
            if (date2 != null) {
                this.f50540i = Double.valueOf(a(date2));
                this.f50539h = Long.valueOf(i(this.f50533b));
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public int e() {
        return this.f50534c.get();
    }

    public String f() {
        return this.f50545n;
    }

    public Boolean g() {
        return this.f50537f;
    }

    public String h() {
        return this.f50544m;
    }

    public final long i(Date date) {
        long time = date.getTime();
        return time < 0 ? Math.abs(time) : time;
    }

    public String j() {
        return this.f50536e;
    }

    public Date k() {
        return this.f50532a;
    }

    public b l() {
        return this.f50538g;
    }

    public boolean m() {
        return this.f50538g != b.Ok;
    }

    public void n() {
        this.f50537f = Boolean.TRUE;
    }

    public void o(Map map) {
        this.f50547p = map;
    }

    public boolean p(b bVar, String str, boolean z10) {
        return q(bVar, str, z10, null);
    }

    public boolean q(b bVar, String str, boolean z10, String str2) {
        boolean z11;
        InterfaceC4765j0 d10 = this.f50546o.d();
        boolean z12 = true;
        if (bVar != null) {
            try {
                this.f50538g = bVar;
                z11 = true;
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } else {
            z11 = false;
        }
        if (str != null) {
            this.f50542k = str;
            z11 = true;
        }
        if (z10) {
            this.f50534c.addAndGet(1);
            z11 = true;
        }
        if (str2 != null) {
            this.f50545n = str2;
        } else {
            z12 = z11;
        }
        if (z12) {
            this.f50537f = null;
            Date c10 = AbstractC4779m.c();
            this.f50533b = c10;
            if (c10 != null) {
                this.f50539h = Long.valueOf(i(c10));
            }
        }
        if (d10 != null) {
            d10.close();
        }
        return z12;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f50536e != null) {
            interfaceC4813r1.d("sid").e(this.f50536e);
        }
        if (this.f50535d != null) {
            interfaceC4813r1.d("did").e(this.f50535d);
        }
        if (this.f50537f != null) {
            interfaceC4813r1.d("init").k(this.f50537f);
        }
        interfaceC4813r1.d("started").j(iLogger, this.f50532a);
        interfaceC4813r1.d("status").j(iLogger, this.f50538g.name().toLowerCase(Locale.ROOT));
        if (this.f50539h != null) {
            interfaceC4813r1.d("seq").i(this.f50539h);
        }
        interfaceC4813r1.d("errors").a(this.f50534c.intValue());
        if (this.f50540i != null) {
            interfaceC4813r1.d("duration").i(this.f50540i);
        }
        if (this.f50533b != null) {
            interfaceC4813r1.d(EventKeys.TIMESTAMP).j(iLogger, this.f50533b);
        }
        if (this.f50545n != null) {
            interfaceC4813r1.d("abnormal_mechanism").j(iLogger, this.f50545n);
        }
        interfaceC4813r1.d("attrs");
        interfaceC4813r1.m();
        interfaceC4813r1.d("release").j(iLogger, this.f50544m);
        if (this.f50543l != null) {
            interfaceC4813r1.d("environment").j(iLogger, this.f50543l);
        }
        if (this.f50541j != null) {
            interfaceC4813r1.d("ip_address").j(iLogger, this.f50541j);
        }
        if (this.f50542k != null) {
            interfaceC4813r1.d("user_agent").j(iLogger, this.f50542k);
        }
        interfaceC4813r1.t();
        Map map = this.f50547p;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f50547p.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public V3(String str, io.sentry.protocol.F f10, String str2, String str3) {
        this(b.Ok, AbstractC4779m.c(), AbstractC4779m.c(), 0, str, T3.a(), Boolean.TRUE, null, null, f10 != null ? f10.j() : null, null, str2, str3, null);
    }
}
