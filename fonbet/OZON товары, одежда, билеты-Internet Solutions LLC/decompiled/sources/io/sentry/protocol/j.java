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
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68243a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f68244b;

    /* renamed from: c, reason: collision with root package name */
    private String f68245c;

    /* renamed from: d, reason: collision with root package name */
    private String f68246d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f68247e;

    /* renamed from: f, reason: collision with root package name */
    private String f68248f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f68249g;

    /* renamed from: h, reason: collision with root package name */
    private String f68250h;

    /* renamed from: i, reason: collision with root package name */
    private String f68251i;

    /* renamed from: j, reason: collision with root package name */
    private ConcurrentHashMap f68252j;

    public static final class a implements InterfaceC7174n0<j> {
        @NotNull
        public static j b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "npot_support":
                        jVar.f68251i = interfaceC7131c1.k0();
                        break;
                    case "vendor_id":
                        jVar.f68245c = interfaceC7131c1.k0();
                        break;
                    case "multi_threaded_rendering":
                        jVar.f68249g = interfaceC7131c1.P();
                        break;
                    case "id":
                        jVar.f68244b = interfaceC7131c1.A1();
                        break;
                    case "name":
                        jVar.f68243a = interfaceC7131c1.k0();
                        break;
                    case "vendor_name":
                        jVar.f68246d = interfaceC7131c1.k0();
                        break;
                    case "version":
                        jVar.f68250h = interfaceC7131c1.k0();
                        break;
                    case "api_type":
                        jVar.f68248f = interfaceC7131c1.k0();
                        break;
                    case "memory_size":
                        jVar.f68247e = interfaceC7131c1.A1();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            jVar.j(concurrentHashMap);
            interfaceC7131c1.endObject();
            return jVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ j a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public j() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (io.sentry.util.p.a(this.f68243a, jVar.f68243a) && io.sentry.util.p.a(this.f68244b, jVar.f68244b) && io.sentry.util.p.a(this.f68245c, jVar.f68245c) && io.sentry.util.p.a(this.f68246d, jVar.f68246d) && io.sentry.util.p.a(this.f68247e, jVar.f68247e) && io.sentry.util.p.a(this.f68248f, jVar.f68248f) && io.sentry.util.p.a(this.f68249g, jVar.f68249g) && io.sentry.util.p.a(this.f68250h, jVar.f68250h) && io.sentry.util.p.a(this.f68251i, jVar.f68251i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68243a, this.f68244b, this.f68245c, this.f68246d, this.f68247e, this.f68248f, this.f68249g, this.f68250h, this.f68251i});
    }

    public final void j(Map<String, Object> map) {
        this.f68252j = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68243a != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68243a);
        }
        if (this.f68244b != null) {
            c7212v0.g("id");
            c7212v0.o(this.f68244b);
        }
        if (this.f68245c != null) {
            c7212v0.g("vendor_id");
            c7212v0.p(this.f68245c);
        }
        if (this.f68246d != null) {
            c7212v0.g("vendor_name");
            c7212v0.p(this.f68246d);
        }
        if (this.f68247e != null) {
            c7212v0.g("memory_size");
            c7212v0.o(this.f68247e);
        }
        if (this.f68248f != null) {
            c7212v0.g("api_type");
            c7212v0.p(this.f68248f);
        }
        if (this.f68249g != null) {
            c7212v0.g("multi_threaded_rendering");
            c7212v0.n(this.f68249g);
        }
        if (this.f68250h != null) {
            c7212v0.g("version");
            c7212v0.p(this.f68250h);
        }
        if (this.f68251i != null) {
            c7212v0.g("npot_support");
            c7212v0.p(this.f68251i);
        }
        ConcurrentHashMap concurrentHashMap = this.f68252j;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68252j, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    j(@NotNull j jVar) {
        this.f68243a = jVar.f68243a;
        this.f68244b = jVar.f68244b;
        this.f68245c = jVar.f68245c;
        this.f68246d = jVar.f68246d;
        this.f68247e = jVar.f68247e;
        this.f68248f = jVar.f68248f;
        this.f68249g = jVar.f68249g;
        this.f68250h = jVar.f68250h;
        this.f68251i = jVar.f68251i;
        this.f68252j = io.sentry.util.c.a(jVar.f68252j);
    }
}
