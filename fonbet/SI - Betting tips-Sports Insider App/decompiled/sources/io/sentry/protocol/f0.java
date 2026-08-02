package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String[] f16800a;

    /* renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f16801b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f16800a, ((f0) obj).f16800a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f16800a);
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16800a != null) {
            aVar.u("active_profiles");
            aVar.H(iLogger, this.f16800a);
        }
        ConcurrentHashMap concurrentHashMap = this.f16801b;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16801b, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
