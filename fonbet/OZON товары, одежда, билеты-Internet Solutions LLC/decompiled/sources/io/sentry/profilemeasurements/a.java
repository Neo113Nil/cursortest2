package io.sentry.profilemeasurements;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.profilemeasurements.b;
import io.sentry.util.p;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f68129a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private String f68130b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Collection<b> f68131c;

    /* renamed from: io.sentry.profilemeasurements.a$a, reason: collision with other inner class name */
    public static final class C1115a implements InterfaceC7174n0<a> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final a a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("values")) {
                    ArrayList J02 = interfaceC7131c1.J0(iLogger, new b.a());
                    if (J02 != null) {
                        aVar.f68131c = J02;
                    }
                } else if (nextName.equals("unit")) {
                    String k02 = interfaceC7131c1.k0();
                    if (k02 != null) {
                        aVar.f68130b = k02;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            aVar.c(concurrentHashMap);
            interfaceC7131c1.endObject();
            return aVar;
        }
    }

    public a() {
        this("unknown", new ArrayList());
    }

    public final void c(Map<String, Object> map) {
        this.f68129a = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return p.a(this.f68129a, aVar.f68129a) && this.f68130b.equals(aVar.f68130b) && new ArrayList(this.f68131c).equals(new ArrayList(aVar.f68131c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68129a, this.f68130b, this.f68131c});
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("unit");
        c7212v0.m(iLogger, this.f68130b);
        c7212v0.g("values");
        c7212v0.m(iLogger, this.f68131c);
        ConcurrentHashMap concurrentHashMap = this.f68129a;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68129a, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public a(@NotNull String str, @NotNull AbstractCollection abstractCollection) {
        this.f68130b = str;
        this.f68131c = abstractCollection;
    }
}
