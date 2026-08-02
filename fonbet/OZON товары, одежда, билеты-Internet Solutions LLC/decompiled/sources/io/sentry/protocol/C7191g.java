package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.protocol.C7190f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7191g implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private List<C7190f> f68230a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f68231b;

    /* renamed from: io.sentry.protocol.g$a */
    public static final class a implements InterfaceC7174n0<C7191g> {
        @NotNull
        public static C7191g b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            ArrayList arrayList = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("values")) {
                    arrayList = interfaceC7131c1.J0(iLogger, new C7190f.a());
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            C7191g c7191g = new C7191g(arrayList);
            c7191g.b(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7191g;
        }
    }

    public C7191g() {
        this.f68230a = new ArrayList();
    }

    @NotNull
    public final List<C7190f> a() {
        return this.f68230a;
    }

    public final void b(Map<String, Object> map) {
        this.f68231b = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7191g.class != obj.getClass()) {
            return false;
        }
        return io.sentry.util.p.a(this.f68230a, ((C7191g) obj).f68230a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68230a});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("values");
        c7212v0.m(iLogger, this.f68230a);
        ConcurrentHashMap concurrentHashMap = this.f68231b;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68231b, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public C7191g(@NotNull List<C7190f> list) {
        this.f68230a = list;
    }
}
