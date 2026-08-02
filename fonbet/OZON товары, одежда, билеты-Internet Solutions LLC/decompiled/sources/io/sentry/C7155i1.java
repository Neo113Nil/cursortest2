package io.sentry;

import io.sentry.protocol.t;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7155i1 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f67978a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f67979b;

    /* renamed from: io.sentry.i1$a */
    public static final class a implements InterfaceC7174n0<C7155i1> {
        @NotNull
        public static C7155i1 b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            C7155i1 c7155i1 = new C7155i1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("profiler_id")) {
                    io.sentry.protocol.t tVar = (io.sentry.protocol.t) interfaceC7131c1.S(iLogger, new t.a());
                    if (tVar != null) {
                        c7155i1.f67978a = tVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            c7155i1.b(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7155i1;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ C7155i1 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public C7155i1() {
        this(io.sentry.protocol.t.f68325b);
    }

    public final void b(Map<String, Object> map) {
        this.f67979b = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7155i1) {
            return this.f67978a.equals(((C7155i1) obj).f67978a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f67978a});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("profiler_id");
        c7212v0.m(iLogger, this.f67978a);
        ConcurrentHashMap concurrentHashMap = this.f67979b;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f67979b, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public C7155i1(@NotNull io.sentry.protocol.t tVar) {
        this.f67978a = tVar;
    }

    public C7155i1(@NotNull C7155i1 c7155i1) {
        this.f67978a = c7155i1.f67978a;
        ConcurrentHashMap a11 = io.sentry.util.c.a(c7155i1.f67979b);
        if (a11 != null) {
            this.f67979b = a11;
        }
    }
}
