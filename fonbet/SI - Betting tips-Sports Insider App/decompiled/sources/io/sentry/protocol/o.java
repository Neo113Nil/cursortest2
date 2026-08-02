package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.b3;
import io.sentry.c2;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public String f16869a;

    /* renamed from: b, reason: collision with root package name */
    public String f16870b;

    /* renamed from: c, reason: collision with root package name */
    public String f16871c;

    /* renamed from: d, reason: collision with root package name */
    public String f16872d;

    /* renamed from: e, reason: collision with root package name */
    public String f16873e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f16874f;

    /* renamed from: g, reason: collision with root package name */
    public ConcurrentHashMap f16875g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (y4.a.s(this.f16869a, oVar.f16869a) && y4.a.s(this.f16870b, oVar.f16870b) && y4.a.s(this.f16871c, oVar.f16871c) && y4.a.s(this.f16872d, oVar.f16872d) && y4.a.s(this.f16873e, oVar.f16873e) && y4.a.s(this.f16874f, oVar.f16874f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16869a, this.f16870b, this.f16871c, this.f16872d, this.f16873e, this.f16874f});
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        if (this.f16869a != null) {
            aVar.u("name");
            aVar.K(this.f16869a);
        }
        if (this.f16870b != null) {
            aVar.u("version");
            aVar.K(this.f16870b);
        }
        if (this.f16871c != null) {
            aVar.u("raw_description");
            aVar.K(this.f16871c);
        }
        if (this.f16872d != null) {
            aVar.u("build");
            aVar.K(this.f16872d);
        }
        if (this.f16873e != null) {
            aVar.u("kernel_version");
            aVar.K(this.f16873e);
        }
        if (this.f16874f != null) {
            aVar.u("rooted");
            aVar.I(this.f16874f);
        }
        ConcurrentHashMap concurrentHashMap = this.f16875g;
        if (concurrentHashMap != null) {
            for (K k6 : concurrentHashMap.keySet()) {
                d9.e.v(this.f16875g, k6, aVar, k6, iLogger);
            }
        }
        aVar.o();
    }
}
