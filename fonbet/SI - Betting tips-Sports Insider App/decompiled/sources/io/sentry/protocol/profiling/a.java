package io.sentry.protocol.profiling;

import d9.e;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public List f16887a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public List f16888b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public List f16889c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public Map f16890d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f16891e;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("samples");
        aVar.H(iLogger, this.f16887a);
        aVar.u("stacks");
        aVar.H(iLogger, this.f16888b);
        aVar.u("frames");
        aVar.H(iLogger, this.f16889c);
        aVar.u("thread_metadata");
        aVar.H(iLogger, this.f16890d);
        ConcurrentHashMap concurrentHashMap = this.f16891e;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                e.v(this.f16891e, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
