package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
public final class v implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68330a;

    /* renamed from: b, reason: collision with root package name */
    private String f68331b;

    /* renamed from: c, reason: collision with root package name */
    private String f68332c;

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap f68333d;

    public static final class a implements InterfaceC7174n0<v> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final v a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            v vVar = new v();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "raw_description":
                        vVar.f68332c = interfaceC7131c1.k0();
                        break;
                    case "name":
                        vVar.f68330a = interfaceC7131c1.k0();
                        break;
                    case "version":
                        vVar.f68331b = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            vVar.g(concurrentHashMap);
            interfaceC7131c1.endObject();
            return vVar;
        }
    }

    public v() {
    }

    public final String d() {
        return this.f68330a;
    }

    public final String e() {
        return this.f68331b;
    }

    public final void f(String str) {
        this.f68330a = str;
    }

    public final void g(Map<String, Object> map) {
        this.f68333d = (ConcurrentHashMap) map;
    }

    public final void h(String str) {
        this.f68331b = str;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68330a != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68330a);
        }
        if (this.f68331b != null) {
            c7212v0.g("version");
            c7212v0.p(this.f68331b);
        }
        if (this.f68332c != null) {
            c7212v0.g("raw_description");
            c7212v0.p(this.f68332c);
        }
        ConcurrentHashMap concurrentHashMap = this.f68333d;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68333d, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    v(@NotNull v vVar) {
        this.f68330a = vVar.f68330a;
        this.f68331b = vVar.f68331b;
        this.f68332c = vVar.f68332c;
        this.f68333d = io.sentry.util.c.a(vVar.f68333d);
    }
}
