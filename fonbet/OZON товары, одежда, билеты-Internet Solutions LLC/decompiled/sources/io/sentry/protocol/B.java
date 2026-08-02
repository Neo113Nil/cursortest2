package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class B implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String[] f68143a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentHashMap f68144b;

    public static final class a implements InterfaceC7174n0<B> {
        @NotNull
        public static B b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            B b11 = new B();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("active_profiles")) {
                    List list = (List) interfaceC7131c1.U1();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        b11.f68143a = strArr;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                }
            }
            b11.b(concurrentHashMap);
            interfaceC7131c1.endObject();
            return b11;
        }
    }

    public B() {
    }

    public final void b(Map<String, Object> map) {
        this.f68144b = (ConcurrentHashMap) map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f68143a, ((B) obj).f68143a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f68143a);
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68143a != null) {
            c7212v0.g("active_profiles");
            c7212v0.m(iLogger, this.f68143a);
        }
        ConcurrentHashMap concurrentHashMap = this.f68144b;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68144b, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public B(@NotNull B b11) {
        this.f68143a = b11.f68143a;
        this.f68144b = io.sentry.util.c.a(b11.f68144b);
    }
}
