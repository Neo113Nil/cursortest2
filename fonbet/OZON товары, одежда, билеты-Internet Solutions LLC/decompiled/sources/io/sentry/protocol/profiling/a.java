package io.sentry.protocol.profiling;

import io.sentry.C7137e;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.protocol.profiling.b;
import io.sentry.protocol.profiling.c;
import io.sentry.protocol.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class a implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private List<io.sentry.protocol.profiling.b> f68296a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private List<List<Integer>> f68297b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private List<x> f68298c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private Map<String, c> f68299d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap f68300e;

    /* renamed from: io.sentry.protocol.profiling.a$a, reason: collision with other inner class name */
    public static final class C1117a implements InterfaceC7174n0<a> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final a a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "frames":
                        ArrayList J02 = interfaceC7131c1.J0(iLogger, new x.a());
                        if (J02 == null) {
                            break;
                        } else {
                            aVar.f68298c = J02;
                            break;
                        }
                    case "stacks":
                        List list = (List) interfaceC7131c1.S(iLogger, new b());
                        if (list == null) {
                            break;
                        } else {
                            aVar.f68297b = list;
                            break;
                        }
                    case "samples":
                        ArrayList J03 = interfaceC7131c1.J0(iLogger, new b.a());
                        if (J03 == null) {
                            break;
                        } else {
                            aVar.f68296a = J03;
                            break;
                        }
                    case "thread_metadata":
                        HashMap G12 = interfaceC7131c1.G1(iLogger, new c.a());
                        if (G12 == null) {
                            break;
                        } else {
                            aVar.f68299d = G12;
                            break;
                        }
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, concurrentHashMap, nextName);
                        break;
                }
            }
            aVar.e(concurrentHashMap);
            interfaceC7131c1.endObject();
            return aVar;
        }
    }

    private static final class b implements InterfaceC7174n0<List<List<Integer>>> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final List<List<Integer>> a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            interfaceC7131c1.beginArray();
            while (interfaceC7131c1.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                interfaceC7131c1.beginArray();
                while (interfaceC7131c1.hasNext()) {
                    arrayList2.add(Integer.valueOf(interfaceC7131c1.nextInt()));
                }
                interfaceC7131c1.endArray();
                arrayList.add(arrayList2);
            }
            interfaceC7131c1.endArray();
            return arrayList;
        }
    }

    public final void e(Map<String, Object> map) {
        this.f68300e = (ConcurrentHashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        c7212v0.g("samples");
        c7212v0.m(iLogger, this.f68296a);
        c7212v0.g("stacks");
        c7212v0.m(iLogger, this.f68297b);
        c7212v0.g("frames");
        c7212v0.m(iLogger, this.f68298c);
        c7212v0.g("thread_metadata");
        c7212v0.m(iLogger, this.f68299d);
        ConcurrentHashMap concurrentHashMap = this.f68300e;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                C7137e.b(this.f68300e, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
