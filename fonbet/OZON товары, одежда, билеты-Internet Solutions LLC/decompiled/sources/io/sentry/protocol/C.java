package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class C implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f68145a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f68146b;

    public static final class a implements InterfaceC7174n0<C> {
        @NotNull
        public static C b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("source")) {
                    str = interfaceC7131c1.k0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            C c11 = new C(str);
            c11.a(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c11;
        }
    }

    public C(String str) {
        this.f68145a = str;
    }

    public final void a(Map<String, Object> map) {
        this.f68146b = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        String str = this.f68145a;
        if (str != null) {
            c7212v0.g("source");
            c7212v0.m(iLogger, str);
        }
        ConcurrentHashMap concurrentHashMap = this.f68146b;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                C7137e.b(this.f68146b, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
    }
}
