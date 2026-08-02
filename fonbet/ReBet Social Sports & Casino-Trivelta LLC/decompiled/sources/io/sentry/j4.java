package io.sentry;

import io.sentry.protocol.u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class j4 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.u f52133a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52135c;

    /* renamed from: d, reason: collision with root package name */
    public final String f52136d;

    /* renamed from: e, reason: collision with root package name */
    public final String f52137e;

    /* renamed from: f, reason: collision with root package name */
    public final String f52138f;

    /* renamed from: g, reason: collision with root package name */
    public final String f52139g;

    /* renamed from: h, reason: collision with root package name */
    public final String f52140h;

    /* renamed from: i, reason: collision with root package name */
    public final String f52141i;

    /* renamed from: j, reason: collision with root package name */
    public final io.sentry.protocol.u f52142j;

    /* renamed from: k, reason: collision with root package name */
    public Map f52143k;

    public static final class a implements InterfaceC4859w0 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.b(EnumC4788n3.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j4 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.u uVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            io.sentry.protocol.u uVar2 = null;
            String str8 = null;
            while (true) {
                io.sentry.protocol.u uVar3 = uVar;
                String str9 = str;
                if (interfaceC4809q1.peek() != io.sentry.vendor.gson.stream.b.NAME) {
                    if (uVar3 == null) {
                        throw c("trace_id", iLogger);
                    }
                    if (str9 == null) {
                        throw c("public_key", iLogger);
                    }
                    j4 j4Var = new j4(uVar3, str9, str2, str3, str4, str5, str6, str7, uVar2, str8);
                    j4Var.c(concurrentHashMap);
                    interfaceC4809q1.t();
                    return j4Var;
                }
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "replay_id":
                        uVar2 = new u.a().a(interfaceC4809q1, iLogger);
                        uVar = uVar3;
                        str = str9;
                        break;
                    case "user_id":
                        str4 = interfaceC4809q1.a1();
                        uVar = uVar3;
                        str = str9;
                        break;
                    case "environment":
                        str3 = interfaceC4809q1.a1();
                        uVar = uVar3;
                        str = str9;
                        break;
                    case "sample_rand":
                        str8 = interfaceC4809q1.a1();
                        uVar = uVar3;
                        str = str9;
                        break;
                    case "sample_rate":
                        str6 = interfaceC4809q1.a1();
                        uVar = uVar3;
                        str = str9;
                        break;
                    case "release":
                        str2 = interfaceC4809q1.a1();
                        uVar = uVar3;
                        str = str9;
                        break;
                    case "trace_id":
                        uVar = new u.a().a(interfaceC4809q1, iLogger);
                        str = str9;
                        break;
                    case "sampled":
                        str7 = interfaceC4809q1.a1();
                        uVar = uVar3;
                        str = str9;
                        break;
                    case "public_key":
                        str = interfaceC4809q1.M0();
                        uVar = uVar3;
                        break;
                    case "transaction":
                        str5 = interfaceC4809q1.a1();
                        uVar = uVar3;
                        str = str9;
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        uVar = uVar3;
                        str = str9;
                        break;
                }
            }
        }
    }

    public j4(io.sentry.protocol.u uVar, String str) {
        this(uVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.f52140h;
    }

    public String b() {
        return this.f52139g;
    }

    public void c(Map map) {
        this.f52143k = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("trace_id").j(iLogger, this.f52133a);
        interfaceC4813r1.d("public_key").e(this.f52134b);
        if (this.f52135c != null) {
            interfaceC4813r1.d("release").e(this.f52135c);
        }
        if (this.f52136d != null) {
            interfaceC4813r1.d("environment").e(this.f52136d);
        }
        if (this.f52137e != null) {
            interfaceC4813r1.d("user_id").e(this.f52137e);
        }
        if (this.f52138f != null) {
            interfaceC4813r1.d("transaction").e(this.f52138f);
        }
        if (this.f52139g != null) {
            interfaceC4813r1.d("sample_rate").e(this.f52139g);
        }
        if (this.f52140h != null) {
            interfaceC4813r1.d("sample_rand").e(this.f52140h);
        }
        if (this.f52141i != null) {
            interfaceC4813r1.d("sampled").e(this.f52141i);
        }
        if (this.f52142j != null) {
            interfaceC4813r1.d("replay_id").j(iLogger, this.f52142j);
        }
        Map map = this.f52143k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52143k.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public j4(io.sentry.protocol.u uVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.u uVar2) {
        this(uVar, str, str2, str3, str4, str5, str6, str7, uVar2, null);
    }

    public j4(io.sentry.protocol.u uVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.u uVar2, String str8) {
        this.f52133a = uVar;
        this.f52134b = str;
        this.f52135c = str2;
        this.f52136d = str3;
        this.f52137e = str4;
        this.f52138f = str5;
        this.f52139g = str6;
        this.f52141i = str7;
        this.f52142j = uVar2;
        this.f52140h = str8;
    }
}
