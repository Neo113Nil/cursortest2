package io.sentry.rrweb;

import com.sports.insider.data.repository.room.live.LiveTable;
import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.b5;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.math.BigDecimal;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends b implements c2 {

    /* renamed from: c, reason: collision with root package name */
    public String f16995c;

    /* renamed from: d, reason: collision with root package name */
    public double f16996d;

    /* renamed from: e, reason: collision with root package name */
    public String f16997e;

    /* renamed from: f, reason: collision with root package name */
    public String f16998f;

    /* renamed from: g, reason: collision with root package name */
    public String f16999g;

    /* renamed from: h, reason: collision with root package name */
    public b5 f17000h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f17001i;
    public HashMap j;

    /* renamed from: k, reason: collision with root package name */
    public ConcurrentHashMap f17002k;

    /* renamed from: l, reason: collision with root package name */
    public ConcurrentHashMap f17003l;

    public a() {
        super(c.Custom);
        this.f16995c = "breadcrumb";
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
        aVar.K(this.f16995c);
        aVar.u("payload");
        aVar.j();
        if (this.f16997e != null) {
            aVar.u("type");
            aVar.K(this.f16997e);
        }
        aVar.u("timestamp");
        aVar.H(iLogger, BigDecimal.valueOf(this.f16996d));
        if (this.f16998f != null) {
            aVar.u("category");
            aVar.K(this.f16998f);
        }
        if (this.f16999g != null) {
            aVar.u(LiveTable.messageColumn);
            aVar.K(this.f16999g);
        }
        if (this.f17000h != null) {
            aVar.u("level");
            aVar.H(iLogger, this.f17000h);
        }
        if (this.f17001i != null) {
            aVar.u("data");
            aVar.H(iLogger, this.f17001i);
        }
        ConcurrentHashMap concurrentHashMap = this.f17002k;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f17002k, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
        ConcurrentHashMap concurrentHashMap2 = this.f17003l;
        if (concurrentHashMap2 != null) {
            for (K k9 : concurrentHashMap2.keySet()) {
                d9.e.v(this.f17003l, k9, aVar, k9, iLogger);
            }
        }
        aVar.o();
        HashMap hashMap = this.j;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                d9.e.u(this.j, str, aVar, str, iLogger);
            }
        }
        aVar.o();
    }
}
