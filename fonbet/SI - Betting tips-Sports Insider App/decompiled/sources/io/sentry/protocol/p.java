package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16876a;

    /* renamed from: b, reason: collision with root package name */
    public String f16877b;

    /* renamed from: c, reason: collision with root package name */
    public String f16878c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16879d;

    /* renamed from: e, reason: collision with root package name */
    public String f16880e;

    /* renamed from: f, reason: collision with root package name */
    public ConcurrentHashMap f16881f;

    /* renamed from: g, reason: collision with root package name */
    public ConcurrentHashMap f16882g;

    /* renamed from: h, reason: collision with root package name */
    public Long f16883h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f16884i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public String f16885k;

    /* renamed from: l, reason: collision with root package name */
    public ConcurrentHashMap f16886l;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return y4.a.s(this.f16876a, pVar.f16876a) && y4.a.s(this.f16877b, pVar.f16877b) && y4.a.s(this.f16878c, pVar.f16878c) && y4.a.s(this.f16880e, pVar.f16880e) && y4.a.s(this.f16881f, pVar.f16881f) && y4.a.s(this.f16882g, pVar.f16882g) && y4.a.s(this.f16883h, pVar.f16883h) && y4.a.s(this.j, pVar.j) && y4.a.s(this.f16885k, pVar.f16885k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16876a, this.f16877b, this.f16878c, this.f16880e, this.f16881f, this.f16882g, this.f16883h, this.j, this.f16885k});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16876a != null) {
            aVar.u("url");
            aVar.K(this.f16876a);
        }
        if (this.f16877b != null) {
            aVar.u("method");
            aVar.K(this.f16877b);
        }
        if (this.f16878c != null) {
            aVar.u("query_string");
            aVar.K(this.f16878c);
        }
        if (this.f16879d != null) {
            aVar.u("data");
            aVar.H(iLogger, this.f16879d);
        }
        if (this.f16880e != null) {
            aVar.u("cookies");
            aVar.K(this.f16880e);
        }
        if (this.f16881f != null) {
            aVar.u("headers");
            aVar.H(iLogger, this.f16881f);
        }
        if (this.f16882g != null) {
            aVar.u("env");
            aVar.H(iLogger, this.f16882g);
        }
        if (this.f16884i != null) {
            aVar.u("other");
            aVar.H(iLogger, this.f16884i);
        }
        if (this.j != null) {
            aVar.u("fragment");
            aVar.H(iLogger, this.j);
        }
        if (this.f16883h != null) {
            aVar.u("body_size");
            aVar.H(iLogger, this.f16883h);
        }
        if (this.f16885k != null) {
            aVar.u("api_target");
            aVar.H(iLogger, this.f16885k);
        }
        ConcurrentHashMap concurrentHashMap = this.f16886l;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16886l, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
