package io.sentry;

import com.sports.insider.data.room.general.table.predictions.PredictionTable;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n6 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f16667a;

    /* renamed from: b, reason: collision with root package name */
    public final p6 f16668b;

    /* renamed from: c, reason: collision with root package name */
    public final p6 f16669c;

    /* renamed from: d, reason: collision with root package name */
    public transient c4.d f16670d;

    /* renamed from: e, reason: collision with root package name */
    public final String f16671e;

    /* renamed from: f, reason: collision with root package name */
    public String f16672f;

    /* renamed from: g, reason: collision with root package name */
    public q6 f16673g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap f16674h;

    /* renamed from: i, reason: collision with root package name */
    public String f16675i;
    public Map j;

    /* renamed from: k, reason: collision with root package name */
    public ConcurrentHashMap f16676k;

    /* renamed from: l, reason: collision with root package name */
    public p1 f16677l;

    /* renamed from: m, reason: collision with root package name */
    public c f16678m;

    /* renamed from: n, reason: collision with root package name */
    public final i2.d f16679n;

    /* renamed from: o, reason: collision with root package name */
    public final io.sentry.protocol.v f16680o;

    public n6(io.sentry.protocol.v vVar, p6 p6Var, String str, p6 p6Var2) {
        this(vVar, p6Var, p6Var2, str, null, null, null, "manual");
    }

    public final void a(c4.d dVar) {
        this.f16670d = dVar;
        c cVar = this.f16678m;
        if (cVar == null || dVar == null) {
            return;
        }
        Boolean bool = (Boolean) dVar.f3577b;
        Charset charset = io.sentry.util.l.f17171a;
        cVar.d("sentry-sampled", bool == null ? null : bool.toString());
        Double d10 = (Double) dVar.f3579d;
        if (d10 != null && cVar.f16223f) {
            cVar.f16221d = d10;
        }
        Double d11 = (Double) dVar.f3578c;
        if (d11 != null) {
            cVar.f16220c = d11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return this.f16667a.equals(n6Var.f16667a) && this.f16668b.equals(n6Var.f16668b) && y4.a.s(this.f16669c, n6Var.f16669c) && this.f16671e.equals(n6Var.f16671e) && y4.a.s(this.f16672f, n6Var.f16672f) && this.f16673g == n6Var.f16673g;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16667a, this.f16668b, this.f16669c, this.f16671e, this.f16672f, this.f16673g});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("trace_id");
        this.f16667a.serialize(aVar, iLogger);
        aVar.u("span_id");
        this.f16668b.serialize(aVar, iLogger);
        p6 p6Var = this.f16669c;
        if (p6Var != null) {
            aVar.u("parent_span_id");
            p6Var.serialize(aVar, iLogger);
        }
        aVar.u("op");
        aVar.K(this.f16671e);
        if (this.f16672f != null) {
            aVar.u("description");
            aVar.K(this.f16672f);
        }
        if (this.f16673g != null) {
            aVar.u(PredictionTable.statusColumn);
            aVar.H(iLogger, this.f16673g);
        }
        if (this.f16675i != null) {
            aVar.u("origin");
            aVar.H(iLogger, this.f16675i);
        }
        if (!this.f16674h.isEmpty()) {
            aVar.u("tags");
            aVar.H(iLogger, this.f16674h);
        }
        if (!this.j.isEmpty()) {
            aVar.u("data");
            aVar.H(iLogger, this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.f16676k;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16676k, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }

    public n6(io.sentry.protocol.v vVar, p6 p6Var, p6 p6Var2, String str, String str2, c4.d dVar, q6 q6Var, String str3) {
        this.f16674h = new ConcurrentHashMap();
        this.f16675i = "manual";
        this.j = new ConcurrentHashMap();
        this.f16677l = p1.SENTRY;
        this.f16679n = new i2.d((byte) 0, 7);
        this.f16680o = io.sentry.protocol.v.f16922b;
        y4.a.C(vVar, "traceId is required");
        this.f16667a = vVar;
        y4.a.C(p6Var, "spanId is required");
        this.f16668b = p6Var;
        y4.a.C(str, "operation is required");
        this.f16671e = str;
        this.f16669c = p6Var2;
        this.f16672f = str2;
        this.f16673g = q6Var;
        this.f16675i = str3;
        a(dVar);
        io.sentry.util.thread.a threadChecker = d4.d().m().getThreadChecker();
        this.j.put("thread.id", String.valueOf(threadChecker.b()));
        this.j.put("thread.name", threadChecker.a());
    }

    public n6(n6 n6Var) {
        this.f16674h = new ConcurrentHashMap();
        this.f16675i = "manual";
        this.j = new ConcurrentHashMap();
        this.f16677l = p1.SENTRY;
        this.f16679n = new i2.d((byte) 0, 7);
        this.f16680o = io.sentry.protocol.v.f16922b;
        this.f16667a = n6Var.f16667a;
        this.f16668b = n6Var.f16668b;
        this.f16669c = n6Var.f16669c;
        a(n6Var.f16670d);
        this.f16671e = n6Var.f16671e;
        this.f16672f = n6Var.f16672f;
        this.f16673g = n6Var.f16673g;
        ConcurrentHashMap A = com.google.android.play.core.appupdate.b.A(n6Var.f16674h);
        if (A != null) {
            this.f16674h = A;
        }
        ConcurrentHashMap A2 = com.google.android.play.core.appupdate.b.A(n6Var.f16676k);
        if (A2 != null) {
            this.f16676k = A2;
        }
        this.f16678m = n6Var.f16678m;
        ConcurrentHashMap A3 = com.google.android.play.core.appupdate.b.A(n6Var.j);
        if (A3 != null) {
            this.j = A3;
        }
    }
}
