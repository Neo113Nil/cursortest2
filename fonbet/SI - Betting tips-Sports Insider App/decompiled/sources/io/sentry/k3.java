package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k3 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16597a;

    /* renamed from: b, reason: collision with root package name */
    public String f16598b;

    /* renamed from: c, reason: collision with root package name */
    public String f16599c;

    /* renamed from: d, reason: collision with root package name */
    public Long f16600d;

    /* renamed from: e, reason: collision with root package name */
    public Long f16601e;

    /* renamed from: f, reason: collision with root package name */
    public Long f16602f;

    /* renamed from: g, reason: collision with root package name */
    public Long f16603g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap f16604h;

    public k3(k1 k1Var, Long l6, Long l10) {
        this.f16597a = k1Var.q().toString();
        this.f16598b = k1Var.v().f16667a.toString();
        this.f16599c = k1Var.getName().isEmpty() ? "unknown" : k1Var.getName();
        this.f16600d = l6;
        this.f16602f = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k3.class != obj.getClass()) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return this.f16597a.equals(k3Var.f16597a) && this.f16598b.equals(k3Var.f16598b) && this.f16599c.equals(k3Var.f16599c) && this.f16600d.equals(k3Var.f16600d) && this.f16602f.equals(k3Var.f16602f) && y4.a.s(this.f16603g, k3Var.f16603g) && y4.a.s(this.f16601e, k3Var.f16601e) && y4.a.s(this.f16604h, k3Var.f16604h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16597a, this.f16598b, this.f16599c, this.f16600d, this.f16601e, this.f16602f, this.f16603g, this.f16604h});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("id");
        aVar.H(iLogger, this.f16597a);
        aVar.u("trace_id");
        aVar.H(iLogger, this.f16598b);
        aVar.u("name");
        aVar.H(iLogger, this.f16599c);
        aVar.u("relative_start_ns");
        aVar.H(iLogger, this.f16600d);
        aVar.u("relative_end_ns");
        aVar.H(iLogger, this.f16601e);
        aVar.u("relative_cpu_start_ms");
        aVar.H(iLogger, this.f16602f);
        aVar.u("relative_cpu_end_ms");
        aVar.H(iLogger, this.f16603g);
        ConcurrentHashMap concurrentHashMap = this.f16604h;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16604h, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
