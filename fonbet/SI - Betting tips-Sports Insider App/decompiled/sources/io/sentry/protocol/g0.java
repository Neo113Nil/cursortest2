package io.sentry.protocol;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16805a;

    /* renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap f16806b;

    public g0(String str) {
        this.f16805a = str;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        String str = this.f16805a;
        if (str != null) {
            aVar.u(AdRevenueConstants.SOURCE_KEY);
            aVar.H(iLogger, str);
        }
        ConcurrentHashMap concurrentHashMap = this.f16806b;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16806b, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
