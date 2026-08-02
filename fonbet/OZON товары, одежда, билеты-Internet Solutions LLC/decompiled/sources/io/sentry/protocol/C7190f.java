package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.protocol.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7190f implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private String f68227a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f68228b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap f68229c;

    /* renamed from: io.sentry.protocol.f$a */
    public static final class a implements InterfaceC7174n0<C7190f> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7190f a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            String str = null;
            Boolean bool = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("result")) {
                    bool = interfaceC7131c1.P();
                } else if (nextName.equals("flag")) {
                    str = interfaceC7131c1.k0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.a(I2.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (bool == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.a(I2.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            C7190f c7190f = new C7190f(str, bool.booleanValue());
            c7190f.c(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7190f;
        }
    }

    public C7190f(@NotNull String str, boolean z11) {
        this.f68227a = str;
        this.f68228b = z11;
    }

    @NotNull
    public final String a() {
        return this.f68227a;
    }

    @NotNull
    public final Boolean b() {
        return Boolean.valueOf(this.f68228b);
    }

    public final void c(Map<String, Object> map) {
        this.f68229c = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7190f.class == obj.getClass()) {
            C7190f c7190f = (C7190f) obj;
            if (io.sentry.util.p.a(this.f68227a, c7190f.f68227a) && io.sentry.util.p.a(Boolean.valueOf(this.f68228b), Boolean.valueOf(c7190f.f68228b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68227a, Boolean.valueOf(this.f68228b)});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("flag");
        c7212v0.p(this.f68227a);
        c7212v0.g("result");
        c7212v0.q(this.f68228b);
        ConcurrentHashMap concurrentHashMap = this.f68229c;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68229c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
