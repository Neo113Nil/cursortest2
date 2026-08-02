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

/* renamed from: io.sentry.protocol.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7186b implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68184a;

    /* renamed from: b, reason: collision with root package name */
    private String f68185b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap f68186c;

    /* renamed from: io.sentry.protocol.b$a */
    public static final class a implements InterfaceC7174n0<C7186b> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final C7186b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            C7186b c7186b = new C7186b();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    c7186b.f68184a = interfaceC7131c1.k0();
                } else if (nextName.equals("version")) {
                    c7186b.f68185b = interfaceC7131c1.k0();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            c7186b.c(concurrentHashMap);
            interfaceC7131c1.endObject();
            return c7186b;
        }
    }

    public C7186b() {
    }

    public final void c(Map<String, Object> map) {
        this.f68186c = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7186b.class == obj.getClass()) {
            C7186b c7186b = (C7186b) obj;
            if (io.sentry.util.p.a(this.f68184a, c7186b.f68184a) && io.sentry.util.p.a(this.f68185b, c7186b.f68185b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68184a, this.f68185b});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68184a != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68184a);
        }
        if (this.f68185b != null) {
            c7212v0.g("version");
            c7212v0.p(this.f68185b);
        }
        ConcurrentHashMap concurrentHashMap = this.f68186c;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68186c, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    C7186b(@NotNull C7186b c7186b) {
        this.f68184a = c7186b.f68184a;
        this.f68185b = c7186b.f68185b;
        this.f68186c = io.sentry.util.c.a(c7186b.f68186c);
    }
}
