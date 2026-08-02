package io.sentry.rrweb;

import I1.w;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.rrweb.b;
import io.sentry.rrweb.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends d implements InterfaceC7220x0 {

    /* renamed from: d, reason: collision with root package name */
    private int f68431d;

    /* renamed from: e, reason: collision with root package name */
    private List<b> f68432e;

    /* renamed from: f, reason: collision with root package name */
    private HashMap f68433f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap f68434g;

    public static final class a implements InterfaceC7174n0<f> {
        @NotNull
        public static f b(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            interfaceC7131c1.beginObject();
            f fVar = new f();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                if (nextName.equals("data")) {
                    interfaceC7131c1.beginObject();
                    HashMap hashMap2 = null;
                    while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                        String nextName2 = interfaceC7131c1.nextName();
                        nextName2.getClass();
                        if (nextName2.equals("pointerId")) {
                            fVar.f68431d = interfaceC7131c1.nextInt();
                        } else if (nextName2.equals("positions")) {
                            fVar.f68432e = interfaceC7131c1.J0(iLogger, new b.a());
                        } else if (!d.a.a(fVar, nextName2, interfaceC7131c1, iLogger)) {
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            interfaceC7131c1.Q0(iLogger, hashMap2, nextName2);
                        }
                    }
                    fVar.k(hashMap2);
                    interfaceC7131c1.endObject();
                } else if (!b.a.a(fVar, nextName, interfaceC7131c1, iLogger)) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                }
            }
            fVar.n(hashMap);
            interfaceC7131c1.endObject();
            return fVar;
        }

        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final /* bridge */ /* synthetic */ f a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            return b(interfaceC7131c1, iLogger);
        }
    }

    /* loaded from: classes10.dex */
    public static final class b implements InterfaceC7220x0 {

        /* renamed from: a, reason: collision with root package name */
        private int f68435a;

        /* renamed from: b, reason: collision with root package name */
        private float f68436b;

        /* renamed from: c, reason: collision with root package name */
        private float f68437c;

        /* renamed from: d, reason: collision with root package name */
        private long f68438d;

        /* renamed from: e, reason: collision with root package name */
        private HashMap f68439e;

        public static final class a implements InterfaceC7174n0<b> {
            @Override // io.sentry.InterfaceC7174n0
            @NotNull
            public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
                String nextName;
                interfaceC7131c1.beginObject();
                b bVar = new b();
                HashMap hashMap = null;
                while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                    nextName = interfaceC7131c1.nextName();
                    nextName.getClass();
                    switch (nextName) {
                        case "x":
                            bVar.f68436b = interfaceC7131c1.j0();
                            break;
                        case "y":
                            bVar.f68437c = interfaceC7131c1.j0();
                            break;
                        case "id":
                            bVar.f68435a = interfaceC7131c1.nextInt();
                            break;
                        case "timeOffset":
                            bVar.f68438d = interfaceC7131c1.nextLong();
                            break;
                        default:
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                            break;
                    }
                }
                bVar.h(hashMap);
                interfaceC7131c1.endObject();
                return bVar;
            }
        }

        public final long e() {
            return this.f68438d;
        }

        public final void f() {
            this.f68435a = 0;
        }

        public final void g(long j11) {
            this.f68438d = j11;
        }

        public final void h(Map<String, Object> map) {
            this.f68439e = (HashMap) map;
        }

        public final void i(float f7) {
            this.f68436b = f7;
        }

        public final void j(float f7) {
            this.f68437c = f7;
        }

        @Override // io.sentry.InterfaceC7220x0
        public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
            C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
            c7212v0.b();
            c7212v0.g("id");
            c7212v0.l(this.f68435a);
            c7212v0.g("x");
            c7212v0.k(this.f68436b);
            c7212v0.g("y");
            c7212v0.k(this.f68437c);
            c7212v0.g("timeOffset");
            c7212v0.l(this.f68438d);
            HashMap hashMap = this.f68439e;
            if (hashMap != null) {
                for (String str : hashMap.keySet()) {
                    w.e(this.f68439e, str, c7212v0, str, iLogger);
                }
            }
            c7212v0.d();
        }
    }

    public f() {
        super(d.b.TouchMove);
    }

    public final void k(Map<String, Object> map) {
        this.f68434g = (HashMap) map;
    }

    public final void l(int i11) {
        this.f68431d = i11;
    }

    public final void m(ArrayList arrayList) {
        this.f68432e = arrayList;
    }

    public final void n(Map<String, Object> map) {
        this.f68433f = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        b.C1119b.a(this, c7212v0, iLogger);
        c7212v0.g("data");
        c7212v0.b();
        d.c.a(this, c7212v0, iLogger);
        List<b> list = this.f68432e;
        if (list != null && !list.isEmpty()) {
            c7212v0.g("positions");
            c7212v0.m(iLogger, this.f68432e);
        }
        c7212v0.g("pointerId");
        c7212v0.l(this.f68431d);
        HashMap hashMap = this.f68434g;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                w.e(this.f68434g, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
        HashMap hashMap2 = this.f68433f;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                w.e(this.f68433f, str2, c7212v0, str2, iLogger);
            }
        }
        c7212v0.d();
    }
}
