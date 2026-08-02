package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16824a;

    /* renamed from: b, reason: collision with root package name */
    public String f16825b;

    /* renamed from: c, reason: collision with root package name */
    public String f16826c;

    /* renamed from: d, reason: collision with root package name */
    public ConcurrentHashMap f16827d;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16824a != null) {
            aVar.u("city");
            aVar.K(this.f16824a);
        }
        if (this.f16825b != null) {
            aVar.u("country_code");
            aVar.K(this.f16825b);
        }
        if (this.f16826c != null) {
            aVar.u("region");
            aVar.K(this.f16826c);
        }
        ConcurrentHashMap concurrentHashMap = this.f16827d;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16827d, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
