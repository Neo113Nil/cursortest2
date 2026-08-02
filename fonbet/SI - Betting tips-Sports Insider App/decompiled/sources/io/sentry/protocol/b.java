package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16746a;

    /* renamed from: b, reason: collision with root package name */
    public String f16747b;

    /* renamed from: c, reason: collision with root package name */
    public ConcurrentHashMap f16748c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (y4.a.s(this.f16746a, bVar.f16746a) && y4.a.s(this.f16747b, bVar.f16747b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16746a, this.f16747b});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16746a != null) {
            aVar.u("name");
            aVar.K(this.f16746a);
        }
        if (this.f16747b != null) {
            aVar.u("version");
            aVar.K(this.f16747b);
        }
        ConcurrentHashMap concurrentHashMap = this.f16748c;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16748c, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
