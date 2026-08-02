package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.util.AbstractC4845c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4801c implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52336a;

    /* renamed from: b, reason: collision with root package name */
    public String f52337b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52338c;

    /* renamed from: io.sentry.protocol.c$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4801c a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            C4801c c4801c = new C4801c();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("name")) {
                    c4801c.f52336a = interfaceC4809q1.a1();
                } else if (f02.equals("version")) {
                    c4801c.f52337b = interfaceC4809q1.a1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            c4801c.c(concurrentHashMap);
            interfaceC4809q1.t();
            return c4801c;
        }
    }

    public C4801c() {
    }

    public void c(Map map) {
        this.f52338c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4801c.class == obj.getClass()) {
            C4801c c4801c = (C4801c) obj;
            if (io.sentry.util.w.a(this.f52336a, c4801c.f52336a) && io.sentry.util.w.a(this.f52337b, c4801c.f52337b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52336a, this.f52337b);
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52336a != null) {
            interfaceC4813r1.d("name").e(this.f52336a);
        }
        if (this.f52337b != null) {
            interfaceC4813r1.d("version").e(this.f52337b);
        }
        Map map = this.f52338c;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52338c.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public C4801c(C4801c c4801c) {
        this.f52336a = c4801c.f52336a;
        this.f52337b = c4801c.f52337b;
        this.f52338c = AbstractC4845c.b(c4801c.f52338c);
    }
}
