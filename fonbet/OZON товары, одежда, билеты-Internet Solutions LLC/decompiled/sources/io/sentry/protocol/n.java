package io.sentry.protocol;

import android.os.Build;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7137e;
import io.sentry.C7212v0;
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

/* loaded from: classes.dex */
public final class n implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68271a;

    /* renamed from: b, reason: collision with root package name */
    private String f68272b;

    /* renamed from: c, reason: collision with root package name */
    private String f68273c;

    /* renamed from: d, reason: collision with root package name */
    private String f68274d;

    /* renamed from: e, reason: collision with root package name */
    private String f68275e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f68276f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap f68277g;

    public static final class a implements InterfaceC7174n0<n> {
        @NotNull
        public static n b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            n nVar = new n();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "rooted":
                        nVar.f68276f = interfaceC7131c1.P();
                        break;
                    case "raw_description":
                        nVar.f68273c = interfaceC7131c1.k0();
                        break;
                    case "name":
                        nVar.f68271a = interfaceC7131c1.k0();
                        break;
                    case "build":
                        nVar.f68274d = interfaceC7131c1.k0();
                        break;
                    case "version":
                        nVar.f68272b = interfaceC7131c1.k0();
                        break;
                    case "kernel_version":
                        nVar.f68275e = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            nVar.l(concurrentHashMap);
            interfaceC7131c1.endObject();
            return nVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ n a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public n() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (io.sentry.util.p.a(this.f68271a, nVar.f68271a) && io.sentry.util.p.a(this.f68272b, nVar.f68272b) && io.sentry.util.p.a(this.f68273c, nVar.f68273c) && io.sentry.util.p.a(this.f68274d, nVar.f68274d) && io.sentry.util.p.a(this.f68275e, nVar.f68275e) && io.sentry.util.p.a(this.f68276f, nVar.f68276f)) {
                return true;
            }
        }
        return false;
    }

    public final String g() {
        return this.f68271a;
    }

    public final void h() {
        this.f68274d = Build.DISPLAY;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68271a, this.f68272b, this.f68273c, this.f68274d, this.f68275e, this.f68276f});
    }

    public final void i(String str) {
        this.f68275e = str;
    }

    public final void j(String str) {
        this.f68271a = "Android";
    }

    public final void k(Boolean bool) {
        this.f68276f = bool;
    }

    public final void l(Map<String, Object> map) {
        this.f68277g = (ConcurrentHashMap) map;
    }

    public final void m(String str) {
        this.f68272b = Build.VERSION.RELEASE;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68271a != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68271a);
        }
        if (this.f68272b != null) {
            c7212v0.g("version");
            c7212v0.p(this.f68272b);
        }
        if (this.f68273c != null) {
            c7212v0.g("raw_description");
            c7212v0.p(this.f68273c);
        }
        if (this.f68274d != null) {
            c7212v0.g("build");
            c7212v0.p(this.f68274d);
        }
        if (this.f68275e != null) {
            c7212v0.g("kernel_version");
            c7212v0.p(this.f68275e);
        }
        if (this.f68276f != null) {
            c7212v0.g("rooted");
            c7212v0.n(this.f68276f);
        }
        ConcurrentHashMap concurrentHashMap = this.f68277g;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68277g, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    n(@NotNull n nVar) {
        this.f68271a = nVar.f68271a;
        this.f68272b = nVar.f68272b;
        this.f68273c = nVar.f68273c;
        this.f68274d = nVar.f68274d;
        this.f68275e = nVar.f68275e;
        this.f68276f = nVar.f68276f;
        this.f68277g = io.sentry.util.c.a(nVar.f68277g);
    }
}
