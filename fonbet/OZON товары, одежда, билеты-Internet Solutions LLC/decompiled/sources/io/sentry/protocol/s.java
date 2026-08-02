package io.sentry.protocol;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.sentry.C7212v0;
import io.sentry.ILogger;
import io.sentry.InterfaceC7131c1;
import io.sentry.InterfaceC7135d1;
import io.sentry.InterfaceC7174n0;
import io.sentry.InterfaceC7220x0;
import io.sentry.protocol.l;
import io.sentry.protocol.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f68318a;

    /* renamed from: b, reason: collision with root package name */
    private String f68319b;

    /* renamed from: c, reason: collision with root package name */
    private String f68320c;

    /* renamed from: d, reason: collision with root package name */
    private Long f68321d;

    /* renamed from: e, reason: collision with root package name */
    private y f68322e;

    /* renamed from: f, reason: collision with root package name */
    private l f68323f;

    /* renamed from: g, reason: collision with root package name */
    private HashMap f68324g;

    public static final class a implements InterfaceC7174n0<s> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final s a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            s sVar = new s();
            interfaceC7131c1.beginObject();
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "thread_id":
                        sVar.f68321d = interfaceC7131c1.D1();
                        break;
                    case "module":
                        sVar.f68320c = interfaceC7131c1.k0();
                        break;
                    case "type":
                        sVar.f68318a = interfaceC7131c1.k0();
                        break;
                    case "value":
                        sVar.f68319b = interfaceC7131c1.k0();
                        break;
                    case "mechanism":
                        sVar.f68323f = (l) interfaceC7131c1.S(iLogger, new l.a());
                        break;
                    case "stacktrace":
                        sVar.f68322e = (y) interfaceC7131c1.S(iLogger, new y.a());
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            interfaceC7131c1.endObject();
            sVar.q(hashMap);
            return sVar;
        }
    }

    public final l g() {
        return this.f68323f;
    }

    public final String h() {
        return this.f68320c;
    }

    public final y i() {
        return this.f68322e;
    }

    public final Long j() {
        return this.f68321d;
    }

    public final String k() {
        return this.f68318a;
    }

    public final void l(l lVar) {
        this.f68323f = lVar;
    }

    public final void m(String str) {
        this.f68320c = str;
    }

    public final void n(y yVar) {
        this.f68322e = yVar;
    }

    public final void o(Long l11) {
        this.f68321d = l11;
    }

    public final void p(String str) {
        this.f68318a = str;
    }

    public final void q(Map<String, Object> map) {
        this.f68324g = (HashMap) map;
    }

    public final void r(String str) {
        this.f68319b = str;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        if (this.f68318a != null) {
            c7212v0.g("type");
            c7212v0.p(this.f68318a);
        }
        if (this.f68319b != null) {
            c7212v0.g(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            c7212v0.p(this.f68319b);
        }
        if (this.f68320c != null) {
            c7212v0.g("module");
            c7212v0.p(this.f68320c);
        }
        if (this.f68321d != null) {
            c7212v0.g("thread_id");
            c7212v0.o(this.f68321d);
        }
        if (this.f68322e != null) {
            c7212v0.g("stacktrace");
            c7212v0.m(iLogger, this.f68322e);
        }
        if (this.f68323f != null) {
            c7212v0.g("mechanism");
            c7212v0.m(iLogger, this.f68323f);
        }
        HashMap hashMap = this.f68324g;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f68324g, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }
}
