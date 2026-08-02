package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f16807a;

    /* renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f16808b;

    public h(List list) {
        this.f16807a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        return y4.a.s(this.f16807a, ((h) obj).f16807a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16807a});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("values");
        aVar.H(iLogger, this.f16807a);
        ConcurrentHashMap concurrentHashMap = this.f16808b;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16808b, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
