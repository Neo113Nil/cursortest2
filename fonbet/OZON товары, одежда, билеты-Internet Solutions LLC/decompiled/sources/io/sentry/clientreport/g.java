package io.sentry.clientreport;

import B0.A0;
import I1.w;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67834a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f67835b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Long f67836c;

    /* renamed from: d, reason: collision with root package name */
    private HashMap f67837d;

    /* loaded from: classes10.dex */
    public static final class a implements InterfaceC7174n0<g> {
        private static IllegalStateException b(String str, ILogger iLogger) {
            String b11 = A0.b("Missing required field \"", str, "\"");
            IllegalStateException illegalStateException = new IllegalStateException(b11);
            iLogger.a(I2.ERROR, b11, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final g a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            String str = null;
            String str2 = null;
            Long l11 = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "quantity":
                        l11 = interfaceC7131c1.D1();
                        break;
                    case "reason":
                        str = interfaceC7131c1.k0();
                        break;
                    case "category":
                        str2 = interfaceC7131c1.k0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            interfaceC7131c1.endObject();
            if (str == null) {
                throw b("reason", iLogger);
            }
            if (str2 == null) {
                throw b("category", iLogger);
            }
            if (l11 == null) {
                throw b("quantity", iLogger);
            }
            g gVar = new g(str, str2, l11);
            gVar.d(hashMap);
            return gVar;
        }
    }

    public g(@NotNull String str, @NotNull String str2, @NotNull Long l11) {
        this.f67834a = str;
        this.f67835b = str2;
        this.f67836c = l11;
    }

    @NotNull
    public final String a() {
        return this.f67835b;
    }

    @NotNull
    public final Long b() {
        return this.f67836c;
    }

    @NotNull
    public final String c() {
        return this.f67834a;
    }

    public final void d(Map<String, Object> map) {
        this.f67837d = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("reason");
        c7212v0.p(this.f67834a);
        c7212v0.g("category");
        c7212v0.p(this.f67835b);
        c7212v0.g("quantity");
        c7212v0.o(this.f67836c);
        HashMap hashMap = this.f67837d;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                w.e(this.f67837d, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.f67834a + "', category='" + this.f67835b + "', quantity=" + this.f67836c + '}';
    }
}
