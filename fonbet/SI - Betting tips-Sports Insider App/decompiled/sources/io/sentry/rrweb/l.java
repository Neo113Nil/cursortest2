package io.sentry.rrweb;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends b implements c2 {

    /* renamed from: c, reason: collision with root package name */
    public String f17029c;

    /* renamed from: d, reason: collision with root package name */
    public String f17030d;

    /* renamed from: e, reason: collision with root package name */
    public String f17031e;

    /* renamed from: f, reason: collision with root package name */
    public double f17032f;

    /* renamed from: g, reason: collision with root package name */
    public double f17033g;

    /* renamed from: h, reason: collision with root package name */
    public ConcurrentHashMap f17034h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f17035i;
    public ConcurrentHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public ConcurrentHashMap f17036k;

    public l() {
        super(c.Custom);
        this.f17029c = "performanceSpan";
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
        aVar.u("tag");
        aVar.K(this.f17029c);
        aVar.u("payload");
        aVar.j();
        if (this.f17030d != null) {
            aVar.u("op");
            aVar.K(this.f17030d);
        }
        if (this.f17031e != null) {
            aVar.u("description");
            aVar.K(this.f17031e);
        }
        aVar.u("startTimestamp");
        aVar.H(iLogger, BigDecimal.valueOf(this.f17032f));
        aVar.u("endTimestamp");
        aVar.H(iLogger, BigDecimal.valueOf(this.f17033g));
        if (this.f17034h != null) {
            aVar.u("data");
            aVar.H(iLogger, this.f17034h);
        }
        ConcurrentHashMap concurrentHashMap = this.j;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.j, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
        ConcurrentHashMap concurrentHashMap2 = this.f17036k;
        if (concurrentHashMap2 != null) {
            for (K k9 : concurrentHashMap2.keySet()) {
                d9.e.v(this.f17036k, k9, aVar, k9, iLogger);
            }
        }
        aVar.o();
        HashMap hashMap = this.f17035i;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.f17035i, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
