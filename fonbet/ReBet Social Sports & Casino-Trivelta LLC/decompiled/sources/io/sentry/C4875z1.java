package io.sentry;

import io.sentry.protocol.u;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.z1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4875z1 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.u f52917a;

    /* renamed from: b, reason: collision with root package name */
    public Map f52918b;

    /* renamed from: io.sentry.z1$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4875z1 a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            C4875z1 c4875z1 = new C4875z1();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("profiler_id")) {
                    io.sentry.protocol.u uVar = (io.sentry.protocol.u) interfaceC4809q1.x0(iLogger, new u.a());
                    if (uVar != null) {
                        c4875z1.f52917a = uVar;
                    }
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            c4875z1.b(concurrentHashMap);
            interfaceC4809q1.t();
            return c4875z1;
        }
    }

    public C4875z1() {
        this(io.sentry.protocol.u.f52477c);
    }

    public void b(Map map) {
        this.f52918b = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4875z1) {
            return this.f52917a.equals(((C4875z1) obj).f52917a);
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52917a);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("profiler_id").j(iLogger, this.f52917a);
        Map map = this.f52918b;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52918b.get(str));
            }
        }
        interfaceC4813r1.t();
    }

    public C4875z1(io.sentry.protocol.u uVar) {
        this.f52917a = uVar;
    }

    public C4875z1(C4875z1 c4875z1) {
        this.f52917a = c4875z1.f52917a;
        Map b10 = AbstractC4845c.b(c4875z1.f52918b);
        if (b10 != null) {
            this.f52918b = b10;
        }
    }
}
