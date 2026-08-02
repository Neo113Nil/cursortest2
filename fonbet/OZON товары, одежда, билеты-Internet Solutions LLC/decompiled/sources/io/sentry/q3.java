package io.sentry;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class q3 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.protocol.t f68393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f68394b;

    /* renamed from: c, reason: collision with root package name */
    private final String f68395c;

    /* renamed from: d, reason: collision with root package name */
    private final String f68396d;

    /* renamed from: e, reason: collision with root package name */
    private final String f68397e;

    /* renamed from: f, reason: collision with root package name */
    private final String f68398f;

    /* renamed from: g, reason: collision with root package name */
    private final String f68399g;

    /* renamed from: h, reason: collision with root package name */
    private final String f68400h;

    /* renamed from: i, reason: collision with root package name */
    private final String f68401i;

    /* renamed from: j, reason: collision with root package name */
    private final io.sentry.protocol.t f68402j;

    /* renamed from: k, reason: collision with root package name */
    private ConcurrentHashMap f68403k;

    public static final class a implements InterfaceC7174n0<q3> {
        private static IllegalStateException b(String str, ILogger iLogger) {
            String b11 = B0.A0.b("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(b11);
            iLogger.a(I2.ERROR, b11, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final q3 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            char c11;
            interfaceC7131c1.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            io.sentry.protocol.t tVar = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            io.sentry.protocol.t tVar2 = null;
            String str8 = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -454767501:
                        if (nextName.equals("replay_id")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -147132913:
                        if (nextName.equals("user_id")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -85904877:
                        if (nextName.equals("environment")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 153192858:
                        if (nextName.equals("sample_rand")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 153193045:
                        if (nextName.equals("sample_rate")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1090594823:
                        if (nextName.equals("release")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1270300245:
                        if (nextName.equals("trace_id")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1864843258:
                        if (nextName.equals("sampled")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1904812937:
                        if (nextName.equals("public_key")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2141246174:
                        if (nextName.equals("transaction")) {
                            c11 = '\t';
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
                        tVar2 = new io.sentry.protocol.t(interfaceC7131c1.nextString());
                        break;
                    case 1:
                        str4 = interfaceC7131c1.k0();
                        break;
                    case 2:
                        str3 = interfaceC7131c1.k0();
                        break;
                    case 3:
                        str8 = interfaceC7131c1.k0();
                        break;
                    case 4:
                        str6 = interfaceC7131c1.k0();
                        break;
                    case 5:
                        str2 = interfaceC7131c1.k0();
                        break;
                    case 6:
                        tVar = new io.sentry.protocol.t(interfaceC7131c1.nextString());
                        break;
                    case 7:
                        str7 = interfaceC7131c1.k0();
                        break;
                    case '\b':
                        str = interfaceC7131c1.nextString();
                        break;
                    case '\t':
                        str5 = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            if (tVar == null) {
                throw b("trace_id", iLogger);
            }
            if (str == null) {
                throw b("public_key", iLogger);
            }
            q3 q3Var = new q3(tVar, str, str2, str3, str4, str5, str6, str7, tVar2, str8);
            q3Var.c(concurrentHashMap);
            interfaceC7131c1.endObject();
            return q3Var;
        }
    }

    q3(@NotNull io.sentry.protocol.t tVar) {
        this(tVar, "", null, null, null, null, null, null, null, null);
    }

    public final String a() {
        return this.f68400h;
    }

    public final String b() {
        return this.f68399g;
    }

    public final void c(Map<String, Object> map) {
        this.f68403k = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("trace_id");
        c7212v0.m(iLogger, this.f68393a);
        c7212v0.g("public_key");
        c7212v0.p(this.f68394b);
        String str = this.f68395c;
        if (str != null) {
            c7212v0.g("release");
            c7212v0.p(str);
        }
        String str2 = this.f68396d;
        if (str2 != null) {
            c7212v0.g("environment");
            c7212v0.p(str2);
        }
        String str3 = this.f68397e;
        if (str3 != null) {
            c7212v0.g("user_id");
            c7212v0.p(str3);
        }
        String str4 = this.f68398f;
        if (str4 != null) {
            c7212v0.g("transaction");
            c7212v0.p(str4);
        }
        String str5 = this.f68399g;
        if (str5 != null) {
            c7212v0.g("sample_rate");
            c7212v0.p(str5);
        }
        String str6 = this.f68400h;
        if (str6 != null) {
            c7212v0.g("sample_rand");
            c7212v0.p(str6);
        }
        String str7 = this.f68401i;
        if (str7 != null) {
            c7212v0.g("sampled");
            c7212v0.p(str7);
        }
        io.sentry.protocol.t tVar = this.f68402j;
        if (tVar != null) {
            c7212v0.g("replay_id");
            c7212v0.m(iLogger, tVar);
        }
        ConcurrentHashMap concurrentHashMap = this.f68403k;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                C7137e.b(this.f68403k, str8, c7212v0, str8, iLogger);
            }
        }
        c7212v0.d();
    }

    q3(@NotNull io.sentry.protocol.t tVar, @NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.t tVar2, String str8) {
        this.f68393a = tVar;
        this.f68394b = str;
        this.f68395c = str2;
        this.f68396d = str3;
        this.f68397e = str4;
        this.f68398f = str5;
        this.f68399g = str6;
        this.f68401i = str7;
        this.f68402j = tVar2;
        this.f68400h = str8;
    }
}
