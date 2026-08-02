package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public List f16749a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractMap f16750b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f16751c;

    /* renamed from: d, reason: collision with root package name */
    public a0 f16752d;

    /* renamed from: e, reason: collision with root package name */
    public ConcurrentHashMap f16753e;

    public b0(List list) {
        this.f16749a = list;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16749a != null) {
            aVar.u("frames");
            aVar.H(iLogger, this.f16749a);
        }
        if (this.f16750b != null) {
            aVar.u("registers");
            aVar.H(iLogger, this.f16750b);
        }
        if (this.f16751c != null) {
            aVar.u("snapshot");
            aVar.I(this.f16751c);
        }
        if (this.f16752d != null) {
            aVar.u("instruction_addr_adjustment");
            aVar.H(iLogger, this.f16752d);
        }
        ConcurrentHashMap concurrentHashMap = this.f16753e;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16753e, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
