package io.sentry.rrweb;

import I1.w;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.rrweb.b;
import io.sentry.util.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g extends b implements InterfaceC7220x0 {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private String f68440c;

    /* renamed from: d, reason: collision with root package name */
    private int f68441d;

    /* renamed from: e, reason: collision with root package name */
    private int f68442e;

    /* renamed from: f, reason: collision with root package name */
    private HashMap f68443f;

    public static final class a implements InterfaceC7174n0<g> {
        @NotNull
        public static g b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            g gVar = new g();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName2 = interfaceC7131c1.nextName();
                nextName2.getClass();
                if (nextName2.equals("data")) {
                    interfaceC7131c1.beginObject();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        nextName = interfaceC7131c1.nextName();
                        nextName.getClass();
                        switch (nextName) {
                            case "height":
                                Integer A12 = interfaceC7131c1.A1();
                                gVar.f68441d = A12 == null ? 0 : A12.intValue();
                                break;
                            case "href":
                                String k02 = interfaceC7131c1.k0();
                                if (k02 == null) {
                                    k02 = "";
                                }
                                gVar.f68440c = k02;
                                break;
                            case "width":
                                Integer A13 = interfaceC7131c1.A1();
                                gVar.f68442e = A13 == null ? 0 : A13.intValue();
                                break;
                            default:
                                if (concurrentHashMap == null) {
                                    concurrentHashMap = new ConcurrentHashMap();
                                }
                                interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                                break;
                        }
                    }
                    interfaceC7131c1.endObject();
                } else if (!b.a.a(gVar, nextName2, interfaceC7131c1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName2);
                }
            }
            gVar.k(hashMap);
            interfaceC7131c1.endObject();
            return gVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ g a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    public g() {
        super(c.Meta);
        this.f68440c = "";
    }

    @Override // io.sentry.rrweb.b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f68441d == gVar.f68441d && this.f68442e == gVar.f68442e && p.a(this.f68440c, gVar.f68440c);
    }

    @Override // io.sentry.rrweb.b
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f68440c, Integer.valueOf(this.f68441d), Integer.valueOf(this.f68442e)});
    }

    public final void j(int i11) {
        this.f68441d = i11;
    }

    public final void k(Map<String, Object> map) {
        this.f68443f = (HashMap) map;
    }

    public final void l(int i11) {
        this.f68442e = i11;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        b.C1119b.a(this, c7212v0, iLogger);
        c7212v0.g("data");
        c7212v0.b();
        c7212v0.g("href");
        c7212v0.p(this.f68440c);
        c7212v0.g("height");
        c7212v0.l(this.f68441d);
        c7212v0.g("width");
        c7212v0.l(this.f68442e);
        HashMap hashMap = this.f68443f;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                w.e(this.f68443f, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
        c7212v0.d();
    }
}
