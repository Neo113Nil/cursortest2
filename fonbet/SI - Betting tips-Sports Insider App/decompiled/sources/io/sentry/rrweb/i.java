package io.sentry.rrweb;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i extends e implements c2 {

    /* renamed from: d, reason: collision with root package name */
    public int f17019d;

    /* renamed from: e, reason: collision with root package name */
    public List f17020e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f17021f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f17022g;

    public i() {
        super(d.TouchMove);
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("type");
        aVar.H(iLogger, this.f17004a);
        aVar.u("timestamp");
        aVar.G(this.f17005b);
        aVar.u("data");
        aVar.j();
        aVar.u(AdRevenueConstants.SOURCE_KEY);
        aVar.H(iLogger, this.f17006c);
        List list = this.f17020e;
        if (list != null && !list.isEmpty()) {
            aVar.u("positions");
            aVar.H(iLogger, this.f17020e);
        }
        aVar.u("pointerId");
        aVar.G(this.f17019d);
        HashMap hashMap = this.f17022g;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f17022g, str, aVar, str, iLogger);
            }
        }
        aVar.o();
        HashMap hashMap2 = this.f17021f;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                d9.e.u(this.f17021f, str2, aVar, str2, iLogger);
            }
        }
        aVar.o();
    }
}
