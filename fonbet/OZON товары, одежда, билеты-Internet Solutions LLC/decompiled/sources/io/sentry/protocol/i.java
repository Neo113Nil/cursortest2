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

/* loaded from: classes.dex */
public final class i implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68239a;

    /* renamed from: b, reason: collision with root package name */
    private String f68240b;

    /* renamed from: c, reason: collision with root package name */
    private String f68241c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap f68242d;

    public static final class a implements InterfaceC7174n0<i> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final i a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            i iVar = new i();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "region":
                        iVar.f68241c = interfaceC7131c1.k0();
                        break;
                    case "city":
                        iVar.f68239a = interfaceC7131c1.k0();
                        break;
                    case "country_code":
                        iVar.f68240b = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            iVar.d(concurrentHashMap);
            interfaceC7131c1.endObject();
            return iVar;
        }
    }

    public final void d(Map<String, Object> map) {
        this.f68242d = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68239a != null) {
            c7212v0.g("city");
            c7212v0.p(this.f68239a);
        }
        if (this.f68240b != null) {
            c7212v0.g("country_code");
            c7212v0.p(this.f68240b);
        }
        if (this.f68241c != null) {
            c7212v0.g("region");
            c7212v0.p(this.f68241c);
        }
        ConcurrentHashMap concurrentHashMap = this.f68242d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68242d, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
