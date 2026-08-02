package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class m implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68267a;

    /* renamed from: b, reason: collision with root package name */
    private String f68268b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f68269c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap f68270d;

    public static final class a implements InterfaceC7174n0<m> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final m a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "params":
                        List list = (List) interfaceC7131c1.U1();
                        if (list == null) {
                            break;
                        } else {
                            mVar.f68269c = list;
                            break;
                        }
                    case "message":
                        mVar.f68268b = interfaceC7131c1.k0();
                        break;
                    case "formatted":
                        mVar.f68267a = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            mVar.h(concurrentHashMap);
            interfaceC7131c1.endObject();
            return mVar;
        }
    }

    public final String d() {
        return this.f68267a;
    }

    public final String e() {
        return this.f68268b;
    }

    public final void f(String str) {
        this.f68267a = str;
    }

    public final void g(String str) {
        this.f68268b = str;
    }

    public final void h(Map<String, Object> map) {
        this.f68270d = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68267a != null) {
            c7212v0.g("formatted");
            c7212v0.p(this.f68267a);
        }
        if (this.f68268b != null) {
            c7212v0.g("message");
            c7212v0.p(this.f68268b);
        }
        List<String> list = this.f68269c;
        if (list != null && !list.isEmpty()) {
            c7212v0.g("params");
            c7212v0.m(iLogger, this.f68269c);
        }
        ConcurrentHashMap concurrentHashMap = this.f68270d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68270d, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
