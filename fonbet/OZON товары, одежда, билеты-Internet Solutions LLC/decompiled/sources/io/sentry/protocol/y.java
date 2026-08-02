package io.sentry.protocol;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.protocol.x;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class y implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private List<x> f68369a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractMap f68370b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f68371c;

    /* renamed from: d, reason: collision with root package name */
    private b f68372d;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap f68373e;

    public static final class a implements InterfaceC7174n0<y> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final y a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            y yVar = new y();
            interfaceC7131c1.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "frames":
                        yVar.f68369a = interfaceC7131c1.J0(iLogger, new x.a());
                        break;
                    case "instruction_addr_adjustment":
                        yVar.f68372d = (b) interfaceC7131c1.S(iLogger, new b.a());
                        break;
                    case "registers":
                        yVar.f68370b = io.sentry.util.c.a((Map) interfaceC7131c1.U1());
                        break;
                    case "snapshot":
                        yVar.f68371c = interfaceC7131c1.P();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            yVar.j(concurrentHashMap);
            interfaceC7131c1.endObject();
            return yVar;
        }
    }

    public enum b implements InterfaceC7220x0 {
        AUTO,
        ALL,
        ALL_BUT_FIRST,
        NONE;

        public static final class a implements InterfaceC7174n0<b> {
            @Override // io.sentry.InterfaceC7174n0
            @NotNull
            public final b a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
                return b.valueOf(interfaceC7131c1.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.InterfaceC7220x0
        public void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
            ((C7212v0) interfaceC7135d1).p(toString().toLowerCase(Locale.ROOT));
        }
    }

    public y() {
    }

    public final List<x> e() {
        return this.f68369a;
    }

    public final void f(ArrayList arrayList) {
        this.f68369a = arrayList;
    }

    public final void g(b bVar) {
        this.f68372d = bVar;
    }

    public final void h(HashMap hashMap) {
        this.f68370b = hashMap;
    }

    public final void i() {
        this.f68371c = Boolean.TRUE;
    }

    public final void j(Map<String, Object> map) {
        this.f68373e = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68369a != null) {
            c7212v0.g("frames");
            c7212v0.m(iLogger, this.f68369a);
        }
        if (this.f68370b != null) {
            c7212v0.g("registers");
            c7212v0.m(iLogger, this.f68370b);
        }
        if (this.f68371c != null) {
            c7212v0.g("snapshot");
            c7212v0.n(this.f68371c);
        }
        if (this.f68372d != null) {
            c7212v0.g("instruction_addr_adjustment");
            c7212v0.m(iLogger, this.f68372d);
        }
        ConcurrentHashMap concurrentHashMap = this.f68373e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68373e, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public y(List<x> list) {
        this.f68369a = list;
    }
}
