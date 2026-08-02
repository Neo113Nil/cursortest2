package io.sentry.protocol;

import io.sentry.EnumC4788n3;
import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.protocol.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4805g implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public String f52378a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f52379b;

    /* renamed from: c, reason: collision with root package name */
    public Map f52380c;

    /* renamed from: io.sentry.protocol.g$a */
    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C4805g a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            interfaceC4809q1.m();
            String str = null;
            Boolean bool = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String f02 = interfaceC4809q1.f0();
                f02.getClass();
                if (f02.equals("result")) {
                    bool = interfaceC4809q1.p0();
                } else if (f02.equals("flag")) {
                    str = interfaceC4809q1.a1();
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                }
            }
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"flag\"", illegalStateException);
                throw illegalStateException;
            }
            if (bool == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                iLogger.b(EnumC4788n3.ERROR, "Missing required field \"result\"", illegalStateException2);
                throw illegalStateException2;
            }
            C4805g c4805g = new C4805g(str, bool.booleanValue());
            c4805g.c(concurrentHashMap);
            interfaceC4809q1.t();
            return c4805g;
        }
    }

    public C4805g(String str, boolean z10) {
        this.f52378a = str;
        this.f52379b = z10;
    }

    public String a() {
        return this.f52378a;
    }

    public Boolean b() {
        return Boolean.valueOf(this.f52379b);
    }

    public void c(Map map) {
        this.f52380c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4805g.class == obj.getClass()) {
            C4805g c4805g = (C4805g) obj;
            if (io.sentry.util.w.a(this.f52378a, c4805g.f52378a) && io.sentry.util.w.a(Boolean.valueOf(this.f52379b), Boolean.valueOf(c4805g.f52379b))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f52378a, Boolean.valueOf(this.f52379b));
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        interfaceC4813r1.d("flag").e(this.f52378a);
        interfaceC4813r1.d("result").c(this.f52379b);
        Map map = this.f52380c;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC4813r1.d(str).j(iLogger, this.f52380c.get(str));
            }
        }
        interfaceC4813r1.t();
    }
}
