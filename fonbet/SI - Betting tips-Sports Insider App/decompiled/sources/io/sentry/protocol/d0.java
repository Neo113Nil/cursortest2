package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public Long f16760a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f16761b;

    /* renamed from: c, reason: collision with root package name */
    public String f16762c;

    /* renamed from: d, reason: collision with root package name */
    public String f16763d;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f16764e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f16765f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f16766g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f16767h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f16768i;
    public Map j;

    /* renamed from: k, reason: collision with root package name */
    public ConcurrentHashMap f16769k;

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16760a != null) {
            aVar.u("id");
            aVar.J(this.f16760a);
        }
        if (this.f16761b != null) {
            aVar.u("priority");
            aVar.J(this.f16761b);
        }
        if (this.f16762c != null) {
            aVar.u("name");
            aVar.K(this.f16762c);
        }
        if (this.f16763d != null) {
            aVar.u("state");
            aVar.K(this.f16763d);
        }
        if (this.f16764e != null) {
            aVar.u("crashed");
            aVar.I(this.f16764e);
        }
        if (this.f16765f != null) {
            aVar.u("current");
            aVar.I(this.f16765f);
        }
        if (this.f16766g != null) {
            aVar.u("daemon");
            aVar.I(this.f16766g);
        }
        if (this.f16767h != null) {
            aVar.u("main");
            aVar.I(this.f16767h);
        }
        if (this.f16768i != null) {
            aVar.u("stacktrace");
            aVar.H(iLogger, this.f16768i);
        }
        if (this.j != null) {
            aVar.u("held_locks");
            aVar.H(iLogger, this.j);
        }
        ConcurrentHashMap concurrentHashMap = this.f16769k;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16769k, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
