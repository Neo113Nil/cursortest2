package io.sentry;

import io.sentry.protocol.r;
import io.sentry.protocol.t;
import io.sentry.q3;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W1 implements InterfaceC7220x0 {

    /* renamed from: a, reason: collision with root package name */
    private final io.sentry.protocol.t f66758a;

    /* renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.r f66759b;

    /* renamed from: c, reason: collision with root package name */
    private final q3 f66760c;

    /* renamed from: d, reason: collision with root package name */
    private Date f66761d;

    /* renamed from: e, reason: collision with root package name */
    private HashMap f66762e;

    public static final class a implements InterfaceC7174n0<W1> {
        @Override // io.sentry.InterfaceC7174n0
        @NotNull
        public final W1 a(@NotNull InterfaceC7131c1 interfaceC7131c1, @NotNull ILogger iLogger) throws Exception {
            String nextName;
            interfaceC7131c1.beginObject();
            io.sentry.protocol.t tVar = null;
            io.sentry.protocol.r rVar = null;
            q3 q3Var = null;
            Date date = null;
            HashMap hashMap = null;
            while (interfaceC7131c1.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                nextName = interfaceC7131c1.nextName();
                nextName.getClass();
                switch (nextName) {
                    case "sdk":
                        rVar = (io.sentry.protocol.r) interfaceC7131c1.S(iLogger, new r.a());
                        break;
                    case "trace":
                        q3Var = (q3) interfaceC7131c1.S(iLogger, new q3.a());
                        break;
                    case "event_id":
                        tVar = (io.sentry.protocol.t) interfaceC7131c1.S(iLogger, new t.a());
                        break;
                    case "sent_at":
                        date = interfaceC7131c1.M(iLogger);
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        interfaceC7131c1.Q0(iLogger, hashMap, nextName);
                        break;
                }
            }
            W1 w12 = new W1(tVar, rVar, q3Var);
            w12.d(date);
            w12.e(hashMap);
            interfaceC7131c1.endObject();
            return w12;
        }
    }

    public W1(io.sentry.protocol.t tVar, io.sentry.protocol.r rVar, q3 q3Var) {
        this.f66758a = tVar;
        this.f66759b = rVar;
        this.f66760c = q3Var;
    }

    public final io.sentry.protocol.t a() {
        return this.f66758a;
    }

    public final io.sentry.protocol.r b() {
        return this.f66759b;
    }

    public final q3 c() {
        return this.f66760c;
    }

    public final void d(Date date) {
        this.f66761d = date;
    }

    public final void e(Map<String, Object> map) {
        this.f66762e = (HashMap) map;
    }

    @Override // io.sentry.InterfaceC7220x0
    public final void serialize(@NotNull InterfaceC7135d1 interfaceC7135d1, @NotNull ILogger iLogger) throws IOException {
        C7212v0 c7212v0 = (C7212v0) interfaceC7135d1;
        c7212v0.b();
        io.sentry.protocol.t tVar = this.f66758a;
        if (tVar != null) {
            c7212v0.g("event_id");
            c7212v0.m(iLogger, tVar);
        }
        io.sentry.protocol.r rVar = this.f66759b;
        if (rVar != null) {
            c7212v0.g("sdk");
            c7212v0.m(iLogger, rVar);
        }
        q3 q3Var = this.f66760c;
        if (q3Var != null) {
            c7212v0.g("trace");
            c7212v0.m(iLogger, q3Var);
        }
        if (this.f66761d != null) {
            c7212v0.g("sent_at");
            c7212v0.m(iLogger, io.sentry.vendor.gson.internal.bind.util.a.b(this.f66761d));
        }
        HashMap hashMap = this.f66762e;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                I1.w.e(this.f66762e, str, c7212v0, str, iLogger);
            }
        }
        c7212v0.d();
    }

    public W1() {
        this(new io.sentry.protocol.t(), null, null);
    }
}
