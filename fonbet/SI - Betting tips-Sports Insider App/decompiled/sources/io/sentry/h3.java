package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h3 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public io.sentry.protocol.v f16453a;

    /* renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f16454b;

    public h3(io.sentry.protocol.v vVar) {
        this.f16453a = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h3) {
            return this.f16453a.equals(((h3) obj).f16453a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16453a});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("profiler_id");
        aVar.H(iLogger, this.f16453a);
        ConcurrentHashMap concurrentHashMap = this.f16454b;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16454b, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
