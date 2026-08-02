package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16802a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16803b;

    /* renamed from: c, reason: collision with root package name */
    public ConcurrentHashMap f16804c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (y4.a.s(this.f16802a, gVar.f16802a) && y4.a.s(Boolean.valueOf(this.f16803b), Boolean.valueOf(gVar.f16803b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16802a, Boolean.valueOf(this.f16803b)});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("flag");
        aVar.K(this.f16802a);
        aVar.u("result");
        aVar.L(this.f16803b);
        ConcurrentHashMap concurrentHashMap = this.f16804c;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16804c, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
