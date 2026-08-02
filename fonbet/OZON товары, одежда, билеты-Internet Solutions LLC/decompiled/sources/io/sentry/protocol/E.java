package io.sentry.protocol;

import com.google.android.gms.common.Scopes;
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
public final class E implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68147a;

    /* renamed from: b, reason: collision with root package name */
    private String f68148b;

    /* renamed from: c, reason: collision with root package name */
    private String f68149c;

    /* renamed from: d, reason: collision with root package name */
    private String f68150d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    private String f68151e;

    /* renamed from: f, reason: collision with root package name */
    private i f68152f;

    /* renamed from: g, reason: collision with root package name */
    private ConcurrentHashMap f68153g;

    /* renamed from: h, reason: collision with root package name */
    private ConcurrentHashMap f68154h;

    public static final class a implements InterfaceC7174n0<E> {
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final E a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            char c11;
            boolean z11;
            interfaceC7131c1.beginObject();
            E e11 = new E();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName.hashCode()) {
                    case -265713450:
                        if (nextName.equals("username")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3355:
                        if (nextName.equals("id")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 102225:
                        if (nextName.equals("geo")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3076010:
                        if (nextName.equals("data")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3373707:
                        if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 96619420:
                        if (nextName.equals(Scopes.EMAIL)) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1480014044:
                        if (nextName.equals("ip_address")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        e11.f68149c = interfaceC7131c1.k0();
                        break;
                    case 1:
                        e11.f68148b = interfaceC7131c1.k0();
                        break;
                    case 2:
                        interfaceC7131c1.beginObject();
                        i iVar = new i();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                            String nextName2 = interfaceC7131c1.nextName();
                            nextName2.getClass();
                            switch (nextName2.hashCode()) {
                                case -934795532:
                                    if (nextName2.equals("region")) {
                                        z11 = false;
                                        break;
                                    }
                                    z11 = -1;
                                    break;
                                case 3053931:
                                    if (nextName2.equals("city")) {
                                        z11 = true;
                                        break;
                                    }
                                    z11 = -1;
                                    break;
                                case 1481071862:
                                    if (nextName2.equals("country_code")) {
                                        z11 = 2;
                                        break;
                                    }
                                    z11 = -1;
                                    break;
                                default:
                                    z11 = -1;
                                    break;
                            }
                            switch (z11) {
                                case false:
                                    iVar.f68241c = interfaceC7131c1.k0();
                                    break;
                                case true:
                                    iVar.f68239a = interfaceC7131c1.k0();
                                    break;
                                case true:
                                    iVar.f68240b = interfaceC7131c1.k0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    interfaceC7131c1.Q0(iLogger, concurrentHashMap2, nextName2);
                                    break;
                            }
                        }
                        iVar.d(concurrentHashMap2);
                        interfaceC7131c1.endObject();
                        e11.f68152f = iVar;
                        break;
                    case 3:
                        e11.f68153g = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        break;
                    case 4:
                        e11.f68151e = interfaceC7131c1.k0();
                        break;
                    case 5:
                        e11.f68147a = interfaceC7131c1.k0();
                        break;
                    case 6:
                        e11.f68150d = interfaceC7131c1.k0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            e11.p(concurrentHashMap);
            interfaceC7131c1.endObject();
            return e11;
        }
    }

    public E() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e11 = (E) obj;
            if (io.sentry.util.p.a(this.f68147a, e11.f68147a) && io.sentry.util.p.a(this.f68148b, e11.f68148b) && io.sentry.util.p.a(this.f68149c, e11.f68149c) && io.sentry.util.p.a(this.f68150d, e11.f68150d)) {
                return true;
            }
        }
        return false;
    }

    public final Map<String, String> h() {
        return this.f68153g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f68147a, this.f68148b, this.f68149c, this.f68150d});
    }

    public final String i() {
        return this.f68147a;
    }

    public final String j() {
        return this.f68148b;
    }

    public final String k() {
        return this.f68150d;
    }

    public final String l() {
        return this.f68149c;
    }

    public final void m(Map<String, String> map) {
        this.f68153g = io.sentry.util.c.a(map);
    }

    public final void n(String str) {
        this.f68148b = str;
    }

    public final void o() {
        this.f68150d = "{{auto}}";
    }

    public final void p(Map<String, Object> map) {
        this.f68154h = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68147a != null) {
            c7212v0.g(Scopes.EMAIL);
            c7212v0.p(this.f68147a);
        }
        if (this.f68148b != null) {
            c7212v0.g("id");
            c7212v0.p(this.f68148b);
        }
        if (this.f68149c != null) {
            c7212v0.g("username");
            c7212v0.p(this.f68149c);
        }
        if (this.f68150d != null) {
            c7212v0.g("ip_address");
            c7212v0.p(this.f68150d);
        }
        if (this.f68151e != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.NAME);
            c7212v0.p(this.f68151e);
        }
        if (this.f68152f != null) {
            c7212v0.g("geo");
            this.f68152f.serialize(c7212v0, iLogger);
        }
        if (this.f68153g != null) {
            c7212v0.g("data");
            c7212v0.m(iLogger, this.f68153g);
        }
        ConcurrentHashMap concurrentHashMap = this.f68154h;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68154h, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public E(@NotNull E e11) {
        this.f68147a = e11.f68147a;
        this.f68149c = e11.f68149c;
        this.f68148b = e11.f68148b;
        this.f68150d = e11.f68150d;
        this.f68151e = e11.f68151e;
        this.f68152f = e11.f68152f;
        this.f68153g = io.sentry.util.c.a(e11.f68153g);
        this.f68154h = io.sentry.util.c.a(e11.f68154h);
    }
}
