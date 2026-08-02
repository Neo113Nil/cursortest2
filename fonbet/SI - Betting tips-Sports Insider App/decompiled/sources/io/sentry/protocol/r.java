package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16899a;

    /* renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f16900b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f16901c;

    /* renamed from: d, reason: collision with root package name */
    public Long f16902d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16903e;

    /* renamed from: f, reason: collision with root package name */
    public ConcurrentHashMap f16904f;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16899a != null) {
            aVar.u("cookies");
            aVar.K(this.f16899a);
        }
        if (this.f16900b != null) {
            aVar.u("headers");
            aVar.H(iLogger, this.f16900b);
        }
        if (this.f16901c != null) {
            aVar.u("status_code");
            aVar.H(iLogger, this.f16901c);
        }
        if (this.f16902d != null) {
            aVar.u("body_size");
            aVar.H(iLogger, this.f16902d);
        }
        if (this.f16903e != null) {
            aVar.u("data");
            aVar.H(iLogger, this.f16903e);
        }
        ConcurrentHashMap concurrentHashMap = this.f16904f;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16904f, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
