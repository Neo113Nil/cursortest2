package io.sentry.protocol;

import io.sentry.G0;
import io.sentry.ILogger;
import io.sentry.InterfaceC4809q1;
import io.sentry.InterfaceC4813r1;
import io.sentry.InterfaceC4859w0;
import io.sentry.protocol.y;
import io.sentry.util.AbstractC4845c;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public List f52523a;

    /* renamed from: b, reason: collision with root package name */
    public Map f52524b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f52525c;

    /* renamed from: d, reason: collision with root package name */
    public b f52526d;

    /* renamed from: e, reason: collision with root package name */
    public Map f52527e;

    public static final class a implements InterfaceC4859w0 {
        @Override // io.sentry.InterfaceC4859w0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
            String f02;
            z zVar = new z();
            interfaceC4809q1.m();
            ConcurrentHashMap concurrentHashMap = null;
            while (interfaceC4809q1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                f02 = interfaceC4809q1.f0();
                f02.getClass();
                switch (f02) {
                    case "frames":
                        zVar.f52523a = interfaceC4809q1.P1(iLogger, new y.a());
                        break;
                    case "instruction_addr_adjustment":
                        zVar.f52526d = (b) interfaceC4809q1.x0(iLogger, new b.a());
                        break;
                    case "registers":
                        zVar.f52524b = AbstractC4845c.b((Map) interfaceC4809q1.H1());
                        break;
                    case "snapshot":
                        zVar.f52525c = interfaceC4809q1.p0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        interfaceC4809q1.g1(iLogger, concurrentHashMap, f02);
                        break;
                }
            }
            zVar.j(concurrentHashMap);
            interfaceC4809q1.t();
            return zVar;
        }
    }

    public enum b implements G0 {
        AUTO,
        ALL,
        ALL_BUT_FIRST,
        NONE;

        public static final class a implements InterfaceC4859w0 {
            @Override // io.sentry.InterfaceC4859w0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b a(InterfaceC4809q1 interfaceC4809q1, ILogger iLogger) {
                return b.valueOf(interfaceC4809q1.M0().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.G0
        public void serialize(@NotNull InterfaceC4813r1 interfaceC4813r1, @NotNull ILogger iLogger) {
            interfaceC4813r1.e(toString().toLowerCase(Locale.ROOT));
        }
    }

    public z() {
    }

    public List e() {
        return this.f52523a;
    }

    public void f(List list) {
        this.f52523a = list;
    }

    public void g(b bVar) {
        this.f52526d = bVar;
    }

    public void h(Map map) {
        this.f52524b = map;
    }

    public void i(Boolean bool) {
        this.f52525c = bool;
    }

    public void j(Map map) {
        this.f52527e = map;
    }

    @Override // io.sentry.G0
    public void serialize(InterfaceC4813r1 interfaceC4813r1, ILogger iLogger) {
        interfaceC4813r1.m();
        if (this.f52523a != null) {
            interfaceC4813r1.d("frames").j(iLogger, this.f52523a);
        }
        if (this.f52524b != null) {
            interfaceC4813r1.d("registers").j(iLogger, this.f52524b);
        }
        if (this.f52525c != null) {
            interfaceC4813r1.d("snapshot").k(this.f52525c);
        }
        if (this.f52526d != null) {
            interfaceC4813r1.d("instruction_addr_adjustment").j(iLogger, this.f52526d);
        }
        Map map = this.f52527e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f52527e.get(str);
                interfaceC4813r1.d(str);
                interfaceC4813r1.j(iLogger, obj);
            }
        }
        interfaceC4813r1.t();
    }

    public z(List list) {
        this.f52523a = list;
    }
}
